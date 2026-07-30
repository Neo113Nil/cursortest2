package com.anythink.basead.exoplayer.h;

import android.net.Uri;
import android.os.Handler;
import com.anythink.basead.exoplayer.e.k;
import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.h.x;
import com.anythink.basead.exoplayer.j.t;
import com.anythink.basead.exoplayer.k.C0544a;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
final class n implements com.anythink.basead.exoplayer.e.g, r, x.b, t.a<a>, t.d {

    /* renamed from: a, reason: collision with root package name */
    private static final long f7841a = 10000;

    /* renamed from: A, reason: collision with root package name */
    private af f7842A;

    /* renamed from: C, reason: collision with root package name */
    private boolean[] f7844C;

    /* renamed from: D, reason: collision with root package name */
    private boolean[] f7845D;

    /* renamed from: E, reason: collision with root package name */
    private boolean[] f7846E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f7847F;

    /* renamed from: H, reason: collision with root package name */
    private long f7849H;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f7851K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f7852L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f7853M;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f7854b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.h f7855c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7856d;

    /* renamed from: e, reason: collision with root package name */
    private final t.a f7857e;

    /* renamed from: f, reason: collision with root package name */
    private final c f7858f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.b f7859g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7860h;
    private final long i;

    /* renamed from: k, reason: collision with root package name */
    private final b f7862k;

    /* renamed from: p, reason: collision with root package name */
    private r.a f7867p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.basead.exoplayer.e.k f7868q;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7871t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7872u;

    /* renamed from: v, reason: collision with root package name */
    private int f7873v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7874w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7875x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f7876y;

    /* renamed from: z, reason: collision with root package name */
    private int f7877z;

    /* renamed from: j, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.t f7861j = new com.anythink.basead.exoplayer.j.t("Loader:ExtractorMediaPeriod");

    /* renamed from: l, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.f f7863l = new com.anythink.basead.exoplayer.k.f();

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f7864m = new Runnable() { // from class: com.anythink.basead.exoplayer.h.n.1
        @Override // java.lang.Runnable
        public final void run() {
            n.a(n.this);
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f7865n = new Runnable() { // from class: com.anythink.basead.exoplayer.h.n.2
        @Override // java.lang.Runnable
        public final void run() {
            if (n.this.f7853M) {
                return;
            }
            n.this.f7867p.a((r.a) n.this);
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private final Handler f7866o = new Handler();

    /* renamed from: s, reason: collision with root package name */
    private int[] f7870s = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private x[] f7869r = new x[0];

    /* renamed from: I, reason: collision with root package name */
    private long f7850I = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: G, reason: collision with root package name */
    private long f7848G = -1;

    /* renamed from: B, reason: collision with root package name */
    private long f7843B = com.anythink.basead.exoplayer.b.f6539b;

    public final class a implements t.c {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f7881b;

        /* renamed from: c, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.j.h f7882c;

        /* renamed from: d, reason: collision with root package name */
        private final b f7883d;

        /* renamed from: e, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.k.f f7884e;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f7886g;
        private long i;

        /* renamed from: j, reason: collision with root package name */
        private com.anythink.basead.exoplayer.j.k f7888j;

        /* renamed from: l, reason: collision with root package name */
        private long f7890l;

        /* renamed from: f, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.e.j f7885f = new com.anythink.basead.exoplayer.e.j();

        /* renamed from: h, reason: collision with root package name */
        private boolean f7887h = true;

        /* renamed from: k, reason: collision with root package name */
        private long f7889k = -1;

        public a(Uri uri, com.anythink.basead.exoplayer.j.h hVar, b bVar, com.anythink.basead.exoplayer.k.f fVar) {
            this.f7881b = (Uri) C0544a.a(uri);
            this.f7882c = (com.anythink.basead.exoplayer.j.h) C0544a.a(hVar);
            this.f7883d = (b) C0544a.a(bVar);
            this.f7884e = fVar;
        }

