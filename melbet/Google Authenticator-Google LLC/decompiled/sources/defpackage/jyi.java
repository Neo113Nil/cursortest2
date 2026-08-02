package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyi {
    public static final jyi a;
    public static final jyi b;
    public static final jyi c;
    public static final jyi d;
    private static final /* synthetic */ jyi[] e;

    static {
        jyi jyiVar = new jyi("CT_UNKNOWN", 0);
        a = jyiVar;
        jyi jyiVar2 = new jyi("CT_INFO", 1);
        b = jyiVar2;
        jyi jyiVar3 = new jyi("CT_WARNING", 2);
        c = jyiVar3;
        jyi jyiVar4 = new jyi("CT_ERROR", 3);
        d = jyiVar4;
        e = new jyi[]{jyiVar, jyiVar2, jyiVar3, jyiVar4};
    }

    public static jyi[] values() {
        return (jyi[]) e.clone();
    }
}
