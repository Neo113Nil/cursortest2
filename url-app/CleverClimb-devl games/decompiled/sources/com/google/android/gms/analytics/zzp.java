package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.cmplay.base.util.webview.util.WebUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzaw;
import com.google.android.gms.internal.measurement.zzbe;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzu;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzp implements Runnable {
    private final /* synthetic */ Map zzso;
    private final /* synthetic */ boolean zzsp;
    private final /* synthetic */ String zzsq;
    private final /* synthetic */ long zzsr;
    private final /* synthetic */ boolean zzss;
    private final /* synthetic */ boolean zzst;
    private final /* synthetic */ String zzsu;
    private final /* synthetic */ Tracker zzsv;

    zzp(Tracker tracker, Map map, boolean z, String str, long j, boolean z2, boolean z3, String str2) {
        this.zzsv = tracker;
        this.zzso = map;
        this.zzsp = z;
        this.zzsq = str;
        this.zzsr = j;
        this.zzss = z2;
        this.zzst = z3;
        this.zzsu = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzah zzcd;
        zzbe zzce;
        zzby zzcf;
        zzby zzcf2;
        zzai zzby;
        zzai zzby2;
        zzcm zzbu;
        zzck zzckVar;
        zzcm zzbu2;
        if (this.zzsv.zzsl.zzad()) {
            this.zzso.put(WebUtils.SC, "start");
        }
        Map map = this.zzso;
        GoogleAnalytics zzbx = this.zzsv.zzbx();
        Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
        zzdd.zzc(map, "cid", zzbx.zzh().zzcn().zzdn());
        String str = (String) this.zzso.get("sf");
        if (str != null) {
            double zza = zzdd.zza(str, 100.0d);
            if (zzdd.zza(zza, (String) this.zzso.get("cid"))) {
                this.zzsv.zzb("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(zza));
                return;
            }
        }
        zzcd = this.zzsv.zzcd();
        if (this.zzsp) {
            zzdd.zzb((Map<String, String>) this.zzso, "ate", zzcd.zzbc());
            zzdd.zzb((Map<String, String>) this.zzso, "adid", zzcd.zzbj());
        } else {
            this.zzso.remove("ate");
            this.zzso.remove("adid");
        }
        zzce = this.zzsv.zzce();
        zzu zzdb = zzce.zzdb();
        zzdd.zzb((Map<String, String>) this.zzso, "an", zzdb.zzaf());
        zzdd.zzb((Map<String, String>) this.zzso, "av", zzdb.zzag());
        zzdd.zzb((Map<String, String>) this.zzso, "aid", zzdb.zzah());
        zzdd.zzb((Map<String, String>) this.zzso, "aiid", zzdb.zzai());
        this.zzso.put("v", "1");
        this.zzso.put("_v", zzas.zzvk);
        Map map2 = this.zzso;
        zzcf = this.zzsv.zzcf();
        zzdd.zzb((Map<String, String>) map2, "ul", zzcf.zzeg().getLanguage());
        Map map3 = this.zzso;
        zzcf2 = this.zzsv.zzcf();
        zzdd.zzb((Map<String, String>) map3, "sr", zzcf2.zzeh());
        if (!(this.zzsq.equals("transaction") || this.zzsq.equals("item"))) {
            zzckVar = this.zzsv.zzsk;
            if (!zzckVar.zzer()) {
                zzbu2 = this.zzsv.zzbu();
                zzbu2.zza(this.zzso, "Too many hits sent too quickly, rate limiting invoked");
                return;
            }
        }
        long zzaf = zzdd.zzaf((String) this.zzso.get("ht"));
        if (zzaf == 0) {
            zzaf = this.zzsr;
        }
        long j = zzaf;
        if (this.zzss) {
            zzch zzchVar = new zzch(this.zzsv, this.zzso, j, this.zzst);
            zzbu = this.zzsv.zzbu();
            zzbu.zzc("Dry run enabled. Would have sent hit", zzchVar);
            return;
        }
        String str2 = (String) this.zzso.get("cid");
        HashMap hashMap = new HashMap();
        zzdd.zza(hashMap, "uid", (Map<String, String>) this.zzso);
        zzdd.zza(hashMap, "an", (Map<String, String>) this.zzso);
        zzdd.zza(hashMap, "aid", (Map<String, String>) this.zzso);
        zzdd.zza(hashMap, "av", (Map<String, String>) this.zzso);
        zzdd.zza(hashMap, "aiid", (Map<String, String>) this.zzso);
        zzaw zzawVar = new zzaw(0L, str2, this.zzsu, !TextUtils.isEmpty((CharSequence) this.zzso.get("adid")), 0L, hashMap);
        zzby = this.zzsv.zzby();
        this.zzso.put("_s", String.valueOf(zzby.zza(zzawVar)));
        zzch zzchVar2 = new zzch(this.zzsv, this.zzso, j, this.zzst);
        zzby2 = this.zzsv.zzby();
        zzby2.zza(zzchVar2);
    }
}
