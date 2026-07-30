package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.majelw.libystne.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ne0 extends ListView {
    public final Rect m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public le0 s;
    public boolean t;
    public final boolean u;
    public boolean v;
    public af1 w;
    public r7 x;

    public ne0(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.m = new Rect();
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.u = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z3 = false;
                    if (z || z3) {
                        this.v = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.r - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    af1 af1Var = this.w;
                    if (!z) {
                        if (af1Var == null) {
                            this.w = new af1(this);
                        }
                        af1 af1Var2 = this.w;
                        boolean z4 = af1Var2.B;
                        af1Var2.B = true;
                        af1Var2.onTouch(this, motionEvent);
                    } else if (af1Var != null) {
                        if (af1Var.B) {
                            af1Var.d();
                        }
                        af1Var.B = false;
                    }
                    return z;
                }
                z = false;
                z3 = false;
                if (z) {
                }
                this.v = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.r - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                af1 af1Var3 = this.w;
                if (!z) {
                }
                return z;
            }
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.v = true;
                ie0.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.r;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.r = pointToPosition;
                ie0.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || pointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.m;
                rect.set(left, top, right, bottom);
                rect.left -= this.n;
                rect.top -= this.o;
                rect.right += this.p;
                rect.bottom += this.q;
                if (Build.VERSION.SDK_INT >= 33) {
                    z2 = ke0.a(this);
                } else {
                    Field field = me0.a;
                    if (field != null) {
                        try {
                            z2 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    z2 = false;
                }
                if (childAt3.isEnabled() != z2) {
                    boolean z6 = !z2;
                    if (Build.VERSION.SDK_INT >= 33) {
                        ke0.b(this, z6);
                    } else {
                        Field field2 = me0.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                le0 le0Var = this.s;
                if (le0Var != null) {
                    le0Var.n = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = false;
                z = true;
            }
            if (z) {
            }
            this.v = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.r - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            af1 af1Var32 = this.w;
            if (!z) {
            }
            return z;
        }
        z = false;
        z3 = false;
        if (z) {
        }
        this.v = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.r - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        af1 af1Var322 = this.w;
        if (!z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.m;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.x != null) {
            return;
        }
        super.drawableStateChanged();
        le0 le0Var = this.s;
        if (le0Var != null) {
            le0Var.n = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.v && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.u || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.u || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.u || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.u && this.t) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.x = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.x == null) {
            r7 r7Var = new r7(5, this);
            this.x = r7Var;
            post(r7Var);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !je0.d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        je0.a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        je0.b.invoke(this, Integer.valueOf(pointToPosition));
                        je0.c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.v && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.r = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        r7 r7Var = this.x;
        if (r7Var != null) {
            ne0 ne0Var = (ne0) r7Var.n;
            ne0Var.x = null;
            ne0Var.removeCallbacks(r7Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.t = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        le0 le0Var = null;
        if (drawable != null) {
            le0 le0Var2 = new le0();
            Drawable drawable2 = le0Var2.m;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            le0Var2.m = drawable;
            drawable.setCallback(le0Var2);
            le0Var2.n = true;
            le0Var = le0Var2;
        }
        this.s = le0Var;
        super.setSelector(le0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.n = rect.left;
        this.o = rect.top;
        this.p = rect.right;
        this.q = rect.bottom;
    }
}
