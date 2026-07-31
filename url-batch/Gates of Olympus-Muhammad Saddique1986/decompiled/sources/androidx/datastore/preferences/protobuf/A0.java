package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class A0 {

    /* renamed from: f, reason: collision with root package name */
    public static final w0 f4976f;

    /* renamed from: g, reason: collision with root package name */
    public static final x0 f4977g;

    /* renamed from: h, reason: collision with root package name */
    public static final y0 f4978h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ A0[] f4979i;

    /* renamed from: d, reason: collision with root package name */
    public final B0 f4980d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4981e;

    /* JADX INFO: Fake field, exist only in values array */
    A0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    A0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    A0 EF12;

    static {
        A0 a02 = new A0("DOUBLE", 0, B0.DOUBLE, 1);
        A0 a03 = new A0("FLOAT", 1, B0.FLOAT, 5);
        B0 b02 = B0.LONG;
        A0 a04 = new A0("INT64", 2, b02, 0);
        A0 a05 = new A0("UINT64", 3, b02, 0);
        B0 b03 = B0.INT;
        A0 a06 = new A0("INT32", 4, b03, 0);
        A0 a07 = new A0("FIXED64", 5, b02, 1);
        A0 a08 = new A0("FIXED32", 6, b03, 5);
        A0 a09 = new A0("BOOL", 7, B0.BOOLEAN, 0);
        w0 w0Var = new w0("STRING", 8, B0.STRING, 2);
        f4976f = w0Var;
        B0 b04 = B0.MESSAGE;
        x0 x0Var = new x0("GROUP", 9, b04, 3);
        f4977g = x0Var;
        y0 y0Var = new y0("MESSAGE", 10, b04, 2);
        f4978h = y0Var;
        f4979i = new A0[]{a02, a03, a04, a05, a06, a07, a08, a09, w0Var, x0Var, y0Var, new z0("BYTES", 11, B0.BYTE_STRING, 2), new A0("UINT32", 12, b03, 0), new A0("ENUM", 13, B0.ENUM, 0), new A0("SFIXED32", 14, b03, 5), new A0("SFIXED64", 15, b02, 1), new A0("SINT32", 16, b03, 0), new A0("SINT64", 17, b02, 0)};
    }

    public A0(String str, int i3, B0 b02, int i4) {
        this.f4980d = b02;
        this.f4981e = i4;
    }

    public static A0 valueOf(String str) {
        return (A0) Enum.valueOf(A0.class, str);
    }

    public static A0[] values() {
        return (A0[]) f4979i.clone();
    }
}
