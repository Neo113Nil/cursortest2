package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgtk extends zzgrg {
    private final String zza;
    private final zzgtj zzb;

    private zzgtk(String str, zzgtj zzgtjVar) {
        this.zza = str;
        this.zzb = zzgtjVar;
    }

    public static zzgtk zzb(String str, zzgtj zzgtjVar) {
        return new zzgtk(str, zzgtjVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgtk)) {
            return false;
        }
        zzgtk zzgtkVar = (zzgtk) obj;
        return zzgtkVar.zza.equals(this.zza) && zzgtkVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzgtk.class, this.zza, this.zzb);
    }

    public final String toString() {
        String obj = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + obj.length() + 1);
        sb.append("LegacyKmsAead Parameters (keyUri: ");
        sb.append(str);
        sb.append(", variant: ");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return this.zzb != zzgtj.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzgtj zzd() {
        return this.zzb;
    }
}
