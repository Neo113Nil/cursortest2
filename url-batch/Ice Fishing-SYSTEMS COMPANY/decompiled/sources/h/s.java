package h;

import O.A0;
import O.InterfaceC0358u;
import O.X;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.f1;
import m.g1;

/* loaded from: classes.dex */
public final class s implements InterfaceC0358u, l.w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4535B f38129n;

    public /* synthetic */ s(LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B) {
        this.f38129n = layoutInflaterFactory2C4535B;
    }

    @Override // l.w
    public void e(l.l lVar, boolean z8) {
        C4534A c4534a;
        l.l k6 = lVar.k();
        int i = 0;
        boolean z9 = k6 != lVar;
        if (z9) {
            lVar = k6;
        }
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = this.f38129n;
        C4534A[] c4534aArr = layoutInflaterFactory2C4535B.f38008r0;
        int length = c4534aArr != null ? c4534aArr.length : 0;
        while (true) {
            if (i < length) {
                c4534a = c4534aArr[i];
                if (c4534a != null && c4534a.f37959h == lVar) {
                    break;
                } else {
                    i++;
                }
            } else {
                c4534a = null;
                break;
            }
        }
        if (c4534a != null) {
            if (!z9) {
                layoutInflaterFactory2C4535B.t(c4534a, z8);
            } else {
                layoutInflaterFactory2C4535B.r(c4534a.f37952a, c4534a, k6);
                layoutInflaterFactory2C4535B.t(c4534a, true);
            }
        }
    }

    @Override // l.w
    public boolean g(l.l lVar) {
        Window.Callback callback;
        if (lVar != lVar.k()) {
            return true;
        }
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = this.f38129n;
        if (!layoutInflaterFactory2C4535B.Y || (callback = layoutInflaterFactory2C4535B.f37975E.getCallback()) == null || layoutInflaterFactory2C4535B.f38013w0) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // O.InterfaceC0358u
    public A0 k(View view, A0 a02) {
        boolean z8;
        boolean z9;
        int d2 = a02.d();
        LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = this.f38129n;
        layoutInflaterFactory2C4535B.getClass();
        int d3 = a02.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C4535B.f37993O;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z8 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C4535B.f37993O.getLayoutParams();
            if (layoutInflaterFactory2C4535B.f37993O.isShown()) {
                if (layoutInflaterFactory2C4535B.f37984I0 == null) {
                    layoutInflaterFactory2C4535B.f37984I0 = new Rect();
                    layoutInflaterFactory2C4535B.f37985J0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C4535B.f37984I0;
                Rect rect2 = layoutInflaterFactory2C4535B.f37985J0;
                rect.set(a02.b(), a02.d(), a02.c(), a02.a());
                ViewGroup viewGroup = layoutInflaterFactory2C4535B.f37998T;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z10 = g1.f39419a;
                    f1.a(viewGroup, rect, rect2);
                } else {
                    if (!g1.f39419a) {
                        g1.f39419a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            g1.f39420b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                g1.f39420b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = g1.f39420b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e6) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e6);
                        }
                    }
                }
                int i = rect.top;
                int i4 = rect.left;
                int i9 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C4535B.f37998T;
                WeakHashMap weakHashMap = X.f2240a;
                A0 a9 = O.M.a(viewGroup2);
                int b9 = a9 == null ? 0 : a9.b();
                int c4 = a9 == null ? 0 : a9.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i9) {
                    z9 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i9;
                    z9 = true;
                }
                Context context = layoutInflaterFactory2C4535B.f37973D;
                if (i <= 0 || layoutInflaterFactory2C4535B.f38000V != null) {
                    View view2 = layoutInflaterFactory2C4535B.f38000V;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != b9 || marginLayoutParams2.rightMargin != c4) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = b9;
                            marginLayoutParams2.rightMargin = c4;
                            layoutInflaterFactory2C4535B.f38000V.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C4535B.f38000V = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b9;
                    layoutParams.rightMargin = c4;
                    layoutInflaterFactory2C4535B.f37998T.addView(layoutInflaterFactory2C4535B.f38000V, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C4535B.f38000V;
                r8 = view4 != null;
                if (r8 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C4535B.f38000V;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? E.b.a(context, C5284R.color.abc_decor_view_status_guard_light) : E.b.a(context, C5284R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C4535B.f38004n0 && r8) {
                    d3 = 0;
                }
                z8 = r8;
                r8 = z9;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z8 = false;
            } else {
                z8 = false;
                r8 = false;
            }
            if (r8) {
                layoutInflaterFactory2C4535B.f37993O.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C4535B.f38000V;
        if (view6 != null) {
            view6.setVisibility(z8 ? 0 : 8);
        }
        return X.j(view, d2 != d3 ? a02.f(a02.b(), d3, a02.c(), a02.a()) : a02);
    }
}
