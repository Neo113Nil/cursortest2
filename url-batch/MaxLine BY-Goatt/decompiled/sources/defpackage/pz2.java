package defpackage;

import android.content.Context;
import com.google.firebase.encoders.json.BuildConfig;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pz2 {
    public static volatile g60 e;
    public final dq2 a;
    public final dq2 b;
    public final u80 c;
    public final f33 d;

    public pz2(dq2 dq2Var, dq2 dq2Var2, u80 u80Var, f33 f33Var, js0 js0Var) {
        this.a = dq2Var;
        this.b = dq2Var2;
        this.c = u80Var;
        this.d = f33Var;
        ((Executor) js0Var.m).execute(new k3(28, js0Var));
    }

    public static pz2 a() {
        g60 g60Var = e;
        if (g60Var != null) {
            return (pz2) g60Var.r.get();
        }
        lh.g("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (pz2.class) {
                try {
                    if (e == null) {
                        u9 u9Var = new u9();
                        context.getClass();
                        u9Var.m = context;
                        e = u9Var.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final oz2 c(fr frVar) {
        Set unmodifiableSet = frVar instanceof fr ? Collections.unmodifiableSet(fr.d) : Collections.singleton(new kh0("proto"));
        mh a = gm.a();
        frVar.getClass();
        a.n = "cct";
        String str = frVar.a;
        String str2 = frVar.b;
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        a.o = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new oz2(unmodifiableSet, a.i(), this);
    }
}
