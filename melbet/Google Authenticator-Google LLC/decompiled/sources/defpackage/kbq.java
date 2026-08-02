package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbq {
    public static final List a;
    public static final kbq b;
    public static final kbq c;
    public static final kbq d;
    public static final kbq e;
    public static final kbq f;
    public static final kbq g;
    public static final kbq h;
    public static final kbq i;
    public static final kbq j;
    public static final kbq k;
    public static final kbq l;
    static final jzw m;
    static final jzw n;
    private static final jzz r;
    public final kbn o;
    public final String p;
    public final Throwable q;

    static {
        TreeMap treeMap = new TreeMap();
        for (kbn kbnVar : kbn.values()) {
            kbq kbqVar = (kbq) treeMap.put(Integer.valueOf(kbnVar.r), new kbq(kbnVar, null, null));
            if (kbqVar != null) {
                throw new IllegalStateException("Code value duplication between " + kbqVar.o.name() + " & " + kbnVar.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        b = kbn.OK.a();
        c = kbn.CANCELLED.a();
        d = kbn.UNKNOWN.a();
        kbn.INVALID_ARGUMENT.a();
        e = kbn.DEADLINE_EXCEEDED.a();
        kbn.NOT_FOUND.a();
        kbn.ALREADY_EXISTS.a();
        f = kbn.PERMISSION_DENIED.a();
        g = kbn.UNAUTHENTICATED.a();
        h = kbn.RESOURCE_EXHAUSTED.a();
        i = kbn.FAILED_PRECONDITION.a();
        kbn.ABORTED.a();
        kbn.OUT_OF_RANGE.a();
        j = kbn.UNIMPLEMENTED.a();
        k = kbn.INTERNAL.a();
        l = kbn.UNAVAILABLE.a();
        kbn.DATA_LOSS.a();
        kbo kboVar = new kbo();
        int i2 = jzw.d;
        m = new jzy("grpc-status", false, kboVar);
        kbp kbpVar = new kbp();
        r = kbpVar;
        n = new jzy("grpc-message", false, kbpVar);
    }

    private kbq(kbn kbnVar, String str, Throwable th) {
        kbnVar.getClass();
        this.o = kbnVar;
        this.p = str;
        this.q = th;
    }

    public static kbq b(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 < list.size()) {
                return (kbq) list.get(i2);
            }
        }
        return d.e(a.Y(i2, "Unknown code "));
    }

    public static kbq c(Throwable th) {
        th.getClass();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof kbr) {
                return ((kbr) th2).a;
            }
            if (th2 instanceof kbt) {
                return ((kbt) th2).a;
            }
        }
        return d.d(th);
    }

    static String f(kbq kbqVar) {
        String str = kbqVar.p;
        kbn kbnVar = kbqVar.o;
        if (str == null) {
            return kbnVar.toString();
        }
        return kbnVar.toString() + ": " + str;
    }

    public final kbq a(String str) {
        if (str == null) {
            return this;
        }
        String str2 = this.p;
        kbn kbnVar = this.o;
        return str2 == null ? new kbq(kbnVar, str, this.q) : new kbq(kbnVar, a.ag(str, str2, "\n"), this.q);
    }

    public final kbq d(Throwable th) {
        return Objects.equals(this.q, th) ? this : new kbq(this.o, this.p, th);
    }

    public final kbq e(String str) {
        return Objects.equals(this.p, str) ? this : new kbq(this.o, str, this.q);
    }

    public final boolean g() {
        return kbn.OK == this.o;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("code", this.o.name());
        T.b("description", this.p);
        Throwable th = this.q;
        Object obj = th;
        if (th != null) {
            int i2 = hag.a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        T.b("cause", obj);
        return T.toString();
    }
}
