package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class kk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk f7199a;

    public kk(mk mkVar, long j4) {
        this.f7199a = mkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7199a.f7297b.compareAndSet(false, true)) {
            mk mkVar = this.f7199a;
            mkVar.f7302g.a(mkVar.f7298c);
            mk mkVar2 = this.f7199a;
            qi qiVar = mkVar2.f7299d;
            mkVar2.f7300e.get();
            qiVar.a();
        }
    }
}
