package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzgef {
    private final List zza = new ArrayList();
    private final zzgln zzb = zzgln.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzged) it.next()).zza = false;
        }
    }

    public final zzgef zza(zzged zzgedVar) {
        if (zzgedVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgedVar.zza) {
            zzd();
        }
        zzgedVar.zzf = this;
        this.zza.add(zzgedVar);
        return this;
    }

    public final zzgej zzb() throws GeneralSecurityException {
        zzgee zzgeeVar;
        int i;
        int i2;
        zzgee zzgeeVar2;
        zzgee zzgeeVar3;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c = 1;
        this.zzc = true;
        List list = this.zza;
        zzgte zzd = zzgth.zzd();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.zza;
        char c2 = 0;
        int i3 = 0;
        while (i3 < list2.size() - 1) {
            int i4 = i3 + 1;
            zzgee zzgeeVar4 = ((zzged) list2.get(i3)).zze;
            zzgeeVar2 = zzgee.zza;
            if (zzgeeVar4 == zzgeeVar2) {
                zzgee zzgeeVar5 = ((zzged) list2.get(i4)).zze;
                zzgeeVar3 = zzgee.zza;
                if (zzgeeVar5 != zzgeeVar3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i3 = i4;
        }
        HashSet hashSet = new HashSet();
        zzgei zzgeiVar = null;
        Integer num = null;
        for (zzged zzgedVar : this.zza) {
            zzgea unused = zzgedVar.zzb;
            if (zzgedVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzgee zzgeeVar6 = zzgedVar.zze;
            zzgeeVar = zzgee.zza;
            int i5 = 4;
            if (zzgeeVar6 == zzgeeVar) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[i5];
                    int i6 = 0;
                    while (i6 == 0) {
                        secureRandom.nextBytes(bArr);
                        i6 = ((bArr[2] & 255) << 8) | ((bArr[c2] & 255) << 24) | ((bArr[c] & 255) << 16) | (bArr[3] & 255);
                        c2 = 0;
                        i5 = 4;
                    }
                    i = i6;
                }
            } else {
                zzgee unused2 = zzgedVar.zze;
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(valueOf);
            zzged.zza(zzgedVar);
            zzgdy zza = zzgma.zzb().zza(zzgedVar.zzd, c != zzgedVar.zzd.zza() ? null : valueOf);
            zzgeh zzgehVar = new zzgeh(zza, zzgedVar.zzb, i, zzgedVar.zza, null);
            zzgea zzgeaVar = zzgedVar.zzb;
            zzgnl zzgnlVar = (zzgnl) zzgmk.zzc().zzd(zza, zzgnl.class, zzger.zza());
            Integer zzf = zzgnlVar.zzf();
            if (zzf != null && zzf.intValue() != i) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            if (zzgea.zza.equals(zzgeaVar)) {
                i2 = 3;
            } else if (zzgea.zzb.equals(zzgeaVar)) {
                i2 = 4;
            } else {
                if (!zzgea.zzc.equals(zzgeaVar)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i2 = 5;
            }
            zzgtf zzd2 = zzgtg.zzd();
            zzgst zza2 = zzgsv.zza();
            zza2.zzb(zzgnlVar.zzg());
            zza2.zzc(zzgnlVar.zze());
            zza2.zza(zzgnlVar.zzb());
            zzd2.zza(zza2);
            zzd2.zzd(i2);
            zzd2.zzb(i);
            zzd2.zzc(zzgnlVar.zzc());
            zzd.zza((zzgtg) zzd2.zzbr());
            if (zzgedVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgedVar.zzb != zzgea.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(zzgehVar);
            c = 1;
            c2 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzd.zzb(num.intValue());
        zzgth zzgthVar = (zzgth) zzd.zzbr();
        zzgej.zzh(zzgthVar);
        return new zzgej(zzgthVar, arrayList, this.zzb, zzgeiVar);
    }
}
