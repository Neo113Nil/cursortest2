package y2;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1337l {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1337l f11670d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1337l f11671e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC1337l[] f11672i;

    static {
        EnumC1337l enumC1337l = new EnumC1337l("SYNCHRONIZED", 0);
        EnumC1337l enumC1337l2 = new EnumC1337l("PUBLICATION", 1);
        f11670d = enumC1337l2;
        EnumC1337l enumC1337l3 = new EnumC1337l("NONE", 2);
        f11671e = enumC1337l3;
        EnumC1337l[] entries = {enumC1337l, enumC1337l2, enumC1337l3};
        f11672i = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static EnumC1337l valueOf(String str) {
        return (EnumC1337l) Enum.valueOf(EnumC1337l.class, str);
    }

    public static EnumC1337l[] values() {
        return (EnumC1337l[]) f11672i.clone();
    }
}
