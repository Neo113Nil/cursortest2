package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0463i {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0463i f5103d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0463i f5104e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0463i f5105i;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0463i[] f5106l;

    static {
        EnumC0463i enumC0463i = new EnumC0463i("AUTOMATIC", 0);
        f5103d = enumC0463i;
        EnumC0463i enumC0463i2 = new EnumC0463i("TRUNCATE", 1);
        f5104e = enumC0463i2;
        EnumC0463i enumC0463i3 = new EnumC0463i("WRITE_AHEAD_LOGGING", 2);
        f5105i = enumC0463i3;
        f5106l = new EnumC0463i[]{enumC0463i, enumC0463i2, enumC0463i3};
    }

    public static EnumC0463i valueOf(String str) {
        return (EnumC0463i) Enum.valueOf(EnumC0463i.class, str);
    }

    public static EnumC0463i[] values() {
        return (EnumC0463i[]) f5106l.clone();
    }
}
