package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.ice.fishing.grenza.R;
import java.util.UUID;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zz extends Dialog implements o01, vf1, ic1, qz1 {
    public final nz1 OPXfSBeufaJ8;
    public final tz QrzZRwfaDlRX;
    public xz cpQdD2nAriOS;
    public final qc2 dgRBjINgWbAK;
    public boolean gPXPFXrUH4XX;
    public final View r3s1LDPKFs1S;
    public s01 rtx2ld2ELZv4;
    public final qc2 wdg6QnbFHrFF;
    public ae0 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz(ae0 ae0Var, xz xzVar, View view, cw0 cw0Var, hy hyVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), xzVar.e9gEMXR7LXtO ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        final int i = 0;
        nz1.Companion.getClass();
        this.OPXfSBeufaJ8 = mz1.PxuCJdSBwIXG(this);
        this.wdg6QnbFHrFF = new qc2(new ae0(this) { // from class: jn
            public final /* synthetic */ zz OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i2 = i;
                zz zzVar = this.OPXfSBeufaJ8;
                switch (i2) {
                    case 0:
                        b00 b00Var = new b00();
                        zzVar.PxuCJdSBwIXG().lS5Rgt96tfkO(b00Var);
                        return b00Var;
                    default:
                        return new uf1(new BRwzKIf41E4i(5, zzVar));
                }
            }
        });
        final int i2 = 1;
        this.dgRBjINgWbAK = new qc2(new ae0(this) { // from class: jn
            public final /* synthetic */ zz OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i22 = i2;
                zz zzVar = this.OPXfSBeufaJ8;
                switch (i22) {
                    case 0:
                        b00 b00Var = new b00();
                        zzVar.PxuCJdSBwIXG().lS5Rgt96tfkO(b00Var);
                        return b00Var;
                    default:
                        return new uf1(new BRwzKIf41E4i(5, zzVar));
                }
            }
        });
        this.x50lh2ztY7Y5 = ae0Var;
        this.cpQdD2nAriOS = xzVar;
        this.r3s1LDPKFs1S = view;
        Window window = getWindow();
        if (window == null) {
            u9.rtx2ld2ELZv4("Dialog has no window");
            throw null;
        }
        xz xzVar2 = this.cpQdD2nAriOS;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = xzVar2.RAsUl2FVSrh6;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        ng0.rZjpSjn4zoMv(window, this.cpQdD2nAriOS.e9gEMXR7LXtO);
        window.setGravity(17);
        if (!this.cpQdD2nAriOS.e9gEMXR7LXtO) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                a9.PxuCJdSBwIXG.PxuCJdSBwIXG(attributes2);
            }
            if (i3 >= 30) {
                b9 b9Var = b9.PxuCJdSBwIXG;
                b9Var.lS5Rgt96tfkO(attributes2, 0);
                b9Var.TSizfFm2Yiuu(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        tz tzVar = new tz(getContext(), window);
        setTitle(this.cpQdD2nAriOS.a92UlCVFR9N8);
        tzVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        tzVar.setClipChildren(false);
        tzVar.setElevation(hyVar.e6tOsSdd2EFb(8.0f));
        tzVar.setOutlineProvider(new yz(0));
        this.QrzZRwfaDlRX = tzVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e9gEMXR7LXtO(viewGroup);
        }
        setContentView(tzVar);
        tzVar.setTag(R.id.view_tree_lifecycle_owner, vi0.S2OOm9zPNm0h(view));
        tzVar.setTag(R.id.view_tree_view_model_store_owner, kj0.IAToe7bXGz4N(view));
        tzVar.setTag(R.id.view_tree_saved_state_registry_owner, xi0.IAToe7bXGz4N(view));
        OPXfSBeufaJ8(this.x50lh2ztY7Y5, this.cpQdD2nAriOS, cw0Var);
        uf1 lS5Rgt96tfkO = lS5Rgt96tfkO();
        y2 y2Var = new y2(this, 1);
        lS5Rgt96tfkO.getClass();
        bc bcVar = new bc(y2Var);
        final s01 rtx2ld2ELZv4 = rtx2ld2ELZv4();
        if (rtx2ld2ELZv4.rtx2ld2ELZv4 == f01.rtx2ld2ELZv4) {
            return;
        }
        of1 of1Var = new of1(bcVar, new pf1(bcVar, this));
        bcVar.PxuCJdSBwIXG.add(of1Var);
        of1Var.RAsUl2FVSrh6(false);
        hc1.PxuCJdSBwIXG(lS5Rgt96tfkO.PxuCJdSBwIXG().TSizfFm2Yiuu, of1Var);
        final ww wwVar = new ww(of1Var, lS5Rgt96tfkO, rtx2ld2ELZv4);
        rtx2ld2ELZv4.PxuCJdSBwIXG(wwVar);
        bcVar.TSizfFm2Yiuu.add(new AutoCloseable() { // from class: qf1
            @Override // java.lang.AutoCloseable
            public final void close() {
                s01.this.a92UlCVFR9N8(wwVar);
            }
        });
    }

    public static void Y1f8riQaR6yg(zz zzVar) {
        super.onBackPressed();
    }

    public static final void e9gEMXR7LXtO(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof tz) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e9gEMXR7LXtO(viewGroup2);
            }
        }
    }

    public final void OPXfSBeufaJ8(ae0 ae0Var, xz xzVar, cw0 cw0Var) {
        int i;
        this.x50lh2ztY7Y5 = ae0Var;
        this.cpQdD2nAriOS = xzVar;
        m12 m12Var = xzVar.TSizfFm2Yiuu;
        boolean lS5Rgt96tfkO = j5.lS5Rgt96tfkO(this.r3s1LDPKFs1S);
        int ordinal = m12Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                lS5Rgt96tfkO = true;
            } else {
                if (ordinal != 2) {
                    u9.gPXPFXrUH4XX();
                    return;
                }
                lS5Rgt96tfkO = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(lS5Rgt96tfkO ? 8192 : -8193, 8192);
        int ordinal2 = cw0Var.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                u9.gPXPFXrUH4XX();
                return;
            }
            i = 1;
        }
        tz tzVar = this.QrzZRwfaDlRX;
        tzVar.setLayoutDirection(i);
        boolean z = xzVar.e9gEMXR7LXtO;
        boolean z2 = xzVar.Y1f8riQaR6yg;
        Window window2 = tzVar.BRwzKIf41E4i;
        boolean z3 = (tzVar.S9EYkSpbGuxq && z2 == tzVar.RfyTYNmI9Srp && z == tzVar.EcgxDIVH5in8) ? false : true;
        tzVar.RfyTYNmI9Srp = z2;
        tzVar.EcgxDIVH5in8 = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !tzVar.S9EYkSpbGuxq) {
                window2.setLayout(i2, -2);
                tzVar.S9EYkSpbGuxq = true;
            }
        }
        setCanceledOnTouchOutside(xzVar.lS5Rgt96tfkO);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // defpackage.ic1
    public final hc1 PxuCJdSBwIXG() {
        return lS5Rgt96tfkO().PxuCJdSBwIXG().TSizfFm2Yiuu;
    }

    public final void RAsUl2FVSrh6() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.qz1
    public final cr1 TSizfFm2Yiuu() {
        return this.OPXfSBeufaJ8.lS5Rgt96tfkO;
    }

    public final s01 a92UlCVFR9N8() {
        s01 s01Var = this.rtx2ld2ELZv4;
        if (s01Var != null) {
            return s01Var;
        }
        s01 s01Var2 = new s01(this, true);
        this.rtx2ld2ELZv4 = s01Var2;
        return s01Var2;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        RAsUl2FVSrh6();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.vf1
    public final uf1 lS5Rgt96tfkO() {
        return (uf1) this.dgRBjINgWbAK.getValue();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((b00) this.wdg6QnbFHrFF.getValue()).PxuCJdSBwIXG();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            uf1 lS5Rgt96tfkO = lS5Rgt96tfkO();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            lS5Rgt96tfkO.lS5Rgt96tfkO(onBackInvokedDispatcher);
        }
        this.OPXfSBeufaJ8.lS5Rgt96tfkO(bundle);
        a92UlCVFR9N8().Y1f8riQaR6yg(e01.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.cpQdD2nAriOS.PxuCJdSBwIXG || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.x50lh2ztY7Y5.PxuCJdSBwIXG();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.OPXfSBeufaJ8.TSizfFm2Yiuu(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a92UlCVFR9N8().Y1f8riQaR6yg(e01.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        a92UlCVFR9N8().Y1f8riQaR6yg(e01.ON_DESTROY);
        this.rtx2ld2ELZv4 = null;
        super.onStop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.cpQdD2nAriOS.lS5Rgt96tfkO) {
            tz tzVar = this.QrzZRwfaDlRX;
            tzVar.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = tzVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + tzVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + tzVar.getTop();
                int height = childAt.getHeight() + top;
                int IXK6ba3ucyzm = b51.IXK6ba3ucyzm(motionEvent.getX());
                if (left <= IXK6ba3ucyzm) {
                    if (IXK6ba3ucyzm <= width) {
                        int IXK6ba3ucyzm2 = b51.IXK6ba3ucyzm(motionEvent.getY());
                        if (top <= IXK6ba3ucyzm2) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.gPXPFXrUH4XX = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.gPXPFXrUH4XX = false;
                    return onTouchEvent;
                }
            } else if (this.gPXPFXrUH4XX) {
                this.x50lh2ztY7Y5.PxuCJdSBwIXG();
                this.gPXPFXrUH4XX = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.gPXPFXrUH4XX = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // defpackage.o01
    public final s01 rtx2ld2ELZv4() {
        return a92UlCVFR9N8();
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        RAsUl2FVSrh6();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        RAsUl2FVSrh6();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        RAsUl2FVSrh6();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
