package d2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3501d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3502e;

    public p0(Context context) {
        super(context);
        setClipChildren(false);
        this.f3501d = new HashMap();
        this.f3502e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<a3.n, c2.g0> getHolderToLayoutNode() {
        return this.f3501d;
    }

    public final HashMap<c2.g0, a3.n> getLayoutNodeToHolder() {
        return this.f3502e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        for (a3.n nVar : this.f3501d.keySet()) {
            nVar.layout(nVar.getLeft(), nVar.getTop(), nVar.getRight(), nVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        if (!(View.MeasureSpec.getMode(i3) == 1073741824)) {
            z1.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            z1.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        for (a3.n nVar : this.f3501d.keySet()) {
            int i12 = nVar.J;
            if (i12 != Integer.MIN_VALUE && (i11 = nVar.K) != Integer.MIN_VALUE) {
                nVar.measure(i12, i11);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            c2.g0 g0Var = (c2.g0) this.f3501d.get(childAt);
            if (childAt.isLayoutRequested() && g0Var != null) {
                c2.g0.R(g0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
