package c4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0307m {

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0307m f4251e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0307m f4252i;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0307m[] f4253l;

    /* renamed from: d, reason: collision with root package name */
    public final String f4254d;

    static {
        EnumC0307m enumC0307m = new EnumC0307m("PROTO_2", 0, "proto2");
        f4251e = enumC0307m;
        EnumC0307m enumC0307m2 = new EnumC0307m("PROTO_3", 1, "proto3");
        f4252i = enumC0307m2;
        EnumC0307m[] enumC0307mArr = {enumC0307m, enumC0307m2};
        f4253l = enumC0307mArr;
        d4.c.o(enumC0307mArr);
    }

    public EnumC0307m(String str, int i2, String str2) {
        this.f4254d = str2;
    }

    public static EnumC0307m valueOf(String str) {
        return (EnumC0307m) Enum.valueOf(EnumC0307m.class, str);
    }

    public static EnumC0307m[] values() {
        return (EnumC0307m[]) f4253l.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f4254d;
    }
}
