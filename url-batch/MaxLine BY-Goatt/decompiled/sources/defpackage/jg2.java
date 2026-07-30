package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jg2 {
    public static final jg2 m;
    public static final jg2 n;
    public static final /* synthetic */ jg2[] o;

    static {
        jg2 jg2Var = new jg2("Inherit", 0);
        m = jg2Var;
        jg2 jg2Var2 = new jg2("SecureOn", 1);
        n = jg2Var2;
        o = new jg2[]{jg2Var, jg2Var2, new jg2("SecureOff", 2)};
    }

    public static jg2 valueOf(String str) {
        return (jg2) Enum.valueOf(jg2.class, str);
    }

    public static jg2[] values() {
        return (jg2[]) o.clone();
    }
}
