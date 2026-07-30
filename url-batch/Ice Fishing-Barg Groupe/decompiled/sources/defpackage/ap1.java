package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.ice.fishing.grenza.R;
import java.util.UUID;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ap1 extends RfyTYNmI9Srp {
    private static final yo1 Companion = new yo1();
    public ae0 BRwzKIf41E4i;
    public final f82 BjEWd04qc7Mw;
    public final View EcgxDIVH5in8;
    public final int[] EpkonXwzFgDB;
    public cw0 IAToe7bXGz4N;
    public boolean J54yh1s3n4Aq;
    public String RfyTYNmI9Srp;
    public final WindowManager S2OOm9zPNm0h;
    public final boolean S9EYkSpbGuxq;
    public final fb0 VhhvGxCb8gfr;
    public ep1 XL4ISE6Oc65B;
    public final WindowManager.LayoutParams ZbWwgt3aGe7A;
    public dr0 aF05bpZJlKEP;
    public final mj1 e6tOsSdd2EFb;
    public final mj1 jyegZNwi31qc;
    public final ty kpCQ9veP6n3I;
    public e9 ozEBbv0hFTAB;
    public dp1 pnx5pC0XzaCw;
    public final Rect rZjpSjn4zoMv;
    public final mj1 tmVwIGCQF4zR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap1(ae0 ae0Var, ep1 ep1Var, String str, View view, hy hyVar, dp1 dp1Var, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 10;
        fb0 cp1Var = i >= 30 ? new cp1(i2) : i >= 29 ? new bp1(i2) : new fb0(i2);
        this.BRwzKIf41E4i = ae0Var;
        this.XL4ISE6Oc65B = ep1Var;
        this.RfyTYNmI9Srp = str;
        this.EcgxDIVH5in8 = view;
        this.S9EYkSpbGuxq = z;
        this.VhhvGxCb8gfr = cp1Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.S2OOm9zPNm0h = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        ep1 ep1Var2 = this.XL4ISE6Oc65B;
        boolean lS5Rgt96tfkO = j5.lS5Rgt96tfkO(view);
        boolean z2 = ep1Var2.lS5Rgt96tfkO;
        int i3 = ep1Var2.PxuCJdSBwIXG;
        if (z2 && lS5Rgt96tfkO) {
            i3 |= 8192;
        } else if (z2 && !lS5Rgt96tfkO) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.XL4ISE6Oc65B.a92UlCVFR9N8;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.ZbWwgt3aGe7A = layoutParams;
        this.pnx5pC0XzaCw = dp1Var;
        this.IAToe7bXGz4N = cw0.rtx2ld2ELZv4;
        this.e6tOsSdd2EFb = sj0.tmVwIGCQF4zR(null);
        this.jyegZNwi31qc = sj0.tmVwIGCQF4zR(null);
        this.kpCQ9veP6n3I = sj0.RfyTYNmI9Srp(new y4(11, this));
        this.rZjpSjn4zoMv = new Rect();
        this.BjEWd04qc7Mw = new f82(new f5(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, vi0.S2OOm9zPNm0h(view));
        setTag(R.id.view_tree_view_model_store_owner, kj0.IAToe7bXGz4N(view));
        setTag(R.id.view_tree_saved_state_registry_owner, xi0.IAToe7bXGz4N(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(hyVar.e6tOsSdd2EFb(8.0f));
        setOutlineProvider(new yz(1));
        this.tmVwIGCQF4zR = sj0.tmVwIGCQF4zR(qn.PxuCJdSBwIXG);
        this.EpkonXwzFgDB = new int[2];
    }

    private final pe0 getContent() {
        return (pe0) this.tmVwIGCQF4zR.getValue();
    }

    private final dr0 getDisplayBounds() {
        int i = this.XL4ISE6Oc65B.PxuCJdSBwIXG & 512;
        View view = this.EcgxDIVH5in8;
        Rect rect = this.rZjpSjn4zoMv;
        fb0 fb0Var = this.VhhvGxCb8gfr;
        if (i == 0) {
            fb0Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            fb0Var.RfyTYNmI9Srp(view, rect);
        }
        return new dr0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bw0 getParentLayoutCoordinates() {
        return (bw0) this.jyegZNwi31qc.getValue();
    }

    private final void setContent(pe0 pe0Var) {
        this.tmVwIGCQF4zR.setValue(pe0Var);
    }

    private final void setParentLayoutCoordinates(bw0 bw0Var) {
        this.jyegZNwi31qc.setValue(bw0Var);
    }

    public final void BRwzKIf41E4i(bw0 bw0Var) {
        setParentLayoutCoordinates(bw0Var);
        gPXPFXrUH4XX();
    }

    @Override // defpackage.RfyTYNmI9Srp
    public final void OPXfSBeufaJ8(int i, int i2) {
        this.XL4ISE6Oc65B.getClass();
        dr0 displayBounds = getDisplayBounds();
        super.OPXfSBeufaJ8(View.MeasureSpec.makeMeasureSpec(displayBounds.TSizfFm2Yiuu - displayBounds.PxuCJdSBwIXG, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.Y1f8riQaR6yg - displayBounds.lS5Rgt96tfkO, Integer.MIN_VALUE));
    }

    public final void QrzZRwfaDlRX(ae0 ae0Var, ep1 ep1Var, String str, cw0 cw0Var) {
        int i;
        this.BRwzKIf41E4i = ae0Var;
        this.RfyTYNmI9Srp = str;
        if (!cs0.wdg6QnbFHrFF(this.XL4ISE6Oc65B, ep1Var)) {
            ep1Var.getClass();
            this.XL4ISE6Oc65B = ep1Var;
            boolean lS5Rgt96tfkO = j5.lS5Rgt96tfkO(this.EcgxDIVH5in8);
            boolean z = ep1Var.lS5Rgt96tfkO;
            int i2 = ep1Var.PxuCJdSBwIXG;
            if (z && lS5Rgt96tfkO) {
                i2 |= 8192;
            } else if (z && !lS5Rgt96tfkO) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.ZbWwgt3aGe7A;
            layoutParams.flags = i2;
            this.VhhvGxCb8gfr.getClass();
            this.S2OOm9zPNm0h.updateViewLayout(this, layoutParams);
        }
        int ordinal = cw0Var.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                u9.gPXPFXrUH4XX();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void XL4ISE6Oc65B() {
        ir0 m2getPopupContentSizebOM6tXw;
        dr0 dr0Var = this.aF05bpZJlKEP;
        if (dr0Var == null || (m2getPopupContentSizebOM6tXw = m2getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = m2getPopupContentSizebOM6tXw.PxuCJdSBwIXG;
        dr0 displayBounds = getDisplayBounds();
        long j2 = ((displayBounds.Y1f8riQaR6yg - displayBounds.lS5Rgt96tfkO) & 4294967295L) | ((displayBounds.TSizfFm2Yiuu - displayBounds.PxuCJdSBwIXG) << 32);
        yt1 yt1Var = new yt1();
        wq0.Companion.getClass();
        yt1Var.rtx2ld2ELZv4 = 0L;
        this.BjEWd04qc7Mw.Y1f8riQaR6yg(this, gi1.QrzZRwfaDlRX, new zo1(yt1Var, this, dr0Var, j2, j));
        long j3 = yt1Var.rtx2ld2ELZv4;
        WindowManager.LayoutParams layoutParams = this.ZbWwgt3aGe7A;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.XL4ISE6Oc65B.e9gEMXR7LXtO;
        fb0 fb0Var = this.VhhvGxCb8gfr;
        if (z) {
            fb0Var.VhhvGxCb8gfr(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        fb0Var.getClass();
        this.S2OOm9zPNm0h.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.XL4ISE6Oc65B.TSizfFm2Yiuu) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                ae0 ae0Var = this.BRwzKIf41E4i;
                if (ae0Var != null) {
                    ae0Var.PxuCJdSBwIXG();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void gPXPFXrUH4XX() {
        long OPXfSBeufaJ8;
        bw0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.aF05bpZJlKEP()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long ryVscX7ZL4Ux = parentLayoutCoordinates.ryVscX7ZL4Ux();
            if (this.S9EYkSpbGuxq) {
                OPXfSBeufaJ8 = kj0.EpkonXwzFgDB(parentLayoutCoordinates);
            } else {
                bf1.Companion.getClass();
                OPXfSBeufaJ8 = parentLayoutCoordinates.OPXfSBeufaJ8(0L);
            }
            long round = (Math.round(Float.intBitsToFloat((int) (OPXfSBeufaJ8 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (OPXfSBeufaJ8 & 4294967295L))) & 4294967295L);
            int i = (int) (round >> 32);
            int i2 = (int) (round & 4294967295L);
            dr0 dr0Var = new dr0(i, i2, ((int) (ryVscX7ZL4Ux >> 32)) + i, ((int) (ryVscX7ZL4Ux & 4294967295L)) + i2);
            if (dr0Var.equals(this.aF05bpZJlKEP)) {
                return;
            }
            this.aF05bpZJlKEP = dr0Var;
            XL4ISE6Oc65B();
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.kpCQ9veP6n3I.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.ZbWwgt3aGe7A;
    }

    public final cw0 getParentLayoutDirection() {
        return this.IAToe7bXGz4N;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final ir0 m2getPopupContentSizebOM6tXw() {
        return (ir0) this.e6tOsSdd2EFb.getValue();
    }

    public final dp1 getPositionProvider() {
        return this.pnx5pC0XzaCw;
    }

    @Override // defpackage.RfyTYNmI9Srp
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.J54yh1s3n4Aq;
    }

    public final String getTestTag() {
        return this.RfyTYNmI9Srp;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.RfyTYNmI9Srp
    public final void lS5Rgt96tfkO(int i, hp hpVar) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-857613600);
        int i2 = (tf0Var.rtx2ld2ELZv4(this) ? 4 : 2) | i;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 3) != 2)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            getContent().rtx2ld2ELZv4(tf0Var, 0);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new XL4ISE6Oc65B(this, i, 7);
        }
    }

    @Override // defpackage.RfyTYNmI9Srp, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i72 i72Var = j72.Companion;
        f82 f82Var = this.BjEWd04qc7Mw;
        l4 l4Var = f82Var.Y1f8riQaR6yg;
        i72Var.getClass();
        f82Var.rtx2ld2ELZv4 = i72.Y1f8riQaR6yg(l4Var);
        if (!this.XL4ISE6Oc65B.TSizfFm2Yiuu || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.ozEBbv0hFTAB == null) {
            this.ozEBbv0hFTAB = new e9(0, this.BRwzKIf41E4i);
        }
        JLGWdXyAxbxj.e9gEMXR7LXtO(this, this.ozEBbv0hFTAB);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f82 f82Var = this.BjEWd04qc7Mw;
        rf1 rf1Var = f82Var.rtx2ld2ELZv4;
        if (rf1Var != null) {
            rf1Var.lS5Rgt96tfkO();
        }
        f82Var.PxuCJdSBwIXG();
        if (Build.VERSION.SDK_INT >= 33) {
            JLGWdXyAxbxj.a92UlCVFR9N8(this, this.ozEBbv0hFTAB);
        }
        this.ozEBbv0hFTAB = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.XL4ISE6Oc65B.Y1f8riQaR6yg) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            ae0 ae0Var = this.BRwzKIf41E4i;
            if (ae0Var != null) {
                ae0Var.PxuCJdSBwIXG();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            ae0 ae0Var2 = this.BRwzKIf41E4i;
            if (ae0Var2 != null) {
                ae0Var2.PxuCJdSBwIXG();
            }
        }
        return true;
    }

    public final void r3s1LDPKFs1S(up upVar, pe0 pe0Var) {
        setParentCompositionContext(upVar);
        setContent(pe0Var);
        this.J54yh1s3n4Aq = true;
    }

    @Override // defpackage.RfyTYNmI9Srp
    public final void rtx2ld2ELZv4(boolean z, int i, int i2, int i3, int i4) {
        super.rtx2ld2ELZv4(z, i, i2, i3, i4);
        this.XL4ISE6Oc65B.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.ZbWwgt3aGe7A;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.VhhvGxCb8gfr.getClass();
        this.S2OOm9zPNm0h.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(cw0 cw0Var) {
        this.IAToe7bXGz4N = cw0Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3setPopupContentSizefhxjrPA(ir0 ir0Var) {
        this.e6tOsSdd2EFb.setValue(ir0Var);
    }

    public final void setPositionProvider(dp1 dp1Var) {
        this.pnx5pC0XzaCw = dp1Var;
    }

    public final void setTestTag(String str) {
        this.RfyTYNmI9Srp = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public RfyTYNmI9Srp getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
