package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final m f2091d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f2092e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f2093f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f2094g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ m[] f2095h;

    static {
        m mVar = new m("Active", 0);
        f2091d = mVar;
        m mVar2 = new m("ActiveParent", 1);
        f2092e = mVar2;
        m mVar3 = new m("Captured", 2);
        f2093f = mVar3;
        m mVar4 = new m("Inactive", 3);
        f2094g = mVar4;
        f2095h = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f2095h.clone();
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
                throw new a5.c();
            }
        }
        return true;
    }
}
