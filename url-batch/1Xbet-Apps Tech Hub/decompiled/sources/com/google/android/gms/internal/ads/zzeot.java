package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeot implements zzeux {
    final zzfeq zza;
    private final long zzb;

    public zzeot(zzfeq zzfeqVar, long j) {
        Preconditions.checkNotNull(zzfeqVar, "the targeting must not be null");
        this.zza = zzfeqVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
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
        zzffc.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
        zzffc.zzb(bundle, "extras", zzlVar.zzc);
        int i3 = zzlVar.zzd;
        zzffc.zze(bundle, "cust_gender", i3, i3 != -1);
        zzffc.zzd(bundle, "kw", zzlVar.zze);
        int i4 = zzlVar.zzg;
        zzffc.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzlVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzlVar.zzy);
        zzffc.zze(bundle, "d_imp_hdr", 1, zzlVar.zza >= 2 && zzlVar.zzh);
        String str = zzlVar.zzi;
        zzffc.zzf(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzlVar.zzk;
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
        zzffc.zzc(bundle, ImagesContract.URL, zzlVar.zzl);
        zzffc.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
        zzffc.zzb(bundle, "custom_targeting", zzlVar.zzn);
        zzffc.zzd(bundle, "category_exclusions", zzlVar.zzo);
        zzffc.zzc(bundle, "request_agent", zzlVar.zzp);
        zzffc.zzc(bundle, "request_pkg", zzlVar.zzq);
        zzffc.zzg(bundle, "is_designed_for_families", zzlVar.zzr, zzlVar.zza >= 7);
        if (zzlVar.zza >= 8) {
            int i5 = zzlVar.zzt;
            zzffc.zze(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            zzffc.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
        }
    }
}
