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
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: f, reason: collision with root package name */
    public static final o1 f766f;

    /* renamed from: g, reason: collision with root package name */
    public static final p1 f767g;

    /* renamed from: h, reason: collision with root package name */
    public static final q1 f768h;
    public static final /* synthetic */ s1[] i;

    /* renamed from: d, reason: collision with root package name */
    public final t1 f769d;

    /* renamed from: e, reason: collision with root package name */
    public final int f770e;

    /* JADX INFO: Fake field, exist only in values array */
    s1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    s1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    s1 EF2;

    static {
        s1 s1Var = new s1("DOUBLE", 0, t1.f776g, 1);
        s1 s1Var2 = new s1("FLOAT", 1, t1.f775f, 5);
        t1 t1Var = t1.f774e;
        s1 s1Var3 = new s1("INT64", 2, t1Var, 0);
        s1 s1Var4 = new s1("UINT64", 3, t1Var, 0);
        t1 t1Var2 = t1.f773d;
        s1 s1Var5 = new s1("INT32", 4, t1Var2, 0);
        s1 s1Var6 = new s1("FIXED64", 5, t1Var, 1);
        s1 s1Var7 = new s1("FIXED32", 6, t1Var2, 5);
        s1 s1Var8 = new s1("BOOL", 7, t1.f777h, 0);
        o1 o1Var = new o1("STRING", 8, t1.i, 2);
        f766f = o1Var;
        t1 t1Var3 = t1.f780l;
        p1 p1Var = new p1("GROUP", 9, t1Var3, 3);
        f767g = p1Var;
        q1 q1Var = new q1("MESSAGE", 10, t1Var3, 2);
        f768h = q1Var;
        i = new s1[]{s1Var, s1Var2, s1Var3, s1Var4, s1Var5, s1Var6, s1Var7, s1Var8, o1Var, p1Var, q1Var, new r1("BYTES", 11, t1.f778j, 2), new s1("UINT32", 12, t1Var2, 0), new s1("ENUM", 13, t1.f779k, 0), new s1("SFIXED32", 14, t1Var2, 5), new s1("SFIXED64", 15, t1Var, 1), new s1("SINT32", 16, t1Var2, 0), new s1("SINT64", 17, t1Var, 0)};
    }

    public s1(String str, int i8, t1 t1Var, int i9) {
        this.f769d = t1Var;
        this.f770e = i9;
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) i.clone();
    }
}
