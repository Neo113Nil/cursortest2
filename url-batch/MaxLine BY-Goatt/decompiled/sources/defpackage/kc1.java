package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kc1 {
    public static final kc1 m;
    public static final /* synthetic */ kc1[] n;

    /* JADX INFO: Fake field, exist only in values array */
    kc1 EF0;

    static {
        kc1 kc1Var = new kc1("SYNCHRONIZED", 0);
        kc1 kc1Var2 = new kc1("PUBLICATION", 1);
        kc1 kc1Var3 = new kc1("NONE", 2);
        m = kc1Var3;
        n = new kc1[]{kc1Var, kc1Var2, kc1Var3};
    }

    public static kc1 valueOf(String str) {
        return (kc1) Enum.valueOf(kc1.class, str);
    }

    public static kc1[] values() {
        return (kc1[]) n.clone();
    }
}
