package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzlx extends zzic {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzda[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzlx(Collection collection, zzwd zzwdVar) {
        this(r0, r1, zzwdVar);
        zzda[] zzdaVarArr = new zzda[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzdaVarArr[i2] = ((zzlg) it.next()).zza();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzlg) it2.next()).zzb();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final int zzq(int i) {
        return zzfs.zzb(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final int zzr(int i) {
        return zzfs.zzb(this.zzg, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final int zzs(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final int zzt(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final zzda zzu(int i) {
        return this.zzh[i];
    }

    @Override // com.google.android.gms.internal.ads.zzic
    protected final Object zzv(int i) {
        return this.zzi[i];
    }

    final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzlx zzx(zzwd zzwdVar) {
        zzda[] zzdaVarArr = new zzda[this.zzh.length];
        int i = 0;
        while (true) {
            zzda[] zzdaVarArr2 = this.zzh;
            if (i >= zzdaVarArr2.length) {
                return new zzlx(zzdaVarArr, this.zzi, zzwdVar);
            }
            zzdaVarArr[i] = new zzlw(this, zzdaVarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlx(zzda[] zzdaVarArr, Object[] objArr, zzwd zzwdVar) {
        super(false, zzwdVar);
        int i = 0;
        this.zzh = zzdaVarArr;
        int length = zzdaVarArr.length;
        this.zzf = new int[length];
        this.zzg = new int[length];
        this.zzi = objArr;
        this.zzj = new HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < zzdaVarArr.length) {
            zzda zzdaVar = zzdaVarArr[i];
            this.zzh[i4] = zzdaVar;
            this.zzg[i4] = i2;
            this.zzf[i4] = i3;
            i2 += zzdaVar.zzc();
            i3 += this.zzh[i4].zzb();
            this.zzj.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.zzd = i2;
        this.zze = i3;
    }
}
