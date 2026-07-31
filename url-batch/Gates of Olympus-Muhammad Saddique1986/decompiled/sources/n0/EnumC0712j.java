package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0712j {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0712j f7295d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0712j f7296e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0712j f7297f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0712j[] f7298g;

    static {
        EnumC0712j enumC0712j = new EnumC0712j("Initial", 0);
        f7295d = enumC0712j;
        EnumC0712j enumC0712j2 = new EnumC0712j("Main", 1);
        f7296e = enumC0712j2;
        EnumC0712j enumC0712j3 = new EnumC0712j("Final", 2);
        f7297f = enumC0712j3;
        f7298g = new EnumC0712j[]{enumC0712j, enumC0712j2, enumC0712j3};
    }

    public static EnumC0712j valueOf(String str) {
        return (EnumC0712j) Enum.valueOf(EnumC0712j.class, str);
    }

    public static EnumC0712j[] values() {
        return (EnumC0712j[]) f7298g.clone();
    }
}
