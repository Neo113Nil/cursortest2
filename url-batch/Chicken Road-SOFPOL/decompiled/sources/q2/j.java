package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f6052d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f6053e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j[] f6054f;

    static {
        j jVar = new j("Ltr", 0);
        f6052d = jVar;
        j jVar2 = new j("Rtl", 1);
        f6053e = jVar2;
        f6054f = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f6054f.clone();
    }
}
