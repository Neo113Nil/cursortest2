package P0;

import G.C0192d;
import G.C0205j0;
import G.C0216p;
import G.C0222s0;
import G.W;
import Q.C0273i;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.M;
import com.chicken.road.kedro.laqer.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import p0.InterfaceC0980p;
import s0.AbstractC1131a;
import y2.C1338m;

/* loaded from: classes.dex */
public final class B extends AbstractC1131a {

    /* renamed from: A, reason: collision with root package name */
    public final G.F f3681A;
    public final Rect B;

    /* renamed from: C, reason: collision with root package name */
    public final Q.A f3682C;

    /* renamed from: D, reason: collision with root package name */
    public Object f3683D;

    /* renamed from: E, reason: collision with root package name */
    public final C0205j0 f3684E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3685F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f3686G;

    /* renamed from: o, reason: collision with root package name */
    public Function0 f3687o;

    /* renamed from: p, reason: collision with root package name */
    public F f3688p;

    /* renamed from: q, reason: collision with root package name */
    public String f3689q;

    /* renamed from: r, reason: collision with root package name */
    public final View f3690r;

    /* renamed from: s, reason: collision with root package name */
    public final D f3691s;

    /* renamed from: t, reason: collision with root package name */
    public final WindowManager f3692t;

    /* renamed from: u, reason: collision with root package name */
    public final WindowManager.LayoutParams f3693u;

    /* renamed from: v, reason: collision with root package name */
    public E f3694v;

    /* renamed from: w, reason: collision with root package name */
    public M0.k f3695w;

    /* renamed from: x, reason: collision with root package name */
    public final C0205j0 f3696x;

    /* renamed from: y, reason: collision with root package name */
    public final C0205j0 f3697y;

