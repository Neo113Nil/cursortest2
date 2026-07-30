package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e71 {
    public static final e71 OPXfSBeufaJ8;
    public static final /* synthetic */ e71[] dgRBjINgWbAK;
    public static final e71 rtx2ld2ELZv4;
    public static final e71 wdg6QnbFHrFF;

    /* JADX INFO: Fake field, exist only in values array */
    e71 EF0;

    static {
        e71 e71Var = new e71("DefaultSpatial", 0);
        e71 e71Var2 = new e71("FastSpatial", 1);
        rtx2ld2ELZv4 = e71Var2;
        e71 e71Var3 = new e71("SlowSpatial", 2);
        e71 e71Var4 = new e71("DefaultEffects", 3);
        e71 e71Var5 = new e71("FastEffects", 4);
        OPXfSBeufaJ8 = e71Var5;
        e71 e71Var6 = new e71("SlowEffects", 5);
        wdg6QnbFHrFF = e71Var6;
        dgRBjINgWbAK = new e71[]{e71Var, e71Var2, e71Var3, e71Var4, e71Var5, e71Var6};
    }

    public static e71 valueOf(String str) {
        return (e71) Enum.valueOf(e71.class, str);
    }

    public static e71[] values() {
        return (e71[]) dgRBjINgWbAK.clone();
    }
}
