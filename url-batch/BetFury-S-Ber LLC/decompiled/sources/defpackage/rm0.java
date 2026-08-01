package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public interface rm0 {
    default om0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default om0 e(Class cls, a30 a30Var) {
        return a(cls);
    }

    default om0 i(dc dcVar, a30 a30Var) {
        return e(mv.u(dcVar), a30Var);
    }
}
