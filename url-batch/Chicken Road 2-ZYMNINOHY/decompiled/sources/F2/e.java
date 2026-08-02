package F2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f767a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f768b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f769c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f770d;

    static {
        e eVar = new e("VIDEO_CONTROLS", 0);
        f767a = eVar;
        e eVar2 = new e("CLOSE_AD", 1);
        f768b = eVar2;
        e eVar3 = new e("NOT_VISIBLE", 2);
        e eVar4 = new e("OTHER", 3);
        f769c = eVar4;
        f770d = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f770d.clone();
    }
}
