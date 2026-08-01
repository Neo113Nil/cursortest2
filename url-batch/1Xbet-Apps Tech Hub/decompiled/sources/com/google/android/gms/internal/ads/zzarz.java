package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzarz implements zzfpo {
    final /* synthetic */ zzfno zza;

    zzarz(zzasb zzasbVar, zzfno zzfnoVar) {
        this.zza = zzfnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpo
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
