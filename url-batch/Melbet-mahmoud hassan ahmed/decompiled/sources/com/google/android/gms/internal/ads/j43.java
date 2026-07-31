package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
final class j43 extends BroadcastReceiver implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final k53 f6967f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f6968g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ l63 f6969h;

    public j43(l63 l63Var, Handler handler, k53 k53Var) {
        this.f6969h = l63Var;
        this.f6968g = handler;
        this.f6967f = k53Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f6968g.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
