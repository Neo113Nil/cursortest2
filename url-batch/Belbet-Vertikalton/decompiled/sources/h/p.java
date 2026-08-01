package h;

import M.InterfaceC0020p;
import M.P;
import M.i0;
import M.j0;
import M.k0;
import M.l0;
import M.t0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.winpower.neonfit.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.InterfaceC0240x;
import m.MenuC0229m;
import n.InterfaceC0281j0;
import n.m1;
import n.n1;

/* loaded from: classes.dex */
public final class p implements InterfaceC0020p, InterfaceC0281j0, InterfaceC0240x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f2818b;

    public /* synthetic */ p(z zVar, int i) {
        this.f2817a = i;
        this.f2818b = zVar;
    }

    @Override // m.InterfaceC0240x
    public void b(MenuC0229m menuC0229m, boolean z2) {
        y yVar;
        switch (this.f2817a) {
            case 2:
                this.f2818b.q(menuC0229m);
                break;
            default:
                MenuC0229m k2 = menuC0229m.k();
                int i = 0;
                boolean z3 = k2 != menuC0229m;
                if (z3) {
                    menuC0229m = k2;
                }
                z zVar = this.f2818b;
                y[] yVarArr = zVar.f2855M;
                int length = yVarArr != null ? yVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        yVar = null;
                    } else {
                        yVar = yVarArr[i];
                        if (yVar == null || yVar.f2834h != menuC0229m) {
                            i++;
                        }
                    }
                }
                if (yVar != null) {
                    if (!z3) {
                        zVar.r(yVar, z2);
                        break;
                    } else {
                        zVar.p(yVar.f2828a, yVar, k2);
                        zVar.r(yVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // M.InterfaceC0020p
    public t0 e(View view, t0 t0Var) {
        int i;
        boolean z2;
        t0 t0Var2;
        boolean z3;
        int d2 = t0Var.d();
        z zVar = this.f2818b;
        zVar.getClass();
        int d3 = t0Var.d();
        ActionBarContextView actionBarContextView = zVar.f2888v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zVar.f2888v.getLayoutParams();
            if (zVar.f2888v.isShown()) {
                if (zVar.f2872d0 == null) {
                    zVar.f2872d0 = new Rect();
                    zVar.f2873e0 = new Rect();
                }
                Rect rect = zVar.f2872d0;
                Rect rect2 = zVar.f2873e0;
                rect.set(t0Var.b(), t0Var.d(), t0Var.c(), t0Var.a());
                ViewGroup viewGroup = zVar.f2845B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = n1.f3683a;
                    m1.a(viewGroup, rect, rect2);
                } else {
                    if (!n1.f3683a) {
                        n1.f3683a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            n1.f3684b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                n1.f3684b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = n1.f3684b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = zVar.f2845B;
                WeakHashMap weakHashMap = P.f711a;
                t0 a2 = M.F.a(viewGroup2);
                int b2 = a2 == null ? 0 : a2.b();
                int c2 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                Context context = zVar.f2877k;
                if (i2 <= 0 || zVar.f2847D != null) {
                    View view2 = zVar.f2847D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            zVar.f2847D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    zVar.f2847D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    zVar.f2845B.addView(zVar.f2847D, -1, layoutParams);
                }
                View view4 = zVar.f2847D;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = zVar.f2847D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? C.b.a(context, R.color.abc_decor_view_status_guard_light) : C.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!zVar.f2851I && r11) {
                    d3 = 0;
                }
                z2 = r11;
                r11 = z3;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = false;
                } else {
                    z2 = false;
                    r11 = false;
                }
            }
            if (r11) {
                zVar.f2888v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = zVar.f2847D;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d2 != d3) {
            int b3 = t0Var.b();
            int c3 = t0Var.c();
            int a3 = t0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            l0 k0Var = i7 >= 30 ? new k0(t0Var) : i7 >= 29 ? new j0(t0Var) : new i0(t0Var);
            k0Var.g(E.c.b(b3, d3, c3, a3));
            t0Var2 = k0Var.b();
        } else {
            t0Var2 = t0Var;
        }
        WeakHashMap weakHashMap2 = P.f711a;
        WindowInsets f2 = t0Var2.f();
        if (f2 == null) {
            return t0Var2;
        }
        WindowInsets b4 = M.C.b(view, f2);
        return !b4.equals(f2) ? t0.g(view, b4) : t0Var2;
    }

    @Override // m.InterfaceC0240x
    public boolean g(MenuC0229m menuC0229m) {
        Window.Callback callback;
        switch (this.f2817a) {
            case 2:
                Window.Callback callback2 = this.f2818b.f2878l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0229m);
                    break;
                }
                break;
            default:
                if (menuC0229m == menuC0229m.k()) {
                    z zVar = this.f2818b;
                    if (zVar.f2850G && (callback = zVar.f2878l.getCallback()) != null && !zVar.f2860R) {
                        callback.onMenuOpened(108, menuC0229m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
