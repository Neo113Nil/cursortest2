package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f2947d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f2948e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f2949f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f2950g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f2951h;
    public static final g i;

    /* renamed from: j, reason: collision with root package name */
    public static final g f2952j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ g[] f2953k;

    static {
        g gVar = new g("Paragraph", 0);
        f2947d = gVar;
        g gVar2 = new g("Span", 1);
        f2948e = gVar2;
        g gVar3 = new g("VerbatimTts", 2);
        f2949f = gVar3;
        g gVar4 = new g("Url", 3);
        f2950g = gVar4;
        g gVar5 = new g("Link", 4);
        f2951h = gVar5;
        g gVar6 = new g("Clickable", 5);
        i = gVar6;
        g gVar7 = new g("String", 6);
        f2952j = gVar7;
        f2953k = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f2953k.clone();
    }
}
