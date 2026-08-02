package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aek {
    public static final aek a;
    public static final aek b;
    public static final aek c;
    public static final aek d;
    public static final aek e;
    private static final /* synthetic */ aek[] f;

    static {
        aek aekVar = new aek("DESTROYED", 0);
        a = aekVar;
        aek aekVar2 = new aek("INITIALIZED", 1);
        b = aekVar2;
        aek aekVar3 = new aek("CREATED", 2);
        c = aekVar3;
        aek aekVar4 = new aek("STARTED", 3);
        d = aekVar4;
        aek aekVar5 = new aek("RESUMED", 4);
        e = aekVar5;
        aek[] aekVarArr = {aekVar, aekVar2, aekVar3, aekVar4, aekVar5};
        f = aekVarArr;
        ixf.k(aekVarArr);
    }

    public static aek[] values() {
        return (aek[]) f.clone();
    }

    public final boolean a(aek aekVar) {
        aekVar.getClass();
        return compareTo(aekVar) >= 0;
    }
}
