package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface wn1 {
    default tn1 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default tn1 b(Class cls, bn0 bn0Var) {
        return a(cls);
    }

    tn1 c(yg ygVar, bn0 bn0Var);
}
