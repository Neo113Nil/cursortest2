package T5;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f2455e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final R5.e f2456a;

    /* renamed from: b, reason: collision with root package name */
    public final V5.j f2457b;

    /* renamed from: c, reason: collision with root package name */
    public long f2458c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f2459d;

    public r(R5.e descriptor, V5.j jVar) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        this.f2456a = descriptor;
        this.f2457b = jVar;
        int d7 = descriptor.d();
        if (d7 <= 64) {
            this.f2458c = d7 != 64 ? (-1) << d7 : 0L;
            this.f2459d = f2455e;
            return;
        }
        this.f2458c = 0L;
        int i7 = (d7 - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((d7 & 63) != 0) {
            jArr[i7 - 1] = (-1) << d7;
        }
        this.f2459d = jArr;
    }
}
