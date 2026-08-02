package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzfxv extends zzfxk {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfxv() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfxk, com.google.android.gms.internal.ads.zzfxl
    public final /* bridge */ /* synthetic */ zzfxl zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfxv zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i = 0; i < 2; i++) {
                zzf(objArr[i]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    zzfxv(int i) {
        super(i);
        this.zzd = new Object[zzfxw.zzh(i)];
    }

    public final zzfxv zzh(Iterable iterable) {
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

    public final zzfxw zzi() {
        zzfxw zzv;
        boolean zzw;
        int i = this.zzb;
        if (i == 0) {
            return zzfzj.zza;
        }
        if (i == 1) {
            return new zzfzu(Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || zzfxw.zzh(i) != this.zzd.length) {
            zzv = zzfxw.zzv(this.zzb, this.zza);
            this.zzb = zzv.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            zzw = zzfxw.zzw(i2, objArr.length);
            if (zzw) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzv = new zzfzj(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzv;
    }

    public final zzfxv zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfxw.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfxj.zza(hashCode);
                while (true) {
                    int i = zza & length;
                    Object[] objArr2 = this.zzd;
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
