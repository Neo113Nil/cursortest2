package s;

import java.util.List;
import r0.G;
import r0.H;
import r0.I;
import r0.J;

/* renamed from: s.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0872o implements u.z {

    /* renamed from: a, reason: collision with root package name */
    public final int f7434a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7435b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7436c;

    /* renamed from: d, reason: collision with root package name */
    public final U.b f7437d;

    /* renamed from: e, reason: collision with root package name */
    public final U.c f7438e;

    /* renamed from: f, reason: collision with root package name */
    public final M0.j f7439f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7440g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7441h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7442i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f7443j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7444k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f7445l;

    /* renamed from: m, reason: collision with root package name */
    public int f7446m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7447n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7448o;
    public final int p;

    /* renamed from: q, reason: collision with root package name */
    public int f7449q = Integer.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f7450r;

    public C0872o(int i3, List list, boolean z3, U.b bVar, U.c cVar, M0.j jVar, boolean z4, int i4, int i5, int i6, long j3, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.a aVar, long j4) {
        this.f7434a = i3;
        this.f7435b = list;
        this.f7436c = z3;
        this.f7437d = bVar;
        this.f7438e = cVar;
        this.f7439f = jVar;
        this.f7440g = z4;
        this.f7441h = i6;
        this.f7442i = j3;
        this.f7443j = obj;
        this.f7444k = obj2;
        this.f7445l = aVar;
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            H h3 = (H) list.get(i9);
            boolean z5 = this.f7436c;
            i7 += z5 ? h3.f7115e : h3.f7114d;
            i8 = Math.max(i8, !z5 ? h3.f7115e : h3.f7114d);
        }
        this.f7447n = i7;
        int i10 = i7 + this.f7441h;
        this.f7448o = i10 >= 0 ? i10 : 0;
        this.p = i8;
        this.f7450r = new int[this.f7435b.size() * 2];
    }

    @Override // u.z
    public final int a() {
        return this.f7448o;
    }

    @Override // u.z
    public final int b() {
        return this.f7435b.size();
    }

    @Override // u.z
    public final long c(int i3) {
        int i4 = i3 * 2;
        int[] iArr = this.f7450r;
        return I2.d.c(iArr[i4], iArr[i4 + 1]);
    }

    @Override // u.z
    public final int d() {
        return 1;
    }

    @Override // u.z
    public final Object e(int i3) {
        return ((H) this.f7435b.get(i3)).r();
    }

    @Override // u.z
    public final int f() {
        return 0;
    }

    public final void g(G g3) {
        if (this.f7449q == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        List list = this.f7435b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            H h3 = (H) list.get(i3);
            boolean z3 = this.f7436c;
            if (z3) {
                int i4 = h3.f7115e;
            } else {
                int i5 = h3.f7114d;
            }
            long c3 = c(i3);
            this.f7445l.a(i3, this.f7443j);
            if (this.f7440g) {
                c3 = I2.d.c(z3 ? (int) (c3 >> 32) : (this.f7449q - ((int) (c3 >> 32))) - (z3 ? h3.f7115e : h3.f7114d), z3 ? (this.f7449q - ((int) (c3 & 4294967295L))) - (z3 ? h3.f7115e : h3.f7114d) : (int) (c3 & 4294967295L));
            }
            long c4 = M0.g.c(c3, this.f7442i);
            if (z3) {
                G.i(g3, h3, c4);
            } else {
                int i6 = J.f7123b;
                I i7 = I.f7119f;
                if (g3.b() == M0.j.f2775d || g3.c() == 0) {
                    G.a(g3, h3);
                    h3.Q(M0.g.c(c4, h3.f7118h), 0.0f, i7);
                } else {
                    long c5 = I2.d.c((g3.c() - h3.f7114d) - ((int) (c4 >> 32)), (int) (c4 & 4294967295L));
                    G.a(g3, h3);
                    h3.Q(M0.g.c(c5, h3.f7118h), 0.0f, i7);
                }
            }
        }
    }

    @Override // u.z
    public final int getIndex() {
        return this.f7434a;
    }

    @Override // u.z
    public final Object getKey() {
        return this.f7443j;
    }

    public final void h(int i3, int i4, int i5) {
        int i6;
        this.f7446m = i3;
        boolean z3 = this.f7436c;
        this.f7449q = z3 ? i5 : i4;
        List list = this.f7435b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            H h3 = (H) list.get(i7);
            int i8 = i7 * 2;
            int[] iArr = this.f7450r;
            if (z3) {
                U.b bVar = this.f7437d;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i8] = bVar.a(h3.f7114d, i4, this.f7439f);
                iArr[i8 + 1] = i3;
                i6 = h3.f7115e;
            } else {
                iArr[i8] = i3;
                int i9 = i8 + 1;
                U.c cVar = this.f7438e;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr[i9] = cVar.a(h3.f7115e, i5);
                i6 = h3.f7114d;
            }
            i3 += i6;
        }
    }
}
