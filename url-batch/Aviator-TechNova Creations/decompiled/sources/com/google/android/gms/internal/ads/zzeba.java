package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeba {
    private final zzeak zza;
    private final zzdvm zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzeba(zzeak zzeakVar, zzdvm zzdvmVar) {
        this.zza = zzeakVar;
        this.zzb = zzdvmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc(List list) {
        String str;
        boolean z;
        zzdvl zzc;
        zzbwh zzbwhVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbqg zzbqgVar = (zzbqg) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkM)).booleanValue()) {
                    zzdvl zzc2 = this.zzb.zzc(zzbqgVar.zza);
                    if (zzc2 != null && (zzbwhVar = zzc2.zzc) != null) {
                        str = zzbwhVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue() && (zzc = this.zzb.zzc(zzbqgVar.zza)) != null && zzc.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzbqgVar.zza;
                    list2.add(new zzeaz(str3, str2, this.zzb.zzd(str3), zzbqgVar.zzb ? 1 : 0, zzbqgVar.zzd, zzbqgVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzbqgVar.zza;
                list22.add(new zzeaz(str32, str2, this.zzb.zzd(str32), zzbqgVar.zzb ? 1 : 0, zzbqgVar.zzd, zzbqgVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzb(new zzeay(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                zzeak zzeakVar = this.zza;
                if (!zzeakVar.zze()) {
                    zza();
                    return jSONArray;
                }
                zzc(zzeakVar.zzd());
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzeaz) it.next()).zza());
            }
            return jSONArray;
        }
    }
}
