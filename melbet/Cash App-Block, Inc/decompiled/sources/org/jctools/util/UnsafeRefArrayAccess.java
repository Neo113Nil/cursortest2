package org.jctools.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes10.dex */
public abstract class UnsafeRefArrayAccess {
    public static final long REF_ARRAY_BASE;
    public static final int REF_ELEMENT_SHIFT;

    static {
        int arrayIndexScale = UnsafeAccess.UNSAFE.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            REF_ELEMENT_SHIFT = 2;
        } else {
            if (8 != arrayIndexScale) {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(arrayIndexScale, "Unknown pointer size: "));
                return;
            }
            REF_ELEMENT_SHIFT = 3;
        }
        REF_ARRAY_BASE = r0.arrayBaseOffset(Object[].class);
    }

    public static <E> E[] allocateRefArray(int i) {
        return (E[]) new Object[i];
    }

    public static <E> E lvRefElement(E[] eArr, long j) {
        return (E) UnsafeAccess.UNSAFE.getObjectVolatile(eArr, j);
    }

    public static <E> void soRefElement(E[] eArr, long j, E e) {
        UnsafeAccess.UNSAFE.putOrderedObject(eArr, j, e);
    }
}
