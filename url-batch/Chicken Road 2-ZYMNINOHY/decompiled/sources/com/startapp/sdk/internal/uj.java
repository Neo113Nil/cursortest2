package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class uj extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f7730a;

    public uj(com.startapp.sdk.ads.video.c cVar) {
        this.f7730a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f7730a.f6270r0.isInitialStickyBroadcast()) {
            return;
        }
        com.startapp.sdk.ads.video.c cVar = this.f7730a;
        cVar.f6244R = !cVar.f6244R;
        cVar.F();
        com.startapp.sdk.ads.video.c cVar2 = this.f7730a;
        cVar2.a(cVar2.f6244R);
    }
}
