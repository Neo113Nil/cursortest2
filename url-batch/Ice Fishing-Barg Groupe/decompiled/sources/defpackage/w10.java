package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w10 {
    public static final w10 OPXfSBeufaJ8;
    public static final /* synthetic */ w10[] dgRBjINgWbAK;
    public static final w10 rtx2ld2ELZv4;
    public static final w10 wdg6QnbFHrFF;

    static {
        w10 w10Var = new w10("Yes", 0);
        rtx2ld2ELZv4 = w10Var;
        w10 w10Var2 = new w10("No", 1);
        OPXfSBeufaJ8 = w10Var2;
        w10 w10Var3 = new w10("NotInitialized", 2);
        wdg6QnbFHrFF = w10Var3;
        dgRBjINgWbAK = new w10[]{w10Var, w10Var2, w10Var3};
    }

    public static w10 valueOf(String str) {
        return (w10) Enum.valueOf(w10.class, str);
    }

    public static w10[] values() {
        return (w10[]) dgRBjINgWbAK.clone();
    }
}
