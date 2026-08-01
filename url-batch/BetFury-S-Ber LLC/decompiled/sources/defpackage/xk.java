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
import com.trembin.nirefon.betfury.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class xk extends ListView {
    public final Rect f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public vk l;
    public boolean m;
    public final boolean n;
    public boolean o;
    public py p;
    public v7 q;

    public xk(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f = new Rect();
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.n = z;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z3 = false;
                    if (z || z3) {
                        this.o = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.k - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    py pyVar = this.p;
                    if (!z) {
                        if (pyVar == null) {
                            this.p = new py(this);
                        }
                        py pyVar2 = this.p;
                        boolean z4 = pyVar2.u;
                        pyVar2.u = true;
                        pyVar2.onTouch(this, motionEvent);
                    } else if (pyVar != null) {
                        if (pyVar.u) {
                            pyVar.d();
                        }
                        pyVar.u = false;
                    }
                    return z;
                }
                z = false;
                z3 = false;
                if (z) {
                }
                this.o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.k - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                py pyVar3 = this.p;
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
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.o = true;
                sk.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.k;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.k = pointToPosition;
                sk.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || pointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f;
                rect.set(left, top, right, bottom);
                rect.left -= this.g;
                rect.top -= this.h;
                rect.right += this.i;
                rect.bottom += this.j;
                if (Build.VERSION.SDK_INT >= 33) {
                    z2 = uk.a(this);
                } else {
                    Field field = wk.a;
                    if (field != null) {
                        try {
                            z2 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    z2 = false;
                }
                if (childAt3.isEnabled() != z2) {
                    boolean z6 = !z2;
                    if (Build.VERSION.SDK_INT >= 33) {
                        uk.b(this, z6);
                    } else {
                        Field field2 = wk.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                vk vkVar = this.l;
                if (vkVar != null) {
                    vkVar.g = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = false;
                z = true;
            }
            if (z) {
            }
            this.o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.k - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            py pyVar32 = this.p;
            if (!z) {
            }
            return z;
        }
        z = false;
        z3 = false;
        if (z) {
        }
        this.o = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.k - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        py pyVar322 = this.p;
        if (!z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.q != null) {
            return;
        }
        super.drawableStateChanged();
        vk vkVar = this.l;
        if (vkVar != null) {
            vkVar.g = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.n && this.m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.q == null) {
            v7 v7Var = new v7(4, this);
            this.q = v7Var;
            post(v7Var);
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
                if (Build.VERSION.SDK_INT < 30 || !tk.d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        tk.a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        tk.b.invoke(this, Integer.valueOf(pointToPosition));
                        tk.c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        v7 v7Var = this.q;
        if (v7Var != null) {
            xk xkVar = (xk) v7Var.g;
            xkVar.q = null;
            xkVar.removeCallbacks(v7Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.m = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        vk vkVar = null;
        if (drawable != null) {
            vk vkVar2 = new vk();
            Drawable drawable2 = vkVar2.f;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            vkVar2.f = drawable;
            drawable.setCallback(vkVar2);
            vkVar2.g = true;
            vkVar = vkVar2;
        }
        this.l = vkVar;
        super.setSelector(vkVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.g = rect.left;
        this.h = rect.top;
        this.i = rect.right;
        this.j = rect.bottom;
    }
}
