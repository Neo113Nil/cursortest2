package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ys implements o01 {
    public static final Object g = new Object();
    public volatile tw d;
    public volatile Object e;

    public static o01 a(tw twVar) {
        if (twVar instanceof ys) {
            return twVar;
        }
        ys ysVar = new ys();
        ysVar.e = g;
        ysVar.d = twVar;
        return ysVar;
    }

    @Override // defpackage.o01
    public final Object get() {
        Object obj;
        Object obj2 = this.e;
        Object obj3 = g;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.e;
                if (obj == obj3) {
                    obj = this.d.get();
                    Object obj4 = this.e;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.e = obj;
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
