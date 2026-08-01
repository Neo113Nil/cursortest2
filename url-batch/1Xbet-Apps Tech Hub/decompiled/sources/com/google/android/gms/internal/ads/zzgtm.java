package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgtm implements zzgtr {
    private final zzgua zza;

    @Override // com.google.android.gms.internal.ads.zzgtr
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgts.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
