package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class q implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f10394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f10395b;

    public q(r rVar, long j2) {
        this.f10395b = rVar;
        this.f10394a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j6 = nanoTime < 0 ? 0L : nanoTime;
        r rVar = this.f10395b;
        rVar.f10399b.onVsync(j6, rVar.f10398a, this.f10394a);
        rVar.f10400c = this;
    }
}
