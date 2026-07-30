package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f6496d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f6497e;

    /* renamed from: i, reason: collision with root package name */
    public static final f f6498i;

    /* renamed from: l, reason: collision with root package name */
    public static final f f6499l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f6500m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ f[] f6501n;

    static {
        f fVar = new f("ON_CONFIGURE", 0);
        f6496d = fVar;
        f fVar2 = new f("ON_CREATE", 1);
        f6497e = fVar2;
        f fVar3 = new f("ON_UPGRADE", 2);
        f6498i = fVar3;
        f fVar4 = new f("ON_DOWNGRADE", 3);
        f6499l = fVar4;
        f fVar5 = new f("ON_OPEN", 4);
        f6500m = fVar5;
        f6501n = new f[]{fVar, fVar2, fVar3, fVar4, fVar5};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f6501n.clone();
    }
}
