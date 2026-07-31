package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class oj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f370a;
    public final /* synthetic */ pj b;

    public oj(pj pjVar, String str) {
        this.b = pjVar;
        this.f370a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.b.compareAndSet(false, true)) {
            pj pjVar = this.b;
            pjVar.g.a(pjVar.c);
            this.b.d.a(String.valueOf(this.f370a));
        }
    }
}
