package net.idrnd.face.iad.capture.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class y2 {
    public static final y2 a;
    public static final y2 b;
    public static final /* synthetic */ y2[] d;

    static {
        y2 y2Var = new y2("Normal", 0);
        a = y2Var;
        y2 y2Var2 = new y2("Small", 1);
        b = y2Var2;
        d = new y2[]{y2Var, y2Var2, new y2("DataCollecting", 2)};
    }

    public static y2 valueOf(String str) {
        return (y2) Enum.valueOf(y2.class, str);
    }

    public static y2[] values() {
        return (y2[]) d.clone();
    }
}
