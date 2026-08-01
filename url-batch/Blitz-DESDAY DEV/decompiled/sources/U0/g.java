package U0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f873a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f874b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f875c;
    public static final /* synthetic */ g[] d;

    static {
        g gVar = new g("EMPTY", 0);
        f873a = gVar;
        g gVar2 = new g("PLAYER", 1);
        f874b = gVar2;
        g gVar3 = new g("AI", 2);
        f875c = gVar3;
        d = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) d.clone();
    }
}
