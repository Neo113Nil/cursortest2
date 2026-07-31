package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class br3 implements ir3 {

    /* renamed from: a, reason: collision with root package name */
    private final ir3[] f3508a;

    br3(ir3... ir3VarArr) {
        this.f3508a = ir3VarArr;
    }

    @Override // com.google.android.gms.internal.ads.ir3
    public final hr3 a(Class<?> cls) {
        ir3[] ir3VarArr = this.f3508a;
        for (int i7 = 0; i7 < 2; i7++) {
            ir3 ir3Var = ir3VarArr[i7];
            if (ir3Var.b(cls)) {
                return ir3Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.ads.ir3
    public final boolean b(Class<?> cls) {
        ir3[] ir3VarArr = this.f3508a;
        for (int i7 = 0; i7 < 2; i7++) {
            if (ir3VarArr[i7].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
