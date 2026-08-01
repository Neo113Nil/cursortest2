package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzblb;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzciq;
import com.google.android.gms.internal.ads.zzdle;
import com.google.android.gms.internal.ads.zzdlg;
import com.google.android.gms.internal.ads.zzduy;
import com.google.android.gms.internal.ads.zzemp;
import com.google.android.gms.internal.ads.zzeyu;
import com.google.android.gms.internal.ads.zzfai;
import com.google.android.gms.internal.ads.zzfbz;
import com.google.android.gms.internal.ads.zzfdn;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbpr zzbprVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzemp(zzciq.zzb(context, zzbprVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbpr zzbprVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeyu zzs = zzciq.zzb(context, zzbprVar, i).zzs();
        zzs.zza(str);
        zzs.zzb(context);
        return i >= ((Integer) zzba.zzc().zza(zzbdc.zzfg)).intValue() ? zzs.zzc().zza() : new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbpr zzbprVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfai zzt = zzciq.zzb(context, zzbprVar, i).zzt();
        zzt.zzc(context);
        zzt.zza(zzqVar);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbpr zzbprVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbz zzu = zzciq.zzb(context, zzbprVar, i).zzu();
        zzu.zzc(context);
        zzu.zza(zzqVar);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new zzcbt(234310000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzciq.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) {
        return zzciq.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbprVar, i).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbgm zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdlg((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 234310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbgs zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdle((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzble zzk(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i, zzblb zzblbVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzduy zzj = zzciq.zzb(context, zzbprVar, i).zzj();
        zzj.zzb(context);
        zzj.zza(zzblbVar);
        return zzj.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbti zzl(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) {
        return zzciq.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbprVar, i).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbtp zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i = zza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new com.google.android.gms.ads.internal.overlay.zzt(activity) : new zzac(activity) : new zzy(activity, zza) : new zzaf(activity) : new zzae(activity) : new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbwt zzn(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfdn zzv = zzciq.zzb(context, zzbprVar, i).zzv();
        zzv.zzb(context);
        return zzv.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbxj zzo(IObjectWrapper iObjectWrapper, String str, zzbpr zzbprVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfdn zzv = zzciq.zzb(context, zzbprVar, i).zzv();
        zzv.zzb(context);
        zzv.zza(str);
        return zzv.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzcae zzp(IObjectWrapper iObjectWrapper, zzbpr zzbprVar, int i) {
        return zzciq.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbprVar, i).zzp();
    }
}
