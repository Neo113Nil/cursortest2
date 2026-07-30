package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dt1 {
    public static final dt1 OPXfSBeufaJ8;
    public static final dt1 cpQdD2nAriOS;
    public static final dt1 dgRBjINgWbAK;
    public static final /* synthetic */ dt1[] r3s1LDPKFs1S;
    public static final dt1 rtx2ld2ELZv4;
    public static final dt1 wdg6QnbFHrFF;
    public static final dt1 x50lh2ztY7Y5;

    static {
        dt1 dt1Var = new dt1("ShutDown", 0);
        rtx2ld2ELZv4 = dt1Var;
        dt1 dt1Var2 = new dt1("ShuttingDown", 1);
        OPXfSBeufaJ8 = dt1Var2;
        dt1 dt1Var3 = new dt1("Inactive", 2);
        wdg6QnbFHrFF = dt1Var3;
        dt1 dt1Var4 = new dt1("InactivePendingWork", 3);
        dgRBjINgWbAK = dt1Var4;
        dt1 dt1Var5 = new dt1("Idle", 4);
        x50lh2ztY7Y5 = dt1Var5;
        dt1 dt1Var6 = new dt1("PendingWork", 5);
        cpQdD2nAriOS = dt1Var6;
        r3s1LDPKFs1S = new dt1[]{dt1Var, dt1Var2, dt1Var3, dt1Var4, dt1Var5, dt1Var6};
    }

    public static dt1 valueOf(String str) {
        return (dt1) Enum.valueOf(dt1.class, str);
    }

    public static dt1[] values() {
        return (dt1[]) r3s1LDPKFs1S.clone();
    }
}
