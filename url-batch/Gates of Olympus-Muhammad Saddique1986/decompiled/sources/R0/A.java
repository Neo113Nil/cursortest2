package R0;

import I.C0143d;
import I.C0156j0;
import I.C0167p;
import I.C0173s0;
import I.F;
import I.W;
import a0.C0238c;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.P;
import com.gatesof.olympus.martu.marku.R;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import java.util.UUID;
import n.T;
import r0.InterfaceC0919p;
import u0.AbstractC1088a;

/* loaded from: classes.dex */
public final class A extends AbstractC1088a {

    /* renamed from: A, reason: collision with root package name */
    public Object f4038A;

    /* renamed from: B, reason: collision with root package name */
    public final C0156j0 f4039B;
    public boolean C;
    public final int[] D;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0422a f4040l;

    /* renamed from: m, reason: collision with root package name */
    public E f4041m;

    /* renamed from: n, reason: collision with root package name */
    public String f4042n;

    /* renamed from: o, reason: collision with root package name */
    public final View f4043o;

    /* renamed from: p, reason: collision with root package name */
    public final C f4044p;

    /* renamed from: q, reason: collision with root package name */
    public final WindowManager f4045q;

    /* renamed from: r, reason: collision with root package name */
    public final WindowManager.LayoutParams f4046r;

    /* renamed from: s, reason: collision with root package name */
    public D f4047s;

    /* renamed from: t, reason: collision with root package name */
    public O0.k f4048t;

    /* renamed from: u, reason: collision with root package name */
    public final C0156j0 f4049u;

    /* renamed from: v, reason: collision with root package name */
    public final C0156j0 f4050v;

    /* renamed from: w, reason: collision with root package name */
    public O0.i f4051w;

    /* renamed from: x, reason: collision with root package name */
    public final F f4052x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f4053y;

