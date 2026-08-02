package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqp {
    public static final kqp a;
    public static final kqp b;
    public static final kqp c;
    private static final /* synthetic */ kqp[] d;

    static {
        kqp kqpVar = new kqp("COROUTINE_SUSPENDED", 0);
        a = kqpVar;
        kqp kqpVar2 = new kqp("UNDECIDED", 1);
        b = kqpVar2;
        kqp kqpVar3 = new kqp("RESUMED", 2);
        c = kqpVar3;
        kqp[] kqpVarArr = {kqpVar, kqpVar2, kqpVar3};
        d = kqpVarArr;
        ixf.k(kqpVarArr);
    }

    public static kqp[] values() {
        return (kqp[]) d.clone();
    }
}
