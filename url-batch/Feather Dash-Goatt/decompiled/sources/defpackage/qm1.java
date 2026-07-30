package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface qm1 {
    boolean a();

    long b(v7 v7Var, v7 v7Var2, v7 v7Var3);

    v7 h(long j, v7 v7Var, v7 v7Var2, v7 v7Var3);

    v7 m(long j, v7 v7Var, v7 v7Var2, v7 v7Var3);

    default v7 n(v7 v7Var, v7 v7Var2, v7 v7Var3) {
        return h(b(v7Var, v7Var2, v7Var3), v7Var, v7Var2, v7Var3);
    }
}
