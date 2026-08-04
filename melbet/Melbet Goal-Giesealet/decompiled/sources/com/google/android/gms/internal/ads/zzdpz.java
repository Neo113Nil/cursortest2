package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzdpz {
    private final Map zza = new HashMap();

    zzdpz() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zza(String str, @Nullable zzfea zzfeaVar) {
        zzbrl zzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbrl zzbrlVar = null;
        if (zzfeaVar != null) {
            try {
                zzB = zzfeaVar.zzB();
            } catch (zzfdj unused) {
            }
            if (zzfeaVar != null) {
                try {
                    zzbrlVar = zzfeaVar.zzC();
                } catch (zzfdj unused2) {
                }
            }
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkf)).booleanValue()) {
                if (zzfeaVar != null) {
                    try {
                        zzfeaVar.zzn();
                    } catch (zzfdj unused3) {
                    }
                }
                z = false;
            }
            this.zza.put(str, new zzdpy(str, zzB, zzbrlVar, z));
        }
        zzB = null;
        if (zzfeaVar != null) {
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkf)).booleanValue()) {
        }
        this.zza.put(str, new zzdpy(str, zzB, zzbrlVar, z2));
    }

    final synchronized void zzb(String str, zzbqw zzbqwVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdpy(str, zzbqwVar.zzf(), zzbqwVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzdpy zzc(String str) {
        return (zzdpy) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbrl zzbrlVar;
        zzdpy zzc = zzc(str);
        return (zzc == null || (zzbrlVar = zzc.zzb) == null) ? "" : zzbrlVar.toString();
    }
}
