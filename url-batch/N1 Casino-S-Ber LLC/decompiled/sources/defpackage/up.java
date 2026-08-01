package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class up {
    private static final /* synthetic */ up[] $VALUES;
    public static final sp Companion;
    public static final up ON_ANY;
    public static final up ON_CREATE;
    public static final up ON_DESTROY;
    public static final up ON_PAUSE;
    public static final up ON_RESUME;
    public static final up ON_START;
    public static final up ON_STOP;

    static {
        up upVar = new up("ON_CREATE", 0);
        ON_CREATE = upVar;
        up upVar2 = new up("ON_START", 1);
        ON_START = upVar2;
        up upVar3 = new up("ON_RESUME", 2);
        ON_RESUME = upVar3;
        up upVar4 = new up("ON_PAUSE", 3);
        ON_PAUSE = upVar4;
        up upVar5 = new up("ON_STOP", 4);
        ON_STOP = upVar5;
        up upVar6 = new up("ON_DESTROY", 5);
        ON_DESTROY = upVar6;
        up upVar7 = new up("ON_ANY", 6);
        ON_ANY = upVar7;
        $VALUES = new up[]{upVar, upVar2, upVar3, upVar4, upVar5, upVar6, upVar7};
        Companion = new sp();
    }

    public static up valueOf(String str) {
        return (up) Enum.valueOf(up.class, str);
    }

    public static up[] values() {
        return (up[]) $VALUES.clone();
    }

    public final vp a() {
        switch (tp.a[ordinal()]) {
            case 1:
            case 2:
                return vp.h;
            case 3:
            case 4:
                return vp.i;
            case 5:
                return vp.j;
            case 6:
                return vp.f;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
