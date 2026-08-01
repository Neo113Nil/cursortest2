package y0;

import H1.l;
import M.E;
import M.P;
import M.t0;
import M.u0;
import M.w0;
import N0.g;
import a.AbstractC0058a;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* renamed from: y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425d extends AbstractC0422a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f4718a;

    /* renamed from: b, reason: collision with root package name */
    public final t0 f4719b;

    /* renamed from: c, reason: collision with root package name */
    public Window f4720c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4721d;

    public C0425d(View view, t0 t0Var) {
        ColorStateList g2;
        this.f4719b = t0Var;
        g gVar = BottomSheetBehavior.A(view).i;
        if (gVar != null) {
            g2 = gVar.f900a.f888c;
        } else {
            WeakHashMap weakHashMap = P.f711a;
            g2 = E.g(view);
        }
        if (g2 != null) {
            this.f4718a = Boolean.valueOf(l.D(g2.getDefaultColor()));
            return;
        }
        ColorStateList t2 = AbstractC0058a.t(view.getBackground());
        Integer valueOf = t2 != null ? Integer.valueOf(t2.getDefaultColor()) : null;
        if (valueOf != null) {
            this.f4718a = Boolean.valueOf(l.D(valueOf.intValue()));
        } else {
            this.f4718a = null;
        }
    }

    @Override // y0.AbstractC0422a
    public final void a(View view) {
        d(view);
    }

    @Override // y0.AbstractC0422a
    public final void b(View view) {
        d(view);
    }

    @Override // y0.AbstractC0422a
    public final void c(View view, int i) {
        d(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(View view) {
        u0 u0Var;
        WindowInsetsController insetsController;
        u0 u0Var2;
        WindowInsetsController insetsController2;
        int top = view.getTop();
        t0 t0Var = this.f4719b;
        if (top < t0Var.d()) {
            Window window = this.f4720c;
            if (window != null) {
                Boolean bool = this.f4718a;
                boolean booleanValue = bool == null ? this.f4721d : bool.booleanValue();
                C1.d dVar = new C1.d(window.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    w0 w0Var = new w0(insetsController2, dVar);
                    w0Var.f800c = window;
                    u0Var2 = w0Var;
                } else {
                    u0Var2 = new u0(window, dVar);
                }
                u0Var2.d0(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), t0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f4720c;
            if (window2 != null) {
                boolean z2 = this.f4721d;
                C1.d dVar2 = new C1.d(window2.getDecorView());
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window2.getInsetsController();
                    w0 w0Var2 = new w0(insetsController, dVar2);
                    w0Var2.f800c = window2;
                    u0Var = w0Var2;
                } else {
                    u0Var = new u0(window2, dVar2);
                }
                u0Var.d0(z2);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Window window) {
        u0 u0Var;
        WindowInsetsController insetsController;
        if (this.f4720c == window) {
            return;
        }
        this.f4720c = window;
        if (window != null) {
            C1.d dVar = new C1.d(window.getDecorView());
            if (Build.VERSION.SDK_INT >= 30) {
                insetsController = window.getInsetsController();
                w0 w0Var = new w0(insetsController, dVar);
                w0Var.f800c = window;
                u0Var = w0Var;
            } else {
                u0Var = new u0(window, dVar);
            }
            this.f4721d = u0Var.N();
        }
    }
}
