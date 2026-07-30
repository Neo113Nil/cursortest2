package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class v extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5771d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f5772e;

    public v(Context context) {
        super(context);
        this.f5771d = new Rect();
        this.f5772e = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i2, int i5, int i7, int i8) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f5771d.set(i2, i5, i7, i8);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f5771d, layoutParams.x, layoutParams.y, this.f5772e);
            Rect rect = this.f5772e;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i5) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildAt(i7).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), Integer.MIN_VALUE));
        }
        super.onMeasure(i2, i5);
    }
}
