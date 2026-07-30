package defpackage;

import com.facebook.internal.Utility;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p32 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public p32(boolean z, jg2 jg2Var, boolean z2) {
        r00 r00Var = cb.a;
        int i = !z ? 262152 : 262144;
        i = jg2Var == jg2.n ? i | Utility.DEFAULT_STREAM_BUFFER_SIZE : i;
        i = z2 ? i : i | 512;
        boolean z3 = jg2Var == jg2.m;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p32)) {
            return false;
        }
        p32 p32Var = (p32) obj;
        return this.a == p32Var.a && this.b == p32Var.b && this.c == p32Var.c && this.d == p32Var.d && this.e == p32Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + in1.i(in1.i(in1.i(in1.i(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
