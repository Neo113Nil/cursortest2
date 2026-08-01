package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4037d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4038e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f4039i;

    static {
        a aVar = new a("SHOW_ORIGINAL", 0);
        f4037d = aVar;
        a aVar2 = new a("SHOW_TRANSLATED", 1);
        f4038e = aVar2;
        f4039i = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4039i.clone();
    }
}
