package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final o0 f6765d;

    /* renamed from: e, reason: collision with root package name */
    public static final o0 f6766e;

    /* renamed from: i, reason: collision with root package name */
    public static final o0 f6767i;

    /* renamed from: r, reason: collision with root package name */
    public static final o0 f6768r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ o0[] f6769s;

    static {
        o0 o0Var = new o0("IGNORED", 0);
        f6765d = o0Var;
        o0 o0Var2 = new o0("SCHEDULED", 1);
        f6766e = o0Var2;
        o0 o0Var3 = new o0("DEFERRED", 2);
        f6767i = o0Var3;
        o0 o0Var4 = new o0("IMMINENT", 3);
        f6768r = o0Var4;
        f6769s = new o0[]{o0Var, o0Var2, o0Var3, o0Var4};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f6769s.clone();
    }
}
