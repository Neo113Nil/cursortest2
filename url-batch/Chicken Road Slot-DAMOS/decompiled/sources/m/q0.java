package m;

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
import com.appsflyer.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class q0 extends ListView {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f6159d;

    /* renamed from: e, reason: collision with root package name */
    public int f6160e;

    /* renamed from: i, reason: collision with root package name */
    public int f6161i;

    /* renamed from: r, reason: collision with root package name */
    public int f6162r;

    /* renamed from: s, reason: collision with root package name */
    public int f6163s;

    /* renamed from: t, reason: collision with root package name */
    public int f6164t;

    /* renamed from: u, reason: collision with root package name */
    public o0 f6165u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6166v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6167w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6168x;

    /* renamed from: y, reason: collision with root package name */
    public t3.c f6169y;

    /* renamed from: z, reason: collision with root package name */
    public b7.k f6170z;

    public q0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f6159d = new Rect();
        this.f6160e = 0;
        this.f6161i = 0;
        this.f6162r = 0;
        this.f6163s = 0;
        this.f6167w = z10;
        setCacheColorHint(0);
    }

    public final int a(int i3, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i3, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i3) {
        boolean z10;
        boolean z11;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = true;
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    z12 = false;
                    if (z10 || z12) {
                        this.f6168x = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f6164t - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    t3.c cVar = this.f6169y;
                    if (!z10) {
                        if (cVar == null) {
                            this.f6169y = new t3.c(this);
                        }
                        t3.c cVar2 = this.f6169y;
                        boolean z13 = cVar2.D;
                        cVar2.D = true;
                        cVar2.onTouch(this, motionEvent);
                    } else if (cVar != null) {
                        if (cVar.D) {
                            cVar.d();
                        }
                        cVar.D = false;
                    }
                    return z10;
                }
                z10 = false;
                z12 = false;
                if (z10) {
                }
                this.f6168x = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f6164t - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                t3.c cVar3 = this.f6169y;
                if (!z10) {
                }
                return z10;
            }
            z10 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i3);
        if (findPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(findPointerIndex);
            int y3 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x10, y3);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f3 = x10;
                float f10 = y3;
                this.f6168x = true;
                l0.a(this, f3, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i10 = this.f6164t;
                if (i10 != -1 && (childAt = getChildAt(i10 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f6164t = pointToPosition;
                l0.a(childAt3, f3 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z14 = (selector == null || pointToPosition == -1) ? false : true;
                if (z14) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f6159d;
                rect.set(left, top, right, bottom);
                rect.left -= this.f6160e;
                rect.top -= this.f6161i;
                rect.right += this.f6162r;
                rect.bottom += this.f6163s;
                if (Build.VERSION.SDK_INT >= 33) {
                    z11 = n0.a(this);
                } else {
                    Field field = p0.f6154a;
                    if (field != null) {
                        try {
                            z11 = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z11 = false;
                }
                if (childAt3.isEnabled() != z11) {
                    boolean z15 = !z11;
                    if (Build.VERSION.SDK_INT >= 33) {
                        n0.b(this, z15);
                    } else {
                        Field field2 = p0.f6154a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z15));
                            } catch (IllegalAccessException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z14) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f3, f10);
                }
                o0 o0Var = this.f6165u;
                if (o0Var != null) {
                    o0Var.f6145e = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z12 = false;
                z10 = true;
            }
            if (z10) {
            }
            this.f6168x = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f6164t - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            t3.c cVar32 = this.f6169y;
            if (!z10) {
            }
            return z10;
        }
        z10 = false;
        z12 = false;
        if (z10) {
        }
        this.f6168x = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f6164t - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        t3.c cVar322 = this.f6169y;
        if (!z10) {
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f6159d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f6170z != null) {
            return;
        }
        super.drawableStateChanged();
        o0 o0Var = this.f6165u;
        if (o0Var != null) {
            o0Var.f6145e = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f6168x && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f6167w || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f6167w || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f6167w || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f6167w && this.f6166v) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f6170z = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f6170z == null) {
            b7.k kVar = new b7.k(8, this);
            this.f6170z = kVar;
            post(kVar);
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
                if (i3 < 30 || !m0.f6136d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        m0.f6133a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        m0.f6134b.invoke(this, Integer.valueOf(pointToPosition));
                        m0.f6135c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f6168x && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6164t = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b7.k kVar = this.f6170z;
        if (kVar != null) {
            q0 q0Var = (q0) kVar.f1304e;
            q0Var.f6170z = null;
            q0Var.removeCallbacks(kVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f6166v = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        o0 o0Var = null;
        if (drawable != null) {
            o0 o0Var2 = new o0();
            Drawable drawable2 = o0Var2.f6144d;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            o0Var2.f6144d = drawable;
            drawable.setCallback(o0Var2);
            o0Var2.f6145e = true;
            o0Var = o0Var2;
        }
        this.f6165u = o0Var;
        super.setSelector(o0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f6160e = rect.left;
        this.f6161i = rect.top;
        this.f6162r = rect.right;
        this.f6163s = rect.bottom;
    }
}
