package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f2821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2822b;

    public r(s sVar, long j2) {
        this.f2822b = sVar;
        this.f2821a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        s sVar = this.f2822b;
        sVar.f2826b.onVsync(j3, sVar.f2825a, this.f2821a);
        sVar.f2827c = this;
    }
}
