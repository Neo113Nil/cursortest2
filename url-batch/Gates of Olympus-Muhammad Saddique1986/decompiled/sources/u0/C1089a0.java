package u0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: u0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089a0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9306d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f9307e;

    public C1089a0(Context context) {
        super(context);
        setClipChildren(false);
        this.f9306d = new HashMap();
        this.f9307e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, t0.E> getHolderToLayoutNode() {
        return this.f9306d;
    }

    public final HashMap<t0.E, Object> getLayoutNodeToHolder() {
        return this.f9307e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        Iterator it = this.f9306d.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!(View.MeasureSpec.getMode(i3) == 1073741824)) {
            n.z0.n("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            n.z0.n("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i4));
        Iterator it = this.f9306d.keySet().iterator();
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
            t0.E e3 = (t0.E) this.f9306d.get(childAt);
            if (childAt.isLayoutRequested() && e3 != null) {
                t0.E.T(e3, false, 7);
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
