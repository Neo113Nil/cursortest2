package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final q f4606d;

    /* renamed from: e, reason: collision with root package name */
    public static final q f4607e;

    /* renamed from: f, reason: collision with root package name */
    public static final q f4608f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q[] f4609g;

    /* JADX INFO: Fake field, exist only in values array */
    q EF0;

    static {
        q qVar = new q("CornerExtraExtraLarge", 0);
        q qVar2 = new q("CornerExtraLarge", 1);
        f4606d = qVar2;
        q qVar3 = new q("CornerExtraLargeIncreased", 2);
        q qVar4 = new q("CornerExtraLargeTop", 3);
        q qVar5 = new q("CornerExtraSmall", 4);
        q qVar6 = new q("CornerExtraSmallTop", 5);
        q qVar7 = new q("CornerFull", 6);
        f4607e = qVar7;
        q qVar8 = new q("CornerLarge", 7);
        q qVar9 = new q("CornerLargeEnd", 8);
        q qVar10 = new q("CornerLargeIncreased", 9);
        q qVar11 = new q("CornerLargeStart", 10);
        q qVar12 = new q("CornerLargeTop", 11);
        q qVar13 = new q("CornerMedium", 12);
        f4608f = qVar13;
        f4609g = new q[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, new q("CornerNone", 13), new q("CornerSmall", 14)};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f4609g.clone();
    }
}
