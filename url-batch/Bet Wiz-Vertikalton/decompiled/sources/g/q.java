package g;

import K.S;
import K.l0;
import K.m0;
import K.n0;
import K.o0;
import K.w0;
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
import com.neonpulse.gridlogic.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0171x;
import k.MenuC0160m;
import l.InterfaceC0224j0;
import l.h1;
import l.i1;

/* loaded from: classes.dex */
public final class q implements K.r, InterfaceC0224j0, InterfaceC0171x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0116A f2472b;

    public /* synthetic */ q(LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A, int i) {
        this.f2471a = i;
        this.f2472b = layoutInflaterFactory2C0116A;
    }

    @Override // K.r
    public w0 a(View view, w0 w0Var) {
        int i;
        boolean z2;
        w0 w0Var2;
        boolean z3;
        int d = w0Var.d();
        LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = this.f2472b;
        layoutInflaterFactory2C0116A.getClass();
        int d2 = w0Var.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0116A.f2369v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0116A.f2369v.getLayoutParams();
            if (layoutInflaterFactory2C0116A.f2369v.isShown()) {
                if (layoutInflaterFactory2C0116A.f2352d0 == null) {
                    layoutInflaterFactory2C0116A.f2352d0 = new Rect();
                    layoutInflaterFactory2C0116A.f2353e0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0116A.f2352d0;
                Rect rect2 = layoutInflaterFactory2C0116A.f2353e0;
                rect.set(w0Var.b(), w0Var.d(), w0Var.c(), w0Var.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0116A.f2325B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = i1.f2990a;
                    h1.a(viewGroup, rect, rect2);
                } else {
                    if (!i1.f2990a) {
                        i1.f2990a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            i1.f2991b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                i1.f2991b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = i1.f2991b;
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
                ViewGroup viewGroup2 = layoutInflaterFactory2C0116A.f2325B;
                WeakHashMap weakHashMap = S.f422a;
                w0 a2 = K.H.a(viewGroup2);
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
                Context context = layoutInflaterFactory2C0116A.f2358k;
                if (i2 <= 0 || layoutInflaterFactory2C0116A.f2327D != null) {
                    View view2 = layoutInflaterFactory2C0116A.f2327D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            layoutInflaterFactory2C0116A.f2327D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0116A.f2327D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    layoutInflaterFactory2C0116A.f2325B.addView(layoutInflaterFactory2C0116A.f2327D, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0116A.f2327D;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0116A.f2327D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0116A.f2331I && r11) {
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
                layoutInflaterFactory2C0116A.f2369v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0116A.f2327D;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d != d2) {
            int b3 = w0Var.b();
            int c3 = w0Var.c();
            int a3 = w0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            o0 n0Var = i7 >= 30 ? new n0(w0Var) : i7 >= 29 ? new m0(w0Var) : new l0(w0Var);
            n0Var.g(C.c.b(b3, d2, c3, a3));
            w0Var2 = n0Var.b();
        } else {
            w0Var2 = w0Var;
        }
        WeakHashMap weakHashMap2 = S.f422a;
        WindowInsets f2 = w0Var2.f();
        if (f2 == null) {
            return w0Var2;
        }
        WindowInsets b4 = K.E.b(view, f2);
        return !b4.equals(f2) ? w0.g(view, b4) : w0Var2;
    }

    @Override // k.InterfaceC0171x
    public void b(MenuC0160m menuC0160m, boolean z2) {
        z zVar;
        switch (this.f2471a) {
            case 2:
                this.f2472b.o(menuC0160m);
                break;
            default:
                MenuC0160m k2 = menuC0160m.k();
                int i = 0;
                boolean z3 = k2 != menuC0160m;
                if (z3) {
                    menuC0160m = k2;
                }
                LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = this.f2472b;
                z[] zVarArr = layoutInflaterFactory2C0116A.f2335M;
                int length = zVarArr != null ? zVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        zVar = null;
                    } else {
                        zVar = zVarArr[i];
                        if (zVar == null || zVar.h != menuC0160m) {
                            i++;
                        }
                    }
                }
                if (zVar != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0116A.p(zVar, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0116A.n(zVar.f2482a, zVar, k2);
                        layoutInflaterFactory2C0116A.p(zVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // k.InterfaceC0171x
    public boolean h(MenuC0160m menuC0160m) {
        Window.Callback callback;
        switch (this.f2471a) {
            case 2:
                Window.Callback callback2 = this.f2472b.f2359l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0160m);
                    break;
                }
                break;
            default:
                if (menuC0160m == menuC0160m.k()) {
                    LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = this.f2472b;
                    if (layoutInflaterFactory2C0116A.f2329G && (callback = layoutInflaterFactory2C0116A.f2359l.getCallback()) != null && !layoutInflaterFactory2C0116A.f2340R) {
                        callback.onMenuOpened(108, menuC0160m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
