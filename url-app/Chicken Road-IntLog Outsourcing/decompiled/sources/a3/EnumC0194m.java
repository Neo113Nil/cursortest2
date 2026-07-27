package a3;

import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0194m implements InterfaceC0183b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0194m f3880a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f3881b;

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f3882c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0194m[] f3883d;

    static {
        EnumC0194m enumC0194m = new EnumC0194m("INSTANCE", 0);
        f3880a = enumC0194m;
        f3883d = new EnumC0194m[]{enumC0194m};
        f3881b = Logger.getLogger(EnumC0194m.class.getName());
        f3882c = new ThreadLocal();
    }

    public static EnumC0194m valueOf(String str) {
        return (EnumC0194m) Enum.valueOf(EnumC0194m.class, str);
    }

    public static EnumC0194m[] values() {
        return (EnumC0194m[]) f3883d.clone();
    }

    @Override // a3.InterfaceC0183b
    public final C0182a a() {
        return (C0182a) f3882c.get();
    }

    @Override // a3.InterfaceC0183b
    public final InterfaceC0187f b(C0182a c0182a) {
        EnumC0192k enumC0192k = EnumC0192k.f3874a;
        C0182a a6 = a();
        if (c0182a == a6) {
            return enumC0192k;
        }
        f3882c.set(c0182a);
        return new C0193l(this, a6, c0182a);
    }
}
