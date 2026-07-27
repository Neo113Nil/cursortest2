package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1256E {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1256E f11019d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1256E f11020e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC1256E f11021i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC1256E[] f11022j;

    static {
        EnumC1256E enumC1256E = new EnumC1256E("Cursor", 0);
        f11019d = enumC1256E;
        EnumC1256E enumC1256E2 = new EnumC1256E("SelectionStart", 1);
        f11020e = enumC1256E2;
        EnumC1256E enumC1256E3 = new EnumC1256E("SelectionEnd", 2);
        f11021i = enumC1256E3;
        f11022j = new EnumC1256E[]{enumC1256E, enumC1256E2, enumC1256E3};
    }

    public static EnumC1256E valueOf(String str) {
        return (EnumC1256E) Enum.valueOf(EnumC1256E.class, str);
    }

    public static EnumC1256E[] values() {
        return (EnumC1256E[]) f11022j.clone();
    }
}
