package com.startapp.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.ACMConfig;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4276a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4277b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4278c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f4279d;

    /* renamed from: e, reason: collision with root package name */
    public m f4280e;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f4281g;

    /* renamed from: h, reason: collision with root package name */
    public final ib f4282h;

    /* renamed from: i, reason: collision with root package name */
    public final ib f4283i;

    /* renamed from: j, reason: collision with root package name */
    public final ib f4284j;

    /* renamed from: k, reason: collision with root package name */
    public final ib f4285k;

    /* renamed from: l, reason: collision with root package name */
    public final ib f4286l;

    /* renamed from: m, reason: collision with root package name */
    public final ib f4287m;

    /* renamed from: n, reason: collision with root package name */
    public final ib f4288n;
    public final ib o;

    /* renamed from: p, reason: collision with root package name */
    public final ib f4289p;

    /* renamed from: q, reason: collision with root package name */
    public final ib f4290q;

    /* renamed from: r, reason: collision with root package name */
    public final ib f4291r;

    /* renamed from: s, reason: collision with root package name */
    public final ib f4292s;

    public p(Context context, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10, ib ibVar11, ib ibVar12, ib ibVar13) {
        new WeakHashMap();
        this.f4279d = new ConcurrentLinkedQueue();
        this.f = context;
        this.f4282h = ibVar;
        this.f4283i = ibVar2;
        this.f4281g = ibVar3;
        this.f4284j = ibVar4;
        this.f4285k = ibVar5;
        this.f4286l = ibVar6;
        this.f4287m = ibVar7;
        this.f4288n = ibVar8;
        this.o = ibVar9;
        this.f4289p = ibVar10;
        this.f4290q = ibVar11;
        this.f4291r = ibVar12;
        this.f4292s = ibVar13;
    }

    public final /* synthetic */ p a() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final com.startapp.sdk.adsbase.f b(CacheKey cacheKey) {
        w2 w2Var;
        ?? r8;
        if (cacheKey == null || (w2Var = (w2) this.f4276a.get(cacheKey)) == null || (r8 = w2Var.o) == 0 || !r8.isReady()) {
            return null;
        }
        ?? r82 = w2Var.o;
        w2Var.f4665w = 0;
        w2Var.f4667y = null;
        if (!h0.f.booleanValue() && w2Var.f4666x && CacheMetaData.d() && MetaData.E().f0()) {
            w2Var.a(null, null, true, true, null);
            return r82;
        }
        if (!w2Var.f4666x) {
            m mVar = w2Var.z;
            if (mVar != null) {
                mVar.a(w2Var);
            }
            q2 q2Var = w2Var.f4663t;
            if (q2Var != null) {
                q2Var.e();
            }
        }
        return r82;
    }

    public final void a(AdPreferences.Placement placement) {
        try {
            String str = "90db0b5573c3d1f6_" + p0.a(this.f) + '_' + placement.getIndex();
            ((SharedPreferences) this.f4282h.a()).edit().putLong(str, Math.max(((SharedPreferences) this.f4282h.a()).getLong(str, 0L), 0L) + 1).apply();
            ACMConfig a3 = CacheMetaData.b().a();
            ComponentInfoEventConfig d3 = a3 != null ? a3.d() : null;
            if (d3 == null || !d3.a(1)) {
                return;
            }
            d9 d9Var = new d9(e9.f3725e);
            d9Var.f3680d = "ACM.opf";
            d9Var.f3681e = String.valueOf(placement.getIndex());
            d9Var.a();
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CacheKey a(StartAppAd startAppAd, StartAppAd.AdMode adMode, AdPreferences adPreferences, com.startapp.sdk.adsbase.k kVar, String str) {
        AdPreferences.Placement placement;
        String str2;
        long max;
        int intValue;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        switch (n.f4173a[adMode.ordinal()]) {
            case 1:
                WeakHashMap weakHashMap = si.f4438a;
                placement = AdPreferences.Placement.INAPP_OFFER_WALL;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                placement = AdPreferences.Placement.INAPP_OVERLAY;
                break;
            case 6:
                WeakHashMap weakHashMap2 = si.f4438a;
                int i3 = AdsCommonMetaData.k().i();
                ib ibVar = si.f4441d;
                if (((Random) ibVar.a()).nextInt(100) < i3) {
                    if ((((Random) ibVar.a()).nextInt(100) < AdsCommonMetaData.k().j() || adPreferences2.isForceFullpage()) && !adPreferences2.isForceOverlay()) {
                        placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                        break;
                    } else {
                        placement = AdPreferences.Placement.INAPP_OVERLAY;
                        break;
                    }
                } else {
                    placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                    break;
                }
                break;
            default:
                placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                break;
        }
        AdPreferences.Placement placement2 = placement;
        try {
            max = Math.max(((SharedPreferences) this.f4282h.a()).getLong("90db0b5573c3d1f6_" + p0.a(this.f) + '_' + placement2.getIndex(), 0L), 0L);
            ACMConfig a3 = CacheMetaData.b().a();
            Map f = a3 != null ? a3.f() : null;
            Integer num = f != null ? (Integer) f.get(Integer.valueOf(placement2.getIndex())) : null;
            intValue = num != null ? num.intValue() : 0;
        } catch (Throwable th) {
            d9.a(th);
        }
        if (intValue > 0) {
            if (max >= intValue) {
                str2 = "Failures threshold reached";
                if (str2 == null) {
                    if (startAppAd != null) {
                        startAppAd.setErrorMessage(str2);
                    }
                    a0.a(this.f, kVar, startAppAd, false);
                    return null;
                }
                if (adMode.equals(StartAppAd.AdMode.REWARDED_VIDEO)) {
                    adPreferences2.setType(Ad.AdType.REWARDED_VIDEO);
                } else if (adMode.equals(StartAppAd.AdMode.VIDEO)) {
                    adPreferences2.setType(Ad.AdType.VIDEO);
                }
                return a(startAppAd, placement2, adPreferences2, false, 0, kVar, str);
            }
        }
        str2 = null;
        if (str2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final com.startapp.sdk.adsbase.f a(CacheKey cacheKey) {
        w2 w2Var = cacheKey != null ? (w2) this.f4276a.get(cacheKey) : null;
        if (w2Var != null) {
            return w2Var.o;
        }
        return null;
    }

    public final CacheKey a(StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, boolean z, int i3, com.startapp.sdk.adsbase.k kVar, String str) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        AdPreferences adPreferences2 = adPreferences == null ? new AdPreferences() : adPreferences;
        CacheKey cacheKey = str != null ? new CacheKey(placement, adPreferences2, UUID.randomUUID().toString()) : new CacheKey(placement, adPreferences2);
        if (this.f4278c && !z) {
            this.f4279d.add(new o(startAppAd, placement, adPreferences2, kVar));
            return cacheKey;
        }
        AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
        ConcurrentHashMap concurrentHashMap3 = this.f4276a;
        synchronized (concurrentHashMap3) {
            try {
                try {
                    w2 w2Var = (w2) this.f4276a.get(cacheKey);
                    if (w2Var == null) {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                concurrentHashMap2 = concurrentHashMap3;
                                                                w2 w2Var2 = new w2(this.f, placement, adPreferences3, this.f4284j, this.f4285k, this.f4286l, new ib(new com.startapp.sdk.components.f(1, this)), this.f4287m, this.f4288n, this.f4289p, this.f4290q, this.f4291r, this.f4292s);
                                                                if (this.f4280e == null) {
                                                                    this.f4280e = new m(this);
                                                                }
                                                                w2Var2.z = this.f4280e;
                                                                if (z) {
                                                                    w2Var2.f4661r = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                                                                    w2Var2.f4662s = true;
                                                                    w2Var2.f4665w = i3;
                                                                }
                                                                a(cacheKey, w2Var2);
                                                                w2Var = w2Var2;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                concurrentHashMap = concurrentHashMap3;
                                                                throw th;
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            concurrentHashMap = concurrentHashMap3;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        concurrentHashMap = concurrentHashMap3;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    concurrentHashMap = concurrentHashMap3;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                concurrentHashMap = concurrentHashMap3;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            concurrentHashMap = concurrentHashMap3;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        concurrentHashMap = concurrentHashMap3;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    concurrentHashMap = concurrentHashMap3;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                concurrentHashMap = concurrentHashMap3;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            concurrentHashMap = concurrentHashMap3;
                        }
                    } else {
                        concurrentHashMap2 = concurrentHashMap3;
                        w2Var.f4658n = adPreferences3;
                    }
                    ((y6) ((x6) this.f4284j.a())).a(startAppAd, w2Var);
                    CacheKey cacheKey2 = cacheKey;
                    w2Var.a(startAppAd, kVar, false, true, str);
                    return cacheKey2;
                } catch (Throwable th11) {
                    th = th11;
                    concurrentHashMap = concurrentHashMap3;
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
    }

    public final void a(CacheKey cacheKey, w2 w2Var) {
        synchronized (this.f4276a) {
            try {
                int e3 = CacheMetaData.b().a().e();
                if (e3 != 0 && this.f4276a.size() >= e3) {
                    long j3 = Long.MAX_VALUE;
                    CacheKey cacheKey2 = null;
                    for (CacheKey cacheKey3 : this.f4276a.keySet()) {
                        w2 w2Var2 = (w2) this.f4276a.get(cacheKey3);
                        if (w2Var2.f4656l == w2Var.f4656l) {
                            long j4 = w2Var2.f4660q;
                            if (j4 < j3) {
                                cacheKey2 = cacheKey3;
                                j3 = j4;
                            }
                        }
                    }
                    if (cacheKey2 != null) {
                        this.f4276a.remove(cacheKey2);
                    }
                }
                this.f4276a.put(cacheKey, w2Var);
                if (((Random) si.f4441d.a()).nextDouble() * 100.0d < CacheMetaData.b().c()) {
                    d9 d9Var = new d9(e9.f3724d);
                    d9Var.f3680d = "Cache Size";
                    d9Var.f3681e = String.valueOf(this.f4276a.size());
                    d9Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
