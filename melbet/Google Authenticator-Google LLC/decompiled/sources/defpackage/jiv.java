package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiv {
    public static final jiv a;
    public static final jiv b;
    public static final /* synthetic */ krb c;
    private static final /* synthetic */ jiv[] d;

    static {
        jiv jivVar = new jiv("DISMISS", 0);
        a = jivVar;
        jiv jivVar2 = new jiv("NO_DISMISS", 1);
        b = jivVar2;
        jiv[] jivVarArr = {jivVar, jivVar2};
        d = jivVarArr;
        c = ixf.k(jivVarArr);
    }

    public static jiv[] values() {
        return (jiv[]) d.clone();
    }
}
