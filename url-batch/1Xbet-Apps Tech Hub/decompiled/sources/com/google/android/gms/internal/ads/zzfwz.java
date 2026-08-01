package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzfwz extends zzfwp implements Set {

    @CheckForNull
    private transient zzfwu zza;

    zzfwz() {
    }

    static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            zzfty.zzf(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzfwy zzj(int i) {
        return new zzfwy(i);
    }

    public static zzfwz zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzs(array.length, array);
    }

    public static zzfwz zzm() {
        return zzfyk.zza;
    }

    public static zzfwz zzn(Object obj) {
        return new zzfyr(obj);
    }

    public static zzfwz zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzs(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzfwz zzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzs(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfwz) && zzr() && ((zzfwz) obj).zzr() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfyq.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfyq.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    public zzfwu zzd() {
        zzfwu zzfwuVar = this.zza;
        if (zzfwuVar != null) {
            return zzfwuVar;
        }
        zzfwu zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzfyu iterator();

    zzfwu zzi() {
        Object[] array = toArray();
        int i = zzfwu.zzd;
        return zzfwu.zzi(array, array.length);
    }

    boolean zzr() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfwz zzs(int i, Object... objArr) {
        if (i == 0) {
            return zzfyk.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzfyr(obj);
        }
        int zzh = zzh(i);
        Object[] objArr2 = new Object[zzh];
        int i2 = zzh - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            zzfyc.zza(obj2, i5);
            int hashCode = obj2.hashCode();
            int zza = zzfwm.zza(hashCode);
            while (true) {
                int i6 = zza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzfyr(obj4);
        }
        if (zzh(i4) < zzh / 2) {
            return zzs(i4, objArr);
        }
        if (zzt(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzfyk(objArr, i3, objArr2, i2, i4);
    }
}
