package c4;

import C4.p;
import D6.o;
import T6.r;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306l {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f4244g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public T6.f f4245a = new T6.f();

    /* renamed from: b, reason: collision with root package name */
    public T6.f f4246b = new T6.f();

    /* renamed from: c, reason: collision with root package name */
    public final T6.e f4247c = new T6.e();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4248d = f4244g;

    /* renamed from: e, reason: collision with root package name */
    public int f4249e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4250f;

    public C0306l() {
        R5.j jVar = R5.j.f2418e;
        this.f4250f = R5.i.a(jVar, new C0305k(0));
        R5.i.a(jVar, new o(4, this));
    }

    public final void a() {
        byte[] bArr = this.f4248d;
        byte[] bArr2 = f4244g;
        if (bArr == bArr2) {
            return;
        }
        this.f4247c.close();
        this.f4246b.skip(this.f4249e);
        this.f4246b.G(this.f4245a);
        T6.f fVar = this.f4245a;
        this.f4245a = this.f4246b;
        this.f4246b = fVar;
        this.f4248d = bArr2;
        this.f4249e = 0;
    }

    public final void b(int i2) {
        if (this.f4249e >= i2) {
            return;
        }
        a();
        T6.f fVar = this.f4246b;
        T6.e unsafeCursor = this.f4247c;
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = U6.a.f2736a;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        T6.e eVar = unsafeCursor == T6.b.f2603a ? new T6.e() : unsafeCursor;
        if (eVar.f2612d != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        eVar.f2612d = fVar;
        eVar.f2613e = true;
        if (i2 <= 0) {
            throw new IllegalArgumentException(p.g(i2, "minByteCount <= 0: ").toString());
        }
        if (i2 > 8192) {
            throw new IllegalArgumentException(p.g(i2, "minByteCount > Segment.SIZE: ").toString());
        }
        T6.f fVar2 = unsafeCursor.f2612d;
        if (fVar2 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.f2613e) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long j = fVar2.f2617e;
        r E7 = fVar2.E(i2);
        int i5 = 8192 - E7.f2645c;
        E7.f2645c = 8192;
        fVar2.f2617e = i5 + j;
        byte[] bArr2 = E7.f2643a;
        unsafeCursor.f2614i = bArr2;
        unsafeCursor.f2615l = 8192;
        if (j == 0) {
            Intrinsics.b(bArr2);
            if (8192 == bArr2.length) {
                byte[] bArr3 = unsafeCursor.f2614i;
                Intrinsics.b(bArr3);
                this.f4248d = bArr3;
                this.f4249e = unsafeCursor.f2615l;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }
}
