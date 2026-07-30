package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i91 {
    public static final /* synthetic */ i91[] OPXfSBeufaJ8;
    public static final i91 rtx2ld2ELZv4;

    static {
        i91 i91Var = new i91("Default", 0);
        rtx2ld2ELZv4 = i91Var;
        OPXfSBeufaJ8 = new i91[]{i91Var, new i91("UserInput", 1), new i91("PreventUserInput", 2)};
    }

    public static i91 valueOf(String str) {
        return (i91) Enum.valueOf(i91.class, str);
    }

    public static i91[] values() {
        return (i91[]) OPXfSBeufaJ8.clone();
    }
}
