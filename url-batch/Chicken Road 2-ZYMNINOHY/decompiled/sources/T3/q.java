package T3;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2997a;

    /* renamed from: b, reason: collision with root package name */
    public int f2998b;

    /* renamed from: c, reason: collision with root package name */
    public int f2999c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3000d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3001e;

    /* renamed from: f, reason: collision with root package name */
    public q f3002f;

    /* renamed from: g, reason: collision with root package name */
    public q f3003g;

    public q() {
        this.f2997a = new byte[8192];
        this.f3001e = true;
        this.f3000d = false;
    }

    public final q a() {
        q qVar = this.f3002f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f3003g;
        kotlin.jvm.internal.i.b(qVar2);
        qVar2.f3002f = this.f3002f;
        q qVar3 = this.f3002f;
        kotlin.jvm.internal.i.b(qVar3);
        qVar3.f3003g = this.f3003g;
        this.f3002f = null;
        this.f3003g = null;
        return qVar;
    }

    public final void b(q segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        segment.f3003g = this;
        segment.f3002f = this.f3002f;
        q qVar = this.f3002f;
        kotlin.jvm.internal.i.b(qVar);
        qVar.f3003g = segment;
        this.f3002f = segment;
    }

    public final q c() {
        this.f3000d = true;
        return new q(this.f2997a, this.f2998b, this.f2999c, true);
    }

    public final void d(q sink, int i4) {
        kotlin.jvm.internal.i.e(sink, "sink");
        byte[] bArr = sink.f2997a;
        if (!sink.f3001e) {
            throw new IllegalStateException("only owner can write");
        }
        int i5 = sink.f2999c;
        int i6 = i5 + i4;
        if (i6 > 8192) {
            if (sink.f3000d) {
                throw new IllegalArgumentException();
            }
            int i7 = sink.f2998b;
            if (i6 - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            d3.g.O(0, i7, i5, bArr, bArr);
            sink.f2999c -= sink.f2998b;
            sink.f2998b = 0;
        }
        int i8 = sink.f2999c;
        int i9 = this.f2998b;
        d3.g.O(i8, i9, i9 + i4, this.f2997a, bArr);
        sink.f2999c += i4;
        this.f2998b += i4;
    }

    public q(byte[] data, int i4, int i5, boolean z) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f2997a = data;
        this.f2998b = i4;
        this.f2999c = i5;
        this.f3000d = z;
        this.f3001e = false;
    }
}
