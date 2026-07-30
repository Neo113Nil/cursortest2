package W6;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a implements Supplier {

    /* renamed from: n, reason: collision with root package name */
    public static final a f3461n;

    /* renamed from: u, reason: collision with root package name */
    public static final Random f3462u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a[] f3463v;

    static {
        a aVar = new a("INSTANCE", 0);
        f3461n = aVar;
        f3463v = new a[]{aVar};
        f3462u = new Random();
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3463v.clone();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return f3462u;
    }
}
