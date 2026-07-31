package R1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f4145d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f4146e;

    static {
        d dVar = new d("WARNING", 0);
        f4145d = dVar;
        f4146e = new d[]{dVar, new d("ERROR", 1), new d("HIDDEN", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4146e.clone();
    }
}
