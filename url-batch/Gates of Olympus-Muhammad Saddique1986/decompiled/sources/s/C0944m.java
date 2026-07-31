package s;

import java.util.List;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.AbstractC0895Q;
import r0.C0894P;

/* renamed from: s.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944m {

    /* renamed from: a, reason: collision with root package name */
    public final int f8285a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8286b;

    /* renamed from: c, reason: collision with root package name */
    public final U.c f8287c;

    /* renamed from: d, reason: collision with root package name */
    public final O0.k f8288d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8289e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8290f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8291g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8292h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f8293i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f8294j;

    /* renamed from: k, reason: collision with root package name */
    public int f8295k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8296l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8297m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8298n;

    /* renamed from: o, reason: collision with root package name */
    public int f8299o = Integer.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f8300p;

    public C0944m(int i3, List list, U.c cVar, U.h hVar, O0.k kVar, boolean z3, int i4, int i5, int i6, long j3, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j4) {
        this.f8285a = i3;
        this.f8286b = list;
        this.f8287c = cVar;
        this.f8288d = kVar;
        this.f8289e = z3;
        this.f8290f = i6;
        this.f8291g = j3;
        this.f8292h = obj;
        this.f8293i = obj2;
        this.f8294j = aVar;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC0893O abstractC0893O = (AbstractC0893O) list.get(i9);
            i7 += abstractC0893O.f8127e;
            i8 = Math.max(i8, abstractC0893O.f8126d);
        }
        this.f8296l = i7;
        int i10 = i7 + this.f8290f;
        this.f8297m = i10 >= 0 ? i10 : 0;
        this.f8298n = i8;
        this.f8300p = new int[this.f8286b.size() * 2];
    }

    public final long a(int i3) {
        int i4 = i3 * 2;
        int[] iArr = this.f8300p;
        return l0.c.c(iArr[i4], iArr[i4 + 1]);
    }

    public final void b(AbstractC0892N abstractC0892N) {
        if (this.f8299o == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list = this.f8286b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0893O abstractC0893O = (AbstractC0893O) list.get(i3);
            int i4 = abstractC0893O.f8127e;
            long a3 = a(i3);
            A.k.r(this.f8294j.f4839a.e(this.f8292h));
            if (this.f8289e) {
                a3 = l0.c.c((int) (a3 >> 32), (this.f8299o - ((int) (a3 & 4294967295L))) - abstractC0893O.f8127e);
            }
            long c2 = O0.h.c(a3, this.f8291g);
            C0894P c0894p = C0894P.f8131f;
            int i5 = AbstractC0895Q.f8135b;
            abstractC0892N.getClass();
            AbstractC0892N.a(abstractC0892N, abstractC0893O);
            abstractC0893O.f0(O0.h.c(c2, abstractC0893O.f8130h), 0.0f, c0894p);
        }
    }

    public final void c(int i3, int i4, int i5) {
        this.f8295k = i3;
        this.f8299o = i5;
        List list = this.f8286b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC0893O abstractC0893O = (AbstractC0893O) list.get(i6);
            int i7 = i6 * 2;
            U.c cVar = this.f8287c;
            if (cVar == null) {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
            }
            int a3 = cVar.a(abstractC0893O.f8126d, i4, this.f8288d);
            int[] iArr = this.f8300p;
            iArr[i7] = a3;
            iArr[i7 + 1] = i3;
            i3 += abstractC0893O.f8127e;
        }
    }
}
