package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class tc0 {
    public static final lm b;
    public static final lm c;
    public static final lm d;
    public static final lm e;
    public static final int a = xc0.h("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 12);
    public static final int f = xc0.h("kotlinx.coroutines.semaphore.segmentSize", 16, 12);

    static {
        int i = 1;
        b = new lm("PERMIT", i);
        c = new lm("TAKEN", i);
        d = new lm("BROKEN", i);
        e = new lm("CANCELLED", i);
    }
}
