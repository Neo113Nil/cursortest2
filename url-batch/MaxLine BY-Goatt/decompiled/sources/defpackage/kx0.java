package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kx0 {
    public static final dr d;
    public static final dr e;
    public static final dr f;
    public static final dr g;
    public static final dr h;
    public static final dr i;
    public final dr a;
    public final dr b;
    public final int c;

    static {
        dr drVar = dr.p;
        d = nj.j(":");
        e = nj.j(":status");
        f = nj.j(":method");
        g = nj.j(":path");
        h = nj.j(":scheme");
        i = nj.j(":authority");
    }

    public kx0(dr drVar, dr drVar2) {
        drVar.getClass();
        drVar2.getClass();
        this.a = drVar;
        this.b = drVar2;
        this.c = drVar2.c() + drVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx0)) {
            return false;
        }
        kx0 kx0Var = (kx0) obj;
        return Intrinsics.b(this.a, kx0Var.a) && Intrinsics.b(this.b, kx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.p() + ": " + this.b.p();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kx0(String str, String str2) {
        this(nj.j(str), nj.j(str2));
        str.getClass();
        str2.getClass();
        dr drVar = dr.p;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kx0(dr drVar, String str) {
        this(drVar, nj.j(str));
        drVar.getClass();
        str.getClass();
        dr drVar2 = dr.p;
    }
}
