package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzesv implements zzfav {
    final zzfjk zza;
    private final long zzb;
    private final long zzc;

    public zzesv(zzfjk zzfjkVar, long j, long j2) {
        this.zza = zzfjkVar;
        this.zzb = j;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        zzfjk zzfjkVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjkVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzfjkVar.zzg);
        int i = zzfjkVar.zzp.zza;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j = this.zzb;
        bundle.putLong("start_signals_timestamp", j);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoW)).booleanValue()) {
            bundle.putLong("tsi", j - this.zzc);
        }
        zzfjz.zzd(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfjz.zzb(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j2 = zzmVar.zzb;
        zzfjz.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j2)), j2 != -1);
        zzfjz.zzf(bundle, "extras", zzmVar.zzc);
        int i3 = zzmVar.zzd;
        zzfjz.zzc(bundle, "cust_gender", i3, i3 != -1);
        zzfjz.zzg(bundle, "kw", zzmVar.zze);
        int i4 = zzmVar.zzg;
        zzfjz.zzc(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i5 = zzmVar.zza;
        zzfjz.zzc(bundle, "d_imp_hdr", 1, i5 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfjz.zzb(bundle, "ppid", str, i5 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfjz.zze(bundle, "url", zzmVar.zzl);
        zzfjz.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfjz.zzf(bundle, "custom_targeting", zzmVar.zzn);
        zzfjz.zzg(bundle, "category_exclusions", zzmVar.zzo);
        zzfjz.zze(bundle, "request_agent", zzmVar.zzp);
        zzfjz.zze(bundle, "request_pkg", zzmVar.zzq);
        zzfjz.zzd(bundle, "is_designed_for_families", zzmVar.zzr, i5 >= 7);
        if (i5 >= 8) {
            int i6 = zzmVar.zzt;
            zzfjz.zzc(bundle, "tag_for_under_age_of_consent", i6, i6 != -1);
            zzfjz.zze(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
        Bundle bundle3 = zzfjkVar.zze;
        zzfjz.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzfjz.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzfjz.zze(bundle, "plid", bundle3.getString("plid"));
        zzfjz.zzc(bundle, "s2s_rr", 1, zzfjkVar.zzv && !(zzmVar.zzs == null && zzmVar.zzx == null));
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzdah) obj).zzb;
        zzfjk zzfjkVar = this.zza;
        bundle.putString("slotname", zzfjkVar.zzg);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjkVar.zzd;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzmVar.zzg;
        zzfjz.zzc(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (zzmVar.zza >= 8) {
            int i2 = zzmVar.zzt;
            zzfjz.zzc(bundle, "tag_for_under_age_of_consent", i2, i2 != -1);
        }
        zzfjz.zze(bundle, "url", zzmVar.zzl);
        zzfjz.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = zzmVar.zzc;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziA)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfjz.zzf(bundle, "extras", bundle3);
    }
}
