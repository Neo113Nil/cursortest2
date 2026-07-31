package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import com.yandex.mobile.ads.impl.et1;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.lr0;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.p52;
import com.yandex.mobile.ads.impl.pr0;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.uh0;
import com.yandex.mobile.ads.impl.w30;
import com.yandex.mobile.ads.impl.xv0;
import com.yandex.mobile.ads.impl.yb0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class yl1 implements xv0, r70, pr0.a<a>, pr0.e, et1.c {

    /* renamed from: N, reason: collision with root package name */
    private static final Map<String, String> f35178N;

    /* renamed from: O, reason: collision with root package name */
    private static final yb0 f35179O;

    /* renamed from: B, reason: collision with root package name */
    private boolean f35181B;

    /* renamed from: D, reason: collision with root package name */
    private boolean f35183D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f35184E;

    /* renamed from: F, reason: collision with root package name */
    private int f35185F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f35186G;

    /* renamed from: H, reason: collision with root package name */
    private long f35187H;

    /* renamed from: J, reason: collision with root package name */
    private boolean f35189J;

    /* renamed from: K, reason: collision with root package name */
    private int f35190K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f35191L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f35192M;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f35193b;

    /* renamed from: c, reason: collision with root package name */
    private final iv f35194c;

    /* renamed from: d, reason: collision with root package name */
    private final x30 f35195d;

    /* renamed from: e, reason: collision with root package name */
    private final lr0 f35196e;

    /* renamed from: f, reason: collision with root package name */
    private final ew0.a f35197f;

    /* renamed from: g, reason: collision with root package name */
    private final w30.a f35198g;

    /* renamed from: h, reason: collision with root package name */
    private final b f35199h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC2250tc f35200i;

    /* renamed from: j, reason: collision with root package name */
    private final String f35201j;

    /* renamed from: k, reason: collision with root package name */
    private final long f35202k;

    /* renamed from: m, reason: collision with root package name */
    private final xl1 f35204m;

    /* renamed from: r, reason: collision with root package name */
    private xv0.a f35209r;

    /* renamed from: s, reason: collision with root package name */
    private wh0 f35210s;

    /* renamed from: v, reason: collision with root package name */
    private boolean f35213v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f35214w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f35215x;

    /* renamed from: y, reason: collision with root package name */
    private e f35216y;

    /* renamed from: z, reason: collision with root package name */
    private tw1 f35217z;

    /* renamed from: l, reason: collision with root package name */
    private final pr0 f35203l = new pr0("ProgressiveMediaPeriod");

    /* renamed from: n, reason: collision with root package name */
    private final vq f35205n = new vq();

    /* renamed from: o, reason: collision with root package name */
    private final Runnable f35206o = new Runnable() { // from class: com.yandex.mobile.ads.impl.Xl
        @Override // java.lang.Runnable
        public final void run() {
            yl1.this.f();
        }
    };

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f35207p = new Runnable() { // from class: com.yandex.mobile.ads.impl.Yl
        @Override // java.lang.Runnable
        public final void run() {
            yl1.this.d();
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final Handler f35208q = u82.a();

    /* renamed from: u, reason: collision with root package name */
    private d[] f35212u = new d[0];

    /* renamed from: t, reason: collision with root package name */
    private et1[] f35211t = new et1[0];

    /* renamed from: I, reason: collision with root package name */
    private long f35188I = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    private long f35180A = -9223372036854775807L;

    /* renamed from: C, reason: collision with root package name */
    private int f35182C = 1;

    final class a implements pr0.d, uh0.a {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f35218a;

        /* renamed from: b, reason: collision with root package name */
        private final h22 f35219b;

        /* renamed from: c, reason: collision with root package name */
        private final xl1 f35220c;

        /* renamed from: d, reason: collision with root package name */
        private final r70 f35221d;

        /* renamed from: e, reason: collision with root package name */
        private final vq f35222e;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f35224g;

        /* renamed from: i, reason: collision with root package name */
        private long f35226i;

        /* renamed from: j, reason: collision with root package name */
        private mv f35227j;

        /* renamed from: k, reason: collision with root package name */
        private et1 f35228k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f35229l;

        /* renamed from: f, reason: collision with root package name */
        private final hj1 f35223f = new hj1();

        /* renamed from: h, reason: collision with root package name */
        private boolean f35225h = true;

        public a(Uri uri, iv ivVar, xl1 xl1Var, r70 r70Var, vq vqVar) {
            this.f35218a = uri;
            this.f35219b = new h22(ivVar);
            this.f35220c = xl1Var;
            this.f35221d = r70Var;
            this.f35222e = vqVar;
            mr0.a();
            this.f35227j = a(0L);
        }

        @Override // com.yandex.mobile.ads.impl.pr0.d
        public final void a() {
            iv ivVar;
            int i4;
            int i5 = 0;
            while (i5 == 0 && !this.f35224g) {
                try {
                    long j4 = this.f35223f.f26771a;
                    mv a4 = a(j4);
                    this.f35227j = a4;
                    long a5 = this.f35219b.a(a4);
                    if (a5 != -1) {
                        a5 += j4;
                        yl1.this.g();
                    }
                    long j5 = a5;
                    yl1.this.f35210s = wh0.a(this.f35219b.getResponseHeaders());
                    h22 h22Var = this.f35219b;
                    wh0 wh0Var = yl1.this.f35210s;
                    if (wh0Var == null || (i4 = wh0Var.f34070g) == -1) {
                        ivVar = h22Var;
                    } else {
                        ivVar = new uh0(h22Var, i4, this);
                        yl1 yl1Var = yl1.this;
                        yl1Var.getClass();
                        et1 a6 = yl1Var.a(new d(true, 0));
                        this.f35228k = a6;
                        a6.a(yl1.f35179O);
                    }
                    ((C2328wl) this.f35220c).a(ivVar, this.f35218a, this.f35219b.getResponseHeaders(), j4, j5, this.f35221d);
                    if (yl1.this.f35210s != null) {
                        ((C2328wl) this.f35220c).a();
                    }
                    if (this.f35225h) {
                        ((C2328wl) this.f35220c).a(j4, this.f35226i);
                        this.f35225h = false;
                    }
                    while (i5 == 0 && !this.f35224g) {
                        try {
                            this.f35222e.a();
                            i5 = ((C2328wl) this.f35220c).a(this.f35223f);
                            long b4 = ((C2328wl) this.f35220c).b();
                            if (b4 > yl1.this.f35202k + j4) {
                                this.f35222e.c();
                                yl1 yl1Var2 = yl1.this;
                                yl1Var2.f35208q.post(yl1Var2.f35207p);
                                j4 = b4;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i5 == 1) {
                        i5 = 0;
                    } else if (((C2328wl) this.f35220c).b() != -1) {
                        this.f35223f.f26771a = ((C2328wl) this.f35220c).b();
                    }
                    lv.a(this.f35219b);
                } catch (Throwable th) {
                    if (i5 != 1 && ((C2328wl) this.f35220c).b() != -1) {
                        this.f35223f.f26771a = ((C2328wl) this.f35220c).b();
                    }
                    lv.a(this.f35219b);
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.pr0.d
        public final void b() {
            this.f35224g = true;
        }

        public final void a(sf1 sf1Var) {
            long max;
            if (this.f35229l) {
                max = Math.max(yl1.this.a(true), this.f35226i);
            } else {
                max = this.f35226i;
            }
            long j4 = max;
            int a4 = sf1Var.a();
            et1 et1Var = this.f35228k;
            et1Var.getClass();
            et1Var.b(a4, sf1Var);
            et1Var.a(j4, 1, a4, 0, (p52.a) null);
            this.f35229l = true;
        }

        private mv a(long j4) {
            return new mv.a().a(this.f35218a).b(j4).a(yl1.this.f35201j).a(6).a(yl1.f35178N).a();
        }
    }

    interface b {
    }

    private final class c implements ft1 {

        /* renamed from: a, reason: collision with root package name */
        private final int f35231a;

        public c(int i4) {
            this.f35231a = i4;
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final boolean d() {
            yl1 yl1Var = yl1.this;
            return !yl1Var.f35184E && yl1Var.f35188I == -9223372036854775807L && yl1Var.f35211t[this.f35231a].a(yl1Var.f35191L);
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final void a() {
            yl1 yl1Var = yl1.this;
            yl1Var.f35211t[this.f35231a].g();
            yl1Var.f35203l.a(yl1Var.f35196e.a(yl1Var.f35182C));
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final int a(zb0 zb0Var, gy gyVar, int i4) {
            yl1 yl1Var = yl1.this;
            int i5 = this.f35231a;
            if (yl1Var.f35184E || yl1Var.f35188I != -9223372036854775807L) {
                return -3;
            }
            yl1Var.c();
            e eVar = yl1Var.f35216y;
            boolean[] zArr = eVar.f35238d;
            if (!zArr[i5]) {
                yb0 a4 = eVar.f35235a.a(i5).a(0);
                yl1Var.f35197f.a(i01.c(a4.f34991m), a4, yl1Var.f35187H);
                zArr[i5] = true;
            }
            int a5 = yl1Var.f35211t[i5].a(zb0Var, gyVar, i4, yl1Var.f35191L);
            if (a5 == -3) {
                yl1Var.a(i5);
            }
            return a5;
        }

        @Override // com.yandex.mobile.ads.impl.ft1
        public final int a(long j4) {
            yl1 yl1Var = yl1.this;
            int i4 = this.f35231a;
            if (yl1Var.f35184E || yl1Var.f35188I != -9223372036854775807L) {
                return 0;
            }
            yl1Var.c();
            e eVar = yl1Var.f35216y;
            boolean[] zArr = eVar.f35238d;
            if (!zArr[i4]) {
                yb0 a4 = eVar.f35235a.a(i4).a(0);
                yl1Var.f35197f.a(i01.c(a4.f34991m), a4, yl1Var.f35187H);
                zArr[i4] = true;
            }
            et1 et1Var = yl1Var.f35211t[i4];
            int a5 = et1Var.a(j4, yl1Var.f35191L);
            et1Var.d(a5);
            if (a5 == 0) {
                yl1Var.a(i4);
            }
            return a5;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f35233a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35234b;

        public d(boolean z4, int i4) {
            this.f35233a = i4;
            this.f35234b = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f35233a == dVar.f35233a && this.f35234b == dVar.f35234b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f35233a * 31) + (this.f35234b ? 1 : 0);
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final o52 f35235a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f35236b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f35237c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f35238d;

        public e(o52 o52Var, boolean[] zArr) {
            this.f35235a = o52Var;
            this.f35236b = zArr;
            int i4 = o52Var.f29912b;
            this.f35237c = new boolean[i4];
            this.f35238d = new boolean[i4];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f35178N = Collections.unmodifiableMap(hashMap);
        f35179O = new yb0.a().b("icy").e("application/x-icy").a();
    }

    public yl1(Uri uri, iv ivVar, xl1 xl1Var, x30 x30Var, w30.a aVar, lr0 lr0Var, ew0.a aVar2, b bVar, InterfaceC2250tc interfaceC2250tc, String str, int i4) {
        this.f35193b = uri;
        this.f35194c = ivVar;
        this.f35195d = x30Var;
        this.f35198g = aVar;
        this.f35196e = lr0Var;
        this.f35197f = aVar2;
        this.f35199h = bVar;
        this.f35200i = interfaceC2250tc;
        this.f35201j = str;
        this.f35202k = i4;
        this.f35204m = xl1Var;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean continueLoading(long j4) {
        if (this.f35191L || this.f35203l.c() || this.f35189J) {
            return false;
        }
        if (this.f35214w && this.f35185F == 0) {
            return false;
        }
        boolean e4 = this.f35205n.e();
        if (this.f35203l.d()) {
            return e4;
        }
        j();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final void discardBuffer(long j4, boolean z4) {
        c();
        if (this.f35188I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.f35216y.f35237c;
        int length = this.f35211t.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f35211t[i4].a(j4, z4, zArr[i4]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getBufferedPositionUs() {
        long j4;
        c();
        if (this.f35191L || this.f35185F == 0) {
            return Long.MIN_VALUE;
        }
        long j5 = this.f35188I;
        if (j5 != -9223372036854775807L) {
            return j5;
        }
        if (this.f35215x) {
            int length = this.f35211t.length;
            j4 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < length; i4++) {
                e eVar = this.f35216y;
                if (eVar.f35236b[i4] && eVar.f35237c[i4] && !this.f35211t[i4].f()) {
                    j4 = Math.min(j4, this.f35211t[i4].b());
                }
            }
        } else {
            j4 = Long.MAX_VALUE;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = a(false);
        }
        return j4 == Long.MIN_VALUE ? this.f35187H : j4;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final o52 getTrackGroups() {
        c();
        return this.f35216y.f35235a;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final boolean isLoading() {
        return this.f35203l.d() && this.f35205n.d();
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final void maybeThrowPrepareError() {
        this.f35203l.a(this.f35196e.a(this.f35182C));
        if (this.f35191L && !this.f35214w) {
            throw wf1.a("Loading finished before preparation is complete.", (Exception) null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final long readDiscontinuity() {
        if (!this.f35184E) {
            return -9223372036854775807L;
        }
        if (!this.f35191L) {
            int i4 = 0;
            for (et1 et1Var : this.f35211t) {
                i4 += et1Var.e();
            }
            if (i4 <= this.f35190K) {
                return -9223372036854775807L;
            }
        }
        this.f35184E = false;
        return this.f35187H;
    }

    @Override // com.yandex.mobile.ads.impl.bx1
    public final void reevaluateBuffer(long j4) {
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final long seekToUs(long j4) {
        int i4;
        c();
        boolean[] zArr = this.f35216y.f35236b;
        if (!this.f35217z.b()) {
            j4 = 0;
        }
        this.f35184E = false;
        this.f35187H = j4;
        if (this.f35188I != -9223372036854775807L) {
            this.f35188I = j4;
            return j4;
        }
        if (this.f35182C != 7) {
            int length = this.f35211t.length;
            for (0; i4 < length; i4 + 1) {
                i4 = (this.f35211t[i4].b(j4, false) || (!zArr[i4] && this.f35215x)) ? i4 + 1 : 0;
            }
            return j4;
        }
        this.f35189J = false;
        this.f35188I = j4;
        this.f35191L = false;
        if (this.f35203l.d()) {
            for (et1 et1Var : this.f35211t) {
                et1Var.a();
            }
            this.f35203l.a();
            return j4;
        }
        this.f35203l.b();
        for (et1 et1Var2 : this.f35211t) {
            et1Var2.b(false);
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(tw1 tw1Var) {
        this.f35217z = this.f35210s == null ? tw1Var : new tw1.b(-9223372036854775807L, 0L);
        this.f35180A = tw1Var.c();
        boolean z4 = !this.f35186G && tw1Var.c() == -9223372036854775807L;
        this.f35181B = z4;
        this.f35182C = z4 ? 7 : 1;
        ((am1) this.f35199h).a(this.f35180A, tw1Var.b(), this.f35181B);
        if (this.f35214w) {
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!this.f35214w) {
            throw new IllegalStateException();
        }
        this.f35216y.getClass();
        this.f35217z.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f35192M) {
            return;
        }
        xv0.a aVar = this.f35209r;
        aVar.getClass();
        aVar.a((xv0.a) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f35186G = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f35192M || this.f35214w || !this.f35213v || this.f35217z == null) {
            return;
        }
        for (et1 et1Var : this.f35211t) {
            if (et1Var.d() == null) {
                return;
            }
        }
        this.f35205n.c();
        int length = this.f35211t.length;
        n52[] n52VarArr = new n52[length];
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            yb0 d4 = this.f35211t[i4].d();
            d4.getClass();
            String str = d4.f34991m;
            boolean d5 = i01.d(str);
            boolean z4 = d5 || i01.f(str);
            zArr[i4] = z4;
            this.f35215x = z4 | this.f35215x;
            wh0 wh0Var = this.f35210s;
            if (wh0Var != null) {
                if (d5 || this.f35212u[i4].f35234b) {
                    wz0 wz0Var = d4.f34989k;
                    d4 = d4.a().a(wz0Var == null ? new wz0(wh0Var) : wz0Var.a(wh0Var)).a();
                }
                if (d5 && d4.f34985g == -1 && d4.f34986h == -1 && wh0Var.f34065b != -1) {
                    d4 = d4.a().b(wh0Var.f34065b).a();
                }
            }
            n52VarArr[i4] = new n52(Integer.toString(i4), d4.a(this.f35195d.a(d4)));
        }
        this.f35216y = new e(new o52(n52VarArr), zArr);
        this.f35214w = true;
        xv0.a aVar = this.f35209r;
        aVar.getClass();
        aVar.a((xv0) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f35208q.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Am
            @Override // java.lang.Runnable
            public final void run() {
                yl1.this.e();
            }
        });
    }

    private void j() {
        a aVar = new a(this.f35193b, this.f35194c, this.f35204m, this, this.f35205n);
        if (this.f35214w) {
            long j4 = this.f35188I;
            if (j4 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j5 = this.f35180A;
            if (j5 != -9223372036854775807L && j4 > j5) {
                this.f35191L = true;
                this.f35188I = -9223372036854775807L;
                return;
            }
            tw1 tw1Var = this.f35217z;
            tw1Var.getClass();
            long j6 = tw1Var.b(this.f35188I).f32717a.f33816b;
            long j7 = this.f35188I;
            aVar.f35223f.f26771a = j6;
            aVar.f35226i = j7;
            aVar.f35225h = true;
            aVar.f35229l = false;
            for (et1 et1Var : this.f35211t) {
                et1Var.a(this.f35188I);
            }
            this.f35188I = -9223372036854775807L;
        }
        int i4 = 0;
        for (et1 et1Var2 : this.f35211t) {
            i4 += et1Var2.e();
        }
        this.f35190K = i4;
        this.f35203l.a(aVar, this, this.f35196e.a(this.f35182C));
        mv mvVar = aVar.f35227j;
        ew0.a aVar2 = this.f35197f;
        Uri uri = mvVar.f29239a;
        aVar2.b(new mr0(), (yb0) null, aVar.f35226i, this.f35180A);
    }

    @Override // com.yandex.mobile.ads.impl.r70
    public final void a() {
        this.f35213v = true;
        this.f35208q.post(this.f35206o);
    }

    public final void h() {
        this.f35208q.post(this.f35206o);
    }

    public final void i() {
        if (this.f35214w) {
            for (et1 et1Var : this.f35211t) {
                et1Var.h();
            }
        }
        this.f35203l.a(this);
        this.f35208q.removeCallbacksAndMessages(null);
        this.f35209r = null;
        this.f35192M = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[RETURN] */
    @Override // com.yandex.mobile.ads.impl.xv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j4, uw1 uw1Var) {
        c();
        if (!this.f35217z.b()) {
            return 0L;
        }
        tw1.a b4 = this.f35217z.b(j4);
        long j5 = b4.f32717a.f33815a;
        long j6 = b4.f32718b.f33815a;
        long j7 = uw1Var.f33436a;
        if (j7 == 0 && uw1Var.f33437b == 0) {
            return j4;
        }
        int i4 = u82.f32873a;
        long j8 = j4 - j7;
        if (((j7 ^ j4) & (j4 ^ j8)) < 0) {
            j8 = Long.MIN_VALUE;
        }
        long j9 = uw1Var.f33437b;
        long j10 = j4 + j9;
        if (((j9 ^ j10) & (j4 ^ j10)) < 0) {
            j10 = Long.MAX_VALUE;
        }
        boolean z4 = false;
        boolean z5 = j8 <= j5 && j5 <= j10;
        if (j8 <= j6 && j6 <= j10) {
            z4 = true;
        }
        if (!z5 || !z4) {
            if (!z5) {
                return z4 ? j6 : j8;
            }
            return j5;
        }
        if (Math.abs(j5 - j4) <= Math.abs(j6 - j4)) {
            return j5;
        }
    }

    @Override // com.yandex.mobile.ads.impl.pr0.e
    public final void b() {
        for (et1 et1Var : this.f35211t) {
            et1Var.i();
        }
        ((C2328wl) this.f35204m).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(boolean z4) {
        int i4;
        long j4 = Long.MIN_VALUE;
        while (i4 < this.f35211t.length) {
            if (!z4) {
                e eVar = this.f35216y;
                eVar.getClass();
                i4 = eVar.f35237c[i4] ? 0 : i4 + 1;
            }
            j4 = Math.max(j4, this.f35211t[i4].b());
        }
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i4) {
        c();
        boolean[] zArr = this.f35216y.f35236b;
        if (this.f35189J && zArr[i4] && !this.f35211t[i4].a(false)) {
            this.f35188I = 0L;
            this.f35189J = false;
            this.f35184E = true;
            this.f35187H = 0L;
            this.f35190K = 0;
            for (et1 et1Var : this.f35211t) {
                et1Var.b(false);
            }
            xv0.a aVar = this.f35209r;
            aVar.getClass();
            aVar.a((xv0.a) this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.pr0.a
    public final void a(a aVar, long j4, long j5, boolean z4) {
        a aVar2 = aVar;
        aVar2.f35219b.getClass();
        mr0 mr0Var = new mr0();
        this.f35196e.getClass();
        this.f35197f.a(mr0Var, aVar2.f35226i, this.f35180A);
        if (z4) {
            return;
        }
        for (et1 et1Var : this.f35211t) {
            et1Var.b(false);
        }
        if (this.f35185F > 0) {
            xv0.a aVar3 = this.f35209r;
            aVar3.getClass();
            aVar3.a((xv0.a) this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.pr0.a
    public final void a(a aVar, long j4, long j5) {
        tw1 tw1Var;
        a aVar2 = aVar;
        if (this.f35180A == -9223372036854775807L && (tw1Var = this.f35217z) != null) {
            boolean b4 = tw1Var.b();
            long a4 = a(true);
            long j6 = a4 == Long.MIN_VALUE ? 0L : a4 + 10000;
            this.f35180A = j6;
            ((am1) this.f35199h).a(j6, b4, this.f35181B);
        }
        aVar2.f35219b.getClass();
        mr0 mr0Var = new mr0();
        this.f35196e.getClass();
        this.f35197f.a(mr0Var, (yb0) null, aVar2.f35226i, this.f35180A);
        this.f35191L = true;
        xv0.a aVar3 = this.f35209r;
        aVar3.getClass();
        aVar3.a((xv0.a) this);
    }

    @Override // com.yandex.mobile.ads.impl.pr0.a
    public final pr0.b a(a aVar, long j4, long j5, IOException iOException, int i4) {
        pr0.b a4;
        tw1 tw1Var;
        a aVar2 = aVar;
        aVar2.f35219b.getClass();
        mr0 mr0Var = new mr0();
        u82.b(aVar2.f35226i);
        u82.b(this.f35180A);
        long a5 = this.f35196e.a(new lr0.a(iOException, i4));
        if (a5 == -9223372036854775807L) {
            a4 = pr0.f30537e;
        } else {
            int i5 = 0;
            for (et1 et1Var : this.f35211t) {
                i5 += et1Var.e();
            }
            boolean z4 = i5 > this.f35190K;
            if (!this.f35186G && ((tw1Var = this.f35217z) == null || tw1Var.c() == -9223372036854775807L)) {
                boolean z5 = this.f35214w;
                if (z5 && !this.f35184E && this.f35188I == -9223372036854775807L) {
                    this.f35189J = true;
                    a4 = pr0.f30536d;
                } else {
                    this.f35184E = z5;
                    this.f35187H = 0L;
                    this.f35190K = 0;
                    for (et1 et1Var2 : this.f35211t) {
                        et1Var2.b(false);
                    }
                    aVar2.f35223f.f26771a = 0L;
                    aVar2.f35226i = 0L;
                    aVar2.f35225h = true;
                    aVar2.f35229l = false;
                }
            } else {
                this.f35190K = i5;
            }
            a4 = pr0.a(a5, z4);
        }
        boolean a6 = a4.a();
        this.f35197f.a(mr0Var, 1, null, aVar2.f35226i, this.f35180A, iOException, !a6);
        if (!a6) {
            this.f35196e.getClass();
        }
        return a4;
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final void a(xv0.a aVar, long j4) {
        this.f35209r = aVar;
        this.f35205n.e();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public et1 a(d dVar) {
        int length = this.f35211t.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (dVar.equals(this.f35212u[i4])) {
                return this.f35211t[i4];
            }
        }
        InterfaceC2250tc interfaceC2250tc = this.f35200i;
        x30 x30Var = this.f35195d;
        w30.a aVar = this.f35198g;
        x30Var.getClass();
        aVar.getClass();
        et1 et1Var = new et1(interfaceC2250tc, x30Var, aVar);
        et1Var.a(this);
        int i5 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f35212u, i5);
        dVarArr[length] = dVar;
        this.f35212u = dVarArr;
        et1[] et1VarArr = (et1[]) Arrays.copyOf(this.f35211t, i5);
        et1VarArr[length] = et1Var;
        this.f35211t = et1VarArr;
        return et1Var;
    }

    @Override // com.yandex.mobile.ads.impl.r70
    public final void a(final tw1 tw1Var) {
        this.f35208q.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.Zl
            @Override // java.lang.Runnable
            public final void run() {
                yl1.this.b(tw1Var);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.xv0
    public final long a(x60[] x60VarArr, boolean[] zArr, ft1[] ft1VarArr, boolean[] zArr2, long j4) {
        x60 x60Var;
        c();
        e eVar = this.f35216y;
        o52 o52Var = eVar.f35235a;
        boolean[] zArr3 = eVar.f35237c;
        int i4 = this.f35185F;
        int i5 = 0;
        for (int i6 = 0; i6 < x60VarArr.length; i6++) {
            ft1 ft1Var = ft1VarArr[i6];
            if (ft1Var != null && (x60VarArr[i6] == null || !zArr[i6])) {
                int i7 = ((c) ft1Var).f35231a;
                if (zArr3[i7]) {
                    this.f35185F--;
                    zArr3[i7] = false;
                    ft1VarArr[i6] = null;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        boolean z4 = !this.f35183D ? j4 == 0 : i4 != 0;
        for (int i8 = 0; i8 < x60VarArr.length; i8++) {
            if (ft1VarArr[i8] == null && (x60Var = x60VarArr[i8]) != null) {
                if (x60Var.b() == 1) {
                    if (x60Var.b(0) == 0) {
                        int a4 = o52Var.a(x60Var.a());
                        if (!zArr3[a4]) {
                            this.f35185F++;
                            zArr3[a4] = true;
                            ft1VarArr[i8] = new c(a4);
                            zArr2[i8] = true;
                            if (!z4) {
                                et1 et1Var = this.f35211t[a4];
                                z4 = (et1Var.b(j4, true) || et1Var.c() == 0) ? false : true;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        if (this.f35185F == 0) {
            this.f35189J = false;
            this.f35184E = false;
            if (this.f35203l.d()) {
                et1[] et1VarArr = this.f35211t;
                int length = et1VarArr.length;
                while (i5 < length) {
                    et1VarArr[i5].a();
                    i5++;
                }
                this.f35203l.a();
            } else {
                for (et1 et1Var2 : this.f35211t) {
                    et1Var2.b(false);
                }
            }
        } else if (z4) {
            j4 = seekToUs(j4);
            while (i5 < ft1VarArr.length) {
                if (ft1VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
                i5++;
            }
        }
        this.f35183D = true;
        return j4;
    }

    @Override // com.yandex.mobile.ads.impl.r70
    public final p52 a(int i4, int i5) {
        return a(new d(false, i4));
    }
}
