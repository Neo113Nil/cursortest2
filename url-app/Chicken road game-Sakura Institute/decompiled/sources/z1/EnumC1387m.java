package z1;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1387m {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1387m f11892d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1387m f11893e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC1387m f11894i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC1387m f11895j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1387m f11896k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1387m f11897l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC1387m[] f11898m;

    static {
        EnumC1387m enumC1387m = new EnumC1387m("Sprint", 0);
        f11892d = enumC1387m;
        EnumC1387m enumC1387m2 = new EnumC1387m("MidDistance", 1);
        EnumC1387m enumC1387m3 = new EnumC1387m("LongDistance", 2);
        EnumC1387m enumC1387m4 = new EnumC1387m("Hurdles", 3);
        EnumC1387m enumC1387m5 = new EnumC1387m("Relay", 4);
        EnumC1387m enumC1387m6 = new EnumC1387m("LongJump", 5);
        f11893e = enumC1387m6;
        EnumC1387m enumC1387m7 = new EnumC1387m("HighJump", 6);
        f11894i = enumC1387m7;
        EnumC1387m enumC1387m8 = new EnumC1387m("ShotPut", 7);
        f11895j = enumC1387m8;
        EnumC1387m enumC1387m9 = new EnumC1387m("Discus", 8);
        f11896k = enumC1387m9;
        EnumC1387m enumC1387m10 = new EnumC1387m("Javelin", 9);
        f11897l = enumC1387m10;
        EnumC1387m[] entries = {enumC1387m, enumC1387m2, enumC1387m3, enumC1387m4, enumC1387m5, enumC1387m6, enumC1387m7, enumC1387m8, enumC1387m9, enumC1387m10, new EnumC1387m("CrossCountry", 10)};
        f11898m = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static EnumC1387m valueOf(String str) {
        return (EnumC1387m) Enum.valueOf(EnumC1387m.class, str);
    }

    public static EnumC1387m[] values() {
        return (EnumC1387m[]) f11898m.clone();
    }
}
