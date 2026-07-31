package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.x0;
import l.z0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f4022d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4023e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4024f;

    /* renamed from: g, reason: collision with root package name */
    public final View f4025g;

    /* renamed from: h, reason: collision with root package name */
    public z0 f4026h;
    public z0 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4027j;

    /* renamed from: k, reason: collision with root package name */
    public int f4028k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f4029l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4030m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f4031n;

    public a(View view) {
        this.f4029l = new int[2];
        this.f4025g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4022d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4023e = tapTimeout;
        this.f4024f = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        z0 z0Var = this.i;
        View view = this.f4025g;
        if (z0Var != null) {
            view.removeCallbacks(z0Var);
        }
        z0 z0Var2 = this.f4026h;
        if (z0Var2 != null) {
            view.removeCallbacks(z0Var2);
        }
    }

    public final k b() {
        l.f fVar;
        switch (this.f4030m) {
            case 0:
                b bVar = ((ActionMenuItemView) this.f4031n).f335p;
                if (bVar == null || (fVar = ((l.g) bVar).f4248a.f4272v) == null) {
                    return null;
                }
                return fVar.a();
            default:
                l.f fVar2 = ((l.h) this.f4031n).f4250g.f4271u;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    public final boolean c() {
        k b8;
        switch (this.f4030m) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f4031n;
                h hVar = actionMenuItemView.f333n;
                return hVar != null && hVar.a(actionMenuItemView.f330k) && (b8 = b()) != null && b8.k();
            default:
                ((l.h) this.f4031n).f4250g.k();
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
        boolean z3;
        boolean z7;
        x0 x0Var;
        boolean z8 = this.f4027j;
        View view2 = this.f4025g;
        if (z8) {
            k b8 = b();
            if (b8 != null && b8.k() && (x0Var = (x0) b8.g()) != null && x0Var.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f4029l;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                x0Var.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b9 = x0Var.b(obtainNoHistory, this.f4028k);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z9 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b9) {
                }
            }
            switch (this.f4030m) {
                case 1:
                    l.i iVar = ((l.h) this.f4031n).f4250g;
                    if (iVar.f4273w == null) {
                        iVar.g();
                        z7 = true;
                        break;
                    } else {
                        z7 = false;
                        break;
                    }
                default:
                    k b10 = b();
                    if (b10 != null && b10.k()) {
                        b10.dismiss();
                    }
                    z7 = true;
                    break;
            }
            if (z7) {
                z3 = false;
            }
            z3 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f4028k);
                            if (findPointerIndex >= 0) {
                                float x7 = motionEvent.getX(findPointerIndex);
                                float y7 = motionEvent.getY(findPointerIndex);
                                float f6 = this.f4022d;
                                float f8 = -f6;
                                if (x7 < f8 || y7 < f8 || x7 >= (view2.getRight() - view2.getLeft()) + f6 || y7 >= (view2.getBottom() - view2.getTop()) + f6) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z3 = true;
                                        if (z3) {
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
                    this.f4028k = motionEvent.getPointerId(0);
                    if (this.f4026h == null) {
                        this.f4026h = new z0(this, 0);
                    }
                    view2.postDelayed(this.f4026h, this.f4023e);
                    if (this.i == null) {
                        this.i = new z0(this, 1);
                    }
                    view2.postDelayed(this.i, this.f4024f);
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        this.f4027j = z3;
        return z3 || z8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4027j = false;
        this.f4028k = -1;
        z0 z0Var = this.f4026h;
        if (z0Var != null) {
            this.f4025g.removeCallbacks(z0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f4030m = 0;
        this.f4031n = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(l.h hVar, l.h hVar2) {
        this(hVar2);
        this.f4030m = 1;
        this.f4031n = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
