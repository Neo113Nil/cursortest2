package r2;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r2.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3389B {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3389B f43498b = new EnumC3389B("START", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3389B f43499c = new EnumC3389B("STOP", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3389B f43500d = new EnumC3389B("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC3389B[] f43501e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f43502f;

    static {
        EnumC3389B[] c4 = c();
        f43501e = c4;
        f43502f = AbstractC1372b.a(c4);
    }

    private EnumC3389B(String str, int i4) {
    }

    private static final /* synthetic */ EnumC3389B[] c() {
        return new EnumC3389B[]{f43498b, f43499c, f43500d};
    }

    public static EnumC3389B valueOf(String str) {
        return (EnumC3389B) Enum.valueOf(EnumC3389B.class, str);
    }

    public static EnumC3389B[] values() {
        return (EnumC3389B[]) f43501e.clone();
    }
}
