package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kb implements InterfaceC0400c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0504g0 f6230a;

    /* renamed from: b, reason: collision with root package name */
    public final Fn f6231b = new Fn();

    public Kb(InterfaceC0504g0 interfaceC0504g0) {
        this.f6230a = interfaceC0504g0;
    }

    public static final void a(Kb kb, V v) {
        kb.f6230a.a(v);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0400c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        Fn fn = this.f6231b;
        Thread a3 = fn.f6018a.a();
        try {
            stackTraceElementArr = fn.f6018a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a3.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        V v = new V((C0992yn) fn.f6019b.apply(a3, stackTraceElementArr), fn.a(a3, null), fn.f6020c.a());
        ((G9) C0585j4.l().f7594c.a()).f6035b.post(new A1.a(this, 15, v));
    }
}
