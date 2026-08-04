package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgkj {
    static Object zza(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void zzb(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
