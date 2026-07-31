package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f385a;
    public final pa b;
    public final pa c;
    public final pa d;
    public final pa e;
    public final pa f;
    public final pa g;
    public final pa h;
    public final pa i;
    public final pa j;
    public final pa k;
    public final AdPreferences.Placement l;
    public final ActivityExtra m;
    public AdPreferences n;
    public long q;
    public String r;
    public boolean s;
    public final k2 t;
    public final h2 u;
    public int w;
    public final boolean x;
    public Long y;
    public m z;
    public com.startapp.sdk.adsbase.f o = null;
    public final AtomicBoolean p = new AtomicBoolean(false);
    public final ConcurrentHashMap v = new ConcurrentHashMap();

    public q2(Context context, AdPreferences.Placement placement, AdPreferences adPreferences, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9, pa paVar10) {
        this.l = placement;
        this.n = adPreferences;
        if (context instanceof Activity) {
            Context a2 = t0.a(context);
            this.f385a = a2 == null ? context : a2;
            this.m = new ActivityExtra((Activity) context);
        } else {
            this.f385a = context;
            this.m = null;
        }
        this.x = true;
        this.b = paVar;
        this.c = paVar2;
        this.d = paVar3;
        this.e = paVar4;
        this.f = paVar5;
        this.g = paVar6;
        this.h = paVar7;
        this.i = paVar8;
        this.j = paVar9;
        this.k = paVar10;
        this.t = new k2(this);
        this.u = new h2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        if (r6 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r7 = (java.util.List) r4.v.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0035, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0036, code lost:
    
        com.startapp.sdk.internal.n8.a(r7);
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056 A[Catch: all -> 0x0065, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:16:0x0022, B:17:0x0063, B:21:0x0015, B:24:0x002c, B:28:0x003c, B:33:0x0048, B:34:0x004b, B:37:0x0036, B:38:0x004e, B:40:0x0056, B:26:0x002e, B:30:0x0043), top: B:3:0x0003, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(StartAppAd startAppAd, AdEventListener adEventListener, boolean z, boolean z2, String str) {
        List list;
        synchronized (this.v) {
            com.startapp.sdk.adsbase.f fVar = this.o;
            if (fVar != null && fVar.isReady()) {
                com.startapp.sdk.adsbase.f fVar2 = this.o;
                if (!(fVar2 == null ? false : fVar2.hasAdCacheTtlPassed()) && !z) {
                    if (startAppAd != null && adEventListener != null) {
                        a0.b(this.f385a, adEventListener, startAppAd, true);
                    }
                }
            }
            if (this.p.compareAndSet(false, true)) {
                this.t.e();
                this.u.e();
                b(str, z2);
            }
        }
        if (list == null) {
            list = new ArrayList();
            try {
                this.v.put(adEventListener, list);
            } catch (Throwable th) {
                n8.a(th);
            }
        }
        list.add(startAppAd);
        if (this.p.compareAndSet(false, true)) {
        }
        list.add(startAppAd);
        if (this.p.compareAndSet(false, true)) {
        }
    }

    public final void b(String str, boolean z) {
        String str2;
        com.startapp.sdk.adsbase.f fVar = this.o;
        if (fVar != null) {
            fVar.setVideoCancelCallBack(false);
        }
        if (!this.s || (str2 = this.r) == null) {
            a(str, z);
            return;
        }
        this.s = false;
        l2 l2Var = new l2(this, new p2(this), z);
        Context context = this.f385a;
        ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new h6(context, str2, l2Var, new m2(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        com.startapp.sdk.adsbase.f fVar = this.o;
        if (fVar != null && fVar.isReady()) {
            Context context = this.f385a;
            Ad ad = (Ad) this.o;
            if (ad != null) {
                HashSet hashSet = new HashSet();
                if (ad instanceof x7) {
                    z = q0.a(context, q0.a(((x7) ad).b, 0), 0, hashSet, new ArrayList()).booleanValue();
                } else if ((ad instanceof ka) && q0.a(context, ((ka) ad).f302a, 0, hashSet, false).size() == 0) {
                    z = true;
                }
                if (!z) {
                    com.startapp.sdk.adsbase.f fVar2 = this.o;
                    if (!(fVar2 != null ? fVar2.hasAdCacheTtlPassed() : false)) {
                        if (this.p.get()) {
                            return;
                        }
                        this.t.d();
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
        if (this.p.get()) {
            return;
        }
        this.u.d();
    }

    public final void a(String str, boolean z) {
        com.startapp.sdk.adsbase.f niVar;
        com.startapp.sdk.adsbase.f fdVar;
        com.startapp.sdk.adsbase.f gdVar;
        if (z) {
            Long h = AdsCommonMetaData.k().h();
            if (h != null && this.y != null && SystemClock.elapsedRealtime() - this.y.longValue() < h.longValue()) {
                a0.a(this.f385a, (AdEventListener) new p2(this), (Ad) new n2(this.f385a, this.l, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k), true);
                zh.a(6, this.f385a, "Failed to load " + this.l.name() + " ad: NO FILL");
                return;
            }
            this.y = Long.valueOf(SystemClock.elapsedRealtime());
        }
        int i = o2.f357a[this.l.ordinal()];
        if (i == 1) {
            niVar = new ni(this.f385a, AdPreferences.Placement.INAPP_OVERLAY, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        } else if (i == 2) {
            boolean z2 = ((Random) zh.d.a()).nextInt(100) < AdsCommonMetaData.k().w();
            boolean isForceOfferWall3D = this.n.isForceOfferWall3D();
            boolean isForceOfferWall2D = this.n.isForceOfferWall2D();
            if ((z2 || isForceOfferWall3D) && !isForceOfferWall2D) {
                fdVar = new fd(this.f385a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.d);
                niVar = fdVar;
            } else {
                gdVar = new gd(this.f385a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                niVar = gdVar;
            }
        } else if (i == 3) {
            gdVar = new ce(this.f385a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
            niVar = gdVar;
        } else if (i != 4) {
            niVar = new jd(this.f385a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        } else {
            fdVar = new fg(this.f385a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
            niVar = fdVar;
        }
        this.o = niVar;
        ((w6) this.b.a()).a(this, this.o);
        this.o.setActivityExtra(this.m);
        this.n.setAutoLoadAmount(this.w);
        this.o.load(this.n, new p2(this), str);
        this.q = System.currentTimeMillis();
    }
}
