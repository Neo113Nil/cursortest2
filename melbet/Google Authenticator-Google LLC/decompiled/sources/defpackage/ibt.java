package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ibt {
    public static final ibt a;
    public static final ibt b;
    public static final ibt c;
    private static final /* synthetic */ ibt[] d;

    static {
        ibt ibtVar = new ibt("DEFAULT", 0);
        a = ibtVar;
        ibt ibtVar2 = new ibt("SIGNED", 1);
        b = ibtVar2;
        ibt ibtVar3 = new ibt("FIXED", 2);
        c = ibtVar3;
        d = new ibt[]{ibtVar, ibtVar2, ibtVar3};
    }

    public static ibt[] values() {
        return (ibt[]) d.clone();
    }
}
