package ne;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7258d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f7259e;

    /* renamed from: i, reason: collision with root package name */
    public static final b f7260i;

    /* renamed from: r, reason: collision with root package name */
    public static final b f7261r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f7262s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b[] f7263t;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f7258d = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f7259e = bVar2;
        b bVar3 = new b("PARKING", 2);
        f7260i = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f7261r = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f7262s = bVar5;
        f7263t = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f7263t.clone();
    }
}
