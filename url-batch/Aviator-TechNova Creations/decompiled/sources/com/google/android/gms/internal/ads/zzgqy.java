package com.google.android.gms.internal.ads;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgqy {
    private final String zza;
    private final zzgqx zzb;
    private zzgqx zzc;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzgqx zzgqxVar = this.zzb.zzb;
        String str = "";
        while (zzgqxVar != null) {
            Object obj = zzgqxVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzgqxVar = zzgqxVar.zzb;
            str = ", ";
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final zzgqy zza(Object obj) {
        zzgqx zzgqxVar = new zzgqx();
        this.zzc.zzb = zzgqxVar;
        this.zzc = zzgqxVar;
        zzgqxVar.zza = obj;
        return this;
    }

    /* synthetic */ zzgqy(String str, byte[] bArr) {
        zzgqx zzgqxVar = new zzgqx();
        this.zzb = zzgqxVar;
        this.zzc = zzgqxVar;
        str.getClass();
        this.zza = str;
    }
}
