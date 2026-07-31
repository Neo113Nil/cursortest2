package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f5036d;

    /* renamed from: e, reason: collision with root package name */
    public static final p0 f5037e;

    /* renamed from: f, reason: collision with root package name */
    public static final p0 f5038f;

    /* renamed from: g, reason: collision with root package name */
    public static final p0 f5039g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p0[] f5040h;

    static {
        p0 p0Var = new p0("IGNORED", 0);
        f5036d = p0Var;
        p0 p0Var2 = new p0("SCHEDULED", 1);
        f5037e = p0Var2;
        p0 p0Var3 = new p0("DEFERRED", 2);
        f5038f = p0Var3;
        p0 p0Var4 = new p0("IMMINENT", 3);
        f5039g = p0Var4;
        f5040h = new p0[]{p0Var, p0Var2, p0Var3, p0Var4};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f5040h.clone();
    }
}
