package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x33 extends z33 implements Iterable, k71 {
    public final String m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final List u;
    public final List v;

    public x33(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.m = str;
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = f4;
        this.r = f5;
        this.s = f6;
        this.t = f7;
        this.u = list;
        this.v = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof x33)) {
            x33 x33Var = (x33) obj;
            return Intrinsics.b(this.m, x33Var.m) && this.n == x33Var.n && this.o == x33Var.o && this.p == x33Var.p && this.q == x33Var.q && this.r == x33Var.r && this.s == x33Var.s && this.t == x33Var.t && Intrinsics.b(this.u, x33Var.u) && Intrinsics.b(this.v, x33Var.v);
        }
        return false;
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + q40.d(this.t, q40.d(this.s, q40.d(this.r, q40.d(this.q, q40.d(this.p, q40.d(this.o, q40.d(this.n, this.m.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new n0(this);
    }
}
