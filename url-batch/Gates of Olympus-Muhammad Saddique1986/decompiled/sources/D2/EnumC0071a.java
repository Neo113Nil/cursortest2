package D2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0071a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0071a f868d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0071a[] f869e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0071a EF0;

    static {
        EnumC0071a enumC0071a = new EnumC0071a("NONE", 0);
        EnumC0071a enumC0071a2 = new EnumC0071a("ALL_JSON_OBJECTS", 1);
        EnumC0071a enumC0071a3 = new EnumC0071a("POLYMORPHIC", 2);
        f868d = enumC0071a3;
        f869e = new EnumC0071a[]{enumC0071a, enumC0071a2, enumC0071a3};
    }

    public static EnumC0071a valueOf(String str) {
        return (EnumC0071a) Enum.valueOf(EnumC0071a.class, str);
    }

    public static EnumC0071a[] values() {
        return (EnumC0071a[]) f869e.clone();
    }
}
