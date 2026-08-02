package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class i0 {
    public static final i0 OP;
    public static final i0 SPLITERATOR;
    public static final i0 STREAM;
    public static final i0 TERMINAL_OP;
    public static final i0 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ i0[] a;

    static {
        i0 i0Var = new i0("SPLITERATOR", 0);
        SPLITERATOR = i0Var;
        i0 i0Var2 = new i0("STREAM", 1);
        STREAM = i0Var2;
        i0 i0Var3 = new i0("OP", 2);
        OP = i0Var3;
        i0 i0Var4 = new i0("TERMINAL_OP", 3);
        TERMINAL_OP = i0Var4;
        i0 i0Var5 = new i0("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = i0Var5;
        a = new i0[]{i0Var, i0Var2, i0Var3, i0Var4, i0Var5};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) a.clone();
    }
}
