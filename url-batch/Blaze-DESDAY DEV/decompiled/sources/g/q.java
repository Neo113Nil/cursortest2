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
import com.winworm.neongrid.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0177x;
import k.MenuC0166m;
import l.InterfaceC0218j0;
import l.h1;
import l.i1;

/* loaded from: classes.dex */
public final class q implements K.r, InterfaceC0218j0, InterfaceC0177x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0092A f2273b;

    public /* synthetic */ q(LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A, int i) {
        this.f2272a = i;
        this.f2273b = layoutInflaterFactory2C0092A;
    }

    @Override // K.r
    public z0 a(View view, z0 z0Var) {
        int i;
        boolean z2;
        z0 z0Var2;
        boolean z3;
        int d = z0Var.d();
        LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = this.f2273b;
        layoutInflaterFactory2C0092A.getClass();
        int d2 = z0Var.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0092A.f2170v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0092A.f2170v.getLayoutParams();
            if (layoutInflaterFactory2C0092A.f2170v.isShown()) {
                if (layoutInflaterFactory2C0092A.f2153d0 == null) {
                    layoutInflaterFactory2C0092A.f2153d0 = new Rect();
                    layoutInflaterFactory2C0092A.f2154e0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0092A.f2153d0;
                Rect rect2 = layoutInflaterFactory2C0092A.f2154e0;
                rect.set(z0Var.b(), z0Var.d(), z0Var.c(), z0Var.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0092A.f2126B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = i1.f2954a;
                    h1.a(viewGroup, rect, rect2);
                } else {
                    if (!i1.f2954a) {
                        i1.f2954a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            i1.f2955b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                i1.f2955b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = i1.f2955b;
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
                ViewGroup viewGroup2 = layoutInflaterFactory2C0092A.f2126B;
                WeakHashMap weakHashMap = T.f440a;
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
                Context context = layoutInflaterFactory2C0092A.f2159k;
                if (i2 <= 0 || layoutInflaterFactory2C0092A.f2128D != null) {
                    View view2 = layoutInflaterFactory2C0092A.f2128D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            layoutInflaterFactory2C0092A.f2128D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0092A.f2128D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    layoutInflaterFactory2C0092A.f2126B.addView(layoutInflaterFactory2C0092A.f2128D, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0092A.f2128D;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0092A.f2128D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0092A.f2132I && r11) {
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
                layoutInflaterFactory2C0092A.f2170v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0092A.f2128D;
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
        WeakHashMap weakHashMap2 = T.f440a;
        WindowInsets f2 = z0Var2.f();
        if (f2 == null) {
            return z0Var2;
        }
        WindowInsets b4 = K.F.b(view, f2);
        return !b4.equals(f2) ? z0.g(view, b4) : z0Var2;
    }

    @Override // k.InterfaceC0177x
    public void b(MenuC0166m menuC0166m, boolean z2) {
        z zVar;
        switch (this.f2272a) {
            case 2:
                this.f2273b.o(menuC0166m);
                break;
            default:
                MenuC0166m k2 = menuC0166m.k();
                int i = 0;
                boolean z3 = k2 != menuC0166m;
                if (z3) {
                    menuC0166m = k2;
                }
                LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = this.f2273b;
                z[] zVarArr = layoutInflaterFactory2C0092A.f2136M;
                int length = zVarArr != null ? zVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        zVar = null;
                    } else {
                        zVar = zVarArr[i];
                        if (zVar == null || zVar.h != menuC0166m) {
                            i++;
                        }
                    }
                }
                if (zVar != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0092A.q(zVar, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0092A.n(zVar.f2283a, zVar, k2);
                        layoutInflaterFactory2C0092A.q(zVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // k.InterfaceC0177x
    public boolean g(MenuC0166m menuC0166m) {
        Window.Callback callback;
        switch (this.f2272a) {
            case 2:
                Window.Callback callback2 = this.f2273b.f2160l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0166m);
                    break;
                }
                break;
            default:
                if (menuC0166m == menuC0166m.k()) {
                    LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A = this.f2273b;
                    if (layoutInflaterFactory2C0092A.f2130G && (callback = layoutInflaterFactory2C0092A.f2160l.getCallback()) != null && !layoutInflaterFactory2C0092A.f2141R) {
                        callback.onMenuOpened(108, menuC0166m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
