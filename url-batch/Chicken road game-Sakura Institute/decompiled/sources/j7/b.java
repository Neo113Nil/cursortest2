package j7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final b f5134f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f5135g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f5136h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f5137i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f5138j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b[] f5139k;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f5134f = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f5135g = bVar2;
        b bVar3 = new b("PARKING", 2);
        f5136h = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f5137i = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f5138j = bVar5;
        f5139k = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5139k.clone();
    }
}
