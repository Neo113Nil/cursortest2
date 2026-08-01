package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdwi {
    private final zzdvs zza;
    private final zzdrh zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzdwi(zzdvs zzdvsVar, zzdrh zzdrhVar) {
        this.zza = zzdvsVar;
        this.zzb = zzdrhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        zzdrg zza;
        zzbsd zzbsdVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbma zzbmaVar = (zzbma) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjf)).booleanValue()) {
                    zzdrg zza2 = this.zzb.zza(zzbmaVar.zza);
                    if (zza2 != null && (zzbsdVar = zza2.zzc) != null) {
                        str = zzbsdVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjg)).booleanValue() && (zza = this.zzb.zza(zzbmaVar.zza)) != null && zza.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzbmaVar.zza;
                    list2.add(new zzdwh(str3, str2, this.zzb.zzc(str3), zzbmaVar.zzb ? 1 : 0, zzbmaVar.zzd, zzbmaVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzbmaVar.zza;
                list22.add(new zzdwh(str32, str2, this.zzb.zzc(str32), zzbmaVar.zzb ? 1 : 0, zzbmaVar.zzd, zzbmaVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                }
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdwh) it.next()).zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdwg(this));
    }
}
