package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Eb implements InterfaceC0083c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0187g0 f825a;
    public final En b = new En();

    public Eb(InterfaceC0187g0 interfaceC0187g0) {
        this.f825a = interfaceC0187g0;
    }

    public static final void a(Eb eb, V v) {
        eb.f825a.a(v);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0083c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        En en = this.b;
        Thread a2 = en.f833a.a();
        try {
            stackTraceElementArr = en.f833a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a2.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        final V v = new V((C0638xn) en.b.apply(a2, stackTraceElementArr), en.a(a2, null), en.c.a());
        ((A9) C0088c4.l().c.a()).b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.Eb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Eb.a(Eb.this, v);
            }
        });
    }
}
