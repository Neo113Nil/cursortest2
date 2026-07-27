package s0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import n.AbstractC0864b;

/* renamed from: s0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132a0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f10169d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f10170e;

    public C1132a0(Context context) {
        super(context);
        setClipChildren(false);
        this.f10169d = new HashMap();
        this.f10170e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, r0.E> getHolderToLayoutNode() {
        return this.f10169d;
    }

    public final HashMap<r0.E, Object> getLayoutNodeToHolder() {
        return this.f10170e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i2, int i4, int i5, int i6) {
        Iterator it = this.f10169d.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i4) {
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            AbstractC0864b.C("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            AbstractC0864b.C("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i4));
        Iterator it = this.f10169d.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            r0.E e4 = (r0.E) this.f10169d.get(childAt);
            if (childAt.isLayoutRequested() && e4 != null) {
                r0.E.T(e4, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
