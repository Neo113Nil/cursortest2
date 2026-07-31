package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: d, reason: collision with root package name */
    public static final t1 f773d;

    /* renamed from: e, reason: collision with root package name */
    public static final t1 f774e;

    /* renamed from: f, reason: collision with root package name */
    public static final t1 f775f;

    /* renamed from: g, reason: collision with root package name */
    public static final t1 f776g;

    /* renamed from: h, reason: collision with root package name */
    public static final t1 f777h;
    public static final t1 i;

    /* renamed from: j, reason: collision with root package name */
    public static final t1 f778j;

    /* renamed from: k, reason: collision with root package name */
    public static final t1 f779k;

    /* renamed from: l, reason: collision with root package name */
    public static final t1 f780l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ t1[] f781m;

    static {
        t1 t1Var = new t1("INT", 0);
        f773d = t1Var;
        t1 t1Var2 = new t1("LONG", 1);
        f774e = t1Var2;
        t1 t1Var3 = new t1("FLOAT", 2);
        f775f = t1Var3;
        t1 t1Var4 = new t1("DOUBLE", 3);
        f776g = t1Var4;
        t1 t1Var5 = new t1("BOOLEAN", 4);
        f777h = t1Var5;
        t1 t1Var6 = new t1("STRING", 5);
        i = t1Var6;
        g gVar = g.f682f;
        t1 t1Var7 = new t1("BYTE_STRING", 6);
        f778j = t1Var7;
        t1 t1Var8 = new t1("ENUM", 7);
        f779k = t1Var8;
        t1 t1Var9 = new t1("MESSAGE", 8);
        f780l = t1Var9;
        f781m = new t1[]{t1Var, t1Var2, t1Var3, t1Var4, t1Var5, t1Var6, t1Var7, t1Var8, t1Var9};
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) f781m.clone();
    }
}
