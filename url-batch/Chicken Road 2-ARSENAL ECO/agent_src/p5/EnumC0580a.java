package p5;

import a.AbstractC0219a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0580a {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0580a f5697f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0580a f5698g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0580a f5699h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0580a[] f5700i;

    static {
        EnumC0580a enumC0580a = new EnumC0580a("COROUTINE_SUSPENDED", 0);
        f5697f = enumC0580a;
        EnumC0580a enumC0580a2 = new EnumC0580a("UNDECIDED", 1);
        f5698g = enumC0580a2;
        EnumC0580a enumC0580a3 = new EnumC0580a("RESUMED", 2);
        f5699h = enumC0580a3;
        EnumC0580a[] enumC0580aArr = {enumC0580a, enumC0580a2, enumC0580a3};
        f5700i = enumC0580aArr;
        AbstractC0219a.n(enumC0580aArr);
    }

    public static EnumC0580a valueOf(String str) {
        return (EnumC0580a) Enum.valueOf(EnumC0580a.class, str);
    }

    public static EnumC0580a[] values() {
        return (EnumC0580a[]) f5700i.clone();
    }
}
