package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.cache.ACMConfig;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import com.startapp.sdk.jobs.JobRequest$Network;
import com.startapp.sdk.sensors.SensorsData;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class lg implements qb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f322a;
    public final /* synthetic */ com.startapp.sdk.components.a b;
    public final /* synthetic */ qg c;

    public lg(qg qgVar, Context context, com.startapp.sdk.components.a aVar) {
        this.c = qgVar;
        this.f322a = context;
        this.b = aVar;
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        int parseInt;
        int parseInt2;
        String str;
        int i;
        qg qgVar = this.c;
        Context context = this.f322a;
        int i2 = 0;
        if (qgVar.b) {
            p pVar = (p) com.startapp.sdk.components.a.a(context).M.a();
            if (qgVar.n || !CacheMetaData.b().a().g() || !MetaData.A().Z()) {
                pVar.b = true;
                Context context2 = pVar.f;
                ((Executor) com.startapp.sdk.components.a.a(context2).C.a()).execute(new e6(context2, new k(pVar)));
            } else if (!pVar.b && CacheMetaData.b().a().g() && MetaData.A().Z()) {
                pVar.c = true;
                Context context3 = pVar.f;
                ((Executor) com.startapp.sdk.components.a.a(context3).C.a()).execute(new f6(context3, new j(pVar)));
            }
            if (z) {
                p pVar2 = (p) com.startapp.sdk.components.a.a(context).M.a();
                ACMConfig a2 = CacheMetaData.b().a();
                if (a2 != null) {
                    MetaData A = MetaData.A();
                    Set<StartAppAd.AdMode> b = a2.b();
                    if (b != null && !b.isEmpty() && CacheMetaData.d() && A.Z() && ((n0) pVar2.o.a()).a() != null) {
                        int U = A.U();
                        int i3 = AdsCommonMetaData.k().i();
                        for (StartAppAd.AdMode adMode : b) {
                            if (adMode != null && (i = ((af) pVar2.i.a()).getInt((str = "autoLoadNotShownAdPrefix" + adMode.name()), 0)) < U) {
                                AdPreferences adPreferences = new AdPreferences();
                                adPreferences.makePreCached();
                                StartAppAd.AdMode adMode2 = StartAppAd.AdMode.FULLPAGE;
                                if (adMode != adMode2) {
                                    StartAppAd.AdMode adMode3 = StartAppAd.AdMode.OFFERWALL;
                                    if (adMode != adMode3) {
                                        pVar2.a(null, adMode, adPreferences, null, null);
                                    } else if (i3 < 100) {
                                        pVar2.a(null, adMode3, adPreferences, null, null);
                                    }
                                } else if (i3 > 0) {
                                    pVar2.a(null, adMode2, adPreferences, null, null);
                                }
                                ((af) pVar2.i.a()).edit().putInt(str, i + 1).apply();
                            }
                        }
                    }
                }
            }
        }
        ((f2) this.b.q.a()).e();
        ((sf) this.b.s.a()).e();
        ((vg) this.b.e.a()).e();
        this.b.r.call().a();
        ha haVar = (ha) com.startapp.sdk.components.a.a(this.f322a).v.a();
        if (MetaData.A().g0()) {
            od odVar = new od(rd.class);
            odVar.d = Long.valueOf(MetaData.A().J() * 60000);
            odVar.b = JobRequest$Network.ANY;
            haVar.a(new pd(odVar));
        } else {
            int a3 = pd.a(rd.class);
            if (!haVar.b.a(a3)) {
                haVar.f262a.a(a3);
            }
        }
        ha haVar2 = (ha) com.startapp.sdk.components.a.a(this.f322a).v.a();
        if (MetaData.A().f0()) {
            long b2 = MetaData.A().b(r13) * 60000;
            od odVar2 = new od(nd.class);
            odVar2.d = Long.valueOf(b2);
            odVar2.b = JobRequest$Network.ANY;
            haVar2.a(new pd(odVar2));
        } else {
            int a4 = pd.a(nd.class);
            if (!haVar2.b.a(a4)) {
                haVar2.f262a.a(a4);
            }
        }
        ha haVar3 = (ha) com.startapp.sdk.components.a.a(this.f322a).v.a();
        MetaData A2 = MetaData.A();
        if (A2.f0() && A2.e0()) {
            long millis = TimeUnit.SECONDS.toMillis(A2.a(r13));
            od odVar3 = new od(md.class);
            odVar3.d = Long.valueOf(millis);
            odVar3.b = JobRequest$Network.ANY;
            odVar3.c = true;
            haVar3.a(new pd(odVar3));
        } else {
            int a5 = pd.a(md.class);
            if (!haVar3.b.a(a5)) {
                haVar3.f262a.a(a5);
            }
        }
        Context context4 = this.f322a;
        com.startapp.sdk.components.a a6 = com.startapp.sdk.components.a.a(context4);
        af afVar = (af) a6.G.a();
        if (afVar.getBoolean("shared_prefs_first_init", true)) {
            afVar.edit().putInt("totalSessions", 0).putLong("firstSessionTime", System.currentTimeMillis()).apply();
            ((Executor) a6.A.a()).execute(new mg(context4, a6, afVar));
        }
        MotionMetadata motionMetadata = null;
        if (this.f322a != null) {
            qg.a(false, (id) null);
        }
        xe xeVar = (xe) this.b.u.a();
        try {
            if (!xeVar.a()) {
                ((Executor) xeVar.b.a()).execute(new ve(xeVar));
            }
        } catch (Throwable th) {
            n8.a(th);
        }
        me meVar = (me) this.b.h.a();
        List a7 = meVar.a();
        meVar.b.getClass();
        RscMetadata N = MetaData.A().N();
        if (N == null || !N.d()) {
            N = null;
        }
        if (N != null && (N.a() & 1024) != 0) {
            n8 n8Var = new n8(o8.d);
            n8Var.d = "RSC init";
            n8Var.e = "targets: " + (a7 != null ? Integer.valueOf(a7.size()) : null);
            n8Var.a();
        }
        ub ubVar = (ub) this.b.w.a();
        MotionMetadata F = MetaData.A().F();
        if (F != null && F.u()) {
            motionMetadata = F;
        }
        if (motionMetadata != null) {
            ubVar.e = ((Random) zh.d.a()).nextDouble() < motionMetadata.k();
        }
        ubVar.c.post(new tb(ubVar));
        SensorsData P = MetaData.A().P();
        if (P != null && P.h()) {
            ((rf) this.b.x.a()).a(this.f322a);
        }
        k0 k0Var = (k0) this.b.o.a();
        int i4 = z ? 1 : 2;
        Locale locale = Locale.ENGLISH;
        String str2 = "cnt=" + k0Var.b.incrementAndGet() + ",mds=" + i4;
        n8 n8Var2 = new n8(o8.d);
        n8Var2.d = "initialize";
        n8Var2.e = str2;
        n8Var2.a();
        ((uj) this.b.f160a.a()).b();
        String B = MetaData.A().B();
        if (B != null) {
            String version = StartAppSDK.getVersion();
            String[] split = B.split("\\.");
            String[] split2 = version.split("\\.");
            int min = Math.min(split.length, split2.length);
            for (int i5 = 0; i5 < min; i5++) {
                try {
                    parseInt = Integer.parseInt(split[i5]);
                    parseInt2 = Integer.parseInt(split2[i5]);
                } catch (NumberFormatException unused) {
                    int compareTo = split[i5].compareTo(split2[i5]);
                    if (compareTo <= 0) {
                        if (compareTo < 0) {
                        }
                    }
                }
                if (parseInt > parseInt2) {
                    i2 = i5 + 1;
                    break;
                } else {
                    if (parseInt < parseInt2) {
                        i2 = -(i5 + 1);
                        break;
                    }
                }
            }
            if (split.length > split2.length) {
                i2 = min + 1;
            } else if (split.length < split2.length) {
                i2 = -(min + 1);
            }
            if (i2 > 0) {
                Log.println(5, "StartAppSDK", "Current SDK version (" + StartAppSDK.getVersion() + ") is outdated. Integrate the most recent version (" + B + ") in order to improve your ads performance.");
            }
        }
    }

    @Override // com.startapp.sdk.internal.qb
    public final void a() {
        k0 k0Var = (k0) this.b.o.a();
        Locale locale = Locale.ENGLISH;
        String str = "cnt=" + k0Var.b.incrementAndGet() + ",mds=0";
        n8 n8Var = new n8(o8.d);
        n8Var.d = "initialize";
        n8Var.e = str;
        n8Var.a();
        ((uj) this.b.f160a.a()).b();
    }
}
