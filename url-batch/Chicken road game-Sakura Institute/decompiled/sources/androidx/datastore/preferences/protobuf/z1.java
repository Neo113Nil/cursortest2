package androidx.datastore.preferences.protobuf;

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
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class z1 {

    /* renamed from: h, reason: collision with root package name */
    public static final v1 f933h;

    /* renamed from: i, reason: collision with root package name */
    public static final w1 f934i;

    /* renamed from: j, reason: collision with root package name */
    public static final x1 f935j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ z1[] f936k;

    /* renamed from: f, reason: collision with root package name */
    public final a2 f937f;

    /* renamed from: g, reason: collision with root package name */
    public final int f938g;

    /* JADX INFO: Fake field, exist only in values array */
    z1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    z1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    z1 EF2;

    static {
        z1 z1Var = new z1("DOUBLE", 0, a2.f787i, 1);
        z1 z1Var2 = new z1("FLOAT", 1, a2.f786h, 5);
        a2 a2Var = a2.f785g;
        z1 z1Var3 = new z1("INT64", 2, a2Var, 0);
        z1 z1Var4 = new z1("UINT64", 3, a2Var, 0);
        a2 a2Var2 = a2.f784f;
        z1 z1Var5 = new z1("INT32", 4, a2Var2, 0);
        z1 z1Var6 = new z1("FIXED64", 5, a2Var, 1);
        z1 z1Var7 = new z1("FIXED32", 6, a2Var2, 5);
        z1 z1Var8 = new z1("BOOL", 7, a2.f788j, 0);
        v1 v1Var = new v1("STRING", 8, a2.f789k, 2);
        f933h = v1Var;
        a2 a2Var3 = a2.f792n;
        w1 w1Var = new w1("GROUP", 9, a2Var3, 3);
        f934i = w1Var;
        x1 x1Var = new x1("MESSAGE", 10, a2Var3, 2);
        f935j = x1Var;
        f936k = new z1[]{z1Var, z1Var2, z1Var3, z1Var4, z1Var5, z1Var6, z1Var7, z1Var8, v1Var, w1Var, x1Var, new y1("BYTES", 11, a2.f790l, 2), new z1("UINT32", 12, a2Var2, 0), new z1("ENUM", 13, a2.f791m, 0), new z1("SFIXED32", 14, a2Var2, 5), new z1("SFIXED64", 15, a2Var, 1), new z1("SINT32", 16, a2Var2, 0), new z1("SINT64", 17, a2Var, 0)};
    }

    public z1(String str, int i7, a2 a2Var, int i8) {
        this.f937f = a2Var;
        this.f938g = i8;
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) f936k.clone();
    }
}
