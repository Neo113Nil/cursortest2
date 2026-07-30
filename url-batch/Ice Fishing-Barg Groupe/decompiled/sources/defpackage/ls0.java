package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ls0 {
    public static final ls0 OPXfSBeufaJ8;
    public static final ls0 dgRBjINgWbAK;
    public static final ls0 rtx2ld2ELZv4;
    public static final ls0 wdg6QnbFHrFF;
    public static final /* synthetic */ ls0[] x50lh2ztY7Y5;

    static {
        ls0 ls0Var = new ls0("IGNORED", 0);
        rtx2ld2ELZv4 = ls0Var;
        ls0 ls0Var2 = new ls0("SCHEDULED", 1);
        OPXfSBeufaJ8 = ls0Var2;
        ls0 ls0Var3 = new ls0("DEFERRED", 2);
        wdg6QnbFHrFF = ls0Var3;
        ls0 ls0Var4 = new ls0("IMMINENT", 3);
        dgRBjINgWbAK = ls0Var4;
        x50lh2ztY7Y5 = new ls0[]{ls0Var, ls0Var2, ls0Var3, ls0Var4};
    }

    public static ls0 valueOf(String str) {
        return (ls0) Enum.valueOf(ls0.class, str);
    }

    public static ls0[] values() {
        return (ls0[]) x50lh2ztY7Y5.clone();
    }
}
