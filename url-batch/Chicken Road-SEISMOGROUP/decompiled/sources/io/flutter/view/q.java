package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class q implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f868b;

    public q(r rVar, long j2) {
        this.f868b = rVar;
        this.f867a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        r rVar = this.f868b;
        rVar.f872b.onVsync(j3, rVar.f871a, this.f867a);
        rVar.f873c = this;
    }
}
