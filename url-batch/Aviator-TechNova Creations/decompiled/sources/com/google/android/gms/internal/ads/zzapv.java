package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzapv implements zzapn {
    final /* synthetic */ zzapx zza;
    private final zzeq zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzapv(zzapx zzapxVar, int i) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        zzapx zzapxVar;
        int i;
        zzeq zzeqVar;
        int i2;
        int i3;
        if (zzerVar.zzs() != 2) {
            return;
        }
        zzapx zzapxVar2 = this.zza;
        zzfg zzfgVar = (zzfg) zzapxVar2.zzh().get(0);
        if ((zzerVar.zzs() & 128) != 0) {
            zzerVar.zzk(1);
            int zzt = zzerVar.zzt();
            int i4 = 3;
            zzerVar.zzk(3);
            zzeq zzeqVar2 = this.zzb;
            zzerVar.zzl(zzeqVar2, 2);
            zzeqVar2.zzh(3);
            int i5 = 13;
            zzapxVar2.zzq(zzeqVar2.zzj(13));
            zzerVar.zzl(zzeqVar2, 2);
            int i6 = 4;
            zzeqVar2.zzh(4);
            int i7 = 12;
            zzerVar.zzk(zzeqVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int zzd = zzerVar.zzd();
            while (zzd > 0) {
                int i8 = 5;
                zzerVar.zzl(zzeqVar2, 5);
                int zzj = zzeqVar2.zzj(8);
                zzeqVar2.zzh(i4);
                int zzj2 = zzeqVar2.zzj(i5);
                zzeqVar2.zzh(i6);
                int zzj3 = zzeqVar2.zzj(i7);
                int zzg = zzerVar.zzg();
                int i9 = zzg + zzj3;
                String str = null;
                ArrayList arrayList = null;
                int i10 = -1;
                int i11 = 0;
                while (zzerVar.zzg() < i9) {
                    int zzs = zzerVar.zzs();
                    int zzg2 = zzerVar.zzg() + zzerVar.zzs();
                    if (zzg2 > i9) {
                        break;
                    }
                    if (zzs == i8) {
                        long zzz = zzerVar.zzz();
                        if (zzz != 1094921523) {
                            if (zzz != 1161904947) {
                                if (zzz != 1094921524) {
                                    if (zzz == 1212503619) {
                                        i3 = 36;
                                        zzapxVar = zzapxVar2;
                                        i10 = i3;
                                        i = zzg2;
                                        zzeqVar = zzeqVar2;
                                        i2 = zzd;
                                    }
                                    zzapxVar = zzapxVar2;
                                    i = zzg2;
                                    zzeqVar = zzeqVar2;
                                    i2 = zzd;
                                }
                                zzapxVar = zzapxVar2;
                                i = zzg2;
                                zzeqVar = zzeqVar2;
                                i2 = zzd;
                                i10 = 172;
                            }
                            zzapxVar = zzapxVar2;
                            zzeqVar = zzeqVar2;
                            i2 = zzd;
                            i10 = 135;
                            i = zzg2;
                            zzerVar.zzk(i - zzerVar.zzg());
                            zzd = i2;
                            zzeqVar2 = zzeqVar;
                            zzapxVar2 = zzapxVar;
                            i8 = 5;
                        }
                        zzapxVar = zzapxVar2;
                        i = zzg2;
                        zzeqVar = zzeqVar2;
                        i2 = zzd;
                        i10 = 129;
                    } else {
                        if (zzs != 106) {
                            if (zzs != 122) {
                                if (zzs == 127) {
                                    int zzs2 = zzerVar.zzs();
                                    if (zzs2 != 21) {
                                        if (zzs2 == 14) {
                                            i3 = Opcodes.L2I;
                                        } else {
                                            if (zzs2 == 33) {
                                                i3 = Opcodes.F2I;
                                            }
                                            zzapxVar = zzapxVar2;
                                            i = zzg2;
                                            zzeqVar = zzeqVar2;
                                            i2 = zzd;
                                        }
                                    }
                                    zzapxVar = zzapxVar2;
                                    i = zzg2;
                                    zzeqVar = zzeqVar2;
                                    i2 = zzd;
                                    i10 = 172;
                                } else if (zzs == 123) {
                                    i3 = Opcodes.L2D;
                                } else if (zzs == 10) {
                                    String trim = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    i11 = zzerVar.zzs();
                                    zzapxVar = zzapxVar2;
                                    str = trim;
                                    i = zzg2;
                                    zzeqVar = zzeqVar2;
                                    i2 = zzd;
                                } else {
                                    if (zzs == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzerVar.zzg() < zzg2) {
                                            int i12 = zzg2;
                                            String trim2 = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                            int zzs3 = zzerVar.zzs();
                                            int i13 = zzd;
                                            byte[] bArr = new byte[4];
                                            zzerVar.zzm(bArr, 0, 4);
                                            arrayList2.add(new zzapy(trim2, zzs3, bArr));
                                            zzd = i13;
                                            zzg2 = i12;
                                            zzeqVar2 = zzeqVar2;
                                            zzapxVar2 = zzapxVar2;
                                        }
                                        zzapxVar = zzapxVar2;
                                        i = zzg2;
                                        zzeqVar = zzeqVar2;
                                        i2 = zzd;
                                        arrayList = arrayList2;
                                        i10 = 89;
                                    } else {
                                        zzapxVar = zzapxVar2;
                                        i = zzg2;
                                        zzeqVar = zzeqVar2;
                                        i2 = zzd;
                                        if (zzs == 111) {
                                            i10 = 257;
                                        }
                                    }
                                    zzerVar.zzk(i - zzerVar.zzg());
                                    zzd = i2;
                                    zzeqVar2 = zzeqVar;
                                    zzapxVar2 = zzapxVar;
                                    i8 = 5;
                                }
                                zzapxVar = zzapxVar2;
                                i10 = i3;
                                i = zzg2;
                                zzeqVar = zzeqVar2;
                                i2 = zzd;
                            }
                            zzapxVar = zzapxVar2;
                            zzeqVar = zzeqVar2;
                            i2 = zzd;
                            i10 = 135;
                            i = zzg2;
                            zzerVar.zzk(i - zzerVar.zzg());
                            zzd = i2;
                            zzeqVar2 = zzeqVar;
                            zzapxVar2 = zzapxVar;
                            i8 = 5;
                        }
                        zzapxVar = zzapxVar2;
                        i = zzg2;
                        zzeqVar = zzeqVar2;
                        i2 = zzd;
                        i10 = 129;
                    }
                    zzerVar.zzk(i - zzerVar.zzg());
                    zzd = i2;
                    zzeqVar2 = zzeqVar;
                    zzapxVar2 = zzapxVar;
                    i8 = 5;
                }
                zzapx zzapxVar3 = zzapxVar2;
                zzeq zzeqVar3 = zzeqVar2;
                int i14 = zzd;
                zzerVar.zzh(i9);
                zzapz zzapzVar = new zzapz(i10, str, i11, arrayList, Arrays.copyOfRange(zzerVar.zzi(), zzg, i9));
                if (zzj == 6 || zzj == 5) {
                    zzj = zzapzVar.zza;
                }
                zzd = i14 - (zzj3 + 5);
                if (!zzapxVar3.zzk().get(zzj2)) {
                    zzaqc zzb = zzapxVar3.zzi().zzb(zzj, zzapzVar);
                    sparseIntArray.put(zzj2, zzj2);
                    sparseArray.put(zzj2, zzb);
                }
                i6 = 4;
                zzeqVar2 = zzeqVar3;
                zzapxVar2 = zzapxVar3;
                i4 = 3;
                i5 = 13;
                i7 = 12;
            }
            zzapx zzapxVar4 = zzapxVar2;
            int size = sparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                int keyAt = sparseIntArray.keyAt(i15);
                int valueAt = sparseIntArray.valueAt(i15);
                zzapxVar4.zzk().put(keyAt, true);
                zzapxVar4.zzl().put(valueAt, true);
                zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i15);
                if (zzaqcVar != null) {
                    zzaqcVar.zza(zzfgVar, zzapxVar4.zzm(), new zzaqb(zzt, keyAt, 8192));
                    zzapxVar4.zzj().put(valueAt, zzaqcVar);
                }
            }
            zzapxVar4.zzj().remove(this.zze);
            zzapxVar4.zzo(0);
            if (zzapxVar4.zzn() == 0) {
                zzapxVar4.zzm().zzv();
                zzapxVar4.zzp(true);
            }
        }
    }
}
