package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final k f6322f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f6323g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ k[] f6324h;

    static {
        k kVar = new k("Ltr", 0);
        f6322f = kVar;
        k kVar2 = new k("Rtl", 1);
        f6323g = kVar2;
        f6324h = new k[]{kVar, kVar2};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f6324h.clone();
    }
}
