package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ed extends qd {
    public ed(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        super(gcVar, "nKg4HNqb3w+l+hWBt0181NzZuRHIlhptjDdMcQ5dE3JWGvySjoPYfybKeplgFTfD", "XexrqxQZ83Dsows1I9oUUMC34QJd/x5AyWUFr5Va7Yc=", j8Var, i7, 73);
    }

    @Override // com.google.android.gms.internal.ads.qd
    protected final void a() {
        try {
            int i7 = 1;
            boolean booleanValue = ((Boolean) this.f10654f.invoke(null, this.f10650b.b())).booleanValue();
            j8 j8Var = this.f10653e;
            if (true == booleanValue) {
                i7 = 2;
            }
            j8Var.Q(i7);
        } catch (InvocationTargetException unused) {
            this.f10653e.Q(3);
        }
    }
}
