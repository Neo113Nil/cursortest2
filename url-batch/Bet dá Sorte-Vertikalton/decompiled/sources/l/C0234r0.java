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
import com.glasspulse.glasspulse.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: l.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0234r0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3019a;

    /* renamed from: b, reason: collision with root package name */
    public int f3020b;

    /* renamed from: c, reason: collision with root package name */
    public int f3021c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3022e;

    /* renamed from: f, reason: collision with root package name */
    public int f3023f;

    /* renamed from: g, reason: collision with root package name */
    public C0230p0 f3024g;
    public boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3025j;

    /* renamed from: k, reason: collision with root package name */
    public Q.g f3026k;

    /* renamed from: l, reason: collision with root package name */
    public P0.A f3027l;

    public C0234r0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f3019a = new Rect();
        this.f3020b = 0;
        this.f3021c = 0;
        this.d = 0;
        this.f3022e = 0;
        this.i = z2;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z2;
        boolean z3;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                    if (z2 || z4) {
                        this.f3025j = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f3023f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z2) {
                        Q.g gVar = this.f3026k;
                        if (gVar != null) {
                            if (gVar.f723p) {
                                gVar.d();
                            }
                            gVar.f723p = false;
                        }
                    } else {
                        if (this.f3026k == null) {
                            this.f3026k = new Q.g(this);
                        }
                        Q.g gVar2 = this.f3026k;
                        boolean z5 = gVar2.f723p;
                        gVar2.f723p = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z2;
                }
                z2 = false;
                if (z2) {
                }
                this.f3025j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f3023f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z2) {
                }
                return z2;
            }
            z2 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y2);
            if (pointToPosition == -1) {
                z4 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = x2;
                float f3 = y2;
                this.f3025j = true;
                int i2 = Build.VERSION.SDK_INT;
                AbstractC0224m0.a(this, f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f3023f;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f3023f = pointToPosition;
                AbstractC0224m0.a(childAt3, f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z6 = (selector == null || pointToPosition == -1) ? false : true;
                if (z6) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f3019a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f3020b;
                rect.top -= this.f3021c;
                rect.right += this.d;
                rect.bottom += this.f3022e;
                if (i2 >= 33) {
                    z3 = AbstractC0228o0.a(this);
                } else {
                    Field field = AbstractC0232q0.f3015a;
                    if (field != null) {
                        try {
                            z3 = field.getBoolean(this);
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z3 = false;
                }
                if (childAt3.isEnabled() != z3) {
                    boolean z7 = !z3;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0228o0.b(this, z7);
                    } else {
                        Field field2 = AbstractC0232q0.f3015a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z7));
                            } catch (IllegalAccessException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z6) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    D.a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    D.a.e(selector2, f2, f3);
                }
                C0230p0 c0230p0 = this.f3024g;
                if (c0230p0 != null) {
                    c0230p0.f3011b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = true;
                z4 = false;
            }
            if (z2) {
            }
            this.f3025j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3023f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z2) {
            }
            return z2;
        }
        z2 = false;
        if (z2) {
        }
        this.f3025j = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f3023f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3019a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3027l != null) {
            return;
        }
        super.drawableStateChanged();
        C0230p0 c0230p0 = this.f3024g;
        if (c0230p0 != null) {
            c0230p0.f3011b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f3025j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.i && this.h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3027l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3027l == null) {
            P0.A a2 = new P0.A(9, this);
            this.f3027l = a2;
            post(a2);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !AbstractC0226n0.d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0226n0.f2999a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0226n0.f3000b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC0226n0.f3001c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f3025j && isPressed()) {
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
            this.f3023f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        P0.A a2 = this.f3027l;
        if (a2 != null) {
            C0234r0 c0234r0 = (C0234r0) a2.f584b;
            c0234r0.f3027l = null;
            c0234r0.removeCallbacks(a2);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0230p0 c0230p0 = null;
        if (drawable != null) {
            C0230p0 c0230p02 = new C0230p0();
            Drawable drawable2 = c0230p02.f3010a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0230p02.f3010a = drawable;
            drawable.setCallback(c0230p02);
            c0230p02.f3011b = true;
            c0230p0 = c0230p02;
        }
        this.f3024g = c0230p0;
        super.setSelector(c0230p0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3020b = rect.left;
        this.f3021c = rect.top;
        this.d = rect.right;
        this.f3022e = rect.bottom;
    }
}
