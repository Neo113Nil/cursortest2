package i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final r f4626d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f4627e;

    /* renamed from: i, reason: collision with root package name */
    public static final r f4628i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ r[] f4629r;

    static {
        r rVar = new r("Active", 0);
        f4626d = rVar;
        r rVar2 = new r("ActiveParent", 1);
        f4627e = rVar2;
        r rVar3 = new r("Captured", 2);
        r rVar4 = new r("Inactive", 3);
        f4628i = rVar4;
        f4629r = new r[]{rVar, rVar2, rVar3, rVar4};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f4629r.clone();
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
                a2.r.p();
                return false;
            }
        }
        return true;
    }
}
