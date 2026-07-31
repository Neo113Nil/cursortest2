package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class nj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pj f354a;

    public nj(pj pjVar, long j) {
        this.f354a = pjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f354a.b.compareAndSet(false, true)) {
            pj pjVar = this.f354a;
            pjVar.g.a(pjVar.c);
            pj pjVar2 = this.f354a;
            xh xhVar = pjVar2.d;
            pjVar2.e.get();
            xhVar.a();
        }
    }
}
