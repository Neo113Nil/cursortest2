package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public class zzat {
    private static volatile zzat zzvl;
    private final Context zzqs;
    private final Clock zzrj;
    private final Context zzvm;
    private final zzbu zzvn;
    private final zzcm zzvo;
    private final zzk zzvp;
    private final zzai zzvq;
    private final zzbz zzvr;
    private final zzde zzvs;
    private final zzcq zzvt;
    private final GoogleAnalytics zzvu;
    private final zzbl zzvv;
    private final zzah zzvw;
    private final zzbe zzvx;
    private final zzby zzvy;

    private zzat(zzav zzavVar) {
        Context applicationContext = zzavVar.getApplicationContext();
        Preconditions.checkNotNull(applicationContext, "Application context can't be null");
        Context zzci = zzavVar.zzci();
        Preconditions.checkNotNull(zzci);
        this.zzqs = applicationContext;
        this.zzvm = zzci;
        this.zzrj = DefaultClock.getInstance();
        this.zzvn = new zzbu(this);
        zzcm zzcmVar = new zzcm(this);
        zzcmVar.zzm();
        this.zzvo = zzcmVar;
        zzcm zzbu = zzbu();
        String str = zzas.VERSION;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 134);
        sb.append("Google Analytics ");
        sb.append(str);
        sb.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzbu.zzs(sb.toString());
        zzcq zzcqVar = new zzcq(this);
        zzcqVar.zzm();
        this.zzvt = zzcqVar;
        zzde zzdeVar = new zzde(this);
        zzdeVar.zzm();
        this.zzvs = zzdeVar;
        zzai zzaiVar = new zzai(this, zzavVar);
        zzbl zzblVar = new zzbl(this);
        zzah zzahVar = new zzah(this);
        zzbe zzbeVar = new zzbe(this);
        zzby zzbyVar = new zzby(this);
        zzk zzb = zzk.zzb(applicationContext);
        zzb.zza(new zzau(this));
        this.zzvp = zzb;
        GoogleAnalytics googleAnalytics = new GoogleAnalytics(this);
        zzblVar.zzm();
        this.zzvv = zzblVar;
        zzahVar.zzm();
        this.zzvw = zzahVar;
        zzbeVar.zzm();
        this.zzvx = zzbeVar;
        zzbyVar.zzm();
        this.zzvy = zzbyVar;
        zzbz zzbzVar = new zzbz(this);
        zzbzVar.zzm();
        this.zzvr = zzbzVar;
        zzaiVar.zzm();
        this.zzvq = zzaiVar;
        googleAnalytics.zzm();
        this.zzvu = googleAnalytics;
        zzaiVar.start();
    }

    private static void zza(zzar zzarVar) {
        Preconditions.checkNotNull(zzarVar, "Analytics service not created/initialized");
        Preconditions.checkArgument(zzarVar.isInitialized(), "Analytics service not initialized");
    }

    public static zzat zzc(Context context) {
        Preconditions.checkNotNull(context);
        if (zzvl == null) {
            synchronized (zzat.class) {
                if (zzvl == null) {
                    Clock defaultClock = DefaultClock.getInstance();
                    long elapsedRealtime = defaultClock.elapsedRealtime();
                    zzat zzatVar = new zzat(new zzav(context));
                    zzvl = zzatVar;
                    GoogleAnalytics.zzn();
                    long elapsedRealtime2 = defaultClock.elapsedRealtime() - elapsedRealtime;
                    long longValue = zzcc.zzzv.get().longValue();
                    if (elapsedRealtime2 > longValue) {
                        zzatVar.zzbu().zzc("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return zzvl;
    }

    public final Context getContext() {
        return this.zzqs;
    }

    public final Clock zzbt() {
        return this.zzrj;
    }

    public final zzcm zzbu() {
        zza(this.zzvo);
        return this.zzvo;
    }

    public final zzbu zzbv() {
        return this.zzvn;
    }

    public final zzk zzbw() {
        Preconditions.checkNotNull(this.zzvp);
        return this.zzvp;
    }

    public final zzai zzby() {
        zza(this.zzvq);
        return this.zzvq;
    }

    public final zzbz zzbz() {
        zza(this.zzvr);
        return this.zzvr;
    }

    public final zzde zzca() {
        zza(this.zzvs);
        return this.zzvs;
    }

    public final zzcq zzcb() {
        zza(this.zzvt);
        return this.zzvt;
    }

    public final zzbe zzce() {
        zza(this.zzvx);
        return this.zzvx;
    }

    public final zzby zzcf() {
        return this.zzvy;
    }

    public final Context zzci() {
        return this.zzvm;
    }

    public final zzcm zzcj() {
        return this.zzvo;
    }

    public final GoogleAnalytics zzck() {
        Preconditions.checkNotNull(this.zzvu);
        Preconditions.checkArgument(this.zzvu.isInitialized(), "Analytics instance not initialized");
        return this.zzvu;
    }

    public final zzcq zzcl() {
        if (this.zzvt == null || !this.zzvt.isInitialized()) {
            return null;
        }
        return this.zzvt;
    }

    public final zzah zzcm() {
        zza(this.zzvw);
        return this.zzvw;
    }

    public final zzbl zzcn() {
        zza(this.zzvv);
        return this.zzvv;
    }
}
