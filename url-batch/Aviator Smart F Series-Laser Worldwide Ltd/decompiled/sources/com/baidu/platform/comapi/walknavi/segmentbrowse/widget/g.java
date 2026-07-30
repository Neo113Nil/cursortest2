package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class g extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private static String f10308a = "MultiViewGroup";

    /* renamed from: b, reason: collision with root package name */
    public static int f10309b = 20;

    /* renamed from: c, reason: collision with root package name */
    private Context f10310c;

    /* renamed from: d, reason: collision with root package name */
    private int f10311d;

    /* renamed from: e, reason: collision with root package name */
    private Scroller f10312e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<View> f10313f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<Integer> f10314g;

    /* renamed from: h, reason: collision with root package name */
    private int f10315h;

    /* renamed from: i, reason: collision with root package name */
    private int f10316i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10317j;

    /* renamed from: k, reason: collision with root package name */
    private int f10318k;

    /* renamed from: l, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.k.b f10319l;

    /* renamed from: m, reason: collision with root package name */
    private a f10320m;

    /* renamed from: n, reason: collision with root package name */
    private int f10321n;

    /* renamed from: o, reason: collision with root package name */
    private int f10322o;

    /* renamed from: p, reason: collision with root package name */
    private float f10323p;

    /* renamed from: q, reason: collision with root package name */
    private float f10324q;

    /* renamed from: r, reason: collision with root package name */
    private VelocityTracker f10325r;

    /* renamed from: s, reason: collision with root package name */
    private int f10326s;

    public interface a {
        void a();
    }

    public g(Context context, com.baidu.platform.comapi.walknavi.k.b bVar) {
        super(context);
        this.f10311d = 0;
        this.f10312e = null;
        this.f10313f = new ArrayList<>();
        this.f10314g = new ArrayList<>();
        this.f10315h = 60;
        this.f10316i = 0;
        this.f10317j = true;
        this.f10318k = 0;
        this.f10321n = 0;
        this.f10322o = 0;
        this.f10323p = 0.0f;
        this.f10324q = 0.0f;
        this.f10325r = null;
        this.f10326s = 0;
        this.f10310c = context;
        this.f10319l = bVar;
        a();
    }

    private d a(d dVar, com.baidu.platform.comapi.walknavi.i.a aVar) {
        return dVar;
    }

    public void b() {
        if (com.baidu.platform.comapi.walknavi.b.n().H() instanceof com.baidu.platform.comapi.walknavi.k.b) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        com.baidu.platform.comapi.h.g.a.c(f10308a, "computeScroll");
        if (!this.f10312e.computeScrollOffset()) {
            a aVar = this.f10320m;
            if (aVar != null) {
                aVar.a();
            }
            this.f10317j = true;
            return;
        }
        com.baidu.platform.comapi.h.g.a.c(f10308a, this.f10312e.getCurrX() + "======" + this.f10312e.getCurrY());
        scrollTo(this.f10312e.getCurrX(), this.f10312e.getCurrY());
        com.baidu.platform.comapi.h.g.a.c(f10308a, "### getleft is " + getLeft() + " ### getRight is " + getRight());
        postInvalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.baidu.platform.comapi.h.g.a.c(f10308a, "onInterceptTouchEvent-slop:" + this.f10322o);
        int action = motionEvent.getAction();
        if (action == 2 && this.f10321n != 0) {
            return true;
        }
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    com.baidu.platform.comapi.h.g.a.c(f10308a, "onInterceptTouchEvent move");
                    if (((int) Math.abs(this.f10323p - x7)) > this.f10322o) {
                        this.f10321n = 1;
                    }
                }
            }
            com.baidu.platform.comapi.h.g.a.c(f10308a, "onInterceptTouchEvent up or cancel");
            this.f10321n = 0;
        } else {
            com.baidu.platform.comapi.h.g.a.c(f10308a, "onInterceptTouchEvent down");
            this.f10323p = x7;
            this.f10324q = y7;
            com.baidu.platform.comapi.h.g.a.c(f10308a, this.f10312e.isFinished() + "");
            this.f10321n = !this.f10312e.isFinished() ? 1 : 0;
        }
        com.baidu.platform.comapi.h.g.a.c(f10308a, this.f10321n + "====0");
        return this.f10321n != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        com.baidu.platform.comapi.h.g.a.c(f10308a, "--- start onLayout --");
        com.baidu.platform.comapi.h.g.a.c("view count onlayout", getChildCount() + "child count");
        int childCount = getChildCount();
        com.baidu.platform.comapi.h.g.a.c(f10308a, "--- onLayout childCount is -->" + childCount);
        if (childCount == 2) {
            if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
                View view = this.f10313f.get(0);
                if (view.getVisibility() != 8 && com.baidu.platform.comapi.walknavi.i.c.i() != -1) {
                    int i12 = this.f10316i;
                    view.layout(i12, 0, com.baidu.platform.comapi.walknavi.i.c.i() + i12, this.f10318k);
                }
                View view2 = this.f10313f.get(1);
                if (view2.getVisibility() != 8 && com.baidu.platform.comapi.walknavi.i.c.i() != -1 && com.baidu.platform.comapi.walknavi.i.c.c() != -1) {
                    view2.layout(this.f10316i + com.baidu.platform.comapi.walknavi.i.c.i(), 0, this.f10316i + com.baidu.platform.comapi.walknavi.i.c.i() + com.baidu.platform.comapi.walknavi.i.c.c(), this.f10318k);
                }
            } else {
                View view3 = this.f10313f.get(0);
                if (view3.getVisibility() != 8 && com.baidu.platform.comapi.walknavi.i.c.c() != -1) {
                    int i13 = this.f10316i;
                    view3.layout(i13, 0, com.baidu.platform.comapi.walknavi.i.c.c() + i13, this.f10318k);
                }
                View view4 = this.f10313f.get(1);
                if (view4.getVisibility() != 8) {
                    view4.layout(this.f10316i + com.baidu.platform.comapi.walknavi.i.c.c(), 0, this.f10316i + com.baidu.platform.comapi.walknavi.i.c.c() + com.baidu.platform.comapi.walknavi.i.c.o(), this.f10318k);
                }
            }
        }
        if (childCount == 3) {
            View view5 = this.f10313f.get(0);
            if (view5.getVisibility() != 8 && com.baidu.platform.comapi.walknavi.i.c.i() != -1) {
                int i14 = this.f10316i;
                view5.layout(i14, 0, com.baidu.platform.comapi.walknavi.i.c.i() + i14, this.f10318k);
            }
            com.baidu.platform.comapi.h.g.a.c("aaa", "0**" + view5.getLeft() + "**" + view5.getRight());
            View view6 = this.f10313f.get(1);
            if (view6.getVisibility() != 8) {
                view6.layout(this.f10316i + com.baidu.platform.comapi.walknavi.i.c.i(), 0, this.f10316i + com.baidu.platform.comapi.walknavi.i.c.i() + com.baidu.platform.comapi.walknavi.i.c.c(), this.f10318k);
            }
            com.baidu.platform.comapi.h.g.a.c("aaa", "1**" + view6.getLeft() + "**" + view6.getRight());
            View view7 = this.f10313f.get(2);
            if (view7.getVisibility() != 8) {
                view7.layout(this.f10316i + com.baidu.platform.comapi.walknavi.i.c.i() + com.baidu.platform.comapi.walknavi.i.c.c(), 0, this.f10316i + com.baidu.platform.comapi.walknavi.i.c.i() + com.baidu.platform.comapi.walknavi.i.c.c() + com.baidu.platform.comapi.walknavi.i.c.o(), this.f10318k);
            }
            com.baidu.platform.comapi.h.g.a.c("aaa", "2**" + view7.getLeft() + "**" + view7.getRight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        com.baidu.platform.comapi.h.g.a.c(f10308a, "--- start onMeasure --");
        setMeasuredDimension(View.MeasureSpec.getSize(i8), View.MeasureSpec.getSize(i9));
        int childCount = getChildCount();
        com.baidu.platform.comapi.h.g.a.c(f10308a, "--- onMeasure childCount is -->" + childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).measure(getWidth(), 200);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.baidu.platform.comapi.h.g.a.c(f10308a, "--- onTouchEvent--> ");
        com.baidu.platform.comapi.h.g.a.c(f10308a, "onTouchEvent start");
        if (this.f10325r == null) {
            com.baidu.platform.comapi.h.g.a.c(f10308a, "onTouchEvent start-------** VelocityTracker.obtain");
            this.f10325r = VelocityTracker.obtain();
        }
        this.f10325r.addMovement(motionEvent);
        super.onTouchEvent(motionEvent);
        float x7 = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z7 = true;
            if (action == 1) {
                if (com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.REFRESH_GUIDANCE || com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.GUIDING) {
                    com.baidu.platform.comapi.h.q.a.a().a("FootNaviPG.segment");
                    com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.b.GUIDING_TO_SEGMENTBROWSE);
                    com.baidu.platform.comapi.walknavi.b.n().s().u();
                    com.baidu.platform.comapi.walknavi.b.n().l().run("强诱导转到分段");
                }
                if (this.f10317j) {
                    VelocityTracker velocityTracker = this.f10325r;
                    velocityTracker.computeCurrentVelocity(1000);
                    int xVelocity = (int) velocityTracker.getXVelocity();
                    com.baidu.platform.comapi.h.g.a.c(f10308a, "---velocityX---" + xVelocity);
                    int i8 = f10309b;
                    if (xVelocity > i8) {
                        com.baidu.platform.comapi.h.g.a.c(f10308a, "snap left");
                        if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.u()) {
                            com.baidu.platform.comapi.h.g.a.c("yang13", "该点是起点，不能左滑");
                        } else {
                            a(this.f10311d - 1);
                        }
                    } else if (xVelocity < (-i8)) {
                        com.baidu.platform.comapi.h.g.a.c(f10308a, "snap right");
                        if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
                            com.baidu.platform.comapi.h.g.a.c("yang13", "该点是终点，不能右滑");
                        } else {
                            a(this.f10311d + 1);
                        }
                    }
                    VelocityTracker velocityTracker2 = this.f10325r;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.f10325r = null;
                    }
                    this.f10321n = 0;
                }
            } else if (action != 2) {
                if (action == 3) {
                    this.f10321n = 0;
                }
            } else if (this.f10317j) {
                int i9 = (int) (this.f10323p - x7);
                if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.u() && i9 < 0) {
                    z7 = false;
                }
                if ((com.baidu.platform.comapi.walknavi.i.c.g() != com.baidu.platform.comapi.walknavi.i.c.h() || i9 <= 0) && z7) {
                    com.baidu.platform.comapi.h.g.a.c(f10308a, "--- MotionEvent.ACTION_MOVE--> detaX is " + i9);
                    this.f10323p = x7;
                }
            }
        } else if (this.f10317j) {
            Scroller scroller = this.f10312e;
            if (scroller != null && !scroller.isFinished()) {
                this.f10312e.abortAnimation();
            }
            this.f10323p = x7;
        }
        return false;
    }

    public void setScrollListener(a aVar) {
        this.f10320m = aVar;
    }

    public void a(int i8) {
        int i9;
        int scrollX;
        com.baidu.platform.comapi.walknavi.k.d.a aVar;
        int i10 = this.f10311d;
        boolean z7 = i10 != i8;
        boolean z8 = i10 <= i8;
        this.f10311d = i8;
        com.baidu.platform.comapi.h.g.a.c("tag", "curscreen" + this.f10311d);
        com.baidu.platform.comapi.walknavi.i.c.c(this.f10311d);
        com.baidu.platform.comapi.walknavi.i.c.e(this.f10311d);
        b();
        com.baidu.platform.comapi.walknavi.i.a a8 = com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g());
        if (a8 != null && !TextUtils.isEmpty(a8.d()) && !TextUtils.isEmpty(a8.a())) {
            com.baidu.platform.comapi.h.g.a.c("tag", "xxx floor:" + a8.d());
            com.baidu.platform.comapi.h.t.e.a(a8.d(), a8.a(), false);
            if ((com.baidu.platform.comapi.walknavi.b.n().H() instanceof com.baidu.platform.comapi.walknavi.k.b) && (aVar = ((com.baidu.platform.comapi.walknavi.k.b) com.baidu.platform.comapi.walknavi.b.n().H()).C) != null) {
                aVar.a(a8.d());
            }
        }
        if (com.baidu.platform.comapi.walknavi.b.n().H() != null) {
            com.baidu.platform.comapi.walknavi.b.n().H().b();
        }
        if (z7) {
            if (z8) {
                if (this.f10311d == 1) {
                    d dVar = new d(this.f10310c, com.baidu.platform.comapi.walknavi.i.c.a(this.f10311d + 1), -1);
                    dVar.setTag(Integer.valueOf(this.f10311d + 1));
                    d a9 = a(dVar, com.baidu.platform.comapi.walknavi.i.c.p());
                    addView(a9);
                    this.f10313f.add(a9);
                }
                if (this.f10311d >= 2) {
                    this.f10316i += com.baidu.platform.comapi.walknavi.i.c.l();
                    removeView(this.f10313f.get(0));
                    this.f10313f.remove(0);
                    com.baidu.platform.comapi.h.g.a.c("curscreen", "curscreen" + this.f10311d);
                    if (this.f10311d < com.baidu.platform.comapi.walknavi.i.c.h()) {
                        d dVar2 = new d(this.f10310c, com.baidu.platform.comapi.walknavi.i.c.a(this.f10311d + 1), -1);
                        dVar2.setTag(Integer.valueOf(this.f10311d + 1));
                        d a10 = a(dVar2, com.baidu.platform.comapi.walknavi.i.c.p());
                        addView(a10);
                        this.f10313f.add(a10);
                    }
                }
            } else {
                if (this.f10311d >= 1) {
                    this.f10316i -= com.baidu.platform.comapi.walknavi.i.c.i();
                    if (getChildCount() == 3) {
                        removeView(this.f10313f.get(2));
                        this.f10313f.remove(2);
                        d dVar3 = new d(this.f10310c, com.baidu.platform.comapi.walknavi.i.c.a(this.f10311d - 1), -1);
                        dVar3.setTag(Integer.valueOf(this.f10311d - 1));
                        d a11 = a(dVar3, com.baidu.platform.comapi.walknavi.i.c.j());
                        addView(a11);
                        this.f10313f.add(0, a11);
                    } else if (getChildCount() == 2) {
                        d dVar4 = new d(this.f10310c, com.baidu.platform.comapi.walknavi.i.c.a(this.f10311d - 1), -1);
                        dVar4.setTag(Integer.valueOf(this.f10311d - 1));
                        d a12 = a(dVar4, com.baidu.platform.comapi.walknavi.i.c.j());
                        addView(a12);
                        this.f10313f.add(0, a12);
                    }
                }
                if (this.f10311d == 0 && getChildCount() == 3) {
                    removeView(this.f10313f.get(2));
                    this.f10313f.remove(2);
                }
            }
        }
        if (z7) {
            if (z8) {
                i9 = this.f10316i + com.baidu.platform.comapi.walknavi.i.c.i();
                scrollX = getScrollX();
            } else if (this.f10311d == 0) {
                i9 = this.f10316i;
                scrollX = getScrollX();
            } else {
                i9 = this.f10316i + com.baidu.platform.comapi.walknavi.i.c.i();
                scrollX = getScrollX();
            }
            int i11 = i9 - scrollX;
            com.baidu.platform.comapi.h.g.a.c("aaa", "dx******************" + i11);
            this.f10312e.startScroll(getScrollX(), 0, i11, 0, Math.abs(i11));
            this.f10317j = false;
        }
        invalidate();
    }

    private void a() {
        com.baidu.platform.comapi.walknavi.b.n().H().b();
        this.f10312e = new Scroller(this.f10310c);
        this.f10318k = b.a(this.f10310c, 95.0f);
        if (com.baidu.platform.comapi.walknavi.i.c.g() != 0) {
            d dVar = new d(this.f10310c, com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g() - 1), -1);
            dVar.setTag(Integer.valueOf(com.baidu.platform.comapi.walknavi.i.c.g() - 1));
            this.f10313f.add(a(dVar, com.baidu.platform.comapi.walknavi.i.c.j()));
            this.f10316i = 0 - com.baidu.platform.comapi.walknavi.i.c.i();
            this.f10311d = com.baidu.platform.comapi.walknavi.i.c.g();
        }
        d dVar2 = new d(this.f10310c, com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g()), -1);
        dVar2.setTag(Integer.valueOf(com.baidu.platform.comapi.walknavi.i.c.g()));
        this.f10313f.add(a(dVar2, com.baidu.platform.comapi.walknavi.i.c.d()));
        com.baidu.platform.comapi.walknavi.i.c.e(com.baidu.platform.comapi.walknavi.i.c.g());
        if (com.baidu.platform.comapi.walknavi.i.c.g() != com.baidu.platform.comapi.walknavi.i.c.h()) {
            d dVar3 = new d(this.f10310c, com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g() + 1), -1);
            dVar3.setTag(Integer.valueOf(com.baidu.platform.comapi.walknavi.i.c.g() + 1));
            this.f10313f.add(a(dVar3, com.baidu.platform.comapi.walknavi.i.c.p()));
        }
        for (int i8 = 0; i8 < this.f10313f.size(); i8++) {
            addView(this.f10313f.get(i8));
        }
        this.f10322o = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
