package q1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 extends h0 {
    public final float A;
    public final float B;

    /* renamed from: d, reason: collision with root package name */
    public final String f7899d;

    /* renamed from: e, reason: collision with root package name */
    public final List f7900e;

    /* renamed from: i, reason: collision with root package name */
    public final int f7901i;

    /* renamed from: r, reason: collision with root package name */
    public final k1.v f7902r;

    /* renamed from: s, reason: collision with root package name */
    public final float f7903s;

    /* renamed from: t, reason: collision with root package name */
    public final k1.v f7904t;

    /* renamed from: u, reason: collision with root package name */
    public final float f7905u;

    /* renamed from: v, reason: collision with root package name */
    public final float f7906v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7907w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7908x;

    /* renamed from: y, reason: collision with root package name */
    public final float f7909y;

    /* renamed from: z, reason: collision with root package name */
    public final float f7910z;

    public j0(String str, List list, int i3, k1.v vVar, float f3, k1.v vVar2, float f10, float f11, int i10, int i11, float f12, float f13, float f14, float f15) {
        this.f7899d = str;
        this.f7900e = list;
        this.f7901i = i3;
        this.f7902r = vVar;
        this.f7903s = f3;
        this.f7904t = vVar2;
        this.f7905u = f10;
        this.f7906v = f11;
        this.f7907w = i10;
        this.f7908x = i11;
        this.f7909y = f12;
        this.f7910z = f13;
        this.A = f14;
        this.B = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f7899d.equals(j0Var.f7899d) && Intrinsics.a(this.f7902r, j0Var.f7902r) && this.f7903s == j0Var.f7903s && Intrinsics.a(this.f7904t, j0Var.f7904t) && this.f7905u == j0Var.f7905u && this.f7906v == j0Var.f7906v && this.f7907w == j0Var.f7907w && this.f7908x == j0Var.f7908x && this.f7909y == j0Var.f7909y && this.f7910z == j0Var.f7910z && this.A == j0Var.A && this.B == j0Var.B && this.f7901i == j0Var.f7901i && Intrinsics.a(this.f7900e, j0Var.f7900e);
    }

    public final int hashCode() {
        int hashCode = (this.f7900e.hashCode() + (this.f7899d.hashCode() * 31)) * 31;
        k1.v vVar = this.f7902r;
        int b10 = n0.l.b(this.f7903s, (hashCode + (vVar != null ? vVar.hashCode() : 0)) * 31, 31);
        k1.v vVar2 = this.f7904t;
        return Integer.hashCode(this.f7901i) + n0.l.b(this.B, n0.l.b(this.A, n0.l.b(this.f7910z, n0.l.b(this.f7909y, v4.a.x(this.f7908x, v4.a.x(this.f7907w, n0.l.b(this.f7906v, n0.l.b(this.f7905u, (b10 + (vVar2 != null ? vVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
