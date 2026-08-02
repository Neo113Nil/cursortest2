package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzenr implements zzevn {
    final zzffg zza;
    private final long zzb;

    public zzenr(zzffg zzffgVar, long j) {
        Preconditions.checkNotNull(zzffgVar, "the targeting must not be null");
        this.zza = zzffgVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzffu.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
        zzffu.zzb(bundle, "extras", zzlVar.zzc);
        int i3 = zzlVar.zzd;
        zzffu.zze(bundle, "cust_gender", i3, i3 != -1);
        zzffu.zzd(bundle, "kw", zzlVar.zze);
        int i4 = zzlVar.zzg;
        zzffu.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzlVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzlVar.zzy);
        zzffu.zze(bundle, "d_imp_hdr", 1, zzlVar.zza >= 2 && zzlVar.zzh);
        String str = zzlVar.zzi;
        zzffu.zzf(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzlVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = location.getLongitude() * 1.0E7d;
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzffu.zzc(bundle, ImagesContract.URL, zzlVar.zzl);
        zzffu.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
        zzffu.zzb(bundle, "custom_targeting", zzlVar.zzn);
        zzffu.zzd(bundle, "category_exclusions", zzlVar.zzo);
        zzffu.zzc(bundle, "request_agent", zzlVar.zzp);
        zzffu.zzc(bundle, "request_pkg", zzlVar.zzq);
        zzffu.zzg(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza >= 7);
        if (zzlVar.zza >= 8) {
            int i5 = zzlVar.zzt;
            zzffu.zze(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            zzffu.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
        }
    }
}
