package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mc0 implements w52 {
    public static final Object o = new Object();
    public volatile ek0 m;
    public volatile Object n;

    public static w52 a(ek0 ek0Var) {
        if (ek0Var instanceof mc0) {
            return ek0Var;
        }
        mc0 mc0Var = new mc0();
        mc0Var.n = o;
        mc0Var.m = ek0Var;
        return mc0Var;
    }

    @Override // defpackage.w52
    public final Object get() {
        Object obj;
        Object obj2 = this.n;
        Object obj3 = o;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.n;
                if (obj == obj3) {
                    obj = this.m.get();
                    Object obj4 = this.n;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.n = obj;
                    this.m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
