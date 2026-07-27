package z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f11778d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f11779e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f11780i;

    static {
        a aVar = new a("On", 0);
        f11778d = aVar;
        a aVar2 = new a("Off", 1);
        f11779e = aVar2;
        f11780i = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f11780i.clone();
    }
}
