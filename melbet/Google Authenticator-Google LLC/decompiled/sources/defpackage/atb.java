package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atb {
    public static final atb a;
    public static final atb b;
    public static final atb c;
    public static final atb d;
    public static final atb e;
    public static final atb f;
    private static final /* synthetic */ atb[] g;

    static {
        atb atbVar = new atb("ENQUEUED", 0);
        a = atbVar;
        atb atbVar2 = new atb("RUNNING", 1);
        b = atbVar2;
        atb atbVar3 = new atb("SUCCEEDED", 2);
        c = atbVar3;
        atb atbVar4 = new atb("FAILED", 3);
        d = atbVar4;
        atb atbVar5 = new atb("BLOCKED", 4);
        e = atbVar5;
        atb atbVar6 = new atb("CANCELLED", 5);
        f = atbVar6;
        atb[] atbVarArr = {atbVar, atbVar2, atbVar3, atbVar4, atbVar5, atbVar6};
        g = atbVarArr;
        ixf.k(atbVarArr);
    }

    public static atb[] values() {
        return (atb[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
