package ie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4712d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4713e;

    /* renamed from: i, reason: collision with root package name */
    public static final a f4714i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a[] f4715r;

    static {
        a aVar = new a("SUSPEND", 0);
        f4712d = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f4713e = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f4714i = aVar3;
        f4715r = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4715r.clone();
    }
}
