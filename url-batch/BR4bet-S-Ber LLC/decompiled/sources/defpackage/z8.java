package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moontiko.really.admiralcasino.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class z8 extends p4 {
    public BottomSheetBehavior l;
    public FrameLayout m;
    public CoordinatorLayout n;
    public FrameLayout o;
    public boolean p;
    public boolean q;
    public boolean r;
    public y8 s;
    public boolean t;
    public k6 u;
    public x8 v;

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
            x8 x8Var = this.v;
            ArrayList arrayList = C.a0;
            if (!arrayList.contains(x8Var)) {
                arrayList.add(x8Var);
            }
            this.l.J(this.p);
            this.u = new k6(this.l, this.o);
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
            rc0 rc0Var = new rc0(12, this);
            WeakHashMap weakHashMap = ic0.a;
            ac0.c(frameLayout, rc0Var);
        }
        this.o.removeAllViews();
        FrameLayout frameLayout2 = this.o;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new v0(2, this));
        ic0.m(this.o, new a8(1, this));
        this.o.setOnTouchListener(new d8(1));
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
        y8 y8Var;
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
                    xf.H(window, !z);
                    y8Var = this.s;
                    if (y8Var != null) {
                        y8Var.e(window);
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
            xf.H(window, !z);
            y8Var = this.s;
            if (y8Var != null) {
            }
        }
        k6 k6Var = this.u;
        if (k6Var == null) {
            return;
        }
        View view = (View) k6Var.i;
        boolean z2 = this.p;
        vu vuVar = (vu) k6Var.g;
        if (z2) {
            if (vuVar != null) {
                vuVar.b((uu) k6Var.h, view, false);
            }
        } else if (vuVar != null) {
            vuVar.c(view);
        }
    }

    @Override // defpackage.p4, defpackage.yc, android.app.Dialog
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
        vu vuVar;
        y8 y8Var = this.s;
        if (y8Var != null) {
            y8Var.e(null);
        }
        k6 k6Var = this.u;
        if (k6Var == null || (vuVar = (vu) k6Var.g) == null) {
            return;
        }
        vuVar.c((View) k6Var.i);
    }

    @Override // defpackage.yc, android.app.Dialog
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
        k6 k6Var;
        super.setCancelable(z);
        if (this.p != z) {
            this.p = z;
            BottomSheetBehavior bottomSheetBehavior = this.l;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.J(z);
            }
            if (getWindow() == null || (k6Var = this.u) == null) {
                return;
            }
            View view = (View) k6Var.i;
            boolean z2 = this.p;
            vu vuVar = (vu) k6Var.g;
            if (z2) {
                if (vuVar != null) {
                    vuVar.b((uu) k6Var.h, view, false);
                }
            } else if (vuVar != null) {
                vuVar.c(view);
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

    @Override // defpackage.p4, defpackage.yc, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // defpackage.p4, defpackage.yc, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // defpackage.p4, defpackage.yc, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