    /* renamed from: z, reason: collision with root package name */
    public M0.i f3698z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Function0 function0, F f4, String str, View view, M0.b bVar, E e4, UUID uuid) {
        super(view.getContext());
        D c4 = Build.VERSION.SDK_INT >= 29 ? new C() : new D();
        this.f3687o = function0;
        this.f3688p = f4;
        this.f3689q = str;
        this.f3690r = view;
        this.f3691s = c4;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f3692t = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        F f5 = this.f3688p;
        boolean b4 = o.b(view);
        boolean z4 = f5.f3700b;
        int i2 = f5.f3699a;
        if (z4 && b4) {
            i2 |= 8192;
        } else if (z4 && !b4) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f3693u = layoutParams;
        this.f3694v = e4;
        this.f3695w = M0.k.f3555d;
        W w4 = W.f2779l;
        this.f3696x = C0192d.K(null, w4);
        this.f3697y = C0192d.K(null, w4);
        this.f3681A = C0192d.D(new A3.e(9, this));
        this.B = new Rect();
        this.f3682C = new Q.A(new l(this, 2));
        setId(android.R.id.content);
        M.i(this, M.f(view));
        M.j(this, M.g(view));
        AbstractC0864b.B(this, AbstractC0864b.q(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.L((float) 8));
        setOutlineProvider(new x(1));
        this.f3684E = C0192d.K(t.f3760a, w4);
        this.f3686G = new int[2];
    }

    private final Function2<C0216p, Integer, Unit> getContent() {
        return (Function2) this.f3684E.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0980p getParentLayoutCoordinates() {
        return (InterfaceC0980p) this.f3697y.getValue();
    }

    private final void setContent(Function2<? super C0216p, ? super Integer, Unit> function2) {
        this.f3684E.setValue(function2);
    }

    private final void setParentLayoutCoordinates(InterfaceC0980p interfaceC0980p) {
        this.f3697y.setValue(interfaceC0980p);
    }

    @Override // s0.AbstractC1131a
    public final void a(int i2, C0216p c0216p) {
        int i4;
        c0216p.U(-857613600);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(this) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            getContent().h(c0216p, 0);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new u(i2, 1, this);
        }
    }

    @Override // s0.AbstractC1131a
    public final void d(boolean z4, int i2, int i4, int i5, int i6) {
        super.d(z4, i2, i4, i5, i6);
        this.f3688p.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f3693u;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f3691s.getClass();
        this.f3692t.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f3688p.f3701c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.f3687o;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // s0.AbstractC1131a
    public final void e(int i2, int i4) {
        this.f3688p.getClass();
        super.e(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f3681A.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f3693u;
    }

    public final M0.k getParentLayoutDirection() {
        return this.f3695w;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final M0.j m0getPopupContentSizebOM6tXw() {
        return (M0.j) this.f3696x.getValue();
    }

    public final E getPositionProvider() {
        return this.f3694v;
    }

    @Override // s0.AbstractC1131a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3685F;
    }

    public AbstractC1131a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f3689q;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h(G.r rVar, Function2 function2) {
        setParentCompositionContext(rVar);
        setContent(function2);
        this.f3685F = true;
    }

    public final void i(Function0 function0, F f4, String str, M0.k kVar) {
        int i2;
        this.f3687o = function0;
        this.f3689q = str;
        if (!Intrinsics.a(this.f3688p, f4)) {
            f4.getClass();
            WindowManager.LayoutParams layoutParams = this.f3693u;
            this.f3688p = f4;
            boolean b4 = o.b(this.f3690r);
            boolean z4 = f4.f3700b;
            int i4 = f4.f3699a;
            if (z4 && b4) {
                i4 |= 8192;
            } else if (z4 && !b4) {
                i4 &= -8193;
            }
            layoutParams.flags = i4;
            this.f3691s.getClass();
            this.f3692t.updateViewLayout(this, layoutParams);
        }
        int ordinal = kVar.ordinal();
        if (ordinal != 0) {
            i2 = 1;
            if (ordinal != 1) {
                throw new C1338m();
            }
        } else {
            i2 = 0;
        }
        super.setLayoutDirection(i2);
    }

    public final void j() {
        InterfaceC0980p parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.p()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long K3 = parentLayoutCoordinates.K();
            long j4 = parentLayoutCoordinates.j(0L);
            long g4 = j0.c.g(Math.round(Y.c.d(j4)), Math.round(Y.c.e(j4)));
            int i2 = (int) (g4 >> 32);
            int i4 = (int) (g4 & 4294967295L);
            M0.i iVar = new M0.i(i2, i4, ((int) (K3 >> 32)) + i2, ((int) (K3 & 4294967295L)) + i4);
            if (iVar.equals(this.f3698z)) {
                return;
            }
            this.f3698z = iVar;
            l();
        }
    }

    public final void k(InterfaceC0980p interfaceC0980p) {
        setParentLayoutCoordinates(interfaceC0980p);
        j();
    }

    public final void l() {
        M0.j m0getPopupContentSizebOM6tXw;
        M0.i iVar = this.f3698z;
        if (iVar == null || (m0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        D d4 = this.f3691s;
        d4.getClass();
        View view = this.f3690r;
        Rect rect = this.B;
        view.getWindowVisibleDisplayFrame(rect);
        long c4 = u3.d.c(rect.right - rect.left, rect.bottom - rect.top);
        M2.D d5 = new M2.D();
        d5.f3579d = 0L;
        this.f3682C.c(this, C0262d.f3718m, new A(d5, this, iVar, c4, m0getPopupContentSizebOM6tXw.f3554a));
        WindowManager.LayoutParams layoutParams = this.f3693u;
        long j4 = d5.f3579d;
        layoutParams.x = (int) (j4 >> 32);
        layoutParams.y = (int) (j4 & 4294967295L);
        if (this.f3688p.f3703e) {
            d4.a(this, (int) (c4 >> 32), (int) (c4 & 4294967295L));
        }
        this.f3692t.updateViewLayout(this, layoutParams);
    }

    @Override // s0.AbstractC1131a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3682C.d();
        if (!this.f3688p.f3701c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f3683D == null) {
            this.f3683D = q.a(this.f3687o);
        }
        q.b(this, this.f3683D);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q.A a4 = this.f3682C;
        C0273i c0273i = a4.f3796g;
        if (c0273i != null) {
            c0273i.a();
        }
        a4.b();
        if (Build.VERSION.SDK_INT >= 33) {
            q.c(this, this.f3683D);
        }
        this.f3683D = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3688p.f3702d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f3687o;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Function0 function02 = this.f3687o;
        if (function02 != null) {
            function02.invoke();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
    }

    public final void setParentLayoutDirection(M0.k kVar) {
        this.f3695w = kVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(M0.j jVar) {
        this.f3696x.setValue(jVar);
    }

    public final void setPositionProvider(E e4) {
        this.f3694v = e4;
    }

    public final void setTestTag(String str) {
        this.f3689q = str;
    }
}
