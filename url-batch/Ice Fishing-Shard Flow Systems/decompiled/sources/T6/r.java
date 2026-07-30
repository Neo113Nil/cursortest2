package T6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2643a;

    /* renamed from: b, reason: collision with root package name */
    public int f2644b;

    /* renamed from: c, reason: collision with root package name */
    public int f2645c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2646d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2647e;

    /* renamed from: f, reason: collision with root package name */
    public r f2648f;

    /* renamed from: g, reason: collision with root package name */
    public r f2649g;

    public r() {
        this.f2643a = new byte[8192];
        this.f2647e = true;
        this.f2646d = false;
    }

    public final r a() {
        r rVar = this.f2648f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f2649g;
        Intrinsics.b(rVar2);
        rVar2.f2648f = this.f2648f;
        r rVar3 = this.f2648f;
        Intrinsics.b(rVar3);
        rVar3.f2649g = this.f2649g;
        this.f2648f = null;
        this.f2649g = null;
        return rVar;
    }

    public final void b(r segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f2649g = this;
        segment.f2648f = this.f2648f;
        r rVar = this.f2648f;
        Intrinsics.b(rVar);
        rVar.f2649g = segment;
        this.f2648f = segment;
    }

    public final r c() {
        this.f2646d = true;
        return new r(this.f2643a, this.f2644b, this.f2645c, true);
    }

    public final void d(r sink, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        boolean z7 = sink.f2647e;
        byte[] bArr = sink.f2643a;
        if (!z7) {
            throw new IllegalStateException("only owner can write");
        }
        int i5 = sink.f2645c;
        int i7 = i5 + i2;
        if (i7 > 8192) {
            if (sink.f2646d) {
                throw new IllegalArgumentException();
            }
            int i8 = sink.f2644b;
            if (i7 - i8 > 8192) {
                throw new IllegalArgumentException();
            }
            kotlin.collections.o.c(0, i8, i5, bArr, bArr);
            sink.f2645c -= sink.f2644b;
            sink.f2644b = 0;
        }
        int i9 = sink.f2645c;
        int i10 = this.f2644b;
        kotlin.collections.o.c(i9, i10, i10 + i2, this.f2643a, bArr);
        sink.f2645c += i2;
        this.f2644b += i2;
    }

    public r(byte[] data, int i2, int i5, boolean z7) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f2643a = data;
        this.f2644b = i2;
        this.f2645c = i5;
        this.f2646d = z7;
        this.f2647e = false;
    }
}
