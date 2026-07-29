package com.google.android.gms.common.data;

import com.youappi.sdk.net.model.Vast;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        Vast.VastCarriageObject.AnonymousClass2 anonymousClass2 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            anonymousClass2.add(arrayList.get(i).freeze());
        }
        return anonymousClass2;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        Vast.VastCarriageObject.AnonymousClass2 anonymousClass2 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            anonymousClass2.add(e.freeze());
        }
        return anonymousClass2;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        Vast.VastCarriageObject.AnonymousClass2 anonymousClass2 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            anonymousClass2.add(it.next().freeze());
        }
        return anonymousClass2;
    }
}
