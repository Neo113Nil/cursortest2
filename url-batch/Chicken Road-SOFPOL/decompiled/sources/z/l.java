package z;

import java.util.List;
import u1.k0;
import u1.l0;
import u1.m0;
import u1.n0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f9056a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9057b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.d f9058c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9059d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9060e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9061f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9062g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f9063h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9064j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9065k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9066l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9067m;

    /* renamed from: n, reason: collision with root package name */
    public int f9068n = Integer.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f9069o;

    public l(int i, List list, y0.d dVar, r2.l lVar, int i8, int i9, int i10, long j7, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j8) {
        this.f9056a = i;
        this.f9057b = list;
        this.f9058c = dVar;
        this.f9059d = i10;
        this.f9060e = j7;
        this.f9061f = obj;
        this.f9062g = obj2;
        this.f9063h = bVar;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            l0 l0Var = (l0) list.get(i13);
            i11 += l0Var.f7230d;
            i12 = Math.max(i12, l0Var.f7231e);
        }
        this.f9064j = i11;
        int i14 = i11 + this.f9059d;
        this.f9065k = i14 >= 0 ? i14 : 0;
        this.f9066l = i12;
        this.f9069o = new int[this.f9057b.size() * 2];
    }

    public final long a(int i) {
        int i8;
        long j7;
        if (i == 0 && this.f9057b.size() == 0) {
            j7 = this.i << 32;
            i8 = 0;
        } else {
            int i9 = i * 2;
            int[] iArr = this.f9069o;
            int i10 = iArr[i9];
            i8 = iArr[i9 + 1];
            j7 = i10 << 32;
        }
        return (4294967295L & i8) | j7;
    }

    public final void b(k0 k0Var) {
        m0 m0Var = m0.f7237f;
        if (this.f9068n == Integer.MIN_VALUE) {
            w.a.a("position() should be called first");
        }
        List list = this.f9057b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            l0 l0Var = (l0) list.get(i);
            int i8 = l0Var.f7230d;
            long a8 = a(i);
            a0.q.q(this.f9063h.f513a.g(this.f9061f));
            long c8 = r2.i.c(a8, this.f9060e);
            int i9 = n0.f7247b;
            if (k0Var.e() == r2.l.f6529d || k0Var.f() == 0) {
                k0.a(k0Var, l0Var);
                l0Var.U(r2.i.c(c8, l0Var.f7234h), 0.0f, m0Var);
            } else {
                int f6 = (k0Var.f() - l0Var.f7230d) - ((int) (c8 >> 32));
                k0.a(k0Var, l0Var);
                l0Var.U(r2.i.c((f6 << 32) | (4294967295L & ((int) (c8 & 4294967295L))), l0Var.f7234h), 0.0f, m0Var);
            }
        }
    }

    public final void c(int i, int i8, int i9) {
        this.i = i;
        this.f9068n = i8;
        List list = this.f9057b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l0 l0Var = (l0) list.get(i10);
            int i11 = i10 * 2;
            int[] iArr = this.f9069o;
            iArr[i11] = i;
            int i12 = i11 + 1;
            y0.d dVar = this.f9058c;
            if (dVar == null) {
                w.a.b("null verticalAlignment when isVertical == false");
                throw new a5.c();
            }
            iArr[i12] = dVar.a(l0Var.f7231e, i9);
            i += l0Var.f7230d;
        }
    }
}
