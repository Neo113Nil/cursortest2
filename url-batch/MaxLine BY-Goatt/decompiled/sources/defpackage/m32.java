package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.facebook.internal.Utility;
import com.majelw.libystne.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m32 extends d0 {
    public final WindowManager.LayoutParams A;
    public o32 B;
    public u81 C;
    public final lz1 D;
    public final lz1 E;
    public u31 F;
    public final ia0 G;
    public final Rect H;
    public final hn2 I;
    public he J;
    public final lz1 K;
    public boolean L;
    public final int[] M;
    public Function0 u;
    public p32 v;
    public String w;
    public final View x;
    public final nm1 y;
    public final WindowManager z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m32(Function0 function0, p32 p32Var, String str, View view, ca0 ca0Var, o32 o32Var, UUID uuid) {
        super(view.getContext());
        int i = 12;
        nm1 n32Var = Build.VERSION.SDK_INT >= 29 ? new n32(i) : new nm1(i);
        this.u = function0;
        this.v = p32Var;
        this.w = str;
        this.x = view;
        this.y = n32Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.z = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        p32 p32Var2 = this.v;
        boolean b = cb.b(view);
        boolean z = p32Var2.b;
        int i2 = p32Var2.a;
        if (z && b) {
            i2 |= Utility.DEFAULT_STREAM_BUFFER_SIZE;
        } else if (z && !b) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.A = layoutParams;
        this.B = o32Var;
        this.C = u81.m;
        this.D = ij2.j(null);
        this.E = ij2.j(null);
        this.G = ij2.f(new u(25, this));
        this.H = new Rect();
        this.I = new hn2(new ya(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, ij2.g(view));
        setTag(R.id.view_tree_view_model_store_owner, zj2.h(view));
        setTag(R.id.view_tree_saved_state_registry_owner, uj2.b(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(ca0Var.D(8.0f));
        setOutlineProvider(new db0(1));
        this.K = ij2.j(oy.a);
        this.M = new int[2];
    }

    private final Function2<a00, Integer, Unit> getContent() {
        return (Function2) this.K.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t81 getParentLayoutCoordinates() {
        return (t81) this.E.getValue();
    }

    private final u31 getVisibleDisplayBounds() {
        this.y.getClass();
        View view = this.x;
        Rect rect = this.H;
        view.getWindowVisibleDisplayFrame(rect);
        return new u31(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(Function2<? super a00, ? super Integer, Unit> function2) {
        this.K.setValue(function2);
    }

    private final void setParentLayoutCoordinates(t81 t81Var) {
        this.E.setValue(t81Var);
    }

    @Override // defpackage.d0
    public final void b(int i, a00 a00Var) {
        a00Var.Z(-857613600);
        int i2 = (a00Var.h(this) ? 4 : 2) | i;
        if (a00Var.P(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(a00Var, 0);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new c0(i, 15, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.v.c) {
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
                Function0 function0 = this.u;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.d0
    public final void e(boolean z, int i, int i2, int i3, int i4) {
        super.e(z, i, i2, i3, i4);
        this.v.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.A;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.y.getClass();
        this.z.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.d0
    public final void f(int i, int i2) {
        this.v.getClass();
        u31 visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.c - visibleDisplayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d - visibleDisplayBounds.b, Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.G.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.A;
    }

    public final u81 getParentLayoutDirection() {
        return this.C;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final x31 m14getPopupContentSizebOM6tXw() {
        return (x31) this.D.getValue();
    }

    public final o32 getPositionProvider() {
        return this.B;
    }

    @Override // defpackage.d0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.L;
    }

    public final String getTestTag() {
        return this.w;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(d00 d00Var, Function2 function2) {
        setParentCompositionContext(d00Var);
        setContent(function2);
        this.L = true;
    }

    public final void j(Function0 function0, p32 p32Var, String str, u81 u81Var) {
        int i;
        this.u = function0;
        this.w = str;
        if (!Intrinsics.b(this.v, p32Var)) {
            p32Var.getClass();
            this.v = p32Var;
            boolean b = cb.b(this.x);
            boolean z = p32Var.b;
            int i2 = p32Var.a;
            if (z && b) {
                i2 |= Utility.DEFAULT_STREAM_BUFFER_SIZE;
            } else if (z && !b) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.A;
            layoutParams.flags = i2;
            this.y.getClass();
            this.z.updateViewLayout(this, layoutParams);
        }
        int ordinal = u81Var.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                a.b();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void k() {
        t81 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.y()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long N = parentLayoutCoordinates.N();
            long h = parentLayoutCoordinates.h(0L);
            long round = (Math.round(Float.intBitsToFloat((int) (h >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (h & 4294967295L))) & 4294967295L);
            int i = (int) (round >> 32);
            int i2 = (int) (round & 4294967295L);
            u31 u31Var = new u31(i, i2, ((int) (N >> 32)) + i, ((int) (N & 4294967295L)) + i2);
            if (u31Var.equals(this.F)) {
                return;
            }
            this.F = u31Var;
            m();
        }
    }

    public final void l(t81 t81Var) {
        setParentLayoutCoordinates(t81Var);
        k();
    }

    public final void m() {
        x31 m14getPopupContentSizebOM6tXw;
        u31 u31Var = this.F;
        if (u31Var == null || (m14getPopupContentSizebOM6tXw = m14getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = m14getPopupContentSizebOM6tXw.a;
        u31 visibleDisplayBounds = getVisibleDisplayBounds();
        long j2 = ((visibleDisplayBounds.d - visibleDisplayBounds.b) & 4294967295L) | ((visibleDisplayBounds.c - visibleDisplayBounds.a) << 32);
        b82 b82Var = new b82();
        b82Var.m = 0L;
        this.I.c(this, gs1.z, new l32(b82Var, this, u31Var, j2, j));
        long j3 = b82Var.m;
        WindowManager.LayoutParams layoutParams = this.A;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.v.e;
        nm1 nm1Var = this.y;
        if (z) {
            nm1Var.x(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        nm1Var.getClass();
        this.z.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.d0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.d();
        if (!this.v.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.J == null) {
            this.J = new he(0, this.u);
        }
        d2.i(this, this.J);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hn2 hn2Var = this.I;
        k4 k4Var = hn2Var.h;
        if (k4Var != null) {
            k4Var.d();
        }
        hn2Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            d2.j(this, this.J);
        }
        this.J = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.v.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.u;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            Function0 function02 = this.u;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(u81 u81Var) {
        this.C = u81Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m15setPopupContentSizefhxjrPA(x31 x31Var) {
        this.D.setValue(x31Var);
    }

    public final void setPositionProvider(o32 o32Var) {
        this.B = o32Var;
    }

    public final void setTestTag(String str) {
        this.w = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public d0 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
