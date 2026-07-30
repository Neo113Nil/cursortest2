package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g91 {
    public static final g91 m;
    public static final g91 n;
    public static final g91 o;
    public static final /* synthetic */ g91[] p;

    static {
        g91 g91Var = new g91("InMeasureBlock", 0);
        m = g91Var;
        g91 g91Var2 = new g91("InLayoutBlock", 1);
        n = g91Var2;
        g91 g91Var3 = new g91("NotUsed", 2);
        o = g91Var3;
        p = new g91[]{g91Var, g91Var2, g91Var3};
    }

    public static g91 valueOf(String str) {
        return (g91) Enum.valueOf(g91.class, str);
    }

    public static g91[] values() {
        return (g91[]) p.clone();
    }
}
