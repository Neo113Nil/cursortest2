package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class eo {
    public static final eo d;
    public static final eo e;
    public static final eo g;
    public static final /* synthetic */ eo[] h;

    static {
        eo eoVar = new eo("None", 0);
        d = eoVar;
        eo eoVar2 = new eo("Cancelled", 1);
        e = eoVar2;
        eo eoVar3 = new eo("Redirected", 2);
        g = eoVar3;
        h = new eo[]{eoVar, eoVar2, eoVar3, new eo("RedirectCancelled", 3)};
    }

    public static eo valueOf(String str) {
        return (eo) Enum.valueOf(eo.class, str);
    }

    public static eo[] values() {
        return (eo[]) h.clone();
    }
}
