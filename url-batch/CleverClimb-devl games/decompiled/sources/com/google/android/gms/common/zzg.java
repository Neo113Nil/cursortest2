package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.GoogleCertificates;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* loaded from: classes.dex */
class zzg {
    private static final zzg zzbk = new zzg(true, null, null);
    private final Throwable cause;
    final boolean zzbl;
    private final String zzbm;

    zzg(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.zzbl = z;
        this.zzbm = str;
        this.cause = th;
    }

    static zzg zza(String str, GoogleCertificates.CertData certData, boolean z, boolean z2) {
        return new zzi(str, certData, z, z2);
    }

    static zzg zza(String str, Throwable th) {
        return new zzg(false, str, th);
    }

    static zzg zze(String str) {
        return new zzg(false, str, null);
    }

    static zzg zzg() {
        return zzbk;
    }

    @Nullable
    String getErrorMessage() {
        return this.zzbm;
    }

    final void zzh() throws SecurityException {
        if (this.zzbl) {
            return;
        }
        String valueOf = String.valueOf("GoogleCertificatesRslt: ");
        String valueOf2 = String.valueOf(getErrorMessage());
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        if (this.cause == null) {
            throw new SecurityException(concat);
        }
        throw new SecurityException(concat, this.cause);
    }

    final void zzi() {
        if (this.zzbl) {
            return;
        }
        if (this.cause != null) {
            Log.d("GoogleCertificatesRslt", getErrorMessage(), this.cause);
        } else {
            Log.d("GoogleCertificatesRslt", getErrorMessage());
        }
    }
}
