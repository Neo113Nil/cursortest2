package y4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: e, reason: collision with root package name */
    public static final r4.b f8571e;

    /* renamed from: i, reason: collision with root package name */
    public static final M f8572i;

    /* renamed from: l, reason: collision with root package name */
    public static final M f8573l;

    /* renamed from: m, reason: collision with root package name */
    public static final M f8574m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ M[] f8575n;

    /* renamed from: d, reason: collision with root package name */
    public final int f8576d;

    static {
        M m2 = new M("PLATFORM_ENCODED", 0, 0);
        f8572i = m2;
        M m7 = new M("JSON_ENCODED", 1, 1);
        f8573l = m7;
        M m8 = new M("UNEXPECTED_STRING", 2, 2);
        f8574m = m8;
        M[] mArr = {m2, m7, m8};
        f8575n = mArr;
        d4.c.o(mArr);
        f8571e = new r4.b();
    }

    public M(String str, int i2, int i5) {
        this.f8576d = i5;
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f8575n.clone();
    }
}
