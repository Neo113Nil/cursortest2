package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgcw {
    private final List zza = new ArrayList();
    private final zzgop zzb = zzgop.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgcu) it.next()).zza = false;
        }
    }

    public final zzgcw zza(zzgcu zzgcuVar) {
        if (zzgcuVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgcuVar.zza) {
            zzd();
        }
        zzgcuVar.zzf = this;
        this.zza.add(zzgcuVar);
        return this;
    }

    public final zzgcz zzb() throws GeneralSecurityException {
        zzgcv zzgcvVar;
        int i;
        zzgcv zzgcvVar2;
        zzgcv zzgcvVar3;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List list = this.zza;
        zzgrw zzd = zzgrz.zzd();
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            zzgcv zzgcvVar4 = ((zzgcu) list.get(i2)).zze;
            zzgcvVar2 = zzgcv.zza;
            if (zzgcvVar4 == zzgcvVar2) {
                zzgcv zzgcvVar5 = ((zzgcu) list.get(i3)).zze;
                zzgcvVar3 = zzgcv.zza;
                if (zzgcvVar5 != zzgcvVar3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzgcu zzgcuVar : this.zza) {
            zzgcr unused = zzgcuVar.zzb;
            if (zzgcuVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzgcv zzgcvVar6 = zzgcuVar.zze;
            zzgcvVar = zzgcv.zza;
            int i4 = 3;
            if (zzgcvVar6 == zzgcvVar) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i5 = 0;
                    while (i5 == 0) {
                        secureRandom.nextBytes(bArr);
                        i5 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i = i5;
                }
            } else {
                zzgcv unused2 = zzgcuVar.zze;
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(valueOf);
            zzgcu.zza(zzgcuVar);
            zzgdd zzgddVar = zzgcuVar.zzd;
            zzgcr zzc = zzgcuVar.zzc();
            if (!zzgcr.zza.equals(zzc)) {
                if (zzgcr.zzb.equals(zzc)) {
                    i4 = 4;
                } else {
                    if (!zzgcr.zzc.equals(zzc)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            zzglp zzglpVar = (zzglp) (zzgddVar instanceof zzgkh ? ((zzgkh) zzgddVar).zzb() : zzgku.zzc().zzd(zzgddVar, zzglp.class));
            zzgrm zza = zzgdo.zza(zzglpVar.zzc());
            zzgrx zzd2 = zzgry.zzd();
            zzd2.zzb(i);
            zzd2.zzd(i4);
            zzd2.zza(zza);
            zzd2.zzc(zzglpVar.zzc().zzf());
            zzd.zza((zzgry) zzd2.zzal());
            if (zzgcuVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgcuVar.zzb != zzgcr.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzd.zzb(num.intValue());
        return zzgcz.zzb((zzgrz) zzd.zzal(), this.zzb);
    }
}
