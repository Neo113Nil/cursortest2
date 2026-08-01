package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: d, reason: collision with root package name */
    public static final b2 f1499d;

    /* renamed from: e, reason: collision with root package name */
    public static final b2 f1500e;

    /* renamed from: i, reason: collision with root package name */
    public static final b2 f1501i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ b2[] f1502r;

    static {
        b2 b2Var = new b2("ContinueTraversal", 0);
        f1499d = b2Var;
        b2 b2Var2 = new b2("SkipSubtreeAndContinueTraversal", 1);
        f1500e = b2Var2;
        b2 b2Var3 = new b2("CancelTraversal", 2);
        f1501i = b2Var3;
        f1502r = new b2[]{b2Var, b2Var2, b2Var3};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) f1502r.clone();
    }
}
