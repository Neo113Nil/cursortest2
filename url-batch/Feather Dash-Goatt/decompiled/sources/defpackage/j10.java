package defpackage;

import com.appsflyer.internal.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j10 {
    public static final j10 d;
    public static final j10 e;
    public static final j10 g;
    public static final /* synthetic */ j10[] h;

    static {
        j10 j10Var = new j10("Active", 0);
        d = j10Var;
        j10 j10Var2 = new j10("ActiveParent", 1);
        e = j10Var2;
        j10 j10Var3 = new j10("Captured", 2);
        j10 j10Var4 = new j10("Inactive", 3);
        g = j10Var4;
        h = new j10[]{j10Var, j10Var2, j10Var3, j10Var4};
    }

    public static j10 valueOf(String str) {
        return (j10) Enum.valueOf(j10.class, str);
    }

    public static j10[] values() {
        return (j10[]) h.clone();
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
                l.a();
                return false;
            }
        }
        return true;
    }
}
