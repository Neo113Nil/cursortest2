package W2;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: W2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0303z {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0303z f4304d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0303z f4305e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0303z f4306i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0303z f4307j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0303z[] f4308k;

    static {
        EnumC0303z enumC0303z = new EnumC0303z("DEFAULT", 0);
        f4304d = enumC0303z;
        EnumC0303z enumC0303z2 = new EnumC0303z("LAZY", 1);
        f4305e = enumC0303z2;
        EnumC0303z enumC0303z3 = new EnumC0303z("ATOMIC", 2);
        f4306i = enumC0303z3;
        EnumC0303z enumC0303z4 = new EnumC0303z("UNDISPATCHED", 3);
        f4307j = enumC0303z4;
        EnumC0303z[] entries = {enumC0303z, enumC0303z2, enumC0303z3, enumC0303z4};
        f4308k = entries;
        Intrinsics.checkNotNullParameter(entries, "entries");
    }

    public static EnumC0303z valueOf(String str) {
        return (EnumC0303z) Enum.valueOf(EnumC0303z.class, str);
    }

    public static EnumC0303z[] values() {
        return (EnumC0303z[]) f4308k.clone();
    }
}
