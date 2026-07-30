package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhbf {
    private final List zza = new ArrayList();
    private final zzhjr zzb = zzhjr.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhbd) it.next()).zzd(false);
        }
    }

    public final zzhbf zza(zzhbd zzhbdVar) {
        if (zzhbdVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhbdVar.zzc()) {
            zzc();
        }
        zzhbdVar.zzi(this);
        this.zza.add(zzhbdVar);
        return this;
    }

    public final zzhbk zzb() throws GeneralSecurityException {
        zzhbe zzhbeVar;
        int i;
        zzhbg zzhbgVar;
        zzhbe zzhbeVar2;
        zzhbe zzhbeVar3;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzhbd> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            zzhbe zzg = ((zzhbd) list.get(i2)).zzg();
            zzhbeVar2 = zzhbe.zza;
            if (zzg == zzhbeVar2) {
                zzhbe zzg2 = ((zzhbd) list.get(i3)).zzg();
                zzhbeVar3 = zzhbe.zza;
                if (zzg2 != zzhbeVar3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhbd zzhbdVar : list) {
            zzhbdVar.zze();
            if (zzhbdVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzhbe zzg3 = zzhbdVar.zzg();
            zzhbeVar = zzhbe.zza;
            int i4 = 3;
            if (zzg3 == zzhbeVar) {
                int i5 = 0;
                while (true) {
                    if (i5 != 0 && !hashSet.contains(Integer.valueOf(i5))) {
                        break;
                    }
                    int i6 = zzhln.zza;
                    i5 = 0;
                    while (i5 == 0) {
                        byte[] zza = zzhle.zza(4);
                        i5 = (zza[3] & 255) | ((zza[0] & 255) << 24) | ((zza[1] & 255) << 16) | ((zza[2] & 255) << 8);
                    }
                }
                i = i5;
            } else {
                zzhbdVar.zzg();
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                int i7 = i;
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 31);
                sb.append("Id ");
                sb.append(i7);
                sb.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb.toString());
            }
            hashSet.add(valueOf);
            zzhaz zzc = zzhjx.zza().zzc(zzhbdVar.zzf(), true != zzhbdVar.zzf().zza() ? null : valueOf);
            zzhbb zze = zzhbdVar.zze();
            zzhbb zzhbbVar = zzhbb.zza;
            if (!zzhbbVar.equals(zze)) {
                if (zzhbb.zzb.equals(zze)) {
                    i4 = 4;
                } else {
                    if (!zzhbb.zzc.equals(zze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            boolean zzc2 = zzhbdVar.zzc();
            zzhbgVar = zzhbi.zza;
            zzhbi zzhbiVar = new zzhbi(zzc, i4, i, zzc2, false, zzhbgVar, null);
            if (zzhbdVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhbdVar.zze() != zzhbbVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(zzhbiVar);
        }
        if (num != null) {
            return zzhbk.zzh(new zzhbk(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
