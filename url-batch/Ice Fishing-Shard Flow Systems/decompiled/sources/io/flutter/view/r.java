package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f5916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f5917b;

    public r(s sVar, long j) {
        this.f5917b = sVar;
        this.f5916a = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long nanoTime = System.nanoTime() - j;
        long j7 = nanoTime < 0 ? 0L : nanoTime;
        s sVar = this.f5917b;
        sVar.f5921b.onVsync(j7, sVar.f5920a, this.f5916a);
        sVar.f5922c = this;
    }
}
