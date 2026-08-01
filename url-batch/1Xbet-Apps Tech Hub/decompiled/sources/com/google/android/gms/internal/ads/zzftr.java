package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzftr {
    private final String zza;
    private final zzftp zzb;
    private zzftp zzc;

    /* synthetic */ zzftr(String str, zzftq zzftqVar) {
        zzftp zzftpVar = new zzftp();
        this.zzb = zzftpVar;
        this.zzc = zzftpVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        zzftp zzftpVar = this.zzb.zzb;
        String str = "";
        while (zzftpVar != null) {
            Object obj = zzftpVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzftpVar = zzftpVar.zzb;
            str = ", ";
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final zzftr zza(@CheckForNull Object obj) {
        zzftp zzftpVar = new zzftp();
        this.zzc.zzb = zzftpVar;
        this.zzc = zzftpVar;
        zzftpVar.zza = obj;
        return this;
    }
}
