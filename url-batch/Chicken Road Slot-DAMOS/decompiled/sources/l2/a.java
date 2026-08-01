package l2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f5826d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f5827e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f5828i;

    static {
        a aVar = new a("On", 0);
        f5826d = aVar;
        a aVar2 = new a("Off", 1);
        f5827e = aVar2;
        f5828i = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5828i.clone();
    }
}
