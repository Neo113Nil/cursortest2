package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import defpackage.sz0;
import defpackage.tz0;
import defpackage.uz0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    public final InstallReferrerStateListener m;
    public final /* synthetic */ b n;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.n = bVar;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.m = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        uz0 sz0Var;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = tz0.g;
        if (iBinder == null) {
            sz0Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            sz0Var = queryLocalInterface instanceof uz0 ? (uz0) queryLocalInterface : new sz0(iBinder);
        }
        b bVar = this.n;
        bVar.c = sz0Var;
        bVar.a = 2;
        this.m.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.n;
        bVar.c = null;
        bVar.a = 0;
        this.m.onInstallReferrerServiceDisconnected();
    }
}
