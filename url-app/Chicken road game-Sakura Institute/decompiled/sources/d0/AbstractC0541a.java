package d0;

import Z.AbstractC0307d;
import Z.r;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0541a extends ViewGroup {
    public final void a(r rVar, View view, long j4) {
        super.drawChild(AbstractC0307d.a(rVar), view, j4);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i2, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
