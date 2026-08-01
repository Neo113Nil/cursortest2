package O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f605a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f606b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f607c;
    public static final b d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f608e;

    static {
        b bVar = new b("FOLLOW", 0);
        f605a = bVar;
        b bVar2 = new b("BLINK", 1);
        f606b = bVar2;
        b bVar3 = new b("LOOK", 2);
        f607c = bVar3;
        b bVar4 = new b("FOCUS", 3);
        d = bVar4;
        f608e = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f608e.clone();
    }
}
