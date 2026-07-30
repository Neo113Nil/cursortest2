package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rq2 implements pq2 {
    public volatile u9 m;
    public volatile boolean n;
    public Object o;

    @Override // defpackage.pq2
    public final Object get() {
        if (!this.n) {
            synchronized (this) {
                try {
                    if (!this.n) {
                        u9 u9Var = this.m;
                        Objects.requireNonNull(u9Var);
                        Object obj = u9Var.get();
                        this.o = obj;
                        this.n = true;
                        this.m = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.o;
    }

    public final String toString() {
        Object obj = this.m;
        if (obj == null) {
            String valueOf = String.valueOf(this.o);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
