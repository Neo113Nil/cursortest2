package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f815b;

    public r(s sVar, long j2) {
        this.f815b = sVar;
        this.f814a = j2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        long nanoTime = System.nanoTime() - j2;
        long j3 = nanoTime < 0 ? 0L : nanoTime;
        s sVar = this.f815b;
        sVar.f819b.onVsync(j3, sVar.f818a, this.f814a);
        sVar.f820c = this;
    }
}
