package x5;

import java.util.Random;
import java.util.function.Supplier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1011a implements Supplier {

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1011a EF5;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1011a[] f8373e = {new EnumC1011a("INSTANCE", 0)};

    /* renamed from: d, reason: collision with root package name */
    public static final Random f8372d = new Random();

    public static EnumC1011a valueOf(String str) {
        return (EnumC1011a) Enum.valueOf(EnumC1011a.class, str);
    }

    public static EnumC1011a[] values() {
        return (EnumC1011a[]) f8373e.clone();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return f8372d;
    }
}
