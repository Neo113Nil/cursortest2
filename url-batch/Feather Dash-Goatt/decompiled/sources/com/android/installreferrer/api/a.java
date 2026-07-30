package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import defpackage.u60;
import defpackage.v60;
import defpackage.w60;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final InstallReferrerStateListener a;
    public final /* synthetic */ b b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.b = bVar;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.a = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        w60 u60Var;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = v60.b;
        if (iBinder == null) {
            u60Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            u60Var = queryLocalInterface instanceof w60 ? (w60) queryLocalInterface : new u60(iBinder);
        }
        b bVar = this.b;
        bVar.c = u60Var;
        bVar.a = 2;
        this.a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.b;
        bVar.c = null;
        bVar.a = 0;
        this.a.onInstallReferrerServiceDisconnected();
    }
}
