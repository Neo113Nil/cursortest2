package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgtf extends zzgti {
    final /* synthetic */ zzgtm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtf(zzgtm zzgtmVar) {
        super(zzgtmVar, null);
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    final /* bridge */ /* synthetic */ Object zza(int i) {
        return new zzgtk(this.zza, i);
    }
}
