package U0;

import R0.AbstractC0068a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f1042b;

    /* renamed from: c, reason: collision with root package name */
    public static final A.j f1043c;

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f1044d;

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f1045e;

    /* renamed from: a, reason: collision with root package name */
    public static final int f1041a = AbstractC0068a.l("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);

    /* renamed from: f, reason: collision with root package name */
    public static final int f1046f = AbstractC0068a.l("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    static {
        int i2 = 11;
        f1042b = new A.j(i2, "PERMIT");
        f1043c = new A.j(i2, "TAKEN");
        f1044d = new A.j(i2, "BROKEN");
        f1045e = new A.j(i2, "CANCELLED");
    }
}
