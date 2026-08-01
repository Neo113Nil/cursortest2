package g;

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
import com.gdmhkmf.belbet.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.e3;
import l.f3;
import l.g1;
import n0.c1;
import n0.d1;
import n0.e1;
import n0.f1;
import n0.h1;
import n0.i1;
import n0.j1;
import n0.p0;
import n0.v1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class q implements n0.p, g1, k.x {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f1567g;

    public /* synthetic */ q(a0 a0Var, int i) {
        this.f1566f = i;
        this.f1567g = a0Var;
    }

    @Override // k.x
    public void a(k.m mVar, boolean z4) {
        z zVar;
        switch (this.f1566f) {
            case 2:
                this.f1567g.o(mVar);
                break;
            default:
                k.m k4 = mVar.k();
                int i = 0;
                boolean z5 = k4 != mVar;
                if (z5) {
                    mVar = k4;
                }
                a0 a0Var = this.f1567g;
                z[] zVarArr = a0Var.R;
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
                    if (!z5) {
                        a0Var.p(zVar, z4);
                        break;
                    } else {
                        a0Var.n(zVar.f1577a, zVar, k4);
                        a0Var.p(zVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // n0.p
    public v1 l(View view, v1 v1Var) {
        int i;
        boolean z4;
        v1 v1Var2;
        boolean z5;
        int d = v1Var.d();
        a0 a0Var = this.f1567g;
        Context context = a0Var.f1459p;
        int d5 = v1Var.d();
        ActionBarContextView actionBarContextView = a0Var.A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a0Var.A.getLayoutParams();
            if (a0Var.A.isShown()) {
                if (a0Var.i0 == null) {
                    a0Var.i0 = new Rect();
                    a0Var.f1454j0 = new Rect();
                }
                Rect rect = a0Var.i0;
                Rect rect2 = a0Var.f1454j0;
                rect.set(v1Var.b(), v1Var.d(), v1Var.c(), v1Var.a());
                ViewGroup viewGroup = a0Var.G;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z6 = f3.f2448a;
                    e3.a(viewGroup, rect, rect2);
                } else {
                    if (!f3.f2448a) {
                        f3.f2448a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            f3.f2449b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                f3.f2449b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = f3.f2449b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e4) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
                        }
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = a0Var.G;
                WeakHashMap weakHashMap = p0.f2816a;
                v1 a5 = n0.i0.a(viewGroup2);
                int b2 = a5 == null ? 0 : a5.b();
                int c5 = a5 == null ? 0 : a5.c();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z5 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z5 = true;
                }
                if (i4 <= 0 || a0Var.I != null) {
                    View view2 = a0Var.I;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c5) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c5;
                            a0Var.I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    a0Var.I = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c5;
                    a0Var.G.addView(a0Var.I, -1, layoutParams);
                }
                View view4 = a0Var.I;
                r12 = view4 != null;
                if (r12 && view4.getVisibility() != 0) {
                    View view5 = a0Var.I;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!a0Var.N && r12) {
                    d5 = 0;
                }
                z4 = r12;
                i = 0;
                r12 = z5;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z4 = false;
                } else {
                    z4 = false;
                    r12 = false;
                }
            }
            if (r12) {
                a0Var.A.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = a0Var.I;
        if (view6 != null) {
            view6.setVisibility(z4 ? i : 8);
        }
        if (d != d5) {
            int b5 = v1Var.b();
            int c6 = v1Var.c();
            int a6 = v1Var.a();
            int i9 = Build.VERSION.SDK_INT;
            j1 i1Var = i9 >= 36 ? new i1(v1Var) : i9 >= 35 ? new h1(v1Var) : i9 >= 34 ? new n0.g1(v1Var) : i9 >= 31 ? new f1(v1Var) : i9 >= 30 ? new e1(v1Var) : i9 >= 29 ? new d1(v1Var) : new c1(v1Var);
            i1Var.h(f0.c.c(b5, d5, c6, a6));
            v1Var2 = i1Var.b();
        } else {
            v1Var2 = v1Var;
        }
        WeakHashMap weakHashMap2 = p0.f2816a;
        WindowInsets f5 = v1Var2.f();
        if (f5 == null) {
            return v1Var2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f5);
        return !onApplyWindowInsets.equals(f5) ? v1.g(view, onApplyWindowInsets) : v1Var2;
    }

    @Override // k.x
    public boolean n(k.m mVar) {
        Window.Callback callback;
        switch (this.f1566f) {
            case 2:
                Window.Callback callback2 = this.f1567g.f1460q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mVar);
                    break;
                }
                break;
            default:
                if (mVar == mVar.k()) {
                    a0 a0Var = this.f1567g;
                    if (a0Var.L && (callback = a0Var.f1460q.getCallback()) != null && !a0Var.W) {
                        callback.onMenuOpened(108, mVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
