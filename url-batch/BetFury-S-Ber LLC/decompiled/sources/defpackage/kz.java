package defpackage;

import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.trembin.nirefon.betfury.data.NoteDao;
import com.trembin.nirefon.betfury.viewmodel.NotesViewModel;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class kz implements gc0, h00, rm0, o60, la, db0, og0, w0 {
    public Object f;

    public kz(NoteDao noteDao) {
        noteDao.getClass();
        this.f = noteDao;
    }

    @Override // defpackage.rm0
    public om0 a(Class cls) {
        if (cls.isAssignableFrom(NotesViewModel.class)) {
            return new NotesViewModel((NoteDao) this.f);
        }
        s9.k("Unknown ViewModel class: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.w0
    public boolean b(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.e;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = hm0.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        l8 l8Var = swipeDismissBehavior.b;
        if (l8Var != null) {
            l8Var.a(view);
        }
        return true;
    }

    @Override // defpackage.db0
    public cb0 c(String str) {
        str.getClass();
        return new gg0(((jg0) this.f).J());
    }

    @Override // defpackage.og0
    public String d() {
        return ((pg0) this.f).g;
    }

    @Override // defpackage.rm0
    public om0 e(Class cls, a30 a30Var) {
        return a(cls);
    }

    @Override // defpackage.og0
    public void f(ng0 ng0Var) {
        pg0 pg0Var = (pg0) this.f;
        int length = pg0Var.i.length;
        for (int i = 1; i < length; i++) {
            int i2 = pg0Var.i[i];
            if (i2 == 1) {
                ng0Var.b(i, pg0Var.j[i]);
            } else if (i2 == 2) {
                ng0Var.o(i, pg0Var.k[i]);
            } else if (i2 == 3) {
                String str = pg0Var.l[i];
                str.getClass();
                ng0Var.F(str, i);
            } else if (i2 == 4) {
                byte[] bArr = pg0Var.m[i];
                bArr.getClass();
                ng0Var.E(i, bArr);
            } else if (i2 == 5) {
                ng0Var.l(i);
            }
        }
    }

    @Override // defpackage.o60
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.o60
    public void h(int i, Object obj) {
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

    @Override // defpackage.la
    public void onCancel() {
        ((qe0) this.f).a();
    }

    public /* synthetic */ kz(Object obj) {
        this.f = obj;
    }

    public kz(jg0 jg0Var) {
        jg0Var.getClass();
        this.f = jg0Var;
    }
}
