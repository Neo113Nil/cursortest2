package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        Strings.StringListImpl stringListImpl = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            stringListImpl.add((Strings.StringListImpl) arrayList.get(i8).freeze());
        }
        return stringListImpl;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        Strings.StringListImpl stringListImpl = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            stringListImpl.add((Strings.StringListImpl) it.next().freeze());
        }
        return stringListImpl;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        Strings.StringListImpl stringListImpl = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e8 : eArr) {
            stringListImpl.add((Strings.StringListImpl) e8.freeze());
        }
        return stringListImpl;
    }
}
