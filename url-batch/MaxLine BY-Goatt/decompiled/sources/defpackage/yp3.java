package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yp3 {
    public static final yp3 o;
    public static final yp3 p;
    public static final /* synthetic */ yp3[] q;
    public final aq3 m;
    public final int n;

    /* JADX INFO: Fake field, exist only in values array */
    yp3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    yp3 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    yp3 EF0;

    static {
        yp3 yp3Var = new yp3("DOUBLE", 0, aq3.p, 1);
        yp3 yp3Var2 = new yp3("FLOAT", 1, aq3.o, 5);
        aq3 aq3Var = aq3.n;
        yp3 yp3Var3 = new yp3("INT64", 2, aq3Var, 0);
        yp3 yp3Var4 = new yp3("UINT64", 3, aq3Var, 0);
        aq3 aq3Var2 = aq3.m;
        yp3 yp3Var5 = new yp3("INT32", 4, aq3Var2, 0);
        yp3 yp3Var6 = new yp3("FIXED64", 5, aq3Var, 1);
        yp3 yp3Var7 = new yp3("FIXED32", 6, aq3Var2, 5);
        yp3 yp3Var8 = new yp3("BOOL", 7, aq3.q, 0);
        yp3 yp3Var9 = new yp3("STRING", 8, aq3.r, 2);
        o = yp3Var9;
        aq3 aq3Var3 = aq3.u;
        yp3 yp3Var10 = new yp3("GROUP", 9, aq3Var3, 3);
        p = yp3Var10;
        q = new yp3[]{yp3Var, yp3Var2, yp3Var3, yp3Var4, yp3Var5, yp3Var6, yp3Var7, yp3Var8, yp3Var9, yp3Var10, new yp3("MESSAGE", 10, aq3Var3, 2), new yp3("BYTES", 11, aq3.s, 2), new yp3("UINT32", 12, aq3Var2, 0), new yp3("ENUM", 13, aq3.t, 0), new yp3("SFIXED32", 14, aq3Var2, 5), new yp3("SFIXED64", 15, aq3Var, 1), new yp3("SINT32", 16, aq3Var2, 0), new yp3("SINT64", 17, aq3Var, 0)};
    }

    public yp3(String str, int i, aq3 aq3Var, int i2) {
        this.m = aq3Var;
        this.n = i2;
    }

    public static yp3[] values() {
        return (yp3[]) q.clone();
    }
}
