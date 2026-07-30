package defpackage;

import defpackage.q13;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x01 {
    public static int k;
    public static final u30 l = new u30(20);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final x33 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public x01(String str, float f, float f2, float f3, float f4, x33 x33Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = x33Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x01)) {
            return false;
        }
        x01 x01Var = (x01) obj;
        return Intrinsics.b(this.a, x01Var.a) && pc0.a(this.b, x01Var.b) && pc0.a(this.c, x01Var.c) && this.d == x01Var.d && this.e == x01Var.e && this.f.equals(x01Var.f) && aw.c(this.g, x01Var.g) && this.h == x01Var.h && this.i == x01Var.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + q40.d(this.e, q40.d(this.d, q40.d(this.c, q40.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = aw.h;
        q13.a aVar = q13.m;
        return Boolean.hashCode(this.i) + q40.e(this.h, in1.h(hashCode, 31, this.g), 31);
    }
}
