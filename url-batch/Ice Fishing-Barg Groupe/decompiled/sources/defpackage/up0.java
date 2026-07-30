package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class up0 {
    public static final up0 OPXfSBeufaJ8;
    public static final /* synthetic */ up0[] dgRBjINgWbAK;
    public static final up0 rtx2ld2ELZv4;
    public static final up0 wdg6QnbFHrFF;

    static {
        up0 up0Var = new up0("Focused", 0);
        rtx2ld2ELZv4 = up0Var;
        up0 up0Var2 = new up0("UnfocusedEmpty", 1);
        OPXfSBeufaJ8 = up0Var2;
        up0 up0Var3 = new up0("UnfocusedNotEmpty", 2);
        wdg6QnbFHrFF = up0Var3;
        dgRBjINgWbAK = new up0[]{up0Var, up0Var2, up0Var3};
    }

    public static up0 valueOf(String str) {
        return (up0) Enum.valueOf(up0.class, str);
    }

    public static up0[] values() {
        return (up0[]) dgRBjINgWbAK.clone();
    }
}
