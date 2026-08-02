package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jxr {
    public static final Logger c = Logger.getLogger(jxr.class.getName());
    public static final jxr d = new jxr();
    final jxk e;
    public final kbb f;
    public final int g;

    public jxr(jxr jxrVar, kbb kbbVar) {
        this.e = jxrVar instanceof jxk ? (jxk) jxrVar : jxrVar.e;
        this.f = kbbVar;
        int i = jxrVar.g + 1;
        this.g = i;
        e(i);
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static jxr k() {
        jxr a = jxp.a.a();
        return a == null ? d : a;
    }

    public static void m(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public jxr a() {
        jxr b = jxp.a.b(this);
        return b == null ? d : b;
    }

    public jxs b() {
        jxk jxkVar = this.e;
        if (jxkVar == null) {
            return null;
        }
        return jxkVar.a;
    }

    public Throwable c() {
        jxk jxkVar = this.e;
        if (jxkVar == null) {
            return null;
        }
        return jxkVar.c();
    }

    public void d(jxl jxlVar, Executor executor) {
        m(executor, "executor");
        jxk jxkVar = this.e;
        if (jxkVar == null) {
            return;
        }
        jxkVar.e(new jxn(executor, jxlVar, this));
    }

    public void f(jxr jxrVar) {
        m(jxrVar, "toAttach");
        jxp.a.c(this, jxrVar);
    }

    public void g(jxl jxlVar) {
        jxk jxkVar = this.e;
        if (jxkVar == null) {
            return;
        }
        jxkVar.h(jxlVar, this);
    }

    public boolean i() {
        jxk jxkVar = this.e;
        if (jxkVar == null) {
            return false;
        }
        return jxkVar.i();
    }

    public final jxr l(jxo jxoVar, Object obj) {
        kbb kbbVar = this.f;
        return new jxr(this, kbbVar == null ? new kba(jxoVar, obj, 0) : kbbVar.c(jxoVar, obj, jxoVar.hashCode(), 0));
    }

    private jxr() {
        this.e = null;
        this.f = null;
        this.g = 0;
    }

    public jxr(kbb kbbVar, int i) {
        this.e = null;
        this.f = kbbVar;
        this.g = i;
        e(i);
    }
}
