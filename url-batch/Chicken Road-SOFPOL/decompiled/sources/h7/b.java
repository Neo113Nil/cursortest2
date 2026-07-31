package h7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3221d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f3222e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f3223f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f3224g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f3225h;
    public static final /* synthetic */ b[] i;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f3221d = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f3222e = bVar2;
        b bVar3 = new b("PARKING", 2);
        f3223f = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f3224g = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f3225h = bVar5;
        i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) i.clone();
    }
}
