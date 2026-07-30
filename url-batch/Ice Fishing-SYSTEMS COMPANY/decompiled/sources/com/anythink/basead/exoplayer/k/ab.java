package com.anythink.basead.exoplayer.k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class ab implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f8492a;

    public ab(Handler handler) {
        this.f8492a = handler;
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Looper a() {
        return this.f8492a.getLooper();
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean b(int i) {
        return this.f8492a.sendEmptyMessage(i);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i) {
        return this.f8492a.obtainMessage(i);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final void b() {
        this.f8492a.removeMessages(2);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i, Object obj) {
        return this.f8492a.obtainMessage(i, obj);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i, int i4) {
        return this.f8492a.obtainMessage(i, i4, 0);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i, int i4, Object obj) {
        return this.f8492a.obtainMessage(0, i, i4, obj);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean a(long j9) {
        return this.f8492a.sendEmptyMessageAtTime(2, j9);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final void a(Object obj) {
        this.f8492a.removeCallbacksAndMessages(obj);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean a(Runnable runnable) {
        return this.f8492a.post(runnable);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean a(Runnable runnable, long j9) {
        return this.f8492a.postDelayed(runnable, j9);
    }
}
