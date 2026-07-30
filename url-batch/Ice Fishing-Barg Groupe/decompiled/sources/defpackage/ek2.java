package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ek2 {
    public static final ek2 OPXfSBeufaJ8;
    public static final ek2 rtx2ld2ELZv4;
    public static final /* synthetic */ ek2[] wdg6QnbFHrFF;

    static {
        ek2 ek2Var = new ek2("On", 0);
        rtx2ld2ELZv4 = ek2Var;
        ek2 ek2Var2 = new ek2("Off", 1);
        OPXfSBeufaJ8 = ek2Var2;
        wdg6QnbFHrFF = new ek2[]{ek2Var, ek2Var2, new ek2("Indeterminate", 2)};
    }

    public static ek2 valueOf(String str) {
        return (ek2) Enum.valueOf(ek2.class, str);
    }

    public static ek2[] values() {
        return (ek2[]) wdg6QnbFHrFF.clone();
    }
}
