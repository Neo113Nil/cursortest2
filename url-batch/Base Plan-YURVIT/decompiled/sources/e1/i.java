package e1;

import B0.E;
import b1.AbstractC0115a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static final E f1882b;

    /* renamed from: c, reason: collision with root package name */
    public static final E f1883c;

    /* renamed from: d, reason: collision with root package name */
    public static final E f1884d;

    /* renamed from: e, reason: collision with root package name */
    public static final E f1885e;

    /* renamed from: a, reason: collision with root package name */
    public static final int f1881a = AbstractC0115a.j("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 12);

    /* renamed from: f, reason: collision with root package name */
    public static final int f1886f = AbstractC0115a.j("kotlinx.coroutines.semaphore.segmentSize", 16, 12);

    static {
        int i2 = 14;
        f1882b = new E(i2, "PERMIT");
        f1883c = new E(i2, "TAKEN");
        f1884d = new E(i2, "BROKEN");
        f1885e = new E(i2, "CANCELLED");
    }
}
