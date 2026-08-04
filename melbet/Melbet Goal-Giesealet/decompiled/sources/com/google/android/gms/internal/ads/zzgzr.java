package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgzr {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzgzr(zzgzo zzgzoVar, byte[] bArr) {
        this.zza = new HashMap(zzgzoVar.zze());
        this.zzb = new HashMap(zzgzoVar.zzf());
        this.zzc = new HashMap(zzgzoVar.zzg());
        this.zzd = new HashMap(zzgzoVar.zzh());
    }

    public final boolean zza(zzgzn zzgznVar) {
        return this.zzb.containsKey(new zzgzp(zzgznVar.getClass(), zzgznVar.zzf(), null));
    }

    public final zzgqd zzb(zzgzn zzgznVar, @Nullable zzgqt zzgqtVar) throws GeneralSecurityException {
        zzgzp zzgzpVar = new zzgzp(zzgznVar.getClass(), zzgznVar.zzf(), null);
        Map map = this.zzb;
        if (map.containsKey(zzgzpVar)) {
            return ((zzgxn) map.get(zzgzpVar)).zza(zzgznVar, zzgqtVar);
        }
        String obj = zzgzpVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 47);
        sb.append("No Key Parser for requested key type ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzgzn zzc(zzgqd zzgqdVar, Class cls, @Nullable zzgqt zzgqtVar) throws GeneralSecurityException {
        zzgzq zzgzqVar = new zzgzq(zzgqdVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzgzqVar)) {
            return ((zzgxq) map.get(zzgzqVar)).zza(zzgqdVar, zzgqtVar);
        }
        String obj = zzgzqVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 32);
        sb.append("No Key serializer for ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final boolean zzd(zzgzn zzgznVar) {
        return this.zzd.containsKey(new zzgzp(zzgznVar.getClass(), zzgznVar.zzf(), null));
    }

    public final zzgqs zze(zzgzn zzgznVar) throws GeneralSecurityException {
        zzgzp zzgzpVar = new zzgzp(zzgznVar.getClass(), zzgznVar.zzf(), null);
        Map map = this.zzd;
        if (map.containsKey(zzgzpVar)) {
            return ((zzgys) map.get(zzgzpVar)).zza(zzgznVar);
        }
        String obj = zzgzpVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 54);
        sb.append("No Parameters Parser for requested key type ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzgzn zzf(zzgqs zzgqsVar, Class cls) throws GeneralSecurityException {
        zzgzq zzgzqVar = new zzgzq(zzgqsVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzgzqVar)) {
            return ((zzgyv) map.get(zzgzqVar)).zza(zzgqsVar);
        }
        String obj = zzgzqVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 39);
        sb.append("No Key Format serializer for ");
        sb.append(obj);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    final /* synthetic */ Map zzg() {
        return this.zza;
    }

    final /* synthetic */ Map zzh() {
        return this.zzb;
    }

    final /* synthetic */ Map zzi() {
        return this.zzc;
    }

    final /* synthetic */ Map zzj() {
        return this.zzd;
    }
}
