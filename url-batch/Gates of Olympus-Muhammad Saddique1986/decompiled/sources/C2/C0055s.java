package C2;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: C2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055s {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f783e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f784a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.d f785b;

    /* renamed from: c, reason: collision with root package name */
    public long f786c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f787d;

    public C0055s(SerialDescriptor serialDescriptor, E2.d dVar) {
        f2.j.f(serialDescriptor, "descriptor");
        this.f784a = serialDescriptor;
        this.f785b = dVar;
        int l3 = serialDescriptor.l();
        if (l3 <= 64) {
            this.f786c = l3 != 64 ? (-1) << l3 : 0L;
            this.f787d = f783e;
            return;
        }
        this.f786c = 0L;
        int i3 = (l3 - 1) >>> 6;
        long[] jArr = new long[i3];
        if ((l3 & 63) != 0) {
            jArr[i3 - 1] = (-1) << l3;
        }
        this.f787d = jArr;
    }
}
