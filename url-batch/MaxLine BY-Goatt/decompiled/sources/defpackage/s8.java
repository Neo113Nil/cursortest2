package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s8 {
    public static final s8 m;
    public static final s8 n;
    public static final /* synthetic */ s8[] o;

    static {
        s8 s8Var = new s8("SHOW_ORIGINAL", 0);
        m = s8Var;
        s8 s8Var2 = new s8("SHOW_TRANSLATED", 1);
        n = s8Var2;
        o = new s8[]{s8Var, s8Var2};
    }

    public static s8 valueOf(String str) {
        return (s8) Enum.valueOf(s8.class, str);
    }

    public static s8[] values() {
        return (s8[]) o.clone();
    }
}
