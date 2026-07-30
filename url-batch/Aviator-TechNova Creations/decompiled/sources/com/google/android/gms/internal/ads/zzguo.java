package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzguo extends zzgtz {
    Object[] zzd;
    private int zze;

    public zzguo() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgtz, com.google.android.gms.internal.ads.zzgua
    public final /* bridge */ /* synthetic */ zzgua zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzguo zzg(Object... objArr) {
        if (this.zzd == null) {
            zzb(objArr, 2);
            return this;
        }
        for (int i = 0; i < 2; i++) {
            zzf(objArr[i]);
        }
        return this;
    }

    zzguo(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzgup.zzn(i)];
    }

    public final zzguo zzh(Iterable iterable) {
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

    public final zzgup zzi() {
        zzgup zzv;
        boolean zzw;
        int i = this.zzb;
        if (i == 0) {
            return zzgwg.zza;
        }
        if (i == 1) {
            return new zzgwq(Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || zzgup.zzn(i) != this.zzd.length) {
            zzv = zzgup.zzv(this.zzb, this.zza);
            this.zzb = zzv.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            zzw = zzgup.zzw(i2, objArr.length);
            if (zzw) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzv = new zzgwg(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzv;
    }

    public final zzguo zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzn = zzgup.zzn(this.zzb);
            Object[] objArr = this.zzd;
            if (zzn <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzgty.zza(hashCode);
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
