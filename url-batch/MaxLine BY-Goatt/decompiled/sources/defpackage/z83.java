package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z83 {
    public static final z83 m;
    public static final z83 n;
    public static final z83 o;
    public static final z83 p;
    public static final z83 q;
    public static final z83 r;
    public static final z83 s;
    public static final z83 t;
    public static final z83 u;
    public static final /* synthetic */ z83[] v;

    static {
        z83 z83Var = new z83("INT", 0);
        m = z83Var;
        z83 z83Var2 = new z83("LONG", 1);
        n = z83Var2;
        z83 z83Var3 = new z83("FLOAT", 2);
        o = z83Var3;
        z83 z83Var4 = new z83("DOUBLE", 3);
        p = z83Var4;
        z83 z83Var5 = new z83("BOOLEAN", 4);
        q = z83Var5;
        z83 z83Var6 = new z83("STRING", 5);
        r = z83Var6;
        cr crVar = er.n;
        z83 z83Var7 = new z83("BYTE_STRING", 6);
        s = z83Var7;
        z83 z83Var8 = new z83("ENUM", 7);
        t = z83Var8;
        z83 z83Var9 = new z83("MESSAGE", 8);
        u = z83Var9;
        v = new z83[]{z83Var, z83Var2, z83Var3, z83Var4, z83Var5, z83Var6, z83Var7, z83Var8, z83Var9};
    }

    public static z83 valueOf(String str) {
        return (z83) Enum.valueOf(z83.class, str);
    }

    public static z83[] values() {
        return (z83[]) v.clone();
    }
}
