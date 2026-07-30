package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f6657f;

    /* renamed from: g, reason: collision with root package name */
    public static final j0 f6658g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ j0[] f6659h;

    static {
        j0 j0Var = new j0("Vertical", 0);
        f6657f = j0Var;
        j0 j0Var2 = new j0("Horizontal", 1);
        f6658g = j0Var2;
        f6659h = new j0[]{j0Var, j0Var2};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f6659h.clone();
    }
}
