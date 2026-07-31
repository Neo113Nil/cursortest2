package c6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f1743d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f1744e;

    static {
        b bVar = new b("WARNING", 0);
        f1743d = bVar;
        f1744e = new b[]{bVar, new b("ERROR", 1), new b("HIDDEN", 2)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1744e.clone();
    }
}
