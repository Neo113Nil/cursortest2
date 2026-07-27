package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class N {

    /* renamed from: d, reason: collision with root package name */
    public static final N f8665d;

    /* renamed from: e, reason: collision with root package name */
    public static final N f8666e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ N[] f8667i;

    static {
        N n2 = new N("Vertical", 0);
        f8665d = n2;
        N n4 = new N("Horizontal", 1);
        f8666e = n4;
        f8667i = new N[]{n2, n4};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f8667i.clone();
    }
}
