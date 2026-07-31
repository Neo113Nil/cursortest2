package z3;

import W4.o;
import k5.EnumC0476f;
import m1.AbstractC0521b;
import n6.r;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f6329g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public n6.f f6330a = new n6.f();

    /* renamed from: b, reason: collision with root package name */
    public n6.f f6331b = new n6.f();

    /* renamed from: c, reason: collision with root package name */
    public final n6.e f6332c = new n6.e();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6333d = f6329g;

    /* renamed from: e, reason: collision with root package name */
    public int f6334e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6335f;

    public l() {
        EnumC0476f enumC0476f = EnumC0476f.f5196g;
        this.f6335f = AbstractC0521b.w(enumC0476f, new k());
        AbstractC0521b.w(enumC0476f, new X5.l(5, this));
    }

    public final void a() {
        byte[] bArr = this.f6333d;
        byte[] bArr2 = f6329g;
        if (bArr == bArr2) {
            return;
        }
        this.f6332c.close();
        this.f6331b.skip(this.f6334e);
        this.f6331b.H(this.f6330a);
        n6.f fVar = this.f6330a;
        this.f6330a = this.f6331b;
        this.f6331b = fVar;
        this.f6333d = bArr2;
        this.f6334e = 0;
    }

    public final void b(int i7) {
        if (this.f6334e >= i7) {
            return;
        }
        a();
        n6.f fVar = this.f6331b;
        byte[] bArr = o6.a.f5623a;
        n6.e eVar = n6.b.f5509a;
        n6.e eVar2 = this.f6332c;
        n6.e eVar3 = eVar2 == eVar ? new n6.e() : eVar2;
        if (eVar3.f5519f != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        eVar3.f5519f = fVar;
        eVar3.f5520g = true;
        if (i7 <= 0) {
            throw new IllegalArgumentException(o.c("minByteCount <= 0: ", i7).toString());
        }
        if (i7 > 8192) {
            throw new IllegalArgumentException(o.c("minByteCount > Segment.SIZE: ", i7).toString());
        }
        n6.f fVar2 = eVar2.f5519f;
        if (fVar2 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!eVar2.f5520g) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long j4 = fVar2.f5524g;
        r F6 = fVar2.F(i7);
        int i8 = 8192 - F6.f5552c;
        F6.f5552c = 8192;
        fVar2.f5524g = i8 + j4;
        byte[] bArr2 = F6.f5550a;
        eVar2.f5521h = bArr2;
        eVar2.f5522i = 8192;
        if (j4 == 0) {
            kotlin.jvm.internal.i.b(bArr2);
            if (8192 == bArr2.length) {
                byte[] bArr3 = eVar2.f5521h;
                kotlin.jvm.internal.i.b(bArr3);
                this.f6333d = bArr3;
                this.f6334e = eVar2.f5522i;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }
}
