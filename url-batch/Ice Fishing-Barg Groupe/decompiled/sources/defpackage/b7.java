package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class b7 extends ViewGroup {
    public final HashMap OPXfSBeufaJ8;
    public final HashMap rtx2ld2ELZv4;

    public b7(Context context) {
        super(context);
        setClipChildren(false);
        this.rtx2ld2ELZv4 = new HashMap();
        this.OPXfSBeufaJ8 = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, vw0> getHolderToLayoutNode() {
        return this.rtx2ld2ELZv4;
    }

    public final HashMap<vw0, Object> getLayoutNodeToHolder() {
        return this.OPXfSBeufaJ8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator it = this.rtx2ld2ELZv4.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            u9.VhhvGxCb8gfr();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            ep0.PxuCJdSBwIXG("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            ep0.PxuCJdSBwIXG("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        Iterator it = this.rtx2ld2ELZv4.keySet().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            u9.VhhvGxCb8gfr();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            vw0 vw0Var = (vw0) this.rtx2ld2ELZv4.get(childAt);
            if (childAt.isLayoutRequested() && vw0Var != null) {
                vw0.IXK6ba3ucyzm(vw0Var, false, 7);
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
