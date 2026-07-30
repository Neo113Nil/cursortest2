package Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f2925d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f2926e;

    /* renamed from: i, reason: collision with root package name */
    public static final b f2927i;

    /* renamed from: l, reason: collision with root package name */
    public static final b f2928l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f2929m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b[] f2930n;

    static {
        b bVar = new b("PENALTY_LOG", 0);
        f2925d = bVar;
        b bVar2 = new b("PENALTY_DEATH", 1);
        f2926e = bVar2;
        b bVar3 = new b("DETECT_FRAGMENT_REUSE", 2);
        f2927i = bVar3;
        b bVar4 = new b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f2928l = bVar4;
        b bVar5 = new b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        b bVar6 = new b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        b bVar7 = new b("DETECT_SET_USER_VISIBLE_HINT", 6);
        b bVar8 = new b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        b bVar9 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f2929m = bVar9;
        f2930n = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2930n.clone();
    }
}
