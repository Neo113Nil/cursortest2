package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class rp0 {
    public static void a(Collection collection, oj1 oj1Var) {
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            oj1Var.getClass();
            while (it.hasNext()) {
                if (oj1Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        oj1Var.getClass();
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object obj = list.get(i5);
            if (!oj1Var.apply(obj)) {
                if (i5 > i4) {
                    try {
                        list.set(i4, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i5; size--) {
                            if (oj1Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i6 = i5 - 1; i6 >= i4; i6--) {
                            list.remove(i6);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i5; size2--) {
                            if (oj1Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i7 = i5 - 1; i7 >= i4; i7--) {
                            list.remove(i7);
                        }
                        return;
                    }
                }
                i4++;
            }
        }
        list.subList(i4, list.size()).clear();
    }
}
