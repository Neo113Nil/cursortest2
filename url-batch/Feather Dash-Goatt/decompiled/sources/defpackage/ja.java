package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ja {
    public static final ja d;
    public static final ja e;
    public static final /* synthetic */ ja[] g;

    static {
        ja jaVar = new ja("VICTORY", 0);
        d = jaVar;
        ja jaVar2 = new ja("FAIL", 1);
        e = jaVar2;
        g = new ja[]{jaVar, jaVar2};
    }

    public static ja valueOf(String str) {
        return (ja) Enum.valueOf(ja.class, str);
    }

    public static ja[] values() {
        return (ja[]) g.clone();
    }
}
