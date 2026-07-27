package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0475o {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0475o f5480d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0475o f5481e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0475o f5482i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0475o f5483j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0475o f5484k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0475o[] f5485l;

    static {
        EnumC0475o enumC0475o = new EnumC0475o("DESTROYED", 0);
        f5480d = enumC0475o;
        EnumC0475o enumC0475o2 = new EnumC0475o("INITIALIZED", 1);
        f5481e = enumC0475o2;
        EnumC0475o enumC0475o3 = new EnumC0475o("CREATED", 2);
        f5482i = enumC0475o3;
        EnumC0475o enumC0475o4 = new EnumC0475o("STARTED", 3);
        f5483j = enumC0475o4;
        EnumC0475o enumC0475o5 = new EnumC0475o("RESUMED", 4);
        f5484k = enumC0475o5;
        f5485l = new EnumC0475o[]{enumC0475o, enumC0475o2, enumC0475o3, enumC0475o4, enumC0475o5};
    }

    public static EnumC0475o valueOf(String str) {
        return (EnumC0475o) Enum.valueOf(EnumC0475o.class, str);
    }

    public static EnumC0475o[] values() {
        return (EnumC0475o[]) f5485l.clone();
    }

    public final boolean a(EnumC0475o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return compareTo(state) >= 0;
    }
}
