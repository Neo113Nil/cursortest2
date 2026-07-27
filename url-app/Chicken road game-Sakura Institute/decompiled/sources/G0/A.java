package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final A f3003d;

    /* renamed from: e, reason: collision with root package name */
    public static final A f3004e;

    /* renamed from: i, reason: collision with root package name */
    public static final A f3005i;

    /* renamed from: j, reason: collision with root package name */
    public static final A f3006j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ A[] f3007k;

    static {
        A a4 = new A("StartInput", 0);
        f3003d = a4;
        A a5 = new A("StopInput", 1);
        f3004e = a5;
        A a6 = new A("ShowKeyboard", 2);
        f3005i = a6;
        A a7 = new A("HideKeyboard", 3);
        f3006j = a7;
        f3007k = new A[]{a4, a5, a6, a7};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f3007k.clone();
    }
}
