package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hd0 {
    public static final hd0 d;
    public static final hd0 e;
    public static final hd0 g;
    public static final /* synthetic */ hd0[] h;

    static {
        hd0 hd0Var = new hd0("InMeasureBlock", 0);
        d = hd0Var;
        hd0 hd0Var2 = new hd0("InLayoutBlock", 1);
        e = hd0Var2;
        hd0 hd0Var3 = new hd0("NotUsed", 2);
        g = hd0Var3;
        h = new hd0[]{hd0Var, hd0Var2, hd0Var3};
    }

    public static hd0 valueOf(String str) {
        return (hd0) Enum.valueOf(hd0.class, str);
    }

    public static hd0[] values() {
        return (hd0[]) h.clone();
    }
}
