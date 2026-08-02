package r0;

import T.C0097o;
import T.r;
import a.AbstractC0124a;
import android.util.SparseArray;
import d2.C0389g;
import y0.F;
import y0.p;
import y0.y;

/* renamed from: r0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1394e implements p {

    /* renamed from: k, reason: collision with root package name */
    public static final r f15127k = new r();

    /* renamed from: a, reason: collision with root package name */
    public final y0.n f15128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15129b;

    /* renamed from: c, reason: collision with root package name */
    public final C0097o f15130c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f15131d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final C1393d f15132e = C1393d.f15126a;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15133f;

    /* renamed from: g, reason: collision with root package name */
    public C0389g f15134g;

    /* renamed from: h, reason: collision with root package name */
    public long f15135h;

    /* renamed from: i, reason: collision with root package name */
    public y f15136i;

    /* renamed from: j, reason: collision with root package name */
    public C0097o[] f15137j;

    public C1394e(y0.n nVar, int i4, C0097o c0097o) {
        this.f15128a = nVar;
        this.f15129b = i4;
        this.f15130c = c0097o;
    }

    public final y0.j a() {
        y yVar = this.f15136i;
        if (yVar instanceof y0.j) {
            return (y0.j) yVar;
        }
        if (yVar instanceof Q0.d) {
            return ((Q0.d) yVar).f2135a;
        }
        return null;
    }

    public final void b(C0389g c0389g, long j4, long j5) {
        this.f15134g = c0389g;
        this.f15135h = j5;
        boolean z = this.f15133f;
        y0.n nVar = this.f15128a;
        if (!z) {
            nVar.e(this);
            if (j4 != -9223372036854775807L) {
                nVar.a(0L, j4);
            }
            this.f15133f = true;
            return;
        }
        if (j4 == -9223372036854775807L) {
            j4 = 0;
        }
        nVar.a(0L, j4);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f15131d;
            if (i4 >= sparseArray.size()) {
                return;
            }
            C1392c c1392c = (C1392c) sparseArray.valueAt(i4);
            if (c0389g == null) {
                c1392c.f15124f = c1392c.f15121c;
            } else {
                c1392c.f15125g = j5;
                F K2 = c0389g.K(c1392c.f15119a);
                c1392c.f15124f = K2;
                C0097o c0097o = c1392c.f15123e;
                if (c0097o != null) {
                    K2.d(c0097o);
                }
            }
            i4++;
        }
    }

    @Override // y0.p
    public final void r() {
        SparseArray sparseArray = this.f15131d;
        C0097o[] c0097oArr = new C0097o[sparseArray.size()];
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            C0097o c0097o = ((C1392c) sparseArray.valueAt(i4)).f15123e;
            c0097o.getClass();
            c0097oArr[i4] = c0097o;
        }
        this.f15137j = c0097oArr;
    }

    @Override // y0.p
    public final void x(y yVar) {
        this.f15136i = yVar;
    }

    @Override // y0.p
    public final F z(int i4, int i5) {
        SparseArray sparseArray = this.f15131d;
        C1392c c1392c = (C1392c) sparseArray.get(i4);
        if (c1392c == null) {
            AbstractC0124a.t(this.f15137j == null);
            c1392c = new C1392c(i4, i5, i5 == this.f15129b ? this.f15130c : null, this.f15132e);
            C0389g c0389g = this.f15134g;
            long j4 = this.f15135h;
            if (c0389g == null) {
                c1392c.f15124f = c1392c.f15121c;
            } else {
                c1392c.f15125g = j4;
                F K2 = c0389g.K(i5);
                c1392c.f15124f = K2;
                C0097o c0097o = c1392c.f15123e;
                if (c0097o != null) {
                    K2.d(c0097o);
                }
            }
            sparseArray.put(i4, c1392c);
        }
        return c1392c;
    }
}
