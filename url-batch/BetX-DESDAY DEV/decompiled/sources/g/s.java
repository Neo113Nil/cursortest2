package g;

import K.B0;
import K.InterfaceC0025v;
import K.X;
import K.q0;
import K.r0;
import K.s0;
import K.t0;
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
import com.luckyarcade.spinthrow.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0213x;
import k.MenuC0202m;
import l.InterfaceC0271k0;
import l.h1;
import l.i1;

/* loaded from: classes.dex */
public final class s implements InterfaceC0025v, InterfaceC0271k0, InterfaceC0213x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0142C f2597b;

    public /* synthetic */ s(LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C, int i) {
        this.f2596a = i;
        this.f2597b = layoutInflaterFactory2C0142C;
    }

    @Override // k.InterfaceC0213x
    public void b(MenuC0202m menuC0202m, boolean z2) {
        C0141B c0141b;
        switch (this.f2596a) {
            case 2:
                this.f2597b.s(menuC0202m);
                break;
            default:
                MenuC0202m k2 = menuC0202m.k();
                int i = 0;
                boolean z3 = k2 != menuC0202m;
                if (z3) {
                    menuC0202m = k2;
                }
                LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = this.f2597b;
                C0141B[] c0141bArr = layoutInflaterFactory2C0142C.f2448L;
                int length = c0141bArr != null ? c0141bArr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0141b = null;
                    } else {
                        c0141b = c0141bArr[i];
                        if (c0141b == null || c0141b.h != menuC0202m) {
                            i++;
                        }
                    }
                }
                if (c0141b != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0142C.t(c0141b, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0142C.q(c0141b.f2422a, c0141b, k2);
                        layoutInflaterFactory2C0142C.t(c0141b, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // K.InterfaceC0025v
    public B0 c(View view, B0 b02) {
        int i;
        boolean z2;
        B0 b03;
        boolean z3;
        int d2 = b02.d();
        LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = this.f2597b;
        layoutInflaterFactory2C0142C.getClass();
        int d3 = b02.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0142C.f2482v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0142C.f2482v.getLayoutParams();
            if (layoutInflaterFactory2C0142C.f2482v.isShown()) {
                if (layoutInflaterFactory2C0142C.f2465c0 == null) {
                    layoutInflaterFactory2C0142C.f2465c0 = new Rect();
                    layoutInflaterFactory2C0142C.f2466d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0142C.f2465c0;
                Rect rect2 = layoutInflaterFactory2C0142C.f2466d0;
                rect.set(b02.b(), b02.d(), b02.c(), b02.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0142C.f2438A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = i1.f3382a;
                    h1.a(viewGroup, rect, rect2);
                } else {
                    if (!i1.f3382a) {
                        i1.f3382a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            i1.f3383b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                i1.f3383b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = i1.f3383b;
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
                ViewGroup viewGroup2 = layoutInflaterFactory2C0142C.f2438A;
                WeakHashMap weakHashMap = X.f419a;
                B0 a2 = K.M.a(viewGroup2);
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
                Context context = layoutInflaterFactory2C0142C.f2471k;
                if (i2 <= 0 || layoutInflaterFactory2C0142C.f2440C != null) {
                    View view2 = layoutInflaterFactory2C0142C.f2440C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            layoutInflaterFactory2C0142C.f2440C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0142C.f2440C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    layoutInflaterFactory2C0142C.f2438A.addView(layoutInflaterFactory2C0142C.f2440C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0142C.f2440C;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0142C.f2440C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0142C.f2444H && r11) {
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
                layoutInflaterFactory2C0142C.f2482v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0142C.f2440C;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d2 != d3) {
            int b3 = b02.b();
            int c3 = b02.c();
            int a3 = b02.a();
            int i7 = Build.VERSION.SDK_INT;
            t0 s0Var = i7 >= 30 ? new s0(b02) : i7 >= 29 ? new r0(b02) : new q0(b02);
            s0Var.g(C.d.b(b3, d3, c3, a3));
            b03 = s0Var.b();
        } else {
            b03 = b02;
        }
        WeakHashMap weakHashMap2 = X.f419a;
        WindowInsets f2 = b03.f();
        if (f2 == null) {
            return b03;
        }
        WindowInsets b4 = K.J.b(view, f2);
        return !b4.equals(f2) ? B0.g(view, b4) : b03;
    }

    @Override // k.InterfaceC0213x
    public boolean g(MenuC0202m menuC0202m) {
        Window.Callback callback;
        switch (this.f2596a) {
            case 2:
                Window.Callback callback2 = this.f2597b.f2472l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0202m);
                    break;
                }
                break;
            default:
                if (menuC0202m == menuC0202m.k()) {
                    LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = this.f2597b;
                    if (layoutInflaterFactory2C0142C.F && (callback = layoutInflaterFactory2C0142C.f2472l.getCallback()) != null && !layoutInflaterFactory2C0142C.f2453Q) {
                        callback.onMenuOpened(108, menuC0202m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
