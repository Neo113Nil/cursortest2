package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fk2 {
    public static final fk2 OPXfSBeufaJ8;
    public static final /* synthetic */ fk2[] dgRBjINgWbAK;
    public static final fk2 rtx2ld2ELZv4;
    public static final fk2 wdg6QnbFHrFF;

    static {
        fk2 fk2Var = new fk2("Uninitialized", 0);
        rtx2ld2ELZv4 = fk2Var;
        fk2 fk2Var2 = new fk2("Detached", 1);
        OPXfSBeufaJ8 = fk2Var2;
        fk2 fk2Var3 = new fk2("Attached", 2);
        wdg6QnbFHrFF = fk2Var3;
        dgRBjINgWbAK = new fk2[]{fk2Var, fk2Var2, fk2Var3};
    }

    public static fk2 valueOf(String str) {
        return (fk2) Enum.valueOf(fk2.class, str);
    }

    public static fk2[] values() {
        return (fk2[]) dgRBjINgWbAK.clone();
    }
}
