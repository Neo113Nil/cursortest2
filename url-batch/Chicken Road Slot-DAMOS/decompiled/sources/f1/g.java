package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f4061d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f4062e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ g[] f4063i;

    static {
        g gVar = new g("VIEW_APPEAR", 0);
        f4061d = gVar;
        g gVar2 = new g("VIEW_DISAPPEAR", 1);
        f4062e = gVar2;
        f4063i = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f4063i.clone();
    }
}
