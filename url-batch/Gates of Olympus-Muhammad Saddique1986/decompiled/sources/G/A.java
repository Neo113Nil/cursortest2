package G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final A f1965d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ A[] f1966e;

    /* JADX INFO: Fake field, exist only in values array */
    A EF0;

    static {
        A a3 = new A("Filled", 0);
        A a4 = new A("Outlined", 1);
        f1965d = a4;
        f1966e = new A[]{a3, a4};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f1966e.clone();
    }
}
