package g1;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import g1.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o2.m0;
import r0.n2;
import w0.b0;

/* loaded from: classes.dex */
public final class h0 implements w0.l {

    /* renamed from: t, reason: collision with root package name */
    public static final w0.r f16317t = new w0.r() { // from class: g1.g0
        @Override // w0.r
        public final w0.l[] a() {
            w0.l[] x6;
            x6 = h0.x();
            return x6;
        }

        @Override // w0.r
        public /* synthetic */ w0.l[] b(Uri uri, Map map) {
            return w0.q.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f16318a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16319b;

    /* renamed from: c, reason: collision with root package name */
    private final List<o2.i0> f16320c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.a0 f16321d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseIntArray f16322e;

    /* renamed from: f, reason: collision with root package name */
    private final i0.c f16323f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray<i0> f16324g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f16325h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f16326i;

    /* renamed from: j, reason: collision with root package name */
    private final f0 f16327j;

    /* renamed from: k, reason: collision with root package name */
    private e0 f16328k;

    /* renamed from: l, reason: collision with root package name */
    private w0.n f16329l;

    /* renamed from: m, reason: collision with root package name */
    private int f16330m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16331n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16332o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16333p;

    /* renamed from: q, reason: collision with root package name */
    private i0 f16334q;

    /* renamed from: r, reason: collision with root package name */
    private int f16335r;

    /* renamed from: s, reason: collision with root package name */
    private int f16336s;

    private class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final o2.z f16337a = new o2.z(new byte[4]);

        public a() {
        }

        @Override // g1.b0
        public void b(o2.i0 i0Var, w0.n nVar, i0.d dVar) {
        }

        @Override // g1.b0
        public void c(o2.a0 a0Var) {
            if (a0Var.C() == 0 && (a0Var.C() & 128) != 0) {
                a0Var.P(6);
                int a7 = a0Var.a() / 4;
                for (int i7 = 0; i7 < a7; i7++) {
                    a0Var.i(this.f16337a, 4);
                    int h7 = this.f16337a.h(16);
                    this.f16337a.r(3);
                    if (h7 == 0) {
                        this.f16337a.r(13);
                    } else {
                        int h8 = this.f16337a.h(13);
                        if (h0.this.f16324g.get(h8) == null) {
                            h0.this.f16324g.put(h8, new c0(h0.this.new b(h8)));
                            h0.l(h0.this);
                        }
                    }
                }
                if (h0.this.f16318a != 2) {
                    h0.this.f16324g.remove(0);
                }
            }
        }
    }

    private class b implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final o2.z f16339a = new o2.z(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<i0> f16340b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private final SparseIntArray f16341c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        private final int f16342d;

        public b(int i7) {
            this.f16342d = i7;
        }

        private i0.b a(o2.a0 a0Var, int i7) {
            int e7 = a0Var.e();
            int i8 = i7 + e7;
            String str = null;
            ArrayList arrayList = null;
            int i9 = -1;
            while (a0Var.e() < i8) {
                int C = a0Var.C();
                int e8 = a0Var.e() + a0Var.C();
                if (e8 > i8) {
                    break;
                }
                if (C == 5) {
                    long E = a0Var.E();
                    if (E != 1094921523) {
                        if (E != 1161904947) {
                            if (E != 1094921524) {
                                if (E == 1212503619) {
                                    i9 = 36;
                                }
                            }
                            i9 = 172;
                        }
                        i9 = 135;
                    }
                    i9 = 129;
                } else {
                    if (C != 106) {
                        if (C != 122) {
                            if (C == 127) {
                                if (a0Var.C() != 21) {
                                }
                                i9 = 172;
                            } else if (C == 123) {
                                i9 = 138;
                            } else if (C == 10) {
                                str = a0Var.z(3).trim();
                            } else if (C == 89) {
                                arrayList = new ArrayList();
                                while (a0Var.e() < e8) {
                                    String trim = a0Var.z(3).trim();
                                    int C2 = a0Var.C();
                                    byte[] bArr = new byte[4];
                                    a0Var.j(bArr, 0, 4);
                                    arrayList.add(new i0.a(trim, C2, bArr));
                                }
                                i9 = 89;
                            } else if (C == 111) {
                                i9 = 257;
                            }
                        }
                        i9 = 135;
                    }
                    i9 = 129;
                }
                a0Var.P(e8 - a0Var.e());
            }
            a0Var.O(i8);
            return new i0.b(i9, str, arrayList, Arrays.copyOfRange(a0Var.d(), e7, i8));
        }

        @Override // g1.b0
        public void b(o2.i0 i0Var, w0.n nVar, i0.d dVar) {
        }

        @Override // g1.b0
        public void c(o2.a0 a0Var) {
            o2.i0 i0Var;
            if (a0Var.C() != 2) {
                return;
            }
            if (h0.this.f16318a == 1 || h0.this.f16318a == 2 || h0.this.f16330m == 1) {
                i0Var = (o2.i0) h0.this.f16320c.get(0);
            } else {
                i0Var = new o2.i0(((o2.i0) h0.this.f16320c.get(0)).c());
                h0.this.f16320c.add(i0Var);
            }
            if ((a0Var.C() & 128) == 0) {
                return;
            }
            a0Var.P(1);
            int I = a0Var.I();
            int i7 = 3;
            a0Var.P(3);
            a0Var.i(this.f16339a, 2);
            this.f16339a.r(3);
            int i8 = 13;
            h0.this.f16336s = this.f16339a.h(13);
            a0Var.i(this.f16339a, 2);
            int i9 = 4;
            this.f16339a.r(4);
            a0Var.P(this.f16339a.h(12));
            if (h0.this.f16318a == 2 && h0.this.f16334q == null) {
                i0.b bVar = new i0.b(21, null, null, m0.f19757f);
                h0 h0Var = h0.this;
                h0Var.f16334q = h0Var.f16323f.b(21, bVar);
                if (h0.this.f16334q != null) {
                    h0.this.f16334q.b(i0Var, h0.this.f16329l, new i0.d(I, 21, 8192));
                }
            }
            this.f16340b.clear();
            this.f16341c.clear();
            int a7 = a0Var.a();
            while (a7 > 0) {
                a0Var.i(this.f16339a, 5);
                int h7 = this.f16339a.h(8);
                this.f16339a.r(i7);
                int h8 = this.f16339a.h(i8);
                this.f16339a.r(i9);
                int h9 = this.f16339a.h(12);
                i0.b a8 = a(a0Var, h9);
                if (h7 == 6 || h7 == 5) {
                    h7 = a8.f16369a;
                }
                a7 -= h9 + 5;
                int i10 = h0.this.f16318a == 2 ? h7 : h8;
                if (!h0.this.f16325h.get(i10)) {
                    i0 b7 = (h0.this.f16318a == 2 && h7 == 21) ? h0.this.f16334q : h0.this.f16323f.b(h7, a8);
                    if (h0.this.f16318a != 2 || h8 < this.f16341c.get(i10, 8192)) {
                        this.f16341c.put(i10, h8);
                        this.f16340b.put(i10, b7);
                    }
                }
                i7 = 3;
                i9 = 4;
                i8 = 13;
            }
            int size = this.f16341c.size();
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = this.f16341c.keyAt(i11);
                int valueAt = this.f16341c.valueAt(i11);
                h0.this.f16325h.put(keyAt, true);
                h0.this.f16326i.put(valueAt, true);
                i0 valueAt2 = this.f16340b.valueAt(i11);
                if (valueAt2 != null) {
                    if (valueAt2 != h0.this.f16334q) {
                        valueAt2.b(i0Var, h0.this.f16329l, new i0.d(I, keyAt, 8192));
                    }
                    h0.this.f16324g.put(valueAt, valueAt2);
                }
            }
            if (h0.this.f16318a != 2) {
                h0.this.f16324g.remove(this.f16342d);
                h0 h0Var2 = h0.this;
                h0Var2.f16330m = h0Var2.f16318a == 1 ? 0 : h0.this.f16330m - 1;
                if (h0.this.f16330m != 0) {
                    return;
                } else {
                    h0.this.f16329l.j();
                }
            } else {
                if (h0.this.f16331n) {
                    return;
                }
                h0.this.f16329l.j();
                h0.this.f16330m = 0;
            }
            h0.this.f16331n = true;
        }
    }

