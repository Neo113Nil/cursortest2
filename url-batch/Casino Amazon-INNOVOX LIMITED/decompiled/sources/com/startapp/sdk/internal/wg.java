package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class wg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh f485a;

    public wg(eh ehVar) {
        this.f485a = ehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh ehVar = this.f485a;
        try {
            if (ehVar.a() != null && ehVar.f == null) {
                bh a2 = ehVar.a((Class) null);
                ehVar.f = a2;
                if (a2 != null) {
                    a2.a();
                }
            }
        } catch (Throwable th) {
            if (ehVar.a(1)) {
                n8.a(th);
            }
        }
    }
}
