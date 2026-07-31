package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f256d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f257e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f258f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f259g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f260h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f261i;

    /* renamed from: j, reason: collision with root package name */
    public static final f f262j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ f[] f263k;

    static {
        f fVar = new f("Paragraph", 0);
        f256d = fVar;
        f fVar2 = new f("Span", 1);
        f257e = fVar2;
        f fVar3 = new f("VerbatimTts", 2);
        f258f = fVar3;
        f fVar4 = new f("Url", 3);
        f259g = fVar4;
        f fVar5 = new f("Link", 4);
        f260h = fVar5;
        f fVar6 = new f("Clickable", 5);
        f261i = fVar6;
        f fVar7 = new f("String", 6);
        f262j = fVar7;
        f263k = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f263k.clone();
    }
}
