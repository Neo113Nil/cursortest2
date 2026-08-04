package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgkd extends zzgjt {
    Object[] zzd;
    private int zze;

    public zzgkd() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgjt, com.google.android.gms.internal.ads.zzgju
    public final /* bridge */ /* synthetic */ zzgju zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgkd zzg(Object... objArr) {
        if (this.zzd == null) {
            zzb(objArr, 2);
            return this;
        }
        for (int i = 0; i < 2; i++) {
            zzf(objArr[i]);
        }
        return this;
    }

    zzgkd(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzgke.zzn(i)];
    }

    public final zzgkd zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            super.zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzgke zzi() {
        zzgke zzv;
        boolean zzw;
        int i = this.zzb;
        if (i == 0) {
            return zzglq.zza;
        }
        if (i == 1) {
            return new zzgma(Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || zzgke.zzn(i) != this.zzd.length) {
            zzv = zzgke.zzv(this.zzb, this.zza);
            this.zzb = zzv.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            zzw = zzgke.zzw(i2, objArr.length);
            if (zzw) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzv = new zzglq(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzv;
    }

    public final zzgkd zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzn = zzgke.zzn(this.zzb);
            Object[] objArr = this.zzd;
            if (zzn <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzgjs.zza(hashCode);
                while (true) {
                    int i = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    zza = i + 1;
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
