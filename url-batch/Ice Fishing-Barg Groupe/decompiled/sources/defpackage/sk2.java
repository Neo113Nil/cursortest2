package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sk2 {
    public static final sk2 OPXfSBeufaJ8;
    public static final sk2 rtx2ld2ELZv4;
    public static final /* synthetic */ sk2[] wdg6QnbFHrFF;

    static {
        sk2 sk2Var = new sk2("DEFERRED", 0);
        rtx2ld2ELZv4 = sk2Var;
        sk2 sk2Var2 = new sk2("IMMEDIATE", 1);
        OPXfSBeufaJ8 = sk2Var2;
        wdg6QnbFHrFF = new sk2[]{sk2Var, sk2Var2, new sk2("EXCLUSIVE", 2)};
    }

    public static sk2 valueOf(String str) {
        return (sk2) Enum.valueOf(sk2.class, str);
    }

    public static sk2[] values() {
        return (sk2[]) wdg6QnbFHrFF.clone();
    }
}
