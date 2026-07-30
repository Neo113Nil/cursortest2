package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class t61 {
    public static final t61 d;
    public static final t61 e;
    public static final t61 g;
    public static final /* synthetic */ t61[] h;

    static {
        t61 t61Var = new t61("NETWORK_UNMETERED", 0);
        d = t61Var;
        t61 t61Var2 = new t61("DEVICE_IDLE", 1);
        e = t61Var2;
        t61 t61Var3 = new t61("DEVICE_CHARGING", 2);
        g = t61Var3;
        h = new t61[]{t61Var, t61Var2, t61Var3};
    }

    public static t61 valueOf(String str) {
        return (t61) Enum.valueOf(t61.class, str);
    }

    public static t61[] values() {
        return (t61[]) h.clone();
    }
}
