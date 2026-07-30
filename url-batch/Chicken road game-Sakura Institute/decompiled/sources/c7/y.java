package c7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    public static final y f1756f;

    /* renamed from: g, reason: collision with root package name */
    public static final y f1757g;

    /* renamed from: h, reason: collision with root package name */
    public static final y f1758h;

    /* renamed from: i, reason: collision with root package name */
    public static final y f1759i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ y[] f1760j;

    static {
        y yVar = new y("DEFAULT", 0);
        f1756f = yVar;
        y yVar2 = new y("LAZY", 1);
        f1757g = yVar2;
        y yVar3 = new y("ATOMIC", 2);
        f1758h = yVar3;
        y yVar4 = new y("UNDISPATCHED", 3);
        f1759i = yVar4;
        f1760j = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f1760j.clone();
    }
}
