package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class os1 {
    public static final os1 m;
    public static final os1 n;
    public static final /* synthetic */ os1[] o;

    static {
        os1 os1Var = new os1("Width", 0);
        m = os1Var;
        os1 os1Var2 = new os1("Height", 1);
        n = os1Var2;
        o = new os1[]{os1Var, os1Var2};
    }

    public static os1 valueOf(String str) {
        return (os1) Enum.valueOf(os1.class, str);
    }

    public static os1[] values() {
        return (os1[]) o.clone();
    }
}
