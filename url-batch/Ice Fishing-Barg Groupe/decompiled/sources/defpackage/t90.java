package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t90 {
    public static final /* synthetic */ t90[] OPXfSBeufaJ8;
    public static final t90 rtx2ld2ELZv4;

    /* JADX INFO: Fake field, exist only in values array */
    t90 EF0;

    static {
        t90 t90Var = new t90("Visible", 0);
        t90 t90Var2 = new t90("Clip", 1);
        rtx2ld2ELZv4 = t90Var2;
        OPXfSBeufaJ8 = new t90[]{t90Var, t90Var2, new t90("ExpandIndicator", 2), new t90("ExpandOrCollapseIndicator", 3)};
    }

    public static t90 valueOf(String str) {
        return (t90) Enum.valueOf(t90.class, str);
    }

    public static t90[] values() {
        return (t90[]) OPXfSBeufaJ8.clone();
    }
}
