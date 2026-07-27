package m2;

import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1281d {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1281d f11151b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1281d f11152c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1281d f11153d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1281d f11154e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1281d[] f11155f;

    /* renamed from: a, reason: collision with root package name */
    public final int f11156a;

    static {
        EnumC1281d enumC1281d = new EnumC1281d("VARINT", 0, 0);
        f11151b = enumC1281d;
        EnumC1281d enumC1281d2 = new EnumC1281d("FIXED64", 1, 1);
        f11152c = enumC1281d2;
        EnumC1281d enumC1281d3 = new EnumC1281d("LENGTH_DELIMITED", 2, 2);
        f11153d = enumC1281d3;
        EnumC1281d enumC1281d4 = new EnumC1281d("FIXED32", 3, 5);
        f11154e = enumC1281d4;
        EnumC1281d[] enumC1281dArr = {enumC1281d, enumC1281d2, enumC1281d3, enumC1281d4};
        f11155f = enumC1281dArr;
        AbstractC1477a.n(enumC1281dArr);
    }

    public EnumC1281d(String str, int i2, int i3) {
        this.f11156a = i3;
    }

    public static EnumC1281d valueOf(String str) {
        return (EnumC1281d) Enum.valueOf(EnumC1281d.class, str);
    }

    public static EnumC1281d[] values() {
        return (EnumC1281d[]) f11155f.clone();
    }

    public final AbstractC1286i a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return AbstractC1286i.f11168k;
        }
        if (ordinal == 1) {
            return AbstractC1286i.f11169l;
        }
        if (ordinal == 2) {
            return AbstractC1286i.f11171n;
        }
        if (ordinal == 3) {
            return AbstractC1286i.f11166i;
        }
        throw new C1.b();
    }
}
