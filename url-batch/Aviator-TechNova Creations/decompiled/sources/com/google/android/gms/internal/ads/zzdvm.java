package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzdvm {
    private final Map zza = new HashMap();

    zzdvm() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zza(String str, @Nullable zzfki zzfkiVar) {
        zzbwh zzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbwh zzbwhVar = null;
        if (zzfkiVar != null) {
            try {
                zzB = zzfkiVar.zzB();
            } catch (zzfjr unused) {
            }
            if (zzfkiVar != null) {
                try {
                    zzbwhVar = zzfkiVar.zzC();
                } catch (zzfjr unused2) {
                }
            }
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
                if (zzfkiVar != null) {
                    try {
                        zzfkiVar.zzn();
                    } catch (zzfjr unused3) {
                    }
                }
                z = false;
            }
            this.zza.put(str, new zzdvl(str, zzB, zzbwhVar, z));
        }
        zzB = null;
        if (zzfkiVar != null) {
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
        }
        this.zza.put(str, new zzdvl(str, zzB, zzbwhVar, z2));
    }

    final synchronized void zzb(String str, zzbvs zzbvsVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdvl(str, zzbvsVar.zzf(), zzbvsVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzdvl zzc(String str) {
        return (zzdvl) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbwh zzbwhVar;
        zzdvl zzc = zzc(str);
        return (zzc == null || (zzbwhVar = zzc.zzb) == null) ? "" : zzbwhVar.toString();
    }
}
