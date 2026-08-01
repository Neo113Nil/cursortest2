package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfra extends zzfqx {
    private static zzfra zzc;

    private zzfra(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfra zzi(Context context) {
        zzfra zzfraVar;
        synchronized (zzfra.class) {
            if (zzc == null) {
                zzc = new zzfra(context);
            }
            zzfraVar = zzc;
        }
        return zzfraVar;
    }

    public final zzfqw zzh(long j, boolean z) throws IOException {
        synchronized (zzfra.class) {
            if (zzo()) {
                return zzb(null, null, j, z);
            }
            return new zzfqw();
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfra.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() throws IOException {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void zzn(boolean z) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        zzj();
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
