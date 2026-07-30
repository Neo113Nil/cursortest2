package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rw0 {
    public static final rw0 OPXfSBeufaJ8;
    public static final /* synthetic */ rw0[] cpQdD2nAriOS;
    public static final rw0 dgRBjINgWbAK;
    public static final rw0 rtx2ld2ELZv4;
    public static final rw0 wdg6QnbFHrFF;
    public static final rw0 x50lh2ztY7Y5;

    static {
        rw0 rw0Var = new rw0("Measuring", 0);
        rtx2ld2ELZv4 = rw0Var;
        rw0 rw0Var2 = new rw0("LookaheadMeasuring", 1);
        OPXfSBeufaJ8 = rw0Var2;
        rw0 rw0Var3 = new rw0("LayingOut", 2);
        wdg6QnbFHrFF = rw0Var3;
        rw0 rw0Var4 = new rw0("LookaheadLayingOut", 3);
        dgRBjINgWbAK = rw0Var4;
        rw0 rw0Var5 = new rw0("Idle", 4);
        x50lh2ztY7Y5 = rw0Var5;
        cpQdD2nAriOS = new rw0[]{rw0Var, rw0Var2, rw0Var3, rw0Var4, rw0Var5};
    }

    public static rw0 valueOf(String str) {
        return (rw0) Enum.valueOf(rw0.class, str);
    }

    public static rw0[] values() {
        return (rw0[]) cpQdD2nAriOS.clone();
    }
}
