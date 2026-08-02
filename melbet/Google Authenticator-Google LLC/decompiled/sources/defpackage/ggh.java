package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ggh {
    public static final ggh a;
    public static final ggh b;
    public static final ggh c;
    public static final ggh d;
    private static final /* synthetic */ ggh[] e;

    static {
        ggh gghVar = new ggh("DEVICE", 0);
        a = gghVar;
        ggh gghVar2 = new ggh("USER", 1);
        b = gghVar2;
        ggh gghVar3 = new ggh("UI_DEVICE", 2);
        c = gghVar3;
        ggh gghVar4 = new ggh("UI_USER", 3);
        d = gghVar4;
        ggh[] gghVarArr = {gghVar, gghVar2, gghVar3, gghVar4};
        e = gghVarArr;
        ixf.k(gghVarArr);
    }

    public static ggh[] values() {
        return (ggh[]) e.clone();
    }
}
