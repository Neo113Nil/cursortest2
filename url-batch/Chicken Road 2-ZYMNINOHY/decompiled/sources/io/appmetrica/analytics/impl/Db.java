package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Db implements InterfaceC0522c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0626g0 f10193a;

    /* renamed from: b, reason: collision with root package name */
    public final Dn f10194b = new Dn();

    public Db(InterfaceC0626g0 interfaceC0626g0) {
        this.f10193a = interfaceC0626g0;
    }

    public static final void a(Db db, V v) {
        db.f10193a.a(v);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0522c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        Dn dn = this.f10194b;
        Thread a3 = dn.f10224a.a();
        try {
            stackTraceElementArr = dn.f10224a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a3.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        V v = new V((C1063wn) dn.f10225b.apply(a3, stackTraceElementArr), dn.a(a3, null), dn.f10226c.a());
        ((C1127z9) C0501b4.l().f11457c.a()).f13097b.post(new g0.p(this, 2, v));
    }
}
