package g;

import L.T;
import L.o0;
import L.p0;
import L.q0;
import L.r0;
import L.z0;
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
import com.winfour.winrandom.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.InterfaceC0180x;
import l.MenuC0169m;
import m.InterfaceC0222k0;
import m.n1;
import m.o1;

/* loaded from: classes.dex */
public final class q implements L.r, InterfaceC0222k0, InterfaceC0180x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f2354b;

    public /* synthetic */ q(A a2, int i) {
        this.f2353a = i;
        this.f2354b = a2;
    }

    @Override // l.InterfaceC0180x
    public void b(MenuC0169m menuC0169m, boolean z2) {
        z zVar;
        switch (this.f2353a) {
            case 2:
                this.f2354b.p(menuC0169m);
                break;
            default:
                MenuC0169m k2 = menuC0169m.k();
                int i = 0;
                boolean z3 = k2 != menuC0169m;
                if (z3) {
                    menuC0169m = k2;
                }
                A a2 = this.f2354b;
                z[] zVarArr = a2.f2211M;
                int length = zVarArr != null ? zVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        zVar = null;
                    } else {
                        zVar = zVarArr[i];
                        if (zVar == null || zVar.f2370h != menuC0169m) {
                            i++;
                        }
                    }
                }
                if (zVar != null) {
                    if (!z3) {
                        a2.r(zVar, z2);
                        break;
                    } else {
                        a2.n(zVar.f2364a, zVar, k2);
                        a2.r(zVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // L.r
    public z0 d(View view, z0 z0Var) {
        int i;
        boolean z2;
        z0 z0Var2;
        boolean z3;
        int d = z0Var.d();
        A a2 = this.f2354b;
        a2.getClass();
        int d2 = z0Var.d();
        ActionBarContextView actionBarContextView = a2.f2245v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a2.f2245v.getLayoutParams();
            if (a2.f2245v.isShown()) {
                if (a2.f2228d0 == null) {
                    a2.f2228d0 = new Rect();
                    a2.f2229e0 = new Rect();
                }
                Rect rect = a2.f2228d0;
                Rect rect2 = a2.f2229e0;
                rect.set(z0Var.b(), z0Var.d(), z0Var.c(), z0Var.a());
                ViewGroup viewGroup = a2.f2201B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = o1.f3158a;
                    n1.a(viewGroup, rect, rect2);
                } else {
                    if (!o1.f3158a) {
                        o1.f3158a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            o1.f3159b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                o1.f3159b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = o1.f3159b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e2) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = a2.f2201B;
                WeakHashMap weakHashMap = T.f490a;
                z0 a3 = L.I.a(viewGroup2);
                int b2 = a3 == null ? 0 : a3.b();
                int c2 = a3 == null ? 0 : a3.c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                Context context = a2.f2234k;
                if (i2 <= 0 || a2.f2203D != null) {
                    View view2 = a2.f2203D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            a2.f2203D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    a2.f2203D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    a2.f2201B.addView(a2.f2203D, -1, layoutParams);
                }
                View view4 = a2.f2203D;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = a2.f2203D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? B.b.a(context, R.color.abc_decor_view_status_guard_light) : B.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!a2.f2207I && r11) {
                    d2 = 0;
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
                a2.f2245v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = a2.f2203D;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d != d2) {
            int b3 = z0Var.b();
            int c3 = z0Var.c();
            int a4 = z0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            r0 q0Var = i7 >= 30 ? new q0(z0Var) : i7 >= 29 ? new p0(z0Var) : new o0(z0Var);
            q0Var.g(D.c.b(b3, d2, c3, a4));
            z0Var2 = q0Var.b();
        } else {
            z0Var2 = z0Var;
        }
        WeakHashMap weakHashMap2 = T.f490a;
        WindowInsets f2 = z0Var2.f();
        if (f2 == null) {
            return z0Var2;
        }
        WindowInsets b4 = L.F.b(view, f2);
        return !b4.equals(f2) ? z0.g(view, b4) : z0Var2;
    }

    @Override // l.InterfaceC0180x
    public boolean j(MenuC0169m menuC0169m) {
        Window.Callback callback;
        switch (this.f2353a) {
            case 2:
                Window.Callback callback2 = this.f2354b.f2235l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0169m);
                    break;
                }
                break;
            default:
                if (menuC0169m == menuC0169m.k()) {
                    A a2 = this.f2354b;
                    if (a2.G && (callback = a2.f2235l.getCallback()) != null && !a2.f2216R) {
                        callback.onMenuOpened(108, menuC0169m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
