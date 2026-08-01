package defpackage;

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
import com.awerser.monnit.betplay.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class h4 implements dw, id, qu {
    public final /* synthetic */ int f;
    public final /* synthetic */ t4 g;

    public /* synthetic */ h4(t4 t4Var, int i) {
        this.f = i;
        this.g = t4Var;
    }

    @Override // defpackage.qu
    public void a(au auVar, boolean z) {
        s4 s4Var;
        int i = this.f;
        t4 t4Var = this.g;
        switch (i) {
            case 2:
                t4Var.q(auVar);
                break;
            default:
                au k = auVar.k();
                int i2 = 0;
                boolean z2 = k != auVar;
                if (z2) {
                    auVar = k;
                }
                s4[] s4VarArr = t4Var.R;
                int length = s4VarArr != null ? s4VarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        s4Var = null;
                    } else {
                        s4Var = s4VarArr[i2];
                        if (s4Var == null || s4Var.h != auVar) {
                            i2++;
                        }
                    }
                }
                if (s4Var != null) {
                    if (!z2) {
                        t4Var.r(s4Var, z);
                        break;
                    } else {
                        t4Var.p(s4Var.a, s4Var, k);
                        t4Var.r(s4Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.dw
    public ac0 onApplyWindowInsets(View view, ac0 ac0Var) {
        int i;
        int i2;
        boolean z;
        ac0 ac0Var2;
        boolean z2;
        int d = ac0Var.d();
        t4 t4Var = this.g;
        Context context = t4Var.p;
        int d2 = ac0Var.d();
        ActionBarContextView actionBarContextView = t4Var.A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) t4Var.A.getLayoutParams();
            if (t4Var.A.isShown()) {
                if (t4Var.i0 == null) {
                    t4Var.i0 = new Rect();
                    t4Var.j0 = new Rect();
                }
                Rect rect = t4Var.i0;
                Rect rect2 = t4Var.j0;
                rect.set(ac0Var.b(), ac0Var.d(), ac0Var.c(), ac0Var.a());
                ViewGroup viewGroup = t4Var.G;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = ca0.a;
                    y90.a(viewGroup, rect, rect2);
                } else {
                    if (!ca0.a) {
                        ca0.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            ca0.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                ca0.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = ca0.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = t4Var.G;
                WeakHashMap weakHashMap = e90.a;
                ac0 a = x80.a(viewGroup2);
                int b = a == null ? 0 : a.b();
                int c = a == null ? 0 : a.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || t4Var.I != null) {
                    i2 = 8;
                    View view2 = t4Var.I;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            t4Var.I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    t4Var.I = view3;
                    i2 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    t4Var.G.addView(t4Var.I, -1, layoutParams);
                }
                View view4 = t4Var.I;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = t4Var.I;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!t4Var.N && r11) {
                    d2 = 0;
                }
                i = 0;
                z = r11;
                r11 = z2;
            } else {
                i2 = 8;
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    r11 = false;
                }
            }
            if (r11) {
                t4Var.A.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = t4Var.I;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b2 = ac0Var.b();
            int c2 = ac0Var.c();
            int a2 = ac0Var.a();
            int i8 = Build.VERSION.SDK_INT;
            ob0 nb0Var = i8 >= 36 ? new nb0(ac0Var) : i8 >= 35 ? new mb0(ac0Var) : i8 >= 34 ? new lb0(ac0Var) : i8 >= 31 ? new kb0(ac0Var) : i8 >= 30 ? new jb0(ac0Var) : i8 >= 29 ? new ib0(ac0Var) : new hb0(ac0Var);
            nb0Var.h(ip.c(b2, d2, c2, a2));
            ac0Var2 = nb0Var.b();
        } else {
            ac0Var2 = ac0Var;
        }
        WeakHashMap weakHashMap2 = e90.a;
        WindowInsets f = ac0Var2.f();
        if (f == null) {
            return ac0Var2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
        return !onApplyWindowInsets.equals(f) ? ac0.g(view, onApplyWindowInsets) : ac0Var2;
    }

    @Override // defpackage.qu
    public boolean s(au auVar) {
        Window.Callback callback;
        int i = this.f;
        t4 t4Var = this.g;
        switch (i) {
            case 2:
                Window.Callback callback2 = t4Var.q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, auVar);
                    break;
                }
                break;
            default:
                if (auVar == auVar.k() && t4Var.L && (callback = t4Var.q.getCallback()) != null && !t4Var.W) {
                    callback.onMenuOpened(108, auVar);
                    break;
                }
                break;
        }
        return true;
    }
}
