package W3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f3481a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g[] f3482b;

    static {
        g gVar = new g("MEDIA_PLAYER", 0);
        f3481a = gVar;
        g[] gVarArr = {gVar, new g("LOW_LATENCY", 1)};
        f3482b = gVarArr;
        O3.d.m(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f3482b.clone();
    }
}
