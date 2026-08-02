package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class el extends cs implements hc {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    ek f;
    fg g;
    ff h;
    public int i;
    public boolean j;
    public boolean k;
    public fo l;
    boolean m;
    final yv n;
    final yv o;
    mk p;
    final kee q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public el(Activity activity, boolean z) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new ei(this);
        this.o = new ej(this);
        this.q = new kee(this);
        View decorView = activity.getWindow().getDecorView();
        A(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(R.id.content);
    }

    private final void A(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.apps.authenticator2.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((el) actionBarOverlayLayout.h).i = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int i2 = yq.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        }
        View findViewById = view.findViewById(com.google.android.apps.authenticator2.R.id.action_bar);
        if (!(findViewById instanceof Toolbar)) {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.p = ((Toolbar) findViewById).z();
        this.d = (ActionBarContextView) view.findViewById(com.google.android.apps.authenticator2.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.apps.authenticator2.R.id.action_bar_container);
        this.c = actionBarContainer;
        mk mkVar = this.p;
        if (mkVar == null || this.d == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = mkVar.a();
        if ((this.p.b & 4) != 0) {
            this.u = true;
        }
        Context context = this.a;
        int i3 = context.getApplicationInfo().targetSdkVersion;
        e.e(context);
        B();
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, em.a, com.google.android.apps.authenticator2.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            actionBarOverlayLayout2.k(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.c;
            int i4 = yq.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private final void B() {
        this.p.a.requestLayout();
        this.b.e = false;
    }

    static boolean z(boolean z, boolean z2) {
        return z2 || !z;
    }

    @Override // defpackage.cs
    public final int a() {
        return this.p.b;
    }

    @Override // defpackage.cs
    public final Context b() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.apps.authenticator2.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.cs
    public final fg c(ff ffVar) {
        ek ekVar = this.f;
        if (ekVar != null) {
            ekVar.f();
        }
        this.b.k(false);
        this.d.i();
        ek ekVar2 = new ek(this, this.d.getContext(), ffVar);
        gd gdVar = ekVar2.a;
        gdVar.s();
        try {
            if (!ekVar2.b.c(ekVar2, gdVar)) {
                return null;
            }
            this.f = ekVar2;
            ekVar2.g();
            this.d.h(ekVar2);
            w(true);
            return ekVar2;
        } finally {
            ekVar2.a.r();
        }
    }

    @Override // defpackage.cs
    public final void d(boolean z) {
        if (z == this.v) {
            return;
        }
        this.v = z;
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cr) arrayList.get(i)).a();
        }
    }

    @Override // defpackage.cs
    public final void f(boolean z) {
        if (this.u) {
            return;
        }
        x(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.cs
    public final void g(int i) {
        this.p.g(i);
    }

    @Override // defpackage.cs
    public final void h(boolean z) {
        fo foVar;
        this.z = z;
        if (z || (foVar = this.l) == null) {
            return;
        }
        foVar.a();
    }

    @Override // defpackage.cs
    public final void i(int i) {
        j(this.a.getString(i));
    }

    @Override // defpackage.cs
    public final void j(CharSequence charSequence) {
        this.p.h(charSequence);
    }

    @Override // defpackage.cs
    public final void k(CharSequence charSequence) {
        this.p.j(charSequence);
    }

    @Override // defpackage.cs
    public final boolean m() {
        mk mkVar = this.p;
        if (mkVar == null || !mkVar.k()) {
            return false;
        }
        mkVar.b();
        return true;
    }

    @Override // defpackage.cs
    public final boolean o(int i, KeyEvent keyEvent) {
        ek ekVar = this.f;
        if (ekVar == null) {
            return false;
        }
        int deviceId = keyEvent != null ? keyEvent.getDeviceId() : -1;
        gd gdVar = ekVar.a;
        gdVar.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
        return gdVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.cs
    public final void r() {
        e.e(this.a);
        B();
    }

    @Override // defpackage.cs
    public final void s() {
        x(2, 2);
    }

    @Override // defpackage.cs
    public final void t() {
        x(0, 8);
    }

    @Override // defpackage.cs
    public final void u() {
        this.p.e(null);
    }

    @Override // defpackage.cs
    public final void v() {
        x(4, 4);
    }

    public final void w(boolean z) {
        brn g;
        brn brnVar;
        boolean z2 = this.x;
        if (z) {
            if (!z2) {
                this.x = true;
                y(false);
            }
        } else if (z2) {
            this.x = false;
            y(false);
        }
        if (!this.c.isLaidOut()) {
            mk mkVar = this.p;
            if (z) {
                mkVar.i(4);
                this.d.setVisibility(0);
                return;
            } else {
                mkVar.i(0);
                this.d.setVisibility(8);
                return;
            }
        }
        mk mkVar2 = this.p;
        if (z) {
            g = mkVar2.o(4, 100L);
            brnVar = this.d.g(0, 200L);
        } else {
            brn o = mkVar2.o(0, 200L);
            g = this.d.g(8, 100L);
            brnVar = o;
        }
        fo foVar = new fo();
        ArrayList arrayList = foVar.a;
        arrayList.add(g);
        View view = (View) ((WeakReference) g.a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ((WeakReference) brnVar.a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(brnVar);
        foVar.b();
    }

    public final void x(int i, int i2) {
        mk mkVar = this.p;
        int i3 = mkVar.b;
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        mkVar.d((i & i2) | ((~i2) & i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(boolean z) {
        View view;
        View view2;
        ActionBarOverlayLayout actionBarOverlayLayout;
        View view3;
        boolean z2 = z(this.k, this.x);
        boolean z3 = this.y;
        if (!z2) {
            if (z3) {
                this.y = false;
                fo foVar = this.l;
                if (foVar != null) {
                    foVar.a();
                }
                if (this.i == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    fo foVar2 = new fo();
                    float f = -this.c.getHeight();
                    if (z) {
                        this.c.getLocationInWindow(new int[]{0, 0});
                        f -= r6[1];
                    }
                    brn s2 = yq.s(this.c);
                    s2.Q(f);
                    s2.ac(this.q);
                    foVar2.f(s2);
                    if (this.j && (view = this.e) != null) {
                        brn s3 = yq.s(view);
                        s3.Q(f);
                        foVar2.f(s3);
                    }
                    foVar2.d(r);
                    foVar2.c();
                    foVar2.e(this.n);
                    this.l = foVar2;
                    foVar2.b();
                    return;
                }
                this.n.a();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.y = true;
        fo foVar3 = this.l;
        if (foVar3 != null) {
            foVar3.a();
        }
        this.c.setVisibility(0);
        if (this.i == 0) {
            if (!this.z) {
                if (z) {
                    z = true;
                }
            }
            this.c.setTranslationY(0.0f);
            float f2 = -this.c.getHeight();
            if (z) {
                this.c.getLocationInWindow(new int[]{0, 0});
                f2 -= r6[1];
            }
            this.c.setTranslationY(f2);
            fo foVar4 = new fo();
            brn s4 = yq.s(this.c);
            s4.Q(0.0f);
            s4.ac(this.q);
            foVar4.f(s4);
            if (this.j && (view3 = this.e) != null) {
                view3.setTranslationY(f2);
                brn s5 = yq.s(this.e);
                s5.Q(0.0f);
                foVar4.f(s5);
            }
            foVar4.d(s);
            foVar4.c();
            foVar4.e(this.o);
            this.l = foVar4;
            foVar4.b();
            actionBarOverlayLayout = this.b;
            if (actionBarOverlayLayout == null) {
                int i = yq.a;
                actionBarOverlayLayout.requestApplyInsets();
                return;
            }
            return;
        }
        this.c.setAlpha(1.0f);
        this.c.setTranslationY(0.0f);
        if (this.j && (view2 = this.e) != null) {
            view2.setTranslationY(0.0f);
        }
        this.o.a();
        actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout == null) {
        }
    }

    public el(Dialog dialog) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new ei(this);
        this.o = new ej(this);
        this.q = new kee(this);
        A(dialog.getWindow().getDecorView());
    }
}
