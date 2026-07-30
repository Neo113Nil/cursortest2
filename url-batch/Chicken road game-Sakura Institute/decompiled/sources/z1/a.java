package z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f10064f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f10065g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a[] f10066h;

    static {
        a aVar = new a("On", 0);
        f10064f = aVar;
        a aVar2 = new a("Off", 1);
        f10065g = aVar2;
        f10066h = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10066h.clone();
    }
}
