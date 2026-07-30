package com.anythink.core.common;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.a.c;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h;
import com.anythink.core.common.h.ac;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bp;
import com.anythink.core.common.h.bq;
import com.anythink.core.common.h.bu;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.bx;
import com.anythink.core.common.h.bz;
import com.anythink.core.common.h.cb;
import com.anythink.core.common.h.z;
import com.anythink.core.common.j;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.ae;
import com.anythink.core.common.v.aj;
import com.anythink.core.d.n;
import com.anythink.core.debugger.CoreDebuggerManager;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    protected Context f13252a;

    /* renamed from: b, reason: collision with root package name */
    protected String f13253b;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f13255d;

    /* renamed from: g, reason: collision with root package name */
    n f13258g;
    com.anythink.core.common.p.c i;

    /* renamed from: j, reason: collision with root package name */
    com.anythink.core.common.p.d f13260j;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13264n;

    /* renamed from: o, reason: collision with root package name */
    private long f13265o;

    /* renamed from: q, reason: collision with root package name */
    private ATAdRequest f13267q;

    /* renamed from: r, reason: collision with root package name */
    private ar f13268r;

    /* renamed from: l, reason: collision with root package name */
    private final String f13262l = "f";

    /* renamed from: e, reason: collision with root package name */
    protected String f13256e = "";

    /* renamed from: m, reason: collision with root package name */
    private String f13263m = "";

    /* renamed from: p, reason: collision with root package name */
    private boolean f13266p = false;

    /* renamed from: f, reason: collision with root package name */
    protected int f13257f = 1;

    /* renamed from: k, reason: collision with root package name */
    h.d f13261k = new h.d() { // from class: com.anythink.core.common.f.5
        @Override // com.anythink.core.common.h.d
        public final void a(g gVar) {
            if (gVar != null) {
                gVar.b();
            }
        }
    };

    /* renamed from: c, reason: collision with root package name */
    protected ConcurrentHashMap<String, g> f13254c = new ConcurrentHashMap<>(5);

    /* renamed from: h, reason: collision with root package name */
    final List<bx> f13259h = Collections.synchronizedList(new ArrayList(2));

    /* renamed from: com.anythink.core.common.f$3, reason: invalid class name */
    public class AnonymousClass3 implements com.anythink.core.common.w.b.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ar f13282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13283b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13284c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13285d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.d.l f13286e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.h.n f13287f;

        public AnonymousClass3(ar arVar, Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
            this.f13282a = arVar;
            this.f13283b = context;
            this.f13284c = str;
            this.f13285d = str2;
            this.f13286e = lVar;
            this.f13287f = nVar;
        }

        @Override // com.anythink.core.common.w.b.b
        public final void a() {
            com.anythink.core.common.h.h hVar = this.f13282a.f13713m;
            if (hVar != null) {
                hVar.g(System.currentTimeMillis());
            }
            f.b(f.this, this.f13283b, this.f13284c, this.f13285d, this.f13286e, this.f13287f, this.f13282a);
        }
    }

    /* renamed from: com.anythink.core.common.f$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f13289a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ar f13290b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13291c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13292d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.d.l f13293e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f13294f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f13295g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ cb f13296h;
        final /* synthetic */ com.anythink.core.common.h.n i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ bz f13297j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ bq f13298k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ac f13299l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.w.i f13300m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Boolean f13301n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Double[] f13302o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f13303p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ h f13304q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ g f13305r;

        public AnonymousClass4(Context context, ar arVar, String str, String str2, com.anythink.core.d.l lVar, boolean z8, List list, cb cbVar, com.anythink.core.common.h.n nVar, bz bzVar, bq bqVar, ac acVar, com.anythink.core.common.w.i iVar, Boolean bool, Double[] dArr, boolean z9, h hVar, g gVar) {
            this.f13289a = context;
            this.f13290b = arVar;
            this.f13291c = str;
            this.f13292d = str2;
            this.f13293e = lVar;
            this.f13294f = z8;
            this.f13295g = list;
            this.f13296h = cbVar;
            this.i = nVar;
            this.f13297j = bzVar;
            this.f13298k = bqVar;
            this.f13299l = acVar;
            this.f13300m = iVar;
            this.f13301n = bool;
            this.f13302o = dArr;
            this.f13303p = z9;
            this.f13304q = hVar;
            this.f13305r = gVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Double d2;
            try {
                com.anythink.core.common.h.a aVar = new com.anythink.core.common.h.a();
                aVar.f13484b = this.f13289a;
                aVar.f13485c = this.f13290b;
                aVar.f13486d = this.f13291c;
                aVar.f13487e = this.f13292d;
                aVar.f13488f = this.f13293e.aq();
                aVar.f13489g = this.f13293e.ab();
                aVar.f13490h = this.f13293e.V();
                aVar.i = this.f13293e.E();
                i.a();
                aVar.f13493l = i.a(this.f13293e, this.f13294f);
                i.a();
                aVar.f13496o = i.a(this.f13293e);
                i.a();
                aVar.f13497p = i.b(this.f13293e);
                aVar.f13491j = this.f13295g;
                aVar.f13495n = this.f13296h;
                aVar.f13500s = this.i;
                aVar.f13503v = this.f13297j;
                aVar.f13504w = this.f13298k;
                aVar.f13505x = this.f13299l;
                aVar.f13498q = u.a().b(f.this.f13253b);
                aVar.f13494m = this.f13294f;
                ar arVar = this.f13290b;
                if (arVar.f13704c == 8) {
                    aVar.f13501t = 7;
                }
                aVar.f13506y = this.f13300m;
                aVar.f13478A = arVar.f13712l;
                aVar.f13479B = d.a().c(f.this.f13253b);
                Boolean bool = this.f13301n;
                int i = 0;
                if (bool != null && bool.booleanValue() && (d2 = this.f13302o[0]) != null) {
                    aVar.f13480C = d2.doubleValue();
                }
                if (this.f13303p && this.f13293e.bv() > 0) {
                    i = this.f13293e.bv();
                }
                aVar.f13481D = i;
                aVar.f13482E = this.f13293e.bE();
                aVar.f13483F = this.f13304q;
                com.anythink.core.b.b bVar = new com.anythink.core.b.b(aVar);
                bVar.a(ATSDK.isNetworkLogDebug());
                bVar.a(new j.a() { // from class: com.anythink.core.common.f.4.1
                    @Override // com.anythink.core.common.j.a
                    public final void a(String str, List<bv> list, List<bv> list2, boolean z8) {
                        boolean d3 = AnonymousClass4.this.f13296h.d();
                        ArrayList arrayList = null;
                        for (bv bvVar : list2) {
                            if (d3 && (bvVar.q() == 1 || bvVar.q() == 3)) {
                                if (bvVar.U() != 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList(4);
                                    }
                                    bvVar.C(7);
                                    arrayList.add(bvVar);
                                }
                            }
                            if (!d3 && bvVar.p() != 0) {
                                c a9 = c.a();
                                a9.f12405c.put(bvVar.z(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                        AnonymousClass4.this.f13305r.a(list, list2, arrayList, list2);
                        if (z8) {
                            AnonymousClass4.this.f13305r.e();
                        }
                    }

                    @Override // com.anythink.core.common.j.a
                    public final void a(String str) {
                        AnonymousClass4.this.f13305r.d();
                    }
                });
            } catch (Throwable th) {
                com.anythink.basead.b.c.i.v("notifyBiddingFinish error", th.getMessage() + ", " + com.anythink.core.common.v.q.a(th.getStackTrace()));
                this.f13305r.e();
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$7, reason: invalid class name */
    public class AnonymousClass7 implements com.anythink.core.common.d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.d.a[] f13311a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13312b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13313c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13314d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ar f13315e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.d.l f13316f;

        public AnonymousClass7(com.anythink.core.common.d.a[] aVarArr, String str, String str2, String str3, ar arVar, com.anythink.core.d.l lVar) {
            this.f13311a = aVarArr;
            this.f13312b = str;
            this.f13313c = str2;
            this.f13314d = str3;
            this.f13315e = arVar;
            this.f13316f = lVar;
        }

        @Override // com.anythink.core.common.d.a
        public final void onAdLoadFail(AdError adError) {
            if (this.f13311a[0] != null) {
                com.anythink.core.common.u.e.a(this.f13312b, this.f13313c, (com.anythink.core.common.h.n) null, this.f13314d, this.f13315e.f13702a, this.f13316f, false, "0", "0", "");
                this.f13311a[0].onAdLoadFail(adError);
            }
        }

        @Override // com.anythink.core.common.d.a
        public final void onAdLoaded() {
            if (this.f13311a[0] != null) {
                com.anythink.core.common.u.e.a(this.f13312b, this.f13313c, (com.anythink.core.common.h.n) null, this.f13314d, this.f13315e.f13702a, this.f13316f, true, "0", "1", "");
                this.f13311a[0].onAdLoaded();
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$8, reason: invalid class name */
    public class AnonymousClass8 implements com.anythink.core.common.d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13318a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13319b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13320c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ar f13321d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.d.l f13322e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.d.a[] f13323f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f13324g;

        public AnonymousClass8(String str, String str2, String str3, ar arVar, com.anythink.core.d.l lVar, com.anythink.core.common.d.a[] aVarArr, Context context) {
            this.f13318a = str;
            this.f13319b = str2;
            this.f13320c = str3;
            this.f13321d = arVar;
            this.f13322e = lVar;
            this.f13323f = aVarArr;
            this.f13324g = context;
        }

        @Override // com.anythink.core.common.d.a
        public final void onAdLoadFail(AdError adError) {
            com.anythink.core.common.h.c b9 = f.b(this.f13324g, this.f13319b, this.f13320c, this.f13321d);
            if (b9 == null) {
                w.a().b(this.f13319b, this.f13321d.b());
                com.anythink.core.common.u.e.a(this.f13318a, this.f13319b, (com.anythink.core.common.h.n) null, this.f13320c, this.f13321d.f13702a, this.f13322e, false, "0", "0", "");
                com.anythink.core.common.d.a aVar = this.f13323f[0];
                if (aVar != null) {
                    aVar.onAdLoadFail(adError);
                    return;
                }
                return;
            }
            ab.a("Shared", "placementId:" + this.f13318a + ";result_callback:success;");
            com.anythink.core.common.h.n i = b9.i();
            com.anythink.core.common.u.e.a(this.f13318a, this.f13319b, i, this.f13320c, this.f13321d.f13702a, this.f13322e, true, "1", "0", i != null ? i.aJ() : "");
            com.anythink.core.common.d.a aVar2 = this.f13323f[0];
            if (aVar2 != null) {
                aVar2.onAdLoaded();
            }
        }

        @Override // com.anythink.core.common.d.a
        public final void onAdLoaded() {
            com.anythink.core.common.u.e.a(this.f13318a, this.f13319b, (com.anythink.core.common.h.n) null, this.f13320c, this.f13321d.f13702a, this.f13322e, true, "2", "1", "");
            com.anythink.core.common.d.a aVar = this.f13323f[0];
            if (aVar != null) {
                aVar.onAdLoaded();
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$9, reason: invalid class name */
    public class AnonymousClass9 implements Comparator<com.anythink.core.common.h.c> {
        public AnonymousClass9() {
        }

        private static int a(com.anythink.core.common.h.c cVar, com.anythink.core.common.h.c cVar2) {
            return com.anythink.core.common.v.l.a(cVar.o(), cVar2.o());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.anythink.core.common.h.c cVar, com.anythink.core.common.h.c cVar2) {
            return com.anythink.core.common.v.l.a(cVar.o(), cVar2.o());
        }
    }

    private f(Context context, String str) {
        this.f13252a = context.getApplicationContext();
        this.f13253b = str;
        if (com.anythink.core.common.d.t.b().g() == null) {
            com.anythink.core.common.d.t.b().a(this.f13252a);
        }
    }

    public static /* synthetic */ boolean h(f fVar) {
        fVar.f13264n = false;
        return false;
    }

    public static /* synthetic */ long i(f fVar) {
        fVar.f13265o = 0L;
        return 0L;
    }

    private boolean k() {
        return System.currentTimeMillis() - this.f13265o <= com.anythink.basead.exoplayer.i.a.f8040f;
    }

    private ar l() {
        return this.f13268r;
    }

    private boolean m() {
        return !TextUtils.isEmpty(this.f13256e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.anythink.core.common.p.d dVar = this.f13260j;
        return dVar != null && dVar.b();
    }

    private void o() {
        com.anythink.core.common.p.d dVar = this.f13260j;
        if (dVar != null) {
            dVar.d();
        }
    }

    private void p() {
        com.anythink.core.common.p.d dVar = this.f13260j;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final int c() {
        List<bx> list = this.f13259h;
        int i = 0;
        if (list == null) {
            return 0;
        }
        synchronized (list) {
            try {
                Iterator<bx> it = this.f13259h.iterator();
                while (it.hasNext()) {
                    bx next = it.next();
                    if (next == null || !next.a()) {
                        it.remove();
                    } else {
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    /* renamed from: com.anythink.core.common.f$2, reason: invalid class name */
    public class AnonymousClass2 implements n.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.h.n f13277a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13278b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ar f13279c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13280d;

        public AnonymousClass2(com.anythink.core.common.h.n nVar, String str, ar arVar, String str2) {
            this.f13277a = nVar;
            this.f13278b = str;
            this.f13279c = arVar;
            this.f13280d = str2;
        }

        @Override // com.anythink.core.d.n.b
        public final void a() {
            com.anythink.core.common.h.n nVar = this.f13277a;
            if (nVar != null) {
                nVar.g(SystemClock.elapsedRealtime());
            }
        }

        @Override // com.anythink.core.d.n.b
        public final void b() {
            com.anythink.core.common.h.n nVar = this.f13277a;
            if (nVar != null) {
                nVar.h(SystemClock.elapsedRealtime());
            }
        }

        @Override // com.anythink.core.d.n.b
        public final void a(com.anythink.core.d.l lVar) {
            com.anythink.core.common.h.n nVar;
            String unused = f.this.f13262l;
            if (lVar != null) {
                lVar.i();
            }
            synchronized (f.this) {
                try {
                    aj.a(this.f13277a, lVar);
                    if (!TextUtils.equals(String.valueOf(lVar != null ? lVar.aq() : 0), this.f13278b)) {
                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.formatError, "", "Format corresponding to API: " + com.anythink.core.common.v.p.f(this.f13278b) + ", Format corresponding to placement strategy: " + com.anythink.core.common.v.p.f(String.valueOf(lVar.aq())));
                        f.this.a(this.f13279c, errorCode);
                        this.f13277a.b(false);
                        com.anythink.core.common.u.e.a(this.f13277a, errorCode);
                        f.this.f13255d = false;
                        return;
                    }
                    if (lVar != null && (nVar = this.f13277a) != null) {
                        nVar.i(SystemClock.elapsedRealtime());
                        if (lVar.bJ()) {
                            this.f13277a.a(2);
                        } else {
                            this.f13277a.a(1);
                        }
                    }
                    long j9 = 0;
                    long bH = lVar != null ? lVar.bH() : 0L;
                    int bI = lVar != null ? lVar.bI() : 0;
                    com.anythink.core.common.h.h hVar = this.f13279c.f13713m;
                    if (hVar != null) {
                        if (lVar == null || lVar.bJ()) {
                            j9 = bH;
                        }
                        hVar.e(j9);
                        hVar.f(System.currentTimeMillis());
                        hVar.a(bI);
                    }
                    f fVar = f.this;
                    f.a(fVar, fVar.f13252a, fVar.f13253b, this.f13280d, lVar, this.f13277a, this.f13279c);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.d.n.b
        public final void b(com.anythink.core.d.l lVar) {
            if (lVar.ba()) {
                return;
            }
            f.this.b();
        }

        @Override // com.anythink.core.d.n.b
        public final void a(AdError adError) {
            String str = j.r.f12698n;
            String str2 = f.this.f13253b;
            String f6 = com.anythink.core.common.v.p.f(this.f13278b);
            String printStackTrace = adError.printStackTrace();
            if (ATSDK.isNetworkLogDebug()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(NativeAdvancedJsUtils.f18064p, j.r.f12684E);
                    jSONObject.put("result", str);
                    jSONObject.put(com.anythink.expressad.videocommon.e.b.f22566v, str2);
                    jSONObject.put("adtype", f6);
                    jSONObject.put("errorMsg", printStackTrace);
                    ab.a("anythink_network", jSONObject.toString(), TextUtils.equals(j.r.f12698n, str));
                } catch (Throwable unused) {
                }
            }
            if (adError.getCode().equals(ErrorCode.statuError)) {
                adError = ErrorCode.getErrorCode(ErrorCode.placeStrategyError, adError.getPlatformCode(), adError.getPlatformMSG());
            }
            this.f13277a.L(5);
            f.this.a(true, this.f13277a, adError, this.f13279c);
        }
    }

    public final void b() {
        synchronized (this.f13259h) {
            this.f13259h.clear();
        }
    }

    public final void d() {
        List<bx> list = this.f13259h;
        if (list != null) {
            synchronized (list) {
                try {
                    this.f13259h.size();
                    if (this.f13259h.size() > 0) {
                        this.f13259h.remove(0);
                    }
                    this.f13259h.size();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e() {
        this.f13264n = false;
        this.f13265o = 0L;
        this.f13266p = false;
    }

    public final void f() {
        com.anythink.core.d.l b9 = com.anythink.core.d.n.a(this.f13252a).b(this.f13253b);
        if (this.f13264n || b9 == null) {
            return;
        }
        this.f13264n = true;
        this.f13265o = System.currentTimeMillis();
    }

    public final boolean g() {
        g gVar;
        if (this.f13255d) {
            return true;
        }
        return (TextUtils.isEmpty(this.f13256e) || (gVar = this.f13254c.get(this.f13256e)) == null || gVar.c()) ? false : true;
    }

    public final String h() {
        return this.f13256e;
    }

    public final ATAdRequest i() {
        return this.f13267q;
    }

    public final void j() {
        try {
            u.a().a(this.f13253b, com.anythink.core.common.v.p.a(new Throwable().getStackTrace()));
        } catch (Throwable unused) {
        }
    }

    public final g b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f13254c.get(str);
    }

    private void b(Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, ar arVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        bv bvVar;
        List<bv> list;
        bq bqVar;
        ac acVar;
        Map<String, Object> map;
        boolean z11;
        g gVar;
        boolean z12;
        boolean z13;
        ar arVar2 = arVar;
        lVar.A();
        String str3 = str;
        String str4 = str2;
        com.anythink.core.common.u.e.a("1", nVar, str4, str3, "", 0, lVar.aq(), 0L);
        cb cbVar = new cb(arVar2, lVar);
        if (nVar != null) {
            nVar.g(cbVar.e());
            nVar.h(cbVar.f());
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
                z9 = true;
            }
        } catch (com.anythink.core.common.h.m e6) {
            e = e6;
            z8 = true;
        }
        try {
            if (lVar.bj()) {
                a(lVar, nVar);
                b(lVar, nVar);
                bp a9 = ae.a(lVar, nVar);
                com.anythink.core.common.h.n c4 = a9.c();
                if (a9.b() == 0) {
                    try {
                        c4.L(5);
                        if (a9.a().D() == 1) {
                            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                        }
                        throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                    } catch (Throwable th2) {
                        th = th2;
                        z9 = true;
                        a(z9, nVar, th, arVar2);
                        return;
                    }
                }
                if (a9.i()) {
                    boolean k6 = a9.k();
                    ArrayList arrayList = new ArrayList(1);
                    ae.b(a9, arrayList);
                    List<bv> d2 = a9.d();
                    if (d2 != null && !d2.isEmpty()) {
                        ae.a(lVar, a9.c(), d2);
                    }
                    List<bv> a10 = ae.a(a9, a9.d());
                    a.a().b(str3);
                    boolean z14 = arrayList.size() > 0;
                    boolean z15 = !z14 && (a9.e() == null || a9.e().size() == 0);
                    nVar.f(SystemClock.elapsedRealtime());
                    if (z15 && ((a10 == null || a10.size() == 0) && ((a9.f() == null || a9.f().size() == 0) && ((a9.g() == null || a9.g().size() == 0) && (a9.h() == null || a9.h().size() == 0))))) {
                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                        nVar.L(6);
                        a(true, nVar, errorCode, arVar2);
                        this.f13255d = false;
                        return;
                    }
                    com.anythink.core.a.c.a();
                    com.anythink.core.a.c.b(this.f13252a, str3, lVar);
                    Map<String, Object> b9 = u.a().b(this.f13253b);
                    Map<String, bz> map2 = x.a(this.f13252a).f17299a;
                    bz remove = map2 != null ? map2.remove(str3) : null;
                    bq a11 = v.a(this.f13252a).a(str3, str4);
                    ac a12 = d.a().a(str3);
                    ac acVar2 = new ac(str4);
                    boolean z16 = z15;
                    d.a().a(this.f13253b, acVar2);
                    nVar.b(true);
                    nVar.B(cbVar.f());
                    g gVar2 = new g(arVar2.a());
                    gVar2.f13357h = b9;
                    gVar2.i = nVar;
                    gVar2.a(arVar2);
                    gVar2.a(arVar2.f13705d);
                    this.f13256e = str4;
                    this.f13263m = nVar.aB();
                    List<bv> a13 = com.anythink.core.d.u.a(lVar, lVar.Y());
                    if (a13.size() > 0) {
                        z10 = false;
                        bvVar = a13.get(0);
                    } else {
                        z10 = false;
                        bvVar = null;
                    }
                    if (bvVar != null) {
                        for (bv bvVar2 : a9.e()) {
                            g gVar3 = gVar2;
                            if (bvVar2.z().equals(bvVar.z())) {
                                String str5 = str3;
                                String str6 = str4;
                                bqVar = a11;
                                list = a10;
                                acVar = a12;
                                z11 = z16;
                                z12 = k6;
                                z13 = false;
                                c.a a14 = com.anythink.core.common.a.c.a().a(context, str5, str6, bvVar2, lVar, b9, this.f13267q);
                                str3 = str5;
                                str4 = str6;
                                if (a14 != null) {
                                    bv d3 = a14.d();
                                    AdError a15 = ae.a(0, nVar, d3, (z) null);
                                    Objects.toString(a15);
                                    if (a15 != null) {
                                        com.anythink.core.common.a.c.a().a(str3, d3.z());
                                        gVar = gVar3;
                                    } else {
                                        gVar = gVar3;
                                        gVar.J = a14;
                                    }
                                    map = b9;
                                    nVar.d(SystemClock.elapsedRealtime());
                                } else {
                                    map = b9;
                                    gVar = gVar3;
                                }
                            } else {
                                list = a10;
                                bqVar = a11;
                                acVar = a12;
                                map = b9;
                                z11 = z16;
                                gVar = gVar3;
                                z12 = k6;
                                z13 = false;
                            }
                            b9 = map;
                            gVar2 = gVar;
                            a11 = bqVar;
                            a12 = acVar;
                            a10 = list;
                            z10 = z13;
                            k6 = z12;
                            z16 = z11;
                        }
                    }
                    bq bqVar2 = a11;
                    ac acVar3 = a12;
                    boolean z17 = z16;
                    boolean z18 = k6;
                    boolean z19 = z10;
                    List<bv> list2 = a10;
                    g gVar4 = gVar2;
                    com.anythink.core.common.u.c.a(this.f13252a).a(10, nVar);
                    Double[] dArr = new Double[1];
                    Boolean bn = lVar.bn();
                    if (a9.j() || (bn != null && bn.booleanValue())) {
                        com.anythink.core.common.h.c a16 = a.a().a(context, str3);
                        if (a16 != null) {
                            dArr[z19 ? 1 : 0] = Double.valueOf(a16.n());
                        }
                    }
                    a9.j();
                    com.anythink.core.common.w.i iVar = new com.anythink.core.common.w.i(list2);
                    com.anythink.core.common.w.h hVar = new com.anythink.core.common.w.h();
                    hVar.f17274a = str3;
                    hVar.f17275b = str4;
                    hVar.f17276c = cbVar;
                    hVar.f17277d = list2;
                    hVar.f17278e = a9.h();
                    hVar.i = z17;
                    hVar.f17282j = nVar.aE();
                    hVar.f17283k = remove;
                    hVar.f17285m = bqVar2;
                    hVar.f17284l = iVar;
                    hVar.f17287o = acVar3;
                    hVar.f17286n = acVar2;
                    hVar.f17279f = a9.f();
                    hVar.f17280g = a9.g();
                    Double d9 = dArr[z19 ? 1 : 0];
                    hVar.f17281h = d9 != null ? d9.doubleValue() : 0.0d;
                    hVar.f17288p = a9.e();
                    gVar4.a(hVar);
                    this.f13254c.put(str4, gVar4);
                    com.anythink.core.common.h.h hVar2 = arVar2.f13713m;
                    if (hVar2 != null) {
                        hVar2.h(System.currentTimeMillis());
                    }
                    com.anythink.core.common.u.e.a(arVar2.f13713m, nVar);
                    h hVar3 = new h(str3);
                    gVar4.a(hVar3);
                    hVar3.a(lVar, z18);
                    hVar3.a(this.f13261k);
                    hVar3.a(gVar4);
                    this.f13255d = z19;
                    if (!z17) {
                        List<bv> e9 = a9.e();
                        com.anythink.core.common.v.b.b a17 = com.anythink.core.common.v.b.b.a();
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, arVar2, str4, str3, lVar, z14, e9, cbVar, nVar, remove, bqVar2, acVar3, iVar, bn, dArr, z18, hVar3, gVar4);
                        arVar2 = arVar2;
                        a17.b(anonymousClass4);
                    }
                    int i = arVar2.f13704c;
                    if (i == 0 || i == 3) {
                        w.a().a(lVar, 15, arVar2, nVar);
                        return;
                    }
                    return;
                }
                c4.L(6);
                AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                throw new com.anythink.core.common.h.m(errorCode2, errorCode2.printStackTrace());
            }
            nVar.L(5);
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
        } catch (com.anythink.core.common.h.m e10) {
            e = e10;
            z8 = true;
            a(z8, nVar, e, arVar2);
        }
    }

    public final void a(com.anythink.core.common.p.c cVar) {
        this.i = cVar;
    }

    private void a(com.anythink.core.common.p.d dVar) {
        this.f13260j = dVar;
    }

    private static void c(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
        if (lVar.bj()) {
            return;
        }
        nVar.L(5);
        throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
    }

    private List<com.anythink.core.common.h.c> d(Context context) {
        if (a(false, false, (com.anythink.core.common.h.ae) null)) {
            return null;
        }
        return a.a().a(context, this.f13253b, false, false, true, (com.anythink.core.common.h.ae) null);
    }

    public final com.anythink.core.common.p.d a() {
        return this.f13260j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(Context context, String str, String str2) {
        char c4;
        f a9 = u.a().a(str, str2);
        if (a9 != null) {
            return a9;
        }
        synchronized (f.class) {
            if (a9 == null) {
                try {
                    a9 = new f(context, str);
                    int hashCode = str2.hashCode();
                    if (hashCode != 49) {
                        if (hashCode == 51 && str2.equals("3")) {
                            c4 = 1;
                            if (c4 != 0 || c4 == 1) {
                                a9.f13260j = new com.anythink.core.common.p.a(str, str2);
                            }
                            u.a().a(str, str2, a9);
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        a9.f13260j = new com.anythink.core.common.p.a(str, str2);
                        u.a().a(str, str2, a9);
                    } else {
                        if (str2.equals("1")) {
                            c4 = 0;
                            if (c4 != 0) {
                            }
                            a9.f13260j = new com.anythink.core.common.p.a(str, str2);
                            u.a().a(str, str2, a9);
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        a9.f13260j = new com.anythink.core.common.p.a(str, str2);
                        u.a().a(str, str2, a9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a9;
    }

    private List<com.anythink.core.common.h.c> c(Context context) {
        return a.a().a(context, this.f13253b, false, false, true, (com.anythink.core.common.h.ae) null);
    }

    public final void c(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.f.6
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = f.this.f13254c.get(str);
                if (gVar != null) {
                    gVar.g();
                }
            }
        }, 2);
    }

    public static /* synthetic */ void c(f fVar) {
        com.anythink.core.common.p.d dVar = fVar.f13260j;
        if (dVar != null) {
            dVar.d();
        }
    }

    public final void a(bx bxVar, com.anythink.core.d.l lVar) {
        com.anythink.core.d.l a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f13253b);
        if (a9 != null) {
            if (lVar == null) {
                return;
            }
            if (!TextUtils.equals(a9.an(), lVar.an()) && !a9.ba()) {
                return;
            }
        }
        synchronized (this.f13259h) {
            this.f13259h.add(bxVar);
        }
    }

    public final void a(String str) {
        this.f13254c.remove(str);
    }

    public final void a(String str, double d2, bv bvVar) {
        g gVar = this.f13254c.get(str);
        if (gVar != null) {
            gVar.a(d2, bvVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final Context context, final String str, final String str2, final ar arVar, final com.anythink.core.common.d.a aVar) {
        final long j9;
        final Map<String, Object> b9;
        int i;
        if (!com.anythink.core.common.d.t.b().z()) {
            com.anythink.core.common.d.t.b().f12903c = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (arVar != null) {
            long j10 = arVar.f13714n;
            if (j10 != 0) {
                j9 = j10;
                b9 = u.a().b(str2);
                final int[] iArr = {0};
                if (b9.containsKey(bu.f13916S)) {
                    try {
                        iArr[0] = ((Integer) b9.get(bu.f13916S)).intValue();
                    } catch (Throwable unused) {
                    }
                }
                i = arVar.f13704c;
                if (i != 0 || i == 3) {
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    u.a().a(str2, stackTrace);
                    if (!TextUtils.equals(str, "4")) {
                        u.a().a(str2, com.anythink.core.common.v.p.a(stackTrace));
                    }
                }
                com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.f.1
                    /* JADX WARN: Removed duplicated region for block: B:112:0x0324  */
                    /* JADX WARN: Removed duplicated region for block: B:122:0x034e  */
                    /* JADX WARN: Removed duplicated region for block: B:149:0x02b3 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:150:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:160:0x01cc  */
                    /* JADX WARN: Removed duplicated region for block: B:161:0x01aa A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
                    /* JADX WARN: Removed duplicated region for block: B:71:0x01ca  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x01f9 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
                    /* JADX WARN: Removed duplicated region for block: B:78:0x0223 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        String str3;
                        com.anythink.core.d.l lVar;
                        String str4;
                        boolean z8;
                        com.anythink.core.d.l lVar2;
                        com.anythink.core.common.h.n a9;
                        Map<String, Object> map;
                        int a10;
                        long currentTimeMillis;
                        synchronized (f.this) {
                            try {
                                com.anythink.core.common.d.t.b().b(f.this.f13252a);
                                if (!f.this.g() || arVar.f13704c == 0) {
                                    if (f.a(f.this) || arVar.f13704c != 5) {
                                        if (f.this.n() && arVar.f13704c == 0) {
                                            Log.e("anythink", "PlacementId(" + str2 + ") the load api calls are not allowed in Auto-load mode");
                                            return;
                                        }
                                        f fVar = f.this;
                                        if (fVar.f13258g == null) {
                                            fVar.f13258g = new n();
                                        }
                                        n nVar = f.this.f13258g;
                                        String str5 = str2;
                                        String str6 = str;
                                        nVar.f14925a = str5;
                                        nVar.f14926b = str6;
                                        nVar.a(aVar);
                                        ar arVar2 = arVar;
                                        f fVar2 = f.this;
                                        arVar2.f13706e = fVar2.f13258g;
                                        int i4 = arVar2.f13704c;
                                        if (i4 == 4 || i4 == 5) {
                                            fVar2.f13257f++;
                                        } else {
                                            fVar2.f13257f = 1;
                                        }
                                        f.c(fVar2);
                                        int i9 = arVar.f13704c;
                                        com.anythink.core.common.d.t.b().a(context, true);
                                        if (TextUtils.isEmpty(arVar.f13702a)) {
                                            str3 = com.anythink.core.common.v.p.a(context);
                                            arVar.f13702a = str3;
                                        } else {
                                            str3 = arVar.f13702a;
                                        }
                                        String str7 = str3;
                                        f fVar3 = f.this;
                                        String str8 = arVar.f13702a;
                                        com.anythink.core.common.d.a aVar2 = aVar;
                                        com.anythink.core.common.p.c cVar = fVar3.i;
                                        if (cVar != null) {
                                            cVar.a(str8, aVar2);
                                        }
                                        f.this.f13268r = arVar;
                                        f.this.f13267q = arVar.b();
                                        if (com.anythink.core.common.d.t.b().g() != null && !TextUtils.isEmpty(com.anythink.core.common.d.t.b().p()) && !TextUtils.isEmpty(com.anythink.core.common.d.t.b().q()) && !com.anythink.core.common.v.q.a(str2)) {
                                            Context g9 = com.anythink.core.common.d.t.b().g();
                                            String p6 = com.anythink.core.common.d.t.b().p();
                                            String q6 = com.anythink.core.common.d.t.b().q();
                                            boolean z9 = com.anythink.core.common.d.t.b().z();
                                            ar arVar3 = arVar;
                                            int i10 = arVar3.f13704c;
                                            com.anythink.core.common.h.h hVar = arVar3.f13713m;
                                            if (hVar != null) {
                                                hVar.b(System.currentTimeMillis());
                                            }
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                            ar arVar4 = arVar;
                                            if (arVar4.f13714n != 0) {
                                                elapsedRealtime2 = arVar4.f13715o;
                                            }
                                            com.anythink.core.d.n a11 = com.anythink.core.d.n.a(context);
                                            com.anythink.core.d.l a12 = f.a(f.this, z9, b9);
                                            boolean h9 = a11.h(str2);
                                            if (!z9 && a12 == null) {
                                                a12 = i10 == 13 ? a11.d(str2) : i10 == 14 ? a11.e(str2) : a11.c(str2);
                                                com.anythink.core.d.l f6 = a11.f(str2);
                                                if (a12 == null && f6 != null) {
                                                    a12 = f6;
                                                }
                                                if (!com.anythink.core.d.n.a(a12)) {
                                                    lVar = a12;
                                                    str4 = q6;
                                                    z8 = true;
                                                    String unused2 = f.this.f13262l;
                                                    (lVar != null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                                                    long j11 = elapsedRealtime2;
                                                    String str9 = str2;
                                                    int i11 = iArr[0];
                                                    ar arVar5 = arVar;
                                                    lVar2 = lVar;
                                                    int i12 = 2;
                                                    a9 = aj.a(str7, str9, lVar2, i10, i11, arVar5.f13708g, arVar5.i, !h9 ? 1 : 2, arVar5.b());
                                                    a9.j(j9);
                                                    a9.c(j11);
                                                    a9.K(str);
                                                    map = b9;
                                                    if (map != null) {
                                                        a9.b(map);
                                                    }
                                                    if (lVar2 != null) {
                                                        try {
                                                            try {
                                                                f.a(lVar2, a9);
                                                                f.b(lVar2, a9);
                                                            } catch (Throwable th) {
                                                                th.printStackTrace();
                                                            }
                                                        } catch (com.anythink.core.common.h.m e6) {
                                                            f.this.a(true, a9, (Throwable) e6, arVar);
                                                            return;
                                                        }
                                                    }
                                                    if (arVar.d()) {
                                                        int c4 = f.this.c();
                                                        if (c4 > 0 && lVar2 != null) {
                                                            com.anythink.core.common.h.c a13 = a.a().a(context, str2);
                                                            if (a13 != null) {
                                                                String unused3 = f.this.f13262l;
                                                                lVar2.q();
                                                                if (c4 >= lVar2.q()) {
                                                                    a9.b(false);
                                                                    a9.L(4);
                                                                    bv o9 = a13.o();
                                                                    if (o9 != null) {
                                                                        a9.a(o9);
                                                                    }
                                                                    a9.b(1);
                                                                    com.anythink.core.common.u.c.a(g9).a(10, a9);
                                                                    com.anythink.core.common.u.c.a(g9).a(12, a9);
                                                                    f.this.f13255d = false;
                                                                    com.anythink.core.common.d.a aVar3 = aVar;
                                                                    if (aVar3 != null) {
                                                                        aVar3.onAdLoaded();
                                                                        f.this.f13258g.b(aVar);
                                                                    }
                                                                    return;
                                                                }
                                                                com.anythink.core.common.d.a aVar4 = aVar;
                                                                if (aVar4 != null) {
                                                                    aVar4.onAdLoaded();
                                                                    f.this.f13258g.b(aVar);
                                                                }
                                                                String unused4 = f.this.f13262l;
                                                                lVar2.q();
                                                                ar arVar6 = arVar;
                                                                int i13 = arVar6.f13704c;
                                                                arVar6.f13703b = i13;
                                                                a9.D(i13);
                                                                arVar.f13704c = 9;
                                                                a9.C(9);
                                                            } else {
                                                                f.this.b();
                                                            }
                                                        }
                                                    } else {
                                                        f.this.b();
                                                    }
                                                    if (lVar2 != null && f.this.f13264n) {
                                                        currentTimeMillis = System.currentTimeMillis() - f.this.f13265o;
                                                        if (currentTimeMillis > 0 && currentTimeMillis < lVar2.aD()) {
                                                            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                                            a9.L(7);
                                                            f.this.a(!f.this.f13266p, a9, new com.anythink.core.common.h.m(errorCode, errorCode.printStackTrace()), arVar);
                                                            f.this.f13266p = true;
                                                            return;
                                                        }
                                                    }
                                                    f.h(f.this);
                                                    f.i(f.this);
                                                    f.this.f13266p = false;
                                                    com.anythink.core.a.c.a();
                                                    a10 = com.anythink.core.a.c.a(g9, str);
                                                    if (a10 == -1) {
                                                        String str10 = ErrorCode.loadCappingError;
                                                        if (a10 == 9) {
                                                            str10 = ErrorCode.loadCappingError_Global;
                                                        } else if (a10 == 10) {
                                                            str10 = ErrorCode.loadCappingError_Format;
                                                        }
                                                        AdError errorCode2 = ErrorCode.getErrorCode(str10, "", "");
                                                        a9.L(a10);
                                                        f.this.a(true, a9, (Throwable) new com.anythink.core.common.h.m(errorCode2, errorCode2.printStackTrace()), arVar);
                                                        return;
                                                    }
                                                    if (lVar2 != null && com.anythink.core.a.c.a().a(g9, str2, lVar2) != -1) {
                                                        AdError errorCode3 = ErrorCode.getErrorCode(ErrorCode.loadCappingError, "", "");
                                                        a9.L(a10);
                                                        f.this.a(true, a9, (Throwable) new com.anythink.core.common.h.m(errorCode3, errorCode3.printStackTrace()), arVar);
                                                        return;
                                                    }
                                                    if (f.this.g()) {
                                                        Log.i("anythink", "Placement(" + str2 + ") is loading.");
                                                        e.a(arVar.f13708g, e.f13041c, str2, f.this.f13263m, f.this.f13256e);
                                                        return;
                                                    }
                                                    a11.g(str2);
                                                    f fVar4 = f.this;
                                                    fVar4.f13255d = true;
                                                    Iterator<g> it = fVar4.f13254c.values().iterator();
                                                    while (it.hasNext()) {
                                                        it.next().f();
                                                    }
                                                    if (!z9 && (lVar2 == null || lVar2.aR() || h9)) {
                                                        i12 = 3;
                                                    }
                                                    long currentTimeMillis2 = System.currentTimeMillis();
                                                    arVar.f13713m.c(currentTimeMillis2);
                                                    arVar.f13713m.d(currentTimeMillis2);
                                                    f.a(f.this, context, p6, str4, lVar2, arVar, a9, str, str7, i12, z8);
                                                    return;
                                                }
                                            }
                                            lVar = a12;
                                            str4 = q6;
                                            z8 = false;
                                            String unused22 = f.this.f13262l;
                                            (lVar != null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                                            long j112 = elapsedRealtime2;
                                            String str92 = str2;
                                            int i112 = iArr[0];
                                            ar arVar52 = arVar;
                                            lVar2 = lVar;
                                            int i122 = 2;
                                            a9 = aj.a(str7, str92, lVar2, i10, i112, arVar52.f13708g, arVar52.i, !h9 ? 1 : 2, arVar52.b());
                                            a9.j(j9);
                                            a9.c(j112);
                                            a9.K(str);
                                            map = b9;
                                            if (map != null) {
                                            }
                                            if (lVar2 != null) {
                                            }
                                            if (arVar.d()) {
                                            }
                                            if (lVar2 != null) {
                                                currentTimeMillis = System.currentTimeMillis() - f.this.f13265o;
                                                if (currentTimeMillis > 0) {
                                                    AdError errorCode4 = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                                    a9.L(7);
                                                    f.this.a(!f.this.f13266p, a9, new com.anythink.core.common.h.m(errorCode4, errorCode4.printStackTrace()), arVar);
                                                    f.this.f13266p = true;
                                                    return;
                                                }
                                            }
                                            f.h(f.this);
                                            f.i(f.this);
                                            f.this.f13266p = false;
                                            com.anythink.core.a.c.a();
                                            a10 = com.anythink.core.a.c.a(g9, str);
                                            if (a10 == -1) {
                                            }
                                        }
                                        f.this.a(arVar, ErrorCode.getErrorCode(ErrorCode.appIdOrPlaceIdEmpty, "", ""));
                                        if (com.anythink.core.common.d.t.b().F()) {
                                            Log.e("anythink", "Please check these params in your code (AppId: " + com.anythink.core.common.d.t.b().p() + ", AppKey: " + com.anythink.core.common.d.t.b().q() + ", PlacementId: " + str2 + ")");
                                        }
                                        f.this.f13255d = false;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }, 2);
            }
        }
        j9 = elapsedRealtime;
        b9 = u.a().b(str2);
        final int[] iArr2 = {0};
        if (b9.containsKey(bu.f13916S)) {
        }
        i = arVar.f13704c;
        if (i != 0) {
        }
        StackTraceElement[] stackTrace2 = new Throwable().getStackTrace();
        u.a().a(str2, stackTrace2);
        if (!TextUtils.equals(str, "4")) {
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.f.1
            /* JADX WARN: Removed duplicated region for block: B:112:0x0324  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x034e  */
            /* JADX WARN: Removed duplicated region for block: B:149:0x02b3 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:150:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:160:0x01cc  */
            /* JADX WARN: Removed duplicated region for block: B:161:0x01aa A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x01ca  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01f9 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0223 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0005, B:6:0x0018, B:8:0x001e, B:11:0x0023, B:13:0x002c, B:15:0x0032, B:17:0x0034, B:19:0x003c, B:21:0x0042, B:22:0x005c, B:24:0x005e, B:26:0x0064, B:27:0x006b, B:30:0x008c, B:31:0x0094, B:33:0x00ae, B:35:0x00bf, B:37:0x00cb, B:38:0x00ce, B:40:0x00eb, B:42:0x00f9, B:44:0x0107, B:47:0x0111, B:49:0x0139, B:50:0x0140, B:52:0x014e, B:53:0x0150, B:58:0x016c, B:59:0x0184, B:63:0x018f, B:66:0x01a0, B:69:0x01b2, B:72:0x01ce, B:74:0x01f9, B:76:0x0217, B:78:0x0223, B:81:0x022d, B:83:0x023b, B:85:0x0249, B:87:0x0256, B:88:0x0259, B:90:0x0275, B:91:0x0281, B:94:0x0284, B:96:0x0288, B:97:0x0294, B:98:0x02ad, B:100:0x02ba, B:102:0x02c2, B:104:0x02d1, B:106:0x02d9, B:107:0x0303, B:110:0x0306, B:116:0x0330, B:117:0x034b, B:123:0x0350, B:125:0x035c, B:126:0x0379, B:129:0x037c, B:131:0x0384, B:132:0x03b3, B:135:0x03b5, B:136:0x03ca, B:138:0x03d0, B:142:0x03de, B:146:0x03e8, B:147:0x040c, B:149:0x02b3, B:154:0x0209, B:156:0x020d, B:157:0x0214, B:161:0x01aa, B:164:0x0177, B:165:0x017e, B:167:0x040e, B:169:0x0429, B:170:0x0463, B:171:0x0468, B:173:0x00ba, B:174:0x008f, B:151:0x01fe), top: B:3:0x0005, inners: #1, #2 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                String str3;
                com.anythink.core.d.l lVar;
                String str4;
                boolean z8;
                com.anythink.core.d.l lVar2;
                com.anythink.core.common.h.n a9;
                Map<String, Object> map;
                int a10;
                long currentTimeMillis;
                synchronized (f.this) {
                    try {
                        com.anythink.core.common.d.t.b().b(f.this.f13252a);
                        if (!f.this.g() || arVar.f13704c == 0) {
                            if (f.a(f.this) || arVar.f13704c != 5) {
                                if (f.this.n() && arVar.f13704c == 0) {
                                    Log.e("anythink", "PlacementId(" + str2 + ") the load api calls are not allowed in Auto-load mode");
                                    return;
                                }
                                f fVar = f.this;
                                if (fVar.f13258g == null) {
                                    fVar.f13258g = new n();
                                }
                                n nVar = f.this.f13258g;
                                String str5 = str2;
                                String str6 = str;
                                nVar.f14925a = str5;
                                nVar.f14926b = str6;
                                nVar.a(aVar);
                                ar arVar2 = arVar;
                                f fVar2 = f.this;
                                arVar2.f13706e = fVar2.f13258g;
                                int i4 = arVar2.f13704c;
                                if (i4 == 4 || i4 == 5) {
                                    fVar2.f13257f++;
                                } else {
                                    fVar2.f13257f = 1;
                                }
                                f.c(fVar2);
                                int i9 = arVar.f13704c;
                                com.anythink.core.common.d.t.b().a(context, true);
                                if (TextUtils.isEmpty(arVar.f13702a)) {
                                    str3 = com.anythink.core.common.v.p.a(context);
                                    arVar.f13702a = str3;
                                } else {
                                    str3 = arVar.f13702a;
                                }
                                String str7 = str3;
                                f fVar3 = f.this;
                                String str8 = arVar.f13702a;
                                com.anythink.core.common.d.a aVar2 = aVar;
                                com.anythink.core.common.p.c cVar = fVar3.i;
                                if (cVar != null) {
                                    cVar.a(str8, aVar2);
                                }
                                f.this.f13268r = arVar;
                                f.this.f13267q = arVar.b();
                                if (com.anythink.core.common.d.t.b().g() != null && !TextUtils.isEmpty(com.anythink.core.common.d.t.b().p()) && !TextUtils.isEmpty(com.anythink.core.common.d.t.b().q()) && !com.anythink.core.common.v.q.a(str2)) {
                                    Context g9 = com.anythink.core.common.d.t.b().g();
                                    String p6 = com.anythink.core.common.d.t.b().p();
                                    String q6 = com.anythink.core.common.d.t.b().q();
                                    boolean z9 = com.anythink.core.common.d.t.b().z();
                                    ar arVar3 = arVar;
                                    int i10 = arVar3.f13704c;
                                    com.anythink.core.common.h.h hVar = arVar3.f13713m;
                                    if (hVar != null) {
                                        hVar.b(System.currentTimeMillis());
                                    }
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                    ar arVar4 = arVar;
                                    if (arVar4.f13714n != 0) {
                                        elapsedRealtime2 = arVar4.f13715o;
                                    }
                                    com.anythink.core.d.n a11 = com.anythink.core.d.n.a(context);
                                    com.anythink.core.d.l a12 = f.a(f.this, z9, b9);
                                    boolean h9 = a11.h(str2);
                                    if (!z9 && a12 == null) {
                                        a12 = i10 == 13 ? a11.d(str2) : i10 == 14 ? a11.e(str2) : a11.c(str2);
                                        com.anythink.core.d.l f6 = a11.f(str2);
                                        if (a12 == null && f6 != null) {
                                            a12 = f6;
                                        }
                                        if (!com.anythink.core.d.n.a(a12)) {
                                            lVar = a12;
                                            str4 = q6;
                                            z8 = true;
                                            String unused22 = f.this.f13262l;
                                            (lVar != null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                                            long j112 = elapsedRealtime2;
                                            String str92 = str2;
                                            int i112 = iArr2[0];
                                            ar arVar52 = arVar;
                                            lVar2 = lVar;
                                            int i122 = 2;
                                            a9 = aj.a(str7, str92, lVar2, i10, i112, arVar52.f13708g, arVar52.i, !h9 ? 1 : 2, arVar52.b());
                                            a9.j(j9);
                                            a9.c(j112);
                                            a9.K(str);
                                            map = b9;
                                            if (map != null) {
                                                a9.b(map);
                                            }
                                            if (lVar2 != null) {
                                                try {
                                                    try {
                                                        f.a(lVar2, a9);
                                                        f.b(lVar2, a9);
                                                    } catch (Throwable th) {
                                                        th.printStackTrace();
                                                    }
                                                } catch (com.anythink.core.common.h.m e6) {
                                                    f.this.a(true, a9, (Throwable) e6, arVar);
                                                    return;
                                                }
                                            }
                                            if (arVar.d()) {
                                                int c4 = f.this.c();
                                                if (c4 > 0 && lVar2 != null) {
                                                    com.anythink.core.common.h.c a13 = a.a().a(context, str2);
                                                    if (a13 != null) {
                                                        String unused3 = f.this.f13262l;
                                                        lVar2.q();
                                                        if (c4 >= lVar2.q()) {
                                                            a9.b(false);
                                                            a9.L(4);
                                                            bv o9 = a13.o();
                                                            if (o9 != null) {
                                                                a9.a(o9);
                                                            }
                                                            a9.b(1);
                                                            com.anythink.core.common.u.c.a(g9).a(10, a9);
                                                            com.anythink.core.common.u.c.a(g9).a(12, a9);
                                                            f.this.f13255d = false;
                                                            com.anythink.core.common.d.a aVar3 = aVar;
                                                            if (aVar3 != null) {
                                                                aVar3.onAdLoaded();
                                                                f.this.f13258g.b(aVar);
                                                            }
                                                            return;
                                                        }
                                                        com.anythink.core.common.d.a aVar4 = aVar;
                                                        if (aVar4 != null) {
                                                            aVar4.onAdLoaded();
                                                            f.this.f13258g.b(aVar);
                                                        }
                                                        String unused4 = f.this.f13262l;
                                                        lVar2.q();
                                                        ar arVar6 = arVar;
                                                        int i13 = arVar6.f13704c;
                                                        arVar6.f13703b = i13;
                                                        a9.D(i13);
                                                        arVar.f13704c = 9;
                                                        a9.C(9);
                                                    } else {
                                                        f.this.b();
                                                    }
                                                }
                                            } else {
                                                f.this.b();
                                            }
                                            if (lVar2 != null && f.this.f13264n) {
                                                currentTimeMillis = System.currentTimeMillis() - f.this.f13265o;
                                                if (currentTimeMillis > 0 && currentTimeMillis < lVar2.aD()) {
                                                    AdError errorCode4 = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                                    a9.L(7);
                                                    f.this.a(!f.this.f13266p, a9, new com.anythink.core.common.h.m(errorCode4, errorCode4.printStackTrace()), arVar);
                                                    f.this.f13266p = true;
                                                    return;
                                                }
                                            }
                                            f.h(f.this);
                                            f.i(f.this);
                                            f.this.f13266p = false;
                                            com.anythink.core.a.c.a();
                                            a10 = com.anythink.core.a.c.a(g9, str);
                                            if (a10 == -1) {
                                                String str10 = ErrorCode.loadCappingError;
                                                if (a10 == 9) {
                                                    str10 = ErrorCode.loadCappingError_Global;
                                                } else if (a10 == 10) {
                                                    str10 = ErrorCode.loadCappingError_Format;
                                                }
                                                AdError errorCode2 = ErrorCode.getErrorCode(str10, "", "");
                                                a9.L(a10);
                                                f.this.a(true, a9, (Throwable) new com.anythink.core.common.h.m(errorCode2, errorCode2.printStackTrace()), arVar);
                                                return;
                                            }
                                            if (lVar2 != null && com.anythink.core.a.c.a().a(g9, str2, lVar2) != -1) {
                                                AdError errorCode3 = ErrorCode.getErrorCode(ErrorCode.loadCappingError, "", "");
                                                a9.L(a10);
                                                f.this.a(true, a9, (Throwable) new com.anythink.core.common.h.m(errorCode3, errorCode3.printStackTrace()), arVar);
                                                return;
                                            }
                                            if (f.this.g()) {
                                                Log.i("anythink", "Placement(" + str2 + ") is loading.");
                                                e.a(arVar.f13708g, e.f13041c, str2, f.this.f13263m, f.this.f13256e);
                                                return;
                                            }
                                            a11.g(str2);
                                            f fVar4 = f.this;
                                            fVar4.f13255d = true;
                                            Iterator<g> it = fVar4.f13254c.values().iterator();
                                            while (it.hasNext()) {
                                                it.next().f();
                                            }
                                            if (!z9 && (lVar2 == null || lVar2.aR() || h9)) {
                                                i122 = 3;
                                            }
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            arVar.f13713m.c(currentTimeMillis2);
                                            arVar.f13713m.d(currentTimeMillis2);
                                            f.a(f.this, context, p6, str4, lVar2, arVar, a9, str, str7, i122, z8);
                                            return;
                                        }
                                    }
                                    lVar = a12;
                                    str4 = q6;
                                    z8 = false;
                                    String unused222 = f.this.f13262l;
                                    (lVar != null ? "本地缓存策略为空" : Integer.valueOf(lVar.aZ())).toString();
                                    long j1122 = elapsedRealtime2;
                                    String str922 = str2;
                                    int i1122 = iArr2[0];
                                    ar arVar522 = arVar;
                                    lVar2 = lVar;
                                    int i1222 = 2;
                                    a9 = aj.a(str7, str922, lVar2, i10, i1122, arVar522.f13708g, arVar522.i, !h9 ? 1 : 2, arVar522.b());
                                    a9.j(j9);
                                    a9.c(j1122);
                                    a9.K(str);
                                    map = b9;
                                    if (map != null) {
                                    }
                                    if (lVar2 != null) {
                                    }
                                    if (arVar.d()) {
                                    }
                                    if (lVar2 != null) {
                                        currentTimeMillis = System.currentTimeMillis() - f.this.f13265o;
                                        if (currentTimeMillis > 0) {
                                            AdError errorCode42 = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                            a9.L(7);
                                            f.this.a(!f.this.f13266p, a9, new com.anythink.core.common.h.m(errorCode42, errorCode42.printStackTrace()), arVar);
                                            f.this.f13266p = true;
                                            return;
                                        }
                                    }
                                    f.h(f.this);
                                    f.i(f.this);
                                    f.this.f13266p = false;
                                    com.anythink.core.a.c.a();
                                    a10 = com.anythink.core.a.c.a(g9, str);
                                    if (a10 == -1) {
                                    }
                                }
                                f.this.a(arVar, ErrorCode.getErrorCode(ErrorCode.appIdOrPlaceIdEmpty, "", ""));
                                if (com.anythink.core.common.d.t.b().F()) {
                                    Log.e("anythink", "Please check these params in your code (AppId: " + com.anythink.core.common.d.t.b().p() + ", AppKey: " + com.anythink.core.common.d.t.b().q() + ", PlacementId: " + str2 + ")");
                                }
                                f.this.f13255d = false;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }, 2);
    }

    private void a(Context context, String str, String str2, com.anythink.core.d.l lVar, ar arVar, com.anythink.core.common.h.n nVar, String str3, String str4, int i, boolean z8) {
        com.anythink.core.d.n.a(context).a(lVar, str, str2, this.f13253b, arVar.f13708g, new AnonymousClass2(nVar, str3, arVar, str4), i, z8, arVar.b());
    }

    private void a(Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, ar arVar) {
        if (nVar != null) {
            nVar.e(SystemClock.elapsedRealtime());
        }
        com.anythink.core.common.w.b.h hVar = new com.anythink.core.common.w.b.h(context, str, lVar, new AnonymousClass3(arVar, context, str, str2, lVar, nVar));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new com.anythink.core.common.w.b.e());
        new com.anythink.core.common.w.b.g(arrayList, hVar, 0).a(hVar);
    }

    private static void a(bp bpVar) {
        com.anythink.core.common.h.n c4 = bpVar.c();
        if (bpVar.b() == 0) {
            c4.L(5);
            if (bpVar.a().D() == 1) {
                throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
            }
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
        }
        if (bpVar.i()) {
            return;
        }
        c4.L(6);
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
        throw new com.anythink.core.common.h.m(errorCode, errorCode.printStackTrace());
    }

    public static void a(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
        int a9 = com.anythink.core.a.a.a(com.anythink.core.common.d.t.b().g()).a(lVar, nVar.aI());
        if (a9 != -1) {
            String str = ErrorCode.outOfCapError;
            if (a9 != 2) {
                switch (a9) {
                    case 7:
                        str = ErrorCode.outOfCapError_day_Global;
                        break;
                    case 8:
                        str = ErrorCode.outOfCapError_day_Format;
                        break;
                    case 9:
                        str = ErrorCode.outOfCapError_hour_Global;
                        break;
                    case 10:
                        str = ErrorCode.outOfCapError_hour_Format;
                        break;
                }
            }
            nVar.L(1);
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(str, "", ""), "Capping.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z8, com.anythink.core.common.h.n nVar, Throwable th, ar arVar) {
        AdError errorCode;
        if (th instanceof com.anythink.core.common.h.m) {
            errorCode = ((com.anythink.core.common.h.m) th).f14145a;
        } else {
            errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", th.getMessage());
        }
        a(z8, nVar, errorCode, arVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z8, com.anythink.core.common.h.n nVar, AdError adError, ar arVar) {
        this.f13255d = false;
        nVar.b(false);
        if (z8) {
            com.anythink.core.common.u.c.a(this.f13252a).a(10, nVar);
            com.anythink.core.common.u.e.a(nVar, adError);
        }
        a(arVar, adError);
    }

    public final void a(com.anythink.core.common.h.c cVar) {
        List<bx> list;
        if (cVar == null || (list = this.f13259h) == null) {
            return;
        }
        synchronized (list) {
            try {
                if (this.f13259h.size() > 0) {
                    this.f13259h.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ATAdStatusInfo a(Context context, Map<String, Object> map) {
        boolean g9 = g();
        com.anythink.core.common.h.ae aeVar = new com.anythink.core.common.h.ae();
        aeVar.a(map);
        aeVar.a(this.f13267q);
        com.anythink.core.common.h.c b9 = b(context, true, false, aeVar);
        ATAdStatusInfo aTAdStatusInfo = new ATAdStatusInfo(g9, b9 != null, b9 != null ? b9.p() : null);
        if (this.f13260j != null && System.currentTimeMillis() - this.f13265o > com.anythink.basead.exoplayer.i.a.f8040f && a(aTAdStatusInfo, 5) && (c() <= 0 || !aTAdStatusInfo.isReady())) {
            com.anythink.core.common.p.d dVar = this.f13260j;
            dVar.a(context, ((com.anythink.core.common.p.a) dVar).a(), 5);
        }
        return aTAdStatusInfo;
    }

    public final List<ATAdInfo> a(Context context, com.anythink.core.common.h.ae aeVar) {
        List<com.anythink.core.common.h.c> d2 = d(context);
        if (d2 == null || d2.size() <= 0) {
            return null;
        }
        return a(aeVar, d2);
    }

    private static List<ATAdInfo> a(com.anythink.core.common.h.ae aeVar, List<com.anythink.core.common.h.c> list) {
        com.anythink.core.common.h.n detail;
        com.anythink.core.common.h.n trackingInfo;
        ArrayList arrayList = new ArrayList(3);
        if (list != null && list.size() > 0) {
            Iterator<com.anythink.core.common.h.c> it = list.iterator();
            com.anythink.core.common.h.d dVar = null;
            while (it.hasNext()) {
                com.anythink.core.common.h.c next = it.next();
                if (aeVar != null) {
                    dVar = aeVar.b();
                }
                BaseAd f6 = next != null ? next.f() : null;
                ATBaseAdAdapter e6 = next != null ? next.e() : null;
                if (f6 != null) {
                    if (dVar != null && (detail = f6.getDetail()) != null) {
                        detail.a(dVar);
                    }
                    arrayList.add(com.anythink.core.common.d.l.a(f6, e6, 4));
                } else if (e6 != null) {
                    if (dVar != null && (trackingInfo = e6.getTrackingInfo()) != null) {
                        trackingInfo.a(dVar);
                    }
                    arrayList.add(com.anythink.core.common.d.l.a(e6, 4));
                }
            }
        }
        return arrayList;
    }

    public final com.anythink.core.common.h.c a(Context context, boolean z8, boolean z9, com.anythink.core.common.h.ae aeVar) {
        if (a(z9, z8, aeVar)) {
            return null;
        }
        return a.a().a(context, this.f13253b, z8, z9, aeVar);
    }

    private boolean a(boolean z8, boolean z9, com.anythink.core.common.h.ae aeVar) {
        Map<String, Object> a9 = aeVar != null ? aeVar.a() : null;
        com.anythink.core.common.h.d b9 = aeVar != null ? aeVar.b() : null;
        com.anythink.core.d.l a10 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f13253b);
        String str = TextUtils.isEmpty(this.f13256e) ? "" : this.f13256e;
        if (a10 == null) {
            a10 = com.anythink.core.d.n.a(this.f13252a).a(this.f13253b);
        }
        com.anythink.core.d.l lVar = a10;
        if (lVar == null) {
            if (z8) {
                com.anythink.core.common.u.e.a(str, this.f13253b, lVar, 4, "", a9, aeVar);
            } else if (z9) {
                com.anythink.core.common.u.e.a(str, this.f13253b, false, 4, lVar, (com.anythink.core.common.h.c) null, "", "", a9, b9, aeVar);
            }
            return true;
        }
        com.anythink.core.a.d.a();
        int a11 = com.anythink.core.a.d.a(this.f13253b, lVar);
        if (a11 != -1) {
            if (z8) {
                com.anythink.core.common.u.e.a(str, this.f13253b, lVar, a11, "", a9, aeVar);
            } else if (z9) {
                com.anythink.core.common.u.e.a(str, this.f13253b, false, a11, lVar, (com.anythink.core.common.h.c) null, "", "", a9, b9, aeVar);
            }
            return true;
        }
        int a12 = com.anythink.core.a.a.a(this.f13252a).a(lVar, this.f13253b);
        if (a12 == -1) {
            return false;
        }
        if (z8) {
            com.anythink.core.common.u.e.a(str, this.f13253b, lVar, a12, "", a9, aeVar);
        } else if (z9) {
            com.anythink.core.common.u.e.a(str, this.f13253b, false, a12, lVar, (com.anythink.core.common.h.c) null, "", "", a9, b9, aeVar);
        }
        return true;
    }

    public static void b(com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar) {
        com.anythink.core.a.d.a();
        int a9 = com.anythink.core.a.d.a(nVar.aI(), lVar);
        if (a9 != -1) {
            nVar.L(2);
            String str = ErrorCode.inPacingError;
            if (a9 != 3) {
                if (a9 == 11) {
                    str = ErrorCode.inPacingError_Global;
                } else if (a9 == 12) {
                    str = ErrorCode.inPacingError_Format;
                }
            }
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(str, "", ""), "Pacing.");
        }
    }

    public final void b(Context context, String str, String str2, ar arVar, com.anythink.core.common.d.a aVar) {
        String str3;
        if (w.a().b()) {
            com.anythink.core.d.l a9 = com.anythink.core.d.n.a(context).a(this.f13253b);
            if (a9 != null && w.a().a(this.f13253b)) {
                Log.w("anythink", "Forbidden placement");
                if (aVar != null) {
                    aVar.onAdLoadFail(ErrorCode.getErrorCode(ErrorCode.sharedPlacementIdError, "", ""));
                    return;
                }
                return;
            }
            if (w.a().a(a9)) {
                String u7 = a9.u();
                com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
                a(dVar, str2, a9);
                arVar.i = dVar;
                com.anythink.core.common.d.a[] aVarArr = {aVar};
                if (a9.y() == 1) {
                    com.anythink.core.common.h.c b9 = b(context, u7, str, arVar);
                    if (b9 != null) {
                        String str4 = "";
                        str3 = u7;
                        String a10 = com.anythink.core.common.v.p.a(context);
                        arVar.f13702a = a10;
                        ab.a("Shared", "placementId:" + str2 + ";result_callback:success;");
                        com.anythink.core.common.h.n i = b9.i();
                        if (i != null) {
                            str4 = i.aJ();
                        }
                        com.anythink.core.common.u.e.a(str2, str3, i, str, a10, a9, true, "1", "2", str4);
                        com.anythink.core.common.d.a aVar2 = aVarArr[0];
                        if (aVar2 != null) {
                            aVar2.onAdLoaded();
                        }
                        aVarArr[0] = null;
                    } else {
                        str3 = u7;
                        w.a().b(str3, arVar.b());
                    }
                    a(context, str, str2, arVar, new AnonymousClass7(aVarArr, str2, str3, str, arVar, a9));
                    return;
                }
                a(context, str, str2, arVar, new AnonymousClass8(str2, u7, str, arVar, a9, aVarArr, context));
                return;
            }
        }
        a(context, str, str2, arVar, aVar);
    }

    private void a(String str, com.anythink.core.common.d.a aVar) {
        com.anythink.core.common.p.c cVar = this.i;
        if (cVar != null) {
            cVar.a(str, aVar);
        }
    }

    public final void a(ar arVar, AdError adError) {
        n nVar = this.f13258g;
        if (nVar != null) {
            nVar.a(1, arVar, (cb) null, adError);
        }
    }

    public final boolean a(ATAdStatusInfo aTAdStatusInfo, int i) {
        com.anythink.core.d.l a9 = com.anythink.core.d.n.a(com.anythink.core.common.d.t.b().g()).a(this.f13253b);
        if ((a9 != null && c() >= a9.q() && aTAdStatusInfo != null && aTAdStatusInfo.isReady()) || ATAdxSetting.getInstance().isAdxNetworkMode(this.f13253b)) {
            return false;
        }
        if (i == 6 || i == 18) {
            int g9 = a9.g();
            if (g9 != -1) {
                if (g9 == 1) {
                    return false;
                }
                if (i == 6 && g9 == 2) {
                    return true;
                }
                return i == 18 && g9 == 3;
            }
            if (i == 18) {
                return false;
            }
        }
        if (!n()) {
            return a9 != null && a9.ao() == 1;
        }
        if (a(i, a9 != null ? a9.bz() : null)) {
            return true;
        }
        return a9 != null && a9.ao() == 1 && (i == 5 || i == 6 || i == 7);
    }

    private boolean a(int i, List<String> list) {
        com.anythink.core.common.p.d dVar = this.f13260j;
        if (dVar != null) {
            return dVar.a(i, list);
        }
        return true;
    }

    public final void a(AdError adError) {
        com.anythink.core.common.p.d dVar = this.f13260j;
        if (dVar != null) {
            dVar.a(adError, this.f13257f, a((ATAdStatusInfo) null, 4));
        }
    }

    private static String a(com.anythink.core.common.h.x xVar) {
        return xVar.f14313b + xVar.f14314c + xVar.f14317f + System.currentTimeMillis();
    }

    public static String a(String str, String str2, String str3) {
        return str + str2 + str3 + System.currentTimeMillis();
    }

    public final List<ATAdInfo> a(Context context) {
        List<com.anythink.core.common.h.c> list = null;
        if (w.a().b()) {
            com.anythink.core.d.l a9 = com.anythink.core.d.n.a(context).a(this.f13253b);
            if (a9 != null && w.a().a(this.f13253b)) {
                Log.w("anythink", "Forbidden placement");
                return null;
            }
            if (w.a().a(a9)) {
                String u7 = a9.u();
                w.a();
                f a10 = w.a(u7, String.valueOf(a9.aq()));
                com.anythink.core.common.h.ae aeVar = new com.anythink.core.common.h.ae();
                com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
                if (a10 != null) {
                    a(dVar, this.f13253b, a9);
                    aeVar.a(dVar);
                    aeVar.a(a10.f13267q);
                    list = a10.d(context);
                }
                List<com.anythink.core.common.h.c> d2 = d(context);
                if (list == null) {
                    return a(aeVar, d2);
                }
                if (d2 != null && d2.size() != 0) {
                    d2.addAll(list);
                    Collections.sort(d2, new AnonymousClass9());
                    return a(aeVar, d2);
                }
                return a(aeVar, list);
            }
        }
        return a(context, (com.anythink.core.common.h.ae) null);
    }

    public final com.anythink.core.common.h.c b(Context context, boolean z8, boolean z9, com.anythink.core.common.h.ae aeVar) {
        if (w.a().b()) {
            com.anythink.core.d.l a9 = com.anythink.core.d.n.a(context).a(this.f13253b);
            if (a9 != null && w.a().a(this.f13253b)) {
                Log.w("anythink", "Forbidden placement");
                return null;
            }
            if (a9 != null && w.a().a(a9)) {
                return a(context, z8, z9, aeVar, this, a9);
            }
        }
        return a(context, z8, z9, aeVar);
    }

    public final List<com.anythink.core.common.h.c> b(Context context) {
        com.anythink.core.d.l a9;
        List<com.anythink.core.common.h.c> c4;
        try {
            List<com.anythink.core.common.h.c> c9 = c(context);
            ArrayList arrayList = new ArrayList();
            if (c9 != null) {
                c9.size();
                arrayList.addAll(c9);
            }
            if (w.a().b() && (a9 = com.anythink.core.d.n.a(context).a(this.f13253b)) != null && w.a().a(a9)) {
                String u7 = a9.u();
                int aq = a9.aq();
                w.a();
                f a10 = w.a(u7, String.valueOf(aq));
                if (a10 != null && (c4 = a10.c(context)) != null && !c4.isEmpty()) {
                    c4.size();
                    arrayList.addAll(c4);
                }
            }
            return arrayList;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    private void a(Context context, String str, String str2, ar arVar, com.anythink.core.common.d.a aVar, f fVar, com.anythink.core.d.l lVar) {
        String str3;
        String u7 = lVar.u();
        com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
        a(dVar, str2, lVar);
        arVar.i = dVar;
        com.anythink.core.common.d.a[] aVarArr = {aVar};
        if (lVar.y() == 1) {
            com.anythink.core.common.h.c b9 = b(context, u7, str, arVar);
            if (b9 != null) {
                String a9 = com.anythink.core.common.v.p.a(context);
                arVar.f13702a = a9;
                ab.a("Shared", "placementId:" + str2 + ";result_callback:success;");
                com.anythink.core.common.h.n i = b9.i();
                if (i != null) {
                    str3 = i.aJ();
                } else {
                    str3 = "";
                }
                com.anythink.core.common.u.e.a(str2, u7, i, str, a9, lVar, true, "1", "2", str3);
                com.anythink.core.common.d.a aVar2 = aVarArr[0];
                if (aVar2 != null) {
                    aVar2.onAdLoaded();
                }
                aVarArr[0] = null;
            } else {
                w.a().b(u7, arVar.b());
            }
            fVar.a(context, str, str2, arVar, new AnonymousClass7(aVarArr, str2, u7, str, arVar, lVar));
            return;
        }
        fVar.a(context, str, str2, arVar, new AnonymousClass8(str2, u7, str, arVar, lVar, aVarArr, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.anythink.core.common.h.c b(Context context, String str, String str2, ar arVar) {
        w.a();
        f a9 = w.a(str, str2);
        if (a9 == null) {
            return null;
        }
        com.anythink.core.common.h.ae aeVar = new com.anythink.core.common.h.ae();
        aeVar.a(arVar.f13708g);
        aeVar.a(arVar.i);
        aeVar.a(arVar.b());
        return a9.a(context, true, false, aeVar);
    }

    public static /* synthetic */ void b(f fVar, Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, ar arVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        bv bvVar;
        List<bv> list;
        bq bqVar;
        ac acVar;
        Map<String, Object> map;
        boolean z11;
        g gVar;
        boolean z12;
        boolean z13;
        ar arVar2 = arVar;
        lVar.A();
        String str3 = str;
        String str4 = str2;
        com.anythink.core.common.u.e.a("1", nVar, str4, str3, "", 0, lVar.aq(), 0L);
        cb cbVar = new cb(arVar2, lVar);
        if (nVar != null) {
            nVar.g(cbVar.e());
            nVar.h(cbVar.f());
        }
        try {
            try {
            } catch (Throwable th) {
                th = th;
                z9 = true;
            }
        } catch (com.anythink.core.common.h.m e6) {
            e = e6;
            z8 = true;
        }
        try {
            if (lVar.bj()) {
                a(lVar, nVar);
                b(lVar, nVar);
                bp a9 = ae.a(lVar, nVar);
                com.anythink.core.common.h.n c4 = a9.c();
                if (a9.b() == 0) {
                    try {
                        c4.L(5);
                        if (a9.a().D() == 1) {
                            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                        }
                        throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                    } catch (Throwable th2) {
                        th = th2;
                        z9 = true;
                        fVar.a(z9, nVar, th, arVar2);
                        return;
                    }
                }
                if (a9.i()) {
                    boolean k6 = a9.k();
                    ArrayList arrayList = new ArrayList(1);
                    ae.b(a9, arrayList);
                    List<bv> d2 = a9.d();
                    if (d2 != null && !d2.isEmpty()) {
                        ae.a(lVar, a9.c(), d2);
                    }
                    List<bv> a10 = ae.a(a9, a9.d());
                    a.a().b(str3);
                    boolean z14 = arrayList.size() > 0;
                    boolean z15 = !z14 && (a9.e() == null || a9.e().size() == 0);
                    nVar.f(SystemClock.elapsedRealtime());
                    if (z15 && ((a10 == null || a10.size() == 0) && ((a9.f() == null || a9.f().size() == 0) && ((a9.g() == null || a9.g().size() == 0) && (a9.h() == null || a9.h().size() == 0))))) {
                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                        nVar.L(6);
                        fVar.a(true, nVar, errorCode, arVar2);
                        fVar.f13255d = false;
                        return;
                    }
                    com.anythink.core.a.c.a();
                    com.anythink.core.a.c.b(fVar.f13252a, str3, lVar);
                    Map<String, Object> b9 = u.a().b(fVar.f13253b);
                    Map<String, bz> map2 = x.a(fVar.f13252a).f17299a;
                    bz remove = map2 != null ? map2.remove(str3) : null;
                    bq a11 = v.a(fVar.f13252a).a(str3, str4);
                    ac a12 = d.a().a(str3);
                    ac acVar2 = new ac(str4);
                    boolean z16 = z15;
                    d.a().a(fVar.f13253b, acVar2);
                    nVar.b(true);
                    nVar.B(cbVar.f());
                    g gVar2 = new g(arVar2.a());
                    gVar2.f13357h = b9;
                    gVar2.i = nVar;
                    gVar2.a(arVar2);
                    gVar2.a(arVar2.f13705d);
                    fVar.f13256e = str4;
                    fVar.f13263m = nVar.aB();
                    List<bv> a13 = com.anythink.core.d.u.a(lVar, lVar.Y());
                    if (a13.size() > 0) {
                        z10 = false;
                        bvVar = a13.get(0);
                    } else {
                        z10 = false;
                        bvVar = null;
                    }
                    if (bvVar != null) {
                        for (bv bvVar2 : a9.e()) {
                            g gVar3 = gVar2;
                            if (bvVar2.z().equals(bvVar.z())) {
                                String str5 = str3;
                                String str6 = str4;
                                bqVar = a11;
                                list = a10;
                                acVar = a12;
                                z11 = z16;
                                z12 = k6;
                                z13 = false;
                                c.a a14 = com.anythink.core.common.a.c.a().a(context, str5, str6, bvVar2, lVar, b9, fVar.f13267q);
                                str3 = str5;
                                str4 = str6;
                                if (a14 != null) {
                                    bv d3 = a14.d();
                                    AdError a15 = ae.a(0, nVar, d3, (z) null);
                                    Objects.toString(a15);
                                    if (a15 != null) {
                                        com.anythink.core.common.a.c.a().a(str3, d3.z());
                                        gVar = gVar3;
                                    } else {
                                        gVar = gVar3;
                                        gVar.J = a14;
                                    }
                                    map = b9;
                                    nVar.d(SystemClock.elapsedRealtime());
                                } else {
                                    map = b9;
                                    gVar = gVar3;
                                }
                            } else {
                                list = a10;
                                bqVar = a11;
                                acVar = a12;
                                map = b9;
                                z11 = z16;
                                gVar = gVar3;
                                z12 = k6;
                                z13 = false;
                            }
                            b9 = map;
                            gVar2 = gVar;
                            a11 = bqVar;
                            a12 = acVar;
                            a10 = list;
                            z10 = z13;
                            k6 = z12;
                            z16 = z11;
                        }
                    }
                    bq bqVar2 = a11;
                    ac acVar3 = a12;
                    boolean z17 = z16;
                    boolean z18 = k6;
                    boolean z19 = z10;
                    List<bv> list2 = a10;
                    g gVar4 = gVar2;
                    com.anythink.core.common.u.c.a(fVar.f13252a).a(10, nVar);
                    Double[] dArr = new Double[1];
                    Boolean bn = lVar.bn();
                    if (a9.j() || (bn != null && bn.booleanValue())) {
                        com.anythink.core.common.h.c a16 = a.a().a(context, str3);
                        if (a16 != null) {
                            dArr[z19 ? 1 : 0] = Double.valueOf(a16.n());
                        }
                    }
                    a9.j();
                    com.anythink.core.common.w.i iVar = new com.anythink.core.common.w.i(list2);
                    com.anythink.core.common.w.h hVar = new com.anythink.core.common.w.h();
                    hVar.f17274a = str3;
                    hVar.f17275b = str4;
                    hVar.f17276c = cbVar;
                    hVar.f17277d = list2;
                    hVar.f17278e = a9.h();
                    hVar.i = z17;
                    hVar.f17282j = nVar.aE();
                    hVar.f17283k = remove;
                    hVar.f17285m = bqVar2;
                    hVar.f17284l = iVar;
                    hVar.f17287o = acVar3;
                    hVar.f17286n = acVar2;
                    hVar.f17279f = a9.f();
                    hVar.f17280g = a9.g();
                    Double d9 = dArr[z19 ? 1 : 0];
                    hVar.f17281h = d9 != null ? d9.doubleValue() : 0.0d;
                    hVar.f17288p = a9.e();
                    gVar4.a(hVar);
                    fVar.f13254c.put(str4, gVar4);
                    com.anythink.core.common.h.h hVar2 = arVar2.f13713m;
                    if (hVar2 != null) {
                        hVar2.h(System.currentTimeMillis());
                    }
                    com.anythink.core.common.u.e.a(arVar2.f13713m, nVar);
                    h hVar3 = new h(str3);
                    gVar4.a(hVar3);
                    hVar3.a(lVar, z18);
                    hVar3.a(fVar.f13261k);
                    hVar3.a(gVar4);
                    fVar.f13255d = z19;
                    if (!z17) {
                        List<bv> e9 = a9.e();
                        com.anythink.core.common.v.b.b a17 = com.anythink.core.common.v.b.b.a();
                        AnonymousClass4 anonymousClass4 = fVar.new AnonymousClass4(context, arVar2, str4, str3, lVar, z14, e9, cbVar, nVar, remove, bqVar2, acVar3, iVar, bn, dArr, z18, hVar3, gVar4);
                        arVar2 = arVar2;
                        a17.b(anonymousClass4);
                    }
                    int i = arVar2.f13704c;
                    if (i == 0 || i == 3) {
                        w.a().a(lVar, 15, arVar2, nVar);
                        return;
                    }
                    return;
                }
                c4.L(6);
                AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                throw new com.anythink.core.common.h.m(errorCode2, errorCode2.printStackTrace());
            }
            nVar.L(5);
            throw new com.anythink.core.common.h.m(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
        } catch (com.anythink.core.common.h.m e10) {
            e = e10;
            z8 = true;
            fVar.a(z8, nVar, e, arVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.anythink.core.common.h.c a(Context context, boolean z8, boolean z9, com.anythink.core.common.h.ae aeVar, f fVar, com.anythink.core.d.l lVar) {
        com.anythink.core.common.h.c cVar;
        boolean z10;
        String str;
        String str2;
        com.anythink.core.common.h.n nVar;
        boolean z11;
        String str3;
        boolean z12;
        com.anythink.core.common.h.c cVar2;
        com.anythink.core.common.h.n i;
        String str4;
        com.anythink.core.common.h.n nVar2;
        String u7 = lVar.u();
        int aq = lVar.aq();
        w.a();
        f a9 = w.a(u7, String.valueOf(aq));
        if (a9 != null) {
            com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
            a(dVar, this.f13253b, lVar);
            if (aeVar != null) {
                aeVar.a(dVar);
                aeVar.a(a9.f13267q);
            }
            cVar = a9.a(context, z8, z9, aeVar);
            if (cVar != null) {
                aj.a(this.f13253b, lVar, cVar.i());
            }
        } else {
            cVar = null;
        }
        com.anythink.core.common.h.c a10 = fVar.a(context, z8, z9, aeVar);
        String str5 = "";
        if (a10 == null) {
            z10 = false;
            str = "";
            str2 = str;
            nVar = null;
        } else {
            nVar = a10.i();
            if (nVar == null) {
                str = "";
                str2 = str;
                nVar = null;
            } else {
                str = nVar.aJ();
                str2 = String.valueOf(nVar.U());
            }
            z10 = true;
        }
        if (cVar != null) {
            com.anythink.core.common.h.n i4 = cVar.i();
            if (i4 != null) {
                str5 = i4.aJ();
            }
            z11 = false;
            str3 = u7;
            z12 = true;
        } else {
            w.a().b(u7, fVar.f13267q);
            w.a().a(lVar, 17, fVar.f13268r, nVar);
            z11 = false;
            str3 = u7;
            z12 = false;
        }
        if (cVar != null) {
            if (a10 != null) {
                if (com.anythink.core.common.v.l.a(cVar.o(), a10.o()) < 0) {
                    cVar.n();
                    a10.n();
                } else {
                    cVar.n();
                    a10.n();
                }
            }
            cVar2 = cVar;
            String str6 = this.f13253b;
            i = cVar2 != null ? cVar2.i() : null;
            if (!z10 || z12) {
                com.anythink.core.common.h.n nVar3 = i;
                str4 = str5;
                nVar2 = nVar3;
                z11 = true;
            } else {
                com.anythink.core.common.h.n nVar4 = i;
                str4 = str5;
                nVar2 = nVar4;
            }
            com.anythink.core.common.u.e.a(str6, str3, lVar, nVar2, z11, z10, z12, str, str4, str2);
            return cVar2;
        }
        cVar2 = a10;
        String str62 = this.f13253b;
        if (cVar2 != null) {
        }
        if (z10) {
        }
        com.anythink.core.common.h.n nVar32 = i;
        str4 = str5;
        nVar2 = nVar32;
        z11 = true;
        com.anythink.core.common.u.e.a(str62, str3, lVar, nVar2, z11, z10, z12, str, str4, str2);
        return cVar2;
    }

    private List<ATAdInfo> a(Context context, f fVar, com.anythink.core.d.l lVar) {
        List<com.anythink.core.common.h.c> list;
        String u7 = lVar.u();
        w.a();
        f a9 = w.a(u7, String.valueOf(lVar.aq()));
        com.anythink.core.common.h.ae aeVar = new com.anythink.core.common.h.ae();
        com.anythink.core.common.h.d dVar = new com.anythink.core.common.h.d();
        if (a9 != null) {
            a(dVar, this.f13253b, lVar);
            aeVar.a(dVar);
            aeVar.a(a9.f13267q);
            list = a9.d(context);
        } else {
            list = null;
        }
        List<com.anythink.core.common.h.c> d2 = fVar.d(context);
        if (list == null) {
            return a(aeVar, d2);
        }
        if (d2 != null && d2.size() != 0) {
            d2.addAll(list);
            Collections.sort(d2, new AnonymousClass9());
            return a(aeVar, d2);
        }
        return a(aeVar, list);
    }

    private static void a(com.anythink.core.common.h.d dVar, String str, com.anythink.core.d.l lVar) {
        dVar.a(str, lVar.ay(), lVar.ai());
    }

    private com.anythink.core.d.l a(boolean z8, Map<String, Object> map) {
        if (!z8 && map != null) {
            Object obj = map.get(CoreDebuggerManager.f17656a);
            if (obj instanceof com.anythink.core.d.l) {
                return (com.anythink.core.d.l) obj;
            }
        }
        return null;
    }

    public static /* synthetic */ boolean a(f fVar) {
        return !TextUtils.isEmpty(fVar.f13256e);
    }

    public static /* synthetic */ com.anythink.core.d.l a(f fVar, boolean z8, Map map) {
        if (z8 || map == null) {
            return null;
        }
        Object obj = map.get(CoreDebuggerManager.f17656a);
        String str = fVar.f13262l;
        if (obj instanceof com.anythink.core.d.l) {
            return (com.anythink.core.d.l) obj;
        }
        return null;
    }

    public static /* synthetic */ void a(f fVar, Context context, String str, String str2, com.anythink.core.d.l lVar, ar arVar, com.anythink.core.common.h.n nVar, String str3, String str4, int i, boolean z8) {
        com.anythink.core.d.n.a(context).a(lVar, str, str2, fVar.f13253b, arVar.f13708g, fVar.new AnonymousClass2(nVar, str3, arVar, str4), i, z8, arVar.b());
    }

    public static /* synthetic */ void a(f fVar, Context context, String str, String str2, com.anythink.core.d.l lVar, com.anythink.core.common.h.n nVar, ar arVar) {
        if (nVar != null) {
            nVar.e(SystemClock.elapsedRealtime());
        }
        com.anythink.core.common.w.b.h hVar = new com.anythink.core.common.w.b.h(context, str, lVar, fVar.new AnonymousClass3(arVar, context, str, str2, lVar, nVar));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new com.anythink.core.common.w.b.e());
        new com.anythink.core.common.w.b.g(arrayList, hVar, 0).a(hVar);
    }
}
