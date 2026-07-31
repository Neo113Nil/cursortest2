package a2;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1240a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1240a f9758b = new EnumC1240a("COROUTINE_SUSPENDED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1240a f9759c = new EnumC1240a("UNDECIDED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1240a f9760d = new EnumC1240a("RESUMED", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC1240a[] f9761e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f9762f;

    static {
        EnumC1240a[] c4 = c();
        f9761e = c4;
        f9762f = AbstractC1372b.a(c4);
    }

    private EnumC1240a(String str, int i4) {
    }

    private static final /* synthetic */ EnumC1240a[] c() {
        return new EnumC1240a[]{f9758b, f9759c, f9760d};
    }

    public static EnumC1240a valueOf(String str) {
        return (EnumC1240a) Enum.valueOf(EnumC1240a.class, str);
    }

    public static EnumC1240a[] values() {
        return (EnumC1240a[]) f9761e.clone();
    }
}
