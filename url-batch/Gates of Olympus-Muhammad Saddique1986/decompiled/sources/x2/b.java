package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f10329d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f10330e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f10331f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f10332g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f10333h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f10334i;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f10329d = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f10330e = bVar2;
        b bVar3 = new b("PARKING", 2);
        f10331f = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f10332g = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f10333h = bVar5;
        f10334i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10334i.clone();
    }
}
