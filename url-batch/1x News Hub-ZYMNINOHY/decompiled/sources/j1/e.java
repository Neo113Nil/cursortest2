package j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f9526a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f9527b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f9528c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f9529d;

    static {
        e eVar = new e("VIDEO_CONTROLS", 0);
        f9526a = eVar;
        e eVar2 = new e("CLOSE_AD", 1);
        f9527b = eVar2;
        e eVar3 = new e("NOT_VISIBLE", 2);
        e eVar4 = new e("OTHER", 3);
        f9528c = eVar4;
        f9529d = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f9529d.clone();
    }
}
