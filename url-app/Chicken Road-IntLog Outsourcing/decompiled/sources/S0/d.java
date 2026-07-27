package S0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2741a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f2742b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f2743c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f2744d;

    static {
        d dVar = new d("DEFAULT", 0);
        f2741a = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f2742b = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f2743c = dVar3;
        f2744d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2744d.clone();
    }
}
