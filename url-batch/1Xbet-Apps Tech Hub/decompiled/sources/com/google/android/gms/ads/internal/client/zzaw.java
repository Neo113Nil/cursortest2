package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbuu;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcbn;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbih zzd;
    private final zzbxv zze;
    private final zzbtm zzf;
    private final zzbii zzg;
    private zzbuu zzh;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbih zzbihVar, zzbxv zzbxvVar, zzbtm zzbtmVar, zzbii zzbiiVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzeqVar;
        this.zzd = zzbihVar;
        this.zze = zzbxvVar;
        this.zzf = zzbtmVar;
        this.zzg = zzbiiVar;
    }

    static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbpr zzbprVar) {
        return (zzbq) new zzao(this, context, str, zzbprVar).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, zzbpr zzbprVar) {
        return (zzbu) new zzak(this, context, zzqVar, str, zzbprVar).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, zzbpr zzbprVar) {
        return (zzbu) new zzam(this, context, zzqVar, str, zzbprVar).zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbpr zzbprVar) {
        return (zzdj) new zzac(this, context, zzbprVar).zzd(context, false);
    }

    public final zzbgm zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbgm) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbgs zzi(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbgs) new zzau(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzble zzl(Context context, zzbpr zzbprVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzble) new zzai(this, context, zzbprVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbti zzm(Context context, zzbpr zzbprVar) {
        return (zzbti) new zzag(this, context, zzbprVar).zzd(context, false);
    }

    public final zzbtp zzo(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzcbn.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbtp) zzaaVar.zzd(activity, z);
    }

    public final zzbxj zzq(Context context, String str, zzbpr zzbprVar) {
        return (zzbxj) new zzav(this, context, str, zzbprVar).zzd(context, false);
    }

    public final zzcae zzr(Context context, zzbpr zzbprVar) {
        return (zzcae) new zzae(this, context, zzbprVar).zzd(context, false);
    }
}
