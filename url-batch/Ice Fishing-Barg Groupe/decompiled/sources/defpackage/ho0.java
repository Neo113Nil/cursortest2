package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ho0 {
    public static final ho0 OPXfSBeufaJ8;
    public static final /* synthetic */ ho0[] dgRBjINgWbAK;
    public static final ho0 rtx2ld2ELZv4;
    public static final ho0 wdg6QnbFHrFF;

    static {
        ho0 ho0Var = new ho0("Yes", 0);
        rtx2ld2ELZv4 = ho0Var;
        ho0 ho0Var2 = new ho0("No", 1);
        OPXfSBeufaJ8 = ho0Var2;
        ho0 ho0Var3 = new ho0("NotInitialized", 2);
        wdg6QnbFHrFF = ho0Var3;
        dgRBjINgWbAK = new ho0[]{ho0Var, ho0Var2, ho0Var3};
    }

    public static ho0 valueOf(String str) {
        return (ho0) Enum.valueOf(ho0.class, str);
    }

    public static ho0[] values() {
        return (ho0[]) dgRBjINgWbAK.clone();
    }
}
