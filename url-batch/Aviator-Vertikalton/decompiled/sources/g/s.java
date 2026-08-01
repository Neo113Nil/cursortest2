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
import com.fortuneink.neonpad.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0211x;
import k.MenuC0200m;
import l.InterfaceC0271l0;
import l.i1;
import l.j1;

/* loaded from: classes.dex */
public final class s implements InterfaceC0025v, InterfaceC0271l0, InterfaceC0211x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0141C f2593b;

    public /* synthetic */ s(LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C, int i) {
        this.f2592a = i;
        this.f2593b = layoutInflaterFactory2C0141C;
    }

    @Override // k.InterfaceC0211x
    public void b(MenuC0200m menuC0200m, boolean z2) {
        C0140B c0140b;
        switch (this.f2592a) {
            case 2:
                this.f2593b.s(menuC0200m);
                break;
            default:
                MenuC0200m k2 = menuC0200m.k();
                int i = 0;
                boolean z3 = k2 != menuC0200m;
                if (z3) {
                    menuC0200m = k2;
                }
                LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = this.f2593b;
                C0140B[] c0140bArr = layoutInflaterFactory2C0141C.f2444L;
                int length = c0140bArr != null ? c0140bArr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0140b = null;
                    } else {
                        c0140b = c0140bArr[i];
                        if (c0140b == null || c0140b.h != menuC0200m) {
                            i++;
                        }
                    }
                }
                if (c0140b != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0141C.t(c0140b, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0141C.r(c0140b.f2418a, c0140b, k2);
                        layoutInflaterFactory2C0141C.t(c0140b, true);
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
        LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = this.f2593b;
        layoutInflaterFactory2C0141C.getClass();
        int d3 = b02.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0141C.f2478v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0141C.f2478v.getLayoutParams();
            if (layoutInflaterFactory2C0141C.f2478v.isShown()) {
                if (layoutInflaterFactory2C0141C.f2461c0 == null) {
                    layoutInflaterFactory2C0141C.f2461c0 = new Rect();
                    layoutInflaterFactory2C0141C.f2462d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0141C.f2461c0;
                Rect rect2 = layoutInflaterFactory2C0141C.f2462d0;
                rect.set(b02.b(), b02.d(), b02.c(), b02.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0141C.f2434A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = j1.f3383a;
                    i1.a(viewGroup, rect, rect2);
                } else {
                    if (!j1.f3383a) {
                        j1.f3383a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            j1.f3384b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                j1.f3384b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = j1.f3384b;
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
                ViewGroup viewGroup2 = layoutInflaterFactory2C0141C.f2434A;
                WeakHashMap weakHashMap = X.f418a;
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
                Context context = layoutInflaterFactory2C0141C.f2467k;
                if (i2 <= 0 || layoutInflaterFactory2C0141C.f2436C != null) {
                    View view2 = layoutInflaterFactory2C0141C.f2436C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            layoutInflaterFactory2C0141C.f2436C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0141C.f2436C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    layoutInflaterFactory2C0141C.f2434A.addView(layoutInflaterFactory2C0141C.f2436C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0141C.f2436C;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0141C.f2436C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? A.b.a(context, R.color.abc_decor_view_status_guard_light) : A.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0141C.f2440H && r11) {
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
                layoutInflaterFactory2C0141C.f2478v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0141C.f2436C;
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
        WeakHashMap weakHashMap2 = X.f418a;
        WindowInsets f2 = b03.f();
        if (f2 == null) {
            return b03;
        }
        WindowInsets b4 = K.J.b(view, f2);
        return !b4.equals(f2) ? B0.g(view, b4) : b03;
    }

    @Override // k.InterfaceC0211x
    public boolean f(MenuC0200m menuC0200m) {
        Window.Callback callback;
        switch (this.f2592a) {
            case 2:
                Window.Callback callback2 = this.f2593b.f2468l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0200m);
                    break;
                }
                break;
            default:
                if (menuC0200m == menuC0200m.k()) {
                    LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C = this.f2593b;
                    if (layoutInflaterFactory2C0141C.F && (callback = layoutInflaterFactory2C0141C.f2468l.getCallback()) != null && !layoutInflaterFactory2C0141C.f2449Q) {
                        callback.onMenuOpened(108, menuC0200m);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
