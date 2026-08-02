package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7791a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f7792b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f7793c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f7794d;

    /* renamed from: e, reason: collision with root package name */
    public final ib f7795e;

    /* renamed from: f, reason: collision with root package name */
    public final ib f7796f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f7797g;

    /* renamed from: h, reason: collision with root package name */
    public final ib f7798h;

    /* renamed from: i, reason: collision with root package name */
    public final ib f7799i;

    /* renamed from: j, reason: collision with root package name */
    public final ib f7800j;

    /* renamed from: k, reason: collision with root package name */
    public final ib f7801k;

    /* renamed from: l, reason: collision with root package name */
    public final AdPreferences.Placement f7802l;

    /* renamed from: m, reason: collision with root package name */
    public final ActivityExtra f7803m;
    public AdPreferences n;

    /* renamed from: q, reason: collision with root package name */
    public long f7805q;

    /* renamed from: r, reason: collision with root package name */
    public String f7806r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7807s;

    /* renamed from: t, reason: collision with root package name */
    public final q2 f7808t;

    /* renamed from: u, reason: collision with root package name */
    public final n2 f7809u;

    /* renamed from: w, reason: collision with root package name */
    public int f7810w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f7811x;

    /* renamed from: y, reason: collision with root package name */
    public Long f7812y;
    public C0372m z;
    public Ad o = null;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f7804p = new AtomicBoolean(false);
    public final ConcurrentHashMap v = new ConcurrentHashMap();

    public w2(Context context, AdPreferences.Placement placement, AdPreferences adPreferences, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10) {
        this.f7802l = placement;
        this.n = adPreferences;
        if (context instanceof Activity) {
            Context a3 = w0.a(context);
            this.f7791a = a3 == null ? context : a3;
            this.f7803m = new ActivityExtra((Activity) context);
        } else {
            this.f7791a = context;
            this.f7803m = null;
        }
        this.f7811x = true;
        this.f7792b = ibVar;
        this.f7793c = ibVar2;
        this.f7794d = ibVar3;
        this.f7795e = ibVar4;
        this.f7796f = ibVar5;
        this.f7797g = ibVar6;
        this.f7798h = ibVar7;
        this.f7799i = ibVar8;
        this.f7800j = ibVar9;
        this.f7801k = ibVar10;
        this.f7808t = new q2(this);
        this.f7809u = new n2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (r6 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
    
        r7 = (java.util.List) r4.v.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0037, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0038, code lost:
    
        com.startapp.sdk.internal.d9.a(r7);
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058 A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:16:0x0022, B:17:0x0065, B:21:0x0015, B:24:0x002e, B:28:0x003e, B:33:0x004a, B:34:0x004d, B:37:0x0038, B:38:0x0050, B:40:0x0058, B:26:0x0030, B:30:0x0045), top: B:3:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(StartAppAd startAppAd, com.startapp.sdk.adsbase.k kVar, boolean z, boolean z4, String str) {
        List list;
        synchronized (this.v) {
            try {
                ?? r12 = this.o;
                if (r12 != 0 && r12.isReady()) {
                    ?? r13 = this.o;
                    if (!(r13 == 0 ? false : r13.hasAdCacheTtlPassed()) && !z) {
                        if (startAppAd != null && kVar != null) {
                            a0.b(this.f7791a, kVar, startAppAd, true);
                        }
                    }
                }
                if (this.f7804p.compareAndSet(false, true)) {
                    this.f7808t.e();
                    this.f7809u.e();
                    b(str, z4);
                }
            } finally {
            }
        }
        if (list == null) {
            list = new ArrayList();
            try {
                this.v.put(kVar, list);
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        list.add(startAppAd);
        if (this.f7804p.compareAndSet(false, true)) {
        }
        list.add(startAppAd);
        if (this.f7804p.compareAndSet(false, true)) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void b(String str, boolean z) {
        String str2;
        ?? r02 = this.o;
        if (r02 != 0) {
            r02.setVideoCancelCallBack(false);
        }
        if (!this.f7807s || (str2 = this.f7806r) == null) {
            a(str, z);
            return;
        }
        this.f7807s = false;
        r2 r2Var = new r2(this, new v2(this), z);
        Context context = this.f7791a;
        ((Executor) com.startapp.sdk.components.a.a(context).f6543C.a()).execute(new q6(context, str2, r2Var, new s2(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        ?? r02 = this.o;
        if (r02 != 0 && r02.isReady()) {
            Context context = this.f7791a;
            Ad ad = this.o;
            if (ad != null) {
                HashSet hashSet = new HashSet();
                if (ad instanceof m8) {
                    z = t0.a(context, t0.a(((m8) ad).f7258b, 0), 0, hashSet, new ArrayList()).booleanValue();
                } else if ((ad instanceof db) && t0.a(context, ((db) ad).f6800a, 0, hashSet, false).size() == 0) {
                    z = true;
                }
                if (!z) {
                    ?? r03 = this.o;
                    if (!(r03 != 0 ? r03.hasAdCacheTtlPassed() : false)) {
                        if (this.f7804p.get()) {
                            return;
                        }
                        this.f7808t.d();
                        return;
                    }
                }
                a(null, null, true, false, null);
                return;
            }
            z = false;
            if (!z) {
            }
            a(null, null, true, false, null);
            return;
        }
        if (this.f7804p.get()) {
            return;
        }
        this.f7809u.d();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void a(String str, boolean z) {
        Ad ijVar;
        Ad tdVar;
        Ad udVar;
        if (z) {
            Long h2 = AdsCommonMetaData.k().h();
            if (h2 != null && this.f7812y != null && SystemClock.elapsedRealtime() - this.f7812y.longValue() < h2.longValue()) {
                a0.a(this.f7791a, new v2(this), new t2(this.f7791a, this.f7802l, this.f7792b, this.f7793c, this.f7795e, this.f7796f, this.f7797g, this.f7798h, this.f7799i, this.f7800j, this.f7801k), true);
                si.a(6, this.f7791a, "Failed to load " + this.f7802l.name() + " ad: NO FILL");
                return;
            }
            this.f7812y = Long.valueOf(SystemClock.elapsedRealtime());
        }
        int i4 = u2.f7642a[this.f7802l.ordinal()];
        if (i4 == 1) {
            ijVar = new ij(this.f7791a, AdPreferences.Placement.INAPP_OVERLAY, this.f7792b, this.f7793c, this.f7795e, this.f7796f, this.f7797g, this.f7798h, this.f7799i, this.f7800j, this.f7801k);
        } else if (i4 == 2) {
            boolean z4 = ((Random) si.f7578d.a()).nextInt(100) < AdsCommonMetaData.k().w();
            boolean isForceOfferWall3D = this.n.isForceOfferWall3D();
            boolean isForceOfferWall2D = this.n.isForceOfferWall2D();
            if ((z4 || isForceOfferWall3D) && !isForceOfferWall2D) {
                tdVar = new td(this.f7791a, this.f7792b, this.f7793c, this.f7795e, this.f7796f, this.f7797g, this.f7798h, this.f7799i, this.f7800j, this.f7801k, this.f7794d);
                ijVar = tdVar;
            } else {
                udVar = new ud(this.f7791a, this.f7792b, this.f7793c, this.f7795e, this.f7796f, this.f7797g, this.f7798h, this.f7799i, this.f7800j, this.f7801k);
                ijVar = udVar;
            }
        } else if (i4 == 3) {
            udVar = new te(this.f7791a, this.f7792b, this.f7793c, this.f7795e, this.f7796f, this.f7797g, this.f7798h, this.f7799i, this.f7800j, this.f7801k);
            ijVar = udVar;
        } else if (i4 != 4) {
            ijVar = new xd(this.f7791a, this.f7792b, this.f7793c, this.f7795e, this.f7796f, this.f7797g, this.f7798h, this.f7799i, this.f7800j, this.f7801k);
        } else {
            tdVar = new wg(this.f7791a, this.f7792b, this.f7793c, this.f7795e, this.f7796f, this.f7797g, this.f7798h, this.f7799i, this.f7800j, this.f7801k);
            ijVar = tdVar;
        }
        this.o = ijVar;
        ((y6) ((x6) this.f7792b.a())).a(this, this.o);
        this.o.setActivityExtra(this.f7803m);
        this.n.setAutoLoadAmount(this.f7810w);
        this.o.load(this.n, new v2(this), str);
        this.f7805q = System.currentTimeMillis();
    }
}
