package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f4733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f4734b;

    public s(t tVar, long j4) {
        this.f4734b = tVar;
        this.f4733a = j4;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        long nanoTime = System.nanoTime() - j4;
        long j7 = nanoTime < 0 ? 0L : nanoTime;
        t tVar = this.f4734b;
        tVar.f4738b.onVsync(j7, tVar.f4737a, this.f4733a);
        tVar.f4739c = this;
    }
}
