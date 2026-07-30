package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u50 {
    public static final u50 OPXfSBeufaJ8;
    public static final /* synthetic */ u50[] dgRBjINgWbAK;
    public static final u50 rtx2ld2ELZv4;
    public static final u50 wdg6QnbFHrFF;

    static {
        u50 u50Var = new u50("PreEnter", 0);
        rtx2ld2ELZv4 = u50Var;
        u50 u50Var2 = new u50("Visible", 1);
        OPXfSBeufaJ8 = u50Var2;
        u50 u50Var3 = new u50("PostExit", 2);
        wdg6QnbFHrFF = u50Var3;
        dgRBjINgWbAK = new u50[]{u50Var, u50Var2, u50Var3};
    }

    public static u50 valueOf(String str) {
        return (u50) Enum.valueOf(u50.class, str);
    }

    public static u50[] values() {
        return (u50[]) dgRBjINgWbAK.clone();
    }
}
