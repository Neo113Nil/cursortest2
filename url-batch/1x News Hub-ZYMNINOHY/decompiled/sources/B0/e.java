package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f122a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f123b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f124c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f125d;

    static {
        e eVar = new e("NETWORK_UNMETERED", 0);
        f122a = eVar;
        e eVar2 = new e("DEVICE_IDLE", 1);
        f123b = eVar2;
        e eVar3 = new e("DEVICE_CHARGING", 2);
        f124c = eVar3;
        f125d = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f125d.clone();
    }
}
