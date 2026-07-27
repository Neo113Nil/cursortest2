package l4;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1260a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1260a f11058a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1260a f11059b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1260a f11060c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1260a[] f11061d;

    static {
        EnumC1260a enumC1260a = new EnumC1260a("COROUTINE_SUSPENDED", 0);
        f11058a = enumC1260a;
        EnumC1260a enumC1260a2 = new EnumC1260a("UNDECIDED", 1);
        f11059b = enumC1260a2;
        EnumC1260a enumC1260a3 = new EnumC1260a("RESUMED", 2);
        f11060c = enumC1260a3;
        EnumC1260a[] enumC1260aArr = {enumC1260a, enumC1260a2, enumC1260a3};
        f11061d = enumC1260aArr;
        AbstractC1477a.n(enumC1260aArr);
    }

    public static EnumC1260a valueOf(String str) {
        return (EnumC1260a) Enum.valueOf(EnumC1260a.class, str);
    }

    public static EnumC1260a[] values() {
        return (EnumC1260a[]) f11061d.clone();
    }
}
