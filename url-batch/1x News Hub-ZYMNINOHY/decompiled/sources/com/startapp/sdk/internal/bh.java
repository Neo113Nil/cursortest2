package com.startapp.sdk.internal;

import E1.AbstractC0033i;
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
    public final /* synthetic */ Context f3611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gh f3613c;

    public bh(gh ghVar, Context context, com.startapp.sdk.components.a aVar) {
        this.f3613c = ghVar;
        this.f3611a = context;
        this.f3612b = aVar;
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z) {
        int parseInt;
        int parseInt2;
        gh ghVar = this.f3613c;
        Context context = this.f3611a;
        int i3 = 0;
        if (ghVar.f3879b) {
            p pVar = (p) com.startapp.sdk.components.a.a(context).f3454M.a();
            if (ghVar.f3890n || !CacheMetaData.b().a().g() || !MetaData.E().f0()) {
                pVar.f4277b = true;
                Context context2 = pVar.f;
                ((Executor) com.startapp.sdk.components.a.a(context2).f3445C.a()).execute(new n6(context2, new C0292k(pVar)));
            } else if (!pVar.f4277b && CacheMetaData.b().a().g() && MetaData.E().f0()) {
                pVar.f4278c = true;
                Context context3 = pVar.f;
                ((Executor) com.startapp.sdk.components.a.a(context3).f3445C.a()).execute(new o6(context3, new C0291j(pVar)));
            }
            if (z) {
                p pVar2 = (p) com.startapp.sdk.components.a.a(context).f3454M.a();
                ACMConfig a3 = CacheMetaData.b().a();
                if (a3 != null) {
                    MetaData E3 = MetaData.E();
                    Set<StartAppAd.AdMode> b3 = a3.b();
                    if (b3 != null && !b3.isEmpty() && CacheMetaData.d() && E3.f0() && ((q0) pVar2.o.a()).a() != null) {
                        int Z2 = E3.Z();
                        int i4 = AdsCommonMetaData.k().i();
                        for (StartAppAd.AdMode adMode : b3) {
                            if (adMode != null) {
                                String str = "autoLoadNotShownAdPrefix" + adMode.name();
                                int i5 = ((sf) pVar2.f4283i.a()).getInt(str, 0);
                                if (i5 < Z2) {
                                    AdPreferences adPreferences = new AdPreferences();
                                    adPreferences.makePreCached();
                                    StartAppAd.AdMode adMode2 = StartAppAd.AdMode.FULLPAGE;
                                    if (adMode != adMode2) {
                                        StartAppAd.AdMode adMode3 = StartAppAd.AdMode.OFFERWALL;
                                        if (adMode != adMode3) {
                                            pVar2.a(null, adMode, adPreferences, null, null);
                                        } else if (i4 < 100) {
                                            pVar2.a(null, adMode3, adPreferences, null, null);
                                        }
                                    } else if (i4 > 0) {
                                        pVar2.a(null, adMode2, adPreferences, null, null);
                                    }
                                    rf edit = ((sf) pVar2.f4283i.a()).edit();
                                    int i6 = i5 + 1;
                                    edit.a(str, Integer.valueOf(i6));
                                    edit.f4395a.putInt(str, i6);
                                    edit.apply();
                                }
                            }
                        }
                    }
                }
            }
        }
        l2 l2Var = (l2) this.f3612b.f3477r.a();
        synchronized (l2Var) {
            l2Var.a(Math.max(0L, (Math.max(60000L, l2Var.d()) + ((sf) l2Var.f4886e.a()).getLong(l2Var.f4888h, 0L)) - System.currentTimeMillis()));
        }
        ((jg) this.f3612b.f3478s.a()).e();
        ((mh) this.f3612b.f.a()).e();
        gh ghVar2 = this.f3613c;
        Context context4 = this.f3611a;
        ghVar2.getClass();
        ab abVar = (ab) com.startapp.sdk.components.a.a(context4).v.a();
        if (MetaData.E().m0()) {
            ce ceVar = new ce(fe.class);
            ceVar.f3658d = Long.valueOf(MetaData.E().O() * 60000);
            ceVar.f3656b = JobRequest$Network.ANY;
            abVar.a(new de(ceVar));
        } else {
            int a4 = de.a(fe.class);
            if (!abVar.f3560b.a(a4)) {
                abVar.f3559a.a(a4);
            }
        }
        gh ghVar3 = this.f3613c;
        Context context5 = this.f3611a;
        ghVar3.getClass();
        ab abVar2 = (ab) com.startapp.sdk.components.a.a(context5).v.a();
        if (MetaData.E().l0()) {
            ce ceVar2 = new ce(be.class);
            ceVar2.f3658d = Long.valueOf(MetaData.E().b(context5) * 60000);
            ceVar2.f3656b = JobRequest$Network.ANY;
            abVar2.a(new de(ceVar2));
        } else {
            int a5 = de.a(be.class);
            if (!abVar2.f3560b.a(a5)) {
                abVar2.f3559a.a(a5);
            }
        }
        gh ghVar4 = this.f3613c;
        Context context6 = this.f3611a;
        ghVar4.getClass();
        ab abVar3 = (ab) com.startapp.sdk.components.a.a(context6).v.a();
        MetaData E4 = MetaData.E();
        if (E4.l0() && E4.k0()) {
            long millis = TimeUnit.SECONDS.toMillis(E4.a(context6));
            ce ceVar3 = new ce(ae.class);
            ceVar3.f3658d = Long.valueOf(millis);
            ceVar3.f3656b = JobRequest$Network.ANY;
            ceVar3.f3657c = true;
            abVar3.a(new de(ceVar3));
        } else {
            int a6 = de.a(ae.class);
            if (!abVar3.f3560b.a(a6)) {
                abVar3.f3559a.a(a6);
            }
        }
        gh ghVar5 = this.f3613c;
        Context context7 = this.f3611a;
        ghVar5.getClass();
        com.startapp.sdk.components.a a7 = com.startapp.sdk.components.a.a(context7);
        sf sfVar = (sf) a7.f3449G.a();
        if (sfVar.getBoolean("shared_prefs_first_init", true)) {
            rf edit2 = sfVar.edit();
            edit2.a("totalSessions", 0);
            edit2.f4395a.putInt("totalSessions", 0);
            long currentTimeMillis = System.currentTimeMillis();
            edit2.a("firstSessionTime", Long.valueOf(currentTimeMillis));
            edit2.f4395a.putLong("firstSessionTime", currentTimeMillis);
            edit2.apply();
            ((Executor) a7.f3443A.a()).execute(new ch(context7, a7, sfVar));
        }
        if (this.f3611a != null) {
            d9 d9Var = new d9(e9.f3728i);
            d9Var.f3685j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f3442U.f4601a;
                if (aVar != null) {
                    ((t9) aVar.f3476q.a()).a(d9Var);
                }
            } catch (Throwable unused) {
            }
        }
        this.f3613c.getClass();
        pf pfVar = (pf) this.f3612b.f3480u.a();
        try {
            if (!pfVar.a()) {
                ((Executor) pfVar.f4315b.a()).execute(new nf(pfVar));
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        ef efVar = (ef) this.f3612b.f3469i.a();
        List a8 = efVar.a();
        efVar.f3747b.getClass();
        RscMetadata S2 = MetaData.E().S();
        MotionMetadata motionMetadata = null;
        if (S2 == null || !S2.d()) {
            S2 = null;
        }
        if (S2 != null && (S2.a() & 1024) != 0) {
            d9 d9Var2 = new d9(e9.f3724d);
            d9Var2.f3680d = "RSC init";
            StringBuilder sb = new StringBuilder("targets: ");
            sb.append(a8 != null ? Integer.valueOf(((LinkedList) a8).size()) : null);
            d9Var2.f3681e = sb.toString();
            d9Var2.a();
        }
        mc mcVar = (mc) this.f3612b.f3481w.a();
        MotionMetadata J2 = MetaData.E().J();
        if (J2 != null && J2.u()) {
            motionMetadata = J2;
        }
        if (motionMetadata != null) {
            mcVar.f4152e = ((Random) si.f4441d.a()).nextDouble() < motionMetadata.k();
        }
        mcVar.f4150c.post(new lc(mcVar));
        SensorsData U2 = MetaData.E().U();
        if (U2 != null && U2.h()) {
            ((ig) this.f3612b.f3482x.a()).a(this.f3611a);
        }
        n0 n0Var = (n0) this.f3612b.f3475p.a();
        int i7 = z ? 1 : 2;
        Locale locale = Locale.ENGLISH;
        String g3 = AbstractC0033i.g(n0Var.f4179b.incrementAndGet(), i7, "cnt=", ",mds=");
        d9 d9Var3 = new d9(e9.f3724d);
        d9Var3.f3680d = "initialize";
        d9Var3.f3681e = g3;
        d9Var3.a();
        ((rk) this.f3612b.f3463b.a()).b();
        String F3 = MetaData.E().F();
        if (F3 != null) {
            String version = StartAppSDK.getVersion();
            String[] split = F3.split("\\.");
            String[] split2 = version.split("\\.");
            int min = Math.min(split.length, split2.length);
            for (int i8 = 0; i8 < min; i8++) {
                try {
                    parseInt = Integer.parseInt(split[i8]);
                    parseInt2 = Integer.parseInt(split2[i8]);
                } catch (NumberFormatException unused2) {
                    int compareTo = split[i8].compareTo(split2[i8]);
                    if (compareTo <= 0) {
                        if (compareTo < 0) {
                        }
                    }
                }
                if (parseInt > parseInt2) {
                    i3 = i8 + 1;
                    break;
                } else {
                    if (parseInt < parseInt2) {
                        i3 = -(i8 + 1);
                        break;
                    }
                }
            }
            if (split.length > split2.length) {
                i3 = min + 1;
            } else if (split.length < split2.length) {
                i3 = -(min + 1);
            }
            if (i3 > 0) {
                Log.println(5, "StartAppSDK", "Current SDK version (" + StartAppSDK.getVersion() + ") is outdated. Integrate the most recent version (" + F3 + ") in order to improve your ads performance.");
            }
        }
    }

    @Override // com.startapp.sdk.internal.ic
    public final void a() {
        n0 n0Var = (n0) this.f3612b.f3475p.a();
        Locale locale = Locale.ENGLISH;
        String i3 = AbstractC0033i.i(n0Var.f4179b.incrementAndGet(), "cnt=", ",mds=0");
        d9 d9Var = new d9(e9.f3724d);
        d9Var.f3680d = "initialize";
        d9Var.f3681e = i3;
        d9Var.a();
        ((rk) this.f3612b.f3463b.a()).b();
    }
}
