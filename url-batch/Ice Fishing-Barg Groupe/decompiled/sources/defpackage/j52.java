package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j52 {
    public static final j52 OPXfSBeufaJ8;
    public static final /* synthetic */ j52[] dgRBjINgWbAK;
    public static final j52 rtx2ld2ELZv4;
    public static final j52 wdg6QnbFHrFF;

    static {
        j52 j52Var = new j52("START", 0);
        rtx2ld2ELZv4 = j52Var;
        j52 j52Var2 = new j52("STOP", 1);
        OPXfSBeufaJ8 = j52Var2;
        j52 j52Var3 = new j52("STOP_AND_RESET_REPLAY_CACHE", 2);
        wdg6QnbFHrFF = j52Var3;
        dgRBjINgWbAK = new j52[]{j52Var, j52Var2, j52Var3};
    }

    public static j52 valueOf(String str) {
        return (j52) Enum.valueOf(j52.class, str);
    }

    public static j52[] values() {
        return (j52[]) dgRBjINgWbAK.clone();
    }
}
