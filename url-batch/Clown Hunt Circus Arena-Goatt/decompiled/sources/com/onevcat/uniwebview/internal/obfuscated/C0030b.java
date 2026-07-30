package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030b {
    public final w3 a;
    public final Activity b;
    public int c;
    public int d;
    public final FrameLayout.LayoutParams e;
    public float f;
    public final ViewTreeObserver.OnGlobalLayoutListener g;

    public C0030b(w3 w3Var, Activity activity) {
        this.a = w3Var;
        this.b = activity;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.onevcat.uniwebview.internal.obfuscated.b$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C0030b.a(C0030b.this);
            }
        };
        this.g = onGlobalLayoutListener;
        w3Var.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        ViewGroup.LayoutParams layoutParams = w3Var.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        this.e = (FrameLayout.LayoutParams) layoutParams;
        this.f = w3Var.getRootView().getHeight();
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.g);
        }
    }

    public static final void a(C0030b this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = this$0.b.getResources().getConfiguration().orientation;
        Rect rect = new Rect();
        this$0.a.getWindowVisibleDisplayFrame(rect);
        int coerceAtLeast = RangesKt.coerceAtLeast(0, rect.bottom - rect.top);
        if (i != this$0.d) {
            this$0.d = i;
            this$0.c = coerceAtLeast;
            return;
        }
        if (coerceAtLeast != this$0.c) {
            FrameLayout.LayoutParams layoutParams = this$0.e;
            float f = this$0.f;
            int[] iArr = new int[2];
            this$0.a.getLocationOnScreen(iArr);
            float f2 = iArr[1];
            float f3 = this$0.f;
            this$0.a.getWindowVisibleDisplayFrame(new Rect());
            layoutParams.height = Math.max(0, (int) (f - RangesKt.coerceAtLeast(0.0f, (f2 + f3) - r6.bottom)));
            this$0.a.requestLayout();
            this$0.c = coerceAtLeast;
        }
    }
}
