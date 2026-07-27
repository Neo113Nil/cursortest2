package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1257F {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1257F f11023d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1257F f11024e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC1257F f11025i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC1257F[] f11026j;

    static {
        EnumC1257F enumC1257F = new EnumC1257F("None", 0);
        f11023d = enumC1257F;
        EnumC1257F enumC1257F2 = new EnumC1257F("Selection", 1);
        f11024e = enumC1257F2;
        EnumC1257F enumC1257F3 = new EnumC1257F("Cursor", 2);
        f11025i = enumC1257F3;
        f11026j = new EnumC1257F[]{enumC1257F, enumC1257F2, enumC1257F3};
    }

    public static EnumC1257F valueOf(String str) {
        return (EnumC1257F) Enum.valueOf(EnumC1257F.class, str);
    }

    public static EnumC1257F[] values() {
        return (EnumC1257F[]) f11026j.clone();
    }
}
