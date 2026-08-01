package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfub implements Serializable, zzftz {
    private final List zza;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfub) {
            return this.zza.equals(((zzfub) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.zza) {
            if (!z) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzftz) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
