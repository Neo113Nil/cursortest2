package a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f189d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f190e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f191f;

    static {
        b bVar = new b("SHOW_ORIGINAL", 0);
        f189d = bVar;
        b bVar2 = new b("SHOW_TRANSLATED", 1);
        f190e = bVar2;
        f191f = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f191f.clone();
    }
}
