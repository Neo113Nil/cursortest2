package y0;

import H1.l;
import I0.h;
import M.E;
import M.P;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.j;
import com.winpower.neonfit.R;
import h.B;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.C0288n;

/* renamed from: y0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC0426e extends B {

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f4722f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f4723g;

    /* renamed from: h, reason: collision with root package name */
    public CoordinatorLayout f4724h;
    public FrameLayout i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4725k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4726l;

    /* renamed from: m, reason: collision with root package name */
    public C0425d f4727m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4728n;

    /* renamed from: o, reason: collision with root package name */
    public h f4729o;

    /* renamed from: p, reason: collision with root package name */
    public C0424c f4730p;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f4722f == null) {
            i();
        }
        super.cancel();
    }

    public final void i() {
        if (this.f4723g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f4723g = frameLayout;
            this.f4724h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f4723g.findViewById(R.id.design_bottom_sheet);
            this.i = frameLayout2;
            BottomSheetBehavior A2 = BottomSheetBehavior.A(frameLayout2);
            this.f4722f = A2;
            C0424c c0424c = this.f4730p;
            ArrayList arrayList = A2.f2278W;
            if (!arrayList.contains(c0424c)) {
                arrayList.add(c0424c);
            }
            this.f4722f.F(this.j);
            this.f4729o = new h(this.f4722f, this.i);
        }
    }

    public final FrameLayout j(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2 = 4;
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f4723g.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f4728n) {
            FrameLayout frameLayout = this.i;
            C0288n c0288n = new C0288n(i2, this);
            WeakHashMap weakHashMap = P.f711a;
            E.u(frameLayout, c0288n);
        }
        this.i.removeAllViews();
        if (layoutParams == null) {
            this.i.addView(view);
        } else {
            this.i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new j(i2, this));
        P.l(this.i, new H0.a(3, this));
        this.i.setOnTouchListener(new P0.b(1));
        return this.f4723g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z2 = this.f4728n && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f4723g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z2);
            }
            CoordinatorLayout coordinatorLayout = this.f4724h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z2);
            }
            l.W(window, !z2);
            C0425d c0425d = this.f4727m;
            if (c0425d != null) {
                c0425d.e(window);
            }
        }
        h hVar = this.f4729o;
        if (hVar == null) {
            return;
        }
        boolean z3 = this.j;
        View view = (View) hVar.f593d;
        I0.e eVar = (I0.e) hVar.f591b;
        if (z3) {
            if (eVar != null) {
                eVar.b((I0.b) hVar.f592c, view, false);
            }
        } else if (eVar != null) {
            eVar.c(view);
        }
    }

    @Override // h.B, b.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        I0.e eVar;
        C0425d c0425d = this.f4727m;
        if (c0425d != null) {
            c0425d.e(null);
        }
        h hVar = this.f4729o;
        if (hVar == null || (eVar = (I0.e) hVar.f591b) == null) {
            return;
        }
        eVar.c((View) hVar.f593d);
    }

    @Override // b.m, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f4722f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f2267L != 5) {
            return;
        }
        bottomSheetBehavior.H(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z2) {
        h hVar;
        super.setCancelable(z2);
        if (this.j != z2) {
            this.j = z2;
            BottomSheetBehavior bottomSheetBehavior = this.f4722f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.F(z2);
            }
            if (getWindow() == null || (hVar = this.f4729o) == null) {
                return;
            }
            boolean z3 = this.j;
            View view = (View) hVar.f593d;
            I0.e eVar = (I0.e) hVar.f591b;
            if (z3) {
                if (eVar != null) {
                    eVar.b((I0.b) hVar.f592c, view, false);
                }
            } else if (eVar != null) {
                eVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        if (z2 && !this.j) {
            this.j = true;
        }
        this.f4725k = z2;
        this.f4726l = true;
    }

    @Override // h.B, b.m, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(j(null, i, null));
    }

    @Override // h.B, b.m, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(j(view, 0, null));
    }

    @Override // h.B, b.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(j(view, 0, layoutParams));
    }
}
