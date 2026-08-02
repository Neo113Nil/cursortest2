package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class x2 {
    public static final x2 a;
    public static final x2 b;
    public static final /* synthetic */ x2[] c;

    static {
        x2 x2Var = new x2("JPEG", 0);
        a = x2Var;
        x2 x2Var2 = new x2("PNG", 1);
        b = x2Var2;
        c = new x2[]{x2Var, x2Var2};
    }

    public static x2 valueOf(String str) {
        return (x2) Enum.valueOf(x2.class, str);
    }

    public static x2[] values() {
        return (x2[]) c.clone();
    }
}
