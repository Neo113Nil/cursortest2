package f4;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0429f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0429f f5665a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0429f f5666b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0429f[] f5667c;

    static {
        EnumC0429f enumC0429f = new EnumC0429f("SYNCHRONIZED", 0);
        EnumC0429f enumC0429f2 = new EnumC0429f("PUBLICATION", 1);
        f5665a = enumC0429f2;
        EnumC0429f enumC0429f3 = new EnumC0429f("NONE", 2);
        f5666b = enumC0429f3;
        EnumC0429f[] enumC0429fArr = {enumC0429f, enumC0429f2, enumC0429f3};
        f5667c = enumC0429fArr;
        AbstractC1477a.n(enumC0429fArr);
    }

    public static EnumC0429f valueOf(String str) {
        return (EnumC0429f) Enum.valueOf(EnumC0429f.class, str);
    }

    public static EnumC0429f[] values() {
        return (EnumC0429f[]) f5667c.clone();
    }
}
