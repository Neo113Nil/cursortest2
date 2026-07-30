package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import l1.AbstractBinderC0658b;
import l1.C0657a;
import l1.InterfaceC0659c;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f4281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f4282b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f4282b = bVar;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.f4281a = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0659c c0657a;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i2 = AbstractBinderC0658b.f6263e;
        if (iBinder == null) {
            c0657a = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            c0657a = queryLocalInterface instanceof InterfaceC0659c ? (InterfaceC0659c) queryLocalInterface : new C0657a(iBinder);
        }
        b bVar = this.f4282b;
        bVar.f4285c = c0657a;
        bVar.f4283a = 2;
        this.f4281a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f4282b;
        bVar.f4285c = null;
        bVar.f4283a = 0;
        this.f4281a.onInstallReferrerServiceDisconnected();
    }
}
