package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b50 {
    public static final b50 m;
    public static final b50 n;
    public static final b50 o;
    public static final /* synthetic */ b50[] p;

    static {
        b50 b50Var = new b50("COROUTINE_SUSPENDED", 0);
        m = b50Var;
        b50 b50Var2 = new b50("UNDECIDED", 1);
        n = b50Var2;
        b50 b50Var3 = new b50("RESUMED", 2);
        o = b50Var3;
        p = new b50[]{b50Var, b50Var2, b50Var3};
    }

    public static b50 valueOf(String str) {
        return (b50) Enum.valueOf(b50.class, str);
    }

    public static b50[] values() {
        return (b50[]) p.clone();
    }
}
