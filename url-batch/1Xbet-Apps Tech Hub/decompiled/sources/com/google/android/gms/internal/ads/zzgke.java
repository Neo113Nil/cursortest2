package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzgke {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgke(Class cls, zzglh... zzglhVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzglh zzglhVar = zzglhVarArr[i];
            if (hashMap.containsKey(zzglhVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzglhVar.zzb().getCanonicalName())));
            }
            hashMap.put(zzglhVar.zzb(), zzglhVar);
        }
        this.zzc = zzglhVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgkd zza() {
        throw null;
    }

    public abstract zzgrl zzb();

    public abstract zzgxw zzc(zzgve zzgveVar) throws zzgwy;

    public abstract String zzd();

    public abstract void zzf(zzgxw zzgxwVar) throws GeneralSecurityException;

    public abstract int zzg();

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgxw zzgxwVar, Class cls) throws GeneralSecurityException {
        zzglh zzglhVar = (zzglh) this.zzb.get(cls);
        if (zzglhVar != null) {
            return zzglhVar.zza(zzgxwVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
