package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgqo implements zzgxr {
    private final List zza;
    private final zzgxy zzb;

    @Nullable
    private final zzgqo zzc;

    private zzgqo(zzhec zzhecVar, List list, zzgxy zzgxyVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzgxyVar;
        if (zzgxb.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzheb zzhebVar : zzhecVar.zzb()) {
                if (hashSet.contains(Integer.valueOf(zzhebVar.zzc()))) {
                    int zzc = zzhebVar.zzc();
                    StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 121);
                    sb.append("KeyID ");
                    sb.append(zzc);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
                hashSet.add(Integer.valueOf(zzhebVar.zzc()));
            }
            if (!hashSet.contains(Integer.valueOf(zzhecVar.zza()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    /* synthetic */ zzgqo(zzhec zzhecVar, List list, zzgxy zzgxyVar, byte[] bArr) {
        this(zzhecVar, list, zzgxyVar);
    }

    private zzgqo(List list, zzgxy zzgxyVar, zzgqo zzgqoVar) {
        this.zza = list;
        this.zzb = zzgxyVar;
        this.zzc = zzgqoVar;
    }

    static final zzgqo zza(zzhec zzhecVar) throws GeneralSecurityException {
        zzn(zzhecVar);
        return new zzgqo(zzhecVar, zzl(zzhecVar), zzgxy.zza);
    }

    public static final zzgqo zzf(zzgqs zzgqsVar) throws GeneralSecurityException {
        zzgqj zzgqjVar = new zzgqj();
        zzgqh zzgqhVar = new zzgqh(zzgqsVar, null);
        zzgqhVar.zzb();
        zzgqhVar.zza();
        zzgqjVar.zza(zzgqhVar);
        return zzgqjVar.zzb();
    }

    static /* synthetic */ zzgqo zzh(final zzgqo zzgqoVar) {
        final zzgxy zzgxyVar = zzgqoVar.zzb;
        if (zzgxyVar.zza()) {
            return zzgqoVar;
        }
        zzgqk zzgqkVar = new zzgqk() { // from class: com.google.android.gms.internal.ads.zzgqn
            @Override // com.google.android.gms.internal.ads.zzgqk
            public final /* synthetic */ void zza(zzgqm zzgqmVar) {
                zzgyj.zza().zzb().zza(zzgqo.this, zzgxyVar, "keyset_handle", "get_key");
            }
        };
        List<zzgqm> list = zzgqoVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzgqm zzgqmVar : list) {
            arrayList.add(new zzgqm(zzgqmVar.zzf(), zzgqmVar.zzj(), zzgqmVar.zzg(), zzgqmVar.zzh(), zzgqmVar.zzi(), zzgqkVar, null));
        }
        return new zzgqo(arrayList, zzgxyVar, zzgqoVar);
    }

    static /* synthetic */ int zzj(zzgqf zzgqfVar) {
        if (zzgqf.zza.equals(zzgqfVar)) {
            return 3;
        }
        if (zzgqf.zzb.equals(zzgqfVar)) {
            return 4;
        }
        if (zzgqf.zzc.equals(zzgqfVar)) {
            return 5;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static List zzl(zzhec zzhecVar) throws GeneralSecurityException {
        zzgqd zzgxvVar;
        boolean z;
        zzgqk zzgqkVar;
        ArrayList arrayList = new ArrayList(zzhecVar.zzc());
        for (zzheb zzhebVar : zzhecVar.zzb()) {
            int zzc = zzhebVar.zzc();
            try {
                zzgzj zzo = zzo(zzhebVar);
                zzgyo zza = zzgyo.zza();
                zzgqt zza2 = zzgqt.zza();
                zzgxvVar = !zza.zzf(zzo) ? new zzgxv(zzo, zza2) : zza.zzg(zzo, zza2);
                z = false;
            } catch (GeneralSecurityException e) {
                if (zzgxb.zza.zza()) {
                    throw e;
                }
                zzgxvVar = new zzgxv(zzo(zzhebVar), zzgqt.zza());
                z = true;
            }
            if (zzgxb.zza.zza() && !zzp(zzhebVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z2 = false;
            int zzk = zzhebVar.zzk();
            if (zzc == zzhecVar.zza()) {
                z2 = true;
            }
            zzgqkVar = zzgqm.zza;
            arrayList.add(new zzgqm(zzgxvVar, zzk, zzc, z2, z, zzgqkVar, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzgqo zzm() {
        zzgqo zzgqoVar = this.zzc;
        return zzgqoVar == null ? this : zzgqoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzhec zzhecVar) throws GeneralSecurityException {
        if (zzhecVar == null || zzhecVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static zzgzj zzo(zzheb zzhebVar) throws GeneralSecurityException {
        return zzgzj.zza(zzhebVar.zzb().zza(), zzhebVar.zzb().zzb(), zzhebVar.zzb().zzc(), zzhebVar.zzd(), zzhebVar.zzd() == zzhep.RAW ? null : Integer.valueOf(zzhebVar.zzc()));
    }

    private static boolean zzp(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzheb zzq(zzgqd zzgqdVar, int i, int i2) throws GeneralSecurityException {
        zzgzj zzgzjVar = (zzgzj) zzgyo.zza().zzh(zzgqdVar, zzgzj.class, zzgqt.zza());
        Integer zze = zzgzjVar.zze();
        if (zze != null && zze.intValue() != i2) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        zzhea zze2 = zzheb.zze();
        zzhdr zzd = zzhdt.zzd();
        zzd.zza(zzgzjVar.zzg());
        zzd.zzb(zzgzjVar.zzb());
        zzd.zzc(zzgzjVar.zzc());
        zze2.zza(zzd);
        zze2.zzd(i);
        zze2.zzb(i2);
        zze2.zzc(zzgzjVar.zzd());
        return (zzheb) zze2.zzbu();
    }

    public final String toString() {
        zzhec zzb = zzb();
        int i = zzgqv.zza;
        zzhed zza = zzheg.zza();
        zza.zza(zzb.zza());
        for (zzheb zzhebVar : zzb.zzb()) {
            zzhee zza2 = zzhef.zza();
            zza2.zza(zzhebVar.zzb().zza());
            zza2.zzd(zzhebVar.zzk());
            zza2.zzc(zzhebVar.zzd());
            zza2.zzb(zzhebVar.zzc());
            zza.zzb((zzhef) zza2.zzbu());
        }
        return ((zzheg) zza.zzbu()).toString();
    }

    final zzhec zzb() {
        try {
            zzhdz zzg = zzhec.zzg();
            for (zzgqm zzgqmVar : this.zza) {
                zzg.zzb(zzq(zzgqmVar.zza(), zzgqmVar.zzj(), zzgqmVar.zzc()));
                if (zzgqmVar.zzd()) {
                    zzg.zza(zzgqmVar.zzc());
                }
            }
            return (zzhec) zzg.zzbu();
        } catch (GeneralSecurityException e) {
            throw new zzgzt(e);
        }
    }

    public final zzgqm zzc() {
        for (zzgqm zzgqmVar : this.zza) {
            if (zzgqmVar != null && zzgqmVar.zzd()) {
                if (zzgqmVar.zzb() == zzgqf.zza) {
                    return zzgqmVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final int zzd() {
        return this.zza.size();
    }

    public final zzgqm zze(int i) {
        if (i < 0 || i >= zzd()) {
            int zzd = zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(zzd).length());
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(" for keyset of size ");
            sb.append(zzd);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.zza;
        zzgqm zzgqmVar = (zzgqm) list.get(i);
        if (!zzp(zzgqmVar.zzj())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!zzgqmVar.zzi()) {
            return (zzgqm) list.get(i);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    public final Object zzg(zzgqb zzgqbVar, Class cls) throws GeneralSecurityException {
        if (!(zzgqbVar instanceof zzgxj)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzgxj zzgxjVar = (zzgxj) zzgqbVar;
        zzhec zzb = zzm().zzb();
        int i = zzgqv.zza;
        int zza = zzb.zza();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (zzheb zzhebVar : zzb.zzb()) {
            if (zzhebVar.zzk() == 3) {
                if (!zzhebVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhebVar.zzc())));
                }
                if (zzhebVar.zzd() == zzhep.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhebVar.zzc())));
                }
                if (zzhebVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhebVar.zzc())));
                }
                if (zzhebVar.zzc() == zza) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z &= zzhebVar.zzb().zzc() == zzhds.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < zzd(); i3++) {
            List list = this.zza;
            if (((zzgqm) list.get(i3)).zzi() || !zzp(((zzgqm) list.get(i3)).zzj())) {
                String zza2 = zzb.zzd(i3).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 44 + String.valueOf(zza2).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(zza2);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgxjVar.zza(zzm(), this.zzb, cls);
    }
}
