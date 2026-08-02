package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccn {
    public static final ccn a;
    public static final ccn b;
    public static final ccn c;
    private static final /* synthetic */ ccn[] d;

    static {
        ccn ccnVar = new ccn("DEFAULT", 0);
        a = ccnVar;
        ccn ccnVar2 = new ccn("VERY_LOW", 1);
        b = ccnVar2;
        ccn ccnVar3 = new ccn("HIGHEST", 2);
        c = ccnVar3;
        d = new ccn[]{ccnVar, ccnVar2, ccnVar3};
    }

    public static ccn[] values() {
        return (ccn[]) d.clone();
    }
}
