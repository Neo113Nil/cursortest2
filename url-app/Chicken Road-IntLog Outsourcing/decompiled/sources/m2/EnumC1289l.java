package m2;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1289l {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1289l f11190b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1289l f11191c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1289l[] f11192d;

    /* renamed from: a, reason: collision with root package name */
    public final String f11193a;

    static {
        EnumC1289l enumC1289l = new EnumC1289l("PROTO_2", 0, "proto2");
        f11190b = enumC1289l;
        EnumC1289l enumC1289l2 = new EnumC1289l("PROTO_3", 1, "proto3");
        f11191c = enumC1289l2;
        EnumC1289l[] enumC1289lArr = {enumC1289l, enumC1289l2};
        f11192d = enumC1289lArr;
        AbstractC1477a.n(enumC1289lArr);
    }

    public EnumC1289l(String str, int i2, String str2) {
        this.f11193a = str2;
    }

    public static EnumC1289l valueOf(String str) {
        return (EnumC1289l) Enum.valueOf(EnumC1289l.class, str);
    }

    public static EnumC1289l[] values() {
        return (EnumC1289l[]) f11192d.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11193a;
    }
}