    /* renamed from: z, reason: collision with root package name */
    public final S.w f4054z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(InterfaceC0422a interfaceC0422a, E e3, String str, View view, O0.b bVar, D d3, UUID uuid) {
        super(view.getContext());
        C b3 = Build.VERSION.SDK_INT >= 29 ? new B() : new C();
        this.f4040l = interfaceC0422a;
        this.f4041m = e3;
        this.f4042n = str;
        this.f4043o = view;
        this.f4044p = b3;
        Object systemService = view.getContext().getSystemService("window");
        f2.j.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f4045q = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        E e4 = this.f4041m;
        boolean b4 = n.b(view);
        boolean z3 = e4.f4056b;
        int i3 = e4.f4055a;
        if (z3 && b4) {
            i3 |= 8192;
        } else if (z3 && !b4) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f4046r = layoutParams;
        this.f4047s = d3;
        this.f4048t = O0.k.f3741d;
        W w2 = W.f2783i;
        this.f4049u = C0143d.K(null, w2);
        this.f4050v = C0143d.K(null, w2);
        this.f4052x = C0143d.D(new A.h(14, this));
        this.f4053y = new Rect();
        this.f4054z = new S.w(new k(this, 2));
        setId(android.R.id.content);
        P.k(this, P.f(view));
        setTag(R.id.view_tree_view_model_store_owner, P.g(view));
        setTag(R.id.view_tree_saved_state_registry_owner, T.l(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.J((float) 8));
        setOutlineProvider(new w(1));
        this.f4039B = C0143d.K(s.f4114a, w2);
        this.D = new int[2];
    }

    private final InterfaceC0426e getContent() {
        return (InterfaceC0426e) this.f4039B.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0919p getParentLayoutCoordinates() {
        return (InterfaceC0919p) this.f4050v.getValue();
    }

    private final void setContent(InterfaceC0426e interfaceC0426e) {
        this.f4039B.setValue(interfaceC0426e);
    }

    private final void setParentLayoutCoordinates(InterfaceC0919p interfaceC0919p) {
        this.f4050v.setValue(interfaceC0919p);
    }

    @Override // u0.AbstractC1088a
    public final void a(int i3, C0167p c0167p) {
        int i4;
        c0167p.S(-857613600);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(this) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            getContent().h(c0167p, 0);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new t(i3, 1, this);
        }
    }

    @Override // u0.AbstractC1088a
    public final void d(boolean z3, int i3, int i4, int i5, int i6) {
        super.d(z3, i3, i4, i5, i6);
        this.f4041m.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f4046r;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f4044p.getClass();
        this.f4045q.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f4041m.f4057c) {
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
                InterfaceC0422a interfaceC0422a = this.f4040l;
                if (interfaceC0422a != null) {
                    interfaceC0422a.b();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // u0.AbstractC1088a
    public final void e(int i3, int i4) {
        this.f4041m.getClass();
        super.e(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f4052x.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f4046r;
    }

    public final O0.k getParentLayoutDirection() {
        return this.f4048t;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final O0.j m0getPopupContentSizebOM6tXw() {
        return (O0.j) this.f4049u.getValue();
    }

    public final D getPositionProvider() {
        return this.f4047s;
    }

    @Override // u0.AbstractC1088a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.C;
    }

    public final String getTestTag() {
        return this.f4042n;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h(I.r rVar, InterfaceC0426e interfaceC0426e) {
        setParentCompositionContext(rVar);
        setContent(interfaceC0426e);
        this.C = true;
    }

    public final void i(InterfaceC0422a interfaceC0422a, E e3, String str, O0.k kVar) {
        int i3;
        this.f4040l = interfaceC0422a;
        this.f4042n = str;
        if (!f2.j.a(this.f4041m, e3)) {
            e3.getClass();
            WindowManager.LayoutParams layoutParams = this.f4046r;
            this.f4041m = e3;
            boolean b3 = n.b(this.f4043o);
            boolean z3 = e3.f4056b;
            int i4 = e3.f4055a;
            if (z3 && b3) {
                i4 |= 8192;
            } else if (z3 && !b3) {
                i4 &= -8193;
            }
            layoutParams.flags = i4;
            this.f4044p.getClass();
            this.f4045q.updateViewLayout(this, layoutParams);
        }
        int ordinal = kVar.ordinal();
        if (ordinal != 0) {
            i3 = 1;
            if (ordinal != 1) {
                throw new C1.c();
            }
        } else {
            i3 = 0;
        }
        super.setLayoutDirection(i3);
    }

    public final void j() {
        InterfaceC0919p parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.o()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long I3 = parentLayoutCoordinates.I();
            long m3 = parentLayoutCoordinates.m(0L);
            long c2 = l0.c.c(Math.round(C0238c.d(m3)), Math.round(C0238c.e(m3)));
            int i3 = (int) (c2 >> 32);
            int i4 = (int) (c2 & 4294967295L);
            O0.i iVar = new O0.i(i3, i4, ((int) (I3 >> 32)) + i3, ((int) (I3 & 4294967295L)) + i4);
            if (iVar.equals(this.f4051w)) {
                return;
            }
            this.f4051w = iVar;
            l();
        }
    }

    public final void k(InterfaceC0919p interfaceC0919p) {
        setParentLayoutCoordinates(interfaceC0919p);
        j();
    }

    public final void l() {
        O0.j m0getPopupContentSizebOM6tXw;
        O0.i iVar = this.f4051w;
        if (iVar == null || (m0getPopupContentSizebOM6tXw = m0getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        C c2 = this.f4044p;
        c2.getClass();
        View view = this.f4043o;
        Rect rect = this.f4053y;
        view.getWindowVisibleDisplayFrame(rect);
        long d3 = O2.d.d(rect.right - rect.left, rect.bottom - rect.top);
        f2.t tVar = new f2.t();
        tVar.f5831d = 0L;
        this.f4054z.c(this, C0215d.f4074k, new z(tVar, this, iVar, d3, m0getPopupContentSizebOM6tXw.f3740a));
        WindowManager.LayoutParams layoutParams = this.f4046r;
        long j3 = tVar.f5831d;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        if (this.f4041m.f4059e) {
            c2.a(this, (int) (d3 >> 32), (int) (d3 & 4294967295L));
        }
        this.f4045q.updateViewLayout(this, layoutParams);
    }

    @Override // u0.AbstractC1088a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4054z.d();
        if (!this.f4041m.f4057c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f4038A == null) {
            this.f4038A = p.a(this.f4040l);
        }
        p.b(this, this.f4038A);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        S.w wVar = this.f4054z;
        L1.g gVar = wVar.f4277g;
        if (gVar != null) {
            gVar.a();
        }
        wVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            p.c(this, this.f4038A);
        }
        this.f4038A = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4041m.f4058d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC0422a interfaceC0422a = this.f4040l;
            if (interfaceC0422a != null) {
                interfaceC0422a.b();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC0422a interfaceC0422a2 = this.f4040l;
        if (interfaceC0422a2 != null) {
            interfaceC0422a2.b();
        }
        return true;
    }

    public final void setParentLayoutDirection(O0.k kVar) {
        this.f4048t = kVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1setPopupContentSizefhxjrPA(O0.j jVar) {
        this.f4049u.setValue(jVar);
    }

    public final void setPositionProvider(D d3) {
        this.f4047s = d3;
    }

    public final void setTestTag(String str) {
        this.f4042n = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractC1088a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i3) {
    }
}
