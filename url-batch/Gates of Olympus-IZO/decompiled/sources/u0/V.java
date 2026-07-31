package u0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e2.AbstractC0381e;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class V extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f8260d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f8261e;

    public V(Context context) {
        super(context);
        setClipChildren(false);
        this.f8260d = new HashMap();
        this.f8261e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, t0.D> getHolderToLayoutNode() {
        return this.f8260d;
    }

    public final HashMap<t0.D, Object> getLayoutNodeToHolder() {
        return this.f8261e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        Iterator it = this.f8260d.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!(View.MeasureSpec.getMode(i3) == 1073741824)) {
            AbstractC0381e.M("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            AbstractC0381e.M("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i4));
        Iterator it = this.f8260d.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            t0.D d3 = (t0.D) this.f8260d.get(childAt);
            if (childAt.isLayoutRequested() && d3 != null) {
                t0.D.R(d3, false, 7);
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
