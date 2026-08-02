package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.B;
import l.C1084f;
import l.C1085g;
import l.C1086h;
import l.C1087i;
import l.D;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1056a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f9549a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9550b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9551c;

    /* renamed from: d, reason: collision with root package name */
    public final View f9552d;

    /* renamed from: e, reason: collision with root package name */
    public D f9553e;
    public D f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9554g;

    /* renamed from: h, reason: collision with root package name */
    public int f9555h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f9556i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9557j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f9558k;

    public ViewOnTouchListenerC1056a(View view) {
        this.f9556i = new int[2];
        this.f9552d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9549a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f9550b = tapTimeout;
        this.f9551c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        D d3 = this.f;
        View view = this.f9552d;
        if (d3 != null) {
            view.removeCallbacks(d3);
        }
        D d4 = this.f9553e;
        if (d4 != null) {
            view.removeCallbacks(d4);
        }
    }

    public final AbstractC1067l b() {
        C1084f c1084f;
        switch (this.f9557j) {
            case 0:
                AbstractC1057b abstractC1057b = ((ActionMenuItemView) this.f9558k).f1971j;
                if (abstractC1057b == null || (c1084f = ((C1085g) abstractC1057b).f9809a.f9833s) == null) {
                    return null;
                }
                return c1084f.a();
            default:
                C1084f c1084f2 = ((C1086h) this.f9558k).f9810c.f9832r;
                if (c1084f2 == null) {
                    return null;
                }
                return c1084f2.a();
        }
    }

    public final boolean c() {
        AbstractC1067l b3;
        switch (this.f9557j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f9558k;
                InterfaceC1064i interfaceC1064i = actionMenuItemView.f1969h;
                return interfaceC1064i != null && interfaceC1064i.a(actionMenuItemView.f1967e) && (b3 = b()) != null && b3.k();
            default:
                ((C1086h) this.f9558k).f9810c.k();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        B b3;
        boolean z3 = this.f9554g;
        View view2 = this.f9552d;
        if (z3) {
            AbstractC1067l b4 = b();
            if (b4 != null && b4.k() && (b3 = (B) b4.g()) != null && b3.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f9556i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                b3.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b5 = b3.b(this.f9555h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b5) {
                }
            }
            switch (this.f9557j) {
                case 1:
                    C1087i c1087i = ((C1086h) this.f9558k).f9810c;
                    if (c1087i.f9834t == null) {
                        c1087i.g();
                        z2 = true;
                        break;
                    } else {
                        z2 = false;
                        break;
                    }
                default:
                    AbstractC1067l b6 = b();
                    if (b6 != null && b6.k()) {
                        b6.dismiss();
                    }
                    z2 = true;
                    break;
            }
            if (z2) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f9555h);
                            if (findPointerIndex >= 0) {
                                float x3 = motionEvent.getX(findPointerIndex);
                                float y3 = motionEvent.getY(findPointerIndex);
                                float f = this.f9549a;
                                float f3 = -f;
                                if (x3 < f3 || y3 < f3 || x3 >= (view2.getRight() - view2.getLeft()) + f || y3 >= (view2.getBottom() - view2.getTop()) + f) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z = true;
                                        if (z) {
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
                    this.f9555h = motionEvent.getPointerId(0);
                    if (this.f9553e == null) {
                        this.f9553e = new D(this, 0);
                    }
                    view2.postDelayed(this.f9553e, this.f9550b);
                    if (this.f == null) {
                        this.f = new D(this, 1);
                    }
                    view2.postDelayed(this.f, this.f9551c);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.f9554g = z;
        return z || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9554g = false;
        this.f9555h = -1;
        D d3 = this.f9553e;
        if (d3 != null) {
            this.f9552d.removeCallbacks(d3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1056a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f9557j = 0;
        this.f9558k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1056a(C1086h c1086h, C1086h c1086h2) {
        this(c1086h2);
        this.f9557j = 1;
        this.f9558k = c1086h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
