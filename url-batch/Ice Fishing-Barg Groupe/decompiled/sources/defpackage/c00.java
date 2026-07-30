package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c00 {
    public static final c00 OPXfSBeufaJ8;
    public static final /* synthetic */ c00[] dgRBjINgWbAK;
    public static final c00 rtx2ld2ELZv4;
    public static final c00 wdg6QnbFHrFF;

    static {
        c00 c00Var = new c00("Vertical", 0);
        rtx2ld2ELZv4 = c00Var;
        c00 c00Var2 = new c00("Horizontal", 1);
        OPXfSBeufaJ8 = c00Var2;
        c00 c00Var3 = new c00("Both", 2);
        wdg6QnbFHrFF = c00Var3;
        dgRBjINgWbAK = new c00[]{c00Var, c00Var2, c00Var3};
    }

    public static c00 valueOf(String str) {
        return (c00) Enum.valueOf(c00.class, str);
    }

    public static c00[] values() {
        return (c00[]) dgRBjINgWbAK.clone();
    }
}
