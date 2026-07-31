package f4;

import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0386m implements InterfaceC0375b {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0386m f4244f;

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f4245g;

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f4246h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0386m[] f4247i;

    static {
        EnumC0386m enumC0386m = new EnumC0386m("INSTANCE", 0);
        f4244f = enumC0386m;
        f4247i = new EnumC0386m[]{enumC0386m};
        f4245g = Logger.getLogger(EnumC0386m.class.getName());
        f4246h = new ThreadLocal();
    }

    public static EnumC0386m valueOf(String str) {
        return (EnumC0386m) Enum.valueOf(EnumC0386m.class, str);
    }

    public static EnumC0386m[] values() {
        return (EnumC0386m[]) f4247i.clone();
    }

    @Override // f4.InterfaceC0375b
    public final InterfaceC0379f a(C0374a c0374a) {
        C0374a current = current();
        if (c0374a == current) {
            return EnumC0384k.f4238f;
        }
        f4246h.set(c0374a);
        return new C0385l(this, current, c0374a);
    }

    @Override // f4.InterfaceC0375b
    public final C0374a current() {
        return (C0374a) f4246h.get();
    }
}
