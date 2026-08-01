package df;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3728d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3729e;

    /* renamed from: i, reason: collision with root package name */
    public static final a f3730i;

    /* renamed from: r, reason: collision with root package name */
    public static final a f3731r;

    /* renamed from: s, reason: collision with root package name */
    public static final a f3732s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a[] f3733t;

    static {
        a aVar = new a("DEBUG", 0);
        f3728d = aVar;
        a aVar2 = new a("INFO", 1);
        f3729e = aVar2;
        a aVar3 = new a("WARNING", 2);
        f3730i = aVar3;
        a aVar4 = new a("ERROR", 3);
        f3731r = aVar4;
        a aVar5 = new a("NONE", 4);
        f3732s = aVar5;
        f3733t = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3733t.clone();
    }
}
