package g;

import K.InterfaceC0017s;
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
import com.clutchquizarena.app.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0178x;
import k.MenuC0167m;
import l.InterfaceC0218i0;
import l.g1;
import l.h1;

/* loaded from: classes.dex */
public final class p implements InterfaceC0017s, InterfaceC0218i0, InterfaceC0178x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f2465b;

    public /* synthetic */ p(z zVar, int i) {
        this.f2464a = i;
        this.f2465b = zVar;
    }

    @Override // k.InterfaceC0178x
    public void b(MenuC0167m menuC0167m, boolean z2) {
        y yVar;
        switch (this.f2464a) {
            case 2:
                this.f2465b.o(menuC0167m);
                break;
            default:
                MenuC0167m k2 = menuC0167m.k();
                int i = 0;
                boolean z3 = k2 != menuC0167m;
                if (z3) {
                    menuC0167m = k2;
                }
                z zVar = this.f2465b;
                y[] yVarArr = zVar.f2501L;
                int length = yVarArr != null ? yVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        yVar = null;
                    } else {
                        yVar = yVarArr[i];
                        if (yVar == null || yVar.h != menuC0167m) {
                            i++;
                        }
                    }
                }
                if (yVar != null) {
                    if (!z3) {
                        zVar.r(yVar, z2);
                        break;
                    } else {
                        zVar.n(yVar.f2475a, yVar, k2);
                        zVar.r(yVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // K.InterfaceC0017s
    public w0 c(View view, w0 w0Var) {
        int i;
        boolean z2;
        w0 w0Var2;
        boolean z3;
        int d = w0Var.d();
        z zVar = this.f2465b;
        zVar.getClass();
        int d2 = w0Var.d();
        ActionBarContextView actionBarContextView = zVar.f2535v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zVar.f2535v.getLayoutParams();
            if (zVar.f2535v.isShown()) {
                if (zVar.f2518c0 == null) {
                    zVar.f2518c0 = new Rect();
                    zVar.f2519d0 = new Rect();
                }
                Rect rect = zVar.f2518c0;
                Rect rect2 = zVar.f2519d0;
                rect.set(w0Var.b(), w0Var.d(), w0Var.c(), w0Var.a());
                ViewGroup viewGroup = zVar.f2491A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = h1.f2982a;
                    g1.a(viewGroup, rect, rect2);
                } else {
                    if (!h1.f2982a) {
                        h1.f2982a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            h1.f2983b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                h1.f2983b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = h1.f2983b;
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
                ViewGroup viewGroup2 = zVar.f2491A;
                WeakHashMap weakHashMap = S.f365a;
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
                Context context = zVar.f2524k;
                if (i2 <= 0 || zVar.f2493C != null) {
                    View view2 = zVar.f2493C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            zVar.f2493C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    zVar.f2493C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    zVar.f2491A.addView(zVar.f2493C, -1, layoutParams);
                }
                View view4 = zVar.f2493C;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = zVar.f2493C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!zVar.f2497H && r11) {
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
                zVar.f2535v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = zVar.f2493C;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d != d2) {
            int b3 = w0Var.b();
            int c3 = w0Var.c();
            int a3 = w0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            o0 n0Var = i7 >= 30 ? new n0(w0Var) : i7 >= 29 ? new m0(w0Var) : new l0(w0Var);
            n0Var.g(C.d.b(b3, d2, c3, a3));
            w0Var2 = n0Var.b();
        } else {
            w0Var2 = w0Var;
        }
        WeakHashMap weakHashMap2 = S.f365a;
        WindowInsets f2 = w0Var2.f();
        if (f2 == null) {
            return w0Var2;
        }
        WindowInsets b4 = K.E.b(view, f2);
        return !b4.equals(f2) ? w0.g(view, b4) : w0Var2;
    }

    @Override // k.InterfaceC0178x
    public boolean g(MenuC0167m menuC0167m) {
        Window.Callback callback;
        switch (this.f2464a) {
            case 2:
                Window.Callback callback2 = this.f2465b.f2525l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0167m);
                    break;
                }
                break;
            default:
                if (menuC0167m == menuC0167m.k()) {
                    z zVar = this.f2465b;
                    if (zVar.F && (callback = zVar.f2525l.getCallback()) != null && !zVar.f2506Q) {
                        callback.onMenuOpened(108, menuC0167m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
