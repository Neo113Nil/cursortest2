package n6;

import l5.AbstractC0505i;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5550a;

    /* renamed from: b, reason: collision with root package name */
    public int f5551b;

    /* renamed from: c, reason: collision with root package name */
    public int f5552c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5553d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5554e;

    /* renamed from: f, reason: collision with root package name */
    public r f5555f;

    /* renamed from: g, reason: collision with root package name */
    public r f5556g;

    public r() {
        this.f5550a = new byte[8192];
        this.f5554e = true;
        this.f5553d = false;
    }

    public final r a() {
        r rVar = this.f5555f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f5556g;
        kotlin.jvm.internal.i.b(rVar2);
        rVar2.f5555f = this.f5555f;
        r rVar3 = this.f5555f;
        kotlin.jvm.internal.i.b(rVar3);
        rVar3.f5556g = this.f5556g;
        this.f5555f = null;
        this.f5556g = null;
        return rVar;
    }

    public final void b(r segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        segment.f5556g = this;
        segment.f5555f = this.f5555f;
        r rVar = this.f5555f;
        kotlin.jvm.internal.i.b(rVar);
        rVar.f5556g = segment;
        this.f5555f = segment;
    }

    public final r c() {
        this.f5553d = true;
        return new r(this.f5550a, this.f5551b, this.f5552c, true);
    }

    public final void d(r sink, int i7) {
        kotlin.jvm.internal.i.e(sink, "sink");
        byte[] bArr = sink.f5550a;
        if (!sink.f5554e) {
            throw new IllegalStateException("only owner can write");
        }
        int i8 = sink.f5552c;
        int i9 = i8 + i7;
        if (i9 > 8192) {
            if (sink.f5553d) {
                throw new IllegalArgumentException();
            }
            int i10 = sink.f5551b;
            if (i9 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0505i.F(0, i10, i8, bArr, bArr);
            sink.f5552c -= sink.f5551b;
            sink.f5551b = 0;
        }
        int i11 = sink.f5552c;
        int i12 = this.f5551b;
        AbstractC0505i.F(i11, i12, i12 + i7, this.f5550a, bArr);
        sink.f5552c += i7;
        this.f5551b += i7;
    }

    public r(byte[] data, int i7, int i8, boolean z5) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f5550a = data;
        this.f5551b = i7;
        this.f5552c = i8;
        this.f5553d = z5;
        this.f5554e = false;
    }
}
