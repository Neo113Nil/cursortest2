package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.q0;
import m.s0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f5629d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5630e;

    /* renamed from: i, reason: collision with root package name */
    public final int f5631i;

    /* renamed from: r, reason: collision with root package name */
    public final View f5632r;

    /* renamed from: s, reason: collision with root package name */
    public s0 f5633s;

    /* renamed from: t, reason: collision with root package name */
    public s0 f5634t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5635u;

    /* renamed from: v, reason: collision with root package name */
    public int f5636v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f5637w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5638x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ View f5639y;

    public a(View view) {
        this.f5637w = new int[2];
        this.f5632r = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f5629d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f5630e = tapTimeout;
        this.f5631i = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        s0 s0Var = this.f5634t;
        View view = this.f5632r;
        if (s0Var != null) {
            view.removeCallbacks(s0Var);
        }
        s0 s0Var2 = this.f5633s;
        if (s0Var2 != null) {
            view.removeCallbacks(s0Var2);
        }
    }

    public final k b() {
        m.g gVar;
        switch (this.f5638x) {
            case 0:
                b bVar = ((ActionMenuItemView) this.f5639y).A;
                if (bVar == null || (gVar = ((m.h) bVar).f6084a.G) == null) {
                    return null;
                }
                return gVar.a();
            default:
                m.g gVar2 = ((m.i) this.f5639y).f6097r.F;
                if (gVar2 == null) {
                    return null;
                }
                return gVar2.a();
        }
    }

    public final boolean c() {
        k b10;
        switch (this.f5638x) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f5639y;
                h hVar = actionMenuItemView.f379y;
                return hVar != null && hVar.a(actionMenuItemView.f376v) && (b10 = b()) != null && b10.j();
            default:
                ((m.i) this.f5639y).f6097r.j();
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
        boolean z10;
        boolean z11;
        q0 q0Var;
        boolean z12 = this.f5635u;
        View view2 = this.f5632r;
        if (z12) {
            k b10 = b();
            if (b10 != null && b10.j() && (q0Var = (q0) b10.d()) != null && q0Var.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f5637w;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                q0Var.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b11 = q0Var.b(obtainNoHistory, this.f5636v);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z13 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b11) {
                }
            }
            switch (this.f5638x) {
                case 1:
                    m.j jVar = ((m.i) this.f5639y).f6097r;
                    if (jVar.H == null) {
                        jVar.d();
                        z11 = true;
                        break;
                    } else {
                        z11 = false;
                        break;
                    }
                default:
                    k b12 = b();
                    if (b12 != null && b12.j()) {
                        b12.dismiss();
                    }
                    z11 = true;
                    break;
            }
            if (z11) {
                z10 = false;
            }
            z10 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f5636v);
                            if (findPointerIndex >= 0) {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float y3 = motionEvent.getY(findPointerIndex);
                                float f3 = this.f5629d;
                                float f10 = -f3;
                                if (x10 < f10 || y3 < f10 || x10 >= (view2.getRight() - view2.getLeft()) + f3 || y3 >= (view2.getBottom() - view2.getTop()) + f3) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z10 = true;
                                        if (z10) {
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
                    this.f5636v = motionEvent.getPointerId(0);
                    if (this.f5633s == null) {
                        this.f5633s = new s0(this, 0);
                    }
                    view2.postDelayed(this.f5633s, this.f5630e);
                    if (this.f5634t == null) {
                        this.f5634t = new s0(this, 1);
                    }
                    view2.postDelayed(this.f5634t, this.f5631i);
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        this.f5635u = z10;
        return z10 || z12;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f5635u = false;
        this.f5636v = -1;
        s0 s0Var = this.f5633s;
        if (s0Var != null) {
            this.f5632r.removeCallbacks(s0Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f5638x = 0;
        this.f5639y = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(m.i iVar, m.i iVar2) {
        this(iVar2);
        this.f5638x = 1;
        this.f5639y = iVar;
    }
}
