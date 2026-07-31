package M0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f2775d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f2776e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j[] f2777f;

    static {
        j jVar = new j("Ltr", 0);
        f2775d = jVar;
        j jVar2 = new j("Rtl", 1);
        f2776e = jVar2;
        f2777f = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f2777f.clone();
    }
}
