package b6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f1336d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f1337e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f1338f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i[] f1339g;

    static {
        i iVar = new i("WINTER_CLOTHING", 0);
        f1336d = iVar;
        i iVar2 = new i("WINTER_ITEMS", 1);
        f1337e = iVar2;
        i iVar3 = new i("XMAS_DECORATIONS", 2);
        f1338f = iVar3;
        f1339g = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f1339g.clone();
    }
}
