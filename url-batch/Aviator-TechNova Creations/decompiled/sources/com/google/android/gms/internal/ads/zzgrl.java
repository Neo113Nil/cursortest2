package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgrl implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgrr zzb;

    zzgrl(zzgrr zzgrrVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgrrVar);
        this.zzb = zzgrrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        zzgqw.zzb(sb, this, ", ");
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
