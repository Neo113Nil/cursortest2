package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzayx implements zzfwx {
    final /* synthetic */ zzfvc zza;

    zzayx(zzayz zzayzVar, zzfvc zzfvcVar) {
        this.zza = zzfvcVar;
        Objects.requireNonNull(zzayzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
