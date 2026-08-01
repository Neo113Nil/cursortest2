package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f6295d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f6296e;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("CornerExtraExtraLarge", 0);
        e eVar2 = new e("CornerExtraLarge", 1);
        e eVar3 = new e("CornerExtraLargeIncreased", 2);
        e eVar4 = new e("CornerExtraLargeTop", 3);
        e eVar5 = new e("CornerExtraSmall", 4);
        e eVar6 = new e("CornerExtraSmallTop", 5);
        e eVar7 = new e("CornerFull", 6);
        f6295d = eVar7;
        f6296e = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, new e("CornerLarge", 7), new e("CornerLargeEnd", 8), new e("CornerLargeIncreased", 9), new e("CornerLargeStart", 10), new e("CornerLargeTop", 11), new e("CornerMedium", 12), new e("CornerNone", 13), new e("CornerSmall", 14)};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f6296e.clone();
    }
}
