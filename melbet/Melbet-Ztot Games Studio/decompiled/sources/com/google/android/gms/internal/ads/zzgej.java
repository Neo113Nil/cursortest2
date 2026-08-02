package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzgej {
    private final zzgth zza;
    private final List zzb;
    private final zzgln zzc;

    private zzgej(zzgth zzgthVar, List list) {
        this.zza = zzgthVar;
        this.zzb = list;
        this.zzc = zzgln.zza;
    }

    /* synthetic */ zzgej(zzgth zzgthVar, List list, zzgln zzglnVar, zzgei zzgeiVar) {
        this.zza = zzgthVar;
        this.zzb = list;
        this.zzc = zzglnVar;
    }

    static final zzgej zza(zzgth zzgthVar) throws GeneralSecurityException {
        zzh(zzgthVar);
        return new zzgej(zzgthVar, zzg(zzgthVar));
    }

    public static final zzgej zzb(zzgen zzgenVar) throws GeneralSecurityException {
        zzgef zzgefVar = new zzgef();
        zzged zzgedVar = new zzged(zzgenVar, null);
        zzgedVar.zzd();
        zzgedVar.zzc();
        zzgefVar.zza(zzgedVar);
        return zzgefVar.zzb();
    }

    private final Object zzf(zzgkx zzgkxVar, Class cls, Class cls2) throws GeneralSecurityException {
        int i = zzgeu.zza;
        zzgth zzgthVar = this.zza;
        int zzc = zzgthVar.zzc();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgtg zzgtgVar : zzgthVar.zzh()) {
            if (zzgtgVar.zzk() == 3) {
                if (!zzgtgVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgtgVar.zza())));
                }
                if (zzgtgVar.zzf() == zzgtz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgtgVar.zza())));
                }
                if (zzgtgVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgtgVar.zza())));
                }
                if (zzgtgVar.zza() == zzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgtgVar.zzc().zzc() == zzgsu.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgnf zzb = zzgnj.zzb(cls2);
        zzb.zzc(this.zzc);
        for (int i3 = 0; i3 < this.zzb.size(); i3++) {
            zzgtg zze = this.zza.zze(i3);
            if (zze.zzk() == 3) {
                zzgeh zzgehVar = (zzgeh) this.zzb.get(i3);
                if (zzgehVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + zze.zzc().zzg() + " failed, unable to get primitive");
                }
                zzgdy zza = zzgehVar.zza();
                try {
                    Object zzc2 = zzgmh.zza().zzc(zza, cls2);
                    if (zze.zza() == this.zza.zzc()) {
                        zzb.zzb(zzc2, zza, zze);
                    } else {
                        zzb.zza(zzc2, zza, zze);
                    }
                } catch (GeneralSecurityException e) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2.toString() + " for key of type " + zze.zzc().zzg() + ", see https://developers.google.com/tink/faq/registration_errors", e);
                }
            }
        }
        zzgnj zzd = zzb.zzd();
        int i4 = zzgeq.zza;
        return zzgmh.zza().zzd(zzd, cls);
    }

    private static List zzg(zzgth zzgthVar) {
        zzgea zzgeaVar;
        ArrayList arrayList = new ArrayList(zzgthVar.zza());
        for (zzgtg zzgtgVar : zzgthVar.zzh()) {
            int zza = zzgtgVar.zza();
            try {
                zzgnl zza2 = zzgnl.zza(zzgtgVar.zzc().zzg(), zzgtgVar.zzc().zzf(), zzgtgVar.zzc().zzc(), zzgtgVar.zzf(), zzgtgVar.zzf() == zzgtz.RAW ? null : Integer.valueOf(zzgtgVar.zza()));
                zzgmk zzc = zzgmk.zzc();
                zzger zza3 = zzger.zza();
                zzgdy zzgljVar = !zzc.zzj(zza2) ? new zzglj(zza2, zza3) : zzc.zza(zza2, zza3);
                int zzk = zzgtgVar.zzk() - 2;
                if (zzk == 1) {
                    zzgeaVar = zzgea.zza;
                } else if (zzk == 2) {
                    zzgeaVar = zzgea.zzb;
                } else {
                    if (zzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzgeaVar = zzgea.zzc;
                }
                arrayList.add(new zzgeh(zzgljVar, zzgeaVar, zza, zza == zzgthVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(zzgth zzgthVar) throws GeneralSecurityException {
        if (zzgthVar == null || zzgthVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i = zzgeu.zza;
        zzgtj zza = zzgtm.zza();
        zzgth zzgthVar = this.zza;
        zza.zzb(zzgthVar.zzc());
        for (zzgtg zzgtgVar : zzgthVar.zzh()) {
            zzgtk zza2 = zzgtl.zza();
            zza2.zzc(zzgtgVar.zzc().zzg());
            zza2.zzd(zzgtgVar.zzk());
            zza2.zzb(zzgtgVar.zzf());
            zza2.zza(zzgtgVar.zza());
            zza.zza((zzgtl) zza2.zzbr());
        }
        return ((zzgtm) zza.zzbr()).toString();
    }

    final zzgth zzc() {
        return this.zza;
    }

    public final Object zzd(zzgds zzgdsVar, Class cls) throws GeneralSecurityException {
        Class zza = zzgeq.zza(cls);
        if (zza != null) {
            return zzf((zzgkx) zzgdsVar, cls, zza);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }
}
