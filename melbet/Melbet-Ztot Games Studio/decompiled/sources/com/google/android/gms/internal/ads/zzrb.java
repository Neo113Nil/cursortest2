package com.google.android.gms.internal.ads;

import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzrb extends IOException {
    public final int zza;

    public zzrb(Throwable th, int i) {
        super(th);
        this.zza = GamesStatusCodes.STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER;
    }
}
