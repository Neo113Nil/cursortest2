package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qn {
    public static final qn d;
    public static final qn e;
    public static final qn g;
    public static final qn h;
    public static final qn i;
    public static final /* synthetic */ qn[] j;

    static {
        qn qnVar = new qn("CPU_ACQUIRED", 0);
        d = qnVar;
        qn qnVar2 = new qn("BLOCKING", 1);
        e = qnVar2;
        qn qnVar3 = new qn("PARKING", 2);
        g = qnVar3;
        qn qnVar4 = new qn("DORMANT", 3);
        h = qnVar4;
        qn qnVar5 = new qn("TERMINATED", 4);
        i = qnVar5;
        j = new qn[]{qnVar, qnVar2, qnVar3, qnVar4, qnVar5};
    }

    public static qn valueOf(String str) {
        return (qn) Enum.valueOf(qn.class, str);
    }

    public static qn[] values() {
        return (qn[]) j.clone();
    }
}
