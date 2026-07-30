package a2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: f, reason: collision with root package name */
    public static final i f394f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f395g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f396h;

    /* renamed from: i, reason: collision with root package name */
    public static final i f397i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f398j;

    /* renamed from: k, reason: collision with root package name */
    public static final i f399k;

    /* renamed from: l, reason: collision with root package name */
    public static final i f400l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ i[] f401m;

    static {
        i iVar = new i("Paragraph", 0);
        f394f = iVar;
        i iVar2 = new i("Span", 1);
        f395g = iVar2;
        i iVar3 = new i("VerbatimTts", 2);
        f396h = iVar3;
        i iVar4 = new i("Url", 3);
        f397i = iVar4;
        i iVar5 = new i("Link", 4);
        f398j = iVar5;
        i iVar6 = new i("Clickable", 5);
        f399k = iVar6;
        i iVar7 = new i("String", 6);
        f400l = iVar7;
        f401m = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f401m.clone();
    }
}
