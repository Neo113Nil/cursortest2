package r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f6296d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f6297e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h[] f6298f;

    static {
        h hVar = new h("BoundReached", 0);
        f6296d = hVar;
        h hVar2 = new h("Finished", 1);
        f6297e = hVar2;
        f6298f = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f6298f.clone();
    }
}
