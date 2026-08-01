package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class l8 extends f4 {
    public BottomSheetBehavior l;
    public FrameLayout m;
    public CoordinatorLayout n;
    public FrameLayout o;
    public boolean p;
    public boolean q;
    public boolean r;
    public k8 s;
    public boolean t;
    public a6 u;
    public j8 v;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.l == null) {
            h();
        }
        super.cancel();
    }

    public final void h() {
        if (this.m == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.m = frameLayout;
            this.n = (CoordinatorLayout) this.m.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.m.findViewById(R.id.design_bottom_sheet);
            this.o = frameLayout2;
            BottomSheetBehavior C = BottomSheetBehavior.C(frameLayout2);
            this.l = C;
            j8 j8Var = this.v;
            ArrayList arrayList = C.a0;
            if (!arrayList.contains(j8Var)) {
                arrayList.add(j8Var);
            }
            this.l.J(this.p);
            this.u = new a6(this.l, this.o);
        }
    }

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) {
        h();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.m.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.t) {
            FrameLayout frameLayout = this.m;
            k0 k0Var = new k0(9, this);
            WeakHashMap weakHashMap = x80.a;
            p80.c(frameLayout, k0Var);
        }
        this.o.removeAllViews();
        FrameLayout frameLayout2 = this.o;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new u0(2, this));
        x80.m(this.o, new o7(1, this));
        this.o.setOnTouchListener(new q7(1));
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        boolean z;
        FrameLayout frameLayout;
        CoordinatorLayout coordinatorLayout;
        k8 k8Var;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.t) {
                if (Color.alpha(Build.VERSION.SDK_INT < 35 ? window.getNavigationBarColor() : 0) < 255) {
                    z = true;
                    frameLayout = this.m;
                    if (frameLayout != null) {
                        frameLayout.setFitsSystemWindows(!z);
                    }
                    coordinatorLayout = this.n;
                    if (coordinatorLayout != null) {
                        coordinatorLayout.setFitsSystemWindows(!z);
                    }
                    c90.a(window, !z);
                    k8Var = this.s;
                    if (k8Var != null) {
                        k8Var.e(window);
                    }
                }
            }
            z = false;
            frameLayout = this.m;
            if (frameLayout != null) {
            }
            coordinatorLayout = this.n;
            if (coordinatorLayout != null) {
            }
            c90.a(window, !z);
            k8Var = this.s;
            if (k8Var != null) {
            }
        }
        a6 a6Var = this.u;
        if (a6Var == null) {
            return;
        }
        View view = (View) a6Var.d;
        boolean z2 = this.p;
        ur urVar = (ur) a6Var.b;
        if (z2) {
            if (urVar != null) {
                urVar.b((tr) a6Var.c, view, false);
            }
        } else if (urVar != null) {
            urVar.c(view);
        }
    }

    @Override // defpackage.f4, defpackage.yb, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        ur urVar;
        k8 k8Var = this.s;
        if (k8Var != null) {
            k8Var.e(null);
        }
        a6 a6Var = this.u;
        if (a6Var == null || (urVar = (ur) a6Var.b) == null) {
            return;
        }
        urVar.c((View) a6Var.d);
    }

    @Override // defpackage.yb, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.l;
        if (bottomSheetBehavior == null || bottomSheetBehavior.P != 5) {
            return;
        }
        bottomSheetBehavior.L(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        a6 a6Var;
        super.setCancelable(z);
        if (this.p != z) {
            this.p = z;
            BottomSheetBehavior bottomSheetBehavior = this.l;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.J(z);
            }
            if (getWindow() == null || (a6Var = this.u) == null) {
                return;
            }
            View view = (View) a6Var.d;
            boolean z2 = this.p;
            ur urVar = (ur) a6Var.b;
            if (z2) {
                if (urVar != null) {
                    urVar.b((tr) a6Var.c, view, false);
                }
            } else if (urVar != null) {
                urVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.p) {
            this.p = true;
        }
        this.q = z;
        this.r = true;
    }

    @Override // defpackage.f4, defpackage.yb, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // defpackage.f4, defpackage.yb, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // defpackage.f4, defpackage.yb, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
