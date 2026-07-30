package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes2.dex */
final class ad implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f65a;

    /* synthetic */ ad(ae aeVar, ac acVar) {
        this.f65a = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        s sVar;
        sVar = this.f65a.c;
        sVar.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f65a.c().post(new aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        s sVar;
        sVar = this.f65a.c;
        sVar.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f65a.c().post(new ab(this));
    }
}
