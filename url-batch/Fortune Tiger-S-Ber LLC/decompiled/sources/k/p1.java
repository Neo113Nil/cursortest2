package k;

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
import com.gglhk.bofio.fortunetiger.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class p1 extends ListView {

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2618f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2619i;

    /* renamed from: j, reason: collision with root package name */
    public int f2620j;

    /* renamed from: k, reason: collision with root package name */
    public int f2621k;

    /* renamed from: l, reason: collision with root package name */
    public n1 f2622l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2623m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2624n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2625o;

    /* renamed from: p, reason: collision with root package name */
    public o0.d f2626p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.fragment.app.g f2627q;

    public p1(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2618f = new Rect();
        this.g = 0;
        this.h = 0;
        this.f2619i = 0;
        this.f2620j = 0;
        this.f2624n = z3;
        setCacheColorHint(0);
    }

    public final int a(int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i4, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i5) {
                return i5;
            }
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i4) {
        boolean z3;
        boolean z4;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z5 = false;
        if (actionMasked == 1) {
            z3 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z3 = true;
                    if (z3 || z5) {
                        this.f2625o = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f2621k - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z3) {
                        o0.d dVar = this.f2626p;
                        if (dVar != null) {
                            if (dVar.f2978u) {
                                dVar.d();
                            }
                            dVar.f2978u = false;
                        }
                    } else {
                        if (this.f2626p == null) {
                            this.f2626p = new o0.d(this);
                        }
                        o0.d dVar2 = this.f2626p;
                        boolean z6 = dVar2.f2978u;
                        dVar2.f2978u = true;
                        dVar2.onTouch(this, motionEvent);
                    }
                    return z3;
                }
                z3 = false;
                if (z3) {
                }
                this.f2625o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f2621k - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z3) {
                }
                return z3;
            }
            z3 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        if (findPointerIndex >= 0) {
            int x3 = (int) motionEvent.getX(findPointerIndex);
            int y3 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x3, y3);
            if (pointToPosition == -1) {
                z5 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f4 = x3;
                float f5 = y3;
                this.f2625o = true;
                int i5 = Build.VERSION.SDK_INT;
                k1.a(this, f4, f5);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i6 = this.f2621k;
                if (i6 != -1 && (childAt = getChildAt(i6 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2621k = pointToPosition;
                k1.a(childAt3, f4 - childAt3.getLeft(), f5 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z7 = (selector == null || pointToPosition == -1) ? false : true;
                if (z7) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f2618f;
                rect.set(left, top, right, bottom);
                rect.left -= this.g;
                rect.top -= this.h;
                rect.right += this.f2619i;
                rect.bottom += this.f2620j;
                if (i5 >= 33) {
                    z4 = m1.a(this);
                } else {
                    Field field = o1.f2611a;
                    if (field != null) {
                        try {
                            z4 = field.getBoolean(this);
                        } catch (IllegalAccessException e4) {
                            e4.printStackTrace();
                        }
                    }
                    z4 = false;
                }
                if (childAt3.isEnabled() != z4) {
                    boolean z8 = !z4;
                    if (Build.VERSION.SDK_INT >= 33) {
                        m1.b(this, z8);
                    } else {
                        Field field2 = o1.f2611a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z8));
                            } catch (IllegalAccessException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z7) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f4, f5);
                }
                n1 n1Var = this.f2622l;
                if (n1Var != null) {
                    n1Var.g = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = true;
                z5 = false;
            }
            if (z3) {
            }
            this.f2625o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2621k - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z3) {
            }
            return z3;
        }
        z3 = false;
        if (z3) {
        }
        this.f2625o = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f2621k - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z3) {
        }
        return z3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2618f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2627q != null) {
            return;
        }
        super.drawableStateChanged();
        n1 n1Var = this.f2622l;
        if (n1Var != null) {
            n1Var.g = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2625o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2624n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2624n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2624n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2624n && this.f2623m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2627q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i4 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2627q == null) {
            androidx.fragment.app.g gVar = new androidx.fragment.app.g(7, this);
            this.f2627q = gVar;
            post(gVar);
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
                if (i4 < 30 || !l1.f2589d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        l1.f2587a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        l1.f2588b.invoke(this, Integer.valueOf(pointToPosition));
                        l1.c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2625o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2621k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.fragment.app.g gVar = this.f2627q;
        if (gVar != null) {
            p1 p1Var = (p1) gVar.g;
            p1Var.f2627q = null;
            p1Var.removeCallbacks(gVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f2623m = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        n1 n1Var;
        if (drawable != null) {
            n1Var = new n1();
            Drawable drawable2 = n1Var.f2601f;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            n1Var.f2601f = drawable;
            if (drawable != null) {
                drawable.setCallback(n1Var);
            }
            n1Var.g = true;
        } else {
            n1Var = null;
        }
        this.f2622l = n1Var;
        super.setSelector(n1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.g = rect.left;
        this.h = rect.top;
        this.f2619i = rect.right;
        this.f2620j = rect.bottom;
    }
}
