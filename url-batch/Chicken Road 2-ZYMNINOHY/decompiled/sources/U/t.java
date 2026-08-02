package U;

import W.J;
import a.AbstractC0124a;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class t implements n {

    /* renamed from: b, reason: collision with root package name */
    public int f3100b;

    /* renamed from: c, reason: collision with root package name */
    public float f3101c;

    /* renamed from: d, reason: collision with root package name */
    public float f3102d;

    /* renamed from: e, reason: collision with root package name */
    public k f3103e;

    /* renamed from: f, reason: collision with root package name */
    public k f3104f;

    /* renamed from: g, reason: collision with root package name */
    public k f3105g;

    /* renamed from: h, reason: collision with root package name */
    public k f3106h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3107i;

    /* renamed from: j, reason: collision with root package name */
    public s f3108j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f3109k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f3110l;

    /* renamed from: m, reason: collision with root package name */
    public long f3111m;
    public long n;
    public boolean o;

    @Override // U.n
    public final boolean a() {
        if (this.f3104f.f3055a != -1) {
            return Math.abs(this.f3101c - 1.0f) >= 1.0E-4f || Math.abs(this.f3102d - 1.0f) >= 1.0E-4f || this.f3104f.f3055a != this.f3103e.f3055a;
        }
        return false;
    }

    @Override // U.n
    public final boolean b() {
        if (this.o) {
            s sVar = this.f3108j;
            if (sVar != null) {
                AbstractC0124a.t(sVar.f3095k >= 0);
                if (sVar.f3093i.o() * sVar.f3095k * sVar.f3086b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // U.n
    public final ByteBuffer c() {
        s sVar = this.f3108j;
        if (sVar != null) {
            q qVar = sVar.f3093i;
            int i4 = sVar.f3086b;
            AbstractC0124a.t(sVar.f3095k >= 0);
            int o = qVar.o() * sVar.f3095k * i4;
            if (o > 0) {
                if (this.f3109k.capacity() < o) {
                    this.f3109k = ByteBuffer.allocateDirect(o).order(ByteOrder.nativeOrder());
                } else {
                    this.f3109k.clear();
                }
                ByteBuffer byteBuffer = this.f3109k;
                AbstractC0124a.t(sVar.f3095k >= 0);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i4), sVar.f3095k);
                qVar.b(min, byteBuffer);
                sVar.f3095k -= min;
                System.arraycopy(qVar.i(), min * i4, qVar.i(), 0, sVar.f3095k * i4);
                this.f3109k.flip();
                this.n += o;
                this.f3110l = this.f3109k;
            }
        }
        ByteBuffer byteBuffer2 = this.f3110l;
        this.f3110l = n.f3061a;
        return byteBuffer2;
    }

    @Override // U.n
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            s sVar = this.f3108j;
            sVar.getClass();
            this.f3111m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i4 = sVar.f3086b;
            q qVar = sVar.f3093i;
            int o = remaining / (qVar.o() * i4);
            qVar.p(o);
            qVar.a(remaining, byteBuffer);
            sVar.f3094j += o;
            sVar.b();
        }
    }

    @Override // U.n
    public final void e() {
        s sVar = this.f3108j;
        if (sVar != null) {
            int i4 = sVar.f3094j;
            float f4 = sVar.f3087c;
            float f5 = sVar.f3088d;
            double d4 = f4 / f5;
            int i5 = sVar.f3095k + ((int) (((((((i4 - r6) / d4) + sVar.o) + sVar.f3099q) + sVar.f3096l) / (sVar.f3089e * f5)) + 0.5d));
            sVar.f3099q = 0.0d;
            q qVar = sVar.f3093i;
            int i6 = sVar.f3092h * 2;
            qVar.p(i6 + i4);
            qVar.d(i4 * sVar.f3086b, i6);
            sVar.f3094j = i6 + sVar.f3094j;
            sVar.b();
            if (sVar.f3095k > i5) {
                sVar.f3095k = Math.max(i5, 0);
            }
            sVar.f3094j = 0;
            sVar.o = 0;
            sVar.f3096l = 0;
        }
        this.o = true;
    }

    @Override // U.n
    public final k f(k kVar) {
        int i4 = kVar.f3057c;
        if (i4 != 2 && i4 != 4) {
            throw new m(kVar);
        }
        int i5 = this.f3100b;
        if (i5 == -1) {
            i5 = kVar.f3055a;
        }
        this.f3103e = kVar;
        k kVar2 = new k(i5, kVar.f3056b, i4);
        this.f3104f = kVar2;
        this.f3107i = true;
        return kVar2;
    }

    @Override // U.n
    public final void flush() {
        if (a()) {
            k kVar = this.f3103e;
            this.f3105g = kVar;
            k kVar2 = this.f3104f;
            this.f3106h = kVar2;
            if (this.f3107i) {
                this.f3108j = new s(kVar.f3055a, kVar.f3056b, this.f3101c, this.f3102d, kVar2.f3055a, kVar.f3057c == 4);
            } else {
                s sVar = this.f3108j;
                if (sVar != null) {
                    sVar.f3094j = 0;
                    sVar.f3095k = 0;
                    sVar.f3096l = 0;
                    sVar.f3097m = 0;
                    sVar.n = 0;
                    sVar.o = 0;
                    sVar.f3098p = 0;
                    sVar.f3099q = 0.0d;
                    sVar.f3093i.flush();
                }
            }
        }
        this.f3110l = n.f3061a;
        this.f3111m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // U.n
    public final long g(long j4) {
        if (this.n < 1024) {
            return (long) (j4 / this.f3101c);
        }
        long j5 = this.f3111m;
        this.f3108j.getClass();
        long o = j5 - (r2.f3093i.o() * (r2.f3094j * r2.f3086b));
        int i4 = this.f3106h.f3055a;
        int i5 = this.f3105g.f3055a;
        return i4 == i5 ? J.U(j4, this.n, o, RoundingMode.DOWN) : J.U(j4, this.n * i5, o * i4, RoundingMode.DOWN);
    }

    @Override // U.n
    public final void reset() {
        this.f3101c = 1.0f;
        this.f3102d = 1.0f;
        k kVar = k.f3054e;
        this.f3103e = kVar;
        this.f3104f = kVar;
        this.f3105g = kVar;
        this.f3106h = kVar;
        ByteBuffer byteBuffer = n.f3061a;
        this.f3109k = byteBuffer;
        this.f3110l = byteBuffer;
        this.f3100b = -1;
        this.f3107i = false;
        this.f3108j = null;
        this.f3111m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
