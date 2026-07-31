package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* loaded from: classes3.dex */
final class AFa1aSDK {
    AFa1aSDK() {
    }

    static AFa1uSDK AFInAppEventParameterName(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        AFa1zSDK aFa1zSDK = new AFa1zSDK((byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1zSDK, 1)) {
                if (context != null) {
                    context.unbindService(aFa1zSDK);
                }
                throw new IOException("Google Play connection failed");
            }
            if (aFa1zSDK.AFInAppEventParameterName) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1zSDK.AFInAppEventParameterName = true;
            IBinder poll = aFa1zSDK.AFKeystoreWrapper.poll(10L, TimeUnit.SECONDS);
            if (poll != null) {
                AFa1tSDK aFa1tSDK = new AFa1tSDK(poll);
                return new AFa1uSDK(aFa1tSDK.values(), aFa1tSDK.valueOf());
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        } finally {
            if (context != null) {
                context.unbindService(aFa1zSDK);
            }
        }
    }

    static final class AFa1uSDK {
        private final boolean AFKeystoreWrapper;
        final String values;

        AFa1uSDK(String str, boolean z) {
            this.values = str;
            this.AFKeystoreWrapper = z;
        }

        final boolean valueOf() {
            return this.AFKeystoreWrapper;
        }
    }

    static final class AFa1zSDK implements ServiceConnection {
        boolean AFInAppEventParameterName;
        final LinkedBlockingQueue<IBinder> AFKeystoreWrapper;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private AFa1zSDK() {
            this.AFKeystoreWrapper = new LinkedBlockingQueue<>(1);
            this.AFInAppEventParameterName = false;
        }

        /* synthetic */ AFa1zSDK(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.AFKeystoreWrapper.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }
    }

    static final class AFa1tSDK implements IInterface {
        private final IBinder AFKeystoreWrapper;

        AFa1tSDK(IBinder iBinder) {
            this.AFKeystoreWrapper = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFKeystoreWrapper;
        }

        public final String values() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFKeystoreWrapper.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        final boolean valueOf() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.AFKeystoreWrapper.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
