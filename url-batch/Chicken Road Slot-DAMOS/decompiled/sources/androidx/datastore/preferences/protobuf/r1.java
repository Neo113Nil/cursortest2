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
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class r1 {

    /* renamed from: i, reason: collision with root package name */
    public static final n1 f616i;

    /* renamed from: r, reason: collision with root package name */
    public static final o1 f617r;

    /* renamed from: s, reason: collision with root package name */
    public static final p1 f618s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ r1[] f619t;

    /* renamed from: d, reason: collision with root package name */
    public final s1 f620d;

    /* renamed from: e, reason: collision with root package name */
    public final int f621e;

    /* JADX INFO: Fake field, exist only in values array */
    r1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    r1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    r1 EF2;

    static {
        r1 r1Var = new r1("DOUBLE", 0, s1.f627r, 1);
        r1 r1Var2 = new r1("FLOAT", 1, s1.f626i, 5);
        s1 s1Var = s1.f625e;
        r1 r1Var3 = new r1("INT64", 2, s1Var, 0);
        r1 r1Var4 = new r1("UINT64", 3, s1Var, 0);
        s1 s1Var2 = s1.f624d;
        r1 r1Var5 = new r1("INT32", 4, s1Var2, 0);
        r1 r1Var6 = new r1("FIXED64", 5, s1Var, 1);
        r1 r1Var7 = new r1("FIXED32", 6, s1Var2, 5);
        r1 r1Var8 = new r1("BOOL", 7, s1.f628s, 0);
        n1 n1Var = new n1("STRING", 8, s1.f629t, 2);
        f616i = n1Var;
        s1 s1Var3 = s1.f632w;
        o1 o1Var = new o1("GROUP", 9, s1Var3, 3);
        f617r = o1Var;
        p1 p1Var = new p1("MESSAGE", 10, s1Var3, 2);
        f618s = p1Var;
        f619t = new r1[]{r1Var, r1Var2, r1Var3, r1Var4, r1Var5, r1Var6, r1Var7, r1Var8, n1Var, o1Var, p1Var, new q1("BYTES", 11, s1.f630u, 2), new r1("UINT32", 12, s1Var2, 0), new r1("ENUM", 13, s1.f631v, 0), new r1("SFIXED32", 14, s1Var2, 5), new r1("SFIXED64", 15, s1Var, 1), new r1("SINT32", 16, s1Var2, 0), new r1("SINT64", 17, s1Var, 0)};
    }

    public r1(String str, int i3, s1 s1Var, int i10) {
        this.f620d = s1Var;
        this.f621e = i10;
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) f619t.clone();
    }
}
