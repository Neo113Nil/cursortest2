package com.google.common.collect;

/* loaded from: classes.dex */
public abstract class ObjectArrays {
    static Object checkElementNotNull(Object obj, int i4) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i4);
        throw new NullPointerException(sb.toString());
    }

    static Object[] checkElementsNotNull(Object... objArr) {
        checkElementsNotNull(objArr, objArr.length);
        return objArr;
    }

    public static <T> T[] newArray(T[] tArr, int i4) {
        return (T[]) Platform.newArray(tArr, i4);
    }

    static Object[] checkElementsNotNull(Object[] objArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            checkElementNotNull(objArr[i5], i5);
        }
        return objArr;
    }
}
