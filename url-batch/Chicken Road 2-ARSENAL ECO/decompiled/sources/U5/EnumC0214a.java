package U5;

import a.AbstractC0219a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: U5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0214a {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0214a f2632f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0214a[] f2633g;

    static {
        EnumC0214a enumC0214a = new EnumC0214a("NONE", 0);
        EnumC0214a enumC0214a2 = new EnumC0214a("ALL_JSON_OBJECTS", 1);
        EnumC0214a enumC0214a3 = new EnumC0214a("POLYMORPHIC", 2);
        f2632f = enumC0214a3;
        EnumC0214a[] enumC0214aArr = {enumC0214a, enumC0214a2, enumC0214a3};
        f2633g = enumC0214aArr;
        AbstractC0219a.n(enumC0214aArr);
    }

    public static EnumC0214a valueOf(String str) {
        return (EnumC0214a) Enum.valueOf(EnumC0214a.class, str);
    }

    public static EnumC0214a[] values() {
        return (EnumC0214a[]) f2633g.clone();
    }
}
