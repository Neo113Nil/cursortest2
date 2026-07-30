package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tg3 {
    public static final Object f = new Object();
    public final String a;
    public final nd3 b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ tg3(String str, Object obj, nd3 nd3Var) {
        this.a = str;
        this.c = obj;
        this.b = nd3Var;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (uj2.b == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (dq2.j()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (tg3 tg3Var : ug3.a) {
                        if (dq2.j()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            nd3 nd3Var = tg3Var.b;
                            if (nd3Var != null) {
                                obj2 = nd3Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            tg3Var.e = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                nd3 nd3Var2 = this.b;
                if (nd3Var2 != null) {
                    try {
                        return nd3Var2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } finally {
            }
        }
    }
}
