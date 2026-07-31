package I;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: I.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0121t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0121t0 f2360d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0121t0 f2361e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0121t0 f2362f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0121t0 f2363g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0121t0 f2364h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0121t0 f2365i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0121t0[] f2366j;

    static {
        EnumC0121t0 enumC0121t0 = new EnumC0121t0("ShutDown", 0);
        f2360d = enumC0121t0;
        EnumC0121t0 enumC0121t02 = new EnumC0121t0("ShuttingDown", 1);
        f2361e = enumC0121t02;
        EnumC0121t0 enumC0121t03 = new EnumC0121t0("Inactive", 2);
        f2362f = enumC0121t03;
        EnumC0121t0 enumC0121t04 = new EnumC0121t0("InactivePendingWork", 3);
        f2363g = enumC0121t04;
        EnumC0121t0 enumC0121t05 = new EnumC0121t0("Idle", 4);
        f2364h = enumC0121t05;
        EnumC0121t0 enumC0121t06 = new EnumC0121t0("PendingWork", 5);
        f2365i = enumC0121t06;
        f2366j = new EnumC0121t0[]{enumC0121t0, enumC0121t02, enumC0121t03, enumC0121t04, enumC0121t05, enumC0121t06};
    }

    public static EnumC0121t0 valueOf(String str) {
        return (EnumC0121t0) Enum.valueOf(EnumC0121t0.class, str);
    }

    public static EnumC0121t0[] values() {
        return (EnumC0121t0[]) f2366j.clone();
    }
}
