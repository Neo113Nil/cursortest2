package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final o f10305d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f10306e;

    /* renamed from: i, reason: collision with root package name */
    public static final o f10307i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ o[] f10308r;

    static {
        o oVar = new o("Unknown", 0);
        f10305d = oVar;
        o oVar2 = new o("Dispatching", 1);
        f10306e = oVar2;
        o oVar3 = new o("NotDispatching", 2);
        f10307i = oVar3;
        f10308r = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f10308r.clone();
    }
}
