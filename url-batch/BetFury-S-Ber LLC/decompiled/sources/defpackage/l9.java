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
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class l9 extends x4 {
    public BottomSheetBehavior l;
    public FrameLayout m;
    public CoordinatorLayout n;
    public FrameLayout o;
    public boolean p;
    public boolean q;
    public boolean r;
    public k9 s;
    public boolean t;
    public s6 u;
    public j9 v;

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
            j9 j9Var = this.v;
            ArrayList arrayList = C.a0;
            if (!arrayList.contains(j9Var)) {
                arrayList.add(j9Var);
            }
            this.l.J(this.p);
            this.u = new s6(this.l, this.o);
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
            o0 o0Var = new o0(11, this);
            WeakHashMap weakHashMap = hm0.a;
            zl0.c(frameLayout, o0Var);
        }
        this.o.removeAllViews();
        FrameLayout frameLayout2 = this.o;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new y0(2, this));
        hm0.m(this.o, new m8(1, this));
        this.o.setOnTouchListener(new o8(1));
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
        k9 k9Var;
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
                    ud0.z(window, !z);
                    k9Var = this.s;
                    if (k9Var != null) {
                        k9Var.e(window);
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
            ud0.z(window, !z);
            k9Var = this.s;
            if (k9Var != null) {
            }
        }
        s6 s6Var = this.u;
        if (s6Var == null) {
            return;
        }
        View view = (View) s6Var.d;
        boolean z2 = this.p;
        a00 a00Var = (a00) s6Var.b;
        if (z2) {
            if (a00Var != null) {
                a00Var.b((zz) s6Var.c, view, false);
            }
        } else if (a00Var != null) {
            a00Var.c(view);
        }
    }

    @Override // defpackage.x4, defpackage.ae, android.app.Dialog
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
        a00 a00Var;
        k9 k9Var = this.s;
        if (k9Var != null) {
            k9Var.e(null);
        }
        s6 s6Var = this.u;
        if (s6Var == null || (a00Var = (a00) s6Var.b) == null) {
            return;
        }
        a00Var.c((View) s6Var.d);
    }

    @Override // defpackage.ae, android.app.Dialog
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
        s6 s6Var;
        super.setCancelable(z);
        if (this.p != z) {
            this.p = z;
            BottomSheetBehavior bottomSheetBehavior = this.l;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.J(z);
            }
            if (getWindow() == null || (s6Var = this.u) == null) {
                return;
            }
            View view = (View) s6Var.d;
            boolean z2 = this.p;
            a00 a00Var = (a00) s6Var.b;
            if (z2) {
                if (a00Var != null) {
                    a00Var.b((zz) s6Var.c, view, false);
                }
            } else if (a00Var != null) {
                a00Var.c(view);
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

    @Override // defpackage.x4, defpackage.ae, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // defpackage.x4, defpackage.ae, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // defpackage.x4, defpackage.ae, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
