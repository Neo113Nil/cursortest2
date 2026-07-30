package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gy0 {
    public final String a;
    public final nq0 b;
    public final Function1 c;
    public final sn d;
    public final Object e = new Object();
    public volatile nq0 f;

    public gy0(String str, nq0 nq0Var, Function1 function1, sn snVar) {
        this.a = str;
        this.b = nq0Var;
        this.c = function1;
        this.d = snVar;
    }

    public final nq0 a(Context context, dc0 dc0Var) {
        nq0 nq0Var;
        context.getClass();
        dc0Var.getClass();
        nq0 nq0Var2 = this.f;
        if (nq0Var2 != null) {
            return nq0Var2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    yn ynVar = this.b;
                    Function1 function1 = this.c;
                    applicationContext.getClass();
                    List list = (List) function1.invoke(applicationContext);
                    sn snVar = this.d;
                    w3 w3Var = new w3(applicationContext, 9, this);
                    list.getClass();
                    dy dyVar = new dy(new ce(9, w3Var));
                    if (ynVar == null) {
                        ynVar = new a60(24);
                    }
                    this.f = new nq0(4, new nq0(4, new mp(dyVar, yh.b(new d(list, null, 6)), ynVar, snVar)));
                }
                nq0Var = this.f;
                nq0Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return nq0Var;
    }
}
