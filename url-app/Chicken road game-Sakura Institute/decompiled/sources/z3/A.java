package z3;

import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f11962a;

    /* renamed from: b, reason: collision with root package name */
    public int f11963b;

    /* renamed from: c, reason: collision with root package name */
    public int f11964c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11965d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11966e;

    /* renamed from: f, reason: collision with root package name */
    public A f11967f;

    /* renamed from: g, reason: collision with root package name */
    public A f11968g;

    public A() {
        this.f11962a = new byte[8192];
        this.f11966e = true;
        this.f11965d = false;
    }

    public final A a() {
        A a4 = this.f11967f;
        if (a4 == this) {
            a4 = null;
        }
        A a5 = this.f11968g;
        Intrinsics.c(a5);
        a5.f11967f = this.f11967f;
        A a6 = this.f11967f;
        Intrinsics.c(a6);
        a6.f11968g = this.f11968g;
        this.f11967f = null;
        this.f11968g = null;
        return a4;
    }

    public final void b(A segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f11968g = this;
        segment.f11967f = this.f11967f;
        A a4 = this.f11967f;
        Intrinsics.c(a4);
        a4.f11968g = segment;
        this.f11967f = segment;
    }

    public final A c() {
        this.f11965d = true;
        return new A(this.f11962a, this.f11963b, this.f11964c, true);
    }

    public final void d(A sink, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f11966e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = sink.f11964c;
        int i5 = i4 + i2;
        byte[] bArr = sink.f11962a;
        if (i5 > 8192) {
            if (sink.f11965d) {
                throw new IllegalArgumentException();
            }
            int i6 = sink.f11963b;
            if (i5 - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            C1436t.c(0, i6, i4, bArr, bArr);
            sink.f11964c -= sink.f11963b;
            sink.f11963b = 0;
        }
        int i7 = sink.f11964c;
        int i8 = this.f11963b;
        C1436t.c(i7, i8, i8 + i2, this.f11962a, bArr);
        sink.f11964c += i2;
        this.f11963b += i2;
    }

    public A(byte[] data, int i2, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f11962a = data;
        this.f11963b = i2;
        this.f11964c = i4;
        this.f11965d = z4;
        this.f11966e = false;
    }
}
