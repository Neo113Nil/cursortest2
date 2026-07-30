package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class bq1 {
    public static final xp1 g;
    public static final yp1 h;
    public static final zp1 i;
    public static final /* synthetic */ bq1[] j;
    public final cq1 d;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    bq1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    bq1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    bq1 EF2;

    static {
        bq1 bq1Var = new bq1("DOUBLE", 0, cq1.h, 1);
        bq1 bq1Var2 = new bq1("FLOAT", 1, cq1.g, 5);
        cq1 cq1Var = cq1.e;
        bq1 bq1Var3 = new bq1("INT64", 2, cq1Var, 0);
        bq1 bq1Var4 = new bq1("UINT64", 3, cq1Var, 0);
        cq1 cq1Var2 = cq1.d;
        bq1 bq1Var5 = new bq1("INT32", 4, cq1Var2, 0);
        bq1 bq1Var6 = new bq1("FIXED64", 5, cq1Var, 1);
        bq1 bq1Var7 = new bq1("FIXED32", 6, cq1Var2, 5);
        bq1 bq1Var8 = new bq1("BOOL", 7, cq1.i, 0);
        xp1 xp1Var = new xp1("STRING", 8, cq1.j, 2);
        g = xp1Var;
        cq1 cq1Var3 = cq1.m;
        yp1 yp1Var = new yp1("GROUP", 9, cq1Var3, 3);
        h = yp1Var;
        zp1 zp1Var = new zp1("MESSAGE", 10, cq1Var3, 2);
        i = zp1Var;
        j = new bq1[]{bq1Var, bq1Var2, bq1Var3, bq1Var4, bq1Var5, bq1Var6, bq1Var7, bq1Var8, xp1Var, yp1Var, zp1Var, new aq1("BYTES", 11, cq1.k, 2), new bq1("UINT32", 12, cq1Var2, 0), new bq1("ENUM", 13, cq1.l, 0), new bq1("SFIXED32", 14, cq1Var2, 5), new bq1("SFIXED64", 15, cq1Var, 1), new bq1("SINT32", 16, cq1Var2, 0), new bq1("SINT64", 17, cq1Var, 0)};
    }

    public bq1(String str, int i2, cq1 cq1Var, int i3) {
        this.d = cq1Var;
        this.e = i3;
    }

    public static bq1 valueOf(String str) {
        return (bq1) Enum.valueOf(bq1.class, str);
    }

    public static bq1[] values() {
        return (bq1[]) j.clone();
    }
}
