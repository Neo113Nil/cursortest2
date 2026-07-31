package h0;

import b0.AbstractC0347p;
import b0.M;
import java.util.List;
import m.AbstractC0625j;

/* renamed from: h0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457J extends AbstractC0455H {

    /* renamed from: d, reason: collision with root package name */
    public final String f5889d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5890e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5891f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0347p f5892g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5893h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0347p f5894i;

    /* renamed from: j, reason: collision with root package name */
    public final float f5895j;

    /* renamed from: k, reason: collision with root package name */
    public final float f5896k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5897l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5898m;

    /* renamed from: n, reason: collision with root package name */
    public final float f5899n;

    /* renamed from: o, reason: collision with root package name */
    public final float f5900o;

    /* renamed from: p, reason: collision with root package name */
    public final float f5901p;

    /* renamed from: q, reason: collision with root package name */
    public final float f5902q;

    public C0457J(String str, List list, int i3, AbstractC0347p abstractC0347p, float f3, AbstractC0347p abstractC0347p2, float f4, float f5, int i4, int i5, float f6, float f7, float f8, float f9) {
        this.f5889d = str;
        this.f5890e = list;
        this.f5891f = i3;
        this.f5892g = abstractC0347p;
        this.f5893h = f3;
        this.f5894i = abstractC0347p2;
        this.f5895j = f4;
        this.f5896k = f5;
        this.f5897l = i4;
        this.f5898m = i5;
        this.f5899n = f6;
        this.f5900o = f7;
        this.f5901p = f8;
        this.f5902q = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0457J.class == obj.getClass()) {
            C0457J c0457j = (C0457J) obj;
            return f2.j.a(this.f5889d, c0457j.f5889d) && f2.j.a(this.f5892g, c0457j.f5892g) && this.f5893h == c0457j.f5893h && f2.j.a(this.f5894i, c0457j.f5894i) && this.f5895j == c0457j.f5895j && this.f5896k == c0457j.f5896k && M.s(this.f5897l, c0457j.f5897l) && M.t(this.f5898m, c0457j.f5898m) && this.f5899n == c0457j.f5899n && this.f5900o == c0457j.f5900o && this.f5901p == c0457j.f5901p && this.f5902q == c0457j.f5902q && this.f5891f == c0457j.f5891f && f2.j.a(this.f5890e, c0457j.f5890e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f5890e.hashCode() + (this.f5889d.hashCode() * 31)) * 31;
        AbstractC0347p abstractC0347p = this.f5892g;
        int a3 = A.k.a(this.f5893h, (hashCode + (abstractC0347p != null ? abstractC0347p.hashCode() : 0)) * 31, 31);
        AbstractC0347p abstractC0347p2 = this.f5894i;
        return Integer.hashCode(this.f5891f) + A.k.a(this.f5902q, A.k.a(this.f5901p, A.k.a(this.f5900o, A.k.a(this.f5899n, AbstractC0625j.a(this.f5898m, AbstractC0625j.a(this.f5897l, A.k.a(this.f5896k, A.k.a(this.f5895j, (a3 + (abstractC0347p2 != null ? abstractC0347p2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
