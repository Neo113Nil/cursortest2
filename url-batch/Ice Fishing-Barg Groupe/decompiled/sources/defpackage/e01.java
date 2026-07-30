package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e01 {
    private static final /* synthetic */ k60 $ENTRIES;
    private static final /* synthetic */ e01[] $VALUES;
    public static final c01 Companion;
    public static final e01 ON_ANY;
    public static final e01 ON_CREATE;
    public static final e01 ON_DESTROY;
    public static final e01 ON_PAUSE;
    public static final e01 ON_RESUME;
    public static final e01 ON_START;
    public static final e01 ON_STOP;

    static {
        e01 e01Var = new e01("ON_CREATE", 0);
        ON_CREATE = e01Var;
        e01 e01Var2 = new e01("ON_START", 1);
        ON_START = e01Var2;
        e01 e01Var3 = new e01("ON_RESUME", 2);
        ON_RESUME = e01Var3;
        e01 e01Var4 = new e01("ON_PAUSE", 3);
        ON_PAUSE = e01Var4;
        e01 e01Var5 = new e01("ON_STOP", 4);
        ON_STOP = e01Var5;
        e01 e01Var6 = new e01("ON_DESTROY", 5);
        ON_DESTROY = e01Var6;
        e01 e01Var7 = new e01("ON_ANY", 6);
        ON_ANY = e01Var7;
        e01[] e01VarArr = {e01Var, e01Var2, e01Var3, e01Var4, e01Var5, e01Var6, e01Var7};
        $VALUES = e01VarArr;
        $ENTRIES = new l60(e01VarArr);
        Companion = new c01();
    }

    public static e01 valueOf(String str) {
        return (e01) Enum.valueOf(e01.class, str);
    }

    public static e01[] values() {
        return (e01[]) $VALUES.clone();
    }

    public final f01 PxuCJdSBwIXG() {
        switch (d01.PxuCJdSBwIXG[ordinal()]) {
            case 1:
            case 2:
                return f01.wdg6QnbFHrFF;
            case 3:
            case 4:
                return f01.dgRBjINgWbAK;
            case 5:
                return f01.x50lh2ztY7Y5;
            case 6:
                return f01.rtx2ld2ELZv4;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                u9.gPXPFXrUH4XX();
                return null;
        }
    }
}
