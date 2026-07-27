package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0812j {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0812j f7910d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0812j f7911e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0812j f7912i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0812j[] f7913j;

    static {
        EnumC0812j enumC0812j = new EnumC0812j("Initial", 0);
        f7910d = enumC0812j;
        EnumC0812j enumC0812j2 = new EnumC0812j("Main", 1);
        f7911e = enumC0812j2;
        EnumC0812j enumC0812j3 = new EnumC0812j("Final", 2);
        f7912i = enumC0812j3;
        f7913j = new EnumC0812j[]{enumC0812j, enumC0812j2, enumC0812j3};
    }

    public static EnumC0812j valueOf(String str) {
        return (EnumC0812j) Enum.valueOf(EnumC0812j.class, str);
    }

    public static EnumC0812j[] values() {
        return (EnumC0812j[]) f7913j.clone();
    }
}
