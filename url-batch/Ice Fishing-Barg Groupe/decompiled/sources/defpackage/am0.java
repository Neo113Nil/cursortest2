package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class am0 {
    public static final am0 OPXfSBeufaJ8;
    public static final /* synthetic */ am0[] dgRBjINgWbAK;
    public static final am0 rtx2ld2ELZv4;
    public static final am0 wdg6QnbFHrFF;

    static {
        am0 am0Var = new am0("NONE", 0);
        rtx2ld2ELZv4 = am0Var;
        am0 am0Var2 = new am0("BASIC", 1);
        am0 am0Var3 = new am0("HEADERS", 2);
        OPXfSBeufaJ8 = am0Var3;
        am0 am0Var4 = new am0("BODY", 3);
        wdg6QnbFHrFF = am0Var4;
        dgRBjINgWbAK = new am0[]{am0Var, am0Var2, am0Var3, am0Var4};
    }

    public static am0 valueOf(String str) {
        return (am0) Enum.valueOf(am0.class, str);
    }

    public static am0[] values() {
        return (am0[]) dgRBjINgWbAK.clone();
    }
}
