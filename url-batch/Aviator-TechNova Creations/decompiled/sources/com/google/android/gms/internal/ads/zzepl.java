package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzepl extends zzcue {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzepl(zzepp zzeppVar, View view, zzcjl zzcjlVar, zzcwd zzcwdVar, zzfis zzfisVar) {
        super(view, null, zzcwdVar, zzfisVar);
        Objects.requireNonNull(zzeppVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcue
    public final zzdcr zze(Set set) {
        return new zzdcr(Collections.emptySet());
    }
}
