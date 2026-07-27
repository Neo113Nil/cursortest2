package z1;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1388n {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1388n f11899d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1388n[] f11900e;

    static {
        EnumC1388n enumC1388n = new EnumC1388n("School", 0);
        EnumC1388n enumC1388n2 = new EnumC1388n("Village", 1);
        f11899d = enumC1388n2;
        EnumC1388n[] entries = {enumC1388n, enumC1388n2, new EnumC1388n("District", 2), new EnumC1388n("InterVillage", 3)};
        f11900e = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static EnumC1388n valueOf(String str) {
        return (EnumC1388n) Enum.valueOf(EnumC1388n.class, str);
    }

    public static EnumC1388n[] values() {
        return (EnumC1388n[]) f11900e.clone();
    }
}
