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
import com.visualfortune.eyerest.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0169x;
import k.MenuC0158m;
import l.InterfaceC0224k0;
import l.h1;
import l.i1;

/* loaded from: classes.dex */
public final class q implements K.r, InterfaceC0224k0, InterfaceC0169x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0115A f2410b;

    public /* synthetic */ q(LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A, int i) {
        this.f2409a = i;
        this.f2410b = layoutInflaterFactory2C0115A;
    }

    @Override // k.InterfaceC0169x
    public void b(MenuC0158m menuC0158m, boolean z2) {
        z zVar;
        switch (this.f2409a) {
            case 2:
                this.f2410b.q(menuC0158m);
                break;
            default:
                MenuC0158m k2 = menuC0158m.k();
                int i = 0;
                boolean z3 = k2 != menuC0158m;
                if (z3) {
                    menuC0158m = k2;
                }
                LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A = this.f2410b;
                z[] zVarArr = layoutInflaterFactory2C0115A.f2273M;
                int length = zVarArr != null ? zVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        zVar = null;
                    } else {
                        zVar = zVarArr[i];
                        if (zVar == null || zVar.h != menuC0158m) {
                            i++;
                        }
                    }
                }
                if (zVar != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0115A.r(zVar, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0115A.p(zVar.f2420a, zVar, k2);
                        layoutInflaterFactory2C0115A.r(zVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // K.r
    public w0 c(View view, w0 w0Var) {
        int i;
        boolean z2;
        w0 w0Var2;
        boolean z3;
        int d = w0Var.d();
        LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A = this.f2410b;
        layoutInflaterFactory2C0115A.getClass();
        int d2 = w0Var.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0115A.f2307v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0115A.f2307v.getLayoutParams();
            if (layoutInflaterFactory2C0115A.f2307v.isShown()) {
                if (layoutInflaterFactory2C0115A.f2290d0 == null) {
                    layoutInflaterFactory2C0115A.f2290d0 = new Rect();
                    layoutInflaterFactory2C0115A.f2291e0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0115A.f2290d0;
                Rect rect2 = layoutInflaterFactory2C0115A.f2291e0;
                rect.set(w0Var.b(), w0Var.d(), w0Var.c(), w0Var.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0115A.f2263B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = i1.f3080a;
                    h1.a(viewGroup, rect, rect2);
                } else {
                    if (!i1.f3080a) {
                        i1.f3080a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            i1.f3081b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                i1.f3081b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = i1.f3081b;
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
                ViewGroup viewGroup2 = layoutInflaterFactory2C0115A.f2263B;
                WeakHashMap weakHashMap = S.f362a;
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
                Context context = layoutInflaterFactory2C0115A.f2296k;
                if (i2 <= 0 || layoutInflaterFactory2C0115A.f2265D != null) {
                    View view2 = layoutInflaterFactory2C0115A.f2265D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            layoutInflaterFactory2C0115A.f2265D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0115A.f2265D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    layoutInflaterFactory2C0115A.f2263B.addView(layoutInflaterFactory2C0115A.f2265D, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0115A.f2265D;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0115A.f2265D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0115A.f2269I && r11) {
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
                layoutInflaterFactory2C0115A.f2307v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0115A.f2265D;
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
        WeakHashMap weakHashMap2 = S.f362a;
        WindowInsets f2 = w0Var2.f();
        if (f2 == null) {
            return w0Var2;
        }
        WindowInsets b4 = K.E.b(view, f2);
        return !b4.equals(f2) ? w0.g(view, b4) : w0Var2;
    }

    @Override // k.InterfaceC0169x
    public boolean f(MenuC0158m menuC0158m) {
        Window.Callback callback;
        switch (this.f2409a) {
            case 2:
                Window.Callback callback2 = this.f2410b.f2297l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0158m);
                    break;
                }
                break;
            default:
                if (menuC0158m == menuC0158m.k()) {
                    LayoutInflaterFactory2C0115A layoutInflaterFactory2C0115A = this.f2410b;
                    if (layoutInflaterFactory2C0115A.f2267G && (callback = layoutInflaterFactory2C0115A.f2297l.getCallback()) != null && !layoutInflaterFactory2C0115A.f2278R) {
                        callback.onMenuOpened(108, menuC0158m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
