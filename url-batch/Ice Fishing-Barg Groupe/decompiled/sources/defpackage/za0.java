package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class za0 {
    public static final za0 OPXfSBeufaJ8;
    public static final /* synthetic */ za0[] dgRBjINgWbAK;
    public static final za0 rtx2ld2ELZv4;
    public static final za0 wdg6QnbFHrFF;

    static {
        za0 za0Var = new za0("Active", 0);
        rtx2ld2ELZv4 = za0Var;
        za0 za0Var2 = new za0("ActiveParent", 1);
        OPXfSBeufaJ8 = za0Var2;
        za0 za0Var3 = new za0("Captured", 2);
        za0 za0Var4 = new za0("Inactive", 3);
        wdg6QnbFHrFF = za0Var4;
        dgRBjINgWbAK = new za0[]{za0Var, za0Var2, za0Var3, za0Var4};
    }

    public static za0 valueOf(String str) {
        return (za0) Enum.valueOf(za0.class, str);
    }

    public static za0[] values() {
        return (za0[]) dgRBjINgWbAK.clone();
    }

    public final boolean PxuCJdSBwIXG() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                u9.gPXPFXrUH4XX();
                return false;
            }
        }
        return true;
    }
}
