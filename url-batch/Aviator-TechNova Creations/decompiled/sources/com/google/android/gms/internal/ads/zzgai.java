package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgai {
    private static zzgai zzb;
    final zzgaj zza;

    private zzgai(Context context) {
        this.zza = zzgaj.zza(context);
    }

    public static final zzgai zza(Context context) {
        zzgai zzgaiVar;
        synchronized (zzgai.class) {
            if (zzb == null) {
                zzb = new zzgai(context);
            }
            zzgaiVar = zzb;
        }
        return zzgaiVar;
    }

    public final void zzb(boolean z) throws IOException {
        synchronized (zzgai.class) {
            zzgaj zzgajVar = this.zza;
            zzgajVar.zzb("paidv2_publisher_option", Boolean.valueOf(z));
            if (!z) {
                zzgajVar.zzf("paidv2_creation_time");
                zzgajVar.zzf("paidv2_id");
                zzgajVar.zzf("vendor_scoped_gpid_v2_id");
                zzgajVar.zzf("vendor_scoped_gpid_v2_creation_time");
            }
        }
    }

    public final boolean zzc() {
        boolean zze;
        synchronized (zzgai.class) {
            zze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zze;
    }

    public final void zzd(boolean z) throws IOException {
        synchronized (zzgai.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z));
        }
    }

    public final boolean zze() {
        boolean zze;
        synchronized (zzgai.class) {
            zze = this.zza.zze("paidv2_user_option", true);
        }
        return zze;
    }
}
