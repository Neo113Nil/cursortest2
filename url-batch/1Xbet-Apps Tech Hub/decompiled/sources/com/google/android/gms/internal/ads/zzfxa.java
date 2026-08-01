package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfxa {
    public static boolean zza(Iterable iterable, zzftz zzftzVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzftzVar.getClass();
            return zzc((List) iterable, zzftzVar);
        }
        Iterator it = iterable.iterator();
        zzftzVar.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (zzftzVar.zza(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzb(List list, zzftz zzftzVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzftzVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    private static boolean zzc(List list, zzftz zzftzVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzftzVar.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        zzb(list, zzftzVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzb(list, zzftzVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
