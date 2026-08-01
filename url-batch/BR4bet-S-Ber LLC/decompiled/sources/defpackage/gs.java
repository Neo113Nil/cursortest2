package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class gs {
    private static final /* synthetic */ gs[] $VALUES;
    public static final es Companion;
    public static final gs ON_ANY;
    public static final gs ON_CREATE;
    public static final gs ON_DESTROY;
    public static final gs ON_PAUSE;
    public static final gs ON_RESUME;
    public static final gs ON_START;
    public static final gs ON_STOP;

    static {
        gs gsVar = new gs("ON_CREATE", 0);
        ON_CREATE = gsVar;
        gs gsVar2 = new gs("ON_START", 1);
        ON_START = gsVar2;
        gs gsVar3 = new gs("ON_RESUME", 2);
        ON_RESUME = gsVar3;
        gs gsVar4 = new gs("ON_PAUSE", 3);
        ON_PAUSE = gsVar4;
        gs gsVar5 = new gs("ON_STOP", 4);
        ON_STOP = gsVar5;
        gs gsVar6 = new gs("ON_DESTROY", 5);
        ON_DESTROY = gsVar6;
        gs gsVar7 = new gs("ON_ANY", 6);
        ON_ANY = gsVar7;
        $VALUES = new gs[]{gsVar, gsVar2, gsVar3, gsVar4, gsVar5, gsVar6, gsVar7};
        Companion = new es();
    }

    public static gs valueOf(String str) {
        return (gs) Enum.valueOf(gs.class, str);
    }

    public static gs[] values() {
        return (gs[]) $VALUES.clone();
    }

    public final hs a() {
        switch (fs.a[ordinal()]) {
            case 1:
            case 2:
                return hs.h;
            case 3:
            case 4:
                return hs.i;
            case 5:
                return hs.j;
            case 6:
                return hs.f;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
