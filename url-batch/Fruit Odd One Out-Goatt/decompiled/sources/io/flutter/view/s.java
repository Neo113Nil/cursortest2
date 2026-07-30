package io.flutter.view;

import android.view.Choreographer;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f636b;

    public s(t tVar, long j2) {
        this.f636b = tVar;
        this.f635a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        t tVar = this.f636b;
        tVar.f640b.onVsync(j3, tVar.f639a, this.f635a);
        tVar.f641c = this;
    }
}
