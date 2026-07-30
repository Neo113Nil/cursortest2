package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzahe extends zzaeg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzahe(final zzafh zzafhVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r5, Math.max(6, zzafhVar.zzc));
        long j3;
        Objects.requireNonNull(zzafhVar);
        zzaed zzaedVar = new zzaed() { // from class: com.google.android.gms.internal.ads.zzahc
            @Override // com.google.android.gms.internal.ads.zzaed
            public final /* synthetic */ long zza(long j4) {
                return zzafh.this.zzb(j4);
            }
        };
        zzahd zzahdVar = new zzahd(zzafhVar, i, null);
        long zza = zzafhVar.zza();
        long j4 = zzafhVar.zzj;
        int i2 = zzafhVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzafhVar.zzc) / 2) + 1;
        } else {
            int i3 = zzafhVar.zza;
            int i4 = zzafhVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = 64 + (((j5 * zzafhVar.zzg) * zzafhVar.zzh) / 8);
        }
    }
}
