package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f2632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2633b;

    public s(t tVar, long j2) {
        this.f2633b = tVar;
        this.f2632a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        t tVar = this.f2633b;
        tVar.f2637b.onVsync(j3, tVar.f2636a, this.f2632a);
        tVar.f2638c = this;
    }
}
