package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdvn {
    private final zzdux zza;
    private final zzdpz zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzdvn(zzdux zzduxVar, zzdpz zzdpzVar) {
        this.zza = zzduxVar;
        this.zzb = zzdpzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        String str;
        boolean z;
        zzdpy zzc;
        zzbrl zzbrlVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzblk zzblkVar = (zzblk) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzke)).booleanValue()) {
                    zzdpy zzc2 = this.zzb.zzc(zzblkVar.zza);
                    if (zzc2 != null && (zzbrlVar = zzc2.zzc) != null) {
                        str = zzbrlVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkf)).booleanValue() && (zzc = this.zzb.zzc(zzblkVar.zza)) != null && zzc.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzblkVar.zza;
                    list2.add(new zzdvm(str3, str2, this.zzb.zzd(str3), zzblkVar.zzb ? 1 : 0, zzblkVar.zzd, zzblkVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzblkVar.zza;
                list22.add(new zzdvm(str32, str2, this.zzb.zzd(str32), zzblkVar.zzb ? 1 : 0, zzblkVar.zzd, zzblkVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new zzdvl(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                zzdux zzduxVar = this.zza;
                if (!zzduxVar.zze()) {
                    zza();
                    return jSONArray;
                }
                zzc(zzduxVar.zzd());
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzdvm) it.next()).zza());
            }
            return jSONArray;
        }
    }
}
