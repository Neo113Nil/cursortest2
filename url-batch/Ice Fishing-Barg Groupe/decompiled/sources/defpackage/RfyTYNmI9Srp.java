package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ice.fishing.grenza.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class RfyTYNmI9Srp extends ViewGroup {
    public IBinder OPXfSBeufaJ8;
    public boolean QrzZRwfaDlRX;
    public tq2 cpQdD2nAriOS;
    public up dgRBjINgWbAK;
    public boolean gPXPFXrUH4XX;
    public boolean r3s1LDPKFs1S;
    public WeakReference rtx2ld2ELZv4;
    public av2 wdg6QnbFHrFF;
    public dp x50lh2ztY7Y5;

    public RfyTYNmI9Srp(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        uq2.Companion.getClass();
        t3 t3Var = new t3(1, this);
        addOnAttachStateChangeListener(t3Var);
        rc1 rc1Var = new rc1(15);
        sj0.e6tOsSdd2EFb(this).PxuCJdSBwIXG.add(rc1Var);
        this.cpQdD2nAriOS = new tq2(this, t3Var, rc1Var);
    }

    private final void setParentContext(up upVar) {
        if (this.dgRBjINgWbAK != upVar) {
            this.dgRBjINgWbAK = upVar;
            if (upVar != null) {
                this.rtx2ld2ELZv4 = null;
            }
            av2 av2Var = this.wdg6QnbFHrFF;
            if (av2Var != null) {
                av2Var.PxuCJdSBwIXG();
                this.wdg6QnbFHrFF = null;
                if (isAttachedToWindow()) {
                    RAsUl2FVSrh6();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.OPXfSBeufaJ8 != iBinder) {
            this.OPXfSBeufaJ8 = iBinder;
            this.rtx2ld2ELZv4 = null;
        }
    }

    public void OPXfSBeufaJ8(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void RAsUl2FVSrh6() {
        if (this.wdg6QnbFHrFF == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.QrzZRwfaDlRX = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    dp dpVar = this.x50lh2ztY7Y5;
                    if (dpVar == null) {
                        dpVar = wdg6QnbFHrFF();
                    }
                    this.wdg6QnbFHrFF = cv2.PxuCJdSBwIXG(this, dpVar, new on(1003123809, true, new XL4ISE6Oc65B(objArr == true ? 1 : 0, this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.QrzZRwfaDlRX = false;
            }
        }
    }

    public final void TSizfFm2Yiuu() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.x50lh2ztY7Y5 == null) {
                r1 r1Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof r1) {
                        r1Var = (r1) childAt;
                    }
                }
                if (r1Var != null) {
                    r1Var.setComposeViewContext(x50lh2ztY7Y5(mm2.xfACYKDMU6Dj(this), r1Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                RAsUl2FVSrh6();
            }
        }
    }

    public final void Y1f8riQaR6yg() {
        if (this.QrzZRwfaDlRX) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void a92UlCVFR9N8() {
        View childAt = getChildAt(0);
        r1 r1Var = childAt instanceof r1 ? (r1) childAt : null;
        if (r1Var != null && r1Var.FT2GK7JK5Ma2) {
            r1Var.getComposeViewContext().lS5Rgt96tfkO();
            r1Var.FT2GK7JK5Ma2 = false;
        }
        av2 av2Var = this.wdg6QnbFHrFF;
        if (av2Var != null) {
            av2Var.PxuCJdSBwIXG();
        }
        this.wdg6QnbFHrFF = null;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        Y1f8riQaR6yg();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Y1f8riQaR6yg();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final up dgRBjINgWbAK() {
        ht1 ht1Var;
        hu huVar;
        x6 x6Var;
        int i;
        up upVar = this.dgRBjINgWbAK;
        if (upVar == null) {
            upVar = qu2.PxuCJdSBwIXG(this);
            if (upVar == null) {
                Object parent = getParent();
                while (upVar == null && (parent instanceof View)) {
                    View view = (View) parent;
                    upVar = qu2.PxuCJdSBwIXG(view);
                    parent = ni0.pnx5pC0XzaCw(view);
                }
            }
            if (upVar != null) {
                up upVar2 = (!(upVar instanceof ht1) || ((dt1) ((ht1) upVar).S9EYkSpbGuxq.getValue()).compareTo(dt1.OPXfSBeufaJ8) > 0) ? upVar : null;
                if (upVar2 != null) {
                    this.rtx2ld2ELZv4 = new WeakReference(upVar2);
                }
            } else {
                upVar = null;
            }
            if (upVar == null) {
                WeakReference weakReference = this.rtx2ld2ELZv4;
                if (weakReference == null || (upVar = (up) weakReference.get()) == null || ((upVar instanceof ht1) && ((dt1) ((ht1) upVar).S9EYkSpbGuxq.getValue()).compareTo(dt1.OPXfSBeufaJ8) <= 0)) {
                    upVar = null;
                }
                if (upVar == null) {
                    if (!isAttachedToWindow()) {
                        ep0.lS5Rgt96tfkO("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object pnx5pC0XzaCw = ni0.pnx5pC0XzaCw(this);
                    View view2 = this;
                    while (pnx5pC0XzaCw instanceof View) {
                        View view3 = (View) pnx5pC0XzaCw;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        pnx5pC0XzaCw = view3.getParent();
                    }
                    up PxuCJdSBwIXG = qu2.PxuCJdSBwIXG(view2);
                    if (PxuCJdSBwIXG == null) {
                        ((iu2) ((ku2) lu2.PxuCJdSBwIXG.get())).getClass();
                        n50 n50Var = n50.rtx2ld2ELZv4;
                        v6.Companion.getClass();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            huVar = (hu) v6.EcgxDIVH5in8.getValue();
                        } else {
                            huVar = (hu) v6.S9EYkSpbGuxq.get();
                            if (huVar == null) {
                                u9.rtx2ld2ELZv4("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        hu RfyTYNmI9Srp = huVar.RfyTYNmI9Srp(n50Var);
                        x6 x6Var2 = (x6) RfyTYNmI9Srp.S2OOm9zPNm0h(jx1.XL4ISE6Oc65B);
                        if (x6Var2 != null) {
                            x6 x6Var3 = new x6(x6Var2);
                            jv jvVar = (jv) x6Var3.wdg6QnbFHrFF;
                            synchronized (jvVar.lS5Rgt96tfkO) {
                                jvVar.PxuCJdSBwIXG = false;
                                x6Var = x6Var3;
                            }
                        } else {
                            x6Var = 0;
                        }
                        zt1 zt1Var = new zt1();
                        hu huVar2 = (u61) RfyTYNmI9Srp.S2OOm9zPNm0h(ih0.RfyTYNmI9Srp);
                        if (huVar2 == null) {
                            huVar2 = new v61(view2.getContext().getApplicationContext());
                            zt1Var.rtx2ld2ELZv4 = huVar2;
                        }
                        if (x6Var != 0) {
                            n50Var = x6Var;
                        }
                        hu RfyTYNmI9Srp2 = RfyTYNmI9Srp.RfyTYNmI9Srp(n50Var).RfyTYNmI9Srp(huVar2);
                        ht1 ht1Var2 = new ht1(RfyTYNmI9Srp2);
                        synchronized (ht1Var2.TSizfFm2Yiuu) {
                            i = 1;
                            ht1Var2.EcgxDIVH5in8 = true;
                        }
                        at Y1f8riQaR6yg = cs0.Y1f8riQaR6yg(RfyTYNmI9Srp2);
                        o01 S2OOm9zPNm0h = vi0.S2OOm9zPNm0h(view2);
                        s01 rtx2ld2ELZv4 = S2OOm9zPNm0h != null ? S2OOm9zPNm0h.rtx2ld2ELZv4() : null;
                        if (rtx2ld2ELZv4 == null) {
                            ep0.TSizfFm2Yiuu("ViewTreeLifecycleOwner not found from " + view2);
                            u9.Y1f8riQaR6yg();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new tc2(view2, ht1Var2, i));
                        rtx2ld2ELZv4.PxuCJdSBwIXG(new nu2(Y1f8riQaR6yg, x6Var, ht1Var2, zt1Var));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, ht1Var2);
                        ug0 ug0Var = ug0.rtx2ld2ELZv4;
                        Handler handler = view2.getHandler();
                        int i2 = qi0.PxuCJdSBwIXG;
                        view2.addOnAttachStateChangeListener(new t3(2, fx1.KUoIVIumpKat(ug0Var, new pi0(handler, "windowRecomposer cleanup", false).cpQdD2nAriOS, new n92(ht1Var2, view2, r1, 4), 2)));
                        ht1Var = ht1Var2;
                    } else {
                        if (!(PxuCJdSBwIXG instanceof ht1)) {
                            u9.rtx2ld2ELZv4("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        ht1Var = (ht1) PxuCJdSBwIXG;
                    }
                    r1 = ((dt1) ht1Var.S9EYkSpbGuxq.getValue()).compareTo(dt1.OPXfSBeufaJ8) > 0 ? ht1Var : null;
                    if (r1 != null) {
                        this.rtx2ld2ELZv4 = new WeakReference(r1);
                    }
                    return ht1Var;
                }
            }
        }
        return upVar;
    }

    public final void e9gEMXR7LXtO() {
        dp dpVar;
        View view;
        if (this.dgRBjINgWbAK == null && !isAttachedToWindow() && ((dpVar = this.x50lh2ztY7Y5) == null || (view = dpVar.PxuCJdSBwIXG) == null || !view.isAttachedToWindow())) {
            u9.rtx2ld2ELZv4("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            RAsUl2FVSrh6();
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        fb fbVar = tag instanceof fb ? (fb) tag : null;
        if (fbVar != null) {
            return fbVar.PxuCJdSBwIXG;
        }
        fb.Companion.getClass();
        return 1;
    }

    public final dp getComposeViewContext$ui() {
        return this.x50lh2ztY7Y5;
    }

    public final boolean getHasComposition() {
        return this.wdg6QnbFHrFF != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.r3s1LDPKFs1S;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.gPXPFXrUH4XX || super.isTransitionGroup();
    }

    public abstract void lS5Rgt96tfkO(int i, hp hpVar);

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v81 v81Var = qu2.PxuCJdSBwIXG;
        Object pnx5pC0XzaCw = ni0.pnx5pC0XzaCw(this);
        View view = this;
        while (pnx5pC0XzaCw instanceof View) {
            View view2 = (View) pnx5pC0XzaCw;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            pnx5pC0XzaCw = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new BRwzKIf41E4i(0, this));
        } else {
            TSizfFm2Yiuu();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        rtx2ld2ELZv4(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        RAsUl2FVSrh6();
        OPXfSBeufaJ8(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public void rtx2ld2ELZv4(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new fb(i));
    }

    public final void setComposeViewContext$ui(dp dpVar) {
        if (this.x50lh2ztY7Y5 != dpVar) {
            if (dpVar == null) {
                a92UlCVFR9N8();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                r1 r1Var = childAt instanceof r1 ? (r1) childAt : null;
                if (r1Var != null) {
                    if (r1Var.getCoroutineContext() != dpVar.lS5Rgt96tfkO.wdg6QnbFHrFF()) {
                        a92UlCVFR9N8();
                    }
                    r1Var.setComposeViewContext(dpVar);
                }
            }
            this.x50lh2ztY7Y5 = dpVar;
        }
    }

    public final void setParentCompositionContext(up upVar) {
        setParentContext(upVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.r3s1LDPKFs1S = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((r1) ((ei1) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.gPXPFXrUH4XX = true;
    }

    public final void setViewCompositionStrategy(uq2 uq2Var) {
        tq2 tq2Var = this.cpQdD2nAriOS;
        if (tq2Var != null) {
            tq2Var.PxuCJdSBwIXG();
        }
        ((jh0) uq2Var).getClass();
        t3 t3Var = new t3(1, this);
        addOnAttachStateChangeListener(t3Var);
        rc1 rc1Var = new rc1(15);
        sj0.e6tOsSdd2EFb(this).PxuCJdSBwIXG.add(rc1Var);
        this.cpQdD2nAriOS = new tq2(this, t3Var, rc1Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dp wdg6QnbFHrFF() {
        dp composeViewContext;
        dp ryVscX7ZL4Ux;
        pr2 pr2Var;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            r1 r1Var = childAt instanceof r1 ? (r1) childAt : null;
            if (r1Var != null) {
                composeViewContext = r1Var.getComposeViewContext();
                View xfACYKDMU6Dj = mm2.xfACYKDMU6Dj(this);
                ryVscX7ZL4Ux = mm2.ryVscX7ZL4Ux(xfACYKDMU6Dj);
                if (ryVscX7ZL4Ux == null) {
                    return x50lh2ztY7Y5(xfACYKDMU6Dj, ryVscX7ZL4Ux);
                }
                up dgRBjINgWbAK = dgRBjINgWbAK();
                o01 S2OOm9zPNm0h = vi0.S2OOm9zPNm0h(xfACYKDMU6Dj);
                if (S2OOm9zPNm0h == null) {
                    S2OOm9zPNm0h = composeViewContext != null ? composeViewContext.TSizfFm2Yiuu : null;
                    if (S2OOm9zPNm0h == null) {
                        u9.rtx2ld2ELZv4("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                o01 o01Var = S2OOm9zPNm0h;
                qz1 IAToe7bXGz4N = xi0.IAToe7bXGz4N(xfACYKDMU6Dj);
                if (IAToe7bXGz4N == null) {
                    IAToe7bXGz4N = composeViewContext != null ? composeViewContext.Y1f8riQaR6yg : null;
                    if (IAToe7bXGz4N == null) {
                        u9.rtx2ld2ELZv4("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                qz1 qz1Var = IAToe7bXGz4N;
                pr2 IAToe7bXGz4N2 = kj0.IAToe7bXGz4N(xfACYKDMU6Dj);
                if (IAToe7bXGz4N2 == null) {
                    pr2Var = composeViewContext != null ? composeViewContext.e9gEMXR7LXtO : null;
                } else {
                    pr2Var = IAToe7bXGz4N2;
                }
                dp dpVar = new dp(mm2.ryVscX7ZL4Ux(mm2.xfACYKDMU6Dj(xfACYKDMU6Dj)), xfACYKDMU6Dj, dgRBjINgWbAK, o01Var, qz1Var, pr2Var);
                xfACYKDMU6Dj.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(dpVar));
                return dpVar;
            }
        }
        composeViewContext = null;
        View xfACYKDMU6Dj2 = mm2.xfACYKDMU6Dj(this);
        ryVscX7ZL4Ux = mm2.ryVscX7ZL4Ux(xfACYKDMU6Dj2);
        if (ryVscX7ZL4Ux == null) {
        }
    }

    public final dp x50lh2ztY7Y5(View view, dp dpVar) {
        up dgRBjINgWbAK = dgRBjINgWbAK();
        o01 S2OOm9zPNm0h = vi0.S2OOm9zPNm0h(view);
        pr2 IAToe7bXGz4N = kj0.IAToe7bXGz4N(view);
        qz1 IAToe7bXGz4N2 = xi0.IAToe7bXGz4N(view);
        up upVar = dpVar.lS5Rgt96tfkO;
        qz1 qz1Var = dpVar.Y1f8riQaR6yg;
        o01 o01Var = dpVar.TSizfFm2Yiuu;
        if (dgRBjINgWbAK == upVar && S2OOm9zPNm0h == o01Var && IAToe7bXGz4N == dpVar.e9gEMXR7LXtO && IAToe7bXGz4N2 == qz1Var) {
            return dpVar;
        }
        if (dgRBjINgWbAK.wdg6QnbFHrFF() != dpVar.lS5Rgt96tfkO.wdg6QnbFHrFF()) {
            a92UlCVFR9N8();
        }
        if (S2OOm9zPNm0h == null) {
            S2OOm9zPNm0h = o01Var;
        }
        dp dpVar2 = new dp(dpVar, view, dgRBjINgWbAK, S2OOm9zPNm0h, IAToe7bXGz4N2 == null ? qz1Var : IAToe7bXGz4N2, IAToe7bXGz4N);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(dpVar2));
        return dpVar2;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        Y1f8riQaR6yg();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Y1f8riQaR6yg();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        Y1f8riQaR6yg();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Y1f8riQaR6yg();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Y1f8riQaR6yg();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
