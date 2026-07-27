package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.AbstractC1252y;
import l.C1234f;
import l.C1235g;
import l.C1236h;
import l.C1237i;
import l.RunnableC1226A;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1201a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f10537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10538b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10539c;

    /* renamed from: d, reason: collision with root package name */
    public final View f10540d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC1226A f10541e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC1226A f10542f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10543g;

    /* renamed from: h, reason: collision with root package name */
    public int f10544h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f10545i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10546j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f10547k;

    public ViewOnTouchListenerC1201a(View view) {
        this.f10545i = new int[2];
        this.f10540d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f10537a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f10538b = tapTimeout;
        this.f10539c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC1226A runnableC1226A = this.f10542f;
        View view = this.f10540d;
        if (runnableC1226A != null) {
            view.removeCallbacks(runnableC1226A);
        }
        RunnableC1226A runnableC1226A2 = this.f10541e;
        if (runnableC1226A2 != null) {
            view.removeCallbacks(runnableC1226A2);
        }
    }

    public final k b() {
        C1234f c1234f;
        switch (this.f10546j) {
            case 0:
                AbstractC1202b abstractC1202b = ((ActionMenuItemView) this.f10547k).f4085j;
                if (abstractC1202b == null || (c1234f = ((C1235g) abstractC1202b).f10865a.f10886s) == null) {
                    return null;
                }
                return c1234f.a();
            default:
                C1234f c1234f2 = ((C1236h) this.f10547k).f10867c.f10885r;
                if (c1234f2 == null) {
                    return null;
                }
                return c1234f2.a();
        }
    }

    public final boolean c() {
        k b6;
        switch (this.f10546j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f10547k;
                h hVar = actionMenuItemView.f4083h;
                return hVar != null && hVar.a(actionMenuItemView.f4080e) && (b6 = b()) != null && b6.k();
            default:
                ((C1236h) this.f10547k).f10867c.k();
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
        boolean z;
        boolean z5;
        AbstractC1252y abstractC1252y;
        boolean z6 = this.f10543g;
        View view2 = this.f10540d;
        if (z6) {
            k b6 = b();
            if (b6 != null && b6.k() && (abstractC1252y = (AbstractC1252y) b6.g()) != null && abstractC1252y.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f10545i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                abstractC1252y.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b7 = abstractC1252y.b(this.f10544h, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z7 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b7) {
                }
            }
            switch (this.f10546j) {
                case 1:
                    C1237i c1237i = ((C1236h) this.f10547k).f10867c;
                    if (c1237i.f10887t == null) {
                        c1237i.g();
                        z5 = true;
                        break;
                    } else {
                        z5 = false;
                        break;
                    }
                default:
                    k b8 = b();
                    if (b8 != null && b8.k()) {
                        b8.dismiss();
                    }
                    z5 = true;
                    break;
            }
            if (z5) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f10544h);
                            if (findPointerIndex >= 0) {
                                float x5 = motionEvent.getX(findPointerIndex);
                                float y5 = motionEvent.getY(findPointerIndex);
                                float f3 = this.f10537a;
                                float f6 = -f3;
                                if (x5 < f6 || y5 < f6 || x5 >= (view2.getRight() - view2.getLeft()) + f3 || y5 >= (view2.getBottom() - view2.getTop()) + f3) {
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
                    this.f10544h = motionEvent.getPointerId(0);
                    if (this.f10541e == null) {
                        this.f10541e = new RunnableC1226A(this, 0);
                    }
                    view2.postDelayed(this.f10541e, this.f10538b);
                    if (this.f10542f == null) {
                        this.f10542f = new RunnableC1226A(this, 1);
                    }
                    view2.postDelayed(this.f10542f, this.f10539c);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.f10543g = z;
        return z || z6;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f10543g = false;
        this.f10544h = -1;
        RunnableC1226A runnableC1226A = this.f10541e;
        if (runnableC1226A != null) {
            this.f10540d.removeCallbacks(runnableC1226A);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1201a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f10546j = 0;
        this.f10547k = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC1201a(C1236h c1236h, C1236h c1236h2) {
        this(c1236h2);
        this.f10546j = 1;
        this.f10547k = c1236h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
