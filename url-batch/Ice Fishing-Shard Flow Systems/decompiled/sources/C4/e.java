package C4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f301d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f302e;

    /* renamed from: i, reason: collision with root package name */
    public static final e f303i;

    /* renamed from: l, reason: collision with root package name */
    public static final e f304l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f305m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f306n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f307o;

    /* renamed from: p, reason: collision with root package name */
    public static final e f308p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ e[] f309q;

    static {
        e eVar = new e("STRING", 0);
        f301d = eVar;
        e eVar2 = new e("BOOLEAN", 1);
        f302e = eVar2;
        e eVar3 = new e("LONG", 2);
        f303i = eVar3;
        e eVar4 = new e("DOUBLE", 3);
        f304l = eVar4;
        e eVar5 = new e("STRING_ARRAY", 4);
        f305m = eVar5;
        e eVar6 = new e("BOOLEAN_ARRAY", 5);
        f306n = eVar6;
        e eVar7 = new e("LONG_ARRAY", 6);
        f307o = eVar7;
        e eVar8 = new e("DOUBLE_ARRAY", 7);
        f308p = eVar8;
        f309q = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f309q.clone();
    }
}
