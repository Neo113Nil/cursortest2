package com.google.common.collect;

/* loaded from: classes.dex */
public abstract class Collections2 {
    static StringBuilder newStringBuilderForCollection(int i4) {
        CollectPreconditions.checkNonnegative(i4, "size");
        return new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
    }
}
