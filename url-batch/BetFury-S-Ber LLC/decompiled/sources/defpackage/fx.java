package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fx {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ fx[] $VALUES;
    public static final dx Companion;
    public static final fx ON_CREATE = new fx("ON_CREATE", 0);
    public static final fx ON_START = new fx("ON_START", 1);
    public static final fx ON_RESUME = new fx("ON_RESUME", 2);
    public static final fx ON_PAUSE = new fx("ON_PAUSE", 3);
    public static final fx ON_STOP = new fx("ON_STOP", 4);
    public static final fx ON_DESTROY = new fx("ON_DESTROY", 5);
    public static final fx ON_ANY = new fx("ON_ANY", 6);

    private static final /* synthetic */ fx[] $values() {
        return new fx[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
    }

    static {
        fx[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
        Companion = new dx();
    }

    private fx(String str, int i) {
    }

    public static final fx downFrom(gx gxVar) {
        Companion.getClass();
        return dx.a(gxVar);
    }

    public static final fx downTo(gx gxVar) {
        Companion.getClass();
        gxVar.getClass();
        int i = cx.a[gxVar.ordinal()];
        if (i == 1) {
            return ON_STOP;
        }
        if (i == 2) {
            return ON_PAUSE;
        }
        if (i != 4) {
            return null;
        }
        return ON_DESTROY;
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static final fx upFrom(gx gxVar) {
        Companion.getClass();
        return dx.b(gxVar);
    }

    public static final fx upTo(gx gxVar) {
        Companion.getClass();
        gxVar.getClass();
        int i = cx.a[gxVar.ordinal()];
        if (i == 1) {
            return ON_CREATE;
        }
        if (i == 2) {
            return ON_START;
        }
        if (i != 3) {
            return null;
        }
        return ON_RESUME;
    }

    public static fx valueOf(String str) {
        return (fx) Enum.valueOf(fx.class, str);
    }

    public static fx[] values() {
        return (fx[]) $VALUES.clone();
    }

    public final gx getTargetState() {
        switch (ex.a[ordinal()]) {
            case 1:
            case 2:
                return gx.CREATED;
            case 3:
            case 4:
                return gx.STARTED;
            case 5:
                return gx.RESUMED;
            case 6:
                return gx.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new md();
        }
    }
}
