package a1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f219d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f220e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j[] f221f;

    static {
        j jVar = new j("VIEW_APPEAR", 0);
        f219d = jVar;
        j jVar2 = new j("VIEW_DISAPPEAR", 1);
        f220e = jVar2;
        f221f = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f221f.clone();
    }
}
