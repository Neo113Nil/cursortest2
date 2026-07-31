package f0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b0.AbstractC0272e;
import b0.InterfaceC0285r;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0384a extends ViewGroup {
    public final void a(InterfaceC0285r interfaceC0285r, View view, long j3) {
        super.drawChild(AbstractC0272e.a(interfaceC0285r), view, j3);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }
}
