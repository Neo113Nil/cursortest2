package s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1186c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1186c f10290a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1186c f10291b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1186c f10292c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC1186c[] f10293d;

    static {
        EnumC1186c enumC1186c = new EnumC1186c("DEFAULT", 0);
        f10290a = enumC1186c;
        EnumC1186c enumC1186c2 = new EnumC1186c("VERY_LOW", 1);
        f10291b = enumC1186c2;
        EnumC1186c enumC1186c3 = new EnumC1186c("HIGHEST", 2);
        f10292c = enumC1186c3;
        f10293d = new EnumC1186c[]{enumC1186c, enumC1186c2, enumC1186c3};
    }

    public static EnumC1186c valueOf(String str) {
        return (EnumC1186c) Enum.valueOf(EnumC1186c.class, str);
    }

    public static EnumC1186c[] values() {
        return (EnumC1186c[]) f10293d.clone();
    }
}
