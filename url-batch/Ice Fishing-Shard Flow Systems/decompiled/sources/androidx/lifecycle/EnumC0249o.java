package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0249o {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0249o f3906d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0249o f3907e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0249o f3908i;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0249o f3909l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0249o f3910m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0249o[] f3911n;

    static {
        EnumC0249o enumC0249o = new EnumC0249o("DESTROYED", 0);
        f3906d = enumC0249o;
        EnumC0249o enumC0249o2 = new EnumC0249o("INITIALIZED", 1);
        f3907e = enumC0249o2;
        EnumC0249o enumC0249o3 = new EnumC0249o("CREATED", 2);
        f3908i = enumC0249o3;
        EnumC0249o enumC0249o4 = new EnumC0249o("STARTED", 3);
        f3909l = enumC0249o4;
        EnumC0249o enumC0249o5 = new EnumC0249o("RESUMED", 4);
        f3910m = enumC0249o5;
        f3911n = new EnumC0249o[]{enumC0249o, enumC0249o2, enumC0249o3, enumC0249o4, enumC0249o5};
    }

    public static EnumC0249o valueOf(String str) {
        return (EnumC0249o) Enum.valueOf(EnumC0249o.class, str);
    }

    public static EnumC0249o[] values() {
        return (EnumC0249o[]) f3911n.clone();
    }

    public final boolean a(EnumC0249o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
