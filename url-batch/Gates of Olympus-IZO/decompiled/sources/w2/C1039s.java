package w2;

import kotlinx.serialization.descriptors.SerialDescriptor;
import u0.C0986n;

/* renamed from: w2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039s {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f8696e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f8697a;

    /* renamed from: b, reason: collision with root package name */
    public final C0986n f8698b;

    /* renamed from: c, reason: collision with root package name */
    public long f8699c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f8700d;

    public C1039s(SerialDescriptor serialDescriptor, C0986n c0986n) {
        Z1.i.f(serialDescriptor, "descriptor");
        this.f8697a = serialDescriptor;
        this.f8698b = c0986n;
        int l3 = serialDescriptor.l();
        if (l3 <= 64) {
            this.f8699c = l3 != 64 ? (-1) << l3 : 0L;
            this.f8700d = f8696e;
            return;
        }
        this.f8699c = 0L;
        int i3 = (l3 - 1) >>> 6;
        long[] jArr = new long[i3];
        if ((l3 & 63) != 0) {
            jArr[i3 - 1] = (-1) << l3;
        }
        this.f8700d = jArr;
    }
}
