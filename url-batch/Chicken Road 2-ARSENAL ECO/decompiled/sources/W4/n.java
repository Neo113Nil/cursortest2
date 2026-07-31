package W4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final n f2814f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f2815g;

    /* renamed from: h, reason: collision with root package name */
    public static final n f2816h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f2817i;

    /* renamed from: j, reason: collision with root package name */
    public static final n f2818j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ n[] f2819k;

    static {
        n nVar = new n("COUNTER", 0);
        f2814f = nVar;
        n nVar2 = new n("UP_DOWN_COUNTER", 1);
        f2815g = nVar2;
        n nVar3 = new n("HISTOGRAM", 2);
        f2816h = nVar3;
        n nVar4 = new n("OBSERVABLE_COUNTER", 3);
        n nVar5 = new n("OBSERVABLE_UP_DOWN_COUNTER", 4);
        n nVar6 = new n("OBSERVABLE_GAUGE", 5);
        f2817i = nVar6;
        n nVar7 = new n("GAUGE", 6);
        f2818j = nVar7;
        f2819k = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f2819k.clone();
    }
}
