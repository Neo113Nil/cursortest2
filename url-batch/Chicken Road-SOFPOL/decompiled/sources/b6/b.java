package b6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f1262d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1263e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f1264f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f1265g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b[] f1266h;

    static {
        b bVar = new b("GAME", 0);
        f1262d = bVar;
        b bVar2 = new b("QUIZ", 1);
        f1263e = bVar2;
        b bVar3 = new b("EXPLORATION", 2);
        f1264f = bVar3;
        b bVar4 = new b("MILESTONE", 3);
        f1265g = bVar4;
        f1266h = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1266h.clone();
    }
}