        public final void a(long j9, long j10) {
            this.f7885f.f7332a = j9;
            this.i = j10;
            this.f7887h = true;
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void b() {
            int i = 0;
            while (i == 0 && !this.f7886g) {
                com.anythink.basead.exoplayer.e.b bVar = null;
                try {
                    long j9 = this.f7885f.f7332a;
                    com.anythink.basead.exoplayer.j.k kVar = new com.anythink.basead.exoplayer.j.k(this.f7881b, j9, n.this.f7860h);
                    this.f7888j = kVar;
                    long a9 = this.f7882c.a(kVar);
                    this.f7889k = a9;
                    if (a9 != -1) {
                        this.f7889k = a9 + j9;
                    }
                    com.anythink.basead.exoplayer.e.b bVar2 = new com.anythink.basead.exoplayer.e.b(this.f7882c, j9, this.f7889k);
                    try {
                        com.anythink.basead.exoplayer.e.e a10 = this.f7883d.a(bVar2, this.f7882c.a());
                        if (this.f7887h) {
                            a10.a(j9, this.i);
                            this.f7887h = false;
                        }
                        while (i == 0 && !this.f7886g) {
                            this.f7884e.c();
                            i = a10.a(bVar2, this.f7885f);
                            if (bVar2.c() > n.this.i + j9) {
                                j9 = bVar2.c();
                                this.f7884e.b();
                                n.this.f7866o.post(n.this.f7865n);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f7885f.f7332a = bVar2.c();
                            this.f7890l = this.f7885f.f7332a - this.f7888j.f8296e;
                        }
                        com.anythink.basead.exoplayer.k.af.a(this.f7882c);
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        if (i != 1 && bVar != null) {
                            this.f7885f.f7332a = bVar.c();
                            this.f7890l = this.f7885f.f7332a - this.f7888j.f8296e;
                        }
                        com.anythink.basead.exoplayer.k.af.a(this.f7882c);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.j.t.c
        public final void a() {
            this.f7886g = true;
        }
    }

    public interface c {
        void a(long j9, boolean z8);
    }

    public final class d implements y {

        /* renamed from: b, reason: collision with root package name */
        private final int f7895b;

        public d(int i) {
            this.f7895b = i;
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final boolean b() {
            return n.this.a(this.f7895b);
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final void c() {
            n.this.h();
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z8) {
            return n.this.a(this.f7895b, nVar, eVar, z8);
        }

        @Override // com.anythink.basead.exoplayer.h.y
        public final int a(long j9) {
            return n.this.a(this.f7895b, j9);
        }
    }

    public n(Uri uri, com.anythink.basead.exoplayer.j.h hVar, com.anythink.basead.exoplayer.e.e[] eVarArr, int i, t.a aVar, c cVar, com.anythink.basead.exoplayer.j.b bVar, String str, int i4) {
        this.f7854b = uri;
        this.f7855c = hVar;
        this.f7856d = i;
        this.f7857e = aVar;
        this.f7858f = cVar;
        this.f7859g = bVar;
        this.f7860h = str;
        this.i = i4;
        this.f7862k = new b(eVarArr, this);
        this.f7873v = i == -1 ? 3 : i;
        aVar.a();
    }

    private boolean j() {
        return this.f7875x || o();
    }

    private void k() {
        if (this.f7853M || this.f7872u || this.f7868q == null || !this.f7871t) {
            return;
        }
        for (x xVar : this.f7869r) {
            if (xVar.f() == null) {
                return;
            }
        }
        this.f7863l.b();
        int length = this.f7869r.length;
        ae[] aeVarArr = new ae[length];
        this.f7845D = new boolean[length];
        this.f7844C = new boolean[length];
        this.f7846E = new boolean[length];
        this.f7843B = this.f7868q.b();
        int i = 0;
        while (true) {
            boolean z8 = true;
            if (i >= length) {
                break;
            }
            com.anythink.basead.exoplayer.m f6 = this.f7869r[i].f();
            aeVarArr[i] = new ae(f6);
            String str = f6.f8822h;
            if (!com.anythink.basead.exoplayer.k.o.b(str) && !com.anythink.basead.exoplayer.k.o.a(str)) {
                z8 = false;
            }
            this.f7845D[i] = z8;
            this.f7847F = z8 | this.f7847F;
            i++;
        }
        this.f7842A = new af(aeVarArr);
        if (this.f7856d == -1 && this.f7848G == -1 && this.f7868q.b() == com.anythink.basead.exoplayer.b.f6539b) {
            this.f7873v = 6;
        }
        this.f7872u = true;
        this.f7858f.a(this.f7843B, this.f7868q.a());
        this.f7867p.a((r) this);
    }

    private void l() {
        a aVar = new a(this.f7854b, this.f7855c, this.f7862k, this.f7863l);
        if (this.f7872u) {
            C0544a.b(o());
            long j9 = this.f7843B;
            if (j9 != com.anythink.basead.exoplayer.b.f6539b && this.f7850I >= j9) {
                this.f7852L = true;
                this.f7850I = com.anythink.basead.exoplayer.b.f6539b;
                return;
            } else {
                aVar.a(this.f7868q.a(this.f7850I).f7333a.f7339c, this.f7850I);
                this.f7850I = com.anythink.basead.exoplayer.b.f6539b;
            }
        }
        this.f7851K = m();
        this.f7857e.a(aVar.f7888j, 1, -1, null, 0, null, aVar.i, this.f7843B, this.f7861j.a(aVar, this, this.f7873v));
    }

    private int m() {
        int i = 0;
        for (x xVar : this.f7869r) {
            i += xVar.b();
        }
        return i;
    }

    private long n() {
        long j9 = Long.MIN_VALUE;
        for (x xVar : this.f7869r) {
            j9 = Math.max(j9, xVar.g());
        }
        return j9;
    }

    private boolean o() {
        return this.f7850I != com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ int a(a aVar, long j9, long j10, IOException iOException) {
        com.anythink.basead.exoplayer.e.k kVar;
        a aVar2 = aVar;
        boolean z8 = iOException instanceof ag;
        this.f7857e.a(aVar2.f7888j, 1, -1, null, 0, null, aVar2.i, this.f7843B, j9, j10, aVar2.f7890l, iOException, z8);
        a(aVar2);
        if (z8) {
            return 3;
        }
        int m8 = m();
        boolean z9 = m8 > this.f7851K;
        if (this.f7848G == -1 && ((kVar = this.f7868q) == null || kVar.b() == com.anythink.basead.exoplayer.b.f6539b)) {
            if (this.f7872u && !j()) {
                this.J = true;
                return 2;
            }
            this.f7875x = this.f7872u;
            this.f7849H = 0L;
            this.f7851K = 0;
            for (x xVar : this.f7869r) {
                xVar.a();
            }
            aVar2.a(0L, 0L);
        } else {
            this.f7851K = m8;
        }
        return z9 ? 1 : 0;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j9) {
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void c_() {
        this.f7871t = true;
        this.f7866o.post(this.f7864m);
    }

    public final void h() {
        this.f7861j.a(this.f7873v);
    }

    @Override // com.anythink.basead.exoplayer.h.x.b
    public final void i() {
        this.f7866o.post(this.f7864m);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f7842A;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j9) {
        if (this.f7852L || this.J) {
            return false;
        }
        if (this.f7872u && this.f7877z == 0) {
            return false;
        }
        boolean a9 = this.f7863l.a();
        if (this.f7861j.a()) {
            return a9;
        }
        l();
        return true;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        long n9;
        if (this.f7852L) {
            return Long.MIN_VALUE;
        }
        if (o()) {
            return this.f7850I;
        }
        if (this.f7847F) {
            int length = this.f7869r.length;
            n9 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (this.f7845D[i]) {
                    n9 = Math.min(n9, this.f7869r[i].g());
                }
            }
        } else {
            n9 = n();
        }
        return n9 == Long.MIN_VALUE ? this.f7849H : n9;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        if (this.f7877z == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    public final void f() {
        if (this.f7872u) {
            for (x xVar : this.f7869r) {
                xVar.j();
            }
        }
        this.f7861j.a(this);
        this.f7866o.removeCallbacksAndMessages(null);
        this.f7867p = null;
        this.f7853M = true;
        this.f7857e.b();
    }

    @Override // com.anythink.basead.exoplayer.j.t.d
    public final void g() {
        for (x xVar : this.f7869r) {
            xVar.a();
        }
        this.f7862k.a();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j9) {
        if (!this.f7868q.a()) {
            j9 = 0;
        }
        this.f7849H = j9;
        this.f7875x = false;
        if (o() || !d(j9)) {
            this.J = false;
            this.f7850I = j9;
            this.f7852L = false;
            if (this.f7861j.a()) {
                this.f7861j.b();
                return j9;
            }
            for (x xVar : this.f7869r) {
                xVar.a();
            }
        }
        return j9;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        if (!this.f7876y) {
            this.f7857e.c();
            this.f7876y = true;
        }
        if (!this.f7875x) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        if (!this.f7852L && m() <= this.f7851K) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        this.f7875x = false;
        return this.f7849H;
    }

    private void c(int i) {
        if (this.J && this.f7845D[i] && !this.f7869r[i].c()) {
            this.f7850I = 0L;
            this.J = false;
            this.f7875x = true;
            this.f7849H = 0L;
            this.f7851K = 0;
            for (x xVar : this.f7869r) {
                xVar.a();
            }
            this.f7867p.a((r.a) this);
        }
    }

    private boolean d(long j9) {
        int length = this.f7869r.length;
        for (int i = 0; i < length; i++) {
            x xVar = this.f7869r[i];
            xVar.i();
            if (xVar.a(j9, false) == -1 && (this.f7845D[i] || !this.f7847F)) {
                return false;
            }
        }
        return true;
    }

    private void b(int i) {
        if (this.f7846E[i]) {
            return;
        }
        com.anythink.basead.exoplayer.m a9 = this.f7842A.a(i).a(0);
        this.f7857e.a(com.anythink.basead.exoplayer.k.o.d(a9.f8822h), a9, 0, (Object) null, this.f7849H);
        this.f7846E[i] = true;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.e.e[] f7891a;

        /* renamed from: b, reason: collision with root package name */
        private final com.anythink.basead.exoplayer.e.g f7892b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.basead.exoplayer.e.e f7893c;

        public b(com.anythink.basead.exoplayer.e.e[] eVarArr, com.anythink.basead.exoplayer.e.g gVar) {
            this.f7891a = eVarArr;
            this.f7892b = gVar;
        }

        public final com.anythink.basead.exoplayer.e.e a(com.anythink.basead.exoplayer.e.f fVar, Uri uri) {
            com.anythink.basead.exoplayer.e.e eVar = this.f7893c;
            if (eVar != null) {
                return eVar;
            }
            com.anythink.basead.exoplayer.e.e[] eVarArr = this.f7891a;
            int length = eVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.anythink.basead.exoplayer.e.e eVar2 = eVarArr[i];
                try {
                    if (eVar2.a(fVar)) {
                        this.f7893c = eVar2;
                        fVar.a();
                        break;
                    }
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    fVar.a();
                    throw th;
                }
                fVar.a();
                i++;
            }
            com.anythink.basead.exoplayer.e.e eVar3 = this.f7893c;
            if (eVar3 == null) {
                throw new ag(AbstractC5051n.g(new StringBuilder("None of the available extractors ("), com.anythink.basead.exoplayer.k.af.a(this.f7891a), ") could read the stream."), uri);
            }
            eVar3.a(this.f7892b);
            return this.f7893c;
        }

        public final void a() {
            if (this.f7893c != null) {
                this.f7893c = null;
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(a aVar, long j9, long j10) {
        a aVar2 = aVar;
        if (this.f7843B == com.anythink.basead.exoplayer.b.f6539b) {
            long n9 = n();
            long j11 = n9 == Long.MIN_VALUE ? 0L : n9 + f7841a;
            this.f7843B = j11;
            this.f7858f.a(j11, this.f7868q.a());
        }
        this.f7857e.a(aVar2.f7888j, 1, -1, null, 0, null, aVar2.i, this.f7843B, j9, j10, aVar2.f7890l);
        a(aVar2);
        this.f7852L = true;
        this.f7867p.a((r.a) this);
    }

    @Override // com.anythink.basead.exoplayer.j.t.a
    public final /* synthetic */ void a(a aVar, long j9, long j10, boolean z8) {
        a aVar2 = aVar;
        this.f7857e.b(aVar2.f7888j, 1, -1, null, 0, null, aVar2.i, this.f7843B, j9, j10, aVar2.f7890l);
        if (z8) {
            return;
        }
        a(aVar2);
        for (x xVar : this.f7869r) {
            xVar.a();
        }
        if (this.f7877z > 0) {
            this.f7867p.a((r.a) this);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j9) {
        this.f7867p = aVar;
        this.f7863l.a();
        l();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        h();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j9) {
        com.anythink.basead.exoplayer.i.f fVar;
        C0544a.b(this.f7872u);
        int i = this.f7877z;
        int i4 = 0;
        for (int i9 = 0; i9 < fVarArr.length; i9++) {
            y yVar = yVarArr[i9];
            if (yVar != null && (fVarArr[i9] == null || !zArr[i9])) {
                int i10 = ((d) yVar).f7895b;
                C0544a.b(this.f7844C[i10]);
                this.f7877z--;
                this.f7844C[i10] = false;
                yVarArr[i9] = null;
            }
        }
        boolean z8 = !this.f7874w ? j9 == 0 : i != 0;
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            if (yVarArr[i11] == null && (fVar = fVarArr[i11]) != null) {
                C0544a.b(fVar.g() == 1);
                C0544a.b(fVar.b(0) == 0);
                int a9 = this.f7842A.a(fVar.f());
                C0544a.b(!this.f7844C[a9]);
                this.f7877z++;
                this.f7844C[a9] = true;
                yVarArr[i11] = new d(a9);
                zArr2[i11] = true;
                if (!z8) {
                    x xVar = this.f7869r[a9];
                    xVar.i();
                    z8 = xVar.a(j9, true) == -1 && xVar.e() != 0;
                }
            }
        }
        if (this.f7877z == 0) {
            this.J = false;
            this.f7875x = false;
            if (this.f7861j.a()) {
                x[] xVarArr = this.f7869r;
                int length = xVarArr.length;
                while (i4 < length) {
                    xVarArr[i4].j();
                    i4++;
                }
                this.f7861j.b();
            } else {
                x[] xVarArr2 = this.f7869r;
                int length2 = xVarArr2.length;
                while (i4 < length2) {
                    xVarArr2[i4].a();
                    i4++;
                }
            }
        } else if (z8) {
            j9 = b(j9);
            while (i4 < yVarArr.length) {
                if (yVarArr[i4] != null) {
                    zArr2[i4] = true;
                }
                i4++;
            }
        }
        this.f7874w = true;
        return j9;
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j9, boolean z8) {
        int length = this.f7869r.length;
        for (int i = 0; i < length; i++) {
            this.f7869r[i].a(j9, z8, this.f7844C[i]);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j9, com.anythink.basead.exoplayer.ac acVar) {
        if (!this.f7868q.a()) {
            return 0L;
        }
        k.a a9 = this.f7868q.a(j9);
        return com.anythink.basead.exoplayer.k.af.a(j9, acVar, a9.f7333a.f7338b, a9.f7334b.f7338b);
    }

    public final boolean a(int i) {
        if (j()) {
            return false;
        }
        return this.f7852L || this.f7869r[i].c();
    }

    public final int a(int i, com.anythink.basead.exoplayer.n nVar, com.anythink.basead.exoplayer.c.e eVar, boolean z8) {
        if (j()) {
            return -3;
        }
        int a9 = this.f7869r[i].a(nVar, eVar, z8, this.f7852L, this.f7849H);
        if (a9 == -4) {
            b(i);
            return a9;
        }
        if (a9 == -3) {
            c(i);
        }
        return a9;
    }

    public final int a(int i, long j9) {
        int i4 = 0;
        if (j()) {
            return 0;
        }
        x xVar = this.f7869r[i];
        if (this.f7852L && j9 > xVar.g()) {
            i4 = xVar.k();
        } else {
            int a9 = xVar.a(j9, true);
            if (a9 != -1) {
                i4 = a9;
            }
        }
        if (i4 > 0) {
            b(i);
            return i4;
        }
        c(i);
        return i4;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(a aVar, long j9, long j10) {
        if (this.f7843B == com.anythink.basead.exoplayer.b.f6539b) {
            long n9 = n();
            long j11 = n9 == Long.MIN_VALUE ? 0L : n9 + f7841a;
            this.f7843B = j11;
            this.f7858f.a(j11, this.f7868q.a());
        }
        this.f7857e.a(aVar.f7888j, 1, -1, null, 0, null, aVar.i, this.f7843B, j9, j10, aVar.f7890l);
        a(aVar);
        this.f7852L = true;
        this.f7867p.a((r.a) this);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(a aVar, long j9, long j10, boolean z8) {
        this.f7857e.b(aVar.f7888j, 1, -1, null, 0, null, aVar.i, this.f7843B, j9, j10, aVar.f7890l);
        if (z8) {
            return;
        }
        a(aVar);
        for (x xVar : this.f7869r) {
            xVar.a();
        }
        if (this.f7877z > 0) {
            this.f7867p.a((r.a) this);
        }
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final com.anythink.basead.exoplayer.e.m a(int i, int i4) {
        int length = this.f7869r.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (this.f7870s[i9] == i) {
                return this.f7869r[i9];
            }
        }
        x xVar = new x(this.f7859g);
        xVar.a(this);
        int i10 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f7870s, i10);
        this.f7870s = copyOf;
        copyOf[length] = i;
        x[] xVarArr = (x[]) Arrays.copyOf(this.f7869r, i10);
        this.f7869r = xVarArr;
        xVarArr[length] = xVar;
        return xVar;
    }

    @Override // com.anythink.basead.exoplayer.e.g
    public final void a(com.anythink.basead.exoplayer.e.k kVar) {
        this.f7868q = kVar;
        this.f7866o.post(this.f7864m);
    }

    private void a(a aVar) {
        if (this.f7848G == -1) {
            this.f7848G = aVar.f7889k;
        }
    }

    private boolean a(a aVar, int i) {
        com.anythink.basead.exoplayer.e.k kVar;
        if (this.f7848G == -1 && ((kVar = this.f7868q) == null || kVar.b() == com.anythink.basead.exoplayer.b.f6539b)) {
            if (this.f7872u && !j()) {
                this.J = true;
                return false;
            }
            this.f7875x = this.f7872u;
            this.f7849H = 0L;
            this.f7851K = 0;
            for (x xVar : this.f7869r) {
                xVar.a();
            }
            aVar.a(0L, 0L);
            return true;
        }
        this.f7851K = i;
        return true;
    }

    private static boolean a(IOException iOException) {
        return iOException instanceof ag;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private int a2(a aVar, long j9, long j10, IOException iOException) {
        com.anythink.basead.exoplayer.e.k kVar;
        boolean z8 = iOException instanceof ag;
        this.f7857e.a(aVar.f7888j, 1, -1, null, 0, null, aVar.i, this.f7843B, j9, j10, aVar.f7890l, iOException, z8);
        a(aVar);
        if (z8) {
            return 3;
        }
        int m8 = m();
        boolean z9 = m8 > this.f7851K;
        if (this.f7848G == -1 && ((kVar = this.f7868q) == null || kVar.b() == com.anythink.basead.exoplayer.b.f6539b)) {
            if (this.f7872u && !j()) {
                this.J = true;
                return 2;
            }
            this.f7875x = this.f7872u;
            this.f7849H = 0L;
            this.f7851K = 0;
            for (x xVar : this.f7869r) {
                xVar.a();
            }
            aVar.a(0L, 0L);
        } else {
            this.f7851K = m8;
        }
        return z9 ? 1 : 0;
    }

    public static /* synthetic */ void a(n nVar) {
        if (nVar.f7853M || nVar.f7872u || nVar.f7868q == null || !nVar.f7871t) {
            return;
        }
        for (x xVar : nVar.f7869r) {
            if (xVar.f() == null) {
                return;
            }
        }
        nVar.f7863l.b();
        int length = nVar.f7869r.length;
        ae[] aeVarArr = new ae[length];
        nVar.f7845D = new boolean[length];
        nVar.f7844C = new boolean[length];
        nVar.f7846E = new boolean[length];
        nVar.f7843B = nVar.f7868q.b();
        int i = 0;
        while (true) {
            boolean z8 = true;
            if (i >= length) {
                break;
            }
            com.anythink.basead.exoplayer.m f6 = nVar.f7869r[i].f();
            aeVarArr[i] = new ae(f6);
            String str = f6.f8822h;
            if (!com.anythink.basead.exoplayer.k.o.b(str) && !com.anythink.basead.exoplayer.k.o.a(str)) {
                z8 = false;
            }
            nVar.f7845D[i] = z8;
            nVar.f7847F = z8 | nVar.f7847F;
            i++;
        }
        nVar.f7842A = new af(aeVarArr);
        if (nVar.f7856d == -1 && nVar.f7848G == -1 && nVar.f7868q.b() == com.anythink.basead.exoplayer.b.f6539b) {
            nVar.f7873v = 6;
        }
        nVar.f7872u = true;
        nVar.f7858f.a(nVar.f7843B, nVar.f7868q.a());
        nVar.f7867p.a((r) nVar);
    }
}
