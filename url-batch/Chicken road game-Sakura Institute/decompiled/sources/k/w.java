package k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: f, reason: collision with root package name */
    public static final w f5278f;

    /* renamed from: g, reason: collision with root package name */
    public static final w f5279g;

    /* renamed from: h, reason: collision with root package name */
    public static final w f5280h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w[] f5281i;

    static {
        w wVar = new w("PreEnter", 0);
        f5278f = wVar;
        w wVar2 = new w("Visible", 1);
        f5279g = wVar2;
        w wVar3 = new w("PostExit", 2);
        f5280h = wVar3;
        f5281i = new w[]{wVar, wVar2, wVar3};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f5281i.clone();
    }
}
