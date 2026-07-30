package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c11 {
    public static final c11 g = new c11(false, 0, true, 1, 1, sf1.o);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final sf1 f;

    public c11(boolean z, int i, boolean z2, int i2, int i3, sf1 sf1Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = sf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c11)) {
            return false;
        }
        c11 c11Var = (c11) obj;
        return this.a == c11Var.a && this.b == c11Var.b && this.c == c11Var.c && this.d == c11Var.d && this.e == c11Var.e && Intrinsics.b(this.f, c11Var.f);
    }

    public final int hashCode() {
        return this.f.m.hashCode() + q40.e(this.e, q40.e(this.d, in1.i(q40.e(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) bd3.N(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) h81.a(this.d)) + ", imeAction=" + ((Object) b11.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
