package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gq {
    private static final /* synthetic */ gq[] $VALUES;
    public static final eq Companion;
    public static final gq ON_ANY;
    public static final gq ON_CREATE;
    public static final gq ON_DESTROY;
    public static final gq ON_PAUSE;
    public static final gq ON_RESUME;
    public static final gq ON_START;
    public static final gq ON_STOP;

    static {
        gq gqVar = new gq("ON_CREATE", 0);
        ON_CREATE = gqVar;
        gq gqVar2 = new gq("ON_START", 1);
        ON_START = gqVar2;
        gq gqVar3 = new gq("ON_RESUME", 2);
        ON_RESUME = gqVar3;
        gq gqVar4 = new gq("ON_PAUSE", 3);
        ON_PAUSE = gqVar4;
        gq gqVar5 = new gq("ON_STOP", 4);
        ON_STOP = gqVar5;
        gq gqVar6 = new gq("ON_DESTROY", 5);
        ON_DESTROY = gqVar6;
        gq gqVar7 = new gq("ON_ANY", 6);
        ON_ANY = gqVar7;
        $VALUES = new gq[]{gqVar, gqVar2, gqVar3, gqVar4, gqVar5, gqVar6, gqVar7};
        Companion = new eq();
    }

    public static gq valueOf(String str) {
        return (gq) Enum.valueOf(gq.class, str);
    }

    public static gq[] values() {
        return (gq[]) $VALUES.clone();
    }

    public final hq a() {
        switch (fq.a[ordinal()]) {
            case 1:
            case 2:
                return hq.h;
            case 3:
            case 4:
                return hq.i;
            case BottomSheetBehavior.STATE_HIDDEN /* 5 */:
                return hq.j;
            case BottomSheetBehavior.STATE_HALF_EXPANDED /* 6 */:
                return hq.f;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
