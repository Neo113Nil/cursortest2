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
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class y83 {
    public static final u83 o;
    public static final v83 p;
    public static final w83 q;
    public static final /* synthetic */ y83[] r;
    public final z83 m;
    public final int n;

    /* JADX INFO: Fake field, exist only in values array */
    y83 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    y83 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    y83 EF2;

    static {
        y83 y83Var = new y83("DOUBLE", 0, z83.p, 1);
        y83 y83Var2 = new y83("FLOAT", 1, z83.o, 5);
        z83 z83Var = z83.n;
        y83 y83Var3 = new y83("INT64", 2, z83Var, 0);
        y83 y83Var4 = new y83("UINT64", 3, z83Var, 0);
        z83 z83Var2 = z83.m;
        y83 y83Var5 = new y83("INT32", 4, z83Var2, 0);
        y83 y83Var6 = new y83("FIXED64", 5, z83Var, 1);
        y83 y83Var7 = new y83("FIXED32", 6, z83Var2, 5);
        y83 y83Var8 = new y83("BOOL", 7, z83.q, 0);
        u83 u83Var = new u83("STRING", 8, z83.r, 2);
        o = u83Var;
        z83 z83Var3 = z83.u;
        v83 v83Var = new v83("GROUP", 9, z83Var3, 3);
        p = v83Var;
        w83 w83Var = new w83("MESSAGE", 10, z83Var3, 2);
        q = w83Var;
        r = new y83[]{y83Var, y83Var2, y83Var3, y83Var4, y83Var5, y83Var6, y83Var7, y83Var8, u83Var, v83Var, w83Var, new x83("BYTES", 11, z83.s, 2), new y83("UINT32", 12, z83Var2, 0), new y83("ENUM", 13, z83.t, 0), new y83("SFIXED32", 14, z83Var2, 5), new y83("SFIXED64", 15, z83Var, 1), new y83("SINT32", 16, z83Var2, 0), new y83("SINT64", 17, z83Var, 0)};
    }

    public y83(String str, int i, z83 z83Var, int i2) {
        this.m = z83Var;
        this.n = i2;
    }

    public static y83 valueOf(String str) {
        return (y83) Enum.valueOf(y83.class, str);
    }

    public static y83[] values() {
        return (y83[]) r.clone();
    }
}
