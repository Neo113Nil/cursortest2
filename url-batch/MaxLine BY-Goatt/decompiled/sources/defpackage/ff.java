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
import com.facebook.internal.Utility;
import com.majelw.libystne.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ff implements iu1, f20, yk1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ qf n;

    public /* synthetic */ ff(qf qfVar, int i) {
        this.m = i;
        this.n = qfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d6  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.iu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c83 a(View view, c83 c83Var) {
        int i;
        boolean z;
        View view2;
        c83 c83Var2;
        WindowInsets b;
        boolean z2;
        boolean z3;
        Method method;
        int i2;
        int i3;
        int i4;
        View view3;
        boolean z4;
        z73 z73Var = c83Var.a;
        int i5 = z73Var.m().b;
        qf qfVar = this.n;
        Context context = qfVar.w;
        int i6 = z73Var.m().b;
        ActionBarContextView actionBarContextView = qfVar.G;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qfVar.G.getLayoutParams();
            if (qfVar.G.isShown()) {
                if (qfVar.o0 == null) {
                    qfVar.o0 = new Rect();
                    qfVar.p0 = new Rect();
                }
                Rect rect = qfVar.o0;
                Rect rect2 = qfVar.p0;
                rect.set(z73Var.m().a, z73Var.m().b, z73Var.m().c, z73Var.m().d);
                ViewGroup viewGroup = qfVar.M;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = c63.a;
                    b63.a(viewGroup, rect, rect2);
                    z3 = true;
                } else {
                    if (c63.a) {
                        z3 = true;
                    } else {
                        c63.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            c63.b = declaredMethod;
                            if (declaredMethod.isAccessible()) {
                                z3 = true;
                            } else {
                                z3 = true;
                                try {
                                    c63.b.setAccessible(true);
                                } catch (NoSuchMethodException unused) {
                                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                    method = c63.b;
                                    if (method != null) {
                                    }
                                    i2 = rect.top;
                                    i3 = rect.left;
                                    i4 = rect.right;
                                    ViewGroup viewGroup2 = qfVar.M;
                                    WeakHashMap weakHashMap = e53.a;
                                    c83 a = y43.a(viewGroup2);
                                    if (a != null) {
                                    }
                                    if (a != null) {
                                    }
                                    if (marginLayoutParams.topMargin != i2) {
                                    }
                                    marginLayoutParams.topMargin = i2;
                                    marginLayoutParams.leftMargin = i3;
                                    marginLayoutParams.rightMargin = i4;
                                    z2 = z3;
                                    if (i2 > 0) {
                                    }
                                    view3 = qfVar.O;
                                    if (view3 != null) {
                                    }
                                    View view4 = qfVar.O;
                                    if (view4 == null) {
                                    }
                                    if (z4) {
                                        View view5 = qfVar.O;
                                        view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & Utility.DEFAULT_STREAM_BUFFER_SIZE) == 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                                    }
                                    if (!qfVar.T) {
                                        i6 = 0;
                                    }
                                    z = z4;
                                    i = 0;
                                    if (z2) {
                                    }
                                    view2 = qfVar.O;
                                    if (view2 != null) {
                                    }
                                    if (i5 == i6) {
                                    }
                                    WeakHashMap weakHashMap2 = e53.a;
                                    b = c83Var2.b();
                                    if (b != null) {
                                    }
                                }
                            }
                        } catch (NoSuchMethodException unused2) {
                            z3 = true;
                        }
                    }
                    method = c63.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                i2 = rect.top;
                i3 = rect.left;
                i4 = rect.right;
                ViewGroup viewGroup22 = qfVar.M;
                WeakHashMap weakHashMap3 = e53.a;
                c83 a2 = y43.a(viewGroup22);
                int i7 = a2 != null ? 0 : a2.a.m().a;
                int i8 = a2 != null ? 0 : a2.a.m().c;
                if (marginLayoutParams.topMargin != i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = z3;
                }
                if (i2 > 0 || qfVar.O != null) {
                    view3 = qfVar.O;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != i7 || marginLayoutParams2.rightMargin != i8) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = i7;
                            marginLayoutParams2.rightMargin = i8;
                            qfVar.O.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view6 = new View(context);
                    qfVar.O = view6;
                    view6.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i7;
                    layoutParams.rightMargin = i8;
                    qfVar.M.addView(qfVar.O, -1, layoutParams);
                }
                View view42 = qfVar.O;
                z4 = view42 == null ? z3 : false;
                if (z4 && view42.getVisibility() != 0) {
                    View view52 = qfVar.O;
                    view52.setBackgroundColor((view52.getWindowSystemUiVisibility() & Utility.DEFAULT_STREAM_BUFFER_SIZE) == 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!qfVar.T && z4) {
                    i6 = 0;
                }
                z = z4;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                    z = false;
                } else {
                    z = false;
                    z2 = false;
                }
            }
            if (z2) {
                qfVar.G.setLayoutParams(marginLayoutParams);
            }
        }
        view2 = qfVar.O;
        if (view2 != null) {
            view2.setVisibility(z ? i : 8);
        }
        if (i5 == i6) {
            int i11 = z73Var.m().a;
            int i12 = z73Var.m().c;
            int i13 = z73Var.m().d;
            int i14 = Build.VERSION.SDK_INT;
            q73 p73Var = i14 >= 36 ? new p73(c83Var) : i14 >= 35 ? new o73(c83Var) : i14 >= 34 ? new n73(c83Var) : i14 >= 31 ? new m73(c83Var) : i14 >= 30 ? new l73(c83Var) : i14 >= 29 ? new k73(c83Var) : new j73(c83Var);
            p73Var.h(z21.b(i11, i6, i12, i13));
            c83Var2 = p73Var.b();
        } else {
            c83Var2 = c83Var;
        }
        WeakHashMap weakHashMap22 = e53.a;
        b = c83Var2.b();
        if (b != null) {
            return c83Var2;
        }
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(b);
        return !onApplyWindowInsets.equals(b) ? c83.c(view, onApplyWindowInsets) : c83Var2;
    }

    @Override // defpackage.yk1
    public void b(fk1 fk1Var, boolean z) {
        pf pfVar;
        int i = this.m;
        qf qfVar = this.n;
        switch (i) {
            case 2:
                qfVar.u(fk1Var);
                break;
            default:
                fk1 k = fk1Var.k();
                int i2 = 0;
                boolean z2 = k != fk1Var;
                if (z2) {
                    fk1Var = k;
                }
                pf[] pfVarArr = qfVar.X;
                int length = pfVarArr != null ? pfVarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        pfVar = null;
                    } else {
                        pfVar = pfVarArr[i2];
                        if (pfVar == null || pfVar.h != fk1Var) {
                            i2++;
                        }
                    }
                }
                if (pfVar != null) {
                    if (!z2) {
                        qfVar.v(pfVar, z);
                        break;
                    } else {
                        qfVar.t(pfVar.a, pfVar, k);
                        qfVar.v(pfVar, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.yk1
    public boolean o(fk1 fk1Var) {
        Window.Callback callback;
        int i = this.m;
        qf qfVar = this.n;
        switch (i) {
            case 2:
                Window.Callback callback2 = qfVar.x.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, fk1Var);
                    break;
                }
                break;
            default:
                if (fk1Var == fk1Var.k() && qfVar.R && (callback = qfVar.x.getCallback()) != null && !qfVar.c0) {
                    callback.onMenuOpened(108, fk1Var);
                    break;
                }
                break;
        }
        return true;
    }
}
