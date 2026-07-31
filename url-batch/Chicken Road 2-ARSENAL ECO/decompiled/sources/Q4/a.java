package Q4;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a implements Supplier {

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f2009g = {new a("INSTANCE", 0)};

    /* renamed from: f, reason: collision with root package name */
    public static final Random f2008f = new Random();

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2009g.clone();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return f2008f;
    }
}
