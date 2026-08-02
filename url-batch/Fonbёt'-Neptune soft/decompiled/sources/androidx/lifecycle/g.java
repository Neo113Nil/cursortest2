package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f1767e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f1768f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f1769g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f1770h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f1771i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g[] f1772j;

    static {
        g gVar = new g("DESTROYED", 0);
        f1767e = gVar;
        g gVar2 = new g("INITIALIZED", 1);
        f1768f = gVar2;
        g gVar3 = new g("CREATED", 2);
        f1769g = gVar3;
        g gVar4 = new g("STARTED", 3);
        f1770h = gVar4;
        g gVar5 = new g("RESUMED", 4);
        f1771i = gVar5;
        f1772j = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1772j.clone();
    }
}
