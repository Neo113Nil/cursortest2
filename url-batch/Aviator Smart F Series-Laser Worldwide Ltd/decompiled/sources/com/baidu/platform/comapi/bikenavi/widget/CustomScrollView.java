package com.baidu.platform.comapi.bikenavi.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.baidu.baidumapsdk_api.R;
import com.baidu.platform.comapi.h.t.h;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public class CustomScrollView extends ScrollView {
    public static final Object TAG = new Object();

    /* renamed from: a, reason: collision with root package name */
    private VelocityTracker f8795a;

    /* renamed from: b, reason: collision with root package name */
    private int f8796b;
    public int bottom;

    /* renamed from: c, reason: collision with root package name */
    private int f8797c;

    /* renamed from: d, reason: collision with root package name */
    private c f8798d;

    /* renamed from: e, reason: collision with root package name */
    private c f8799e;

    /* renamed from: f, reason: collision with root package name */
    private GestureDetector f8800f;

    /* renamed from: g, reason: collision with root package name */
    private GestureDetector f8801g;

    /* renamed from: h, reason: collision with root package name */
    private int f8802h;

    /* renamed from: i, reason: collision with root package name */
    private int f8803i;

    /* renamed from: j, reason: collision with root package name */
    private LinearLayout f8804j;

    /* renamed from: k, reason: collision with root package name */
    private View f8805k;

    /* renamed from: l, reason: collision with root package name */
    private LinearLayout f8806l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8807m;

    /* renamed from: n, reason: collision with root package name */
    private com.baidu.platform.comapi.h.s.c f8808n;
    protected Field scrollerField;
    public int top;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8809a;

        static {
            int[] iArr = new int[com.baidu.platform.comapi.h.s.c.values().length];
            f8809a = iArr;
            try {
                iArr[com.baidu.platform.comapi.h.s.c.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8809a[com.baidu.platform.comapi.h.s.c.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
            return f9 > 0.0f;
        }
    }

    public interface c {
        void a(int i8);

        void a(com.baidu.platform.comapi.h.s.c cVar, com.baidu.platform.comapi.h.s.c cVar2);
    }

    class d extends GestureDetector.SimpleOnGestureListener {
        d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
            return Math.abs(f9) > Math.abs(f8);
        }
    }

    public CustomScrollView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        setTag(TAG);
        this.f8800f = new GestureDetector(context, new d());
        this.f8801g = new GestureDetector(context, new b());
        setFadingEdgeLength(0);
        setVerticalScrollBarEnabled(false);
        this.top = h.b(context) - h.d(context);
        this.bottom = 0;
        this.f8797c = 3;
        com.baidu.platform.comapi.h.t.p.a.a((Activity) getContext(), R.layout.wsdk_layout_custom_scroll_view, this);
        this.f8804j = (LinearLayout) findViewById(R.id.ll_blank);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_content);
        this.f8806l = linearLayout;
        linearLayout.setMinimumHeight(this.top);
    }

    public static Field getDeclaredField(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void addContentView(View view) {
        this.f8806l.addView(view);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected int computeVerticalScrollRange() {
        int computeVerticalScrollRange = super.computeVerticalScrollRange();
        this.f8802h = computeVerticalScrollRange;
        return computeVerticalScrollRange;
    }

    public com.baidu.platform.comapi.h.s.c getStatus() {
        return this.f8808n;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a();
        }
        return super.onInterceptTouchEvent(motionEvent) && this.f8800f.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        if (z7) {
            this.f8803i = i11 - i9;
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i8, int i9, int i10, int i11) {
        c cVar = this.f8798d;
        if (cVar != null) {
            cVar.a(i9);
        }
        c cVar2 = this.f8799e;
        if (cVar2 != null) {
            cVar2.a(i9);
        }
        boolean z7 = this.f8802h - this.f8803i == i9;
        if (i9 == 0 || z7) {
            try {
                if (this.scrollerField == null) {
                    this.scrollerField = getDeclaredField(this, "mScroller");
                }
                Object obj = this.scrollerField.get(this);
                if (obj != null && (obj instanceof Scroller)) {
                    ((Scroller) obj).abortAnimation();
                }
                return;
            } catch (Exception unused) {
            }
        }
        super.onScrollChanged(i8, i9, i10, i11);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewConfiguration.get(getContext());
        this.f8796b = ViewConfiguration.getMaximumFlingVelocity();
        View view = this.f8805k;
        if (view != null && a(motionEvent, view) && this.f8808n == com.baidu.platform.comapi.h.s.c.BOTTOM) {
            return false;
        }
        a(motionEvent);
        if (motionEvent.getAction() == 1) {
            VelocityTracker velocityTracker = this.f8795a;
            velocityTracker.computeCurrentVelocity(1000, this.f8796b);
            com.baidu.platform.comapi.h.s.c a8 = a((int) velocityTracker.getYVelocity(), getScrollY());
            if (a8 != com.baidu.platform.comapi.h.s.c.NULL) {
                updateStatus(a8, true);
                return true;
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void removeContentView(View view) {
        LinearLayout linearLayout = this.f8806l;
        if (linearLayout != null) {
            linearLayout.removeView(view);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 == null || !((view2 instanceof WebView) || (view2 instanceof ListView) || (view2 instanceof ScrollView))) {
            super.requestChildFocus(view, view2);
        }
    }

    public void setBlankHeight(int i8) {
        this.f8804j.removeAllViews();
        this.f8805k = new View(getContext());
        this.f8805k.setLayoutParams(new AbsListView.LayoutParams(0, i8));
        this.f8804j.addView(this.f8805k);
    }

    public void setCustomOnScrollChangeListener(c cVar) {
        this.f8799e = cVar;
    }

    public void setOnScrollChangeListener(c cVar) {
        this.f8798d = cVar;
    }

    public void setStatusHeight(int i8, int i9) {
        this.f8806l.setMinimumHeight(i8);
        this.top = i8;
        this.bottom = i9;
        this.f8797c = 3;
    }

    public void updateStatus(com.baidu.platform.comapi.h.s.c cVar, boolean z7) {
        c cVar2 = this.f8798d;
        if (cVar2 != null) {
            cVar2.a(this.f8808n, cVar);
        }
        c cVar3 = this.f8799e;
        if (cVar3 != null) {
            cVar3.a(this.f8808n, cVar);
        }
        this.f8808n = cVar;
        int i8 = a.f8809a[cVar.ordinal()];
        if (i8 == 1) {
            if (z7) {
                smoothScrollTo(0, this.bottom);
                return;
            } else {
                scrollTo(0, this.bottom);
                return;
            }
        }
        if (i8 != 2) {
            return;
        }
        if (z7) {
            smoothScrollTo(0, this.top);
        } else {
            scrollTo(0, this.top);
        }
    }

    public CustomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8802h = 0;
        this.f8803i = 0;
        this.f8807m = false;
        this.f8808n = com.baidu.platform.comapi.h.s.c.BOTTOM;
        a(context);
    }

    public CustomScrollView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f8802h = 0;
        this.f8803i = 0;
        this.f8807m = false;
        this.f8808n = com.baidu.platform.comapi.h.s.c.BOTTOM;
        a(context);
    }

    private com.baidu.platform.comapi.h.s.c a(int i8, int i9) {
        int i10 = a.f8809a[this.f8808n.ordinal()];
        if (i10 == 1) {
            if ((i8 < 0 && Math.abs(i8) > 1000) || i9 > this.f8797c) {
                return com.baidu.platform.comapi.h.s.c.TOP;
            }
            return com.baidu.platform.comapi.h.s.c.BOTTOM;
        }
        if (i10 != 2) {
            return com.baidu.platform.comapi.h.s.c.BOTTOM;
        }
        if (i8 > 1000 || i9 < this.f8797c) {
            return com.baidu.platform.comapi.h.s.c.BOTTOM;
        }
        if (i9 > this.top) {
            return com.baidu.platform.comapi.h.s.c.NULL;
        }
        return com.baidu.platform.comapi.h.s.c.TOP;
    }

    private void a(MotionEvent motionEvent) {
        if (this.f8795a == null) {
            this.f8795a = VelocityTracker.obtain();
        }
        this.f8795a.addMovement(motionEvent);
    }

    private boolean a(MotionEvent motionEvent, View view) {
        boolean a8 = a(motionEvent.getY(), view);
        if (motionEvent.getAction() == 0) {
            if (a8) {
                this.f8807m = true;
            } else {
                this.f8807m = false;
            }
        }
        if (motionEvent.getAction() == 1) {
            this.f8807m = false;
        }
        return this.f8807m && a8 && motionEvent.getAction() != 1;
    }

    private boolean a(float f8, View view) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        return f8 > ((float) rect.top) && f8 < ((float) (rect.bottom - getScrollY()));
    }

    private void a() {
        try {
            if (this.scrollerField == null) {
                this.scrollerField = getDeclaredField(this, "mScroller");
            }
            Object obj = this.scrollerField.get(this);
            if (obj == null) {
                return;
            }
            obj.getClass().getMethod("abortAnimation", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
        }
    }
}
