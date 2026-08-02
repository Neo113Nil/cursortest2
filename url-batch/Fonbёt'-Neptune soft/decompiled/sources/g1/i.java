package g1;

import B.m;
import d1.AbstractC0184a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static final m f2240b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f2241c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f2242d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f2243e;

    /* renamed from: a, reason: collision with root package name */
    public static final int f2239a = AbstractC0184a.k("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);

    /* renamed from: f, reason: collision with root package name */
    public static final int f2244f = AbstractC0184a.k("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    static {
        int i2 = 19;
        f2240b = new m(i2, "PERMIT");
        f2241c = new m(i2, "TAKEN");
        f2242d = new m(i2, "BROKEN");
        f2243e = new m(i2, "CANCELLED");
    }
}
