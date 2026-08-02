package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class v3 {
    public static final v3 a;
    public static final v3 b;
    public static final /* synthetic */ v3[] c;

    static {
        v3 v3Var = new v3("Yes", 0);
        a = v3Var;
        v3 v3Var2 = new v3("No", 1);
        b = v3Var2;
        c = new v3[]{v3Var, v3Var2};
    }

    public static v3 valueOf(String str) {
        return (v3) Enum.valueOf(v3.class, str);
    }

    public static v3[] values() {
        return (v3[]) c.clone();
    }
}
