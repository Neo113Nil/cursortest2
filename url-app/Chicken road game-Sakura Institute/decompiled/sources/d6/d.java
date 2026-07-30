package d6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final d f2611f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d[] f2612g;

    static {
        d dVar = new d("WARNING", 0);
        f2611f = dVar;
        f2612g = new d[]{dVar, new d("ERROR", 1), new d("HIDDEN", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2612g.clone();
    }
}
