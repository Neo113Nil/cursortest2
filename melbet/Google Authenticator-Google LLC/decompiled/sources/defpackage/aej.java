package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aej {
    private static final /* synthetic */ krb $ENTRIES;
    private static final /* synthetic */ aej[] $VALUES;
    public static final aei Companion;
    public static final aej ON_ANY;
    public static final aej ON_CREATE;
    public static final aej ON_DESTROY;
    public static final aej ON_PAUSE;
    public static final aej ON_RESUME;
    public static final aej ON_START;
    public static final aej ON_STOP;

    static {
        aej aejVar = new aej("ON_CREATE", 0);
        ON_CREATE = aejVar;
        aej aejVar2 = new aej("ON_START", 1);
        ON_START = aejVar2;
        aej aejVar3 = new aej("ON_RESUME", 2);
        ON_RESUME = aejVar3;
        aej aejVar4 = new aej("ON_PAUSE", 3);
        ON_PAUSE = aejVar4;
        aej aejVar5 = new aej("ON_STOP", 4);
        ON_STOP = aejVar5;
        aej aejVar6 = new aej("ON_DESTROY", 5);
        ON_DESTROY = aejVar6;
        aej aejVar7 = new aej("ON_ANY", 6);
        ON_ANY = aejVar7;
        aej[] aejVarArr = {aejVar, aejVar2, aejVar3, aejVar4, aejVar5, aejVar6, aejVar7};
        $VALUES = aejVarArr;
        $ENTRIES = ixf.k(aejVarArr);
        Companion = new aei();
    }

    public static aej[] values() {
        return (aej[]) $VALUES.clone();
    }

    public final aek a() {
        switch (ordinal()) {
            case 0:
            case 4:
                return aek.c;
            case 1:
            case 3:
                return aek.d;
            case 2:
                return aek.e;
            case 5:
                return aek.a;
            case 6:
                toString();
                throw new IllegalArgumentException(toString().concat(" has no target state"));
            default:
                throw new koj();
        }
    }
}
