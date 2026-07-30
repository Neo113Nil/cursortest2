package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j41 {
    public static final j41 m;
    public static final j41 n;
    public static final /* synthetic */ j41[] o;

    static {
        j41 j41Var = new j41("Width", 0);
        m = j41Var;
        j41 j41Var2 = new j41("Height", 1);
        n = j41Var2;
        o = new j41[]{j41Var, j41Var2};
    }

    public static j41 valueOf(String str) {
        return (j41) Enum.valueOf(j41.class, str);
    }

    public static j41[] values() {
        return (j41[]) o.clone();
    }
}
