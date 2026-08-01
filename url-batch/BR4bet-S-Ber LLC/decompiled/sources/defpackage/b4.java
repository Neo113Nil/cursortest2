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
import com.moontiko.really.admiralcasino.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class b4 implements zy, ee, cx {
    public final /* synthetic */ int f;
    public final /* synthetic */ n4 g;

    public /* synthetic */ b4(n4 n4Var, int i) {
        this.f = i;
        this.g = n4Var;
    }

    @Override // defpackage.cx
    public void a(mw mwVar, boolean z) {
        m4 m4Var;
        int i = this.f;
        n4 n4Var = this.g;
        switch (i) {
            case 2:
                n4Var.p(mwVar);
                break;
            default:
                mw k = mwVar.k();
                int i2 = 0;
                boolean z2 = k != mwVar;
                if (z2) {
                    mwVar = k;
                }
                m4[] m4VarArr = n4Var.Q;
                int length = m4VarArr != null ? m4VarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        m4Var = null;
                    } else {
                        m4Var = m4VarArr[i2];
                        if (m4Var == null || m4Var.h != mwVar) {
                            i2++;
                        }
                    }
                }
                if (m4Var != null) {
                    if (!z2) {
                        n4Var.r(m4Var, z);
                        break;
                    } else {
                        n4Var.o(m4Var.a, m4Var, k);
                        n4Var.r(m4Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.zy
    public ye0 l(View view, ye0 ye0Var) {
        int i;
        int i2;
        boolean z;
        ye0 ye0Var2;
        boolean z2;
        int d = ye0Var.d();
        n4 n4Var = this.g;
        Context context = n4Var.p;
        int d2 = ye0Var.d();
        ActionBarContextView actionBarContextView = n4Var.z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) n4Var.z.getLayoutParams();
            if (n4Var.z.isShown()) {
                if (n4Var.h0 == null) {
                    n4Var.h0 = new Rect();
                    n4Var.i0 = new Rect();
                }
                Rect rect = n4Var.h0;
                Rect rect2 = n4Var.i0;
                rect.set(ye0Var.b(), ye0Var.d(), ye0Var.c(), ye0Var.a());
                ViewGroup viewGroup = n4Var.F;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = ed0.a;
                    bd0.a(viewGroup, rect, rect2);
                } else {
                    if (!ed0.a) {
                        ed0.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            ed0.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                ed0.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = ed0.b;
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
                ViewGroup viewGroup2 = n4Var.F;
                WeakHashMap weakHashMap = ic0.a;
                ye0 a = bc0.a(viewGroup2);
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
                if (i3 <= 0 || n4Var.H != null) {
                    i2 = 8;
                    View view2 = n4Var.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            n4Var.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    n4Var.H = view3;
                    i2 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    n4Var.F.addView(n4Var.H, -1, layoutParams);
                }
                View view4 = n4Var.H;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = n4Var.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!n4Var.M && r11) {
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
                n4Var.z.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = n4Var.H;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b2 = ye0Var.b();
            int c2 = ye0Var.c();
            int a2 = ye0Var.a();
            int i8 = Build.VERSION.SDK_INT;
            me0 le0Var = i8 >= 36 ? new le0(ye0Var) : i8 >= 35 ? new ke0(ye0Var) : i8 >= 34 ? new je0(ye0Var) : i8 >= 31 ? new ie0(ye0Var) : i8 >= 30 ? new he0(ye0Var) : i8 >= 29 ? new ge0(ye0Var) : new fe0(ye0Var);
            le0Var.h(er.c(b2, d2, c2, a2));
            ye0Var2 = le0Var.b();
        } else {
            ye0Var2 = ye0Var;
        }
        WeakHashMap weakHashMap2 = ic0.a;
        WindowInsets f = ye0Var2.f();
        if (f == null) {
            return ye0Var2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
        return !onApplyWindowInsets.equals(f) ? ye0.g(view, onApplyWindowInsets) : ye0Var2;
    }

    @Override // defpackage.cx
    public boolean w(mw mwVar) {
        Window.Callback callback;
        int i = this.f;
        n4 n4Var = this.g;
        switch (i) {
            case 2:
                Window.Callback callback2 = n4Var.q.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, mwVar);
                    break;
                }
                break;
            default:
                if (mwVar == mwVar.k() && n4Var.K && (callback = n4Var.q.getCallback()) != null && !n4Var.V) {
                    callback.onMenuOpened(108, mwVar);
                    break;
                }
                break;
        }
        return true;
    }
}
