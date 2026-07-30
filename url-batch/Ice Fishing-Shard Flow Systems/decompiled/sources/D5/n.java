package D5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final n f368d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f369e;

    /* renamed from: i, reason: collision with root package name */
    public static final n f370i;

    /* renamed from: l, reason: collision with root package name */
    public static final n f371l;

    /* renamed from: m, reason: collision with root package name */
    public static final n f372m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ n[] f373n;

    static {
        n nVar = new n("COUNTER", 0);
        f368d = nVar;
        n nVar2 = new n("UP_DOWN_COUNTER", 1);
        f369e = nVar2;
        n nVar3 = new n("HISTOGRAM", 2);
        f370i = nVar3;
        n nVar4 = new n("OBSERVABLE_COUNTER", 3);
        n nVar5 = new n("OBSERVABLE_UP_DOWN_COUNTER", 4);
        n nVar6 = new n("OBSERVABLE_GAUGE", 5);
        f371l = nVar6;
        n nVar7 = new n("GAUGE", 6);
        f372m = nVar7;
        f373n = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f373n.clone();
    }
}
