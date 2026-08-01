package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dx {
    public static fx a(gx gxVar) {
        gxVar.getClass();
        int i = cx.a[gxVar.ordinal()];
        if (i == 1) {
            return fx.ON_DESTROY;
        }
        if (i == 2) {
            return fx.ON_STOP;
        }
        if (i != 3) {
            return null;
        }
        return fx.ON_PAUSE;
    }

    public static fx b(gx gxVar) {
        gxVar.getClass();
        int i = cx.a[gxVar.ordinal()];
        if (i == 1) {
            return fx.ON_START;
        }
        if (i == 2) {
            return fx.ON_RESUME;
        }
        if (i != 5) {
            return null;
        }
        return fx.ON_CREATE;
    }
}
