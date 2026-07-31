package h;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import i.AbstractC0147B;
import i.C0159f;
import i.C0160g;
import i.C0161h;
import i.C0162i;
import i.RunnableC0149D;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0134a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f1956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1958c;

    /* renamed from: d, reason: collision with root package name */
    public final View f1959d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0149D f1960e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0149D f1961f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1962g;

    /* renamed from: h, reason: collision with root package name */
    public int f1963h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f1964i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1965j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f1966k;

    public ViewOnTouchListenerC0134a(View view) {
        this.f1964i = new int[2];
        this.f1959d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1956a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1957b = tapTimeout;
        this.f1958c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0149D runnableC0149D = this.f1961f;
        View view = this.f1959d;
        if (runnableC0149D != null) {
            view.removeCallbacks(runnableC0149D);
        }
        RunnableC0149D runnableC0149D2 = this.f1960e;
        if (runnableC0149D2 != null) {
            view.removeCallbacks(runnableC0149D2);
        }
    }

    public final l b() {
        C0159f c0159f;
        switch (this.f1965j) {
            case 0:
                AbstractC0135b abstractC0135b = ((ActionMenuItemView) this.f1966k).f1182n;
                if (abstractC0135b == null || (c0159f = ((C0160g) abstractC0135b).f2218a.f2244w) == null) {
                    return null;
                }
                return c0159f.a();
            default:
                C0159f c0159f2 = ((C0161h) this.f1966k).f2219g.f2243v;
                if (c0159f2 == null) {
                    return null;
                }
                return c0159f2.a();
        }
    }

    public final boolean c() {
        l b2;
        switch (this.f1965j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1966k;
                InterfaceC0142i interfaceC0142i = actionMenuItemView.f1180l;
                return interfaceC0142i != null && interfaceC0142i.a(actionMenuItemView.f1177i) && (b2 = b()) != null && b2.j();
            default:
                ((C0161h) this.f1966k).f2219g.j();
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
        boolean z2;
        boolean z3;
        AbstractC0147B abstractC0147B;
        boolean z4 = this.f1962g;
        View view2 = this.f1959d;
        if (z4) {
            l b2 = b();
            if (b2 != null && b2.j() && (abstractC0147B = (AbstractC0147B) b2.e()) != null && abstractC0147B.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1964i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC0147B.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = abstractC0147B.b(this.f1963h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b3) {
                }
            }
            switch (this.f1965j) {
                case 1:
                    C0162i c0162i = ((C0161h) this.f1966k).f2219g;
                    if (c0162i.f2245x == null) {
                        c0162i.e();
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                default:
                    l b4 = b();
                    if (b4 != null && b4.j()) {
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
                            int findPointerIndex = motionEvent.findPointerIndex(this.f1963h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f1956a;
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
                    this.f1963h = motionEvent.getPointerId(0);
                    if (this.f1960e == null) {
                        this.f1960e = new RunnableC0149D(this, 0);
                    }
                    view2.postDelayed(this.f1960e, this.f1957b);
                    if (this.f1961f == null) {
                        this.f1961f = new RunnableC0149D(this, 1);
                    }
                    view2.postDelayed(this.f1961f, this.f1958c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f1962g = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1962g = false;
        this.f1963h = -1;
        RunnableC0149D runnableC0149D = this.f1960e;
        if (runnableC0149D != null) {
            this.f1959d.removeCallbacks(runnableC0149D);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0134a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f1965j = 0;
        this.f1966k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0134a(C0161h c0161h, C0161h c0161h2) {
        this(c0161h2);
        this.f1965j = 1;
        this.f1966k = c0161h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
