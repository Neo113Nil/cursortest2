package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Yb implements InterfaceC2530c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2584e0 f38553a;

    /* renamed from: b, reason: collision with root package name */
    public final An f38554b = new An();

    public Yb(@NotNull InterfaceC2584e0 interfaceC2584e0) {
        this.f38553a = interfaceC2584e0;
    }

    public static final void a(Yb yb, U u4) {
        yb.f38553a.a(u4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2530c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        An an = this.f38554b;
        Thread a4 = an.f37192a.a();
        try {
            stackTraceElementArr = an.f37192a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a4.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        final U u4 = new U((C2997tn) an.f37193b.apply(a4, stackTraceElementArr), an.a(a4, null), an.f37194c.b());
        ((U9) C3082x4.l().f40118c.a()).f38354b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.cp
            @Override // java.lang.Runnable
            public final void run() {
                Yb.a(Yb.this, u4);
            }
        });
    }
}
