package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface q53 {
    default n53 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default n53 b(Class cls, wm1 wm1Var) {
        return a(cls);
    }

    default n53 c(gu guVar, wm1 wm1Var) {
        return b(yj1.y(guVar), wm1Var);
    }
}
