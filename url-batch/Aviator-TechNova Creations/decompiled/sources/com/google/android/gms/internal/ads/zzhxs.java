package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhxs extends ThreadLocal {
    final /* synthetic */ zzhxt zza;

    zzhxs(zzhxt zzhxtVar) {
        Objects.requireNonNull(zzhxtVar);
        this.zza = zzhxtVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzhxe zzhxeVar = zzhxe.zzb;
            zzhxt zzhxtVar = this.zza;
            Mac mac = (Mac) zzhxeVar.zzb(zzhxtVar.zzb());
            mac.init(zzhxtVar.zzc());
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
