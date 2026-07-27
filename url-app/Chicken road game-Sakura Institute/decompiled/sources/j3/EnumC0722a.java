package j3;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0722a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0722a f7170d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0722a[] f7171e;

    static {
        EnumC0722a enumC0722a = new EnumC0722a("NONE", 0);
        EnumC0722a enumC0722a2 = new EnumC0722a("ALL_JSON_OBJECTS", 1);
        EnumC0722a enumC0722a3 = new EnumC0722a("POLYMORPHIC", 2);
        f7170d = enumC0722a3;
        EnumC0722a[] entries = {enumC0722a, enumC0722a2, enumC0722a3};
        f7171e = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static EnumC0722a valueOf(String str) {
        return (EnumC0722a) Enum.valueOf(EnumC0722a.class, str);
    }

    public static EnumC0722a[] values() {
        return (EnumC0722a[]) f7171e.clone();
    }
}
