package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a0 f9183f;

    /* renamed from: g, reason: collision with root package name */
    public static final a0 f9184g;

    /* renamed from: h, reason: collision with root package name */
    public static final a0 f9185h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a0[] f9186i;

    static {
        a0 a0Var = new a0("None", 0);
        f9183f = a0Var;
        a0 a0Var2 = new a0("Selection", 1);
        f9184g = a0Var2;
        a0 a0Var3 = new a0("Cursor", 2);
        f9185h = a0Var3;
        f9186i = new a0[]{a0Var, a0Var2, a0Var3};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f9186i.clone();
    }
}
