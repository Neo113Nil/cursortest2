package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f9454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f9455b;

    public r(s sVar, long j3) {
        this.f9455b = sVar;
        this.f9454a = j3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        long nanoTime = System.nanoTime() - j3;
        long j4 = nanoTime < 0 ? 0L : nanoTime;
        s sVar = this.f9455b;
        sVar.f9458b.onVsync(j4, sVar.f9457a, this.f9454a);
        sVar.f9459c = this;
    }
}
