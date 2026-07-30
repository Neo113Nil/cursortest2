package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uu1 {
    public static final /* synthetic */ uu1[] OPXfSBeufaJ8;
    public static final uu1 rtx2ld2ELZv4;

    /* JADX INFO: Fake field, exist only in values array */
    uu1 EF0;

    static {
        uu1 uu1Var = new uu1("Restart", 0);
        uu1 uu1Var2 = new uu1("Reverse", 1);
        rtx2ld2ELZv4 = uu1Var2;
        OPXfSBeufaJ8 = new uu1[]{uu1Var, uu1Var2};
    }

    public static uu1 valueOf(String str) {
        return (uu1) Enum.valueOf(uu1.class, str);
    }

    public static uu1[] values() {
        return (uu1[]) OPXfSBeufaJ8.clone();
    }
}
