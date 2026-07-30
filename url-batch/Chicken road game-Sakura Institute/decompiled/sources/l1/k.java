package l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final k f5815f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f5816g;

    /* renamed from: h, reason: collision with root package name */
    public static final k f5817h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k[] f5818i;

    static {
        k kVar = new k("Initial", 0);
        f5815f = kVar;
        k kVar2 = new k("Main", 1);
        f5816g = kVar2;
        k kVar3 = new k("Final", 2);
        f5817h = kVar3;
        f5818i = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f5818i.clone();
    }
}
