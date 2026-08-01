package r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final e f3175f;
    public static final e g;
    public static final e h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f3176i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ e[] f3177j;

    static {
        e eVar = new e("NONE", 0);
        f3175f = eVar;
        e eVar2 = new e("START", 1);
        g = eVar2;
        e eVar3 = new e("END", 2);
        h = eVar3;
        e eVar4 = new e("BOTH", 3);
        f3176i = eVar4;
        f3177j = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f3177j.clone();
    }
}
