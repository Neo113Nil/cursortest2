package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfqz extends zzfqx {
    private static zzfqz zzc;

    private zzfqz(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfqz zzj(Context context) {
        zzfqz zzfqzVar;
        synchronized (zzfqz.class) {
            if (zzc == null) {
                zzc = new zzfqz(context);
            }
            zzfqzVar = zzc;
        }
        return zzfqzVar;
    }

    public final zzfqw zzh(long j, boolean z) throws IOException {
        zzfqw zzb;
        synchronized (zzfqz.class) {
            zzb = zzb(null, null, j, z);
        }
        return zzb;
    }

    public final zzfqw zzi(String str, String str2, long j, boolean z) throws IOException {
        zzfqw zzb;
        synchronized (zzfqz.class) {
            zzb = zzb(str, str2, j, z);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfqz.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfqz.class) {
            zzf(true);
        }
    }
}
