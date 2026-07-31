package k5;

import a.AbstractC0219a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0476f {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0476f f5195f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0476f f5196g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0476f[] f5197h;

    static {
        EnumC0476f enumC0476f = new EnumC0476f("SYNCHRONIZED", 0);
        EnumC0476f enumC0476f2 = new EnumC0476f("PUBLICATION", 1);
        f5195f = enumC0476f2;
        EnumC0476f enumC0476f3 = new EnumC0476f("NONE", 2);
        f5196g = enumC0476f3;
        EnumC0476f[] enumC0476fArr = {enumC0476f, enumC0476f2, enumC0476f3};
        f5197h = enumC0476fArr;
        AbstractC0219a.n(enumC0476fArr);
    }

    public static EnumC0476f valueOf(String str) {
        return (EnumC0476f) Enum.valueOf(EnumC0476f.class, str);
    }

    public static EnumC0476f[] values() {
        return (EnumC0476f[]) f5197h.clone();
    }
}
