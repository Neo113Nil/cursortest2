package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akg {
    public static final akg a;
    public static final akg b;
    public static final akg c;
    private static final /* synthetic */ akg[] d;

    static {
        akg akgVar = new akg("DEFERRED", 0);
        a = akgVar;
        akg akgVar2 = new akg("IMMEDIATE", 1);
        b = akgVar2;
        akg akgVar3 = new akg("EXCLUSIVE", 2);
        c = akgVar3;
        akg[] akgVarArr = {akgVar, akgVar2, akgVar3};
        d = akgVarArr;
        ixf.k(akgVarArr);
    }

    public static akg[] values() {
        return (akg[]) d.clone();
    }
}
