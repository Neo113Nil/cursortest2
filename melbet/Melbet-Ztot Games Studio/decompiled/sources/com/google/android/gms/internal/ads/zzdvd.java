package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzdvd {
    private final zzdun zza;
    private final zzdpy zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzdvd(zzdun zzdunVar, zzdpy zzdpyVar) {
        this.zza = zzdunVar;
        this.zzb = zzdpyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        zzdpx zza;
        zzbra zzbraVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbkv zzbkvVar = (zzbkv) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziw)).booleanValue()) {
                    zzdpx zza2 = this.zzb.zza(zzbkvVar.zza);
                    if (zza2 != null && (zzbraVar = zza2.zzc) != null) {
                        str = zzbraVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzix)).booleanValue() && (zza = this.zzb.zza(zzbkvVar.zza)) != null && zza.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzbkvVar.zza;
                    list2.add(new zzdvc(str3, str2, this.zzb.zzb(str3), zzbkvVar.zzb ? 1 : 0, zzbkvVar.zzd, zzbkvVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzbkvVar.zza;
                list22.add(new zzdvc(str32, str2, this.zzb.zzb(str32), zzbkvVar.zzb ? 1 : 0, zzbkvVar.zzd, zzbkvVar.zzc, z));
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
                jSONArray.put(((zzdvc) it.next()).zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdvb(this));
    }
}
