package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhbc {
    static final zzhqf zza(zzhbp zzhbpVar) {
        try {
            return ((zzhlc) zzhkg.zza().zzk(null, zzhlc.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzhlm("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(AbstractJsonLexerKt.NULL), e);
        }
    }

    public static final zzhbp zzb(zzhbp zzhbpVar) throws GeneralSecurityException {
        return zzhbpVar != null ? zzhbpVar : zzhbv.zzb(zza(null).zzaN());
    }
}
