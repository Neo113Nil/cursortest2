package h0;

import H2.AbstractC0080b;
import b0.AbstractC0259J;
import java.util.List;

/* loaded from: classes.dex */
public final class J extends H {

    /* renamed from: d, reason: collision with root package name */
    public final String f4901d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4902e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4903f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0259J f4904g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4905h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0259J f4906i;

    /* renamed from: j, reason: collision with root package name */
    public final float f4907j;

    /* renamed from: k, reason: collision with root package name */
    public final float f4908k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4909l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4910m;

    /* renamed from: n, reason: collision with root package name */
    public final float f4911n;

    /* renamed from: o, reason: collision with root package name */
    public final float f4912o;
    public final float p;

    /* renamed from: q, reason: collision with root package name */
    public final float f4913q;

    public J(String str, List list, int i3, AbstractC0259J abstractC0259J, float f3, AbstractC0259J abstractC0259J2, float f4, float f5, int i4, int i5, float f6, float f7, float f8, float f9) {
        this.f4901d = str;
        this.f4902e = list;
        this.f4903f = i3;
        this.f4904g = abstractC0259J;
        this.f4905h = f3;
        this.f4906i = abstractC0259J2;
        this.f4907j = f4;
        this.f4908k = f5;
        this.f4909l = i4;
        this.f4910m = i5;
        this.f4911n = f6;
        this.f4912o = f7;
        this.p = f8;
        this.f4913q = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J.class == obj.getClass()) {
            J j3 = (J) obj;
            return Z1.i.a(this.f4901d, j3.f4901d) && Z1.i.a(this.f4904g, j3.f4904g) && this.f4905h == j3.f4905h && Z1.i.a(this.f4906i, j3.f4906i) && this.f4907j == j3.f4907j && this.f4908k == j3.f4908k && AbstractC0259J.q(this.f4909l, j3.f4909l) && AbstractC0259J.r(this.f4910m, j3.f4910m) && this.f4911n == j3.f4911n && this.f4912o == j3.f4912o && this.p == j3.p && this.f4913q == j3.f4913q && this.f4903f == j3.f4903f && Z1.i.a(this.f4902e, j3.f4902e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4902e.hashCode() + (this.f4901d.hashCode() * 31)) * 31;
        AbstractC0259J abstractC0259J = this.f4904g;
        int a3 = AbstractC0080b.a(this.f4905h, (hashCode + (abstractC0259J != null ? abstractC0259J.hashCode() : 0)) * 31, 31);
        AbstractC0259J abstractC0259J2 = this.f4906i;
        return Integer.hashCode(this.f4903f) + AbstractC0080b.a(this.f4913q, AbstractC0080b.a(this.p, AbstractC0080b.a(this.f4912o, AbstractC0080b.a(this.f4911n, AbstractC0080b.b(this.f4910m, AbstractC0080b.b(this.f4909l, AbstractC0080b.a(this.f4908k, AbstractC0080b.a(this.f4907j, (a3 + (abstractC0259J2 != null ? abstractC0259J2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
