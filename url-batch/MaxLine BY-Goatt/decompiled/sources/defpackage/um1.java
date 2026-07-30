package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class um1 {
    public final tn1 a;

    public static final Object a(tn1 tn1Var) {
        Object g = tn1Var.g(null);
        if (g == null) {
            return null;
        }
        if (!(g instanceof jn1)) {
            tn1Var.k(null);
            return g;
        }
        jn1 jn1Var = (jn1) g;
        if (jn1Var.g()) {
            ch2.k("List is empty.");
            return null;
        }
        int i = jn1Var.b - 1;
        Object e = jn1Var.e(i);
        jn1Var.j(i);
        e.getClass();
        if (jn1Var.g()) {
            tn1Var.k(null);
        }
        if (jn1Var.b == 1) {
            tn1Var.m(null, jn1Var.d());
        }
        return e;
    }

    public static final jn1 b(tn1 tn1Var) {
        if (tn1Var.i()) {
            jn1 jn1Var = ot1.b;
            jn1Var.getClass();
            return jn1Var;
        }
        jn1 jn1Var2 = new jn1();
        Object[] objArr = tn1Var.c;
        long[] jArr = tn1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof jn1) {
                                jn1 jn1Var3 = (jn1) obj;
                                if (!jn1Var3.g()) {
                                    int i4 = jn1Var2.b + jn1Var3.b;
                                    Object[] objArr2 = jn1Var2.a;
                                    if (objArr2.length < i4) {
                                        jn1Var2.l(i4, objArr2);
                                    }
                                    ni.e(jn1Var2.b, 0, jn1Var3.b, jn1Var3.a, jn1Var2.a);
                                    jn1Var2.b += jn1Var3.b;
                                }
                            } else {
                                obj.getClass();
                                jn1Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return jn1Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof um1) {
            return this.a.equals(((um1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
