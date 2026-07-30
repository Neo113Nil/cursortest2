package W1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final d f3419n;

    /* renamed from: u, reason: collision with root package name */
    public static final d f3420u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f3421v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d[] f3422w;

    static {
        d dVar = new d("DEFAULT", 0);
        f3419n = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f3420u = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f3421v = dVar3;
        f3422w = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3422w.clone();
    }
}
