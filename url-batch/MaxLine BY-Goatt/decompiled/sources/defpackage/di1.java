package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class di1 {
    public static ci1 a(Object obj, Object obj2) {
        ci1 ci1Var = (ci1) obj;
        ci1 ci1Var2 = (ci1) obj2;
        if (!ci1Var2.isEmpty()) {
            if (!ci1Var.m) {
                ci1Var = ci1Var.b();
            }
            ci1Var.a();
            if (!ci1Var2.isEmpty()) {
                ci1Var.putAll(ci1Var2);
            }
        }
        return ci1Var;
    }
}
