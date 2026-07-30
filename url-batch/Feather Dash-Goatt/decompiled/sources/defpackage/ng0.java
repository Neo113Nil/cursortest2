package defpackage;

import com.appsflyer.internal.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ng0 {
    private static final /* synthetic */ aw $ENTRIES;
    private static final /* synthetic */ ng0[] $VALUES;
    public static final lg0 Companion;
    public static final ng0 ON_ANY;
    public static final ng0 ON_CREATE;
    public static final ng0 ON_DESTROY;
    public static final ng0 ON_PAUSE;
    public static final ng0 ON_RESUME;
    public static final ng0 ON_START;
    public static final ng0 ON_STOP;

    static {
        ng0 ng0Var = new ng0("ON_CREATE", 0);
        ON_CREATE = ng0Var;
        ng0 ng0Var2 = new ng0("ON_START", 1);
        ON_START = ng0Var2;
        ng0 ng0Var3 = new ng0("ON_RESUME", 2);
        ON_RESUME = ng0Var3;
        ng0 ng0Var4 = new ng0("ON_PAUSE", 3);
        ON_PAUSE = ng0Var4;
        ng0 ng0Var5 = new ng0("ON_STOP", 4);
        ON_STOP = ng0Var5;
        ng0 ng0Var6 = new ng0("ON_DESTROY", 5);
        ON_DESTROY = ng0Var6;
        ng0 ng0Var7 = new ng0("ON_ANY", 6);
        ON_ANY = ng0Var7;
        ng0[] ng0VarArr = {ng0Var, ng0Var2, ng0Var3, ng0Var4, ng0Var5, ng0Var6, ng0Var7};
        $VALUES = ng0VarArr;
        $ENTRIES = new bw(ng0VarArr);
        Companion = new lg0();
    }

    public static ng0 valueOf(String str) {
        return (ng0) Enum.valueOf(ng0.class, str);
    }

    public static ng0[] values() {
        return (ng0[]) $VALUES.clone();
    }

    public final og0 a() {
        switch (mg0.a[ordinal()]) {
            case 1:
            case 2:
                return og0.g;
            case 3:
            case 4:
                return og0.h;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return og0.i;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return og0.d;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                l.a();
                return null;
        }
    }
}
