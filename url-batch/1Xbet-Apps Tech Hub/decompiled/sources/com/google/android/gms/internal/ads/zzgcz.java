package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgcz {
    private final zzgrz zza;
    private final List zzb;
    private final zzgop zzc;

    private zzgcz(zzgrz zzgrzVar, List list) {
        this.zza = zzgrzVar;
        this.zzb = list;
        this.zzc = zzgop.zza;
    }

    private zzgcz(zzgrz zzgrzVar, List list, zzgop zzgopVar) {
        this.zza = zzgrzVar;
        this.zzb = list;
        this.zzc = zzgopVar;
    }

    static final zzgcz zza(zzgrz zzgrzVar) throws GeneralSecurityException {
        zzi(zzgrzVar);
        return new zzgcz(zzgrzVar, zzh(zzgrzVar));
    }

    static final zzgcz zzb(zzgrz zzgrzVar, zzgop zzgopVar) throws GeneralSecurityException {
        zzi(zzgrzVar);
        return new zzgcz(zzgrzVar, zzh(zzgrzVar), zzgopVar);
    }

    public static final zzgcz zzc(zzgdd zzgddVar) throws GeneralSecurityException {
        zzgcw zzgcwVar = new zzgcw();
        zzgcu zzgcuVar = new zzgcu(zzgddVar, null);
        zzgcuVar.zze();
        zzgcuVar.zzd();
        zzgcwVar.zza(zzgcuVar);
        return zzgcwVar.zzb();
    }

    private static zzglo zzf(zzgry zzgryVar) {
        try {
            return zzglo.zza(zzgryVar.zzc().zzg(), zzgryVar.zzc().zzf(), zzgryVar.zzc().zzc(), zzgryVar.zzf(), zzgryVar.zzf() == zzgss.RAW ? null : Integer.valueOf(zzgryVar.zza()));
        } catch (GeneralSecurityException e) {
            throw new zzgmc("Creating a protokey serialization failed", e);
        }
    }

    @Nullable
    private static Object zzg(zzgjr zzgjrVar, zzgry zzgryVar, Class cls) throws GeneralSecurityException {
        try {
            return zzgdo.zzc(zzgryVar.zzc(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    private static List zzh(zzgrz zzgrzVar) {
        zzgcr zzgcrVar;
        ArrayList arrayList = new ArrayList(zzgrzVar.zza());
        for (zzgry zzgryVar : zzgrzVar.zzh()) {
            int zza = zzgryVar.zza();
            try {
                zzgcp zza2 = zzgku.zzc().zza(zzf(zzgryVar), zzgdp.zza());
                int zzk = zzgryVar.zzk() - 2;
                if (zzk == 1) {
                    zzgcrVar = zzgcr.zza;
                } else if (zzk == 2) {
                    zzgcrVar = zzgcr.zzb;
                } else {
                    if (zzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzgcrVar = zzgcr.zzc;
                }
                arrayList.add(new zzgcy(zza2, zzgcrVar, zza, zza == zzgrzVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzi(zzgrz zzgrzVar) throws GeneralSecurityException {
        if (zzgrzVar == null || zzgrzVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    @Nullable
    private static final Object zzj(zzgjr zzgjrVar, zzgcp zzgcpVar, Class cls) throws GeneralSecurityException {
        try {
            return zzgkr.zza().zzc(zzgcpVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        Charset charset = zzgds.zza;
        zzgrz zzgrzVar = this.zza;
        zzgsb zza = zzgse.zza();
        zza.zzb(zzgrzVar.zzc());
        for (zzgry zzgryVar : zzgrzVar.zzh()) {
            zzgsc zza2 = zzgsd.zza();
            zza2.zzc(zzgryVar.zzc().zzg());
            zza2.zzd(zzgryVar.zzk());
            zza2.zzb(zzgryVar.zzf());
            zza2.zza(zzgryVar.zza());
            zza.zza((zzgsd) zza2.zzal());
        }
        return ((zzgse) zza.zzal()).toString();
    }

    final zzgrz zzd() {
        return this.zza;
    }

    public final Object zze(zzgcj zzgcjVar, Class cls) throws GeneralSecurityException {
        Class zzb = zzgdo.zzb(cls);
        if (zzb == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
        }
        zzgrz zzgrzVar = this.zza;
        Charset charset = zzgds.zza;
        int zzc = zzgrzVar.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgry zzgryVar : zzgrzVar.zzh()) {
            if (zzgryVar.zzk() == 3) {
                if (!zzgryVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgryVar.zza())));
                }
                if (zzgryVar.zzf() == zzgss.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgryVar.zza())));
                }
                if (zzgryVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgryVar.zza())));
                }
                if (zzgryVar.zza() == zzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgryVar.zzc().zzc() == zzgrl.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgdf zzgdfVar = new zzgdf(zzb, null);
        zzgdfVar.zzc(this.zzc);
        for (int i2 = 0; i2 < this.zza.zza(); i2++) {
            zzgry zze = this.zza.zze(i2);
            if (zze.zzk() == 3) {
                zzgjr zzgjrVar = (zzgjr) zzgcjVar;
                Object zzg = zzg(zzgjrVar, zze, zzb);
                Object zzj = this.zzb.get(i2) != null ? zzj(zzgjrVar, ((zzgcy) this.zzb.get(i2)).zza(), zzb) : null;
                if (zzj == null && zzg == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + zzb.toString() + " for key of type " + zze.zzc().zzg());
                }
                if (zze.zza() == this.zza.zzc()) {
                    zzgdfVar.zzb(zzj, zzg, zze);
                } else {
                    zzgdfVar.zza(zzj, zzg, zze);
                }
            }
        }
        return zzgkr.zza().zzd(zzgdfVar.zzd(), cls);
    }
}
