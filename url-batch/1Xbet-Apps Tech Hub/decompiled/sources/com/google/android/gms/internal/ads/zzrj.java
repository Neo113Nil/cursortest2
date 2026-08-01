package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzrj extends IOException {
    public final int zza;

    public zzrj(Throwable th, int i) {
        super(th);
        this.zza = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
    }
}
