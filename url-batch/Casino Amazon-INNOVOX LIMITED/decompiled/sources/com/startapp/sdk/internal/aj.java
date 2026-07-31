package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class aj extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.a f173a;

    public aj(com.startapp.sdk.ads.video.a aVar) {
        this.f173a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f173a.l0.isInitialStickyBroadcast()) {
            return;
        }
        com.startapp.sdk.ads.video.a aVar = this.f173a;
        aVar.R = !aVar.R;
        aVar.E();
        com.startapp.sdk.ads.video.a aVar2 = this.f173a;
        aVar2.a(aVar2.R);
    }
}
