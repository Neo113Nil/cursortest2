package c4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0298d {

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0298d f4212e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0298d f4213i;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0298d f4214l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0298d f4215m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0298d[] f4216n;

    /* renamed from: d, reason: collision with root package name */
    public final int f4217d;

    static {
        EnumC0298d enumC0298d = new EnumC0298d("VARINT", 0, 0);
        f4212e = enumC0298d;
        EnumC0298d enumC0298d2 = new EnumC0298d("FIXED64", 1, 1);
        f4213i = enumC0298d2;
        EnumC0298d enumC0298d3 = new EnumC0298d("LENGTH_DELIMITED", 2, 2);
        f4214l = enumC0298d3;
        EnumC0298d enumC0298d4 = new EnumC0298d("FIXED32", 3, 5);
        f4215m = enumC0298d4;
        EnumC0298d[] enumC0298dArr = {enumC0298d, enumC0298d2, enumC0298d3, enumC0298d4};
        f4216n = enumC0298dArr;
        d4.c.o(enumC0298dArr);
    }

    public EnumC0298d(String str, int i2, int i5) {
        this.f4217d = i5;
    }

    public static EnumC0298d valueOf(String str) {
        return (EnumC0298d) Enum.valueOf(EnumC0298d.class, str);
    }

    public static EnumC0298d[] values() {
        return (EnumC0298d[]) f4216n.clone();
    }

    public final AbstractC0303i a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return AbstractC0303i.f4228k;
        }
        if (ordinal == 1) {
            return AbstractC0303i.f4229l;
        }
        if (ordinal == 2) {
            return AbstractC0303i.f4231n;
        }
        if (ordinal == 3) {
            return AbstractC0303i.f4227i;
        }
        throw new R5.k();
    }
}
