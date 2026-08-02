package l;

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
import com.fc.barca.football.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class B extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f9696a;

    /* renamed from: b, reason: collision with root package name */
    public int f9697b;

    /* renamed from: c, reason: collision with root package name */
    public int f9698c;

    /* renamed from: d, reason: collision with root package name */
    public int f9699d;

    /* renamed from: e, reason: collision with root package name */
    public int f9700e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f9701g;

    /* renamed from: h, reason: collision with root package name */
    public A f9702h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9703i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f9704j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9705k;

    /* renamed from: l, reason: collision with root package name */
    public H.e f9706l;

    /* renamed from: m, reason: collision with root package name */
    public B.b f9707m;

    public B(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f9696a = new Rect();
        this.f9697b = 0;
        this.f9698c = 0;
        this.f9699d = 0;
        this.f9700e = 0;
        this.f9704j = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f9701g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
    }

    public final int a(int i3, int i4) {
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
            view.measure(i3, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i3, MotionEvent motionEvent) {
        boolean z;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    if (z || z2) {
                        this.f9705k = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z) {
                        H.e eVar = this.f9706l;
                        if (eVar != null) {
                            if (eVar.f588p) {
                                eVar.d();
                            }
                            eVar.f588p = false;
                        }
                    } else {
                        if (this.f9706l == null) {
                            this.f9706l = new H.e(this);
                        }
                        H.e eVar2 = this.f9706l;
                        boolean z3 = eVar2.f588p;
                        eVar2.f588p = true;
                        eVar2.onTouch(this, motionEvent);
                    }
                    return z;
                }
                z = false;
                if (z) {
                }
                this.f9705k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z) {
                }
                return z;
            }
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i3);
        if (findPointerIndex >= 0) {
            int x3 = (int) motionEvent.getX(findPointerIndex);
            int y3 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x3, y3);
            if (pointToPosition == -1) {
                z2 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x3;
                float f3 = y3;
                this.f9705k = true;
                drawableHotspotChanged(f, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f = pointToPosition;
                childAt3.drawableHotspotChanged(f - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || pointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                Field field = this.f9701g;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f9696a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f9697b;
                rect.top -= this.f9698c;
                rect.right += this.f9699d;
                rect.bottom += this.f9700e;
                try {
                    boolean z5 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z5) {
                        field.set(this, Boolean.valueOf(!z5));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                }
                if (z4) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f3);
                }
                A a3 = this.f9702h;
                if (a3 != null) {
                    a3.f9695b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = false;
                z = true;
            }
            if (z) {
            }
            this.f9705k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z) {
            }
            return z;
        }
        z = false;
        if (z) {
        }
        this.f9705k = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f9696a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f9707m != null) {
            return;
        }
        super.drawableStateChanged();
        A a3 = this.f9702h;
        if (a3 != null) {
            a3.f9695b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f9705k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f9704j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f9704j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f9704j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f9704j && this.f9703i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f9707m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f9707m == null) {
            B.b bVar = new B.b(13, this);
            this.f9707m = bVar;
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
            if (selector != null && this.f9705k && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        B.b bVar = this.f9707m;
        if (bVar != null) {
            B b3 = (B) bVar.f78b;
            b3.f9707m = null;
            b3.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f9703i = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        A a3 = null;
        if (drawable != null) {
            A a4 = new A();
            Drawable drawable2 = a4.f9694a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            a4.f9694a = drawable;
            drawable.setCallback(a4);
            a4.f9695b = true;
            a3 = a4;
        }
        this.f9702h = a3;
        super.setSelector(a3);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9697b = rect.left;
        this.f9698c = rect.top;
        this.f9699d = rect.right;
        this.f9700e = rect.bottom;
    }
}
