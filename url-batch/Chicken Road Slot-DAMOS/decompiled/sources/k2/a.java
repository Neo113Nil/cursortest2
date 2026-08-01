package k2;

import hd.a0;
import hd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f5358a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f5359b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f5360c;

    static {
        z zVar = a0.f4495e;
        f5358a = (1023 << 50) ^ (-1);
        f5359b = (-1) ^ (33554431 << 25);
        long j = 33554431;
        f5360c = j | (Math.min(0, 1023) << 50) | (j << 25);
    }
}
