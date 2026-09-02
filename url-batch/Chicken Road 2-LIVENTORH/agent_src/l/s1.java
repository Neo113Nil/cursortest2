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
import com.oriondriftchasers.arordrft.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class s1 extends ListView {

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2442f;

    /* renamed from: g, reason: collision with root package name */
    public int f2443g;

    /* renamed from: h, reason: collision with root package name */
    public int f2444h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2445j;

    /* renamed from: k, reason: collision with root package name */
    public int f2446k;

    /* renamed from: l, reason: collision with root package name */
    public q1 f2447l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2448m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2449n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2450o;

    /* renamed from: p, reason: collision with root package name */
    public r0.d f2451p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.fragment.app.g f2452q;

    public s1(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2442f = new Rect();
        this.f2443g = 0;
        this.f2444h = 0;
        this.i = 0;
        this.f2445j = 0;
        this.f2449n = z3;
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
                        this.f2450o = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f2446k - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z3) {
                        r0.d dVar = this.f2451p;
                        if (dVar != null) {
                            if (dVar.f3138u) {
                                dVar.d();
                            }
                            dVar.f3138u = false;
                        }
                    } else {
                        if (this.f2451p == null) {
                            this.f2451p = new r0.d(this);
                        }
                        r0.d dVar2 = this.f2451p;
                        boolean z6 = dVar2.f3138u;
                        dVar2.f3138u = true;
                        dVar2.onTouch(this, motionEvent);
                    }
                    return z3;
                }
                z3 = false;
                if (z3) {
                }
                this.f2450o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f2446k - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z3) {
                }
                return z3;
            }
            z3 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x3 = (int) motionEvent.getX(findPointerIndex);
            int y3 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x3, y3);
            if (pointToPosition == -1) {
                z5 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = x3;
                float f4 = y3;
                this.f2450o = true;
                int i4 = Build.VERSION.SDK_INT;
                n1.a(this, f2, f4);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i5 = this.f2446k;
                if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2446k = pointToPosition;
                n1.a(childAt3, f2 - childAt3.getLeft(), f4 - childAt3.getTop());
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
                Rect rect = this.f2442f;
                rect.set(left, top, right, bottom);
                rect.left -= this.f2443g;
                rect.top -= this.f2444h;
                rect.right += this.i;
                rect.bottom += this.f2445j;
                if (i4 >= 33) {
                    z4 = p1.a(this);
                } else {
                    Field field = r1.f2432a;
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
                        p1.b(this, z8);
                    } else {
                        Field field2 = r1.f2432a;
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
                    selector2.setHotspot(f2, f4);
                }
                q1 q1Var = this.f2447l;
                if (q1Var != null) {
                    q1Var.f2420g = false;
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
            this.f2450o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2446k - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z3) {
            }
            return z3;
        }
        z3 = false;
        if (z3) {
        }
        this.f2450o = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f2446k - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z3) {
        }
        return z3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2442f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2452q != null) {
            return;
        }
        super.drawableStateChanged();
        q1 q1Var = this.f2447l;
        if (q1Var != null) {
            q1Var.f2420g = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2450o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2449n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2449n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2449n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2449n && this.f2448m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2452q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2452q == null) {
            androidx.fragment.app.g gVar = new androidx.fragment.app.g(5, this);
            this.f2452q = gVar;
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
                if (i < 30 || !o1.d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        o1.f2402a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        o1.f2403b.invoke(this, Integer.valueOf(pointToPosition));
                        o1.f2404c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    } catch (InvocationTargetException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f2450o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2446k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.fragment.app.g gVar = this.f2452q;
        if (gVar != null) {
            s1 s1Var = (s1) gVar.f428g;
            s1Var.f2452q = null;
            s1Var.removeCallbacks(gVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f2448m = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        q1 q1Var;
        if (drawable != null) {
            q1Var = new q1();
            Drawable drawable2 = q1Var.f2419f;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            q1Var.f2419f = drawable;
            if (drawable != null) {
                drawable.setCallback(q1Var);
            }
            q1Var.f2420g = true;
        } else {
            q1Var = null;
        }
        this.f2447l = q1Var;
        super.setSelector(q1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2443g = rect.left;
        this.f2444h = rect.top;
        this.i = rect.right;
        this.f2445j = rect.bottom;
    }
}
