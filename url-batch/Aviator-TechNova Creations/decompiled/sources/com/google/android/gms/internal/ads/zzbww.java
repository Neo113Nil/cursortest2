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

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbww extends zzbwx implements zzboh {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcjl zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbgl zzk;
    private float zzl;
    private int zzm;

    public zzbww(zzcjl zzcjlVar, Context context, zzbgl zzbglVar) {
        super(zzcjlVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcjlVar;
        this.zzi = context;
        this.zzk = zzbglVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics2, displayMetrics2.heightPixels);
        zzcjl zzcjlVar = this.zzh;
        Activity zzj = zzcjlVar.zzj();
        if (zzj == null || zzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] zzX = com.google.android.gms.ads.internal.util.zzs.zzX(zzj);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, zzX[0]);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, zzX[1]);
        }
        if (zzcjlVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcjlVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbwv zzbwvVar = new zzbwv();
        zzbgl zzbglVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbwvVar.zzb(zzbglVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbwvVar.zza(zzbglVar.zzc(intent2));
        zzbwvVar.zzc(zzbglVar.zzb());
        zzbwvVar.zzd(zzbglVar.zza());
        zzbwvVar.zze(true);
        boolean zzf = zzbwvVar.zzf();
        boolean zzg = zzbwvVar.zzg();
        boolean zzh = zzbwvVar.zzh();
        boolean zzi = zzbwvVar.zzi();
        try {
            jSONObject = new JSONObject().put("sms", zzf).put("tel", zzg).put("calendar", zzh).put("storePicture", zzi).put("inlineVideo", zzbwvVar.zzj());
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcjlVar.zzd("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        zzcjlVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Dispatching Ready Event.");
        }
        zzh(zzcjlVar.zzs().afmaVersion);
    }

    public final void zzb(int i, int i2) {
        int i3;
        Context context = this.zzi;
        int i4 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzc();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzY((Activity) context)[0];
        } else {
            i3 = 0;
        }
        zzcjl zzcjlVar = this.zzh;
        if (zzcjlVar.zzN() == null || !zzcjlVar.zzN().zzg()) {
            int width = zzcjlVar.getWidth();
            int height = zzcjlVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaA)).booleanValue()) {
                if (width == 0) {
                    width = zzcjlVar.zzN() != null ? zzcjlVar.zzN().zzb : 0;
                }
                if (height == 0) {
                    if (zzcjlVar.zzN() != null) {
                        i4 = zzcjlVar.zzN().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, i4);
                }
            }
            i4 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, i4);
        }
        zzj(i, i2 - i3, this.zzf, this.zzg);
        zzcjlVar.zzP().zzP(i, i2);
    }
}
