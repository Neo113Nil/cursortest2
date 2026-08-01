package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfui implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzful zzb;

    zzfui(zzful zzfulVar, CharSequence charSequence) {
        this.zzb = zzfulVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        zzfto.zzb(sb, this, ", ");
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
