package I;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: I.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0175t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0175t0 f2919d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0175t0 f2920e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0175t0 f2921f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0175t0 f2922g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0175t0 f2923h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0175t0 f2924i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0175t0[] f2925j;

    static {
        EnumC0175t0 enumC0175t0 = new EnumC0175t0("ShutDown", 0);
        f2919d = enumC0175t0;
        EnumC0175t0 enumC0175t02 = new EnumC0175t0("ShuttingDown", 1);
        f2920e = enumC0175t02;
        EnumC0175t0 enumC0175t03 = new EnumC0175t0("Inactive", 2);
        f2921f = enumC0175t03;
        EnumC0175t0 enumC0175t04 = new EnumC0175t0("InactivePendingWork", 3);
        f2922g = enumC0175t04;
        EnumC0175t0 enumC0175t05 = new EnumC0175t0("Idle", 4);
        f2923h = enumC0175t05;
        EnumC0175t0 enumC0175t06 = new EnumC0175t0("PendingWork", 5);
        f2924i = enumC0175t06;
        f2925j = new EnumC0175t0[]{enumC0175t0, enumC0175t02, enumC0175t03, enumC0175t04, enumC0175t05, enumC0175t06};
    }

    public static EnumC0175t0 valueOf(String str) {
        return (EnumC0175t0) Enum.valueOf(EnumC0175t0.class, str);
    }

    public static EnumC0175t0[] values() {
        return (EnumC0175t0[]) f2925j.clone();
    }
}
