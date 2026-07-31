package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jf1 {
    public static int a(@NotNull Rect viewRect, @NotNull List overlappingRects) {
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        Intrinsics.checkNotNullParameter(overlappingRects, "overlappingRects");
        TreeSet treeSet = new TreeSet();
        treeSet.add(Integer.valueOf(viewRect.left));
        treeSet.add(Integer.valueOf(viewRect.right));
        Iterator it = overlappingRects.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next();
            treeSet.add(Integer.valueOf(rect.left));
            treeSet.add(Integer.valueOf(rect.right));
        }
        ArrayList arrayList = new ArrayList(treeSet);
        TreeSet treeSet2 = new TreeSet();
        treeSet2.add(Integer.valueOf(viewRect.top));
        treeSet2.add(Integer.valueOf(viewRect.bottom));
        Iterator it2 = overlappingRects.iterator();
        while (it2.hasNext()) {
            Rect rect2 = (Rect) it2.next();
            treeSet2.add(Integer.valueOf(rect2.top));
            treeSet2.add(Integer.valueOf(rect2.bottom));
        }
        ArrayList arrayList2 = new ArrayList(treeSet2);
        viewRect.left = Collections.binarySearch(arrayList, Integer.valueOf(viewRect.left));
        viewRect.top = Collections.binarySearch(arrayList2, Integer.valueOf(viewRect.top));
        viewRect.right = Collections.binarySearch(arrayList, Integer.valueOf(viewRect.right));
        viewRect.bottom = Collections.binarySearch(arrayList2, Integer.valueOf(viewRect.bottom));
        Iterator it3 = overlappingRects.iterator();
        while (it3.hasNext()) {
            Rect rect3 = (Rect) it3.next();
            rect3.left = Collections.binarySearch(arrayList, Integer.valueOf(rect3.left));
            rect3.top = Collections.binarySearch(arrayList2, Integer.valueOf(rect3.top));
            rect3.right = Collections.binarySearch(arrayList, Integer.valueOf(rect3.right));
            rect3.bottom = Collections.binarySearch(arrayList2, Integer.valueOf(rect3.bottom));
        }
        int size = arrayList.size() - 1;
        byte[][] bArr = new byte[size][];
        for (int i4 = 0; i4 < size; i4++) {
            bArr[i4] = new byte[arrayList2.size() - 1];
        }
        Iterator it4 = overlappingRects.iterator();
        while (it4.hasNext()) {
            Rect rect4 = (Rect) it4.next();
            int i5 = rect4.right;
            for (int i6 = rect4.left; i6 < i5; i6++) {
                int i7 = rect4.bottom;
                for (int i8 = rect4.top; i8 < i7; i8++) {
                    bArr[i6][i8] = 1;
                }
            }
        }
        int size2 = arrayList.size() - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            int size3 = arrayList2.size() - 1;
            for (int i11 = 0; i11 < size3; i11++) {
                if (bArr[i10][i11] == 1) {
                    i9 = ((((Number) arrayList2.get(i11 + 1)).intValue() - ((Number) arrayList2.get(i11)).intValue()) * (((Number) arrayList.get(i10 + 1)).intValue() - ((Number) arrayList.get(i10)).intValue())) + i9;
                }
            }
        }
        return i9;
    }
}
