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
import com.google.android.apps.authenticator2.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jp extends ListView {
    public boolean a;
    public bo b;
    private final Rect c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private jn i;
    private final boolean j;
    private boolean k;
    private abe l;

    public jp(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.c = new Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.j = z;
        setCacheColorHint(0);
    }

    private final void c(boolean z) {
        jn jnVar = this.i;
        if (jnVar != null) {
            jnVar.a = z;
        }
    }

    private final void d() {
        Drawable selector = getSelector();
        if (selector != null && this.k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z5 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    if (z || z5) {
                        this.k = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.h - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    abe abeVar = this.l;
                    if (!z) {
                        if (abeVar == null) {
                            abeVar = new abe(this);
                            this.l = abeVar;
                        }
                        abeVar.c(true);
                        this.l.onTouch(this, motionEvent);
                    } else if (abeVar != null) {
                        abeVar.c(false);
                    }
                    return z;
                }
                z = false;
                if (z) {
                }
                this.k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.h - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                abe abeVar2 = this.l;
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
            if (pointToPosition == -1) {
                z5 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.k = true;
                drawableHotspotChanged(f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.h;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.h = pointToPosition;
                childAt3.drawableHotspotChanged(f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector == null) {
                    z2 = false;
                } else if (pointToPosition != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                    pointToPosition = -1;
                }
                int i3 = pointToPosition;
                if (z2) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.c;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.d;
                rect.top -= this.e;
                rect.right += this.f;
                rect.bottom += this.g;
                if (Build.VERSION.SDK_INT >= 33) {
                    z3 = isSelectedChildViewEnabled();
                } else {
                    Field field = jo.a;
                    if (field != null) {
                        try {
                            z3 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    z3 = false;
                }
                if (childAt3.isEnabled() != z3) {
                    boolean z6 = !z3;
                    if (Build.VERSION.SDK_INT >= 33) {
                        setSelectedChildViewEnabled(z6);
                    } else {
                        Field field2 = jo.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (i3 != -1) {
                        refreshDrawableState();
                    }
                }
                if (z2) {
                    Rect rect2 = this.c;
                    float exactCenterX = rect2.exactCenterX();
                    float exactCenterY = rect2.exactCenterY();
                    z4 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                } else {
                    z4 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                c(z4);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = true;
                z5 = false;
            }
            if (z) {
            }
            this.k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.h - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            abe abeVar22 = this.l;
            if (!z) {
            }
            return z;
        }
        z = false;
        if (z) {
        }
        this.k = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.h - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        abe abeVar222 = this.l;
        if (!z) {
        }
        return z;
    }

    public final int b(int i, int i2) {
        int listPaddingTop = getListPaddingTop() + getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        int i4 = 0;
        View view = null;
        while (i3 < count) {
            int itemViewType = adapter.getItemViewType(i3);
            int i5 = itemViewType != i4 ? itemViewType : i4;
            if (itemViewType != i4) {
                view = null;
            }
            view = adapter.getView(i3, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i3 > 0) {
                listPaddingTop += dividerHeight;
            }
            listPaddingTop += view.getMeasuredHeight();
            if (listPaddingTop >= i2) {
                return i2;
            }
            i3++;
            i4 = i5;
        }
        return listPaddingTop;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.c;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.b != null) {
            return;
        }
        super.drawableStateChanged();
        c(true);
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.j && this.a) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.b == null) {
                bo boVar = new bo(this, 9, null);
                this.b = boVar;
                ((jp) boVar.a).post(boVar);
            }
            actionMasked = 10;
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
                if (Build.VERSION.SDK_INT < 30 || !jm.d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        Method method = jm.a;
                        Integer valueOf = Integer.valueOf(pointToPosition);
                        method.invoke(this, valueOf, childAt, false, -1, -1);
                        jm.b.invoke(this, valueOf);
                        jm.c.invoke(this, valueOf);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            d();
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        bo boVar = this.b;
        if (boVar != null) {
            jp jpVar = (jp) boVar.a;
            jpVar.b = null;
            jpVar.removeCallbacks(boVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(Drawable drawable) {
        jn jnVar = drawable != null ? new jn(drawable) : null;
        this.i = jnVar;
        super.setSelector(jnVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
