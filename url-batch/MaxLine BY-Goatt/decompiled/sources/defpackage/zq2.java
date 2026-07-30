package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zq2 implements nc2 {
    public final zs0 m;

    public zq2(zs0 zs0Var) {
        zs0Var.getClass();
        this.m = zs0Var;
    }

    @Override // defpackage.nc2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hr2 M(String str) {
        str.getClass();
        zs0 zs0Var = this.m;
        zs0Var.getClass();
        String obj = up2.K(str).toString();
        if (obj.length() >= 3) {
            String upperCase = obj.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                fr2 fr2Var = new fr2(zs0Var, str);
                fr2Var.p = new int[0];
                fr2Var.q = new long[0];
                fr2Var.r = new double[0];
                fr2Var.s = new String[0];
                fr2Var.t = new byte[0][];
                return fr2Var;
            }
        }
        return new gr2(zs0Var, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }
}
