package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final v f4699d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f4700e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f4701f;

    /* renamed from: g, reason: collision with root package name */
    public static final v f4702g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ v[] f4703h;

    /* JADX INFO: Fake field, exist only in values array */
    v EF1;

    static {
        v vVar = new v("BodyLarge", 0);
        v vVar2 = new v("BodyMedium", 1);
        f4699d = vVar2;
        v vVar3 = new v("BodySmall", 2);
        v vVar4 = new v("DisplayLarge", 3);
        v vVar5 = new v("DisplayMedium", 4);
        v vVar6 = new v("DisplaySmall", 5);
        v vVar7 = new v("HeadlineLarge", 6);
        v vVar8 = new v("HeadlineMedium", 7);
        v vVar9 = new v("HeadlineSmall", 8);
        f4700e = vVar9;
        v vVar10 = new v("LabelLarge", 9);
        f4701f = vVar10;
        v vVar11 = new v("LabelMedium", 10);
        f4702g = vVar11;
        f4703h = new v[]{vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, new v("LabelSmall", 11), new v("TitleLarge", 12), new v("TitleMedium", 13), new v("TitleSmall", 14), new v("BodyLargeEmphasized", 15), new v("BodyMediumEmphasized", 16), new v("BodySmallEmphasized", 17), new v("DisplayLargeEmphasized", 18), new v("DisplayMediumEmphasized", 19), new v("DisplaySmallEmphasized", 20), new v("HeadlineLargeEmphasized", 21), new v("HeadlineMediumEmphasized", 22), new v("HeadlineSmallEmphasized", 23), new v("LabelLargeEmphasized", 24), new v("LabelMediumEmphasized", 25), new v("LabelSmallEmphasized", 26), new v("TitleLargeEmphasized", 27), new v("TitleMediumEmphasized", 28), new v("TitleSmallEmphasized", 29)};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f4703h.clone();
    }
}
