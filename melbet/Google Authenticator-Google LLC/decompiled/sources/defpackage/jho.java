package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jho {
    public static final jho a;
    public static final jho b;
    public static final jho c;
    public static final jho d;
    public static final jho e;
    public static final jho f;
    private static final /* synthetic */ jho[] g;

    static {
        jho jhoVar = new jho("NONE", 0);
        a = jhoVar;
        jho jhoVar2 = new jho("TIER_10", 1);
        b = jhoVar2;
        jho jhoVar3 = new jho("TIER_20", 2);
        c = jhoVar3;
        jho jhoVar4 = new jho("TIER_30", 3);
        d = jhoVar4;
        jho jhoVar5 = new jho("TIER_40", 4);
        e = jhoVar5;
        jho jhoVar6 = new jho("TIER_50", 5);
        f = jhoVar6;
        jho[] jhoVarArr = {jhoVar, jhoVar2, jhoVar3, jhoVar4, jhoVar5, jhoVar6};
        g = jhoVarArr;
        ixf.k(jhoVarArr);
    }

    public static jho[] values() {
        return (jho[]) g.clone();
    }

    public final int a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return 2;
        }
        if (ordinal == 4 || ordinal == 5) {
            return 3;
        }
        throw new koj();
    }
}
