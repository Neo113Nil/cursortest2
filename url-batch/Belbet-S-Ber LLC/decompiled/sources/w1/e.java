package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final e f3781f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f3782g;
    public static final e h;
    public static final e i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ e[] f3783j;

    static {
        e eVar = new e("NONE", 0);
        f3781f = eVar;
        e eVar2 = new e("START", 1);
        f3782g = eVar2;
        e eVar3 = new e("END", 2);
        h = eVar3;
        e eVar4 = new e("BOTH", 3);
        i = eVar4;
        f3783j = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f3783j.clone();
    }
}
