package G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: G.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0224t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0224t0 f2916d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0224t0 f2917e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0224t0 f2918i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0224t0 f2919j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0224t0 f2920k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0224t0 f2921l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0224t0[] f2922m;

    static {
        EnumC0224t0 enumC0224t0 = new EnumC0224t0("ShutDown", 0);
        f2916d = enumC0224t0;
        EnumC0224t0 enumC0224t02 = new EnumC0224t0("ShuttingDown", 1);
        f2917e = enumC0224t02;
        EnumC0224t0 enumC0224t03 = new EnumC0224t0("Inactive", 2);
        f2918i = enumC0224t03;
        EnumC0224t0 enumC0224t04 = new EnumC0224t0("InactivePendingWork", 3);
        f2919j = enumC0224t04;
        EnumC0224t0 enumC0224t05 = new EnumC0224t0("Idle", 4);
        f2920k = enumC0224t05;
        EnumC0224t0 enumC0224t06 = new EnumC0224t0("PendingWork", 5);
        f2921l = enumC0224t06;
        f2922m = new EnumC0224t0[]{enumC0224t0, enumC0224t02, enumC0224t03, enumC0224t04, enumC0224t05, enumC0224t06};
    }

    public static EnumC0224t0 valueOf(String str) {
        return (EnumC0224t0) Enum.valueOf(EnumC0224t0.class, str);
    }

    public static EnumC0224t0[] values() {
        return (EnumC0224t0[]) f2922m.clone();
    }
}
