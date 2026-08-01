package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbcv {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza((zzbcu) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbdg.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza((zzbcu) it.next());
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbdg.zzb());
        return zza;
    }

    public final void zzc(zzbcu zzbcuVar) {
        this.zzb.add(zzbcuVar);
    }

    public final void zzd(zzbcu zzbcuVar) {
        this.zza.add(zzbcuVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbcu zzbcuVar : this.zza) {
            if (zzbcuVar.zze() == 1) {
                zzbcuVar.zzd(editor, zzbcuVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzcbn.zzg("Flag Json is null.");
        }
    }
}
