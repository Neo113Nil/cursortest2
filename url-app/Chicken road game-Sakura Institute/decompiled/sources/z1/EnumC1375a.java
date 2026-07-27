package z1;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1375a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1375a f11849d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1375a[] f11850e;

    static {
        EnumC1375a enumC1375a = new EnumC1375a("U10", 0);
        EnumC1375a enumC1375a2 = new EnumC1375a("U12", 1);
        EnumC1375a enumC1375a3 = new EnumC1375a("U14", 2);
        f11849d = enumC1375a3;
        EnumC1375a[] entries = {enumC1375a, enumC1375a2, enumC1375a3, new EnumC1375a("U16", 3), new EnumC1375a("U18", 4), new EnumC1375a("Open", 5)};
        f11850e = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static EnumC1375a valueOf(String str) {
        return (EnumC1375a) Enum.valueOf(EnumC1375a.class, str);
    }

    public static EnumC1375a[] values() {
        return (EnumC1375a[]) f11850e.clone();
    }
}
