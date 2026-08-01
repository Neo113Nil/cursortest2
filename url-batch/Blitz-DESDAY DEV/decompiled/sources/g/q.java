package g;

import M.InterfaceC0016q;
import M.Q;
import M.k0;
import M.l0;
import M.m0;
import M.n0;
import M.v0;
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
import com.winfour.neondrop.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.InterfaceC0196k0;
import l.i1;
import l.j1;

/* loaded from: classes.dex */
public final class q implements InterfaceC0016q, InterfaceC0196k0, k.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0101A f2335b;

    public /* synthetic */ q(LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A, int i) {
        this.f2334a = i;
        this.f2335b = layoutInflaterFactory2C0101A;
    }

    @Override // k.x
    public void b(k.m mVar, boolean z2) {
        z zVar;
        switch (this.f2334a) {
            case 2:
                this.f2335b.p(mVar);
                break;
            default:
                k.m k2 = mVar.k();
                int i = 0;
                boolean z3 = k2 != mVar;
                if (z3) {
                    mVar = k2;
                }
                LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = this.f2335b;
                z[] zVarArr = layoutInflaterFactory2C0101A.f2198M;
                int length = zVarArr != null ? zVarArr.length : 0;
                while (true) {
                    if (i >= length) {
                        zVar = null;
                    } else {
                        zVar = zVarArr[i];
                        if (zVar == null || zVar.h != mVar) {
                            i++;
                        }
                    }
                }
                if (zVar != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0101A.r(zVar, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0101A.n(zVar.f2345a, zVar, k2);
                        layoutInflaterFactory2C0101A.r(zVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // M.InterfaceC0016q
    public v0 d(View view, v0 v0Var) {
        int i;
        boolean z2;
        v0 v0Var2;
        boolean z3;
        int d = v0Var.d();
        LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = this.f2335b;
        layoutInflaterFactory2C0101A.getClass();
        int d2 = v0Var.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0101A.f2232v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0101A.f2232v.getLayoutParams();
            if (layoutInflaterFactory2C0101A.f2232v.isShown()) {
                if (layoutInflaterFactory2C0101A.f2215d0 == null) {
                    layoutInflaterFactory2C0101A.f2215d0 = new Rect();
                    layoutInflaterFactory2C0101A.f2216e0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0101A.f2215d0;
                Rect rect2 = layoutInflaterFactory2C0101A.f2216e0;
                rect.set(v0Var.b(), v0Var.d(), v0Var.c(), v0Var.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0101A.f2188B;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = j1.f3010a;
                    i1.a(viewGroup, rect, rect2);
                } else {
                    if (!j1.f3010a) {
                        j1.f3010a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            j1.f3011b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                j1.f3011b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = j1.f3011b;
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
                ViewGroup viewGroup2 = layoutInflaterFactory2C0101A.f2188B;
                WeakHashMap weakHashMap = Q.f513a;
                v0 a2 = M.G.a(viewGroup2);
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
                Context context = layoutInflaterFactory2C0101A.f2221k;
                if (i2 <= 0 || layoutInflaterFactory2C0101A.f2190D != null) {
                    View view2 = layoutInflaterFactory2C0101A.f2190D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            layoutInflaterFactory2C0101A.f2190D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0101A.f2190D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    layoutInflaterFactory2C0101A.f2188B.addView(layoutInflaterFactory2C0101A.f2190D, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0101A.f2190D;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0101A.f2190D;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? C.b.a(context, R.color.abc_decor_view_status_guard_light) : C.b.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0101A.f2194I && r11) {
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
                layoutInflaterFactory2C0101A.f2232v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0101A.f2190D;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d != d2) {
            int b3 = v0Var.b();
            int c3 = v0Var.c();
            int a3 = v0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            n0 m0Var = i7 >= 30 ? new m0(v0Var) : i7 >= 29 ? new l0(v0Var) : new k0(v0Var);
            m0Var.g(E.c.b(b3, d2, c3, a3));
            v0Var2 = m0Var.b();
        } else {
            v0Var2 = v0Var;
        }
        WeakHashMap weakHashMap2 = Q.f513a;
        WindowInsets f2 = v0Var2.f();
        if (f2 == null) {
            return v0Var2;
        }
        WindowInsets b4 = M.D.b(view, f2);
        return !b4.equals(f2) ? v0.g(view, b4) : v0Var2;
    }

    @Override // k.x
    public boolean f(k.m mVar) {
        Window.Callback callback;
        switch (this.f2334a) {
            case 2:
                Window.Callback callback2 = this.f2335b.f2222l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mVar);
                    break;
                }
                break;
            default:
                if (mVar == mVar.k()) {
                    LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A = this.f2335b;
                    if (layoutInflaterFactory2C0101A.f2193G && (callback = layoutInflaterFactory2C0101A.f2222l.getCallback()) != null && !layoutInflaterFactory2C0101A.f2203R) {
                        callback.onMenuOpened(108, mVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
