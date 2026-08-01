package g;

import K.T;
import K.o0;
import K.p0;
import K.q0;
import K.r0;
import K.z0;
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
import com.playbag.tripgear.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0175x;
import k.MenuC0164m;
import l.InterfaceC0215j0;
import l.h1;
import l.i1;

/* loaded from: classes.dex */
public final class q implements K.r, InterfaceC0215j0, InterfaceC0175x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0090A f2233b;

    public /* synthetic */ q(LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A, int i) {
        this.f2232a = i;
        this.f2233b = layoutInflaterFactory2C0090A;
    }

    @Override // k.InterfaceC0175x
    public void b(MenuC0164m menuC0164m, boolean z2) {
        z zVar;
        switch (this.f2232a) {
            case 2:
                this.f2233b.q(menuC0164m);
                break;
            default:
                MenuC0164m k2 = menuC0164m.k();
                int i = 0;
                boolean z3 = k2 != menuC0164m;
                if (z3) {
                    menuC0164m = k2;
                }
                LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = this.f2233b;
                z[] zVarArr = layoutInflaterFactory2C0090A.f2096M;
                int length = zVarArr != null ? zVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        zVar = null;
                    } else {
                        zVar = zVarArr[i];
                        if (zVar == null || zVar.h != menuC0164m) {
                            i++;
                        }
                    }
                }
                if (zVar != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0090A.r(zVar, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0090A.n(zVar.f2243a, zVar, k2);
                        layoutInflaterFactory2C0090A.r(zVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // K.r
    public z0 c(View view, z0 z0Var) {
        int i;
        boolean z2;
        z0 z0Var2;
        boolean z3;
        int d = z0Var.d();
        LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = this.f2233b;
        layoutInflaterFactory2C0090A.getClass();
        int d2 = z0Var.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0090A.f2130v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0090A.f2130v.getLayoutParams();
            if (layoutInflaterFactory2C0090A.f2130v.isShown()) {
                if (layoutInflaterFactory2C0090A.f2113d0 == null) {
                    layoutInflaterFactory2C0090A.f2113d0 = new Rect();
                    layoutInflaterFactory2C0090A.f2114e0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0090A.f2113d0;
                Rect rect2 = layoutInflaterFactory2C0090A.f2114e0;
                rect.set(z0Var.b(), z0Var.d(), z0Var.c(), z0Var.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0090A.f2086B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = i1.f2929a;
                    h1.a(viewGroup, rect, rect2);
                } else {
                    if (!i1.f2929a) {
                        i1.f2929a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            i1.f2930b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                i1.f2930b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = i1.f2930b;
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
                ViewGroup viewGroup2 = layoutInflaterFactory2C0090A.f2086B;
                WeakHashMap weakHashMap = T.f423a;
                z0 a2 = K.I.a(viewGroup2);
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
                Context context = layoutInflaterFactory2C0090A.f2119k;
                if (i2 <= 0 || layoutInflaterFactory2C0090A.f2088D != null) {
                    View view2 = layoutInflaterFactory2C0090A.f2088D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            layoutInflaterFactory2C0090A.f2088D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0090A.f2088D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    layoutInflaterFactory2C0090A.f2086B.addView(layoutInflaterFactory2C0090A.f2088D, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0090A.f2088D;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0090A.f2088D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0090A.f2092I && r11) {
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
                layoutInflaterFactory2C0090A.f2130v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0090A.f2088D;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d != d2) {
            int b3 = z0Var.b();
            int c3 = z0Var.c();
            int a3 = z0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            r0 q0Var = i7 >= 30 ? new q0(z0Var) : i7 >= 29 ? new p0(z0Var) : new o0(z0Var);
            q0Var.g(C.c.b(b3, d2, c3, a3));
            z0Var2 = q0Var.b();
        } else {
            z0Var2 = z0Var;
        }
        WeakHashMap weakHashMap2 = T.f423a;
        WindowInsets f2 = z0Var2.f();
        if (f2 == null) {
            return z0Var2;
        }
        WindowInsets b4 = K.F.b(view, f2);
        return !b4.equals(f2) ? z0.g(view, b4) : z0Var2;
    }

    @Override // k.InterfaceC0175x
    public boolean f(MenuC0164m menuC0164m) {
        Window.Callback callback;
        switch (this.f2232a) {
            case 2:
                Window.Callback callback2 = this.f2233b.f2120l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0164m);
                    break;
                }
                break;
            default:
                if (menuC0164m == menuC0164m.k()) {
                    LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A = this.f2233b;
                    if (layoutInflaterFactory2C0090A.f2090G && (callback = layoutInflaterFactory2C0090A.f2120l.getCallback()) != null && !layoutInflaterFactory2C0090A.f2101R) {
                        callback.onMenuOpened(108, menuC0164m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
