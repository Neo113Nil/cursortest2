package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qq2 implements pq2, Serializable {
    private static final long serialVersionUID = 0;
    public final u9 m;
    public volatile transient boolean n;
    public transient Object o;

    public qq2(u9 u9Var) {
        this.m = u9Var;
    }

    @Override // defpackage.pq2
    public final Object get() {
        if (!this.n) {
            synchronized (this) {
                try {
                    if (!this.n) {
                        Object obj = this.m.get();
                        this.o = obj;
                        this.n = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.o;
    }

    public final String toString() {
        Object obj;
        if (this.n) {
            String valueOf = String.valueOf(this.o);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.m;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
