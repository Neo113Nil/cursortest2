package l;

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
import com.gdmhkmf.belbet.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class p1 extends ListView {

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2530f;

    /* renamed from: g, reason: collision with root package name */
    public int f2531g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2532j;

    /* renamed from: k, reason: collision with root package name */
    public int f2533k;

    /* renamed from: l, reason: collision with root package name */
    public n1 f2534l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2535m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2536n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2537o;

    /* renamed from: p, reason: collision with root package name */
    public r0.c f2538p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.fragment.app.g f2539q;

    public p1(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2530f = new Rect();
        this.f2531g = 0;
        this.h = 0;
        this.i = 0;
        this.f2532j = 0;
        this.f2536n = z4;
        setCacheColorHint(0);
    }

    public final int a(int i, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i4) {
                return i4;
            }
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z4;
        boolean z5;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z6 = false;
        if (actionMasked == 1) {
            z4 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z4 = true;
                    if (z4 || z6) {
                        this.f2537o = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f2533k - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z4) {
                        r0.c cVar = this.f2538p;
                        if (cVar != null) {
                            if (cVar.f3197u) {
                                cVar.d();
                            }
                            cVar.f3197u = false;
                        }
                    } else {
                        if (this.f2538p == null) {
                            this.f2538p = new r0.c(this);
                        }
                        r0.c cVar2 = this.f2538p;
                        boolean z7 = cVar2.f3197u;
                        cVar2.f3197u = true;
                        cVar2.onTouch(this, motionEvent);
                    }
                    return z4;
                }
                z4 = false;
                if (z4) {
                }
                this.f2537o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f2533k - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z4) {
                }
                return z4;
            }
            z4 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x4 = (int) motionEvent.getX(findPointerIndex);
            int y4 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x4, y4);
            if (pointToPosition == -1) {
                z6 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f5 = x4;
                float f6 = y4;
                this.f2537o = true;
                int i4 = Build.VERSION.SDK_INT;
                k1.a(this, f5, f6);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i5 = this.f2533k;
                if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2533k = pointToPosition;
                k1.a(childAt3, f5 - childAt3.getLeft(), f6 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z8 = (selector == null || pointToPosition == -1) ? false : true;
                if (z8) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f2530f;
                rect.set(left, top, right, bottom);
                rect.left -= this.f2531g;
                rect.top -= this.h;
                rect.right += this.i;
                rect.bottom += this.f2532j;
                if (i4 >= 33) {
                    z5 = m1.a(this);
                } else {
                    Field field = o1.f2521a;
                    if (field != null) {
                        try {
                            z5 = field.getBoolean(this);
                        } catch (IllegalAccessException e4) {
                            e4.printStackTrace();
                        }
                    }
                    z5 = false;
                }
                if (childAt3.isEnabled() != z5) {
                    boolean z9 = !z5;
                    if (Build.VERSION.SDK_INT >= 33) {
                        m1.b(this, z9);
                    } else {
                        Field field2 = o1.f2521a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z9));
                            } catch (IllegalAccessException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z8) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f5, f6);
                }
                n1 n1Var = this.f2534l;
                if (n1Var != null) {
                    n1Var.f2511g = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z4 = true;
                z6 = false;
            }
            if (z4) {
            }
            this.f2537o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2533k - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z4) {
            }
            return z4;
        }
        z4 = false;
        if (z4) {
        }
        this.f2537o = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f2533k - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z4) {
        }
        return z4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2530f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2539q != null) {
            return;
        }
        super.drawableStateChanged();
        n1 n1Var = this.f2534l;
        if (n1Var != null) {
            n1Var.f2511g = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2537o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2536n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2536n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2536n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2536n && this.f2535m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2539q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2539q == null) {
            androidx.fragment.app.g gVar = new androidx.fragment.app.g(5, this);
            this.f2539q = gVar;
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
                if (i < 30 || !l1.d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        l1.f2498a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        l1.f2499b.invoke(this, Integer.valueOf(pointToPosition));
                        l1.f2500c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2537o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2533k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.fragment.app.g gVar = this.f2539q;
        if (gVar != null) {
            p1 p1Var = (p1) gVar.f541g;
            p1Var.f2539q = null;
            p1Var.removeCallbacks(gVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f2535m = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        n1 n1Var;
        if (drawable != null) {
            n1Var = new n1();
            Drawable drawable2 = n1Var.f2510f;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            n1Var.f2510f = drawable;
            if (drawable != null) {
                drawable.setCallback(n1Var);
            }
            n1Var.f2511g = true;
        } else {
            n1Var = null;
        }
        this.f2534l = n1Var;
        super.setSelector(n1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2531g = rect.left;
        this.h = rect.top;
        this.i = rect.right;
        this.f2532j = rect.bottom;
    }
}
