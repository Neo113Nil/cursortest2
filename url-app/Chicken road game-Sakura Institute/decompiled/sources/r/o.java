package r;

import java.util.List;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.AbstractC0956Q;
import p0.C0955P;
import r0.B;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f9519a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9520b;

    /* renamed from: c, reason: collision with root package name */
    public final S.e f9521c;

    /* renamed from: d, reason: collision with root package name */
    public final M0.k f9522d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9523e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9524f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9525g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f9526h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f9527i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f9528j;

    /* renamed from: k, reason: collision with root package name */
    public int f9529k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9530l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9531m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9532n;

    /* renamed from: o, reason: collision with root package name */
    public int f9533o = Integer.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f9534p;

    public o(int i2, List list, S.e eVar, S.f fVar, M0.k kVar, boolean z4, int i4, int i5, int i6, long j4, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j5) {
        this.f9519a = i2;
        this.f9520b = list;
        this.f9521c = eVar;
        this.f9522d = kVar;
        this.f9523e = z4;
        this.f9524f = i6;
        this.f9525g = j4;
        this.f9526h = obj;
        this.f9527i = obj2;
        this.f9528j = aVar;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC0954O abstractC0954O = (AbstractC0954O) list.get(i9);
            i7 += abstractC0954O.f9006e;
            i8 = Math.max(i8, abstractC0954O.f9005d);
        }
        this.f9530l = i7;
        int i10 = i7 + this.f9524f;
        this.f9531m = i10 >= 0 ? i10 : 0;
        this.f9532n = i8;
        this.f9534p = new int[this.f9520b.size() * 2];
    }

    public final long a(int i2) {
        int i4 = i2 * 2;
        int[] iArr = this.f9534p;
        return j0.c.g(iArr[i4], iArr[i4 + 1]);
    }

    public final void b(AbstractC0953N abstractC0953N) {
        if (this.f9533o == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list = this.f9520b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0954O abstractC0954O = (AbstractC0954O) list.get(i2);
            int i4 = abstractC0954O.f9006e;
            long a4 = a(i2);
            B.c(this.f9528j.f5094a.e(this.f9526h));
            if (this.f9523e) {
                a4 = j0.c.g((int) (a4 >> 32), (this.f9533o - ((int) (a4 & 4294967295L))) - abstractC0954O.f9006e);
            }
            long c4 = M0.h.c(a4, this.f9525g);
            C0955P c0955p = C0955P.f9010e;
            int i5 = AbstractC0956Q.f9014b;
            abstractC0953N.getClass();
            AbstractC0953N.a(abstractC0953N, abstractC0954O);
            abstractC0954O.n0(M0.h.c(c4, abstractC0954O.f9009k), 0.0f, c0955p);
        }
    }

    public final void c(int i2, int i4, int i5) {
        this.f9529k = i2;
        this.f9533o = i5;
        List list = this.f9520b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC0954O abstractC0954O = (AbstractC0954O) list.get(i6);
            int i7 = i6 * 2;
            S.e eVar = this.f9521c;
            if (eVar == null) {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
            }
            int a4 = eVar.a(abstractC0954O.f9005d, i4, this.f9522d);
            int[] iArr = this.f9534p;
            iArr[i7] = a4;
            iArr[i7 + 1] = i2;
            i2 += abstractC0954O.f9006e;
        }
    }
}
