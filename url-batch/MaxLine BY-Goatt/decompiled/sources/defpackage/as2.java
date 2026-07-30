package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class as2 {
    public static final as2 m;
    public static final as2 n;
    public static final as2 o;
    public static final /* synthetic */ as2[] p;

    static {
        as2 as2Var = new as2("FORCE_NONE", 0);
        m = as2Var;
        as2 as2Var2 = new as2("FORCE_SQUARE", 1);
        n = as2Var2;
        as2 as2Var3 = new as2("FORCE_RECTANGLE", 2);
        o = as2Var3;
        p = new as2[]{as2Var, as2Var2, as2Var3};
    }

    public static as2 valueOf(String str) {
        return (as2) Enum.valueOf(as2.class, str);
    }

    public static as2[] values() {
        return (as2[]) p.clone();
    }
}
