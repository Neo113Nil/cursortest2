package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mf1 {
    @NotNull
    public static ArrayList a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = new ArrayList();
        int i4 = lh2.f28593b;
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        ViewGroup view2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        View view3 = view;
        while (view2 != null) {
            int childCount = view2.getChildCount();
            for (int indexOfChild = view2.indexOfChild(view3) + 1; indexOfChild < childCount; indexOfChild++) {
                View childAt = view2.getChildAt(indexOfChild);
                Intrinsics.checkNotNull(childAt);
                arrayList.addAll(b(childAt));
            }
            Intrinsics.checkNotNullParameter(view2, "view");
            ViewParent parent2 = view2.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            view3 = view2;
            view2 = viewGroup;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            if (view.getZ() <= ((View) obj).getZ()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private static List b(View view) {
        List createListBuilder = CollectionsKt.createListBuilder();
        if (!lh2.d(view)) {
            if (!(view instanceof ViewGroup)) {
                createListBuilder.add(view);
            } else if (lh2.e(view)) {
                createListBuilder.add(view);
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                List createListBuilder2 = CollectionsKt.createListBuilder();
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    Intrinsics.checkNotNull(childAt);
                    createListBuilder2.addAll(b(childAt));
                }
                createListBuilder.addAll(CollectionsKt.build(createListBuilder2));
            }
        }
        return CollectionsKt.build(createListBuilder);
    }
}
