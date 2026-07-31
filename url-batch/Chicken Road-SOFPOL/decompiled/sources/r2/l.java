package r2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final l f6529d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f6530e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l[] f6531f;

    static {
        l lVar = new l("Ltr", 0);
        f6529d = lVar;
        l lVar2 = new l("Rtl", 1);
        f6530e = lVar2;
        f6531f = new l[]{lVar, lVar2};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f6531f.clone();
    }
}
