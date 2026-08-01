package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdor extends zzbhb {
    private final Context zza;
    private final zzdkk zzb;
    private zzdlk zzc;
    private zzdkf zzd;

    public zzdor(Context context, zzdkk zzdkkVar, zzdlk zzdlkVar, zzdkf zzdkfVar) {
        this.zza = context;
        this.zzb = zzdkkVar;
        this.zzc = zzdlkVar;
        this.zzd = zzdkfVar;
    }

    private final zzbfv zzd(String str) {
        return new zzdoq(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final zzbgf zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final zzbgi zzg(String str) {
        return (zzbgi) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final List zzk() {
        try {
            SimpleArrayMap zzh = this.zzb.zzh();
            SimpleArrayMap zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.size() + zzi.size()];
            int i = 0;
            for (int i2 = 0; i2 < zzh.size(); i2++) {
                strArr[i] = (String) zzh.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < zzi.size(); i3++) {
                strArr[i] = (String) zzi.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzl() {
        zzdkf zzdkfVar = this.zzd;
        if (zzdkfVar != null) {
            zzdkfVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (zzC != "Google" && (zzC == null || !zzC.equals("Google"))) {
                if (TextUtils.isEmpty(zzC)) {
                    zzcbn.zzj("Not starting OMID session. OM partner name has not been configured.");
                    return;
                }
                zzdkf zzdkfVar = this.zzd;
                if (zzdkfVar != null) {
                    zzdkfVar.zzf(zzC, false);
                    return;
                }
                return;
            }
            zzcbn.zzj("Illegal argument specified for omid partner name.");
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzn(String str) {
        zzdkf zzdkfVar = this.zzd;
        if (zzdkfVar != null) {
            zzdkfVar.zzE(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzo() {
        zzdkf zzdkfVar = this.zzd;
        if (zzdkfVar != null) {
            zzdkfVar.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdkf zzdkfVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzu() == null || (zzdkfVar = this.zzd) == null) {
            return;
        }
        zzdkfVar.zzI((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzq() {
        zzdkf zzdkfVar = this.zzd;
        return (zzdkfVar == null || zzdkfVar.zzV()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdlk zzdlkVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdlkVar = this.zzc) == null || !zzdlkVar.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzq().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdlk zzdlkVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdlkVar = this.zzc) == null || !zzdlkVar.zzg((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzs().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzt() {
        zzflf zzu = this.zzb.zzu();
        if (zzu == null) {
            zzcbn.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzi(zzu);
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new ArrayMap());
        return true;
    }
}
