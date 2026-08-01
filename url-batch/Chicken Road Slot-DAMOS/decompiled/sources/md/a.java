package md;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6622d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f6623e;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f6622d = aVar;
        f6623e = new a[]{aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6623e.clone();
    }
}
