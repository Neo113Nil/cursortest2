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
import com.rockchicken.pump.up.road.R;
import java.lang.reflect.Field;

/* renamed from: k.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1239z extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f14124a;

    /* renamed from: b, reason: collision with root package name */
    public int f14125b;

    /* renamed from: c, reason: collision with root package name */
    public int f14126c;

    /* renamed from: d, reason: collision with root package name */
    public int f14127d;

    /* renamed from: e, reason: collision with root package name */
    public int f14128e;

    /* renamed from: f, reason: collision with root package name */
    public int f14129f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f14130g;

    /* renamed from: h, reason: collision with root package name */
    public C1238y f14131h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14132i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14133j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14134k;

    /* renamed from: l, reason: collision with root package name */
    public H.e f14135l;

    /* renamed from: m, reason: collision with root package name */
    public B.b f14136m;

    public AbstractC1239z(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f14124a = new Rect();
        this.f14125b = 0;
        this.f14126c = 0;
        this.f14127d = 0;
        this.f14128e = 0;
        this.f14133j = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f14130g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    public final int a(int i4, int i5) {
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
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i4, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i5) {
                return i5;
            }
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i4) {
        boolean z;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    if (z || z4) {
                        this.f14134k = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f14129f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z) {
                        H.e eVar = this.f14135l;
                        if (eVar != null) {
                            if (eVar.f1073p) {
                                eVar.d();
                            }
                            eVar.f1073p = false;
                        }
                    } else {
                        if (this.f14135l == null) {
                            this.f14135l = new H.e(this);
                        }
                        H.e eVar2 = this.f14135l;
                        boolean z5 = eVar2.f1073p;
                        eVar2.f1073p = true;
                        eVar2.onTouch(this, motionEvent);
                    }
                    return z;
                }
                z = false;
                if (z) {
                }
                this.f14134k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f14129f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z) {
                }
                return z;
            }
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        if (findPointerIndex >= 0) {
            int x4 = (int) motionEvent.getX(findPointerIndex);
            int y4 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x4, y4);
            if (pointToPosition == -1) {
                z4 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f4 = x4;
                float f5 = y4;
                this.f14134k = true;
                drawableHotspotChanged(f4, f5);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i5 = this.f14129f;
                if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f14129f = pointToPosition;
                childAt3.drawableHotspotChanged(f4 - childAt3.getLeft(), f5 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z6 = (selector == null || pointToPosition == -1) ? false : true;
                if (z6) {
                    selector.setVisible(false, false);
                }
                Field field = this.f14130g;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f14124a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f14125b;
                rect.top -= this.f14126c;
                rect.right += this.f14127d;
                rect.bottom += this.f14128e;
                try {
                    boolean z7 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z7) {
                        field.set(this, Boolean.valueOf(!z7));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
                if (z6) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f4, f5);
                }
                C1238y c1238y = this.f14131h;
                if (c1238y != null) {
                    c1238y.f14123b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = true;
                z4 = false;
            }
            if (z) {
            }
            this.f14134k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f14129f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z) {
            }
            return z;
        }
        z = false;
        if (z) {
        }
        this.f14134k = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f14129f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f14124a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f14136m != null) {
            return;
        }
        super.drawableStateChanged();
        C1238y c1238y = this.f14131h;
        if (c1238y != null) {
            c1238y.f14123b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f14134k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f14133j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f14133j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f14133j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f14133j && this.f14132i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f14136m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f14136m == null) {
            B.b bVar = new B.b(13, this);
            this.f14136m = bVar;
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
            if (selector != null && this.f14134k && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f14129f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        B.b bVar = this.f14136m;
        if (bVar != null) {
            AbstractC1239z abstractC1239z = (AbstractC1239z) bVar.f149b;
            abstractC1239z.f14136m = null;
            abstractC1239z.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f14132i = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1238y c1238y = null;
        if (drawable != null) {
            C1238y c1238y2 = new C1238y();
            Drawable drawable2 = c1238y2.f14122a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1238y2.f14122a = drawable;
            drawable.setCallback(c1238y2);
            c1238y2.f14123b = true;
            c1238y = c1238y2;
        }
        this.f14131h = c1238y;
        super.setSelector(c1238y);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f14125b = rect.left;
        this.f14126c = rect.top;
        this.f14127d = rect.right;
        this.f14128e = rect.bottom;
    }
}
