package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzfvc extends zzfvf {
    zzfvc(zzfvd zzfvdVar, zzfvh zzfvhVar, CharSequence charSequence) {
        super(zzfvhVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int i2 = i + GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND;
        if (i2 < charSequence.length()) {
            return i2;
        }
        return -1;
    }
}
