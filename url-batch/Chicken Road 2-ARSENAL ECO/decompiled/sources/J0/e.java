package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final e f1247f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f1248g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f1249h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e[] f1250i;

    static {
        e eVar = new e("NETWORK_UNMETERED", 0);
        f1247f = eVar;
        e eVar2 = new e("DEVICE_IDLE", 1);
        f1248g = eVar2;
        e eVar3 = new e("DEVICE_CHARGING", 2);
        f1249h = eVar3;
        f1250i = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f1250i.clone();
    }
}
