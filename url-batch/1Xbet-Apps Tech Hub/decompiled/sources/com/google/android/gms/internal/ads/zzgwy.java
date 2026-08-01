package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public class zzgwy extends IOException {
    private zzgxw zza;
    private boolean zzb;

    public zzgwy(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static zzgwx zza() {
        return new zzgwx("Protocol message tag had invalid wire type.");
    }

    static zzgwy zzb() {
        return new zzgwy("Protocol message end-group tag did not match expected tag.");
    }

    static zzgwy zzc() {
        return new zzgwy("Protocol message contained an invalid tag (zero).");
    }

    static zzgwy zzd() {
        return new zzgwy("Protocol message had invalid UTF-8.");
    }

    static zzgwy zze() {
        return new zzgwy("CodedInputStream encountered a malformed varint.");
    }

    static zzgwy zzf() {
        return new zzgwy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzgwy zzg() {
        return new zzgwy("Failed to parse the message.");
    }

    static zzgwy zzi() {
        return new zzgwy("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzgwy zzj() {
        return new zzgwy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzgwy zzh(zzgxw zzgxwVar) {
        this.zza = zzgxwVar;
        return this;
    }

    final void zzk() {
        this.zzb = true;
    }

    final boolean zzl() {
        return this.zzb;
    }

    public zzgwy(String str) {
        super(str);
        this.zza = null;
    }
}
