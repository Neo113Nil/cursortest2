package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f6468d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f6469e;

    /* renamed from: i, reason: collision with root package name */
    public static final g f6470i;

    /* renamed from: r, reason: collision with root package name */
    public static final g f6471r;

    /* renamed from: s, reason: collision with root package name */
    public static final g f6472s;

    /* renamed from: t, reason: collision with root package name */
    public static final g f6473t;

    /* renamed from: u, reason: collision with root package name */
    public static final g f6474u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ g[] f6475v;

    static {
        g gVar = new g("Paragraph", 0);
        f6468d = gVar;
        g gVar2 = new g("Span", 1);
        f6469e = gVar2;
        g gVar3 = new g("VerbatimTts", 2);
        f6470i = gVar3;
        g gVar4 = new g("Url", 3);
        f6471r = gVar4;
        g gVar5 = new g("Link", 4);
        f6472s = gVar5;
        g gVar6 = new g("Clickable", 5);
        f6473t = gVar6;
        g gVar7 = new g("String", 6);
        f6474u = gVar7;
        f6475v = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f6475v.clone();
    }
}
