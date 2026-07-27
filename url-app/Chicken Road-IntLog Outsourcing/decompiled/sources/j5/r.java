package j5;

import g4.AbstractC0464i;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10521a;

    /* renamed from: b, reason: collision with root package name */
    public int f10522b;

    /* renamed from: c, reason: collision with root package name */
    public int f10523c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10524d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10525e;

    /* renamed from: f, reason: collision with root package name */
    public r f10526f;

    /* renamed from: g, reason: collision with root package name */
    public r f10527g;

    public r() {
        this.f10521a = new byte[8192];
        this.f10525e = true;
        this.f10524d = false;
    }

    public final r a() {
        r rVar = this.f10526f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f10527g;
        kotlin.jvm.internal.i.b(rVar2);
        rVar2.f10526f = this.f10526f;
        r rVar3 = this.f10526f;
        kotlin.jvm.internal.i.b(rVar3);
        rVar3.f10527g = this.f10527g;
        this.f10526f = null;
        this.f10527g = null;
        return rVar;
    }

    public final void b(r segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        segment.f10527g = this;
        segment.f10526f = this.f10526f;
        r rVar = this.f10526f;
        kotlin.jvm.internal.i.b(rVar);
        rVar.f10527g = segment;
        this.f10526f = segment;
    }

    public final r c() {
        this.f10524d = true;
        return new r(this.f10521a, this.f10522b, this.f10523c, true);
    }

    public final void d(r sink, int i2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (!sink.f10525e) {
            throw new IllegalStateException("only owner can write");
        }
        int i3 = sink.f10523c;
        int i6 = i3 + i2;
        byte[] bArr = sink.f10521a;
        if (i6 > 8192) {
            if (sink.f10524d) {
                throw new IllegalArgumentException();
            }
            int i7 = sink.f10522b;
            if (i6 - i7 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0464i.O(0, i7, i3, bArr, bArr);
            sink.f10523c -= sink.f10522b;
            sink.f10522b = 0;
        }
        int i8 = sink.f10523c;
        int i9 = this.f10522b;
        AbstractC0464i.O(i8, i9, i9 + i2, this.f10521a, bArr);
        sink.f10523c += i2;
        this.f10522b += i2;
    }

    public r(byte[] data, int i2, int i3, boolean z) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f10521a = data;
        this.f10522b = i2;
        this.f10523c = i3;
        this.f10524d = z;
        this.f10525e = false;
    }
}
