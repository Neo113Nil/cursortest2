package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdrh {
    private final Map zza = new HashMap();

    zzdrh() {
    }

    @Nullable
    public final synchronized zzdrg zza(String str) {
        return (zzdrg) this.zza.get(str);
    }

    @Nullable
    public final zzdrg zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdrg zza = zza((String) it.next());
            if (zza != null) {
                return zza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbsd zzbsdVar;
        zzdrg zza = zza(str);
        return (zza == null || (zzbsdVar = zza.zzb) == null) ? "" : zzbsdVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zzd(String str, @Nullable zzffm zzffmVar) {
        zzbsd zze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbsd zzbsdVar = null;
        if (zzffmVar != null) {
            try {
                zze = zzffmVar.zze();
            } catch (zzfev unused) {
            }
            if (zzffmVar != null) {
                try {
                    zzbsdVar = zzffmVar.zzf();
                } catch (zzfev unused2) {
                }
            }
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjg)).booleanValue()) {
                if (zzffmVar != null) {
                    try {
                        zzffmVar.zzC();
                    } catch (zzfev unused3) {
                    }
                }
                z = false;
            }
            this.zza.put(str, new zzdrg(str, zze, zzbsdVar, z));
        }
        zze = null;
        if (zzffmVar != null) {
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjg)).booleanValue()) {
        }
        this.zza.put(str, new zzdrg(str, zze, zzbsdVar, z2));
    }

    final synchronized void zze(String str, zzbrp zzbrpVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdrg(str, zzbrpVar.zzf(), zzbrpVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
