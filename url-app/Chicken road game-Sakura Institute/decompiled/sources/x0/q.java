package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final q f9628f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f9629g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f9630h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ q[] f9631i;

    static {
        q qVar = new q("Active", 0);
        f9628f = qVar;
        q qVar2 = new q("ActiveParent", 1);
        f9629g = qVar2;
        q qVar3 = new q("Captured", 2);
        q qVar4 = new q("Inactive", 3);
        f9630h = qVar4;
        f9631i = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f9631i.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                throw new b4.c();
            }
        }
        return true;
    }
}
