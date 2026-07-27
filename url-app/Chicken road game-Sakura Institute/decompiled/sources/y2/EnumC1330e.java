package y2;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1330e {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1330e f11665d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1330e[] f11666e;

    static {
        EnumC1330e enumC1330e = new EnumC1330e("WARNING", 0);
        f11665d = enumC1330e;
        EnumC1330e[] entries = {enumC1330e, new EnumC1330e("ERROR", 1), new EnumC1330e("HIDDEN", 2)};
        f11666e = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static EnumC1330e valueOf(String str) {
        return (EnumC1330e) Enum.valueOf(EnumC1330e.class, str);
    }

    public static EnumC1330e[] values() {
        return (EnumC1330e[]) f11666e.clone();
    }
}
