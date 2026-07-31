package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: d, reason: collision with root package name */
    public static final F f9944d;

    /* renamed from: e, reason: collision with root package name */
    public static final F f9945e;

    /* renamed from: f, reason: collision with root package name */
    public static final F f9946f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ F[] f9947g;

    static {
        F f3 = new F("None", 0);
        f9944d = f3;
        F f4 = new F("Selection", 1);
        f9945e = f4;
        F f5 = new F("Cursor", 2);
        f9946f = f5;
        f9947g = new F[]{f3, f4, f5};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f9947g.clone();
    }
}
