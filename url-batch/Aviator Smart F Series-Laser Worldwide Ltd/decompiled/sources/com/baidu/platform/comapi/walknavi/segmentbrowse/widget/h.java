package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.arthenica.ffmpegkit.x;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class h extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public static int f10327a = 600;

    /* renamed from: b, reason: collision with root package name */
    private Context f10328b;

    /* renamed from: c, reason: collision with root package name */
    private d f10329c;

    /* renamed from: d, reason: collision with root package name */
    private d f10330d;

    /* renamed from: e, reason: collision with root package name */
    private d f10331e;

    /* renamed from: f, reason: collision with root package name */
    private int f10332f;

    /* renamed from: g, reason: collision with root package name */
    private Scroller f10333g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10334h;

    /* renamed from: i, reason: collision with root package name */
    private a f10335i;

    /* renamed from: j, reason: collision with root package name */
    private int f10336j;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<d> f10337k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10338l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10339m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f10340n;

    /* renamed from: o, reason: collision with root package name */
    private int f10341o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10342p;

    /* renamed from: q, reason: collision with root package name */
    private int f10343q;

    /* renamed from: r, reason: collision with root package name */
    private float f10344r;

    /* renamed from: s, reason: collision with root package name */
    private VelocityTracker f10345s;

    public interface a {
        void a(String str);
    }

    private void b() {
        if (this.f10334h) {
            com.baidu.platform.comapi.h.g.a.c("on layout false", x.KEY_WIDTH + this.f10332f);
            if (getChildCount() != 2) {
                this.f10337k.get(0).layout(-com.baidu.platform.comapi.walknavi.i.c.i(), 0, 0, this.f10341o);
                this.f10337k.get(1).layout(this.f10332f - ((int) (com.baidu.platform.comapi.walknavi.i.c.b() * this.f10336j)), 0, this.f10332f, this.f10341o);
                d dVar = this.f10337k.get(2);
                int i8 = this.f10332f;
                dVar.layout(i8, 0, ((int) (com.baidu.platform.comapi.walknavi.i.c.q() * this.f10336j)) + i8, this.f10341o);
                return;
            }
            com.baidu.platform.comapi.h.g.a.c("getchild cur uid", "uid" + com.baidu.platform.comapi.walknavi.i.c.g());
            if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
                this.f10337k.get(0).layout(-com.baidu.platform.comapi.walknavi.i.c.i(), 0, 0, this.f10341o);
                this.f10337k.get(1).layout(0, 0, com.baidu.platform.comapi.walknavi.i.c.c(), this.f10341o);
                return;
            } else {
                this.f10337k.get(0).layout(this.f10332f - ((int) (com.baidu.platform.comapi.walknavi.i.c.b() * this.f10336j)), 0, this.f10332f, this.f10341o);
                d dVar2 = this.f10337k.get(1);
                int i9 = this.f10332f;
                dVar2.layout(i9, 0, ((int) (com.baidu.platform.comapi.walknavi.i.c.q() * this.f10336j)) + i9, this.f10341o);
                return;
            }
        }
        if (getChildCount() != 2) {
            this.f10337k.get(0).layout(-com.baidu.platform.comapi.walknavi.i.c.i(), 0, 0, this.f10341o);
            if (this.f10332f == com.baidu.platform.comapi.walknavi.i.c.c()) {
                this.f10337k.get(1).layout(0, 0, this.f10332f, this.f10341o);
            } else {
                com.baidu.platform.comapi.h.g.a.c("on layout true", x.KEY_WIDTH + this.f10332f);
                this.f10337k.get(1).layout(0, 0, this.f10332f, this.f10341o);
            }
            d dVar3 = this.f10337k.get(2);
            int i10 = this.f10332f;
            dVar3.layout(i10, 0, ((int) (com.baidu.platform.comapi.walknavi.i.c.q() * this.f10336j)) + i10, this.f10341o);
            return;
        }
        if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
            this.f10337k.get(0).layout(-com.baidu.platform.comapi.walknavi.i.c.i(), 0, 0, this.f10341o);
            this.f10337k.get(1).layout(0, 0, this.f10332f, this.f10341o);
            return;
        }
        if (this.f10332f == com.baidu.platform.comapi.walknavi.i.c.c()) {
            this.f10337k.get(0).layout(0, 0, this.f10332f, this.f10341o);
        } else {
            com.baidu.platform.comapi.h.g.a.c("on layout true", x.KEY_WIDTH + this.f10332f);
            this.f10337k.get(0).layout(0, 0, this.f10332f, this.f10341o);
        }
        d dVar4 = this.f10337k.get(1);
        int i11 = this.f10332f;
        dVar4.layout(i11, 0, ((int) (com.baidu.platform.comapi.walknavi.i.c.q() * this.f10336j)) + i11, this.f10341o);
    }

    public void a() {
        d dVar = this.f10329c;
        if (dVar != null) {
            dVar.a();
        }
        d dVar2 = this.f10330d;
        if (dVar2 != null) {
            dVar2.a();
        }
        d dVar3 = this.f10331e;
        if (dVar3 != null) {
            dVar3.a();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        com.baidu.platform.comapi.h.g.a.c("TextViewOne", "computeScroll--->" + this.f10333g.computeScrollOffset());
        if (this.f10333g.computeScrollOffset()) {
            com.baidu.platform.comapi.h.g.a.c("TextViewOne", this.f10333g.getCurrX() + "======" + this.f10333g.getCurrY());
            scrollTo(this.f10333g.getCurrX(), this.f10333g.getCurrY());
            postInvalidate();
            return;
        }
        com.baidu.platform.comapi.h.g.a.c("TextViewOne", "istime:isGoToNext:" + this.f10338l + "isGoToLast:" + this.f10339m);
        if (this.f10338l) {
            this.f10338l = false;
            this.f10335i.a("next");
        }
        if (this.f10339m) {
            this.f10339m = false;
            this.f10335i.a("last");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        if (this.f10334h) {
            com.baidu.platform.comapi.h.g.a.c("on layout false", x.KEY_WIDTH + this.f10332f);
            if (getChildCount() != 2) {
                this.f10337k.get(0).layout(-com.baidu.platform.comapi.walknavi.i.c.i(), 0, 0, this.f10341o);
                this.f10337k.get(1).layout(this.f10332f - ((int) (com.baidu.platform.comapi.walknavi.i.c.b() * this.f10336j)), 0, this.f10332f, this.f10341o);
                d dVar = this.f10337k.get(2);
                int i12 = this.f10332f;
                dVar.layout(i12, 0, ((int) (com.baidu.platform.comapi.walknavi.i.c.q() * this.f10336j)) + i12, this.f10341o);
                return;
            }
            com.baidu.platform.comapi.h.g.a.c("getchild cur uid", "uid" + com.baidu.platform.comapi.walknavi.i.c.g());
            if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
                this.f10337k.get(0).layout(-com.baidu.platform.comapi.walknavi.i.c.i(), 0, 0, this.f10341o);
                this.f10337k.get(1).layout(0, 0, com.baidu.platform.comapi.walknavi.i.c.c(), this.f10341o);
                return;
            } else {
                this.f10337k.get(0).layout(this.f10332f - ((int) (com.baidu.platform.comapi.walknavi.i.c.b() * this.f10336j)), 0, this.f10332f, this.f10341o);
                d dVar2 = this.f10337k.get(1);
                int i13 = this.f10332f;
                dVar2.layout(i13, 0, ((int) (com.baidu.platform.comapi.walknavi.i.c.q() * this.f10336j)) + i13, this.f10341o);
                return;
            }
        }
        if (getChildCount() != 2) {
            this.f10337k.get(0).layout(-com.baidu.platform.comapi.walknavi.i.c.i(), 0, 0, this.f10341o);
            if (this.f10332f == com.baidu.platform.comapi.walknavi.i.c.c()) {
                this.f10337k.get(1).layout(0, 0, this.f10332f, this.f10341o);
            } else {
                com.baidu.platform.comapi.h.g.a.c("on layout true", x.KEY_WIDTH + this.f10332f);
                this.f10337k.get(1).layout(0, 0, this.f10332f, this.f10341o);
            }
            d dVar3 = this.f10337k.get(2);
            int i14 = this.f10332f;
            dVar3.layout(i14, 0, ((int) (com.baidu.platform.comapi.walknavi.i.c.q() * this.f10336j)) + i14, this.f10341o);
            return;
        }
        if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
            this.f10337k.get(0).layout(-com.baidu.platform.comapi.walknavi.i.c.i(), 0, 0, this.f10341o);
            this.f10337k.get(1).layout(0, 0, this.f10332f, this.f10341o);
            return;
        }
        if (this.f10332f == com.baidu.platform.comapi.walknavi.i.c.c()) {
            this.f10337k.get(0).layout(0, 0, this.f10332f, this.f10341o);
        } else {
            com.baidu.platform.comapi.h.g.a.c("on layout true", x.KEY_WIDTH + this.f10332f);
            this.f10337k.get(0).layout(0, 0, this.f10332f, this.f10341o);
        }
        d dVar4 = this.f10337k.get(1);
        int i15 = this.f10332f;
        dVar4.layout(i15, 0, ((int) (com.baidu.platform.comapi.walknavi.i.c.q() * this.f10336j)) + i15, this.f10341o);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10345s == null) {
            this.f10345s = VelocityTracker.obtain();
        }
        this.f10345s.addMovement(motionEvent);
        float x7 = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            Scroller scroller = this.f10333g;
            if (scroller != null && !scroller.isFinished()) {
                this.f10333g.abortAnimation();
            }
            this.f10344r = x7;
        } else if (action == 1) {
            VelocityTracker velocityTracker = this.f10345s;
            velocityTracker.computeCurrentVelocity(1000);
            int xVelocity = (int) velocityTracker.getXVelocity();
            if (xVelocity > f10327a) {
                com.baidu.platform.comapi.h.g.a.c("TextViewOne", "onTouchEvent width" + this.f10332f);
                this.f10342p = true;
                if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.u()) {
                    this.f10342p = false;
                }
                if (this.f10342p) {
                    this.f10339m = true;
                    int scrollX = (-com.baidu.platform.comapi.walknavi.i.c.i()) - getScrollX();
                    com.baidu.platform.comapi.h.g.a.c("TextViewOne", "onTouchEvent up startScroll---------------");
                    this.f10333g.startScroll(getScrollX(), 0, scrollX, 0, 1000);
                    invalidate();
                }
            } else if (xVelocity < 0) {
                this.f10342p = true;
                if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
                    this.f10342p = false;
                }
                com.baidu.platform.comapi.h.g.a.c("TextViewOne", "onTouchEvent width" + this.f10332f);
                com.baidu.platform.comapi.h.g.a.c("TextViewOne", "onTouchEvent getscrollx" + getScrollX());
                com.baidu.platform.comapi.h.g.a.c("TextViewOne", "onTouchEvent isNeedMove" + this.f10342p);
                if (this.f10342p) {
                    this.f10338l = true;
                    com.baidu.platform.comapi.h.g.a.c("TextViewOne", "onTouchEvent down startScroll---------------");
                    this.f10333g.startScroll(getScrollX(), 0, this.f10332f - getScrollX(), 0, 500);
                    invalidate();
                }
            }
            VelocityTracker velocityTracker2 = this.f10345s;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f10345s = null;
            }
            this.f10343q = 0;
        } else if (action == 2) {
            int i8 = (int) (this.f10344r - x7);
            this.f10342p = true;
            if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.u() && i8 < 0) {
                this.f10342p = false;
            }
            if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h() && i8 > 0) {
                this.f10342p = false;
            }
            if (this.f10342p) {
                scrollBy(1, 0);
                this.f10344r = x7;
            }
        } else if (action == 3) {
            this.f10343q = 0;
        }
        return false;
    }

    public void setGuideText(String str) {
        if (getChildCount() < 2) {
            return;
        }
        if (getChildCount() == 2) {
            if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
                this.f10337k.get(1).a(com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g()), this.f10332f);
            } else {
                this.f10337k.get(0).a(com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g()), this.f10332f);
            }
        }
        if (getChildCount() == 3) {
            if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
                this.f10337k.get(2).a(com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g()), this.f10332f);
            } else {
                this.f10337k.get(1).a(com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.g()), this.f10332f);
            }
        }
    }

    public void setLinearLayoutParam1(int i8) {
        if (this.f10340n) {
            if (i8 == com.baidu.platform.comapi.walknavi.i.c.e() * this.f10336j) {
                if (com.baidu.platform.comapi.walknavi.i.c.g() == com.baidu.platform.comapi.walknavi.i.c.h()) {
                    this.f10340n = false;
                }
                this.f10334h = false;
                if (getChildCount() == 2) {
                    removeViews(0, 1);
                    this.f10337k.remove(0);
                } else {
                    removeViews(0, 2);
                    this.f10337k.remove(0);
                    this.f10337k.remove(0);
                }
                d dVar = new d(this.f10328b, com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.n()), this.f10332f);
                dVar.setTag(Integer.valueOf(com.baidu.platform.comapi.walknavi.i.c.n()));
                addView(dVar);
                this.f10337k.add(0, dVar);
                if (com.baidu.platform.comapi.walknavi.i.c.g() < com.baidu.platform.comapi.walknavi.i.c.h()) {
                    d dVar2 = new d(this.f10328b, com.baidu.platform.comapi.walknavi.i.c.a(com.baidu.platform.comapi.walknavi.i.c.r()), this.f10332f);
                    dVar2.setTag(Integer.valueOf(com.baidu.platform.comapi.walknavi.i.c.r()));
                    addView(dVar2);
                    this.f10337k.add(dVar2);
                }
            }
            if (i8 <= ((int) (com.baidu.platform.comapi.walknavi.i.c.b() * this.f10336j))) {
                this.f10334h = true;
            }
            this.f10332f = i8;
            f.a().a(this.f10332f);
            b();
            invalidate();
        }
    }
}
