package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdng extends zzbgp {
    private final Context zza;
    private final zzdiu zzb;
    private zzdjt zzc;
    private zzdip zzd;

    public zzdng(Context context, zzdiu zzdiuVar, zzdjt zzdjtVar, zzdip zzdipVar) {
        this.zza = context;
        this.zzb = zzdiuVar;
        this.zzc = zzdjtVar;
        this.zzd = zzdipVar;
    }

    final /* synthetic */ zzdip zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbfw zzf(String str) {
        return (zzbfw) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final List zzg() {
        try {
            zzdiu zzdiuVar = this.zzb;
            SimpleArrayMap zzaa = zzdiuVar.zzaa();
            SimpleArrayMap zzad = zzdiuVar.zzad();
            String[] strArr = new String[zzaa.getSize() + zzad.getSize()];
            int i = 0;
            for (int i2 = 0; i2 < zzaa.getSize(); i2++) {
                strArr[i] = (String) zzaa.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < zzad.getSize(); i3++) {
                strArr[i] = (String) zzad.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzi(String str) {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null) {
            zzdipVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzj() {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null) {
            zzdipVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzed zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null) {
            zzdipVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        zzdjt zzdjtVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdjtVar = this.zzc) == null || !zzdjtVar.zzd((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdnf(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzo() {
        zzdip zzdipVar = this.zzd;
        if (zzdipVar != null && !zzdipVar.zzM()) {
            return false;
        }
        zzdiu zzdiuVar = this.zzb;
        return zzdiuVar.zzW() != null && zzdiuVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzp() {
        zzdiu zzdiuVar = this.zzb;
        zzedu zzZ = zzdiuVar.zzZ();
        if (zzZ == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzZ.zza());
        if (zzdiuVar.zzW() == null) {
            return true;
        }
        zzdiuVar.zzW().zze("onSdkLoaded", new ArrayMap());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzdip zzdipVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzZ() == null || (zzdipVar = this.zzd) == null) {
            return;
        }
        zzdipVar.zzN((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzr() {
        try {
            String zzac = this.zzb.zzac();
            if (Objects.equals(zzac, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(zzac)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdip zzdipVar = this.zzd;
                if (zzdipVar != null) {
                    zzdipVar.zzL(zzac, false);
                }
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbft zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        zzdjt zzdjtVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdjtVar = this.zzc) == null || !zzdjtVar.zze((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdnf(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}
