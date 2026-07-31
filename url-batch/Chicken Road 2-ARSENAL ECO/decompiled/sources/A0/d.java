package A0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final d f43f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f44g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f45h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d[] f46i;

    static {
        d dVar = new d("DEFAULT", 0);
        f43f = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f44g = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f45h = dVar3;
        f46i = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f46i.clone();
    }
}
