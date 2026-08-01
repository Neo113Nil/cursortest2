package j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final b f2260f;
    public static final b g;
    public static final b h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f2261i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f2262j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f2263k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f2264l;

    static {
        b bVar = new b("SQRT", 0);
        f2260f = bVar;
        b bVar2 = new b("SIN", 1);
        g = bVar2;
        b bVar3 = new b("COS", 2);
        h = bVar3;
        b bVar4 = new b("TAN", 3);
        f2261i = bVar4;
        b bVar5 = new b("LOG", 4);
        f2262j = bVar5;
        b bVar6 = new b("LN", 5);
        f2263k = bVar6;
        f2264l = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2264l.clone();
    }
}
