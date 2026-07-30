package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rj0 {
    public static final rj0 m;
    public static final /* synthetic */ rj0[] n;

    /* JADX INFO: Fake field, exist only in values array */
    rj0 EF0;

    static {
        rj0 rj0Var = new rj0("IGNORE", 0);
        rj0 rj0Var2 = new rj0("RESPECT_PERFORMANCE", 1);
        m = rj0Var2;
        n = new rj0[]{rj0Var, rj0Var2, new rj0("RESPECT_ALL", 2)};
    }

    public static rj0 valueOf(String str) {
        return (rj0) Enum.valueOf(rj0.class, str);
    }

    public static rj0[] values() {
        return (rj0[]) n.clone();
    }
}
