package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class A4 extends Hd {

    /* renamed from: f, reason: collision with root package name */
    public final Object f6499f;

    public A4(int i2, String str, Object obj, InterfaceC1041uo interfaceC1041uo, R2 r22) {
        super(i2, str, interfaceC1041uo, r22);
        this.f6499f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Hd, io.appmetrica.analytics.impl.InterfaceC0679go
    public final void a(C0653fo c0653fo) {
        if (f()) {
            R2 r22 = this.f6878d;
            int i2 = this.f6876b;
            C0705ho a6 = r22.a(c0653fo, (C0705ho) ((HashMap) c0653fo.f8209a.get(i2)).get(this.f6875a), this);
            if (a6 != null) {
                a(a6);
            }
        }
    }

    public abstract void a(C0705ho c0705ho);

    public final Object g() {
        return this.f6499f;
    }
}
