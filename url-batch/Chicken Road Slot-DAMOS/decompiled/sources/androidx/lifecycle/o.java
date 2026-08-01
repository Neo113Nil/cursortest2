package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final m Companion;
    public static final o ON_ANY;
    public static final o ON_CREATE;
    public static final o ON_DESTROY;
    public static final o ON_PAUSE;
    public static final o ON_RESUME;
    public static final o ON_START;
    public static final o ON_STOP;

    static {
        o oVar = new o("ON_CREATE", 0);
        ON_CREATE = oVar;
        o oVar2 = new o("ON_START", 1);
        ON_START = oVar2;
        o oVar3 = new o("ON_RESUME", 2);
        ON_RESUME = oVar3;
        o oVar4 = new o("ON_PAUSE", 3);
        ON_PAUSE = oVar4;
        o oVar5 = new o("ON_STOP", 4);
        ON_STOP = oVar5;
        o oVar6 = new o("ON_DESTROY", 5);
        ON_DESTROY = oVar6;
        o oVar7 = new o("ON_ANY", 6);
        ON_ANY = oVar7;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7};
        $VALUES = oVarArr;
        $ENTRIES = new od.b(oVarArr);
        Companion = new m();
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final p a() {
        switch (n.f702a[ordinal()]) {
            case 1:
            case 2:
                return p.f709i;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return p.f710r;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return p.f711s;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return p.f707d;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                a2.r.p();
                return null;
        }
    }
}
