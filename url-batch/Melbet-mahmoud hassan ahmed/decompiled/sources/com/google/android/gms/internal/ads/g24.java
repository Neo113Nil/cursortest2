package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class g24 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f5421a = new Handler();

    /* renamed from: b, reason: collision with root package name */
    private final AudioTrack.StreamEventCallback f5422b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h24 f5423c;

    public g24(h24 h24Var) {
        this.f5423c = h24Var;
        this.f5422b = new f24(this, h24Var);
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.f5421a;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.e24
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f5422b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f5422b);
        this.f5421a.removeCallbacksAndMessages(null);
    }
}
