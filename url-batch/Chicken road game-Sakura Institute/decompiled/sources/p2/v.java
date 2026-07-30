package p2;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.android.installreferrer.R;
import g0.e0;
import g0.g1;
import g0.p1;
import g0.t0;
import java.util.UUID;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v extends s1.a {
    public final Rect A;
    public final q0.t B;
    public Object C;
    public final g1 D;
    public boolean E;
    public final int[] F;

    /* renamed from: n, reason: collision with root package name */
    public q6.a f7178n;

    /* renamed from: o, reason: collision with root package name */
    public z f7179o;

    /* renamed from: p, reason: collision with root package name */
    public String f7180p;

    /* renamed from: q, reason: collision with root package name */
    public final View f7181q;

    /* renamed from: r, reason: collision with root package name */
    public final x f7182r;

    /* renamed from: s, reason: collision with root package name */
    public final WindowManager f7183s;

    /* renamed from: t, reason: collision with root package name */
    public final WindowManager.LayoutParams f7184t;

    /* renamed from: u, reason: collision with root package name */
    public y f7185u;

    /* renamed from: v, reason: collision with root package name */
    public m2.k f7186v;

    /* renamed from: w, reason: collision with root package name */
    public final g1 f7187w;

    /* renamed from: x, reason: collision with root package name */
    public final g1 f7188x;

    /* renamed from: y, reason: collision with root package name */
    public m2.i f7189y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f7190z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q6.a aVar, z zVar, String str, View view, m2.b bVar, y yVar, UUID uuid) {
        super(view.getContext());
        x wVar = Build.VERSION.SDK_INT >= 29 ? new w() : new x();
        this.f7178n = aVar;
        this.f7179o = zVar;
        this.f7180p = str;
        this.f7181q = view;
        this.f7182r = wVar;
        Object systemService = view.getContext().getSystemService("window");
        r6.k.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f7183s = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        z zVar2 = this.f7179o;
        boolean b9 = l.b(view);
        boolean z8 = zVar2.f7192b;
        int i7 = zVar2.f7191a;
        if (z8 && b9) {
            i7 |= 8192;
        } else if (z8 && !b9) {
            i7 &= -8193;
        }
        layoutParams.flags = i7;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f7184t = layoutParams;
        this.f7185u = yVar;
        this.f7186v = m2.k.f6322f;
        t0 t0Var = t0.f3903k;
        this.f7187w = g0.d.J(null, t0Var);
        this.f7188x = g0.d.J(null, t0Var);
        this.f7190z = g0.d.C(new r0(23, this));
        this.A = new Rect();
        this.B = new q0.t(new i(this, 2));
        setId(android.R.id.content);
        q0.k(this, q0.f(view));
        setTag(R.id.view_tree_view_model_store_owner, q0.g(view));
        setTag(R.id.view_tree_saved_state_registry_owner, v1.g.i(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(bVar.y((float) 8));
        setOutlineProvider(new c1.o(2));
        this.D = g0.d.J(p.f7158a, t0Var);
        this.F = new int[2];
    }

    private final q6.e getContent() {
        return (q6.e) this.D.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p1.p getParentLayoutCoordinates() {
        return (p1.p) this.f7188x.getValue();
    }

    private final void setContent(q6.e eVar) {
        this.D.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(p1.p pVar) {
        this.f7188x.setValue(pVar);
    }

    @Override // s1.a
    public final void a(int i7, g0.p pVar) {
        pVar.S(-857613600);
        if ((((pVar.h(this) ? 4 : 2) | i7) & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            getContent().d(pVar, 0);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a2.a(i7, 9, this);
        }
    }

    @Override // s1.a
    public final void d(boolean z8, int i7, int i8, int i9, int i10) {
        super.d(z8, i7, i8, i9, i10);
        this.f7179o.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f7184t;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f7182r.getClass();
        this.f7183s.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f7179o.f7193c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                q6.a aVar = this.f7178n;
                if (aVar != null) {
                    aVar.a();
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // s1.a
    public final void e(int i7, int i8) {
        this.f7179o.getClass();
        super.e(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f7190z.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f7184t;
    }

    public final m2.k getParentLayoutDirection() {
        return this.f7186v;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final m2.j m6getPopupContentSizebOM6tXw() {
        return (m2.j) this.f7187w.getValue();
    }

    public final y getPositionProvider() {
        return this.f7185u;
    }

    @Override // s1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.E;
    }

    public final String getTestTag() {
        return this.f7180p;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void h(g0.r rVar, q6.e eVar) {
        setParentCompositionContext(rVar);
        setContent(eVar);
        this.E = true;
    }

    public final void i(q6.a aVar, z zVar, String str, m2.k kVar) {
        int i7;
        this.f7178n = aVar;
        this.f7180p = str;
        if (!r6.k.a(this.f7179o, zVar)) {
            this.f7179o = zVar;
            boolean b9 = l.b(this.f7181q);
            boolean z8 = zVar.f7192b;
            int i8 = zVar.f7191a;
            if (z8 && b9) {
                i8 |= 8192;
            } else if (z8 && !b9) {
                i8 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f7184t;
            layoutParams.flags = i8;
            this.f7182r.getClass();
            this.f7183s.updateViewLayout(this, layoutParams);
        }
        int ordinal = kVar.ordinal();
        if (ordinal != 0) {
            i7 = 1;
            if (ordinal != 1) {
                throw new b4.c();
            }
        } else {
            i7 = 0;
        }
        super.setLayoutDirection(i7);
    }

    public final void j() {
        p1.p parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.O()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long V = parentLayoutCoordinates.V();
            long f9 = parentLayoutCoordinates.f(0L);
            long c4 = a8.m.c(Math.round(y0.c.d(f9)), Math.round(y0.c.e(f9)));
            int i7 = (int) (c4 >> 32);
            int i8 = (int) (c4 & 4294967295L);
            m2.i iVar = new m2.i(i7, i8, ((int) (V >> 32)) + i7, ((int) (V & 4294967295L)) + i8);
            if (iVar.equals(this.f7189y)) {
                return;
            }
            this.f7189y = iVar;
            l();
        }
    }

    public final void k(p1.p pVar) {
        setParentLayoutCoordinates(pVar);
        j();
    }

    public final void l() {
        m2.j m6getPopupContentSizebOM6tXw;
        m2.i iVar = this.f7189y;
        if (iVar == null || (m6getPopupContentSizebOM6tXw = m6getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j8 = m6getPopupContentSizebOM6tXw.f6321a;
        x xVar = this.f7182r;
        xVar.getClass();
        View view = this.f7181q;
        Rect rect = this.A;
        view.getWindowVisibleDisplayFrame(rect);
        long G = j1.c.G(rect.right - rect.left, rect.bottom - rect.top);
        r6.u uVar = new r6.u();
        uVar.f7967f = 0L;
        this.B.c(this, b.f7121m, new u(uVar, this, iVar, G, j8));
        long j9 = uVar.f7967f;
        WindowManager.LayoutParams layoutParams = this.f7184t;
        layoutParams.x = (int) (j9 >> 32);
        layoutParams.y = (int) (j9 & 4294967295L);
        if (this.f7179o.f7195e) {
            xVar.a(this, (int) (G >> 32), (int) (G & 4294967295L));
        }
        this.f7183s.updateViewLayout(this, layoutParams);
    }

    @Override // s1.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B.d();
        if (!this.f7179o.f7193c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.C == null) {
            this.C = m.a(this.f7178n);
        }
        m.b(this, this.C);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q0.t tVar = this.B;
        e5.a aVar = tVar.f7460g;
        if (aVar != null) {
            aVar.c();
        }
        tVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            m.c(this, this.C);
        }
        this.C = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7179o.f7194d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            q6.a aVar = this.f7178n;
            if (aVar != null) {
                aVar.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            q6.a aVar2 = this.f7178n;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(m2.k kVar) {
        this.f7186v = kVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7setPopupContentSizefhxjrPA(m2.j jVar) {
        this.f7187w.setValue(jVar);
    }

    public final void setPositionProvider(y yVar) {
        this.f7185u = yVar;
    }

    public final void setTestTag(String str) {
        this.f7180p = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public s1.a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
    }
}
