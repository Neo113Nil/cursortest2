package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class m extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2500e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2501f;

    public m(Context context) {
        super(context);
        this.f2500e = new Rect();
        this.f2501f = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f2500e.set(i2, i3, i4, i5);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f2500e, layoutParams.x, layoutParams.y, this.f2501f);
            Rect rect = this.f2501f;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE));
        }
        super.onMeasure(i2, i3);
    }
}
