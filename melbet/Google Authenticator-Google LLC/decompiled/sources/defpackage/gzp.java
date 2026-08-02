package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class gzp implements Serializable {
    private static final long serialVersionUID = 0;

    public static gzp g(Object obj) {
        return obj == null ? gyf.a : new gzs(obj);
    }

    public static gzp h(Object obj) {
        obj.getClass();
        return new gzs(obj);
    }

    public abstract gzp a(gzf gzfVar);

    public abstract Object b();

    public abstract Object c(hac hacVar);

    public abstract Object d(Object obj);

    public abstract Object e();

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract int hashCode();
}
