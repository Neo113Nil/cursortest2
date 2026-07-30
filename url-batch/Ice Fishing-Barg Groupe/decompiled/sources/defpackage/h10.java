package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class h10 {
    public static final h10 OPXfSBeufaJ8;
    public static final h10 dgRBjINgWbAK;
    public static final h10 rtx2ld2ELZv4;
    public static final h10 wdg6QnbFHrFF;
    public static final /* synthetic */ h10[] x50lh2ztY7Y5;

    static {
        h10 h10Var = new h10("Up", 0);
        rtx2ld2ELZv4 = h10Var;
        h10 h10Var2 = new h10("Drag", 1);
        OPXfSBeufaJ8 = h10Var2;
        h10 h10Var3 = new h10("Timeout", 2);
        wdg6QnbFHrFF = h10Var3;
        h10 h10Var4 = new h10("Cancel", 3);
        dgRBjINgWbAK = h10Var4;
        x50lh2ztY7Y5 = new h10[]{h10Var, h10Var2, h10Var3, h10Var4};
    }

    public static h10 valueOf(String str) {
        return (h10) Enum.valueOf(h10.class, str);
    }

    public static h10[] values() {
        return (h10[]) x50lh2ztY7Y5.clone();
    }
}
