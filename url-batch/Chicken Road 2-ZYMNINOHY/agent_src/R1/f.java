package R1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2338a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f2339b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f2340c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f2341d;

    static {
        f fVar = new f("NETWORK_UNMETERED", 0);
        f2338a = fVar;
        f fVar2 = new f("DEVICE_IDLE", 1);
        f2339b = fVar2;
        f fVar3 = new f("DEVICE_CHARGING", 2);
        f2340c = fVar3;
        f2341d = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f2341d.clone();
    }
}
