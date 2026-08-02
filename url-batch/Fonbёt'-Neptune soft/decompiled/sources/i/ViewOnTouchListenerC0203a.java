package i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j.C;
import j.C0230f;
import j.C0231g;
import j.C0232h;
import j.C0233i;
import j.E;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0203a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f2359a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2360b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2361c;

    /* renamed from: d, reason: collision with root package name */
    public final View f2362d;

    /* renamed from: e, reason: collision with root package name */
    public E f2363e;

    /* renamed from: f, reason: collision with root package name */
    public E f2364f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2365g;

    /* renamed from: h, reason: collision with root package name */
    public int f2366h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2367i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2368j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2369k;

    public ViewOnTouchListenerC0203a(View view) {
        this.f2367i = new int[2];
        this.f2362d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2359a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2360b = tapTimeout;
        this.f2361c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        E e2 = this.f2364f;
        View view = this.f2362d;
        if (e2 != null) {
            view.removeCallbacks(e2);
        }
        E e3 = this.f2363e;
        if (e3 != null) {
            view.removeCallbacks(e3);
        }
    }

    public final AbstractC0213k b() {
        C0230f c0230f;
        switch (this.f2368j) {
            case 0:
                AbstractC0204b abstractC0204b = ((ActionMenuItemView) this.f2369k).f1340n;
                if (abstractC0204b == null || (c0230f = ((C0231g) abstractC0204b).f2942a.f2982w) == null) {
                    return null;
                }
                return c0230f.a();
            default:
                C0230f c0230f2 = ((C0232h) this.f2369k).f2948g.v;
                if (c0230f2 == null) {
                    return null;
                }
                return c0230f2.a();
        }
    }

    public final boolean c() {
        AbstractC0213k b2;
        switch (this.f2368j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2369k;
                InterfaceC0210h interfaceC0210h = actionMenuItemView.f1338l;
                return interfaceC0210h != null && interfaceC0210h.a(actionMenuItemView.f1335i) && (b2 = b()) != null && b2.i();
            default:
                ((C0232h) this.f2369k).f2948g.j();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        C c2;
        boolean z4 = this.f2365g;
        View view2 = this.f2362d;
        if (z4) {
            AbstractC0213k b2 = b();
            if (b2 != null && b2.i() && (c2 = (C) b2.j()) != null && c2.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2367i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = c2.b(this.f2366h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b3) {
                }
            }
            switch (this.f2368j) {
                case 1:
                    C0233i c0233i = ((C0232h) this.f2369k).f2948g;
                    if (c0233i.f2983x == null) {
                        c0233i.i();
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                default:
                    AbstractC0213k b4 = b();
                    if (b4 != null && b4.i()) {
                        b4.dismiss();
                    }
                    z3 = true;
                    break;
            }
            if (z3) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f2366h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f2359a;
                                float f3 = -f2;
                                if (x2 < f3 || y2 < f3 || x2 >= (view2.getRight() - view2.getLeft()) + f2 || y2 >= (view2.getBottom() - view2.getTop()) + f2) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z2 = true;
                                        if (z2) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f2366h = motionEvent.getPointerId(0);
                    if (this.f2363e == null) {
                        this.f2363e = new E(this, 0);
                    }
                    view2.postDelayed(this.f2363e, this.f2360b);
                    if (this.f2364f == null) {
                        this.f2364f = new E(this, 1);
                    }
                    view2.postDelayed(this.f2364f, this.f2361c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f2365g = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2365g = false;
        this.f2366h = -1;
        E e2 = this.f2363e;
        if (e2 != null) {
            this.f2362d.removeCallbacks(e2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0203a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f2368j = 0;
        this.f2369k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0203a(C0232h c0232h, C0232h c0232h2) {
        this(c0232h2);
        this.f2368j = 1;
        this.f2369k = c0232h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
