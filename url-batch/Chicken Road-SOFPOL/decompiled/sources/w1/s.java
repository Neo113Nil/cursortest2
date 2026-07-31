package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f7757d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f7758e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f7759f;

    /* renamed from: g, reason: collision with root package name */
    public static final s f7760g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ s[] f7761h;

    static {
        s sVar = new s("LookaheadMeasurement", 0);
        f7757d = sVar;
        s sVar2 = new s("LookaheadPlacement", 1);
        f7758e = sVar2;
        s sVar3 = new s("Measurement", 2);
        f7759f = sVar3;
        s sVar4 = new s("Placement", 3);
        f7760g = sVar4;
        f7761h = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f7761h.clone();
    }
}
