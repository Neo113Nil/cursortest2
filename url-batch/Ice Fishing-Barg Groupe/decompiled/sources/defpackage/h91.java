package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class h91 {
    public static final h91 OPXfSBeufaJ8;
    public static final h91 rtx2ld2ELZv4;
    public static final /* synthetic */ h91[] wdg6QnbFHrFF;

    static {
        h91 h91Var = new h91("Default", 0);
        rtx2ld2ELZv4 = h91Var;
        h91 h91Var2 = new h91("UserInput", 1);
        OPXfSBeufaJ8 = h91Var2;
        wdg6QnbFHrFF = new h91[]{h91Var, h91Var2, new h91("PreventUserInput", 2)};
    }

    public static h91 valueOf(String str) {
        return (h91) Enum.valueOf(h91.class, str);
    }

    public static h91[] values() {
        return (h91[]) wdg6QnbFHrFF.clone();
    }
}
