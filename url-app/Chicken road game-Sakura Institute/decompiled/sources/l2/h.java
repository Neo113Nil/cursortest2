package l2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final h f5873f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f5874g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h[] f5875h;

    static {
        h hVar = new h("Ltr", 0);
        f5873f = hVar;
        h hVar2 = new h("Rtl", 1);
        f5874g = hVar2;
        f5875h = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f5875h.clone();
    }
}
