package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzabj {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private zzabj(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = f;
        this.zzk = str;
    }

    public static zzabj zza(zzfj zzfjVar) throws zzcf {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        float f;
        try {
            zzfjVar.zzH(4);
            int zzl = (zzfjVar.zzl() & 3) + 1;
            if (zzl == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzl2 = zzfjVar.zzl() & 31;
            for (int i8 = 0; i8 < zzl2; i8++) {
                arrayList.add(zzb(zzfjVar));
            }
            int zzl3 = zzfjVar.zzl();
            for (int i9 = 0; i9 < zzl3; i9++) {
                arrayList.add(zzb(zzfjVar));
            }
            if (zzl2 > 0) {
                zzgf zze = zzgg.zze((byte[]) arrayList.get(0), zzl + 1, ((byte[]) arrayList.get(0)).length);
                int i10 = zze.zze;
                int i11 = zze.zzf;
                int i12 = zze.zzh + 8;
                int i13 = zze.zzi + 8;
                int i14 = zze.zzj;
                int i15 = zze.zzk;
                int i16 = zze.zzl;
                float f2 = zze.zzg;
                str = zzeh.zza(zze.zza, zze.zzb, zze.zzc);
                i6 = i15;
                i7 = i16;
                f = f2;
                i3 = i12;
                i4 = i13;
                i5 = i14;
                i = i10;
                i2 = i11;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                str = null;
                f = 1.0f;
            }
            return new zzabj(arrayList, zzl, i, i2, i3, i4, i5, i6, i7, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcf.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzfj zzfjVar) {
        int zzp = zzfjVar.zzp();
        int zzc = zzfjVar.zzc();
        zzfjVar.zzH(zzp);
        return zzeh.zzc(zzfjVar.zzI(), zzc, zzp);
    }
}
