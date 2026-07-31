package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0716d {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0716d f6180f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0716d[] f6181g;

    static {
        EnumC0716d enumC0716d = new EnumC0716d("DEFAULT", 0);
        f6180f = enumC0716d;
        f6181g = new EnumC0716d[]{enumC0716d, new EnumC0716d("SIGNED", 1), new EnumC0716d("FIXED", 2)};
    }

    public static EnumC0716d valueOf(String str) {
        return (EnumC0716d) Enum.valueOf(EnumC0716d.class, str);
    }

    public static EnumC0716d[] values() {
        return (EnumC0716d[]) f6181g.clone();
    }
}
