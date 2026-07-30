package a2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0175d {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0175d f3085d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0175d[] f3086e;

    static {
        EnumC0175d enumC0175d = new EnumC0175d("DEFAULT", 0);
        f3085d = enumC0175d;
        f3086e = new EnumC0175d[]{enumC0175d, new EnumC0175d("SIGNED", 1), new EnumC0175d("FIXED", 2)};
    }

    public static EnumC0175d valueOf(String str) {
        return (EnumC0175d) Enum.valueOf(EnumC0175d.class, str);
    }

    public static EnumC0175d[] values() {
        return (EnumC0175d[]) f3086e.clone();
    }
}
