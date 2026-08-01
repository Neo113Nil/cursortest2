package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: d, reason: collision with root package name */
    public static final s1 f624d;

    /* renamed from: e, reason: collision with root package name */
    public static final s1 f625e;

    /* renamed from: i, reason: collision with root package name */
    public static final s1 f626i;

    /* renamed from: r, reason: collision with root package name */
    public static final s1 f627r;

    /* renamed from: s, reason: collision with root package name */
    public static final s1 f628s;

    /* renamed from: t, reason: collision with root package name */
    public static final s1 f629t;

    /* renamed from: u, reason: collision with root package name */
    public static final s1 f630u;

    /* renamed from: v, reason: collision with root package name */
    public static final s1 f631v;

    /* renamed from: w, reason: collision with root package name */
    public static final s1 f632w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ s1[] f633x;

    static {
        s1 s1Var = new s1("INT", 0);
        f624d = s1Var;
        s1 s1Var2 = new s1("LONG", 1);
        f625e = s1Var2;
        s1 s1Var3 = new s1("FLOAT", 2);
        f626i = s1Var3;
        s1 s1Var4 = new s1("DOUBLE", 3);
        f627r = s1Var4;
        s1 s1Var5 = new s1("BOOLEAN", 4);
        f628s = s1Var5;
        s1 s1Var6 = new s1("STRING", 5);
        f629t = s1Var6;
        f fVar = f.f533i;
        s1 s1Var7 = new s1("BYTE_STRING", 6);
        f630u = s1Var7;
        s1 s1Var8 = new s1("ENUM", 7);
        f631v = s1Var8;
        s1 s1Var9 = new s1("MESSAGE", 8);
        f632w = s1Var9;
        f633x = new s1[]{s1Var, s1Var2, s1Var3, s1Var4, s1Var5, s1Var6, s1Var7, s1Var8, s1Var9};
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) f633x.clone();
    }
}
