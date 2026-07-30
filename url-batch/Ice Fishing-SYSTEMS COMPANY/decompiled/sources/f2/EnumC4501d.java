package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4501d {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4501d f37669n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC4501d f37670u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC4501d f37671v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC4501d[] f37672w;

    static {
        EnumC4501d enumC4501d = new EnumC4501d("NETWORK_UNMETERED", 0);
        f37669n = enumC4501d;
        EnumC4501d enumC4501d2 = new EnumC4501d("DEVICE_IDLE", 1);
        f37670u = enumC4501d2;
        EnumC4501d enumC4501d3 = new EnumC4501d("DEVICE_CHARGING", 2);
        f37671v = enumC4501d3;
        f37672w = new EnumC4501d[]{enumC4501d, enumC4501d2, enumC4501d3};
    }

    public static EnumC4501d valueOf(String str) {
        return (EnumC4501d) Enum.valueOf(EnumC4501d.class, str);
    }

    public static EnumC4501d[] values() {
        return (EnumC4501d[]) f37672w.clone();
    }
}
