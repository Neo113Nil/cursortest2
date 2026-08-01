package s7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: d, reason: collision with root package name */
    public static final v3 f9062d;

    /* renamed from: e, reason: collision with root package name */
    public static final v3 f9063e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ v3[] f9064i;

    static {
        v3 v3Var = new v3("CONSENT", 0);
        f9062d = v3Var;
        v3 v3Var2 = new v3("LEGITIMATE_INTEREST", 1);
        v3 v3Var3 = new v3("FLEXIBLE_CONSENT", 2);
        v3 v3Var4 = new v3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f9063e = v3Var4;
        f9064i = new v3[]{v3Var, v3Var2, v3Var3, v3Var4};
    }

    public static v3[] values() {
        return (v3[]) f9064i.clone();
    }
}
