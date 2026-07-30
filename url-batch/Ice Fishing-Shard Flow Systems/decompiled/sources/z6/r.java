package z6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f8807e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final x6.e f8808a;

    /* renamed from: b, reason: collision with root package name */
    public final B6.j f8809b;

    /* renamed from: c, reason: collision with root package name */
    public long f8810c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f8811d;

    public r(x6.e descriptor, B6.j readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f8808a = descriptor;
        this.f8809b = readIfAbsent;
        int d7 = descriptor.d();
        if (d7 <= 64) {
            this.f8810c = d7 != 64 ? (-1) << d7 : 0L;
            this.f8811d = f8807e;
            return;
        }
        this.f8810c = 0L;
        int i2 = (d7 - 1) >>> 6;
        long[] jArr = new long[i2];
        if ((d7 & 63) != 0) {
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            jArr[i2 - 1] = (-1) << d7;
        }
        this.f8811d = jArr;
    }
}
