package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jww {
    public static final jww a;
    public final jxs b;
    public final Executor c;
    public final List d;
    public final Integer e;
    public final Integer f;
    private final Object[][] g;
    private final Boolean h;

    static {
        kby kbyVar = new kby(null);
        kbyVar.e = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        kbyVar.c = Collections.EMPTY_LIST;
        a = new jww(kbyVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public jww(kby kbyVar) {
        this.b = (jxs) kbyVar.d;
        this.c = kbyVar.a;
        this.g = (Object[][]) kbyVar.e;
        this.d = kbyVar.c;
        this.h = (Boolean) kbyVar.f;
        this.e = (Integer) kbyVar.b;
        this.f = (Integer) kbyVar.g;
    }

    public static kby g(jww jwwVar) {
        kby kbyVar = new kby(null);
        kbyVar.d = jwwVar.b;
        kbyVar.a = jwwVar.c;
        kbyVar.e = jwwVar.g;
        kbyVar.c = jwwVar.d;
        kbyVar.f = jwwVar.h;
        kbyVar.b = jwwVar.e;
        kbyVar.g = jwwVar.f;
        return kbyVar;
    }

    public final jww a(jxs jxsVar) {
        kby g = g(this);
        g.d = jxsVar;
        return new jww(g);
    }

    public final jww b(int i) {
        hoq.A(i >= 0, "invalid maxsize %s", i);
        kby g = g(this);
        g.b = Integer.valueOf(i);
        return new jww(g);
    }

    public final jww c(int i) {
        hoq.A(i >= 0, "invalid maxsize %s", i);
        kby g = g(this);
        g.g = Integer.valueOf(i);
        return new jww(g);
    }

    public final jww d(jwv jwvVar, Object obj) {
        Object[][] objArr;
        int length;
        jwvVar.getClass();
        obj.getClass();
        kby g = g(this);
        int i = 0;
        while (true) {
            objArr = this.g;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (jwvVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        g.e = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + length, 2);
        System.arraycopy(objArr, 0, g.e, 0, length);
        if (i == -1) {
            ((Object[][]) g.e)[length] = new Object[]{jwvVar, obj};
        } else {
            ((Object[][]) g.e)[i] = new Object[]{jwvVar, obj};
        }
        return new jww(g);
    }

    public final Object e(jwv jwvVar) {
        jwvVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.g;
            if (i >= objArr.length) {
                return jwvVar.a;
            }
            if (jwvVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean f() {
        return Boolean.TRUE.equals(this.h);
    }

    public final jww h(iwv iwvVar) {
        List list = this.d;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(iwvVar);
        kby g = g(this);
        g.c = DesugarCollections.unmodifiableList(arrayList);
        return new jww(g);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("deadline", this.b);
        T.b("authority", null);
        T.b("callCredentials", null);
        Executor executor = this.c;
        T.b("executor", executor != null ? executor.getClass() : null);
        T.b("compressorName", null);
        T.b("customOptions", Arrays.deepToString(this.g));
        T.g("waitForReady", f());
        T.b("maxInboundMessageSize", this.e);
        T.b("maxOutboundMessageSize", this.f);
        T.b("onReadyThreshold", null);
        T.b("streamTracerFactories", this.d);
        return T.toString();
    }
}
