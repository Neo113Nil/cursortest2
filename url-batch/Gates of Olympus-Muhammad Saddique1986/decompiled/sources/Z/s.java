package Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f4702d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f4703e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f4704f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ s[] f4705g;

    static {
        s sVar = new s("Active", 0);
        f4702d = sVar;
        s sVar2 = new s("ActiveParent", 1);
        f4703e = sVar2;
        s sVar3 = new s("Captured", 2);
        s sVar4 = new s("Inactive", 3);
        f4704f = sVar4;
        f4705g = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f4705g.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                throw new C1.c();
            }
        }
        return false;
    }
}
