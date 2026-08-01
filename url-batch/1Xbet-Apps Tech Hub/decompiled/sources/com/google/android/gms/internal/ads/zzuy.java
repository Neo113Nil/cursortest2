package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzuy implements zzui, zzuh {
    private final zzui[] zza;
    private zzuh zze;
    private zzwl zzf;
    private final zztv zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzwc zzh = new zztu(new zzwc[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzui[] zzg = new zzui[0];

    public zzuy(zztv zztvVar, long[] jArr, zzui... zzuiVarArr) {
        this.zzi = zztvVar;
        this.zza = zzuiVarArr;
        for (int i = 0; i < zzuiVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzwi(zzuiVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zza(long j, zzmd zzmdVar) {
        zzui[] zzuiVarArr = this.zzg;
        return (zzuiVarArr.length > 0 ? zzuiVarArr[0] : this.zza[0]).zza(j, zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzui zzuiVar : this.zzg) {
            long zzd = zzuiVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zzui zzuiVar2 : this.zzg) {
                        if (zzuiVar2 == zzuiVar) {
                            break;
                        }
                        if (zzuiVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzuiVar.zze(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zze(long j) {
        long zze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzui[] zzuiVarArr = this.zzg;
            if (i >= zzuiVarArr.length) {
                return zze;
            }
            if (zzuiVarArr[i].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final /* bridge */ /* synthetic */ void zzf(zzwc zzwcVar) {
        zzuh zzuhVar = this.zze;
        zzuhVar.getClass();
        zzuhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zzg(zzxy[] zzxyVarArr, boolean[] zArr, zzwa[] zzwaVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzxyVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzxyVarArr.length;
            if (i2 >= length) {
                break;
            }
            zzwa zzwaVar = zzwaVarArr[i2];
            Integer num = zzwaVar != null ? (Integer) this.zzb.get(zzwaVar) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            zzxy zzxyVar = zzxyVarArr[i2];
            if (zzxyVar != null) {
                String str = zzxyVar.zze().zzc;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.zzb.clear();
        zzwa[] zzwaVarArr2 = new zzwa[length];
        zzwa[] zzwaVarArr3 = new zzwa[length];
        zzxy[] zzxyVarArr2 = new zzxy[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zza.length) {
            for (int i4 = i; i4 < zzxyVarArr.length; i4++) {
                zzwaVarArr3[i4] = iArr[i4] == i3 ? zzwaVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    zzxy zzxyVar2 = zzxyVarArr[i4];
                    zzxyVar2.getClass();
                    zzdc zzdcVar = (zzdc) this.zzd.get(zzxyVar2.zze());
                    zzdcVar.getClass();
                    zzxyVarArr2[i4] = new zzux(zzxyVar2, zzdcVar);
                } else {
                    zzxyVarArr2[i4] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzxy[] zzxyVarArr3 = zzxyVarArr2;
            zzwa[] zzwaVarArr4 = zzwaVarArr3;
            long zzg = this.zza[i3].zzg(zzxyVarArr2, zArr, zzwaVarArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = zzg;
            } else if (zzg != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < zzxyVarArr.length; i5++) {
                if (iArr2[i5] == i3) {
                    zzwa zzwaVar2 = zzwaVarArr4[i5];
                    zzwaVar2.getClass();
                    zzwaVarArr2[i5] = zzwaVar2;
                    this.zzb.put(zzwaVar2, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    zzef.zzf(zzwaVarArr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i3]);
            }
            i3++;
            arrayList = arrayList2;
            zzxyVarArr2 = zzxyVarArr3;
            zzwaVarArr3 = zzwaVarArr4;
            i = 0;
        }
        int i6 = i;
        System.arraycopy(zzwaVarArr2, i6, zzwaVarArr, i6, length);
        zzui[] zzuiVarArr = (zzui[]) arrayList.toArray(new zzui[i6]);
        this.zzg = zzuiVarArr;
        this.zzh = new zztu(zzuiVarArr);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzh(zzui zzuiVar) {
        this.zzc.remove(zzuiVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzui zzuiVar2 : this.zza) {
            i += zzuiVar2.zzi().zzc;
        }
        zzdc[] zzdcVarArr = new zzdc[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzui[] zzuiVarArr = this.zza;
            if (i2 >= zzuiVarArr.length) {
                this.zzf = new zzwl(zzdcVarArr);
                zzuh zzuhVar = this.zze;
                zzuhVar.getClass();
                zzuhVar.zzh(this);
                return;
            }
            zzwl zzi = zzuiVarArr[i2].zzi();
            int i4 = zzi.zzc;
            int i5 = 0;
            while (i5 < i4) {
                zzdc zzb = zzi.zzb(i5);
                zzdc zzc = zzb.zzc(i2 + ":" + zzb.zzc);
                this.zzd.put(zzc, zzb);
                zzdcVarArr[i3] = zzc;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzwl zzi() {
        zzwl zzwlVar = this.zzf;
        zzwlVar.getClass();
        return zzwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzj(long j, boolean z) {
        for (zzui zzuiVar : this.zzg) {
            zzuiVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            zzui[] zzuiVarArr = this.zza;
            if (i >= zzuiVarArr.length) {
                return;
            }
            zzuiVarArr[i].zzk();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzl(zzuh zzuhVar, long j) {
        this.zze = zzuhVar;
        Collections.addAll(this.zzc, this.zza);
        int i = 0;
        while (true) {
            zzui[] zzuiVarArr = this.zza;
            if (i >= zzuiVarArr.length) {
                return;
            }
            zzuiVarArr[i].zzl(this, j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzui zzn(int i) {
        zzui zzuiVar = this.zza[i];
        return zzuiVar instanceof zzwi ? ((zzwi) zzuiVar).zzn() : zzuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzo(zzla zzlaVar) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzlaVar);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzui) this.zzc.get(i)).zzo(zzlaVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
