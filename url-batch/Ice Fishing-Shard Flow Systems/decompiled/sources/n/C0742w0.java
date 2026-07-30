package n;

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
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: n.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0742w0 extends ListView {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f6929d;

    /* renamed from: e, reason: collision with root package name */
    public int f6930e;

    /* renamed from: i, reason: collision with root package name */
    public int f6931i;

    /* renamed from: l, reason: collision with root package name */
    public int f6932l;

    /* renamed from: m, reason: collision with root package name */
    public int f6933m;

    /* renamed from: n, reason: collision with root package name */
    public int f6934n;

    /* renamed from: o, reason: collision with root package name */
    public C0738u0 f6935o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6936p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6937q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6938r;

    /* renamed from: s, reason: collision with root package name */
    public L.c f6939s;

    /* renamed from: t, reason: collision with root package name */
    public F.b f6940t;

    public C0742w0(Context context, boolean z7) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f6929d = new Rect();
        this.f6930e = 0;
        this.f6931i = 0;
        this.f6932l = 0;
        this.f6933m = 0;
        this.f6937q = z7;
        setCacheColorHint(0);
    }

    public final int a(int i2, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i2, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i5) {
                return i5;
            }
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i2, MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z9 = true;
        if (actionMasked == 1) {
            z7 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z7 = true;
                    z9 = false;
                    if (z7 || z9) {
                        this.f6938r = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f6934n - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z7) {
                        L.c cVar = this.f6939s;
                        if (cVar != null) {
                            if (cVar.f1647x) {
                                cVar.d();
                            }
                            cVar.f1647x = false;
                        }
                    } else {
                        if (this.f6939s == null) {
                            this.f6939s = new L.c(this);
                        }
                        L.c cVar2 = this.f6939s;
                        boolean z10 = cVar2.f1647x;
                        cVar2.f1647x = true;
                        cVar2.onTouch(this, motionEvent);
                    }
                    return z7;
                }
                z9 = false;
                z7 = false;
                if (z7) {
                }
                this.f6938r = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f6934n - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z7) {
                }
                return z7;
            }
            z7 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        if (findPointerIndex >= 0) {
            int x7 = (int) motionEvent.getX(findPointerIndex);
            int y7 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x7, y7);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f7 = x7;
                float f8 = y7;
                this.f6938r = true;
                AbstractC0732r0.a(this, f7, f8);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i5 = this.f6934n;
                if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f6934n = pointToPosition;
                AbstractC0732r0.a(childAt3, f7 - childAt3.getLeft(), f8 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z11 = (selector == null || pointToPosition == -1) ? false : true;
                if (z11) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f6929d;
                rect.set(left, top, right, bottom);
                rect.left -= this.f6930e;
                rect.top -= this.f6931i;
                rect.right += this.f6932l;
                rect.bottom += this.f6933m;
                if (E.c.b()) {
                    z8 = AbstractC0736t0.a(this);
                } else {
                    Field field = AbstractC0740v0.f6913a;
                    if (field != null) {
                        try {
                            z8 = field.getBoolean(this);
                        } catch (IllegalAccessException e7) {
                            e7.printStackTrace();
                        }
                    }
                    z8 = false;
                }
                if (childAt3.isEnabled() != z8) {
                    boolean z12 = !z8;
                    if (E.c.b()) {
                        AbstractC0736t0.b(this, z12);
                    } else {
                        Field field2 = AbstractC0740v0.f6913a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z12));
                            } catch (IllegalAccessException e8) {
                                e8.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z11) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f7, f8);
                }
                C0738u0 c0738u0 = this.f6935o;
                if (c0738u0 != null) {
                    c0738u0.f6908e = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z9 = false;
                z7 = true;
            }
            if (z7) {
            }
            this.f6938r = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f6934n - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z7) {
            }
            return z7;
        }
        z9 = false;
        z7 = false;
        if (z7) {
        }
        this.f6938r = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f6934n - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z7) {
        }
        return z7;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f6929d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f6940t != null) {
            return;
        }
        super.drawableStateChanged();
        C0738u0 c0738u0 = this.f6935o;
        if (c0738u0 != null) {
            c0738u0.f6908e = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f6938r && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f6937q || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f6937q || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f6937q || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f6937q && this.f6936p) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f6940t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f6940t == null) {
            F.b bVar = new F.b(17, this);
            this.f6940t = bVar;
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
                requestFocus();
                if (i2 < 30 || !AbstractC0734s0.f6885d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0734s0.f6882a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0734s0.f6883b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC0734s0.f6884c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (InvocationTargetException e8) {
                        e8.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f6938r && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6934n = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        F.b bVar = this.f6940t;
        if (bVar != null) {
            C0742w0 c0742w0 = (C0742w0) bVar.f718e;
            c0742w0.f6940t = null;
            c0742w0.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z7) {
        this.f6936p = z7;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0738u0 c0738u0 = null;
        if (drawable != null) {
            C0738u0 c0738u02 = new C0738u0();
            Drawable drawable2 = c0738u02.f6907d;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0738u02.f6907d = drawable;
            drawable.setCallback(c0738u02);
            c0738u02.f6908e = true;
            c0738u0 = c0738u02;
        }
        this.f6935o = c0738u0;
        super.setSelector(c0738u0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f6930e = rect.left;
        this.f6931i = rect.top;
        this.f6932l = rect.right;
        this.f6933m = rect.bottom;
    }
}
