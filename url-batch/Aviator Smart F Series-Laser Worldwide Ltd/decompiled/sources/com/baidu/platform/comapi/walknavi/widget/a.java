package com.baidu.platform.comapi.walknavi.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.baidu.platform.comapi.walknavi.segmentbrowse.widget.d;
import com.baidu.platform.comapi.walknavi.segmentbrowse.widget.f;

/* loaded from: classes2.dex */
public class a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10349a = "a";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f10350b = true;

    /* renamed from: c, reason: collision with root package name */
    public static int f10351c = 600;

    /* renamed from: d, reason: collision with root package name */
    private Context f10352d;

    /* renamed from: e, reason: collision with root package name */
    private d f10353e;

    /* renamed from: f, reason: collision with root package name */
    private int f10354f;

    /* renamed from: g, reason: collision with root package name */
    private Scroller f10355g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC0131a f10356h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10357i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10358j;

    /* renamed from: k, reason: collision with root package name */
    private int f10359k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10360l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10361m;

    /* renamed from: n, reason: collision with root package name */
    private float f10362n;

    /* renamed from: o, reason: collision with root package name */
    private VelocityTracker f10363o;

    /* renamed from: com.baidu.platform.comapi.walknavi.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0131a {
        void a(String str);
    }

    public a(Context context, int i8) {
        super(context);
        this.f10354f = 0;
        this.f10357i = false;
        this.f10358j = false;
        this.f10359k = 0;
        this.f10360l = false;
        this.f10362n = 0.0f;
        this.f10363o = null;
        this.f10352d = context;
        a(i8);
    }

    public void a(InterfaceC0131a interfaceC0131a) {
        this.f10356h = interfaceC0131a;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f10355g.computeScrollOffset()) {
            scrollTo(this.f10355g.getCurrX(), this.f10355g.getCurrY());
            postInvalidate();
            return;
        }
        if (this.f10357i) {
            this.f10357i = false;
            InterfaceC0131a interfaceC0131a = this.f10356h;
            if (interfaceC0131a != null) {
                interfaceC0131a.a("next");
            }
        }
        if (this.f10358j) {
            this.f10358j = false;
            InterfaceC0131a interfaceC0131a2 = this.f10356h;
            if (interfaceC0131a2 != null) {
                interfaceC0131a2.a("last");
            }
        }
        f10350b = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        this.f10360l = true;
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f10360l = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        ((d) getChildAt(0)).layout(0, 0, this.f10354f, this.f10359k);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (com.baidu.platform.comapi.h.c.b().d()) {
            return false;
        }
        if (this.f10363o == null) {
            this.f10363o = VelocityTracker.obtain();
        }
        this.f10363o.addMovement(motionEvent);
        float x7 = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            Scroller scroller = this.f10355g;
            if (scroller != null && !scroller.isFinished()) {
                this.f10355g.abortAnimation();
            }
            this.f10362n = x7;
        } else if (action == 1) {
            VelocityTracker velocityTracker = this.f10363o;
            velocityTracker.computeCurrentVelocity(1000);
            f10350b = false;
            int xVelocity = (int) velocityTracker.getXVelocity();
            if (xVelocity > f10351c) {
                this.f10361m = true;
                if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.u()) {
                    this.f10361m = false;
                }
                if (this.f10361m) {
                    this.f10358j = true;
                    this.f10355g.startScroll(getScrollX(), 0, (-com.baidu.platform.comapi.walknavi.i.c.i()) - getScrollX(), 0, 1000);
                    invalidate();
                }
            } else if (xVelocity < 0) {
                this.f10361m = true;
                if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
                    this.f10361m = false;
                }
                if (this.f10361m) {
                    this.f10357i = true;
                    this.f10355g.startScroll(getScrollX(), 0, this.f10354f - getScrollX(), 0, 500);
                    invalidate();
                }
            }
            VelocityTracker velocityTracker2 = this.f10363o;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f10363o = null;
            }
        } else if (action == 2) {
            int i8 = (int) (this.f10362n - x7);
            this.f10361m = true;
            if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.u() && i8 < 0) {
                this.f10361m = false;
            }
            if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h() && i8 > 0) {
                this.f10361m = false;
            }
            if (this.f10361m) {
                scrollBy(1, 0);
                this.f10362n = x7;
            }
        }
        return false;
    }

    public boolean a() {
        return this.f10360l;
    }

    public void a(int i8) {
        this.f10355g = new Scroller(this.f10352d);
        this.f10354f = com.baidu.platform.comapi.walknavi.i.c.f();
        f.a().a(this.f10354f);
        this.f10359k = com.baidu.platform.comapi.walknavi.segmentbrowse.widget.b.a(this.f10352d, 95.0f);
        d dVar = new d(this.f10352d, com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g()), this.f10354f);
        this.f10353e = dVar;
        addView(dVar);
    }

    public void a(String str) {
        ((d) getChildAt(0)).a(com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g()), str);
    }
}
