package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dx1 {
    public static final dx1 OPXfSBeufaJ8;
    public static final dx1 rtx2ld2ELZv4;
    public static final /* synthetic */ dx1[] wdg6QnbFHrFF;

    /* JADX INFO: Fake field, exist only in values array */
    dx1 EF0;

    static {
        dx1 dx1Var = new dx1("AUTOMATIC", 0);
        dx1 dx1Var2 = new dx1("TRUNCATE", 1);
        rtx2ld2ELZv4 = dx1Var2;
        dx1 dx1Var3 = new dx1("WRITE_AHEAD_LOGGING", 2);
        OPXfSBeufaJ8 = dx1Var3;
        wdg6QnbFHrFF = new dx1[]{dx1Var, dx1Var2, dx1Var3};
    }

    public static dx1 valueOf(String str) {
        return (dx1) Enum.valueOf(dx1.class, str);
    }

    public static dx1[] values() {
        return (dx1[]) wdg6QnbFHrFF.clone();
    }
}
