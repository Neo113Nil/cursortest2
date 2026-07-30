package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m60 {
    public static final m60 m;
    public static final m60 n;
    public static final m60 o;
    public static final m60 p;
    public static final /* synthetic */ m60[] q;

    static {
        m60 m60Var = new m60("MEMORY_CACHE", 0);
        m = m60Var;
        m60 m60Var2 = new m60("MEMORY", 1);
        n = m60Var2;
        m60 m60Var3 = new m60("DISK", 2);
        o = m60Var3;
        m60 m60Var4 = new m60("NETWORK", 3);
        p = m60Var4;
        q = new m60[]{m60Var, m60Var2, m60Var3, m60Var4};
    }

    public static m60 valueOf(String str) {
        return (m60) Enum.valueOf(m60.class, str);
    }

    public static m60[] values() {
        return (m60[]) q.clone();
    }
}
