package com.startapp.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
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

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f371a = new ConcurrentHashMap();
    public boolean b;
    public boolean c;
    public final ConcurrentLinkedQueue d;
    public m e;
    public final Context f;
    public final pa g;
    public final pa h;
    public final pa i;
    public final pa j;
    public final pa k;
    public final pa l;
    public final pa m;
    public final pa n;
    public final pa o;
    public final pa p;
    public final pa q;
    public final pa r;
    public final pa s;

    public p(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9, pa paVar10, pa paVar11, pa paVar12, pa paVar13) {
        new WeakHashMap();
        this.d = new ConcurrentLinkedQueue();
        this.f = context;
        this.h = paVar;
        this.i = paVar2;
        this.g = paVar3;
        this.j = paVar4;
        this.k = paVar5;
        this.l = paVar6;
        this.m = paVar7;
        this.n = paVar8;
        this.o = paVar9;
        this.p = paVar10;
        this.q = paVar11;
        this.r = paVar12;
        this.s = paVar13;
    }

    public final /* synthetic */ p a() {
        return this;
    }

    public final void a(AdPreferences.Placement placement) {
        try {
            String str = "90db0b5573c3d1f6_" + m0.a(this.f) + '_' + placement.getIndex();
            ((SharedPreferences) this.h.a()).edit().putLong(str, Math.max(((SharedPreferences) this.h.a()).getLong(str, 0L), 0L) + 1).apply();
            ACMConfig a2 = CacheMetaData.b().a();
            ComponentInfoEventConfig d = a2 != null ? a2.d() : null;
            if (d == null || !d.a(1L)) {
                return;
            }
            n8 n8Var = new n8(o8.e);
            n8Var.d = "ACM.opf";
            n8Var.e = String.valueOf(placement.getIndex());
            n8Var.a();
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    public final com.startapp.sdk.adsbase.f b(CacheKey cacheKey) {
        q2 q2Var;
        com.startapp.sdk.adsbase.f fVar;
        if (cacheKey == null || (q2Var = (q2) this.f371a.get(cacheKey)) == null || (fVar = q2Var.o) == null || !fVar.isReady()) {
            return null;
        }
        com.startapp.sdk.adsbase.f fVar2 = q2Var.o;
        q2Var.w = 0;
        q2Var.y = null;
        if (!f0.f.booleanValue() && q2Var.x && CacheMetaData.d() && MetaData.A().Z()) {
            q2Var.a(null, null, true, true, null);
            return fVar2;
        }
        if (!q2Var.x) {
            m mVar = q2Var.z;
            if (mVar != null) {
                mVar.a(q2Var);
            }
            k2 k2Var = q2Var.t;
            if (k2Var != null) {
                k2Var.e();
            }
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CacheKey a(StartAppAd startAppAd, StartAppAd.AdMode adMode, AdPreferences adPreferences, ig igVar, String str) {
        AdPreferences.Placement placement;
        String str2;
        long max;
        int intValue;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        switch (n.f342a[adMode.ordinal()]) {
            case 1:
                WeakHashMap weakHashMap = zh.f528a;
                placement = AdPreferences.Placement.INAPP_OFFER_WALL;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                placement = AdPreferences.Placement.INAPP_OVERLAY;
                break;
            case 6:
                WeakHashMap weakHashMap2 = zh.f528a;
                int i = AdsCommonMetaData.k().i();
                pa paVar = zh.d;
                if (((Random) paVar.a()).nextInt(100) < i) {
                    if ((((Random) paVar.a()).nextInt(100) < AdsCommonMetaData.k().j() || adPreferences2.isForceFullpage()) && !adPreferences2.isForceOverlay()) {
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
            max = Math.max(((SharedPreferences) this.h.a()).getLong("90db0b5573c3d1f6_" + m0.a(this.f) + '_' + placement2.getIndex(), 0L), 0L);
            ACMConfig a2 = CacheMetaData.b().a();
            Map f = a2 != null ? a2.f() : null;
            Integer num = f != null ? (Integer) f.get(Integer.valueOf(placement2.getIndex())) : null;
            intValue = num != null ? num.intValue() : 0;
        } catch (Throwable th) {
            n8.a(th);
        }
        if (intValue > 0) {
            if (max >= intValue) {
                str2 = "Failures threshold reached";
                if (str2 == null) {
                    if (startAppAd != null) {
                        startAppAd.setErrorMessage(str2);
                    }
                    a0.a(this.f, (AdEventListener) igVar, (Ad) startAppAd, false);
                    return null;
                }
                if (adMode.equals(StartAppAd.AdMode.REWARDED_VIDEO)) {
                    adPreferences2.setType(Ad.AdType.REWARDED_VIDEO);
                } else if (adMode.equals(StartAppAd.AdMode.VIDEO)) {
                    adPreferences2.setType(Ad.AdType.VIDEO);
                }
                return a(startAppAd, placement2, adPreferences2, false, 0, igVar, str);
            }
        }
        str2 = null;
        if (str2 == null) {
        }
    }

    public final com.startapp.sdk.adsbase.f a(CacheKey cacheKey) {
        q2 q2Var = cacheKey != null ? (q2) this.f371a.get(cacheKey) : null;
        if (q2Var != null) {
            return q2Var.o;
        }
        return null;
    }

    public final CacheKey a(StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, boolean z, int i, AdEventListener adEventListener, String str) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        AdPreferences adPreferences2 = adPreferences == null ? new AdPreferences() : adPreferences;
        CacheKey cacheKey = str != null ? new CacheKey(placement, adPreferences2, UUID.randomUUID().toString()) : new CacheKey(placement, adPreferences2);
        if (this.c && !z) {
            this.d.add(new o(startAppAd, placement, adPreferences2, adEventListener));
            return cacheKey;
        }
        AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
        ConcurrentHashMap concurrentHashMap3 = this.f371a;
        synchronized (concurrentHashMap3) {
            try {
                try {
                    q2 q2Var = (q2) this.f371a.get(cacheKey);
                    if (q2Var == null) {
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
                                                                q2 q2Var2 = new q2(this.f, placement, adPreferences3, this.j, this.k, this.l, new pa(new c7() { // from class: com.startapp.sdk.internal.p$$ExternalSyntheticLambda0
                                                                    @Override // com.startapp.sdk.internal.c7
                                                                    public final Object call() {
                                                                        return p.this.a();
                                                                    }
                                                                }), this.m, this.n, this.p, this.q, this.r, this.s);
                                                                if (this.e == null) {
                                                                    this.e = new m(this);
                                                                }
                                                                q2Var2.z = this.e;
                                                                if (z) {
                                                                    q2Var2.r = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                                                                    q2Var2.s = true;
                                                                    q2Var2.w = i;
                                                                }
                                                                a(cacheKey, q2Var2);
                                                                q2Var = q2Var2;
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
                        q2Var.n = adPreferences3;
                    }
                    ((w6) this.j.a()).a(startAppAd, q2Var);
                    CacheKey cacheKey2 = cacheKey;
                    q2Var.a(startAppAd, adEventListener, false, true, str);
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

    public final void a(CacheKey cacheKey, q2 q2Var) {
        synchronized (this.f371a) {
            int e = CacheMetaData.b().a().e();
            if (e != 0 && this.f371a.size() >= e) {
                long j = Long.MAX_VALUE;
                CacheKey cacheKey2 = null;
                for (CacheKey cacheKey3 : this.f371a.keySet()) {
                    q2 q2Var2 = (q2) this.f371a.get(cacheKey3);
                    if (q2Var2.l == q2Var.l) {
                        long j2 = q2Var2.q;
                        if (j2 < j) {
                            cacheKey2 = cacheKey3;
                            j = j2;
                        }
                    }
                }
                if (cacheKey2 != null) {
                    this.f371a.remove(cacheKey2);
                }
            }
            this.f371a.put(cacheKey, q2Var);
            if (((Random) zh.d.a()).nextDouble() * 100.0d < CacheMetaData.b().c()) {
                n8 n8Var = new n8(o8.d);
                n8Var.d = "Cache Size";
                n8Var.e = String.valueOf(this.f371a.size());
                n8Var.a();
            }
        }
    }
}
