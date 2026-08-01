package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class gg0 implements cb0 {
    public final ig0 f;

    public gg0(ig0 ig0Var) {
        ig0Var.getClass();
        this.f = ig0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    @Override // defpackage.cb0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final sg0 N(String str) {
        str.getClass();
        ig0 ig0Var = this.f;
        ig0Var.getClass();
        String obj = mf0.E(str).toString();
        if (obj.length() >= 3) {
            String upperCase = obj.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                pg0 pg0Var = new pg0(ig0Var, str);
                pg0Var.i = new int[0];
                pg0Var.j = new long[0];
                pg0Var.k = new double[0];
                pg0Var.l = new String[0];
                pg0Var.m = new byte[0][];
                return pg0Var;
            }
        }
        return new qg0(ig0Var, str);
    }
}
