package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class re2 {
    public static final re2 m;
    public static final re2 n;
    public static final re2 o;
    public static final /* synthetic */ re2[] p;

    static {
        re2 re2Var = new re2("NETWORK_UNMETERED", 0);
        m = re2Var;
        re2 re2Var2 = new re2("DEVICE_IDLE", 1);
        n = re2Var2;
        re2 re2Var3 = new re2("DEVICE_CHARGING", 2);
        o = re2Var3;
        p = new re2[]{re2Var, re2Var2, re2Var3};
    }

    public static re2 valueOf(String str) {
        return (re2) Enum.valueOf(re2.class, str);
    }

    public static re2[] values() {
        return (re2[]) p.clone();
    }
}
