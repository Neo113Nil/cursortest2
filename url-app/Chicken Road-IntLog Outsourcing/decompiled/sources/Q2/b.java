package Q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2476a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f2477b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f2478c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f2479d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f2480e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f2481f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f2482g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f2483h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f2484i;

    static {
        b bVar = new b("STRING", 0);
        f2476a = bVar;
        b bVar2 = new b("BOOLEAN", 1);
        f2477b = bVar2;
        b bVar3 = new b("LONG", 2);
        f2478c = bVar3;
        b bVar4 = new b("DOUBLE", 3);
        f2479d = bVar4;
        b bVar5 = new b("STRING_ARRAY", 4);
        f2480e = bVar5;
        b bVar6 = new b("BOOLEAN_ARRAY", 5);
        f2481f = bVar6;
        b bVar7 = new b("LONG_ARRAY", 6);
        f2482g = bVar7;
        b bVar8 = new b("DOUBLE_ARRAY", 7);
        f2483h = bVar8;
        f2484i = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2484i.clone();
    }
}
