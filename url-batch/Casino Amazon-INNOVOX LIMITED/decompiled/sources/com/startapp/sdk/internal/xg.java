package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class xg implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh f500a;

    public xg(eh ehVar) {
        this.f500a = ehVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh ehVar = this.f500a;
        try {
            bh bhVar = ehVar.f;
            if (bhVar != null) {
                bhVar.b();
                ehVar.f = null;
            }
        } catch (Throwable th) {
            if (ehVar.a(4)) {
                n8.a(th);
            }
        }
    }
}
