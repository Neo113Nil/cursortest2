package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tn {
    public static final tn d;
    public static final tn e;
    public static final tn g;
    public static final /* synthetic */ tn[] h;

    static {
        tn tnVar = new tn("COROUTINE_SUSPENDED", 0);
        d = tnVar;
        tn tnVar2 = new tn("UNDECIDED", 1);
        e = tnVar2;
        tn tnVar3 = new tn("RESUMED", 2);
        g = tnVar3;
        h = new tn[]{tnVar, tnVar2, tnVar3};
    }

    public static tn valueOf(String str) {
        return (tn) Enum.valueOf(tn.class, str);
    }

    public static tn[] values() {
        return (tn[]) h.clone();
    }
}
