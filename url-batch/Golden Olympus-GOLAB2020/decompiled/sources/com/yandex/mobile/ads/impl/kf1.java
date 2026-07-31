package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.yandex.mobile.ads.impl.ew1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kf1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mf1 f28187a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lf1 f28188b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final jf1 f28189c;

    public /* synthetic */ kf1() {
        this(new mf1(), new lf1(), new jf1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    public final int a(@NotNull View view, @NotNull Rect viewRect) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        int i4 = ew1.f25476l;
        ew1 a4 = ew1.a.a();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        du1 a5 = a4.a(context);
        if (a5 == null || !a5.u0()) {
            return 0;
        }
        this.f28187a.getClass();
        ArrayList overlappingViews = mf1.a(view);
        this.f28188b.getClass();
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        Intrinsics.checkNotNullParameter(overlappingViews, "overlappingViews");
        ArrayList arrayList = new ArrayList();
        int size = overlappingViews.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = overlappingViews.get(i5);
            i5++;
            Rect rect = new Rect();
            if (((View) obj).getGlobalVisibleRect(rect)) {
                arrayList.add(rect);
            }
        }
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            Rect rect2 = (Rect) obj2;
            rect2.left = kotlin.ranges.g.g(kotlin.ranges.g.d(rect2.left, viewRect.left), viewRect.right);
            rect2.top = kotlin.ranges.g.g(kotlin.ranges.g.d(rect2.top, viewRect.top), viewRect.bottom);
            rect2.right = kotlin.ranges.g.g(kotlin.ranges.g.d(rect2.right, viewRect.left), viewRect.right);
            rect2.bottom = kotlin.ranges.g.g(kotlin.ranges.g.d(rect2.bottom, viewRect.top), viewRect.bottom);
        }
        ArrayList arrayList2 = new ArrayList();
        int size3 = arrayList.size();
        int i7 = 0;
        while (i7 < size3) {
            Object obj3 = arrayList.get(i7);
            i7++;
            Rect rect3 = (Rect) obj3;
            if (rect3.width() > 0 && rect3.height() > 0) {
                arrayList2.add(obj3);
            }
        }
        int size4 = arrayList2.size();
        ArrayList arrayList3 = arrayList2;
        if (size4 > 100) {
            arrayList3 = arrayList2.subList(0, 100);
        }
        this.f28189c.getClass();
        return jf1.a(viewRect, arrayList3);
    }

    public kf1(@NotNull mf1 overlappingViewsProvider, @NotNull lf1 overlappingRectsProvider, @NotNull jf1 overlappingAreaEvaluator) {
        Intrinsics.checkNotNullParameter(overlappingViewsProvider, "overlappingViewsProvider");
        Intrinsics.checkNotNullParameter(overlappingRectsProvider, "overlappingRectsProvider");
        Intrinsics.checkNotNullParameter(overlappingAreaEvaluator, "overlappingAreaEvaluator");
        this.f28187a = overlappingViewsProvider;
        this.f28188b = overlappingRectsProvider;
        this.f28189c = overlappingAreaEvaluator;
    }
}
