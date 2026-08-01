package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgju {
    private static final Logger zza = Logger.getLogger(zzgju.class.getName());
    private final ConcurrentMap zzb;
    private final ConcurrentMap zzc;

    public zzgju() {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ConcurrentHashMap();
    }

    private final synchronized zzgjt zze(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgjt) this.zzb.get(str);
    }

    private final synchronized void zzf(zzgjt zzgjtVar, boolean z, boolean z2) throws GeneralSecurityException {
        String zzc = zzgjtVar.zza().zzc();
        if (this.zzc.containsKey(zzc) && !((Boolean) this.zzc.get(zzc)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(zzc));
        }
        zzgjt zzgjtVar2 = (zzgjt) this.zzb.get(zzc);
        if (zzgjtVar2 != null && !zzgjtVar2.zza.getClass().equals(zzgjtVar.zza.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzc));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzc, zzgjtVar2.zza.getClass().getName(), zzgjtVar.zza.getClass().getName()));
        }
        this.zzb.putIfAbsent(zzc, zzgjtVar);
        this.zzc.put(zzc, true);
    }

    public final zzgcq zza(String str, Class cls) throws GeneralSecurityException {
        zzgjt zze = zze(str);
        if (zze.zza.zzl().contains(cls)) {
            try {
                return new zzgjs(zze.zza, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }
        String name = cls.getName();
        zzgke zzgkeVar = zze.zza;
        String valueOf = String.valueOf(zzgkeVar.getClass());
        Set<Class> zzl = zzgkeVar.zzl();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zzl) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb.toString());
    }

    public final zzgcq zzb(String str) throws GeneralSecurityException {
        return zze(str).zza();
    }

    public final synchronized void zzc(zzgke zzgkeVar, boolean z) throws GeneralSecurityException {
        if (!zzgjl.zza(zzgkeVar.zzg())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgkeVar.getClass()) + " as it is not FIPS compatible.");
        }
        zzf(new zzgjt(zzgkeVar), false, true);
    }

    public final boolean zzd(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public zzgju(zzgju zzgjuVar) {
        this.zzb = new ConcurrentHashMap(zzgjuVar.zzb);
        this.zzc = new ConcurrentHashMap(zzgjuVar.zzc);
    }
}
