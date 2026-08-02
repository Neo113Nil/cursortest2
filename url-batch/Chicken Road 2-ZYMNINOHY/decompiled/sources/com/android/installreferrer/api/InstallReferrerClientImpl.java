package com.android.installreferrer.api;

import V3.b;
import W1.a;
import W1.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes.dex */
class InstallReferrerClientImpl extends InstallReferrerClient {
    private static final int PLAY_STORE_MIN_APP_VER = 80837300;
    private static final String SERVICE_ACTION_NAME = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private static final String SERVICE_NAME = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final String SERVICE_PACKAGE_NAME = "com.android.vending";
    private static final String TAG = "InstallReferrerClient";
    private int clientState = 0;
    private final Context mApplicationContext;
    private c service;
    private ServiceConnection serviceConnection;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public final class InstallReferrerServiceConnection implements ServiceConnection {
        private final InstallReferrerStateListener mListener;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c aVar;
            b.t("Install Referrer service connected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            int i4 = W1.b.f3462a;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                aVar = queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
            }
            installReferrerClientImpl.service = aVar;
            InstallReferrerClientImpl.this.clientState = 2;
            this.mListener.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.u("Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.service = null;
            InstallReferrerClientImpl.this.clientState = 0;
            this.mListener.onInstallReferrerServiceDisconnected();
        }

        private InstallReferrerServiceConnection(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.mListener = installReferrerStateListener;
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.mApplicationContext = context.getApplicationContext();
    }

    private boolean isPlayStoreCompatible() {
        return this.mApplicationContext.getPackageManager().getPackageInfo(SERVICE_PACKAGE_NAME, 128).versionCode >= PLAY_STORE_MIN_APP_VER;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.clientState = 3;
        if (this.serviceConnection != null) {
            b.t("Unbinding from service.");
            this.mApplicationContext.unbindService(this.serviceConnection);
            this.serviceConnection = null;
        }
        this.service = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.mApplicationContext.getPackageName());
        try {
            return new ReferrerDetails(((a) this.service).a(bundle));
        } catch (RemoteException e4) {
            b.u("RemoteException getting install referrer information");
            this.clientState = 0;
            throw e4;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.clientState != 2 || this.service == null || this.serviceConnection == null) ? false : true;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            b.t("Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i4 = this.clientState;
        if (i4 == 1) {
            b.u("Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i4 == 3) {
            b.u("Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        b.t("Starting install referrer service setup.");
        Intent intent = new Intent(SERVICE_ACTION_NAME);
        intent.setComponent(new ComponentName(SERVICE_PACKAGE_NAME, SERVICE_NAME));
        List<ResolveInfo> queryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.clientState = 0;
            b.t("Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!SERVICE_PACKAGE_NAME.equals(str) || str2 == null || !isPlayStoreCompatible()) {
            b.u("Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        InstallReferrerServiceConnection installReferrerServiceConnection = new InstallReferrerServiceConnection(installReferrerStateListener);
        this.serviceConnection = installReferrerServiceConnection;
        try {
            if (this.mApplicationContext.bindService(intent2, installReferrerServiceConnection, 1)) {
                b.t("Service was bonded successfully.");
                return;
            }
            b.u("Connection to service is blocked.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(1);
        } catch (SecurityException unused) {
            b.u("No permission to connect to service.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(4);
        }
    }
}