    public h0() {
        this(0);
    }

    public h0(int i7) {
        this(1, i7, 112800);
    }

    public h0(int i7, int i8, int i9) {
        this(i7, new o2.i0(0L), new j(i8), i9);
    }

    public h0(int i7, o2.i0 i0Var, i0.c cVar) {
        this(i7, i0Var, cVar, 112800);
    }

    public h0(int i7, o2.i0 i0Var, i0.c cVar, int i8) {
        this.f16323f = (i0.c) o2.a.e(cVar);
        this.f16319b = i8;
        this.f16318a = i7;
        if (i7 == 1 || i7 == 2) {
            this.f16320c = Collections.singletonList(i0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f16320c = arrayList;
            arrayList.add(i0Var);
        }
        this.f16321d = new o2.a0(new byte[9400], 0);
        this.f16325h = new SparseBooleanArray();
        this.f16326i = new SparseBooleanArray();
        this.f16324g = new SparseArray<>();
        this.f16322e = new SparseIntArray();
        this.f16327j = new f0(i8);
        this.f16329l = w0.n.f22959d;
        this.f16336s = -1;
        z();
    }

    private boolean A(int i7) {
        return this.f16318a == 2 || this.f16331n || !this.f16326i.get(i7, false);
    }

    static /* synthetic */ int l(h0 h0Var) {
        int i7 = h0Var.f16330m;
        h0Var.f16330m = i7 + 1;
        return i7;
    }

    private boolean v(w0.m mVar) {
        byte[] d7 = this.f16321d.d();
        if (9400 - this.f16321d.e() < 188) {
            int a7 = this.f16321d.a();
            if (a7 > 0) {
                System.arraycopy(d7, this.f16321d.e(), d7, 0, a7);
            }
            this.f16321d.M(d7, a7);
        }
        while (this.f16321d.a() < 188) {
            int f7 = this.f16321d.f();
            int read = mVar.read(d7, f7, 9400 - f7);
            if (read == -1) {
                return false;
            }
            this.f16321d.N(f7 + read);
        }
        return true;
    }

    private int w() {
        int e7 = this.f16321d.e();
        int f7 = this.f16321d.f();
        int a7 = j0.a(this.f16321d.d(), e7, f7);
        this.f16321d.O(a7);
        int i7 = a7 + 188;
        if (i7 > f7) {
            int i8 = this.f16335r + (a7 - e7);
            this.f16335r = i8;
            if (this.f16318a == 2 && i8 > 376) {
                throw n2.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f16335r = 0;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w0.l[] x() {
        return new w0.l[]{new h0()};
    }

    private void y(long j7) {
        w0.n nVar;
        w0.b0 bVar;
        if (this.f16332o) {
            return;
        }
        this.f16332o = true;
        if (this.f16327j.b() != -9223372036854775807L) {
            e0 e0Var = new e0(this.f16327j.c(), this.f16327j.b(), j7, this.f16336s, this.f16319b);
            this.f16328k = e0Var;
            nVar = this.f16329l;
            bVar = e0Var.b();
        } else {
            nVar = this.f16329l;
            bVar = new b0.b(this.f16327j.b());
        }
        nVar.i(bVar);
    }

    private void z() {
        this.f16325h.clear();
        this.f16324g.clear();
        SparseArray<i0> a7 = this.f16323f.a();
        int size = a7.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f16324g.put(a7.keyAt(i7), a7.valueAt(i7));
        }
        this.f16324g.put(0, new c0(new a()));
        this.f16334q = null;
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        e0 e0Var;
        o2.a.f(this.f16318a != 2);
        int size = this.f16320c.size();
        for (int i7 = 0; i7 < size; i7++) {
            o2.i0 i0Var = this.f16320c.get(i7);
            boolean z6 = i0Var.e() == -9223372036854775807L;
            if (!z6) {
                long c7 = i0Var.c();
                z6 = (c7 == -9223372036854775807L || c7 == 0 || c7 == j8) ? false : true;
            }
            if (z6) {
                i0Var.g(j8);
            }
        }
        if (j8 != 0 && (e0Var = this.f16328k) != null) {
            e0Var.h(j8);
        }
        this.f16321d.K(0);
        this.f16322e.clear();
        for (int i8 = 0; i8 < this.f16324g.size(); i8++) {
            this.f16324g.valueAt(i8).a();
        }
        this.f16335r = 0;
    }

    @Override // w0.l
    public void d(w0.n nVar) {
        this.f16329l = nVar;
    }

    @Override // w0.l
    public int e(w0.m mVar, w0.a0 a0Var) {
        long a7 = mVar.a();
        if (this.f16331n) {
            if (((a7 == -1 || this.f16318a == 2) ? false : true) && !this.f16327j.d()) {
                return this.f16327j.e(mVar, a0Var, this.f16336s);
            }
            y(a7);
            if (this.f16333p) {
                this.f16333p = false;
                b(0L, 0L);
                if (mVar.p() != 0) {
                    a0Var.f22873a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f16328k;
            if (e0Var != null && e0Var.d()) {
                return this.f16328k.c(mVar, a0Var);
            }
        }
        if (!v(mVar)) {
            return -1;
        }
        int w6 = w();
        int f7 = this.f16321d.f();
        if (w6 > f7) {
            return 0;
        }
        int m7 = this.f16321d.m();
        if ((8388608 & m7) == 0) {
            int i7 = ((4194304 & m7) != 0 ? 1 : 0) | 0;
            int i8 = (2096896 & m7) >> 8;
            boolean z6 = (m7 & 32) != 0;
            i0 i0Var = (m7 & 16) != 0 ? this.f16324g.get(i8) : null;
            if (i0Var != null) {
                if (this.f16318a != 2) {
                    int i9 = m7 & 15;
                    int i10 = this.f16322e.get(i8, i9 - 1);
                    this.f16322e.put(i8, i9);
                    if (i10 != i9) {
                        if (i9 != ((i10 + 1) & 15)) {
                            i0Var.a();
                        }
                    }
                }
                if (z6) {
                    int C = this.f16321d.C();
                    i7 |= (this.f16321d.C() & 64) != 0 ? 2 : 0;
                    this.f16321d.P(C - 1);
                }
                boolean z7 = this.f16331n;
                if (A(i8)) {
                    this.f16321d.N(w6);
                    i0Var.c(this.f16321d, i7);
                    this.f16321d.N(f7);
                }
                if (this.f16318a != 2 && !z7 && this.f16331n && a7 != -1) {
                    this.f16333p = true;
                }
            }
        }
        this.f16321d.O(w6);
        return 0;
    }

    @Override // w0.l
    public boolean h(w0.m mVar) {
        boolean z6;
        byte[] d7 = this.f16321d.d();
        mVar.n(d7, 0, 940);
        for (int i7 = 0; i7 < 188; i7++) {
            int i8 = 0;
            while (true) {
                if (i8 >= 5) {
                    z6 = true;
                    break;
                }
                if (d7[(i8 * 188) + i7] != 71) {
                    z6 = false;
                    break;
                }
                i8++;
            }
            if (z6) {
                mVar.i(i7);
                return true;
            }
        }
        return false;
    }
}
