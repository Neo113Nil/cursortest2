package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class lk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk f4120b;

    public lk(mk mkVar, String str) {
        this.f4120b = mkVar;
        this.f4119a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4120b.f4168b.compareAndSet(false, true)) {
            mk mkVar = this.f4120b;
            mkVar.f4172g.a(mkVar.f4169c);
            this.f4120b.f4170d.a(String.valueOf(this.f4119a));
        }
    }
}
