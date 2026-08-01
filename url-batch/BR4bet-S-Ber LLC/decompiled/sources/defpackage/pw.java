package defpackage;

import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class pw implements l00, t9, t0 {
    public Object f;

    public pw(uc0 uc0Var, rc0 rc0Var) {
        this(uc0Var.d(), rc0Var, uc0Var instanceof fp ? ((fp) uc0Var).c() : mf.b);
    }

    @Override // defpackage.t0
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.e;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = ic0.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        z7 z7Var = swipeDismissBehavior.b;
        if (z7Var != null) {
            z7Var.a(view);
        }
        return true;
    }

    @Override // defpackage.l00
    public void b() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.l00
    public void c(int i, Object obj) {
        String str;
        switch (i) {
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
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f).setResultCode(i);
    }

    public pc0 d(Class cls) {
        String str;
        String j;
        gb a = u20.a(cls);
        k6 k6Var = (k6) this.f;
        Map map = gb.b;
        Class cls2 = a.a;
        if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
            str = null;
        } else if (cls2.isArray()) {
            Class<?> componentType = cls2.getComponentType();
            str = (!componentType.isPrimitive() || (j = b9.j(componentType.getName())) == null) ? null : j.concat("Array");
            if (str == null) {
                str = "kotlin.Array";
            }
        } else {
            String j2 = b9.j(cls2.getName());
            str = j2 == null ? cls2.getCanonicalName() : j2;
        }
        if (str != null) {
            return k6Var.v(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str));
        }
        g9.i("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.t9
    public void onCancel() {
        ((m60) this.f).a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pw(tc0 tc0Var, sc0 sc0Var) {
        this(tc0Var, sc0Var, mf.b);
        tc0Var.getClass();
    }

    public pw(tc0 tc0Var, sc0 sc0Var, nf nfVar) {
        tc0Var.getClass();
        nfVar.getClass();
        this.f = new k6(tc0Var, sc0Var, nfVar);
    }

    public /* synthetic */ pw(Object obj) {
        this.f = obj;
    }
}
