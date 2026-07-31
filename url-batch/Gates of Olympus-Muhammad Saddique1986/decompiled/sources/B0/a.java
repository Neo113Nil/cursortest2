package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f472d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f473e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f474f;

    static {
        a aVar = new a("On", 0);
        f472d = aVar;
        a aVar2 = new a("Off", 1);
        f473e = aVar2;
        f474f = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f474f.clone();
    }
}
