package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f1515e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f1516f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f1517g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f1518h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f1519i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ e[] f1520j;

    static {
        e eVar = new e("DESTROYED", 0);
        f1515e = eVar;
        e eVar2 = new e("INITIALIZED", 1);
        f1516f = eVar2;
        e eVar3 = new e("CREATED", 2);
        f1517g = eVar3;
        e eVar4 = new e("STARTED", 3);
        f1518h = eVar4;
        e eVar5 = new e("RESUMED", 4);
        f1519i = eVar5;
        f1520j = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f1520j.clone();
    }
}
