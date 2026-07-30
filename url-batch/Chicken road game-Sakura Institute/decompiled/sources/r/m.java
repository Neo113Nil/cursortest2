package r;

import java.util.List;
import p1.m0;
import p1.n0;
import p1.o0;
import p1.p0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f7646a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7647b;

    /* renamed from: c, reason: collision with root package name */
    public final s0.e f7648c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.k f7649d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7650e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7651f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7652g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f7653h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f7654i;

    /* renamed from: j, reason: collision with root package name */
    public int f7655j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7656k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7657l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7658m;

    /* renamed from: n, reason: collision with root package name */
    public int f7659n = Integer.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f7660o;

    public m(int i7, List list, s0.e eVar, m2.k kVar, int i8, int i9, int i10, long j8, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j9) {
        this.f7646a = i7;
        this.f7647b = list;
        this.f7648c = eVar;
        this.f7649d = kVar;
        this.f7650e = i10;
        this.f7651f = j8;
        this.f7652g = obj;
        this.f7653h = obj2;
        this.f7654i = aVar;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            n0 n0Var = (n0) list.get(i13);
            i11 += n0Var.f7064g;
            i12 = Math.max(i12, n0Var.f7063f);
        }
        this.f7656k = i11;
        int i14 = i11 + this.f7650e;
        this.f7657l = i14 >= 0 ? i14 : 0;
        this.f7658m = i12;
        this.f7660o = new int[this.f7647b.size() * 2];
    }

    public final long a(int i7) {
        int i8 = i7 * 2;
        int[] iArr = this.f7660o;
        return a8.m.c(iArr[i8], iArr[i8 + 1]);
    }

    public final void b(m0 m0Var) {
        o0 o0Var = o0.f7070h;
        if (this.f7659n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list = this.f7647b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            n0 n0Var = (n0) list.get(i7);
            int i8 = n0Var.f7064g;
            long a3 = a(i7);
            r6.i.e(this.f7654i.f651a.e(this.f7652g));
            long c4 = m2.h.c(a3, this.f7651f);
            int i9 = p0.f7074b;
            m0Var.getClass();
            m0.a(m0Var, n0Var);
            n0Var.j0(m2.h.c(c4, n0Var.f7067j), 0.0f, o0Var);
        }
    }

    public final void c(int i7, int i8, int i9) {
        this.f7655j = i7;
        this.f7659n = i9;
        List list = this.f7647b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) list.get(i10);
            int i11 = i10 * 2;
            s0.e eVar = this.f7648c;
            if (eVar == null) {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
            }
            int a3 = eVar.a(n0Var.f7063f, i8, this.f7649d);
            int[] iArr = this.f7660o;
            iArr[i11] = a3;
            iArr[i11 + 1] = i7;
            i7 += n0Var.f7064g;
        }
    }
}
