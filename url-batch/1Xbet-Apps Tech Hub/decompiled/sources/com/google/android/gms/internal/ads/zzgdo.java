package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgdo {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzgdo.class.getName());
    private static final AtomicReference zzc = new AtomicReference(new zzgju());
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final Set zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(zzgcf.class);
        hashSet.add(zzgcl.class);
        hashSet.add(zzgdq.class);
        hashSet.add(zzgcn.class);
        hashSet.add(zzgcm.class);
        hashSet.add(zzgdc.class);
        hashSet.add(zzgox.class);
        hashSet.add(zzgdm.class);
        hashSet.add(zzgdn.class);
        zze = Collections.unmodifiableSet(hashSet);
    }

    private zzgdo() {
    }

    public static synchronized zzgrm zza(zzgrr zzgrrVar) throws GeneralSecurityException {
        zzgrm zza2;
        synchronized (zzgdo.class) {
            AtomicReference atomicReference = zzc;
            zzgcq zzb2 = ((zzgju) atomicReference.get()).zzb(zzgrrVar.zzh());
            if (!((zzgju) atomicReference.get()).zzd(zzgrrVar.zzh())) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgrrVar.zzh())));
            }
            zza2 = zzb2.zza(zzgrrVar.zzg());
        }
        return zza2;
    }

    @Nullable
    public static Class zzb(Class cls) {
        try {
            return zzgkr.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzc(zzgrm zzgrmVar, Class cls) throws GeneralSecurityException {
        return zzd(zzgrmVar.zzg(), zzgrmVar.zzf(), cls);
    }

    public static Object zzd(String str, zzgve zzgveVar, Class cls) throws GeneralSecurityException {
        return ((zzgju) zzc.get()).zza(str, cls).zzb(zzgveVar);
    }

    public static synchronized void zze(zzgke zzgkeVar, boolean z) throws GeneralSecurityException {
        synchronized (zzgdo.class) {
            AtomicReference atomicReference = zzc;
            zzgju zzgjuVar = new zzgju((zzgju) atomicReference.get());
            zzgjuVar.zzc(zzgkeVar, true);
            atomicReference.set(zzgjuVar);
        }
    }

    public static synchronized void zzf(zzgdl zzgdlVar) throws GeneralSecurityException {
        synchronized (zzgdo.class) {
            zzgkr.zza().zzf(zzgdlVar);
        }
    }
}
