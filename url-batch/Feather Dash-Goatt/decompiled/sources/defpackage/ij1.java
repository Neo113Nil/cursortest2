package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ij1 {
    public static volatile io e;
    public final me1 a;
    public final me1 b;
    public final oq c;
    public final ne0 d;

    public ij1(me1 me1Var, me1 me1Var2, oq oqVar, ne0 ne0Var, o91 o91Var) {
        this.a = me1Var;
        this.b = me1Var2;
        this.c = oqVar;
        this.d = ne0Var;
        ((Executor) o91Var.d).execute(new e4(12, o91Var));
    }

    public static ij1 a() {
        io ioVar = e;
        if (ioVar != null) {
            return (ij1) ioVar.j.get();
        }
        dd0.j("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (ij1.class) {
                try {
                    if (e == null) {
                        o5 o5Var = new o5();
                        context.getClass();
                        o5Var.d = context;
                        e = o5Var.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final hj1 c(gf gfVar) {
        Set unmodifiableSet = gfVar instanceof gf ? Collections.unmodifiableSet(gf.d) : Collections.singleton(new vv("proto"));
        i8 a = cc.a();
        gfVar.getClass();
        a.e = "cct";
        String str = gfVar.a;
        String str2 = gfVar.b;
        if (str2 == null) {
            str2 = "";
        }
        a.g = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new hj1(unmodifiableSet, a.b(), this);
    }
}
