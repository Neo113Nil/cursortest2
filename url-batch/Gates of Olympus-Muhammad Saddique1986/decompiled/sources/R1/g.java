package R1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f4147d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f4148e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f4149f;

    /* JADX INFO: Fake field, exist only in values array */
    g EF0;

    static {
        g gVar = new g("SYNCHRONIZED", 0);
        g gVar2 = new g("PUBLICATION", 1);
        f4147d = gVar2;
        g gVar3 = new g("NONE", 2);
        f4148e = gVar3;
        f4149f = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f4149f.clone();
    }
}
