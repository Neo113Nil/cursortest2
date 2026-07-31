package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.C1301k0;
import e.AbstractC2405a;
import g.AbstractC2424a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class G extends ListView {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f10662a;

    /* renamed from: b, reason: collision with root package name */
    private int f10663b;

    /* renamed from: c, reason: collision with root package name */
    private int f10664c;

    /* renamed from: d, reason: collision with root package name */
    private int f10665d;

    /* renamed from: e, reason: collision with root package name */
    private int f10666e;

    /* renamed from: f, reason: collision with root package name */
    private int f10667f;

    /* renamed from: g, reason: collision with root package name */
    private d f10668g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10669h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10670i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10671j;

    /* renamed from: k, reason: collision with root package name */
    private C1301k0 f10672k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.core.widget.h f10673l;

    /* renamed from: m, reason: collision with root package name */
    f f10674m;

    static class a {
        static void a(View view, float f4, float f5) {
            view.drawableHotspotChanged(f4, f5);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f10675a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f10676b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f10677c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f10678d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f10675a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f10676b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f10677c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f10678d = true;
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            }
        }

        static boolean a() {
            return f10678d;
        }

        static void b(G g4, int i4, View view) {
            try {
                f10675a.invoke(g4, Integer.valueOf(i4), view, Boolean.FALSE, -1, -1);
                f10676b.invoke(g4, Integer.valueOf(i4));
                f10677c.invoke(g4, Integer.valueOf(i4));
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z4) {
            absListView.setSelectedChildViewEnabled(z4);
        }
    }

    private static class d extends AbstractC2424a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f10679b;

        d(Drawable drawable) {
            super(drawable);
            this.f10679b = true;
        }

        void b(boolean z4) {
            this.f10679b = z4;
        }

        @Override // g.AbstractC2424a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f10679b) {
                super.draw(canvas);
            }
        }

        @Override // g.AbstractC2424a, android.graphics.drawable.Drawable
        public void setHotspot(float f4, float f5) {
            if (this.f10679b) {
                super.setHotspot(f4, f5);
            }
        }

        @Override // g.AbstractC2424a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i4, int i5, int i6, int i7) {
            if (this.f10679b) {
                super.setHotspotBounds(i4, i5, i6, i7);
            }
        }

        @Override // g.AbstractC2424a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f10679b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // g.AbstractC2424a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z4, boolean z5) {
            if (this.f10679b) {
                return super.setVisible(z4, z5);
            }
            return false;
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f10680a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                e4.printStackTrace();
            }
            f10680a = field;
        }

        static boolean a(AbsListView absListView) {
            Field field = f10680a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z4) {
            Field field = f10680a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z4));
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            G g4 = G.this;
            g4.f10674m = null;
            g4.removeCallbacks(this);
        }

        public void b() {
            G.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            G g4 = G.this;
            g4.f10674m = null;
            g4.drawableStateChanged();
        }
    }

    G(Context context, boolean z4) {
        super(context, null, AbstractC2405a.f36210x);
        this.f10662a = new Rect();
        this.f10663b = 0;
        this.f10664c = 0;
        this.f10665d = 0;
        this.f10666e = 0;
        this.f10670i = z4;
        setCacheColorHint(0);
    }

    private void a() {
        this.f10671j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f10667f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C1301k0 c1301k0 = this.f10672k;
        if (c1301k0 != null) {
            c1301k0.c();
            this.f10672k = null;
        }
    }

    private void b(View view, int i4) {
        performItemClick(view, i4, getItemIdAtPosition(i4));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f10662a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f10662a);
        selector.draw(canvas);
    }

    private void f(int i4, View view) {
        Rect rect = this.f10662a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f10663b;
        rect.top -= this.f10664c;
        rect.right += this.f10665d;
        rect.bottom += this.f10666e;
        boolean k4 = k();
        if (view.isEnabled() != k4) {
            l(!k4);
            if (i4 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i4, View view) {
        Drawable selector = getSelector();
        boolean z4 = (selector == null || i4 == -1) ? false : true;
        if (z4) {
            selector.setVisible(false, false);
        }
        f(i4, view);
        if (z4) {
            Rect rect = this.f10662a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.e(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i4, View view, float f4, float f5) {
        g(i4, view);
        Drawable selector = getSelector();
        if (selector == null || i4 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.e(selector, f4, f5);
    }

    private void i(View view, int i4, float f4, float f5) {
        View childAt;
        this.f10671j = true;
        a.a(this, f4, f5);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i5 = this.f10667f;
        if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f10667f = i4;
        a.a(view, f4 - view.getLeft(), f5 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i4, view, f4, f5);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z4) {
        d dVar = this.f10668g;
        if (dVar != null) {
            dVar.b(z4);
        }
    }

    private boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void l(boolean z4) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z4);
        } else {
            e.b(this, z4);
        }
    }

    private boolean m() {
        return this.f10671j;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i4, int i5, int i6, int i7, int i8) {
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
        int i11 = 0;
        int i12 = 0;
        View view = null;
        while (i10 < count) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i4, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i10 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i7) {
                return (i8 < 0 || i10 <= i8 || i12 <= 0 || i9 == i7) ? i7 : i12;
            }
            if (i8 >= 0 && i10 >= i8) {
                i12 = i9;
            }
            i10++;
        }
        return i9;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f10674m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(MotionEvent motionEvent, int i4) {
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z4 = false;
        } else if (actionMasked == 2) {
            z4 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        if (findPointerIndex >= 0) {
            int x4 = (int) motionEvent.getX(findPointerIndex);
            int y4 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x4, y4);
            if (pointToPosition == -1) {
                z5 = true;
                if (z4 || z5) {
                    a();
                }
                if (!z4) {
                    androidx.core.widget.h hVar = this.f10673l;
                    if (hVar != null) {
                        hVar.m(false);
                    }
                    return z4;
                }
                if (this.f10673l == null) {
                    this.f10673l = new androidx.core.widget.h(this);
                }
                this.f10673l.m(true);
                this.f10673l.onTouch(this, motionEvent);
                return z4;
            }
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            i(childAt, pointToPosition, x4, y4);
            if (actionMasked == 1) {
                b(childAt, pointToPosition);
            }
            z4 = true;
            z5 = false;
            if (z4) {
            }
            a();
            if (!z4) {
            }
        }
        z5 = false;
        z4 = false;
        if (z4) {
        }
        a();
        if (!z4) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f10670i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f10670i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f10670i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f10670i && this.f10669h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f10674m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f10674m == null) {
            f fVar = new f();
            this.f10674m = fVar;
            fVar.b();
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
                if (i4 < 30 || !b.a()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, pointToPosition, childAt);
                }
            }
            n();
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f10667f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f10674m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z4) {
        this.f10669h = z4;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f10668g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f10663b = rect.left;
        this.f10664c = rect.top;
        this.f10665d = rect.right;
        this.f10666e = rect.bottom;
    }
}
