package X;

import y2.C1338m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f4348d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f4349e;

    /* renamed from: i, reason: collision with root package name */
    public static final s f4350i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ s[] f4351j;

    static {
        s sVar = new s("Active", 0);
        f4348d = sVar;
        s sVar2 = new s("ActiveParent", 1);
        f4349e = sVar2;
        s sVar3 = new s("Captured", 2);
        s sVar4 = new s("Inactive", 3);
        f4350i = sVar4;
        f4351j = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f4351j.clone();
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
                throw new C1338m();
            }
        }
        return false;
    }
}
