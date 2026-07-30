package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gr1 implements kr1 {
    public static final Object g = new Object();
    public volatile ir1 d;
    public volatile Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public static gr1 b(ir1 ir1Var) {
        if (ir1Var instanceof gr1) {
            return (gr1) ir1Var;
        }
        gr1 gr1Var = new gr1();
        gr1Var.e = g;
        gr1Var.d = ir1Var;
        return gr1Var;
    }

    @Override // defpackage.kr1
    public final Object a() {
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
                    obj = this.d.a();
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
