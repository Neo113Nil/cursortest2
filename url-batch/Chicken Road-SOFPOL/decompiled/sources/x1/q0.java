package x1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f8531d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f8532e;

    public q0(Context context) {
        super(context);
        setClipChildren(false);
        this.f8531d = new HashMap();
        this.f8532e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, w1.f0> getHolderToLayoutNode() {
        return this.f8531d;
    }

    public final HashMap<w1.f0, Object> getLayoutNodeToHolder() {
        return this.f8532e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i8, int i9, int i10) {
        Iterator it = this.f8531d.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            t1.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            t1.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i8));
        Iterator it = this.f8531d.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            w1.f0 f0Var = (w1.f0) this.f8531d.get(childAt);
            if (childAt.isLayoutRequested() && f0Var != null) {
                w1.f0.U(f0Var, false, 7);
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
