package defpackage;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dq1 extends Binder {
    public final s40 b;

    public dq1(s40 s40Var) {
        this.b = s40Var;
    }

    public final void a(eq1 eq1Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        xv.access$000((xv) this.b.e, eq1Var.a).b(new kz0(), new m2(5, eq1Var));
    }
}
