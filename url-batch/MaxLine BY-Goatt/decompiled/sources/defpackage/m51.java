package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m51 {
    public static final m51 m;
    public static final m51 n;
    public static final m51 o;
    public static final m51 p;
    public static final m51 q;
    public static final m51 r;
    public static final m51 s;
    public static final m51 t;
    public static final m51 u;
    public static final m51 v;
    public static final /* synthetic */ m51[] w;

    static {
        m51 m51Var = new m51("VOID", 0);
        m = m51Var;
        m51 m51Var2 = new m51("INT", 1);
        n = m51Var2;
        m51 m51Var3 = new m51("LONG", 2);
        o = m51Var3;
        m51 m51Var4 = new m51("FLOAT", 3);
        p = m51Var4;
        m51 m51Var5 = new m51("DOUBLE", 4);
        q = m51Var5;
        m51 m51Var6 = new m51("BOOLEAN", 5);
        r = m51Var6;
        m51 m51Var7 = new m51("STRING", 6);
        s = m51Var7;
        cr crVar = er.n;
        m51 m51Var8 = new m51("BYTE_STRING", 7);
        t = m51Var8;
        m51 m51Var9 = new m51("ENUM", 8);
        u = m51Var9;
        m51 m51Var10 = new m51("MESSAGE", 9);
        v = m51Var10;
        w = new m51[]{m51Var, m51Var2, m51Var3, m51Var4, m51Var5, m51Var6, m51Var7, m51Var8, m51Var9, m51Var10};
    }

    public static m51 valueOf(String str) {
        return (m51) Enum.valueOf(m51.class, str);
    }

    public static m51[] values() {
        return (m51[]) w.clone();
    }
}
