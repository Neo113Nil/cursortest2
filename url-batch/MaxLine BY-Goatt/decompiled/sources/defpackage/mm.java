package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mm {
    public final Object a;

    public void a() {
        ((AutofillManager) this.a).commit();
    }

    public ApplicationInfo b(int i, String str) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo c(int i, String str) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        String nameForUid;
        Context context = (Context) this.a;
        if (Binder.getCallingUid() == Process.myUid()) {
            return k31.p(context);
        }
        if (!s03.A() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public void e(t7 t7Var, int i, AutofillValue autofillValue) {
        ((AutofillManager) this.a).notifyValueChanged(t7Var, i, autofillValue);
    }

    public void f(t7 t7Var, int i, Rect rect) {
        ((AutofillManager) this.a).notifyViewEntered(t7Var, i, rect);
    }

    public void g(t7 t7Var, int i) {
        ((AutofillManager) this.a).notifyViewExited(t7Var, i);
    }

    public void h(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            jm.a(view, (AutofillManager) this.a, i, z);
        }
    }

    public AutofillId i() {
        return lh.a(this.a);
    }
}
