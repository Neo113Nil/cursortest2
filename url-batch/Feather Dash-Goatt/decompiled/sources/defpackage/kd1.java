package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kd1 {
    public static final kd1 d;
    public static final /* synthetic */ kd1[] e;

    static {
        kd1 kd1Var = new kd1("Undecided", 0);
        d = kd1Var;
        e = new kd1[]{kd1Var, new kd1("WebView", 1), new kd1("Fallback", 2)};
    }

    public static kd1 valueOf(String str) {
        return (kd1) Enum.valueOf(kd1.class, str);
    }

    public static kd1[] values() {
        return (kd1[]) e.clone();
    }
}
