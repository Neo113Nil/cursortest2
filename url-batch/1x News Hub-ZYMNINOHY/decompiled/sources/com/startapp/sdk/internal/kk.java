package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class kk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk f4071a;

    public kk(mk mkVar, long j3) {
        this.f4071a = mkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4071a.f4168b.compareAndSet(false, true)) {
            mk mkVar = this.f4071a;
            mkVar.f4172g.a(mkVar.f4169c);
            mk mkVar2 = this.f4071a;
            qi qiVar = mkVar2.f4170d;
            mkVar2.f4171e.get();
            qiVar.a();
        }
    }
}
