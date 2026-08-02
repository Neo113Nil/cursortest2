package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hoa {
    public static final hoa a;
    public static final hoa b;
    public static final hoa c;
    public static final hoa d;
    private static final /* synthetic */ hoa[] e;

    static {
        hoa hoaVar = new hoa("BOOLEAN", 0);
        a = hoaVar;
        hoa hoaVar2 = new hoa("STRING", 1);
        b = hoaVar2;
        hoa hoaVar3 = new hoa("LONG", 2);
        c = hoaVar3;
        hoa hoaVar4 = new hoa("DOUBLE", 3);
        d = hoaVar4;
        e = new hoa[]{hoaVar, hoaVar2, hoaVar3, hoaVar4};
    }

    public static hoa a(Object obj) {
        if (obj instanceof String) {
            return b;
        }
        if (obj instanceof Boolean) {
            return a;
        }
        if (obj instanceof Long) {
            return c;
        }
        if (obj instanceof Double) {
            return d;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public static hoa[] values() {
        return (hoa[]) e.clone();
    }
}
