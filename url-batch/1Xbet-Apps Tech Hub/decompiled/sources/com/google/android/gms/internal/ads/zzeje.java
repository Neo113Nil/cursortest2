package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzeje implements zzefv {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(zzfeh zzfehVar, zzfdu zzfduVar) {
        String optString = zzfduVar.zzw.optString("pubid", "");
        zzfeq zzfeqVar = zzfehVar.zza.zza;
        zzfeo zzfeoVar = new zzfeo();
        zzfeoVar.zzp(zzfeqVar);
        zzfeoVar.zzs(optString);
        Bundle zzd = zzd(zzfeqVar.zzd.zzm);
        Bundle zzd2 = zzd(zzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        zzd2.putInt("gw", 1);
        String optString2 = zzfduVar.zzw.optString("mad_hac", null);
        if (optString2 != null) {
            zzd2.putString("mad_hac", optString2);
        }
        String optString3 = zzfduVar.zzw.optString("adJson", null);
        if (optString3 != null) {
            zzd2.putString("_ad", optString3);
        }
        zzd2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzfduVar.zzE.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzfduVar.zzE.optString(next, null);
            if (next != null) {
                zzd2.putString(next, optString4);
            }
        }
        zzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzd2);
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzfeqVar.zzd;
        Bundle bundle = zzlVar.zzn;
        List list = zzlVar.zzo;
        String str = zzlVar.zzp;
        int i = zzlVar.zzd;
        String str2 = zzlVar.zzq;
        List list2 = zzlVar.zze;
        boolean z = zzlVar.zzr;
        boolean z2 = zzlVar.zzf;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzlVar.zzs;
        int i2 = zzlVar.zzg;
        int i3 = zzlVar.zzt;
        boolean z3 = zzlVar.zzh;
        String str3 = zzlVar.zzu;
        String str4 = zzlVar.zzi;
        List list3 = zzlVar.zzv;
        zzfeoVar.zzE(new com.google.android.gms.ads.internal.client.zzl(zzlVar.zza, zzlVar.zzb, zzd2, i, list2, z2, i2, z3, str4, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, zzd, bundle, list, str, str2, z, zzcVar, i3, str3, list3, zzlVar.zzw, zzlVar.zzx, zzlVar.zzy));
        zzfeq zzG = zzfeoVar.zzG();
        Bundle bundle2 = new Bundle();
        zzfdy zzfdyVar = zzfehVar.zzb.zzb;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(zzfdyVar.zza));
        bundle3.putInt("refresh_interval", zzfdyVar.zzc);
        bundle3.putString("gws_query_id", zzfdyVar.zzb);
        bundle2.putBundle("parent_common_config", bundle3);
        zzfeq zzfeqVar2 = zzfehVar.zza.zza;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", zzfeqVar2.zzf);
        bundle4.putString("allocation_id", zzfduVar.zzx);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(zzfduVar.zzc));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(zzfduVar.zzd));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfduVar.zzq));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(zzfduVar.zzn));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(zzfduVar.zzh));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(zzfduVar.zzi));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(zzfduVar.zzj));
        bundle4.putString(FirebaseAnalytics.Param.TRANSACTION_ID, zzfduVar.zzk);
        bundle4.putString("valid_from_timestamp", zzfduVar.zzl);
        bundle4.putBoolean("is_closable_area_disabled", zzfduVar.zzQ);
        bundle4.putString("recursive_server_response_data", zzfduVar.zzap);
        if (zzfduVar.zzm != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", zzfduVar.zzm.zzb);
            bundle5.putString("rb_type", zzfduVar.zzm.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return zzc(zzG, bundle2, zzfduVar, zzfehVar);
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        return !TextUtils.isEmpty(zzfduVar.zzw.optString("pubid", ""));
    }

    protected abstract ListenableFuture zzc(zzfeq zzfeqVar, Bundle bundle, zzfdu zzfduVar, zzfeh zzfehVar);
}
