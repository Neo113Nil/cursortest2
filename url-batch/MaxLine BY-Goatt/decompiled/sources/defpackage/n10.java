package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class n10 {
    public static final zm1 a;

    static {
        pa2 pa2Var = kw.e;
        int i = pa2Var.c;
        k10 k10Var = new k10(pa2Var, pa2Var, 1);
        int i2 = pa2Var.c;
        hu1 hu1Var = kw.x;
        int i3 = (hu1Var.c << 6) | i2;
        m10 m10Var = new m10(pa2Var, hu1Var, 0);
        int i4 = (i2 << 6) | hu1Var.c;
        m10 m10Var2 = new m10(hu1Var, pa2Var, 0);
        zm1 zm1Var = r31.a;
        zm1 zm1Var2 = new zm1();
        zm1Var2.h(i | (i << 6), k10Var);
        zm1Var2.h(i3, m10Var);
        zm1Var2.h(i4, m10Var2);
        a = zm1Var2;
    }
}
