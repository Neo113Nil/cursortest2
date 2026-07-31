package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class m02 {
    @NotNull
    public static ArrayList a(@Nullable List list, @Nullable dr0 dr0Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a(dr0Var));
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(a(((C2276uf) it.next()).a()));
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private static List a(dr0 dr0Var) {
        List<InterfaceC2237t> a4;
        if (dr0Var != null && (a4 = dr0Var.a()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : a4) {
                if (obj instanceof k02) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                List<n02> c4 = ((k02) obj2).c();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(c4, 10));
                Iterator<T> it = c4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((n02) it.next()).c().a());
                }
                CollectionsKt.addAll(arrayList2, arrayList3);
            }
            return arrayList2;
        }
        return CollectionsKt.emptyList();
    }
}
