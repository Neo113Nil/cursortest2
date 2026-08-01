package k5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f5415d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f5416e;

    /* renamed from: i, reason: collision with root package name */
    public static final g f5417i;

    /* renamed from: r, reason: collision with root package name */
    public static final g f5418r;

    /* renamed from: s, reason: collision with root package name */
    public static final g f5419s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g[] f5420t;

    static {
        g gVar = new g("ON_CONFIGURE", 0);
        f5415d = gVar;
        g gVar2 = new g("ON_CREATE", 1);
        f5416e = gVar2;
        g gVar3 = new g("ON_UPGRADE", 2);
        f5417i = gVar3;
        g gVar4 = new g("ON_DOWNGRADE", 3);
        f5418r = gVar4;
        g gVar5 = new g("ON_OPEN", 4);
        f5419s = gVar5;
        f5420t = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f5420t.clone();
    }
}
