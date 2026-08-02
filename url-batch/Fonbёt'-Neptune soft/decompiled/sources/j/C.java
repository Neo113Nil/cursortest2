package j;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.neptunesoft.languesbacdz.R;
import java.lang.reflect.Field;
import u.AbstractC0309a;

/* loaded from: classes.dex */
public abstract class C extends ListView {

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2835e;

    /* renamed from: f, reason: collision with root package name */
    public int f2836f;

    /* renamed from: g, reason: collision with root package name */
    public int f2837g;

    /* renamed from: h, reason: collision with root package name */
    public int f2838h;

    /* renamed from: i, reason: collision with root package name */
    public int f2839i;

    /* renamed from: j, reason: collision with root package name */
    public int f2840j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f2841k;

    /* renamed from: l, reason: collision with root package name */
    public B f2842l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2843m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2844n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2845o;

    /* renamed from: p, reason: collision with root package name */
    public F.g f2846p;

    /* renamed from: q, reason: collision with root package name */
    public F.b f2847q;

    public C(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2835e = new Rect();
        this.f2836f = 0;
        this.f2837g = 0;
        this.f2838h = 0;
        this.f2839i = 0;
        this.f2844n = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2841k = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i4 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i5 = 0;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i2, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i3) {
                return i3;
            }
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r3 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i2, MotionEvent motionEvent) {
        int i3;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            i3 = i2;
            z2 = false;
        } else if (actionMasked == 2) {
            i3 = i2;
            z2 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i3);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y2);
            if (pointToPosition == -1) {
                z3 = true;
                if (z2 || z3) {
                    this.f2845o = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f2840j - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z2) {
                    if (this.f2846p == null) {
                        this.f2846p = new F.g(this);
                    }
                    F.g gVar = this.f2846p;
                    boolean z4 = gVar.f451p;
                    gVar.f451p = true;
                    gVar.onTouch(this, motionEvent);
                } else {
                    F.g gVar2 = this.f2846p;
                    if (gVar2 != null) {
                        if (gVar2.f451p) {
                            gVar2.d();
                        }
                        gVar2.f451p = false;
                    }
                }
                return z2;
            }
            View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
            float f2 = x2;
            float f3 = y2;
            this.f2845o = true;
            drawableHotspotChanged(f2, f3);
            if (!isPressed()) {
                setPressed(true);
            }
            layoutChildren();
            int i4 = this.f2840j;
            if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                childAt.setPressed(false);
            }
            this.f2840j = pointToPosition;
            childAt3.drawableHotspotChanged(f2 - childAt3.getLeft(), f3 - childAt3.getTop());
            if (!childAt3.isPressed()) {
                childAt3.setPressed(true);
            }
            Drawable selector = getSelector();
            boolean z5 = (selector == null || pointToPosition == -1) ? false : true;
            if (z5) {
                selector.setVisible(false, false);
            }
            Field field = this.f2841k;
            int left = childAt3.getLeft();
            int top = childAt3.getTop();
            int right = childAt3.getRight();
            int bottom = childAt3.getBottom();
            Rect rect = this.f2835e;
            rect.set(left, top, right, bottom);
            rect.left -= this.f2836f;
            rect.top -= this.f2837g;
            rect.right += this.f2838h;
            rect.bottom += this.f2839i;
            try {
                boolean z6 = field.getBoolean(this);
                if (childAt3.isEnabled() != z6) {
                    field.set(this, Boolean.valueOf(!z6));
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
            if (z5) {
                float exactCenterX = rect.exactCenterX();
                float exactCenterY = rect.exactCenterY();
                selector.setVisible(getVisibility() == 0, false);
                AbstractC0309a.e(selector, exactCenterX, exactCenterY);
            }
            Drawable selector2 = getSelector();
            if (selector2 != null && pointToPosition != -1) {
                AbstractC0309a.e(selector2, f2, f3);
            }
            B b2 = this.f2842l;
            if (b2 != null) {
                b2.f2834f = false;
            }
            refreshDrawableState();
            if (actionMasked == 1) {
                performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
            }
            z3 = false;
            z2 = true;
            if (z2) {
            }
            this.f2845o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2840j - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z2) {
            }
            return z2;
        }
        z2 = false;
        if (z2) {
        }
        this.f2845o = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f2840j - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2835e;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2847q != null) {
            return;
        }
        super.drawableStateChanged();
        B b2 = this.f2842l;
        if (b2 != null) {
            b2.f2834f = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2845o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2844n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2844n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2844n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2844n && this.f2843m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2847q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2847q == null) {
            F.b bVar = new F.b(5, this);
            this.f2847q = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f2845o && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2840j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        F.b bVar = this.f2847q;
        if (bVar != null) {
            C c2 = (C) bVar.f433f;
            c2.f2847q = null;
            c2.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f2843m = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        B b2 = null;
        if (drawable != null) {
            B b3 = new B();
            Drawable drawable2 = b3.f2833e;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            b3.f2833e = drawable;
            drawable.setCallback(b3);
            b3.f2834f = true;
            b2 = b3;
        }
        this.f2842l = b2;
        super.setSelector(b2);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2836f = rect.left;
        this.f2837g = rect.top;
        this.f2838h = rect.right;
        this.f2839i = rect.bottom;
    }
}
