package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class k8 extends g8 {
    public final Boolean a;
    public final rb0 b;
    public Window c;
    public boolean d;

    public k8(View view, rb0 rb0Var) {
        this.b = rb0Var;
        ct ctVar = BottomSheetBehavior.C(view).j;
        ColorStateList backgroundTintList = ctVar != null ? ctVar.g.c : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(jw.H(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList r = zo.r(view.getBackground());
        Integer valueOf = r != null ? Integer.valueOf(r.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(jw.H(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.g8
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.g8
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.g8
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        rb0 rb0Var = this.b;
        if (top < rb0Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean booleanValue = bool == null ? this.d : bool.booleanValue();
                vw vwVar = new vw(window.getDecorView(), 12);
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new vb0(window, vwVar) : i >= 30 ? new ub0(window, vwVar) : new sb0(window, vwVar)).d(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), rb0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                vw vwVar2 = new vw(window2.getDecorView(), 12);
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new vb0(window2, vwVar2) : i2 >= 30 ? new ub0(window2, vwVar2) : new sb0(window2, vwVar2)).d(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            vw vwVar = new vw(window.getDecorView(), 12);
            int i = Build.VERSION.SDK_INT;
            this.d = (i >= 35 ? new vb0(window, vwVar) : i >= 30 ? new ub0(window, vwVar) : new sb0(window, vwVar)).a();
        }
    }
}
