package j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.AbstractC1239z;
import k.C1212f;
import k.C1214g;
import k.C1216h;
import k.C1218i;
import k.RunnableC1178B;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1168a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f13598a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13599b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13600c;

    /* renamed from: d, reason: collision with root package name */
    public final View f13601d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC1178B f13602e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC1178B f13603f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13604g;

    /* renamed from: h, reason: collision with root package name */
    public int f13605h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f13606i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f13607j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f13608k;

    public ViewOnTouchListenerC1168a(View view) {
        this.f13606i = new int[2];
        this.f13601d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f13598a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f13599b = tapTimeout;
        this.f13600c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC1178B runnableC1178B = this.f13603f;
        View view = this.f13601d;
        if (runnableC1178B != null) {
            view.removeCallbacks(runnableC1178B);
        }
        RunnableC1178B runnableC1178B2 = this.f13602e;
        if (runnableC1178B2 != null) {
            view.removeCallbacks(runnableC1178B2);
        }
    }

    public final l b() {
        C1212f c1212f;
        switch (this.f13607j) {
            case 0:
                AbstractC1169b abstractC1169b = ((ActionMenuItemView) this.f13608k).f4301j;
                if (abstractC1169b == null || (c1212f = ((C1214g) abstractC1169b).f14009a.f14028s) == null) {
                    return null;
                }
                return c1212f.a();
            default:
                C1212f c1212f2 = ((C1216h) this.f13608k).f14011c.f14027r;
                if (c1212f2 == null) {
                    return null;
                }
                return c1212f2.a();
        }
    }

    public final boolean c() {
        l b4;
        switch (this.f13607j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f13608k;
                i iVar = actionMenuItemView.f4299h;
                return iVar != null && iVar.a(actionMenuItemView.f4296e) && (b4 = b()) != null && b4.c();
            default:
                ((C1216h) this.f13608k).f14011c.k();
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
        boolean z4;
        AbstractC1239z abstractC1239z;
        boolean z5 = this.f13604g;
        View view2 = this.f13601d;
        if (z5) {
            l b4 = b();
            if (b4 != null && b4.c() && (abstractC1239z = (AbstractC1239z) b4.h()) != null && abstractC1239z.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f13606i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC1239z.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b5 = abstractC1239z.b(obtainNoHistory, this.f13605h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z6 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b5) {
                }
            }
            switch (this.f13607j) {
                case 1:
                    C1218i c1218i = ((C1216h) this.f13608k).f14011c;
                    if (c1218i.f14029t == null) {
                        c1218i.h();
                        z4 = true;
                        break;
                    } else {
                        z4 = false;
                        break;
                    }
                default:
                    l b6 = b();
                    if (b6 != null && b6.c()) {
                        b6.dismiss();
                    }
                    z4 = true;
                    break;
            }
            if (z4) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f13605h);
                            if (findPointerIndex >= 0) {
                                float x4 = motionEvent.getX(findPointerIndex);
                                float y4 = motionEvent.getY(findPointerIndex);
                                float f4 = this.f13598a;
                                float f5 = -f4;
                                if (x4 < f5 || y4 < f5 || x4 >= (view2.getRight() - view2.getLeft()) + f4 || y4 >= (view2.getBottom() - view2.getTop()) + f4) {
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
                    this.f13605h = motionEvent.getPointerId(0);
                    if (this.f13602e == null) {
                        this.f13602e = new RunnableC1178B(this, 0);
                    }
                    view2.postDelayed(this.f13602e, this.f13599b);
                    if (this.f13603f == null) {
                        this.f13603f = new RunnableC1178B(this, 1);
                    }
                    view2.postDelayed(this.f13603f, this.f13600c);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.f13604g = z;
        return z || z5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f13604g = false;
        this.f13605h = -1;
        RunnableC1178B runnableC1178B = this.f13602e;
        if (runnableC1178B != null) {
            this.f13601d.removeCallbacks(runnableC1178B);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1168a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f13607j = 0;
        this.f13608k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1168a(C1216h c1216h, C1216h c1216h2) {
        this(c1216h2);
        this.f13607j = 1;
        this.f13608k = c1216h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
