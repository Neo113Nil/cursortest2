package defpackage;

import com.facebook.internal.Utility;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l13 {
    public final pw2 a;
    public final pw2 b;
    public final pw2 c;
    public final pw2 d;
    public final pw2 e;
    public final pw2 f;
    public final pw2 g;
    public final pw2 h;
    public final pw2 i;
    public final pw2 j;
    public final pw2 k;
    public final pw2 l;
    public final pw2 m;
    public final pw2 n;
    public final pw2 o;

    public l13(pw2 pw2Var, pw2 pw2Var2, pw2 pw2Var3, pw2 pw2Var4, pw2 pw2Var5, pw2 pw2Var6, pw2 pw2Var7, pw2 pw2Var8, pw2 pw2Var9, pw2 pw2Var10, pw2 pw2Var11, pw2 pw2Var12, pw2 pw2Var13, int i) {
        pw2 pw2Var14 = (i & 1) != 0 ? o13.d : pw2Var;
        pw2 pw2Var15 = o13.e;
        pw2 pw2Var16 = (i & 4) != 0 ? o13.f : pw2Var2;
        pw2 pw2Var17 = o13.g;
        pw2 pw2Var18 = (i & 16) != 0 ? o13.h : pw2Var3;
        pw2 pw2Var19 = (i & 32) != 0 ? o13.i : pw2Var4;
        pw2 pw2Var20 = (i & 64) != 0 ? o13.m : pw2Var5;
        pw2 pw2Var21 = (i & 128) != 0 ? o13.n : pw2Var6;
        pw2 pw2Var22 = (i & 256) != 0 ? o13.o : pw2Var7;
        pw2 pw2Var23 = (i & 512) != 0 ? o13.a : pw2Var8;
        pw2 pw2Var24 = (i & 1024) != 0 ? o13.b : pw2Var9;
        pw2 pw2Var25 = (i & 2048) != 0 ? o13.c : pw2Var10;
        pw2 pw2Var26 = (i & 4096) != 0 ? o13.j : pw2Var11;
        pw2 pw2Var27 = (i & Utility.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? o13.k : pw2Var12;
        pw2 pw2Var28 = (i & 16384) != 0 ? o13.l : pw2Var13;
        this.a = pw2Var14;
        this.b = pw2Var15;
        this.c = pw2Var16;
        this.d = pw2Var17;
        this.e = pw2Var18;
        this.f = pw2Var19;
        this.g = pw2Var20;
        this.h = pw2Var21;
        this.i = pw2Var22;
        this.j = pw2Var23;
        this.k = pw2Var24;
        this.l = pw2Var25;
        this.m = pw2Var26;
        this.n = pw2Var27;
        this.o = pw2Var28;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l13)) {
            return false;
        }
        l13 l13Var = (l13) obj;
        return Intrinsics.b(this.a, l13Var.a) && Intrinsics.b(this.b, l13Var.b) && Intrinsics.b(this.c, l13Var.c) && Intrinsics.b(this.d, l13Var.d) && Intrinsics.b(this.e, l13Var.e) && Intrinsics.b(this.f, l13Var.f) && Intrinsics.b(this.g, l13Var.g) && Intrinsics.b(this.h, l13Var.h) && Intrinsics.b(this.i, l13Var.i) && Intrinsics.b(this.j, l13Var.j) && Intrinsics.b(this.k, l13Var.k) && Intrinsics.b(this.l, l13Var.l) && Intrinsics.b(this.m, l13Var.m) && Intrinsics.b(this.n, l13Var.n) && Intrinsics.b(this.o, l13Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }
}
