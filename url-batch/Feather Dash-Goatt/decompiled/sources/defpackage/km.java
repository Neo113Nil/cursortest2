package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class km {
    public static final en0 a;

    static {
        w31 w31Var = si.e;
        int i = w31Var.c;
        hm hmVar = new hm(w31Var, w31Var, 1);
        int i2 = w31Var.c;
        ar0 ar0Var = si.x;
        int i3 = (ar0Var.c << 6) | i2;
        jm jmVar = new jm(w31Var, ar0Var, 0);
        int i4 = (i2 << 6) | ar0Var.c;
        jm jmVar2 = new jm(ar0Var, w31Var, 0);
        en0 en0Var = r90.a;
        en0 en0Var2 = new en0();
        en0Var2.h(i | (i << 6), hmVar);
        en0Var2.h(i3, jmVar);
        en0Var2.h(i4, jmVar2);
        a = en0Var2;
    }
}
