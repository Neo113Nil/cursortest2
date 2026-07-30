package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y31 {
    public static final y31 OPXfSBeufaJ8;
    public static final /* synthetic */ y31[] dgRBjINgWbAK;
    public static final y31 rtx2ld2ELZv4;
    public static final y31 wdg6QnbFHrFF;

    static {
        y31 y31Var = new y31("IsPlacedInLookahead", 0);
        rtx2ld2ELZv4 = y31Var;
        y31 y31Var2 = new y31("IsPlacedInApproach", 1);
        OPXfSBeufaJ8 = y31Var2;
        y31 y31Var3 = new y31("IsNotPlaced", 2);
        wdg6QnbFHrFF = y31Var3;
        dgRBjINgWbAK = new y31[]{y31Var, y31Var2, y31Var3};
    }

    public static y31 valueOf(String str) {
        return (y31) Enum.valueOf(y31.class, str);
    }

    public static y31[] values() {
        return (y31[]) dgRBjINgWbAK.clone();
    }
}
