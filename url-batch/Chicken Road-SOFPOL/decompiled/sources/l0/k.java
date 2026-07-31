package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final k f4559d;

    /* renamed from: e, reason: collision with root package name */
    public static final k f4560e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k[] f4561f;

    /* JADX INFO: Fake field, exist only in values array */
    k EF0;

    static {
        k kVar = new k("DefaultSpatial", 0);
        k kVar2 = new k("FastSpatial", 1);
        f4559d = kVar2;
        k kVar3 = new k("SlowSpatial", 2);
        k kVar4 = new k("DefaultEffects", 3);
        f4560e = kVar4;
        f4561f = new k[]{kVar, kVar2, kVar3, kVar4, new k("FastEffects", 4), new k("SlowEffects", 5)};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f4561f.clone();
    }
}
