package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yc1 {
    private static final /* synthetic */ fi0 $ENTRIES;
    private static final /* synthetic */ yc1[] $VALUES;
    public static final wc1 Companion;
    public static final yc1 ON_ANY;
    public static final yc1 ON_CREATE;
    public static final yc1 ON_DESTROY;
    public static final yc1 ON_PAUSE;
    public static final yc1 ON_RESUME;
    public static final yc1 ON_START;
    public static final yc1 ON_STOP;

    static {
        yc1 yc1Var = new yc1("ON_CREATE", 0);
        ON_CREATE = yc1Var;
        yc1 yc1Var2 = new yc1("ON_START", 1);
        ON_START = yc1Var2;
        yc1 yc1Var3 = new yc1("ON_RESUME", 2);
        ON_RESUME = yc1Var3;
        yc1 yc1Var4 = new yc1("ON_PAUSE", 3);
        ON_PAUSE = yc1Var4;
        yc1 yc1Var5 = new yc1("ON_STOP", 4);
        ON_STOP = yc1Var5;
        yc1 yc1Var6 = new yc1("ON_DESTROY", 5);
        ON_DESTROY = yc1Var6;
        yc1 yc1Var7 = new yc1("ON_ANY", 6);
        ON_ANY = yc1Var7;
        yc1[] yc1VarArr = {yc1Var, yc1Var2, yc1Var3, yc1Var4, yc1Var5, yc1Var6, yc1Var7};
        $VALUES = yc1VarArr;
        $ENTRIES = new gi0(yc1VarArr);
        Companion = new wc1();
    }

    public static yc1 valueOf(String str) {
        return (yc1) Enum.valueOf(yc1.class, str);
    }

    public static yc1[] values() {
        return (yc1[]) $VALUES.clone();
    }

    public final zc1 a() {
        switch (xc1.a[ordinal()]) {
            case 1:
            case 2:
                return zc1.o;
            case 3:
            case 4:
                return zc1.p;
            case 5:
                return zc1.q;
            case 6:
                return zc1.m;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                a.b();
                return null;
        }
    }
}
