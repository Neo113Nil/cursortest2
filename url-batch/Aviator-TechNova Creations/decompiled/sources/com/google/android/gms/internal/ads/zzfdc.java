package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfdc {
    private final zzbzu zza;
    private final int zzb;

    public zzfdc(zzbzu zzbzuVar, int i) {
        this.zza = zzbzuVar;
        this.zzb = i;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return zzgrt.zza(this.zza.zza.getString("ms"));
    }

    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }

    final boolean zzg() {
        return this.zza.zzk;
    }

    final boolean zzh() {
        return this.zza.zzl;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    final int zzi() {
        boolean z;
        Bundle bundle = this.zza.zza.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        z = 5;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        z = 6;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        z = 7;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        z = 8;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    return 0;
                case true:
                    return 1;
                case true:
                    return 2;
                case true:
                    return 3;
                case true:
                    return 4;
                case true:
                    return 5;
                case true:
                    return 6;
                case true:
                    return 7;
                case true:
                    return 8;
            }
        }
        return -1;
    }

    final int zzj() {
        return this.zza.zzo;
    }
}
