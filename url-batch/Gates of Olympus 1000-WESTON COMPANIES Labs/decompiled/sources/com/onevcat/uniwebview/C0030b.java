package com.onevcat.uniwebview;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.onevcat.uniwebview.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0030b {
    public final FrameLayout a;
    public final Activity b;
    public final View c;
    public int d;
    public int e;
    public final FrameLayout.LayoutParams f;
    public float g;

    public C0030b(X x, Activity activity) {
        this.a = x;
        this.b = activity;
        View childAt = x.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "mContent.getChildAt(0)");
        this.c = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.onevcat.uniwebview.b$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C0030b.a(C0030b.this);
            }
        });
        ViewGroup.LayoutParams layoutParams = x.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        this.f = (FrameLayout.LayoutParams) layoutParams;
        this.g = childAt.getRootView().getHeight();
    }

    public static final void a(C0030b this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.b.getResources().getConfiguration().orientation;
        Rect rect = new Rect();
        this$0.c.getWindowVisibleDisplayFrame(rect);
        int coerceAtLeast = RangesKt.coerceAtLeast(0, (rect.bottom - rect.top) - ((int) this$0.a.getY()));
        if (i != this$0.e) {
            this$0.e = i;
            this$0.d = coerceAtLeast;
            return;
        }
        if (coerceAtLeast != this$0.d) {
            FrameLayout.LayoutParams layoutParams = this$0.f;
            float f = this$0.g;
            float y = this$0.c.getY() + f;
            int height = this$0.c.getRootView().getHeight();
            this$0.c.getWindowVisibleDisplayFrame(new Rect());
            layoutParams.height = (int) (f - RangesKt.coerceAtLeast(0.0f, (y + (height - RangesKt.coerceAtLeast(0, (r6.bottom - r6.top) - ((int) this$0.a.getY())))) - this$0.c.getRootView().getHeight()));
            this$0.a.requestLayout();
            this$0.d = coerceAtLeast;
        }
    }
}
