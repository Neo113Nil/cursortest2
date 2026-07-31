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
import com.snovikpovik.vuevnxsj.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class x0 extends ListView {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4441d;

    /* renamed from: e, reason: collision with root package name */
    public int f4442e;

    /* renamed from: f, reason: collision with root package name */
    public int f4443f;

    /* renamed from: g, reason: collision with root package name */
    public int f4444g;

    /* renamed from: h, reason: collision with root package name */
    public int f4445h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public v0 f4446j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4447k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4448l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4449m;

    /* renamed from: n, reason: collision with root package name */
    public u3.d f4450n;

    /* renamed from: o, reason: collision with root package name */
    public h4.b f4451o;

    public x0(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4441d = new Rect();
        this.f4442e = 0;
        this.f4443f = 0;
        this.f4444g = 0;
        this.f4445h = 0;
        this.f4448l = z3;
        setCacheColorHint(0);
    }

    public final int a(int i, int i8) {
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
            view.measure(i, i12 > 0 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z3;
        boolean z7;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z8 = false;
        if (actionMasked == 1) {
            z3 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z3 = true;
                    if (z3 || z8) {
                        this.f4449m = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.i - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z3) {
                        u3.d dVar = this.f4450n;
                        if (dVar != null) {
                            if (dVar.f7372s) {
                                dVar.d();
                            }
                            dVar.f7372s = false;
                        }
                    } else {
                        if (this.f4450n == null) {
                            this.f4450n = new u3.d(this);
                        }
                        u3.d dVar2 = this.f4450n;
                        boolean z9 = dVar2.f7372s;
                        dVar2.f7372s = true;
                        dVar2.onTouch(this, motionEvent);
                    }
                    return z3;
                }
                z3 = false;
                if (z3) {
                }
                this.f4449m = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.i - getFirstVisiblePosition());
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
            int x7 = (int) motionEvent.getX(findPointerIndex);
            int y7 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x7, y7);
            if (pointToPosition == -1) {
                z8 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f6 = x7;
                float f8 = y7;
                this.f4449m = true;
                int i8 = Build.VERSION.SDK_INT;
                s0.a(this, f6, f8);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i9 = this.i;
                if (i9 != -1 && (childAt = getChildAt(i9 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.i = pointToPosition;
                s0.a(childAt3, f6 - childAt3.getLeft(), f8 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z10 = (selector == null || pointToPosition == -1) ? false : true;
                if (z10) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f4441d;
                rect.set(left, top, right, bottom);
                rect.left -= this.f4442e;
                rect.top -= this.f4443f;
                rect.right += this.f4444g;
                rect.bottom += this.f4445h;
                if (i8 >= 33) {
                    z7 = u0.a(this);
                } else {
                    Field field = w0.f4436a;
                    if (field != null) {
                        try {
                            z7 = field.getBoolean(this);
                        } catch (IllegalAccessException e8) {
                            e8.printStackTrace();
                        }
                    }
                    z7 = false;
                }
                if (childAt3.isEnabled() != z7) {
                    boolean z11 = !z7;
                    if (Build.VERSION.SDK_INT >= 33) {
                        u0.b(this, z11);
                    } else {
                        Field field2 = w0.f4436a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z11));
                            } catch (IllegalAccessException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z10) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f6, f8);
                }
                v0 v0Var = this.f4446j;
                if (v0Var != null) {
                    v0Var.f4425e = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = true;
                z8 = false;
            }
            if (z3) {
            }
            this.f4449m = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.i - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z3) {
            }
            return z3;
        }
        z3 = false;
        if (z3) {
        }
        this.f4449m = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.i - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z3) {
        }
        return z3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4441d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4451o != null) {
            return;
        }
        super.drawableStateChanged();
        v0 v0Var = this.f4446j;
        if (v0Var != null) {
            v0Var.f4425e = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4449m && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f4448l || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f4448l || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f4448l || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f4448l && this.f4447k) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4451o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4451o == null) {
            h4.b bVar = new h4.b(3, this);
            this.f4451o = bVar;
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
                if (i < 30 || !t0.f4416d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        t0.f4413a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        t0.f4414b.invoke(this, Integer.valueOf(pointToPosition));
                        t0.f4415c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e8) {
                        e8.printStackTrace();
                    } catch (InvocationTargetException e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f4449m && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        h4.b bVar = this.f4451o;
        if (bVar != null) {
            x0 x0Var = (x0) bVar.f3169e;
            x0Var.f4451o = null;
            x0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f4447k = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        v0 v0Var = null;
        if (drawable != null) {
            v0 v0Var2 = new v0();
            Drawable drawable2 = v0Var2.f4424d;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            v0Var2.f4424d = drawable;
            drawable.setCallback(v0Var2);
            v0Var2.f4425e = true;
            v0Var = v0Var2;
        }
        this.f4446j = v0Var;
        super.setSelector(v0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4442e = rect.left;
        this.f4443f = rect.top;
        this.f4444g = rect.right;
        this.f4445h = rect.bottom;
    }
}
