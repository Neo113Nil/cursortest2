package g;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import h.AbstractC0141A;
import h.C0153f;
import h.C0154g;
import h.C0155h;
import h.C0156i;
import h.RunnableC0143C;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0129a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f1923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1924b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1925c;

    /* renamed from: d, reason: collision with root package name */
    public final View f1926d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0143C f1927e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0143C f1928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1929g;

    /* renamed from: h, reason: collision with root package name */
    public int f1930h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f1931i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1932j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f1933k;

    public ViewOnTouchListenerC0129a(View view) {
        this.f1931i = new int[2];
        this.f1926d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1923a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1924b = tapTimeout;
        this.f1925c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0143C runnableC0143C = this.f1928f;
        View view = this.f1926d;
        if (runnableC0143C != null) {
            view.removeCallbacks(runnableC0143C);
        }
        RunnableC0143C runnableC0143C2 = this.f1927e;
        if (runnableC0143C2 != null) {
            view.removeCallbacks(runnableC0143C2);
        }
    }

    public final l b() {
        C0153f c0153f;
        switch (this.f1932j) {
            case 0:
                AbstractC0130b abstractC0130b = ((ActionMenuItemView) this.f1933k).f1092n;
                if (abstractC0130b == null || (c0153f = ((C0154g) abstractC0130b).f2190a.f2216w) == null) {
                    return null;
                }
                return c0153f.a();
            default:
                C0153f c0153f2 = ((C0155h) this.f1933k).f2191g.f2215v;
                if (c0153f2 == null) {
                    return null;
                }
                return c0153f2.a();
        }
    }

    public final boolean c() {
        l b2;
        switch (this.f1932j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f1933k;
                i iVar = actionMenuItemView.f1090l;
                return iVar != null && iVar.a(actionMenuItemView.f1087i) && (b2 = b()) != null && b2.c();
            default:
                ((C0155h) this.f1933k).f2191g.g();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r4 != 3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        AbstractC0141A abstractC0141A;
        boolean z4 = this.f1929g;
        View view2 = this.f1926d;
        if (z4) {
            l b2 = b();
            if (b2 != null && b2.c() && (abstractC0141A = (AbstractC0141A) b2.e()) != null && abstractC0141A.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1931i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC0141A.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = abstractC0141A.b(this.f1930h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b3) {
                }
            }
            switch (this.f1932j) {
                case 1:
                    C0156i c0156i = ((C0155h) this.f1933k).f2191g;
                    if (c0156i.f2217x == null) {
                        c0156i.e();
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                default:
                    l b4 = b();
                    if (b4 != null && b4.c()) {
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
                            int findPointerIndex = motionEvent.findPointerIndex(this.f1930h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f1923a;
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
                    this.f1930h = motionEvent.getPointerId(0);
                    if (this.f1927e == null) {
                        this.f1927e = new RunnableC0143C(this, 0);
                    }
                    view2.postDelayed(this.f1927e, this.f1924b);
                    if (this.f1928f == null) {
                        this.f1928f = new RunnableC0143C(this, 1);
                    }
                    view2.postDelayed(this.f1928f, this.f1925c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f1929g = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f1929g = false;
        this.f1930h = -1;
        RunnableC0143C runnableC0143C = this.f1927e;
        if (runnableC0143C != null) {
            this.f1926d.removeCallbacks(runnableC0143C);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0129a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f1932j = 0;
        this.f1933k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC0129a(C0155h c0155h, C0155h c0155h2) {
        this(c0155h2);
        this.f1932j = 1;
        this.f1933k = c0155h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
