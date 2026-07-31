package t1;

import java.io.IOException;
import java.util.ArrayList;
import r0.a2;
import r0.r3;
import t1.x;

/* loaded from: classes.dex */
public final class e extends g<Void> {
    private long A;

    /* renamed from: p, reason: collision with root package name */
    private final x f21987p;

    /* renamed from: q, reason: collision with root package name */
    private final long f21988q;

    /* renamed from: r, reason: collision with root package name */
    private final long f21989r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f21990s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f21991t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f21992u;

    /* renamed from: v, reason: collision with root package name */
    private final ArrayList<d> f21993v;

    /* renamed from: w, reason: collision with root package name */
    private final r3.d f21994w;

    /* renamed from: x, reason: collision with root package name */
    private a f21995x;

    /* renamed from: y, reason: collision with root package name */
    private b f21996y;

    /* renamed from: z, reason: collision with root package name */
    private long f21997z;

    private static final class a extends o {

        /* renamed from: i, reason: collision with root package name */
        private final long f21998i;

        /* renamed from: j, reason: collision with root package name */
        private final long f21999j;

        /* renamed from: k, reason: collision with root package name */
        private final long f22000k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f22001l;

        public a(r3 r3Var, long j7, long j8) {
            super(r3Var);
            boolean z6 = false;
            if (r3Var.m() != 1) {
                throw new b(0);
            }
            r3.d r7 = r3Var.r(0, new r3.d());
            long max = Math.max(0L, j7);
            if (!r7.f20938q && max != 0 && !r7.f20934m) {
                throw new b(1);
            }
            long max2 = j8 == Long.MIN_VALUE ? r7.f20940s : Math.max(0L, j8);
            long j9 = r7.f20940s;
            if (j9 != -9223372036854775807L) {
                max2 = max2 > j9 ? j9 : max2;
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f21998i = max;
            this.f21999j = max2;
            this.f22000k = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (r7.f20935n && (max2 == -9223372036854775807L || (j9 != -9223372036854775807L && max2 == j9))) {
                z6 = true;
            }
            this.f22001l = z6;
        }

        @Override // t1.o, r0.r3
        public r3.b k(int i7, r3.b bVar, boolean z6) {
            this.f22143h.k(0, bVar, z6);
            long q7 = bVar.q() - this.f21998i;
            long j7 = this.f22000k;
            return bVar.v(bVar.f20912f, bVar.f20913g, 0, j7 == -9223372036854775807L ? -9223372036854775807L : j7 - q7, q7);
        }

        @Override // t1.o, r0.r3
        public r3.d s(int i7, r3.d dVar, long j7) {
            this.f22143h.s(0, dVar, 0L);
            long j8 = dVar.f20943v;
            long j9 = this.f21998i;
            dVar.f20943v = j8 + j9;
            dVar.f20940s = this.f22000k;
            dVar.f20935n = this.f22001l;
            long j10 = dVar.f20939r;
            if (j10 != -9223372036854775807L) {
                long max = Math.max(j10, j9);
                dVar.f20939r = max;
                long j11 = this.f21999j;
                if (j11 != -9223372036854775807L) {
                    max = Math.min(max, j11);
                }
                dVar.f20939r = max;
                dVar.f20939r = max - this.f21998i;
            }
            long Y0 = o2.m0.Y0(this.f21998i);
            long j12 = dVar.f20931j;
            if (j12 != -9223372036854775807L) {
                dVar.f20931j = j12 + Y0;
            }
            long j13 = dVar.f20932k;
            if (j13 != -9223372036854775807L) {
                dVar.f20932k = j13 + Y0;
            }
            return dVar;
        }
    }

    public static final class b extends IOException {

        /* renamed from: f, reason: collision with root package name */
        public final int f22002f;

        public b(int i7) {
            super("Illegal clipping: " + a(i7));
            this.f22002f = i7;
        }

        private static String a(int i7) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public e(x xVar, long j7, long j8) {
        this(xVar, j7, j8, true, false, false);
    }

    public e(x xVar, long j7, long j8, boolean z6, boolean z7, boolean z8) {
        o2.a.a(j7 >= 0);
        this.f21987p = (x) o2.a.e(xVar);
        this.f21988q = j7;
        this.f21989r = j8;
        this.f21990s = z6;
        this.f21991t = z7;
        this.f21992u = z8;
        this.f21993v = new ArrayList<>();
        this.f21994w = new r3.d();
    }

    private void Q(r3 r3Var) {
        long j7;
        long j8;
        r3Var.r(0, this.f21994w);
        long g7 = this.f21994w.g();
        if (this.f21995x == null || this.f21993v.isEmpty() || this.f21991t) {
            long j9 = this.f21988q;
            long j10 = this.f21989r;
            if (this.f21992u) {
                long e7 = this.f21994w.e();
                j9 += e7;
                j10 += e7;
            }
            this.f21997z = g7 + j9;
            this.A = this.f21989r != Long.MIN_VALUE ? g7 + j10 : Long.MIN_VALUE;
            int size = this.f21993v.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f21993v.get(i7).w(this.f21997z, this.A);
            }
            j7 = j9;
            j8 = j10;
        } else {
            long j11 = this.f21997z - g7;
            j8 = this.f21989r != Long.MIN_VALUE ? this.A - g7 : Long.MIN_VALUE;
            j7 = j11;
        }
        try {
            a aVar = new a(r3Var, j7, j8);
            this.f21995x = aVar;
            D(aVar);
        } catch (b e8) {
            this.f21996y = e8;
            for (int i8 = 0; i8 < this.f21993v.size(); i8++) {
                this.f21993v.get(i8).o(this.f21996y);
            }
        }
    }

    @Override // t1.g, t1.a
    protected void C(n2.p0 p0Var) {
        super.C(p0Var);
        N(null, this.f21987p);
    }

    @Override // t1.g, t1.a
    protected void E() {
        super.E();
        this.f21996y = null;
        this.f21995x = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t1.g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void L(Void r12, x xVar, r3 r3Var) {
        if (this.f21996y != null) {
            return;
        }
        Q(r3Var);
    }

    @Override // t1.x
    public a2 a() {
        return this.f21987p.a();
    }

    @Override // t1.g, t1.x
    public void c() {
        b bVar = this.f21996y;
        if (bVar != null) {
            throw bVar;
        }
        super.c();
    }

    @Override // t1.x
    public void e(u uVar) {
        o2.a.f(this.f21993v.remove(uVar));
        this.f21987p.e(((d) uVar).f21973f);
        if (!this.f21993v.isEmpty() || this.f21991t) {
            return;
        }
        Q(((a) o2.a.e(this.f21995x)).f22143h);
    }

    @Override // t1.x
    public u j(x.b bVar, n2.b bVar2, long j7) {
        d dVar = new d(this.f21987p.j(bVar, bVar2, j7), this.f21990s, this.f21997z, this.A);
        this.f21993v.add(dVar);
        return dVar;
    }
}
