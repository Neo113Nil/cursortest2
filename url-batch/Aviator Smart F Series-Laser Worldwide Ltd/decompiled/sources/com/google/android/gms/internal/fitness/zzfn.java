package com.google.android.gms.internal.fitness;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public abstract class zzfn extends zzfj implements Set {

    @CheckForNull
    private transient zzfm zza;

    zzfn() {
    }

    static int zzf(int i8) {
        int max = Math.max(i8, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzfn zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzk(5, obj, obj2, obj3, obj4, obj5);
    }

    private static zzfn zzk(int i8, Object... objArr) {
        if (i8 == 0) {
            return zzfr.zza;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzfs(obj);
        }
        int zzf = zzf(i8);
        Object[] objArr2 = new Object[zzf];
        int i9 = zzf - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object obj2 = objArr[i12];
            zzfp.zza(obj2, i12);
            int hashCode = obj2.hashCode();
            int zza = zzfi.zza(hashCode);
            while (true) {
                int i13 = zza & i9;
                Object obj3 = objArr2[i13];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i13] = obj2;
                    i10 += hashCode;
                    i11++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                zza++;
            }
        }
        Arrays.fill(objArr, i11, i8, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzfs(obj4);
        }
        if (zzf(i11) < zzf / 2) {
            return zzk(i11, objArr);
        }
        if (i11 < 3) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new zzfr(objArr, i10, objArr2, i9, i11);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfn) && zzj() && ((zzfn) obj).zzj() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i8 += next != null ? next.hashCode() : 0;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.fitness.zzfj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzft iterator();

    public final zzfm zzg() {
        zzfm zzfmVar = this.zza;
        if (zzfmVar != null) {
            return zzfmVar;
        }
        zzfm zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    zzfm zzh() {
        return zzfm.zzg(toArray());
    }

    boolean zzj() {
        return false;
    }
}
