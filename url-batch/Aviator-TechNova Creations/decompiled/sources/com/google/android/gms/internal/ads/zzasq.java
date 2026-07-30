package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzasq implements zzast {
    final /* synthetic */ File zza;

    zzasq(zzasu zzasuVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzasuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final File zza() {
        return this.zza;
    }
}
