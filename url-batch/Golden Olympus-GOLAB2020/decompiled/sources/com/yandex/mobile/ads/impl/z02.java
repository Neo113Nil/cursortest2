package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z02 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qi0 f35419a;

    public z02(@NotNull qi0 imageForPresentProvider) {
        Intrinsics.checkNotNullParameter(imageForPresentProvider, "imageForPresentProvider");
        this.f35419a = imageForPresentProvider;
    }

    @NotNull
    public final PopupWindow a(@NotNull View view, @NotNull List<n02> items, @NotNull s02 clickListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        ListView listView = new ListView(context);
        y02 y02Var = new y02(context, items, this.f35419a);
        listView.setOnItemClickListener(clickListener);
        listView.setAdapter((ListAdapter) y02Var);
        ListAdapter adapter = listView.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type android.widget.ListAdapter");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(context, "context");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        int count = adapter.getCount();
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            View view2 = adapter.getView(i5, null, frameLayout);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setWidth(i4);
        popupWindow.setHeight(-2);
        popupWindow.setContentView(listView);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        return popupWindow;
    }
}
