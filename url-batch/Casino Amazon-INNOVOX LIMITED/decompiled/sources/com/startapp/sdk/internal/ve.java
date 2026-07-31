package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ve implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xe f469a;

    public ve(xe xeVar) {
        this.f469a = xeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f469a.b();
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
