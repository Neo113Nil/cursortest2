package com.startapp.sdk.internal;

import E.AbstractC0005f;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class bh implements ic {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f6719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gh f6720c;

    public bh(gh ghVar, Context context, com.startapp.sdk.components.a aVar) {
        this.f6720c = ghVar;
        this.f6718a = context;
        this.f6719b = aVar;
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        int parseInt;
        int parseInt2;
        gh ghVar = this.f6720c;
        Context context = this.f6718a;
        int i4 = 0;
        if (ghVar.f7001b) {
            p pVar = (p) com.startapp.sdk.components.a.a(context).f6552M.a();
            if (ghVar.n || !CacheMetaData.b().a().g() || !MetaData.E().f0()) {
                pVar.f7412b = true;
                Context context2 = pVar.f7416f;
                ((Executor) com.startapp.sdk.components.a.a(context2).f6543C.a()).execute(new n6(context2, new C0370k(pVar)));
            } else if (!pVar.f7412b && CacheMetaData.b().a().g() && MetaData.E().f0()) {
                pVar.f7413c = true;
                Context context3 = pVar.f7416f;
                ((Executor) com.startapp.sdk.components.a.a(context3).f6543C.a()).execute(new o6(context3, new C0369j(pVar)));
            }
            if (z) {
                p pVar2 = (p) com.startapp.sdk.components.a.a(context).f6552M.a();
                ACMConfig a3 = CacheMetaData.b().a();
                if (a3 != null) {
                    MetaData E4 = MetaData.E();
                    Set<StartAppAd.AdMode> b4 = a3.b();
                    if (b4 != null && !b4.isEmpty() && CacheMetaData.d() && E4.f0() && ((q0) pVar2.o.a()).a() != null) {
                        int Z3 = E4.Z();
                        int i5 = AdsCommonMetaData.k().i();
                        for (StartAppAd.AdMode adMode : b4) {
                            if (adMode != null) {
                                String str = "autoLoadNotShownAdPrefix" + adMode.name();
                                int i6 = ((sf) pVar2.f7419i.a()).getInt(str, 0);
                                if (i6 < Z3) {
                                    AdPreferences adPreferences = new AdPreferences();
                                    adPreferences.makePreCached();
                                    StartAppAd.AdMode adMode2 = StartAppAd.AdMode.FULLPAGE;
                                    if (adMode != adMode2) {
                                        StartAppAd.AdMode adMode3 = StartAppAd.AdMode.OFFERWALL;
                                        if (adMode != adMode3) {
                                            pVar2.a(null, adMode, adPreferences, null, null);
                                        } else if (i5 < 100) {
                                            pVar2.a(null, adMode3, adPreferences, null, null);
                                        }
                                    } else if (i5 > 0) {
                                        pVar2.a(null, adMode2, adPreferences, null, null);
                                    }
                                    rf edit = ((sf) pVar2.f7419i.a()).edit();
                                    int i7 = i6 + 1;
                                    edit.a(str, Integer.valueOf(i7));
                                    edit.f7532a.putInt(str, i7);
                                    edit.apply();
                                }
                            }
                        }
                    }
                }
            }
        }
        l2 l2Var = (l2) this.f6719b.f6575r.a();
        synchronized (l2Var) {
            l2Var.a(Math.max(0L, (Math.max(60000L, l2Var.d()) + ((sf) l2Var.f8037e.a()).getLong(l2Var.f8040h, 0L)) - System.currentTimeMillis()));
        }
        ((jg) this.f6719b.f6576s.a()).e();
        ((mh) this.f6719b.f6565f.a()).e();
        gh ghVar2 = this.f6720c;
        Context context4 = this.f6718a;
        ghVar2.getClass();
        ab abVar = (ab) com.startapp.sdk.components.a.a(context4).v.a();
        if (MetaData.E().m0()) {
            ce ceVar = new ce(fe.class);
            ceVar.f6769d = Long.valueOf(MetaData.E().O() * 60000);
            ceVar.f6767b = JobRequest$Network.ANY;
            abVar.a(new de(ceVar));
        } else {
            int a4 = de.a(fe.class);
            if (!abVar.f6662b.a(a4)) {
                abVar.f6661a.a(a4);
            }
        }
        gh ghVar3 = this.f6720c;
        Context context5 = this.f6718a;
        ghVar3.getClass();
        ab abVar2 = (ab) com.startapp.sdk.components.a.a(context5).v.a();
        if (MetaData.E().l0()) {
            ce ceVar2 = new ce(be.class);
            ceVar2.f6769d = Long.valueOf(MetaData.E().b(context5) * 60000);
            ceVar2.f6767b = JobRequest$Network.ANY;
            abVar2.a(new de(ceVar2));
        } else {
            int a5 = de.a(be.class);
            if (!abVar2.f6662b.a(a5)) {
                abVar2.f6661a.a(a5);
            }
        }
        gh ghVar4 = this.f6720c;
        Context context6 = this.f6718a;
        ghVar4.getClass();
        ab abVar3 = (ab) com.startapp.sdk.components.a.a(context6).v.a();
        MetaData E5 = MetaData.E();
        if (E5.l0() && E5.k0()) {
            long millis = TimeUnit.SECONDS.toMillis(E5.a(context6));
            ce ceVar3 = new ce(ae.class);
            ceVar3.f6769d = Long.valueOf(millis);
            ceVar3.f6767b = JobRequest$Network.ANY;
            ceVar3.f6768c = true;
            abVar3.a(new de(ceVar3));
        } else {
            int a6 = de.a(ae.class);
            if (!abVar3.f6662b.a(a6)) {
                abVar3.f6661a.a(a6);
            }
        }
        gh ghVar5 = this.f6720c;
        Context context7 = this.f6718a;
        ghVar5.getClass();
        com.startapp.sdk.components.a a7 = com.startapp.sdk.components.a.a(context7);
        sf sfVar = (sf) a7.f6547G.a();
        if (sfVar.getBoolean("shared_prefs_first_init", true)) {
            rf edit2 = sfVar.edit();
            edit2.a("totalSessions", 0);
            edit2.f7532a.putInt("totalSessions", 0);
            long currentTimeMillis = System.currentTimeMillis();
            edit2.a("firstSessionTime", Long.valueOf(currentTimeMillis));
            edit2.f7532a.putLong("firstSessionTime", currentTimeMillis);
            edit2.apply();
            ((Executor) a7.f6541A.a()).execute(new ch(context7, a7, sfVar));
        }
        if (this.f6718a != null) {
            d9 d9Var = new d9(e9.f6843i);
            d9Var.f6798j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f6540U.f7743a;
                if (aVar != null) {
                    ((t9) aVar.f6574q.a()).a(d9Var);
                }
            } catch (Throwable unused) {
            }
        }
        this.f6720c.getClass();
        pf pfVar = (pf) this.f6719b.f6578u.a();
        try {
            if (!pfVar.a()) {
                ((Executor) pfVar.f7450b.a()).execute(new nf(pfVar));
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        ef efVar = (ef) this.f6719b.f6568i.a();
        List a8 = efVar.a();
        efVar.f6860b.getClass();
        RscMetadata S4 = MetaData.E().S();
        MotionMetadata motionMetadata = null;
        if (S4 == null || !S4.d()) {
            S4 = null;
        }
        if (S4 != null && (S4.a() & 1024) != 0) {
            d9 d9Var2 = new d9(e9.f6838d);
            d9Var2.f6792d = "RSC init";
            StringBuilder sb = new StringBuilder("targets: ");
            sb.append(a8 != null ? Integer.valueOf(((LinkedList) a8).size()) : null);
            d9Var2.f6793e = sb.toString();
            d9Var2.a();
        }
        mc mcVar = (mc) this.f6719b.f6579w.a();
        MotionMetadata J4 = MetaData.E().J();
        if (J4 != null && J4.u()) {
            motionMetadata = J4;
        }
        if (motionMetadata != null) {
            mcVar.f7280e = ((Random) si.f7578d.a()).nextDouble() < motionMetadata.k();
        }
        mcVar.f7278c.post(new lc(mcVar));
        SensorsData U4 = MetaData.E().U();
        if (U4 != null && U4.h()) {
            ((ig) this.f6719b.f6580x.a()).a(this.f6718a);
        }
        n0 n0Var = (n0) this.f6719b.f6573p.a();
        int i8 = z ? 1 : 2;
        Locale locale = Locale.ENGLISH;
        String i9 = AbstractC0005f.i(n0Var.f7310b.incrementAndGet(), i8, "cnt=", ",mds=");
        d9 d9Var3 = new d9(e9.f6838d);
        d9Var3.f6792d = "initialize";
        d9Var3.f6793e = i9;
        d9Var3.a();
        ((rk) this.f6719b.f6561b.a()).b();
        String F4 = MetaData.E().F();
        if (F4 != null) {
            String version = StartAppSDK.getVersion();
            String[] split = F4.split("\\.");
            String[] split2 = version.split("\\.");
            int min = Math.min(split.length, split2.length);
            for (int i10 = 0; i10 < min; i10++) {
                try {
                    parseInt = Integer.parseInt(split[i10]);
                    parseInt2 = Integer.parseInt(split2[i10]);
                } catch (NumberFormatException unused2) {
                    int compareTo = split[i10].compareTo(split2[i10]);
                    if (compareTo <= 0) {
                        if (compareTo < 0) {
                        }
                    }
                }
                if (parseInt > parseInt2) {
                    i4 = i10 + 1;
                    break;
                } else {
                    if (parseInt < parseInt2) {
                        i4 = -(i10 + 1);
                        break;
                    }
                }
            }
            if (split.length > split2.length) {
                i4 = min + 1;
            } else if (split.length < split2.length) {
                i4 = -(min + 1);
            }
            if (i4 > 0) {
                Log.println(5, "StartAppSDK", "Current SDK version (" + StartAppSDK.getVersion() + ") is outdated. Integrate the most recent version (" + F4 + ") in order to improve your ads performance.");
            }
        }
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        n0 n0Var = (n0) this.f6719b.f6573p.a();
        Locale locale = Locale.ENGLISH;
        String k4 = AbstractC0005f.k(n0Var.f7310b.incrementAndGet(), "cnt=", ",mds=0");
        d9 d9Var = new d9(e9.f6838d);
        d9Var.f6792d = "initialize";
        d9Var.f6793e = k4;
        d9Var.a();
        ((rk) this.f6719b.f6561b.a()).b();
    }
}
