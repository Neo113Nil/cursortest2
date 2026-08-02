package A2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f38b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f39c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f40d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f41e;
    public static final /* synthetic */ b[] f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f37a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f38b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f39c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f40d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f41e = bVar5;
        f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f.clone();
    }
}
