package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzggv extends zzggq implements Serializable {
    private final Pattern zza;

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzggq
    public final zzggp zza(CharSequence charSequence) {
        return new zzggu(this.zza.matcher(charSequence));
    }

    zzggv(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
