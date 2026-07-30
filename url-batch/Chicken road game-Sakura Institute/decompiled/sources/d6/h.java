package d6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: f, reason: collision with root package name */
    public static final h f2615f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f2616g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h[] f2617h;

    /* JADX INFO: Fake field, exist only in values array */
    h EF0;

    static {
        h hVar = new h("SYNCHRONIZED", 0);
        h hVar2 = new h("PUBLICATION", 1);
        f2615f = hVar2;
        h hVar3 = new h("NONE", 2);
        f2616g = hVar3;
        f2617h = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f2617h.clone();
    }
}
