package k6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0621p {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0621p[] f6111d;

    static {
        EnumC0621p[] enumC0621pArr = {new EnumC0621p("PUBLIC", 0), new EnumC0621p("PROTECTED", 1), new EnumC0621p("INTERNAL", 2), new EnumC0621p("PRIVATE", 3)};
        f6111d = enumC0621pArr;
        d4.c.o(enumC0621pArr);
    }

    public static EnumC0621p valueOf(String str) {
        return (EnumC0621p) Enum.valueOf(EnumC0621p.class, str);
    }

    public static EnumC0621p[] values() {
        return (EnumC0621p[]) f6111d.clone();
    }
}
