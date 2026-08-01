package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbsr extends zzbss implements zzbkd {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcgv zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbcm zzk;
    private float zzl;
    private int zzm;

    public zzbsr(zzcgv zzcgvVar, Context context, zzbcm zzbcmVar) {
        super(zzcgvVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcgvVar;
        this.zzi = context;
        this.zzk = zzbcmVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzcbg.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzcbg.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.zzh.zzi();
        if (zzi == null || zzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzP = com.google.android.gms.ads.internal.util.zzt.zzP(zzi);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zzd = zzcbg.zzv(this.zza, zzP[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zze = zzcbg.zzv(this.zza, zzP[1]);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbsq zzbsqVar = new zzbsq();
        zzbcm zzbcmVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbsqVar.zze(zzbcmVar.zza(intent));
        zzbcm zzbcmVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbsqVar.zzc(zzbcmVar2.zza(intent2));
        zzbsqVar.zza(this.zzk.zzb());
        zzbsqVar.zzd(this.zzk.zzc());
        zzbsqVar.zzb(true);
        z = zzbsqVar.zza;
        z2 = zzbsqVar.zzb;
        z3 = zzbsqVar.zzc;
        z4 = zzbsqVar.zzd;
        z5 = zzbsqVar.zze;
        zzcgv zzcgvVar = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            zzcbn.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcgvVar.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            zzcbn.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzn().zza);
    }

    public final void zzb(int i, int i2) {
        int i3;
        Context context = this.zzi;
        int i4 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzp();
            i3 = com.google.android.gms.ads.internal.util.zzt.zzQ((Activity) context)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcgv zzcgvVar = this.zzh;
            int width = zzcgvVar.getWidth();
            int height = zzcgvVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzR)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i4 = this.zzh.zzO().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i4);
                }
            }
            i4 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i4);
        }
        zzf(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzN().zzB(i, i2);
    }
}
