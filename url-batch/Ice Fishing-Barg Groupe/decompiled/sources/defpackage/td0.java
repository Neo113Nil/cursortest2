package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class td0 {
    public static final td0 OPXfSBeufaJ8;
    public static final /* synthetic */ td0[] cpQdD2nAriOS;
    public static final td0 dgRBjINgWbAK;
    public static final td0 rtx2ld2ELZv4;
    public static final td0 wdg6QnbFHrFF;
    public static final td0 x50lh2ztY7Y5;

    static {
        td0 td0Var = new td0("ON_CONFIGURE", 0);
        rtx2ld2ELZv4 = td0Var;
        td0 td0Var2 = new td0("ON_CREATE", 1);
        OPXfSBeufaJ8 = td0Var2;
        td0 td0Var3 = new td0("ON_UPGRADE", 2);
        wdg6QnbFHrFF = td0Var3;
        td0 td0Var4 = new td0("ON_DOWNGRADE", 3);
        dgRBjINgWbAK = td0Var4;
        td0 td0Var5 = new td0("ON_OPEN", 4);
        x50lh2ztY7Y5 = td0Var5;
        cpQdD2nAriOS = new td0[]{td0Var, td0Var2, td0Var3, td0Var4, td0Var5};
    }

    public static td0 valueOf(String str) {
        return (td0) Enum.valueOf(td0.class, str);
    }

    public static td0[] values() {
        return (td0[]) cpQdD2nAriOS.clone();
    }
}
