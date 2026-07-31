package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class i9 extends g9 {
    public final pa d;
    public final pa e;

    public i9(pa paVar, pa paVar2, n8 n8Var, q8 q8Var, x8 x8Var) {
        super(n8Var, q8Var, x8Var);
        this.d = paVar;
        this.e = paVar2;
    }

    @Override // com.startapp.sdk.internal.g9
    public final int a() {
        String str = this.f250a.e;
        if (str == null) {
            return 3;
        }
        me meVar = (me) this.e.a();
        z7 z7Var = (z7) this.d.a();
        oh ohVar = new oh();
        ohVar.J = meVar.a(ohVar);
        y7 y7Var = new y7(z7Var, ohVar.a(str));
        y7Var.e = null;
        y7Var.d = z7Var.a(ohVar.Z);
        return y7Var.a() != null ? 1 : 0;
    }
}
