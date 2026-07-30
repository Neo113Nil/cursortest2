package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class nq1 {
    public static final nq1 b;
    public o5 a;

    static {
        nq1 nq1Var = new nq1();
        nq1Var.a = null;
        b = nq1Var;
    }

    public static o5 a(Context context) {
        o5 o5Var;
        nq1 nq1Var = b;
        synchronized (nq1Var) {
            try {
                if (nq1Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    nq1Var.a = new o5(context, (byte) 0);
                }
                o5Var = nq1Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o5Var;
    }
}
