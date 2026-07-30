package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzidr {
    static final /* synthetic */ zzian zza(zzian zzianVar, zzian zzianVar2, ArrayDeque arrayDeque) {
        zzb(zzianVar, arrayDeque);
        zzb(zzianVar2, arrayDeque);
        zzian zzianVar3 = (zzian) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzianVar3 = new zzidt((zzian) arrayDeque.pop(), zzianVar3, null);
        }
        return zzianVar3;
    }

    private static final void zzb(zzian zzianVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzianVar.zzq()) {
            if (!(zzianVar instanceof zzidt)) {
                String valueOf = String.valueOf(zzianVar.getClass());
                String.valueOf(valueOf);
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(valueOf)));
            }
            zzidt zzidtVar = (zzidt) zzianVar;
            zzb(zzidtVar.zzo(), arrayDeque);
            zzb(zzidtVar.zzE(), arrayDeque);
            return;
        }
        int zzc = zzc(zzianVar.zzc(), arrayDeque);
        int zzn = zzidt.zzn(zzc + 1);
        if (arrayDeque.isEmpty() || ((zzian) arrayDeque.peek()).zzc() >= zzn) {
            arrayDeque.push(zzianVar);
            return;
        }
        int zzn2 = zzidt.zzn(zzc);
        zzian zzianVar2 = (zzian) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zzian) arrayDeque.peek()).zzc() >= zzn2) {
                break;
            } else {
                zzianVar2 = new zzidt((zzian) arrayDeque.pop(), zzianVar2, bArr);
            }
        }
        zzidt zzidtVar2 = new zzidt(zzianVar2, zzianVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zzian) arrayDeque.peek()).zzc() >= zzidt.zzn(zzc(zzidtVar2.zzc(), arrayDeque) + 1)) {
                break;
            } else {
                zzidtVar2 = new zzidt((zzian) arrayDeque.pop(), zzidtVar2, bArr);
            }
        }
        arrayDeque.push(zzidtVar2);
    }

    private static final int zzc(int i, ArrayDeque arrayDeque) {
        int binarySearch = Arrays.binarySearch(zzidt.zzb, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
