package com.anythink.core.common;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATRequestingInfo;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IATAdFilter;
import com.anythink.core.common.a.c;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.al;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cb;
import com.anythink.core.common.j;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.w.a.a;
import com.anythink.core.mg.api.MgComparedResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class g {

    /* renamed from: A, reason: collision with root package name */
    boolean f13331A;

    /* renamed from: G, reason: collision with root package name */
    protected com.anythink.core.common.t.b f13337G;

    /* renamed from: I, reason: collision with root package name */
    com.anythink.core.common.w.g f13339I;
    c.a J;

    /* renamed from: M, reason: collision with root package name */
    bv f13342M;

    /* renamed from: N, reason: collision with root package name */
    double f13343N;

    /* renamed from: P, reason: collision with root package name */
    bv f13345P;

    /* renamed from: T, reason: collision with root package name */
    private h f13349T;

    /* renamed from: b, reason: collision with root package name */
    protected WeakReference<Context> f13351b;

    /* renamed from: c, reason: collision with root package name */
    protected int f13352c;

    /* renamed from: e, reason: collision with root package name */
    protected cb f13354e;

    /* renamed from: f, reason: collision with root package name */
    protected String f13355f;

    /* renamed from: g, reason: collision with root package name */
    protected String f13356g;

    /* renamed from: h, reason: collision with root package name */
    Map<String, Object> f13357h;
    com.anythink.core.common.h.n i;

    /* renamed from: j, reason: collision with root package name */
    protected ar f13358j;

    /* renamed from: k, reason: collision with root package name */
    protected com.anythink.core.common.d.c f13359k;

    /* renamed from: o, reason: collision with root package name */
    boolean f13363o;

    /* renamed from: p, reason: collision with root package name */
    boolean f13364p;

    /* renamed from: s, reason: collision with root package name */
    String f13367s;

    /* renamed from: u, reason: collision with root package name */
    long f13369u;

    /* renamed from: v, reason: collision with root package name */
    int f13370v;

    /* renamed from: w, reason: collision with root package name */
    int f13371w;

    /* renamed from: R, reason: collision with root package name */
    private final String f13347R = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    protected String f13353d = "";

    /* renamed from: l, reason: collision with root package name */
    boolean f13360l = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f13361m = false;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f13362n = false;

    /* renamed from: q, reason: collision with root package name */
    boolean f13365q = false;

    /* renamed from: r, reason: collision with root package name */
    boolean f13366r = false;

    /* renamed from: x, reason: collision with root package name */
    Object f13372x = new Object();

    /* renamed from: y, reason: collision with root package name */
    bv f13373y = null;

    /* renamed from: z, reason: collision with root package name */
    boolean f13374z = false;

    /* renamed from: B, reason: collision with root package name */
    bv f13332B = null;

    /* renamed from: C, reason: collision with root package name */
    bv f13333C = null;

    /* renamed from: F, reason: collision with root package name */
    protected com.anythink.core.common.t.b f13336F = null;

    /* renamed from: L, reason: collision with root package name */
    protected com.anythink.core.common.t.b f13341L = new com.anythink.core.common.t.b() { // from class: com.anythink.core.common.g.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.g.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.a();
                }
            });
        }
    };

    /* renamed from: O, reason: collision with root package name */
    boolean f13344O = false;

    /* renamed from: Q, reason: collision with root package name */
    boolean f13346Q = false;

    /* renamed from: a, reason: collision with root package name */
    protected Context f13350a = com.anythink.core.common.d.t.b().g();

    /* renamed from: t, reason: collision with root package name */
    AdError f13368t = ErrorCode.getErrorCode(ErrorCode.noADError, "", "");

    /* renamed from: D, reason: collision with root package name */
    protected Map<String, com.anythink.core.common.w.e> f13334D = new ConcurrentHashMap();

    /* renamed from: E, reason: collision with root package name */
    List<bv> f13335E = Collections.synchronizedList(new ArrayList(3));

    /* renamed from: H, reason: collision with root package name */
    com.anythink.core.common.w.j f13338H = new com.anythink.core.common.w.j();

    /* renamed from: K, reason: collision with root package name */
    List<ATBaseAdAdapter> f13340K = new ArrayList();

    /* renamed from: S, reason: collision with root package name */
    private final com.anythink.core.mg.a.a f13348S = new com.anythink.core.mg.a.a();

    /* renamed from: com.anythink.core.common.g$3, reason: invalid class name */
    public class AnonymousClass3 implements com.anythink.core.common.t.b {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f13336F = null;
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.g.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.j();
                }
            }, 2);
        }
    }

    /* renamed from: com.anythink.core.common.g$4, reason: invalid class name */
    public class AnonymousClass4 implements com.anythink.core.common.t.b {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.p();
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f13415a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f13416b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f13417c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f13418d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f13419e = 5;
    }

    public g(Context context) {
        this.f13351b = new WeakReference<>(context);
    }

    private synchronized boolean A() {
        if (this.f13339I.c() == 0) {
            if (this.f13339I.d() == 0) {
                return true;
            }
        }
        return false;
    }

    private void B() {
        if (this.f13341L != null) {
            com.anythink.core.common.t.d.a().b(this.f13341L);
        }
    }

    private com.anythink.core.common.h.c C() {
        com.anythink.core.common.h.c a9 = com.anythink.core.common.a.a().a(this.f13350a, this.f13356g);
        if (a9 != null) {
            return a9;
        }
        c.a aVar = this.J;
        return aVar != null ? aVar.a() : a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.f13340K.size() == 0) {
            return;
        }
        synchronized (this.f13340K) {
            try {
                Iterator<ATBaseAdAdapter> it = this.f13340K.iterator();
                while (it.hasNext()) {
                    it.next().destory();
                }
                this.f13340K.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void E() {
        if (this.f13339I.u()) {
            List<bv> b9 = this.f13339I.b(1);
            if (b9.size() > 0) {
                a(b9, 1);
            }
        }
    }

    public static /* synthetic */ boolean a(int i) {
        return i == 3 || i == 5;
    }

    private static boolean b(int i) {
        return i == 3 || i == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        try {
            com.anythink.core.common.h.c C7 = C();
            this.f13366r = true;
            if (this.f13362n || C7 == null) {
                return;
            }
            bv unitGroupInfo = C7.e() != null ? C7.e().getUnitGroupInfo() : null;
            a(unitGroupInfo, com.anythink.core.common.v.p.a(unitGroupInfo), true);
            a(9, unitGroupInfo);
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void k() {
        if (this.f13363o) {
            this.f13339I.b(this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r4.f13338H.b() == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x0027, B:7:0x0031, B:10:0x004a, B:12:0x0058, B:13:0x0067, B:15:0x006e, B:20:0x0074, B:22:0x003a, B:24:0x0042), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void l() {
        try {
            bv a9 = this.f13339I.a(false);
            bv s3 = s();
            this.f13339I.m();
            this.f13354e.g();
            com.anythink.core.common.v.l.a(a9, s3);
            this.f13338H.c();
            this.f13338H.b();
            if (this.f13360l) {
                if (this.f13371w >= this.f13354e.g()) {
                    if (com.anythink.core.common.v.l.a(a9, s3) > 0) {
                    }
                    this.f13363o = true;
                    k();
                    if (this.f13339I.m() == 0) {
                        com.anythink.core.common.w.g.a(this.f13350a, this.f13356g);
                        com.anythink.core.common.w.g.a(this.f13356g);
                        r();
                    }
                    q();
                    if (!this.f13363o || z()) {
                        r();
                    }
                }
            }
            if (!this.f13338H.c()) {
            }
            this.f13363o = true;
            k();
            if (this.f13339I.m() == 0) {
            }
            q();
            if (!this.f13363o) {
            }
            r();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void m() {
        if (this.J != null) {
            com.anythink.core.common.h.n af = this.i.af();
            aj.a(af, this.J.d(), 0, true);
            this.J.a(this.f13355f, af);
        }
    }

    private void n() {
        if (this.f13354e.i() >= 0) {
            this.f13336F = new AnonymousClass3();
            this.f13354e.i();
            com.anythink.core.common.t.d.a().a(this.f13336F, this.f13354e.i(), false);
        }
    }

    private com.anythink.core.common.t.b o() {
        return new AnonymousClass4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p() {
        if (!this.f13362n && this.f13339I.e() > 0) {
            this.f13337G = null;
            bv f6 = this.f13339I.f();
            f6.toString();
            this.f13339I.a(f6);
            this.f13339I.e();
            this.f13339I.o();
            b(f6, 2);
        }
    }

    private synchronized void q() {
        final ad R8;
        if (!this.f13338H.g() && this.f13338H.e()) {
            if (this.f13338H.b()) {
                return;
            }
            if (this.i.ah()) {
                return;
            }
            final bv b9 = this.f13339I.b(this.f13360l);
            if (b9 != null && (R8 = b9.R()) != null) {
                this.f13338H.h();
                com.anythink.core.mg.a.a aVar = this.f13348S;
                if (aVar != null) {
                    MgComparedResult a9 = aVar.a();
                    if (a9 == null) {
                        this.f13348S.a(new com.anythink.core.mg.a.b() { // from class: com.anythink.core.common.g.7
                            @Override // com.anythink.core.mg.a.b
                            public final void a(MgComparedResult mgComparedResult) {
                                g.b(R8, b9, mgComparedResult);
                            }
                        });
                        return;
                    } else {
                        b(R8, b9, a9);
                        return;
                    }
                }
                b(R8, b9, null);
            }
            return;
        }
        this.f13338H.g();
        this.f13338H.e();
    }

    private synchronized void r() {
        if (!this.f13338H.e()) {
            this.f13338H.e();
        } else {
            if (this.f13338H.b()) {
                return;
            }
            this.f13339I.a(this.i.af());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bv s() {
        bv bvVar;
        if (this.f13354e.j() == 2) {
            synchronized (this.f13334D) {
                bvVar = com.anythink.core.common.w.g.a(this.f13334D);
            }
        } else {
            bvVar = null;
        }
        bv v6 = this.f13339I.v();
        return com.anythink.core.common.v.l.a(bvVar, v6) < 0 ? bvVar : v6;
    }

    private synchronized void t() {
        this.f13339I.h();
        if (this.f13337G != null) {
            com.anythink.core.common.t.d.a().b(this.f13337G);
            this.f13337G = null;
        }
    }

    private synchronized boolean u() {
        if (this.f13339I.k()) {
            return false;
        }
        if (this.f13338H.c()) {
            return false;
        }
        bv bvVar = this.f13373y;
        if (bvVar != null && bvVar.br()) {
            return false;
        }
        this.f13338H.f();
        this.f13346Q = true;
        List<bv> l9 = this.f13339I.l();
        this.f13339I.b(l9);
        a(8, l9, new j.a() { // from class: com.anythink.core.common.g.9
            @Override // com.anythink.core.common.j.a
            public final void a(String str) {
            }

            @Override // com.anythink.core.common.j.a
            public final void a(String str, List<bv> list, List<bv> list2, boolean z8) {
                for (bv bvVar2 : list) {
                    g.this.d(bvVar2);
                    bvVar2.C(8);
                    g.this.f13339I.a(bvVar2);
                    g.this.b(bvVar2, 3);
                }
                if (list2 != null) {
                    Iterator<bv> it = list2.iterator();
                    while (it.hasNext()) {
                        g.this.b(it.next());
                    }
                }
                g gVar = g.this;
                gVar.f13346Q = false;
                gVar.c((com.anythink.core.common.w.e) null);
            }
        });
        return true;
    }

    private synchronized void v() {
        if (this.f13360l) {
            if (this.f13338H.c()) {
                return;
            }
            bv bvVar = this.f13373y;
            if (bvVar == null || !bvVar.br()) {
                List<bv> list = this.f13335E;
                if (list != null && list.size() != 0) {
                    if (this.f13364p) {
                        return;
                    }
                    this.f13364p = true;
                    a(7, this.f13335E, new j.a() { // from class: com.anythink.core.common.g.10
                        @Override // com.anythink.core.common.j.a
                        public final void a(String str) {
                        }

                        @Override // com.anythink.core.common.j.a
                        public final void a(String str, List<bv> list2, List<bv> list3, boolean z8) {
                            if (g.this.f13338H.c()) {
                                String unused = g.this.f13347R;
                                for (bv bvVar2 : list2) {
                                    g.this.f13339I.e(bvVar2);
                                    com.anythink.core.common.w.g.b(bvVar2, g.this.i);
                                }
                                return;
                            }
                            g gVar = g.this;
                            if (gVar.f13371w < gVar.f13354e.g()) {
                                String unused2 = g.this.f13347R;
                                g.this.a(list2, (List<bv>) null, (List<bv>) null, list3);
                                g.this.l();
                                return;
                            }
                            String unused3 = g.this.f13347R;
                            bv a9 = g.this.f13339I.a(false);
                            int size = list2.size();
                            ArrayList arrayList = new ArrayList(size);
                            ArrayList arrayList2 = new ArrayList(size);
                            for (int i = 0; i < size; i++) {
                                bv bvVar3 = list2.get(i);
                                g.this.f13339I.e(bvVar3);
                                if (com.anythink.core.common.v.l.a(bvVar3, a9) < 0) {
                                    arrayList.add(bvVar3);
                                } else {
                                    arrayList2.add(bvVar3);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                bv bvVar4 = (bv) it.next();
                                g.this.d(bvVar4);
                                bvVar4.C(7);
                                g.this.f13339I.a(bvVar4);
                                g.this.b(bvVar4, 5);
                            }
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                com.anythink.core.common.w.g.b((bv) it2.next(), g.this.i);
                            }
                        }
                    });
                }
            }
        }
    }

    private boolean w() {
        if (this.f13337G == null || !A()) {
            return false;
        }
        com.anythink.core.common.t.d.a().b(this.f13337G);
        this.f13337G.run();
        this.f13337G = null;
        return true;
    }

    private void x() {
        f((bv) null);
    }

    private void y() {
        com.anythink.core.common.h.c C7 = C();
        if (C7 == null) {
            f((bv) null);
            return;
        }
        bv unitGroupInfo = C7.e() != null ? C7.e().getUnitGroupInfo() : null;
        a(unitGroupInfo, com.anythink.core.common.v.p.a(unitGroupInfo), true);
        a(9, unitGroupInfo);
    }

    private synchronized boolean z() {
        this.f13339I.c();
        this.f13339I.d();
        this.f13339I.e();
        this.f13339I.i();
        Objects.toString(this.f13373y);
        Objects.toString(this.f13345P);
        Objects.toString(this.f13333C);
        return this.f13339I.t();
    }

    public final c.a h() {
        return this.J;
    }

    public final com.anythink.core.d.l i() {
        return this.f13354e.a();
    }

    /* renamed from: com.anythink.core.common.g$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.core.common.w.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ bv f13388a;

        public AnonymousClass6(bv bvVar) {
            this.f13388a = bvVar;
        }

        @Override // com.anythink.core.common.w.c
        public final void a(com.anythink.core.common.h.n nVar) {
            com.anythink.core.common.u.c.a(g.this.f13350a).a(1, nVar);
            ab.a(nVar, j.r.f12686a, j.r.f12699o, "");
        }

        @Override // com.anythink.core.common.w.c
        public final void a(com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
            g.a(g.this, nVar, aTBaseAdAdapter);
            if (this.f13388a.aJ() == 1) {
                g.a(g.this, aTBaseAdAdapter);
            }
        }

        @Override // com.anythink.core.common.w.c
        public final void a(ATBaseAdAdapter aTBaseAdAdapter, String str) {
            g.this.a(aTBaseAdAdapter, str);
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, String str2) {
            g.this.a(str);
            if (this.f13388a.aJ() == 1) {
                g.this.D();
            }
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, com.anythink.core.common.h.c cVar) {
            g.this.a(str, aTBaseAdAdapter, cVar.f(), bvVar);
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
            IATAdFilter q6 = com.anythink.core.common.d.t.b().q(g.this.f13356g);
            BaseAd baseAd = (baseAdArr == null || baseAdArr.length <= 0) ? null : baseAdArr[0];
            if (q6 != null && q6.isAdFilter(com.anythink.core.common.d.l.a(aTBaseAdAdapter, 3), baseAd)) {
                com.anythink.core.common.w.b bVar = new com.anythink.core.common.w.b();
                bVar.f17186c = 8;
                bVar.f17188e = aTBaseAdAdapter.getTrackingInfo().ab();
                bVar.f17187d = ErrorCode.getErrorCode(ErrorCode.adSourceNotFilledError, "", "");
                bVar.f17189f = aTBaseAdAdapter.getTrackingInfo();
                bVar.f17190g = aTBaseAdAdapter.getUnitGroupInfo();
                g.this.a(str, bVar);
            } else {
                g.this.a(str, aTBaseAdAdapter, baseAdArr != null ? Arrays.asList(baseAdArr) : null);
            }
            if (this.f13388a.aJ() == 1) {
                g.b(g.this, aTBaseAdAdapter);
            }
        }

        @Override // com.anythink.core.common.w.c
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, com.anythink.core.common.w.b bVar) {
            g.this.a(str, bVar);
            if (aTBaseAdAdapter == null || aTBaseAdAdapter.getUnitGroupInfo() == null) {
                return;
            }
            aTBaseAdAdapter.getUnitGroupInfo();
            if (this.f13388a.aJ() == 1) {
                g.b(g.this, aTBaseAdAdapter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(bv bvVar) {
        this.f13339I.d(bvVar);
        com.anythink.core.common.w.g.a(this.f13350a, this.f13356g, this.f13355f, null, bvVar);
        this.f13339I.e(bvVar);
        this.f13339I.c(bvVar);
        g(bvVar);
    }

    private synchronized void e(bv bvVar) {
        bvVar.z();
        if (this.f13338H.b()) {
            return;
        }
        if (this.i.ah()) {
            return;
        }
        com.anythink.core.common.w.g.i(bvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(bv bvVar) {
        this.f13362n = true;
        this.f13361m = false;
        if (this.f13341L != null) {
            com.anythink.core.common.t.d.a().b(this.f13341L);
        }
        com.anythink.core.common.u.e.a(this.i.af(), this.f13368t, bvVar);
        if (!this.f13344O) {
            a(this.f13368t);
        }
        f();
    }

    public final void g() {
        List<com.anythink.core.common.w.f> j9 = this.f13339I.j();
        synchronized (j9) {
            try {
                if (j9.size() > 0) {
                    bv a9 = j9.remove(0).a();
                    if (this.f13362n) {
                        if (this.f13371w >= this.f13354e.g()) {
                            if (com.anythink.core.common.v.l.a(a9, this.f13373y) < 0) {
                            }
                        }
                    }
                    this.f13339I.a(a9);
                    b(a9, 4);
                }
                if (j9.size() > 0) {
                    for (com.anythink.core.common.w.f fVar : j9) {
                        bv a10 = fVar.a();
                        if (!this.f13362n || this.f13371w < this.f13354e.g() || com.anythink.core.common.v.l.a(a10, this.f13373y) < 0) {
                            int b9 = fVar.b();
                            if (b9 == 1) {
                                a(a10, 1);
                                c(b9);
                            } else if (b9 == 2) {
                                a(a10, 2);
                                c(b9);
                            } else if (b9 == 3) {
                                this.f13339I.a(a10);
                                b(a10, 3);
                            }
                        }
                    }
                }
                j9.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        l();
    }

    private synchronized void c(int i) {
        int o9;
        try {
            if (i != 2) {
                o9 = this.f13339I.n();
            } else {
                o9 = this.f13339I.o();
            }
            if (o9 == 0) {
                a(this.f13339I.b(i), i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(bv bvVar) {
        this.f13368t.putNetworkErrorMsg(bvVar.z(), bvVar.g(), bvVar.h(), ErrorCode.getErrorCode(ErrorCode.noADError, "", bvVar.F()));
        this.f13339I.c(bvVar);
    }

    private void c(bv bvVar) {
        if (bvVar != null) {
            try {
                if (bvVar.g() == 22) {
                    this.f13339I.f(bvVar);
                    com.anythink.core.common.w.g.a(bvVar, this.i);
                }
            } catch (Exception unused) {
            }
        }
    }

    private synchronized void d(com.anythink.core.common.w.e eVar) {
        bv bvVar;
        ATRequestingInfo aTRequestingInfo;
        if (this.f13344O) {
            ar arVar = this.f13358j;
            if (arVar != null) {
                arVar.f13707f = null;
            }
            return;
        }
        ar arVar2 = this.f13358j;
        if (arVar2 != null && arVar2.f13707f != null) {
            boolean z8 = true;
            if (this.f13332B == null) {
                bvVar = this.f13373y;
            } else if (eVar == null || eVar.f() == null || eVar.c() == null) {
                z8 = false;
                bvVar = null;
            } else {
                bv f6 = eVar.f();
                if (com.anythink.core.common.v.l.a(f6, this.f13332B) < 0) {
                    if (eVar.c().booleanValue()) {
                        eVar.f().z();
                        com.anythink.core.common.v.p.a(f6);
                        bvVar = f6;
                    } else {
                        eVar.f().z();
                        com.anythink.core.common.v.p.a(f6);
                    }
                }
                z8 = false;
                bvVar = f6;
            }
            if (z8) {
                this.f13332B = bvVar;
                aTRequestingInfo = this.f13339I.d(bvVar, this.i);
                if (aTRequestingInfo != null) {
                    this.f13358j.f13707f.onAdMultipleLoaded(aTRequestingInfo);
                }
            } else {
                aTRequestingInfo = null;
            }
            if (aTRequestingInfo == null && this.f13339I.a(this.f13360l, this.f13332B)) {
                this.f13358j.f13707f.onAdMultipleLoaded(null);
                this.f13358j.f13707f = null;
            }
        }
    }

    public final void b() {
        long a9 = this.f13339I.a(this.f13360l, this.f13354e.a().K());
        if (a9 > -1) {
            this.f13337G = new AnonymousClass4();
        }
        if (this.f13339I.g() && this.f13360l) {
            u();
        }
        a(this.f13339I.s(), 1);
        if (this.f13337G != null) {
            com.anythink.core.common.t.d.a().a(this.f13337G, a9, false);
        }
        if (this.J != null) {
            com.anythink.core.common.h.n af = this.i.af();
            aj.a(af, this.J.d(), 0, true);
            this.J.a(this.f13355f, af);
        }
    }

    public final void e() {
        synchronized (this.f13372x) {
            this.f13360l = true;
            this.f13365q = true;
            c((com.anythink.core.common.w.e) null);
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r2.f13366r != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r2.f13362n != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        a(-1, r2.f13373y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x001a, code lost:
    
        if (com.anythink.core.common.v.l.a(r2.f13373y, r0) > 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void c(com.anythink.core.common.w.e eVar) {
        try {
            bv s3 = s();
            if (this.f13374z) {
                if (!this.f13360l) {
                    if (this.f13365q) {
                    }
                }
            } else if (this.f13360l) {
                if (this.f13346Q) {
                    return;
                }
                if (this.f13337G != null && A()) {
                    com.anythink.core.common.t.d.a().b(this.f13337G);
                    this.f13337G.run();
                    this.f13337G = null;
                } else if (z() && !this.f13362n) {
                    y();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        ConcurrentHashMap concurrentHashMap;
        try {
            this.f13338H.a();
            synchronized (this.f13334D) {
                concurrentHashMap = new ConcurrentHashMap(this.f13334D);
            }
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.anythink.core.common.w.e eVar = (com.anythink.core.common.w.e) ((Map.Entry) it.next()).getValue();
                if (eVar != null) {
                    eVar.b();
                }
            }
            if (!this.f13362n) {
                this.f13362n = true;
                y();
            }
            l();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f() {
        this.f13344O = true;
        u a9 = u.a();
        String str = this.f13356g;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13354e.a().aq());
        f a10 = a9.a(str, sb.toString());
        if (a10 != null) {
            a10.a(this.f13355f);
            return;
        }
        com.anythink.basead.b.c.i.v("AdManage is null--notifycancel", "Id:" + this.f13356g + "--format:" + this.f13354e.a().aq());
    }

    private void e(int i) {
        com.anythink.core.d.l a9;
        ab.a("Mediation", "placementId:" + this.f13356g + ";result_callback:success;loadType:" + this.f13358j.f13704c + ";");
        v.a(this.f13350a).a(this.f13356g, this.f13355f, true);
        ar arVar = this.f13358j;
        if (arVar != null && arVar.f13706e != null) {
            try {
                cb cbVar = this.f13354e;
                if (cbVar != null && (a9 = cbVar.a()) != null) {
                    try {
                        u a10 = u.a();
                        String str = this.f13356g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f13354e.a().aq());
                        if (a10.a(str, sb.toString()) != null) {
                            f.a(a9, this.i);
                            f.b(a9, this.i);
                        }
                    } catch (com.anythink.core.common.h.m e6) {
                        ar arVar2 = this.f13358j;
                        arVar2.f13706e.a(1, arVar2, this.f13354e, e6.f14145a);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            d((com.anythink.core.common.w.e) null);
            ar arVar3 = this.f13358j;
            arVar3.f13706e.a(this.f13331A ? 1 : 2, arVar3, this.f13354e, i);
            this.f13358j.f13706e = null;
        }
        com.anythink.core.c.b.a().a(this.f13356g, this.f13355f, this.f13354e.a().ay(), this.f13358j, this.f13339I.b().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final bv bvVar, final int i) {
        final com.anythink.core.common.w.e eVar = new com.anythink.core.common.w.e(bvVar, i);
        final String a9 = eVar.a();
        this.f13334D.put(a9, eVar);
        this.f13339I.a(1, i);
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.g.5
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                synchronized (g.this) {
                    try {
                        if (g.this.f13338H.b()) {
                            g.this.f13334D.remove(a9);
                            return;
                        }
                        if (ak.a(bvVar) && TextUtils.isEmpty(u.a().a(g.this.f13356g, bvVar.g()))) {
                            u.a().a(g.this.f13356g, bvVar.g(), bvVar.k());
                        }
                        boolean a10 = g.a(i);
                        com.anythink.core.common.h.n af = g.this.i.af();
                        if (a10) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(bvVar.g());
                            str = sb.toString();
                        } else {
                            str = g.this.f13367s;
                        }
                        af.s(str);
                        aj.a(af, bvVar, g.this.f13370v, true);
                        af.o(SystemClock.elapsedRealtime() - g.this.f13369u);
                        if (g.this.a(af, bvVar, i, a9)) {
                            return;
                        }
                        String unused = g.this.f13347R;
                        bvVar.toString();
                        boolean a11 = com.anythink.core.common.w.g.a(g.this.f13356g, bvVar, af);
                        g.this.f13370v++;
                        if (a11) {
                            com.anythink.core.common.w.b bVar = new com.anythink.core.common.w.b();
                            bVar.f17186c = 6;
                            bVar.f17187d = ErrorCode.getErrorCode(ErrorCode.noADError, "", "Bid result has expired.");
                            bVar.f17188e = 0L;
                            bVar.f17189f = af;
                            bVar.f17190g = bvVar;
                            g.this.a(a9, bVar);
                            return;
                        }
                        int ao = bvVar.ao();
                        if (ao > 0) {
                            af.f14182t = ao;
                        } else {
                            g gVar = g.this;
                            if (gVar.f13361m && gVar.f13371w < gVar.f13354e.g()) {
                                af.f14182t = 5;
                            }
                        }
                        g.a(g.this, eVar, af, bvVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    private void a(Map<String, Object> map) {
        this.f13357h = map;
    }

    private void a(com.anythink.core.common.h.n nVar) {
        this.i = nVar;
    }

    private void b(com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.d.c cVar = this.f13359k;
        if (cVar != null) {
            cVar.onAdSourceLoadFilled(nVar);
        }
        a(nVar, (AdError) null, a.b.f17142b, aTBaseAdAdapter.getUnitGroupInfo());
        com.anythink.core.common.v.d.a().a(nVar, aTBaseAdAdapter.getUnitGroupInfo(), 4);
    }

    public final void a(com.anythink.core.common.d.c cVar) {
        this.f13359k = cVar;
    }

    public final void a(ar arVar) {
        this.f13358j = arVar;
    }

    private synchronized void a(List<bv> list, int i) {
        if (!this.f13338H.b() && !this.f13338H.c() && list != null && list.size() != 0) {
            this.f13339I.a(list);
            this.f13339I.d();
            Iterator<bv> it = list.iterator();
            while (it.hasNext()) {
                b(it.next(), i);
            }
        }
    }

    public final boolean c() {
        if (this.f13362n) {
            return true;
        }
        return this.f13360l && this.f13339I.c() == 0 && this.f13339I.m() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(ad adVar, bv bvVar, MgComparedResult mgComparedResult) {
        int i;
        if (mgComparedResult != null) {
            if (mgComparedResult.isMgWin()) {
                i = 0;
            } else if (mgComparedResult.isCompared()) {
                i = 34;
            }
            if (i <= 0) {
                com.anythink.core.b.d.c.a(adVar, bvVar, i);
                return;
            }
            return;
        }
        i = 2;
        if (i <= 0) {
        }
    }

    private void d(int i) {
        com.anythink.core.d.l a9;
        u();
        if (this.f13344O) {
            return;
        }
        ab.a("Mediation", "placementId:" + this.f13356g + ";result_callback:success;loadType:" + this.f13358j.f13704c + ";");
        v.a(this.f13350a).a(this.f13356g, this.f13355f, true);
        ar arVar = this.f13358j;
        if (arVar != null && arVar.f13706e != null) {
            try {
                cb cbVar = this.f13354e;
                if (cbVar != null && (a9 = cbVar.a()) != null) {
                    try {
                        u a10 = u.a();
                        String str = this.f13356g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f13354e.a().aq());
                        if (a10.a(str, sb.toString()) != null) {
                            f.a(a9, this.i);
                            f.b(a9, this.i);
                        }
                    } catch (com.anythink.core.common.h.m e6) {
                        ar arVar2 = this.f13358j;
                        arVar2.f13706e.a(1, arVar2, this.f13354e, e6.f14145a);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            d((com.anythink.core.common.w.e) null);
            ar arVar3 = this.f13358j;
            arVar3.f13706e.a(this.f13331A ? 1 : 2, arVar3, this.f13354e, i);
            this.f13358j.f13706e = null;
        }
        com.anythink.core.c.b.a().a(this.f13356g, this.f13355f, this.f13354e.a().ay(), this.f13358j, this.f13339I.b().a());
    }

    private void g(bv bvVar) {
        if (bvVar != null && com.anythink.core.common.w.g.j(bvVar) > com.anythink.core.common.v.p.a(this.f13345P)) {
            bvVar.toString();
            this.f13345P = bvVar;
        }
    }

    private void b(com.anythink.core.common.w.e eVar) {
        if (eVar.c() == null || !eVar.c().booleanValue() || eVar.e() == 2 || !eVar.c().booleanValue()) {
            return;
        }
        this.f13371w++;
    }

    private synchronized void a(bv bvVar, int i) {
        this.f13339I.b(bvVar, i);
    }

    private synchronized void a(bv bvVar) {
        this.f13339I.b(bvVar);
    }

    private void b(long j9) {
        com.anythink.core.common.t.d.a().a(this.f13341L, j9, false);
    }

    private void b(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter == null) {
            return;
        }
        synchronized (this.f13340K) {
            this.f13340K.remove(aTBaseAdAdapter);
        }
    }

    public final void a(List<bv> list, List<bv> list2, List<bv> list3, List<bv> list4) {
        boolean a9;
        String str;
        synchronized (this.f13372x) {
            if (list2 != null) {
                try {
                    Iterator<bv> it = list2.iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (list4 != null && !list4.isEmpty()) {
                for (bv bvVar : list4) {
                    if (bvVar != null) {
                        try {
                            if (bvVar.g() == 22) {
                                this.f13339I.f(bvVar);
                                com.anythink.core.common.w.g.a(bvVar, this.i);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (list3 != null) {
                this.f13335E.addAll(list3);
            }
            if (list != null && list.size() != 0) {
                this.f13338H.f();
                h hVar = this.f13349T;
                boolean e6 = hVar == null ? false : hVar.e();
                h hVar2 = this.f13349T;
                boolean d2 = hVar2 == null ? false : hVar2.d();
                if (!this.f13360l && d2 && e6) {
                    a(list);
                    return;
                }
                bv bvVar2 = list.get(0);
                boolean a10 = com.anythink.core.common.w.g.a(bvVar2, this.f13338H);
                if (e6 && !d2) {
                    a9 = this.f13339I.a(bvVar2, false);
                } else {
                    a9 = this.f13339I.a(bvVar2, true);
                }
                if (a10 || a9) {
                    if (!this.f13362n) {
                        str = "1";
                    } else {
                        str = this.f13361m ? "2" : "3";
                    }
                    String str2 = str;
                    String str3 = "1";
                    if (a10) {
                        str3 = "1";
                    } else if (a9) {
                        str3 = "2";
                    }
                    com.anythink.core.common.u.e.a(this.i, bvVar2.g(), bvVar2.z(), com.anythink.core.common.v.p.a(bvVar2), com.anythink.core.common.v.p.b(bvVar2), str2, str3, bvVar2.bt(), bvVar2.bu());
                    if (bvVar2.an()) {
                        this.f13342M = bvVar2;
                    }
                    d(bvVar2);
                    list.remove(0);
                    this.f13339I.a(bvVar2);
                    b(bvVar2, 3);
                }
                a(list);
                E();
            }
        }
    }

    public static /* synthetic */ void b(g gVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            synchronized (gVar.f13340K) {
                gVar.f13340K.remove(aTBaseAdAdapter);
            }
        }
    }

    public final void d() {
        this.f13365q = true;
        c((com.anythink.core.common.w.e) null);
    }

    private void a(List<bv> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (bv bvVar : list) {
            d(bvVar);
            a(bvVar, 1);
        }
    }

    public final void a(com.anythink.core.common.w.h hVar) {
        this.f13339I = new com.anythink.core.common.w.g(hVar);
        this.f13360l = hVar.i;
        this.f13355f = hVar.f17275b;
        this.f13356g = hVar.f17274a;
        this.f13354e = hVar.f17276c;
        this.f13352c = hVar.f17282j;
        this.f13367s = com.anythink.core.common.w.g.c(hVar.f17277d);
    }

    public final void a(h hVar) {
        this.f13349T = hVar;
        this.f13369u = SystemClock.elapsedRealtime();
        com.anythink.core.common.t.d.a().a(this.f13341L, this.f13354e.h(), false);
        if (this.f13354e.i() >= 0) {
            this.f13336F = new AnonymousClass3();
            this.f13354e.i();
            com.anythink.core.common.t.d.a().a(this.f13336F, this.f13354e.i(), false);
        }
    }

    private void a(long j9) {
        if (this.f13337G != null) {
            com.anythink.core.common.t.d.a().a(this.f13337G, j9, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(com.anythink.core.common.h.n nVar, bv bvVar, int i, String str) {
        com.anythink.core.common.h.i c4 = u.a().c(this.f13356g);
        if (c4 == null || !c4.a(bvVar)) {
            return false;
        }
        ab.a(this.f13356g, nVar, "Can't Load On Showing", bvVar, -1, -1);
        com.anythink.core.common.u.e.a(nVar, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
        u.a().a(this.f13356g, c4.a(), this.f13355f);
        this.f13339I.a(bvVar, i);
        a(bvVar);
        this.f13339I.a(i);
        this.f13334D.remove(str);
        this.f13339I.a(-1, i);
        a(this.f13339I.b(i), i);
        return true;
    }

    private void a(com.anythink.core.common.w.e eVar, com.anythink.core.common.h.n nVar, bv bvVar) {
        com.anythink.core.common.w.d dVar = new com.anythink.core.common.w.d();
        dVar.f17206a = this.f13350a;
        dVar.f17207b = this.f13351b;
        dVar.f17208c = this.f13355f;
        dVar.f17209d = this.f13356g;
        dVar.f17210e = this.f13354e.a();
        dVar.f17211f = this.f13357h;
        dVar.f17212g = this.f13370v;
        dVar.f17213h = nVar;
        dVar.i = this.f13339I.r();
        eVar.a(dVar);
        eVar.a(new AnonymousClass6(bvVar));
        eVar.a(this.f13333C);
    }

    private void a(com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.d.c cVar = this.f13359k;
        if (cVar != null) {
            cVar.onAdSourceAttempt(nVar);
        }
        if (aTBaseAdAdapter != null) {
            a(nVar, (AdError) null, a.b.f17141a, aTBaseAdAdapter.getUnitGroupInfo());
        }
        if (aTBaseAdAdapter != null) {
            com.anythink.core.common.v.d.a().a(nVar, aTBaseAdAdapter.getUnitGroupInfo(), 3);
        }
    }

    private void a(com.anythink.core.common.h.n nVar, AdError adError, bv bvVar) {
        com.anythink.core.common.d.c cVar = this.f13359k;
        if (cVar != null) {
            cVar.onAdSourceLoadFail(nVar, adError);
        }
        a(nVar, adError, a.b.f17143c, bvVar);
    }

    private void a(com.anythink.core.common.h.n nVar, AdError adError, int i, bv bvVar) {
        String str;
        String str2;
        if (nVar == null) {
            return;
        }
        if (nVar.K() && i == a.b.f17141a) {
            nVar.M();
            return;
        }
        com.anythink.core.common.w.a.b.d dVar = (com.anythink.core.common.w.a.b.d) com.anythink.core.common.w.a.a.d.a(nVar.aI(), com.anythink.core.common.w.a.b.d.class);
        if (dVar != null) {
            if (adError != null) {
                str = adError.getPlatformCode();
                str2 = adError.getPlatformMSG();
            } else {
                str = "";
                str2 = "";
            }
            dVar.a(al.a(nVar, str, str2, i));
        }
        com.anythink.core.a.c.a();
        if (i == a.b.f17141a) {
            com.anythink.core.a.c.a(this.f13350a, bvVar, nVar.aI());
            return;
        }
        if (i == a.b.f17143c) {
            com.anythink.core.a.c.b(this.f13350a, bvVar, nVar.aI());
        } else if (i == a.b.f17142b) {
            Context context = this.f13350a;
            nVar.aI();
            com.anythink.core.a.c.b(context, bvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd baseAd, bv bvVar) {
        try {
            try {
                com.anythink.core.common.w.e remove = this.f13334D.remove(str);
                if (remove == null) {
                    return;
                }
                a(remove, aTBaseAdAdapter, bvVar, aTBaseAdAdapter.getTrackingInfo(), true, baseAd);
                bvVar.toString();
                a(bvVar);
                t();
                b(aTBaseAdAdapter.getTrackingInfo(), aTBaseAdAdapter);
                bvVar.z();
                a(remove);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void a(String str, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list) {
        Throwable th;
        BaseAd[] baseAdArr;
        MgComparedResult a9;
        try {
            if (aTBaseAdAdapter != null) {
                try {
                    aTBaseAdAdapter.getTrackingInfo().M();
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            com.anythink.core.common.w.e remove = this.f13334D.remove(str);
            if (remove == null) {
                return;
            }
            com.anythink.core.common.h.n trackingInfo = aTBaseAdAdapter.getTrackingInfo();
            bv unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
            unitGroupInfo.toString();
            a(unitGroupInfo);
            t();
            if (list == null || list.size() <= 0) {
                baseAdArr = null;
            } else {
                baseAdArr = new BaseAd[list.size()];
                list.toArray(baseAdArr);
            }
            a(remove, aTBaseAdAdapter, unitGroupInfo, trackingInfo, false, baseAdArr);
            if (unitGroupInfo.H() != -1 && trackingInfo.aa() > 0) {
                com.anythink.core.common.u.e.a(trackingInfo);
            }
            e(unitGroupInfo);
            b(aTBaseAdAdapter.getTrackingInfo(), aTBaseAdAdapter);
            if (com.anythink.core.common.v.p.e(unitGroupInfo.d()) == 0) {
                this.i.b(SystemClock.elapsedRealtime());
            } else {
                this.i.a(SystemClock.elapsedRealtime());
            }
            com.anythink.core.mg.a.a aVar = this.f13348S;
            if (aVar != null && (a9 = aVar.a()) != null && a9.isMgWin()) {
                double uSDEcpm = a9.getMgAdInfo() != null ? a9.getMgAdInfo().getUSDEcpm() : 0.0d;
                if (uSDEcpm > 0.0d && com.anythink.core.common.v.p.a(unitGroupInfo) < uSDEcpm) {
                    ad R8 = unitGroupInfo.R();
                    if (unitGroupInfo.o() && R8 != null) {
                        com.anythink.core.b.d.c.a(R8, new aw(2, unitGroupInfo, trackingInfo), true, 35);
                    }
                    com.anythink.core.common.u.e.b(trackingInfo, "1");
                    com.anythink.core.common.u.c.a(this.f13350a).a(2, trackingInfo);
                    ab.a(trackingInfo, j.r.f12687b, j.r.f12697m, "");
                    a(remove);
                }
            }
            com.anythink.core.common.a.a().a(this.f13356g, aTBaseAdAdapter, list, unitGroupInfo.u(), this.f13354e.p());
            com.anythink.core.common.u.c.a(this.f13350a).a(2, trackingInfo);
            ab.a(trackingInfo, j.r.f12687b, j.r.f12697m, "");
            a(remove);
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private synchronized void a(bv bvVar, com.anythink.core.common.h.n nVar) {
        bvVar.z();
        com.anythink.core.common.w.g.c(bvVar, nVar);
    }

    private void a(com.anythink.core.common.w.e eVar, ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, com.anythink.core.common.h.n nVar, boolean z8, BaseAd... baseAdArr) {
        nVar.m(ak.a(bvVar, aTBaseAdAdapter));
        double a9 = eVar.e() != 2 ? com.anythink.core.common.v.p.a(bvVar) : 0.0d;
        a(bvVar, a9, z8);
        com.anythink.core.b.d.c.a(aTBaseAdAdapter, bvVar, nVar, baseAdArr);
        this.f13339I.h(bvVar);
        double d2 = this.f13343N;
        if (d2 <= 0.0d) {
            nVar.f14184v = 0;
        } else if (d2 < a9) {
            nVar.f14184v = 2;
        } else {
            nVar.f14184v = 1;
        }
        com.anythink.core.common.w.g.a(this.f13350a, this.f13356g, this.f13355f, bvVar, null);
    }

    private void a(com.anythink.core.common.w.e eVar) {
        boolean d2 = eVar.d();
        if (d2) {
            this.f13339I.a(-1, eVar.e());
        }
        b(eVar);
        c(eVar);
        if (this.J != null && this.f13339I.b().a() != this.J.d() && com.anythink.core.common.v.l.a(this.f13373y, this.J.d()) <= 0) {
            com.anythink.core.common.v.p.a(this.f13373y);
            com.anythink.core.common.v.p.a(this.J.d());
            this.J.c();
        }
        if (!d2) {
            l();
            return;
        }
        eVar.e();
        this.f13339I.a(eVar.e());
        a(this.f13339I.b(eVar.e()), eVar.e());
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final int i, bv bvVar) {
        boolean z8;
        t();
        if (this.f13336F != null) {
            com.anythink.core.common.t.d.a().b(this.f13336F);
            this.f13336F = null;
        }
        c.a aVar = this.J;
        if (aVar != null && ((aVar.d() == this.f13339I.b().a() || com.anythink.core.common.v.l.a(this.J.d(), this.f13373y) < 0) && this.J.b())) {
            a(this.J.d(), com.anythink.core.common.v.p.a(this.J.d()), true);
            i = this.J.d().br() ? 13 : 11;
        }
        bv bvVar2 = this.f13373y;
        if (bvVar2 != null && bvVar2.br()) {
            i = 13;
        }
        if (i != 5 && i != 13) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    z8 = false;
                    break;
            }
            this.f13362n = true;
            this.f13361m = true;
            if (this.f13341L != null) {
                com.anythink.core.common.t.d.a().b(this.f13341L);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j9 = elapsedRealtime - this.f13369u;
            final com.anythink.core.common.h.n af = this.i.af();
            af.b(true);
            af.r(j9);
            af.l(elapsedRealtime);
            if (!this.f13331A) {
                af.b(2);
            } else {
                af.b(1);
            }
            if (z8) {
                af.L(i);
            }
            if (bvVar != null) {
                af.a(bvVar);
            }
            com.anythink.core.common.w.g.a(this.f13350a, this.f13356g);
            com.anythink.core.common.w.g.a(this.f13356g);
            if (this.f13348S == null) {
                com.anythink.core.common.v.q.a(Thread.currentThread().getStackTrace());
                z();
                this.f13348S.a(new com.anythink.core.mg.a.b() { // from class: com.anythink.core.common.g.8
                    @Override // com.anythink.core.mg.a.b
                    public final void a(MgComparedResult mgComparedResult) {
                        com.anythink.core.common.u.e.b(af, mgComparedResult != null ? mgComparedResult.isCpTimeout() ? 3 : 2 : 0);
                        if (mgComparedResult == null || !mgComparedResult.isMgWin()) {
                            com.anythink.core.common.u.c.a(g.this.f13350a).a(12, af);
                            g.a(g.this, i);
                            return;
                        }
                        com.anythink.core.common.a.a().c(g.this.f13356g);
                        g.this.f13368t = ErrorCode.getErrorCode(ErrorCode.compareFailedError, "", "");
                        bv s3 = g.this.s();
                        MgComparedResult a9 = g.this.f13348S.a();
                        if (com.anythink.core.common.v.p.a(s3) <= ((a9 == null || a9.getMgAdInfo() == null) ? 0.0d : a9.getMgAdInfo().getUSDEcpm())) {
                            s3 = null;
                        }
                        g.this.f(s3);
                    }
                });
                this.f13348S.a(this.f13358j, this.f13345P);
                return;
            }
            this.f13368t = ErrorCode.getErrorCode(ErrorCode.noADError, "", "The MgComparePriceHandler can not be null.");
            f((bv) null);
            return;
        }
        z8 = true;
        this.f13362n = true;
        this.f13361m = true;
        if (this.f13341L != null) {
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j92 = elapsedRealtime2 - this.f13369u;
        final com.anythink.core.common.h.n af2 = this.i.af();
        af2.b(true);
        af2.r(j92);
        af2.l(elapsedRealtime2);
        if (!this.f13331A) {
        }
        if (z8) {
        }
        if (bvVar != null) {
        }
        com.anythink.core.common.w.g.a(this.f13350a, this.f13356g);
        com.anythink.core.common.w.g.a(this.f13356g);
        if (this.f13348S == null) {
        }
    }

    private void a(int i, List<bv> list, final j.a aVar) {
        boolean z8 = this.f13342M != null || ak.a(this.f13335E);
        com.anythink.core.common.h.a aVar2 = new com.anythink.core.common.h.a();
        aVar2.f13484b = this.f13350a;
        aVar2.f13485c = this.f13358j;
        aVar2.f13486d = this.f13355f;
        aVar2.f13487e = this.f13356g;
        aVar2.f13488f = this.f13354e.a().aq();
        aVar2.f13489g = this.f13354e.k();
        aVar2.f13490h = this.f13354e.l();
        i.a();
        aVar2.f13493l = i.a(this.f13354e.a(), z8);
        i.a();
        aVar2.f13496o = i.a(this.f13354e.a());
        i.a();
        aVar2.f13497p = i.b(this.f13354e.a());
        aVar2.f13491j = list;
        aVar2.f13495n = this.f13354e;
        aVar2.f13500s = this.i;
        aVar2.f13498q = this.f13357h;
        aVar2.f13503v = this.f13339I.p();
        aVar2.f13504w = this.f13339I.q();
        aVar2.f13505x = this.f13339I.r();
        aVar2.f13494m = z8;
        aVar2.f13501t = i;
        aVar2.f13502u = this.f13339I.a(list, this.f13345P);
        aVar2.f13506y = this.f13339I.a();
        com.anythink.core.b.b bVar = new com.anythink.core.b.b(aVar2);
        bVar.a(ATSDK.isNetworkLogDebug());
        bVar.a(new j.a() { // from class: com.anythink.core.common.g.2
            @Override // com.anythink.core.common.j.a
            public final void a(String str, List<bv> list2, List<bv> list3, boolean z9) {
                j.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(str, list2, list3, z9);
                }
            }

            @Override // com.anythink.core.common.j.a
            public final void a(String str) {
                j.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(str);
                }
            }
        });
    }

    public final synchronized void a(String str, com.anythink.core.common.w.b bVar) {
        try {
            com.anythink.core.common.h.n nVar = bVar.f17189f;
            bv bvVar = bVar.f17190g;
            AdError adError = bVar.f17187d;
            long j9 = bVar.f17188e;
            int i = bVar.f17191h;
            String M8 = nVar.M();
            com.anythink.core.common.w.e remove = this.f13334D.remove(str);
            if (remove == null) {
                return;
            }
            bvVar.toString();
            a(bvVar);
            this.f13368t.putNetworkErrorMsg(M8, nVar.Y(), nVar.aF(), adError);
            if (i == 0) {
                com.anythink.core.common.u.e.a(nVar, bVar.f17186c, adError, j9);
            } else {
                StringBuilder sb = new StringBuilder("requestId=");
                sb.append(this.f13355f);
                sb.append(", networkFirmId=");
                sb.append(nVar.Y());
                sb.append(", adSourceId=");
                sb.append(nVar.M());
                sb.append(", format=");
                sb.append(nVar.aK());
                ad R8 = bvVar.R();
                if (R8 != null) {
                    sb.append(", hasShow=");
                    sb.append(R8.p());
                    sb.append(", bidId=");
                    sb.append(R8.token);
                    sb.append(", tpBidId=");
                    sb.append(R8.f13582g);
                }
                com.anythink.core.common.u.e.b("unexpected request failed", sb.toString(), com.anythink.core.common.d.t.b().r());
            }
            if (j9 > 0) {
                com.anythink.core.common.d.c cVar = this.f13359k;
                if (cVar != null) {
                    cVar.onAdSourceLoadFail(nVar, adError);
                }
                a(nVar, adError, a.b.f17143c, bvVar);
            }
            ab.a(nVar, j.r.f12687b, j.r.f12698n, adError.printStackTrace());
            a(bvVar, this.i);
            a(remove);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str) {
        if (this.f13338H.b()) {
            return;
        }
        a(this.f13334D.get(str));
    }

    public final synchronized void a(double d2, bv bvVar) {
        try {
            D();
            if (!this.f13338H.g() && bvVar != null && bvVar.o()) {
                this.f13338H.h();
            }
            if (d2 > this.f13343N) {
                this.f13343N = d2;
            }
            int aq = this.f13354e.a().aq();
            if (aq == 0 || aq == 2) {
                return;
            }
            this.f13338H.d();
            u a9 = u.a();
            String str = this.f13356g;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13354e.a().aq());
            f a10 = a9.a(str, sb.toString());
            if (a10 != null) {
                a10.a(this.f13355f);
            } else {
                com.anythink.core.common.u.e.b("AdManage is null--notifyimpression", "Id:" + this.f13356g + "--format:" + this.f13354e.a().aq(), com.anythink.core.common.d.t.b().r());
            }
            if (!this.f13362n) {
                a(10, bvVar);
            }
            l();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(ATBaseAdAdapter aTBaseAdAdapter, String str) {
        if (aTBaseAdAdapter != null) {
            str.getClass();
            switch (str) {
                case "0":
                    aTBaseAdAdapter.setRequestNum(aTBaseAdAdapter.getUnitGroupInfo().x());
                    break;
                case "4":
                    aTBaseAdAdapter.setFetchAdTimeout(this.f13358j.f13709h);
                    break;
                case "50":
                    com.anythink.core.common.d.c cVar = this.f13358j.f13705d;
                    if (cVar instanceof com.anythink.core.common.d.d) {
                        ((com.anythink.core.common.d.d) cVar).onPrepareAdapterLoad(aTBaseAdAdapter);
                        break;
                    }
                    break;
            }
        }
    }

    private void a(AdError adError) {
        n nVar;
        ab.a("Mediation", "placementId:" + this.f13356g + ";result_callback:fail;loadType:" + this.f13358j.f13704c + ";");
        v.a(this.f13350a).a(this.f13356g, this.f13355f, false);
        ar arVar = this.f13358j;
        if (arVar == null || (nVar = arVar.f13706e) == null) {
            return;
        }
        nVar.a(2, arVar, this.f13354e, adError);
        this.f13358j.f13706e = null;
    }

    private void a(bv bvVar, double d2, boolean z8) {
        if (bvVar == null) {
            return;
        }
        this.f13374z = true;
        g(bvVar);
        if (d2 == 0.0d) {
            if (this.f13373y == null && (!z8 || !this.f13331A)) {
                this.f13331A = !z8;
            }
        } else if (com.anythink.core.common.v.l.a(bvVar, this.f13373y) < 0) {
            this.f13373y = bvVar;
            if (!z8 || !this.f13331A) {
                this.f13331A = !z8;
            }
        }
        bv bvVar2 = this.f13333C;
        if (bvVar2 == null || com.anythink.core.common.v.l.a(bvVar2, bvVar) < 0) {
            this.f13333C = bvVar;
        }
        boolean g9 = this.f13339I.g(bvVar);
        if (this.f13362n && this.f13361m && g9) {
            com.anythink.core.c.b.a().a(this.f13356g, this.f13355f, this.f13354e.a().ay(), this.f13358j, this.f13339I.b().a());
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter == null) {
            return;
        }
        synchronized (this.f13340K) {
            this.f13340K.add(aTBaseAdAdapter);
        }
    }

    private String a(com.anythink.core.common.h.n nVar, bv bvVar) {
        StringBuilder sb = new StringBuilder("requestId=");
        sb.append(this.f13355f);
        sb.append(", networkFirmId=");
        sb.append(nVar.Y());
        sb.append(", adSourceId=");
        sb.append(nVar.M());
        sb.append(", format=");
        sb.append(nVar.aK());
        ad R8 = bvVar.R();
        if (R8 != null) {
            sb.append(", hasShow=");
            sb.append(R8.p());
            sb.append(", bidId=");
            sb.append(R8.token);
            sb.append(", tpBidId=");
            sb.append(R8.f13582g);
        }
        return sb.toString();
    }

    public static /* synthetic */ void a(g gVar, com.anythink.core.common.w.e eVar, com.anythink.core.common.h.n nVar, bv bvVar) {
        com.anythink.core.common.w.d dVar = new com.anythink.core.common.w.d();
        dVar.f17206a = gVar.f13350a;
        dVar.f17207b = gVar.f13351b;
        dVar.f17208c = gVar.f13355f;
        dVar.f17209d = gVar.f13356g;
        dVar.f17210e = gVar.f13354e.a();
        dVar.f17211f = gVar.f13357h;
        dVar.f17212g = gVar.f13370v;
        dVar.f17213h = nVar;
        dVar.i = gVar.f13339I.r();
        eVar.a(dVar);
        eVar.a(gVar.new AnonymousClass6(bvVar));
        eVar.a(gVar.f13333C);
    }

    public static /* synthetic */ void a(g gVar, com.anythink.core.common.h.n nVar, ATBaseAdAdapter aTBaseAdAdapter) {
        com.anythink.core.common.d.c cVar = gVar.f13359k;
        if (cVar != null) {
            cVar.onAdSourceAttempt(nVar);
        }
        if (aTBaseAdAdapter != null) {
            gVar.a(nVar, (AdError) null, a.b.f17141a, aTBaseAdAdapter.getUnitGroupInfo());
        }
        if (aTBaseAdAdapter != null) {
            com.anythink.core.common.v.d.a().a(nVar, aTBaseAdAdapter.getUnitGroupInfo(), 3);
        }
    }

    public static /* synthetic */ void a(g gVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (aTBaseAdAdapter != null) {
            synchronized (gVar.f13340K) {
                gVar.f13340K.add(aTBaseAdAdapter);
            }
        }
    }

    public static /* synthetic */ void a(g gVar, int i) {
        com.anythink.core.d.l a9;
        gVar.u();
        if (gVar.f13344O) {
            return;
        }
        ab.a("Mediation", "placementId:" + gVar.f13356g + ";result_callback:success;loadType:" + gVar.f13358j.f13704c + ";");
        v.a(gVar.f13350a).a(gVar.f13356g, gVar.f13355f, true);
        ar arVar = gVar.f13358j;
        if (arVar != null && arVar.f13706e != null) {
            try {
                cb cbVar = gVar.f13354e;
                if (cbVar != null && (a9 = cbVar.a()) != null) {
                    try {
                        u a10 = u.a();
                        String str = gVar.f13356g;
                        StringBuilder sb = new StringBuilder();
                        sb.append(gVar.f13354e.a().aq());
                        if (a10.a(str, sb.toString()) != null) {
                            f.a(a9, gVar.i);
                            f.b(a9, gVar.i);
                        }
                    } catch (com.anythink.core.common.h.m e6) {
                        ar arVar2 = gVar.f13358j;
                        arVar2.f13706e.a(1, arVar2, gVar.f13354e, e6.f14145a);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            gVar.d((com.anythink.core.common.w.e) null);
            ar arVar3 = gVar.f13358j;
            arVar3.f13706e.a(gVar.f13331A ? 1 : 2, arVar3, gVar.f13354e, i);
            gVar.f13358j.f13706e = null;
        }
        com.anythink.core.c.b.a().a(gVar.f13356g, gVar.f13355f, gVar.f13354e.a().ay(), gVar.f13358j, gVar.f13339I.b().a());
    }
}
