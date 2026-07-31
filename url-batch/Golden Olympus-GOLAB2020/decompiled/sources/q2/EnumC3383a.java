package q2;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3383a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3383a f43420b = new EnumC3383a("SUSPEND", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3383a f43421c = new EnumC3383a("DROP_OLDEST", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3383a f43422d = new EnumC3383a("DROP_LATEST", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC3383a[] f43423e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f43424f;

    static {
        EnumC3383a[] c4 = c();
        f43423e = c4;
        f43424f = AbstractC1372b.a(c4);
    }

    private EnumC3383a(String str, int i4) {
    }

    private static final /* synthetic */ EnumC3383a[] c() {
        return new EnumC3383a[]{f43420b, f43421c, f43422d};
    }

    public static EnumC3383a valueOf(String str) {
        return (EnumC3383a) Enum.valueOf(EnumC3383a.class, str);
    }

    public static EnumC3383a[] values() {
        return (EnumC3383a[]) f43423e.clone();
    }
}
