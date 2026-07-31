package q1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f5988d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f5989e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f5990f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g[] f5991g;

    static {
        g gVar = new g("Initial", 0);
        f5988d = gVar;
        g gVar2 = new g("Main", 1);
        f5989e = gVar2;
        g gVar3 = new g("Final", 2);
        f5990f = gVar3;
        f5991g = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f5991g.clone();
    }
}
