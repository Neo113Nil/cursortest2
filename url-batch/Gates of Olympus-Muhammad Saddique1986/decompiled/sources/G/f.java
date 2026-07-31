package G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f1993d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f1994e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1995f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f1996g;

    static {
        f fVar = new f("Focused", 0);
        f1993d = fVar;
        f fVar2 = new f("UnfocusedEmpty", 1);
        f1994e = fVar2;
        f fVar3 = new f("UnfocusedNotEmpty", 2);
        f1995f = fVar3;
        f1996g = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f1996g.clone();
    }
}
