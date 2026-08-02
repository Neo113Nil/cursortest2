package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class uj extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4588a;

    public uj(com.startapp.sdk.ads.video.c cVar) {
        this.f4588a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f4588a.f3185r0.isInitialStickyBroadcast()) {
            return;
        }
        com.startapp.sdk.ads.video.c cVar = this.f4588a;
        cVar.f3161R = !cVar.f3161R;
        cVar.F();
        com.startapp.sdk.ads.video.c cVar2 = this.f4588a;
        cVar2.a(cVar2.f3161R);
    }
}
