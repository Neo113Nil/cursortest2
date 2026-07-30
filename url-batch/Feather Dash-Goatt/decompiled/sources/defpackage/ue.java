package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ue {
    public static final ue d;
    public static final ue e;
    public static final ue g;
    public static final /* synthetic */ ue[] h;

    static {
        ue ueVar = new ue("SUSPEND", 0);
        d = ueVar;
        ue ueVar2 = new ue("DROP_OLDEST", 1);
        e = ueVar2;
        ue ueVar3 = new ue("DROP_LATEST", 2);
        g = ueVar3;
        h = new ue[]{ueVar, ueVar2, ueVar3};
    }

    public static ue valueOf(String str) {
        return (ue) Enum.valueOf(ue.class, str);
    }

    public static ue[] values() {
        return (ue[]) h.clone();
    }
}
