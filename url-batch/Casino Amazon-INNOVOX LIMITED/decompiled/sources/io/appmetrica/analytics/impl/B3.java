package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class B3 extends S7 {
    @Override // io.appmetrica.analytics.impl.S7
    public final boolean a(C0493s3 c0493s3, C0493s3 c0493s32) {
        if (mo.a(c0493s32.f1477a)) {
            return true;
        }
        if (mo.a(c0493s3.f1477a)) {
            return false;
        }
        T7 t7 = c0493s3.b;
        if (t7 == T7.c) {
            if (((Number) this.f1040a.a(t7)).intValue() >= ((Number) this.f1040a.a(c0493s32.b)).intValue()) {
                return true;
            }
        } else if (((Number) this.f1040a.a(t7)).intValue() > ((Number) this.f1040a.a(c0493s32.b)).intValue()) {
            return true;
        }
        return false;
    }
}
