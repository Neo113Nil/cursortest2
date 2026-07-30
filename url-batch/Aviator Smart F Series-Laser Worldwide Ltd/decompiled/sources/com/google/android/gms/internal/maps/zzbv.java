package com.google.android.gms.internal.maps;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzbv {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i8 += next != null ? next.hashCode() : 0;
        }
        return i8;
    }
}
