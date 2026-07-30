package X0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f2851d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f2852e;

    /* renamed from: i, reason: collision with root package name */
    public static final d f2853i;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ d[] f2854l;

    static {
        d dVar = new d("DEFAULT", 0);
        f2851d = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f2852e = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f2853i = dVar3;
        f2854l = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2854l.clone();
    }
}
