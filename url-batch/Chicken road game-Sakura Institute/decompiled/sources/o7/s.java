package o7;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f6939e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f6940a;

    /* renamed from: b, reason: collision with root package name */
    public final q7.d f6941b;

    /* renamed from: c, reason: collision with root package name */
    public long f6942c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f6943d;

    public s(SerialDescriptor serialDescriptor, q7.d dVar) {
        r6.k.f(serialDescriptor, "descriptor");
        this.f6940a = serialDescriptor;
        this.f6941b = dVar;
        int d8 = serialDescriptor.d();
        if (d8 <= 64) {
            this.f6942c = d8 != 64 ? (-1) << d8 : 0L;
            this.f6943d = f6939e;
            return;
        }
        this.f6942c = 0L;
        int i7 = (d8 - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((d8 & 63) != 0) {
            jArr[i7 - 1] = (-1) << d8;
        }
        this.f6943d = jArr;
    }
}
