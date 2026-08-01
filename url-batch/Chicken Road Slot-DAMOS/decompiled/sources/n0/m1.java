package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final m1 f6757d;

    /* renamed from: e, reason: collision with root package name */
    public static final m1 f6758e;

    /* renamed from: i, reason: collision with root package name */
    public static final m1 f6759i;

    /* renamed from: r, reason: collision with root package name */
    public static final m1 f6760r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ m1[] f6761s;

    /* JADX INFO: Fake field, exist only in values array */
    m1 EF0;

    static {
        m1 m1Var = new m1("Invalid", 0);
        m1 m1Var2 = new m1("Cancelled", 1);
        f6757d = m1Var2;
        m1 m1Var3 = new m1("InitialPending", 2);
        m1 m1Var4 = new m1("RecomposePending", 3);
        f6758e = m1Var4;
        m1 m1Var5 = new m1("Recomposing", 4);
        f6759i = m1Var5;
        m1 m1Var6 = new m1("ApplyPending", 5);
        f6760r = m1Var6;
        f6761s = new m1[]{m1Var, m1Var2, m1Var3, m1Var4, m1Var5, m1Var6, new m1("Applied", 6)};
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) f6761s.clone();
    }
}
