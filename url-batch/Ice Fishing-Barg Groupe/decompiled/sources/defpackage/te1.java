package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class te1 {
    public static final te1 OPXfSBeufaJ8;
    public static final /* synthetic */ te1[] dgRBjINgWbAK;
    public static final te1 rtx2ld2ELZv4;
    public static final te1 wdg6QnbFHrFF;

    static {
        te1 te1Var = new te1("NO_OP", 0);
        rtx2ld2ELZv4 = te1Var;
        te1 te1Var2 = new te1("ADD", 1);
        OPXfSBeufaJ8 = te1Var2;
        te1 te1Var3 = new te1("REMOVE", 2);
        wdg6QnbFHrFF = te1Var3;
        dgRBjINgWbAK = new te1[]{te1Var, te1Var2, te1Var3};
    }

    public static te1 valueOf(String str) {
        return (te1) Enum.valueOf(te1.class, str);
    }

    public static te1[] values() {
        return (te1[]) dgRBjINgWbAK.clone();
    }
}
