package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pm {
    public static final pm d;
    public static final pm e;
    public static final /* synthetic */ pm[] g;

    static {
        pm pmVar = new pm("VIEW_APPEAR", 0);
        d = pmVar;
        pm pmVar2 = new pm("VIEW_DISAPPEAR", 1);
        e = pmVar2;
        g = new pm[]{pmVar, pmVar2};
    }

    public static pm valueOf(String str) {
        return (pm) Enum.valueOf(pm.class, str);
    }

    public static pm[] values() {
        return (pm[]) g.clone();
    }
}
