package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vb2 {
    public static final vb2 OPXfSBeufaJ8;
    public static final /* synthetic */ vb2[] cpQdD2nAriOS;
    public static final vb2 dgRBjINgWbAK;
    public static final vb2 rtx2ld2ELZv4;
    public static final vb2 wdg6QnbFHrFF;
    public static final vb2 x50lh2ztY7Y5;

    static {
        vb2 vb2Var = new vb2("END", 0);
        rtx2ld2ELZv4 = vb2Var;
        vb2 vb2Var2 = new vb2("ROLLBACK", 1);
        OPXfSBeufaJ8 = vb2Var2;
        vb2 vb2Var3 = new vb2("BEGIN_EXCLUSIVE", 2);
        wdg6QnbFHrFF = vb2Var3;
        vb2 vb2Var4 = new vb2("BEGIN_IMMEDIATE", 3);
        dgRBjINgWbAK = vb2Var4;
        vb2 vb2Var5 = new vb2("BEGIN_DEFERRED", 4);
        x50lh2ztY7Y5 = vb2Var5;
        cpQdD2nAriOS = new vb2[]{vb2Var, vb2Var2, vb2Var3, vb2Var4, vb2Var5};
    }

    public static vb2 valueOf(String str) {
        return (vb2) Enum.valueOf(vb2.class, str);
    }

    public static vb2[] values() {
        return (vb2[]) cpQdD2nAriOS.clone();
    }
}
