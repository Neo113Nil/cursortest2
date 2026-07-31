package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class qe implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xe f392a;

    public qe(xe xeVar) {
        this.f392a = xeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f392a.c();
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
