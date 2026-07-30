package com.my.lib;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.my.lib.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0429u implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareValues;
        compareValues = kotlin.comparisons.g.compareValues(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        return compareValues;
    }
}
