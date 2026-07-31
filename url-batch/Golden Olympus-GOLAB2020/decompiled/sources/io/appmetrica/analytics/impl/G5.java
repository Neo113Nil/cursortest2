package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class G5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2885pe f37564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H5 f37565b;

    public G5(H5 h5, InterfaceC2885pe interfaceC2885pe) {
        this.f37565b = h5;
        this.f37564a = interfaceC2885pe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f37565b) {
            try {
                H5 h5 = this.f37565b;
                Object obj = h5.f37604a;
                if (obj == null) {
                    h5.f37605b.add(this.f37564a);
                } else {
                    this.f37564a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
