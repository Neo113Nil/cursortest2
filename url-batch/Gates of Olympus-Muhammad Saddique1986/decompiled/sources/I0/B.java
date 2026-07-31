package I0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: d, reason: collision with root package name */
    public static final B f3007d;

    /* renamed from: e, reason: collision with root package name */
    public static final B f3008e;

    /* renamed from: f, reason: collision with root package name */
    public static final B f3009f;

    /* renamed from: g, reason: collision with root package name */
    public static final B f3010g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ B[] f3011h;

    static {
        B b3 = new B("StartInput", 0);
        f3007d = b3;
        B b4 = new B("StopInput", 1);
        f3008e = b4;
        B b5 = new B("ShowKeyboard", 2);
        f3009f = b5;
        B b6 = new B("HideKeyboard", 3);
        f3010g = b6;
        f3011h = new B[]{b3, b4, b5, b6};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f3011h.clone();
    }
}
