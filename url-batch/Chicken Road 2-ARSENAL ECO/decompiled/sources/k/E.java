package k;

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
import com.strategylink.Row.Five.R;
import java.lang.reflect.Field;
import x.AbstractC0723a;

/* loaded from: classes.dex */
public abstract class E extends ListView {

    /* renamed from: f, reason: collision with root package name */
    public final Rect f4897f;

    /* renamed from: g, reason: collision with root package name */
    public int f4898g;

    /* renamed from: h, reason: collision with root package name */
    public int f4899h;

    /* renamed from: i, reason: collision with root package name */
    public int f4900i;

    /* renamed from: j, reason: collision with root package name */
    public int f4901j;

    /* renamed from: k, reason: collision with root package name */
    public int f4902k;

    /* renamed from: l, reason: collision with root package name */
    public final Field f4903l;

    /* renamed from: m, reason: collision with root package name */
    public D f4904m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4905n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4906o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4907p;

    /* renamed from: q, reason: collision with root package name */
    public I.f f4908q;

    /* renamed from: r, reason: collision with root package name */
    public A.b f4909r;

    public E(Context context, boolean z5) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4897f = new Rect();
        this.f4898g = 0;
        this.f4899h = 0;
        this.f4900i = 0;
        this.f4901j = 0;
        this.f4906o = z5;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f4903l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    public final int a(int i7, int i8) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i9 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i10 = 0;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            view.measure(i7, i12 > 0 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i11 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i8) {
                return i8;
            }
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i7, MotionEvent motionEvent) {
        boolean z5;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z6 = false;
        if (actionMasked == 1) {
            z5 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z5 = true;
                    if (z5 || z6) {
                        this.f4907p = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f4902k - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z5) {
                        I.f fVar = this.f4908q;
                        if (fVar != null) {
                            if (fVar.f1150p) {
                                fVar.d();
                            }
                            fVar.f1150p = false;
                        }
                    } else {
                        if (this.f4908q == null) {
                            this.f4908q = new I.f(this);
                        }
                        I.f fVar2 = this.f4908q;
                        boolean z7 = fVar2.f1150p;
                        fVar2.f1150p = true;
                        fVar2.onTouch(this, motionEvent);
                    }
                    return z5;
                }
                z5 = false;
                if (z5) {
                }
                this.f4907p = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f4902k - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z5) {
                }
                return z5;
            }
            z5 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i7);
        if (findPointerIndex >= 0) {
            int x6 = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x6, y);
            if (pointToPosition == -1) {
                z6 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f7 = x6;
                float f8 = y;
                this.f4907p = true;
                drawableHotspotChanged(f7, f8);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i8 = this.f4902k;
                if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f4902k = pointToPosition;
                childAt3.drawableHotspotChanged(f7 - childAt3.getLeft(), f8 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z8 = (selector == null || pointToPosition == -1) ? false : true;
                if (z8) {
                    selector.setVisible(false, false);
                }
                Field field = this.f4903l;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f4897f;
                rect.set(left, top, right, bottom);
                rect.left -= this.f4898g;
                rect.top -= this.f4899h;
                rect.right += this.f4900i;
                rect.bottom += this.f4901j;
                try {
                    boolean z9 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z9) {
                        field.set(this, Boolean.valueOf(!z9));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
                if (z8) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC0723a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    AbstractC0723a.e(selector2, f7, f8);
                }
                D d7 = this.f4904m;
                if (d7 != null) {
                    d7.f4896g = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z6 = false;
                z5 = true;
            }
            if (z5) {
            }
            this.f4907p = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f4902k - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z5) {
            }
            return z5;
        }
        z5 = false;
        if (z5) {
        }
        this.f4907p = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f4902k - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z5) {
        }
        return z5;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4897f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4909r != null) {
            return;
        }
        super.drawableStateChanged();
        D d7 = this.f4904m;
        if (d7 != null) {
            d7.f4896g = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4907p && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f4906o || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f4906o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f4906o || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f4906o && this.f4905n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4909r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4909r == null) {
            A.b bVar = new A.b(14, this);
            this.f4909r = bVar;
            post(bVar);
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
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            Drawable selector = getSelector();
            if (selector != null && this.f4907p && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4902k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        A.b bVar = this.f4909r;
        if (bVar != null) {
            E e4 = (E) bVar.f4g;
            e4.f4909r = null;
            e4.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z5) {
        this.f4905n = z5;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        D d7 = null;
        if (drawable != null) {
            D d8 = new D();
            Drawable drawable2 = d8.f4895f;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            d8.f4895f = drawable;
            drawable.setCallback(d8);
            d8.f4896g = true;
            d7 = d8;
        }
        this.f4904m = d7;
        super.setSelector(d7);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4898g = rect.left;
        this.f4899h = rect.top;
        this.f4900i = rect.right;
        this.f4901j = rect.bottom;
    }
}
