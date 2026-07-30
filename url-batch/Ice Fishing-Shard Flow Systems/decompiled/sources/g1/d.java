package g1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f4981d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f4982e;

    /* renamed from: i, reason: collision with root package name */
    public static final d f4983i;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ d[] f4984l;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f4981d = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f4982e = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f4983i = dVar3;
        f4984l = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4984l.clone();
    }
}
