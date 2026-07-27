package E;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final w f2260d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f2261e;

    /* JADX INFO: Fake field, exist only in values array */
    w EF0;

    static {
        w wVar = new w("Filled", 0);
        w wVar2 = new w("Outlined", 1);
        f2260d = wVar2;
        f2261e = new w[]{wVar, wVar2};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f2261e.clone();
    }
}
