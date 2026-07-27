package k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final w f7338d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f7339e;

    /* renamed from: i, reason: collision with root package name */
    public static final w f7340i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w[] f7341j;

    static {
        w wVar = new w("PreEnter", 0);
        f7338d = wVar;
        w wVar2 = new w("Visible", 1);
        f7339e = wVar2;
        w wVar3 = new w("PostExit", 2);
        f7340i = wVar3;
        f7341j = new w[]{wVar, wVar2, wVar3};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f7341j.clone();
    }
}
