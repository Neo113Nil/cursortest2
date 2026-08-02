package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jzm extends jza {
    private static final kam a = new kam(new jzl());

    public kam b(Map map) {
        return a;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("policy", c());
        T.e("priority", 5);
        T.g("available", true);
        return T.toString();
    }
}
