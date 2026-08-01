package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfwy extends zzfwn {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfwy() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn, com.google.android.gms.internal.ads.zzfwo
    public final /* bridge */ /* synthetic */ zzfwo zzb(Object obj) {
        zzf(obj);
        return this;
    }

    zzfwy(int i) {
        super(i);
        this.zzd = new Object[zzfwz.zzh(i)];
    }

    public final zzfwy zzg(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfwz zzh() {
        zzfwz zzs;
        boolean zzt;
        int i = this.zzb;
        if (i == 0) {
            return zzfyk.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            obj.getClass();
            return new zzfyr(obj);
        }
        if (this.zzd == null || zzfwz.zzh(i) != this.zzd.length) {
            zzs = zzfwz.zzs(this.zzb, this.zza);
            this.zzb = zzs.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            zzt = zzfwz.zzt(i2, objArr.length);
            if (zzt) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzs = new zzfyk(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzs;
    }

    public final zzfwy zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfwz.zzh(this.zzb);
            Object[] objArr = this.zzd;
            int length = objArr.length;
            if (zzh <= length) {
                objArr.getClass();
                int hashCode = obj.hashCode();
                int zza = zzfwm.zza(hashCode);
                while (true) {
                    Object[] objArr2 = this.zzd;
                    int i = zza & (length - 1);
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
