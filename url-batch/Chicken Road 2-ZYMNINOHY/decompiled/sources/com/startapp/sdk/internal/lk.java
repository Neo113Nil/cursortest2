package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class lk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk f7248b;

    public lk(mk mkVar, String str) {
        this.f7248b = mkVar;
        this.f7247a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7248b.f7297b.compareAndSet(false, true)) {
            mk mkVar = this.f7248b;
            mkVar.f7302g.a(mkVar.f7298c);
            this.f7248b.f7299d.a(String.valueOf(this.f7247a));
        }
    }
}
