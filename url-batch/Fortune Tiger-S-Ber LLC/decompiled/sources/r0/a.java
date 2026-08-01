package r0;

import a2.s;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.util.Objects;
import java.util.WeakHashMap;
import k0.i1;
import k0.j0;
import k0.m;
import k0.m1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements r1.c, m, n0, z0.e {

    /* renamed from: f, reason: collision with root package name */
    public final Object f3139f;

    public /* synthetic */ a(Object obj) {
        this.f3139f = obj;
    }

    @Override // z0.e
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // k0.m
    public m1 d(View view, m1 m1Var) {
        i1 i1Var = m1Var.f2760a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3139f;
        if (!Objects.equals(coordinatorLayout.f286s, m1Var)) {
            coordinatorLayout.f286s = m1Var;
            boolean z3 = m1Var.d() > 0;
            coordinatorLayout.f287t = z3;
            coordinatorLayout.setWillNotDraw(!z3 && coordinatorLayout.getBackground() == null);
            if (!i1Var.n()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = coordinatorLayout.getChildAt(i4);
                    WeakHashMap weakHashMap = j0.f2752a;
                    if (childAt.getFitsSystemWindows() && ((x.d) childAt.getLayoutParams()).f3590a != null && i1Var.n()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return m1Var;
    }

    @Override // z0.e
    public void e(int i4, Object obj) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 == 6 || i4 == 7 || i4 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f3139f).setResultCode(i4);
    }

    @Override // androidx.lifecycle.n0
    public l0 f(Class cls, x0.b bVar) {
        androidx.lifecycle.j0 j0Var = null;
        for (x0.c cVar : (x0.c[]) this.f3139f) {
            if (cVar.f3606a.equals(cls)) {
                j0Var = new androidx.lifecycle.j0();
            }
        }
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public a(x0.c... cVarArr) {
        u2.c.e(cVarArr, "initializers");
        this.f3139f = cVarArr;
    }

    public a(TextView textView) {
        this.f3139f = new t0.g(textView);
    }

    public a(EditText editText) {
        this.f3139f = new s(editText);
    }
}
