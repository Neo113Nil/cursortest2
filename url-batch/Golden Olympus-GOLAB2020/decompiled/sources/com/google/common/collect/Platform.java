package com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
abstract class Platform {
    static <T> T[] copy(Object[] objArr, int i4, int i5, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i4, i5, tArr.getClass());
    }

    static <T> T[] newArray(T[] tArr, int i4) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i4));
    }
}
