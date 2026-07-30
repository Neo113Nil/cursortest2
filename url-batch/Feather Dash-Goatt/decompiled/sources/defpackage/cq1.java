package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cq1 {
    public static final cq1 d;
    public static final cq1 e;
    public static final cq1 g;
    public static final cq1 h;
    public static final cq1 i;
    public static final cq1 j;
    public static final cq1 k;
    public static final cq1 l;
    public static final cq1 m;
    public static final /* synthetic */ cq1[] n;

    static {
        cq1 cq1Var = new cq1("INT", 0);
        d = cq1Var;
        cq1 cq1Var2 = new cq1("LONG", 1);
        e = cq1Var2;
        cq1 cq1Var3 = new cq1("FLOAT", 2);
        g = cq1Var3;
        cq1 cq1Var4 = new cq1("DOUBLE", 3);
        h = cq1Var4;
        cq1 cq1Var5 = new cq1("BOOLEAN", 4);
        i = cq1Var5;
        cq1 cq1Var6 = new cq1("STRING", 5);
        j = cq1Var6;
        ff ffVar = ff.g;
        cq1 cq1Var7 = new cq1("BYTE_STRING", 6);
        k = cq1Var7;
        cq1 cq1Var8 = new cq1("ENUM", 7);
        l = cq1Var8;
        cq1 cq1Var9 = new cq1("MESSAGE", 8);
        m = cq1Var9;
        n = new cq1[]{cq1Var, cq1Var2, cq1Var3, cq1Var4, cq1Var5, cq1Var6, cq1Var7, cq1Var8, cq1Var9};
    }

    public static cq1 valueOf(String str) {
        return (cq1) Enum.valueOf(cq1.class, str);
    }

    public static cq1[] values() {
        return (cq1[]) n.clone();
    }
}
