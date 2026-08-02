package V0;

import T.C0096n;
import T.C0097o;
import T.r;
import W.J;
import W.u;
import a.AbstractC0124a;
import java.util.ArrayList;
import java.util.Arrays;
import y0.F;
import y0.o;
import y0.p;
import y0.v;

/* loaded from: classes.dex */
public final class h implements y0.n {

    /* renamed from: a, reason: collision with root package name */
    public final l f3195a;

    /* renamed from: b, reason: collision with root package name */
    public final C0097o f3196b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3197c;

    /* renamed from: f, reason: collision with root package name */
    public F f3200f;

    /* renamed from: g, reason: collision with root package name */
    public int f3201g;

    /* renamed from: h, reason: collision with root package name */
    public int f3202h;

    /* renamed from: i, reason: collision with root package name */
    public long[] f3203i;

    /* renamed from: j, reason: collision with root package name */
    public long f3204j;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f3199e = J.f3264b;

    /* renamed from: d, reason: collision with root package name */
    public final u f3198d = new u();

    public h(l lVar, C0097o c0097o) {
        C0097o c0097o2;
        this.f3195a = lVar;
        if (c0097o != null) {
            C0096n a3 = c0097o.a();
            a3.f2831m = T.F.n("application/x-media3-cues");
            a3.f2828j = c0097o.n;
            a3.f2816K = lVar.c();
            c0097o2 = new C0097o(a3);
        } else {
            c0097o2 = null;
        }
        this.f3196b = c0097o2;
        this.f3197c = new ArrayList();
        this.f3202h = 0;
        this.f3203i = J.f3265c;
        this.f3204j = -9223372036854775807L;
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        int i4 = this.f3202h;
        AbstractC0124a.t((i4 == 0 || i4 == 5) ? false : true);
        this.f3204j = j5;
        if (this.f3202h == 2) {
            this.f3202h = 1;
        }
        if (this.f3202h == 4) {
            this.f3202h = 3;
        }
    }

    @Override // y0.n
    public final boolean b(o oVar) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r20.f3201g != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        r4 = r20.f3204j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        r2 = new V0.k(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        r20.f3195a.b(r20.f3199e, 0, r20.f3201g, r2, new D0.a(6, r20));
        java.util.Collections.sort(r11);
        r20.f3203i = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b5, code lost:
    
        if (r2 >= r11.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        r20.f3203i[r2] = ((V0.g) r11.get(r2)).f3193a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
    
        r20.f3199e = W.J.f3264b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
    
        r20.f3202h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
    
        r2 = V0.k.f3207c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d5, code lost:
    
        throw T.G.a(r0, "SubtitleParser failed.");
     */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(o oVar, r rVar) {
        int i4;
        int i5 = this.f3202h;
        AbstractC0124a.t((i5 == 0 || i5 == 5) ? false : true);
        if (this.f3202h == 1) {
            int g4 = oVar.getLength() != -1 ? O3.d.g(oVar.getLength()) : 1024;
            if (g4 > this.f3199e.length) {
                this.f3199e = new byte[g4];
            }
            this.f3201g = 0;
            this.f3202h = 2;
        }
        int i6 = this.f3202h;
        ArrayList arrayList = this.f3197c;
        if (i6 == 2) {
            byte[] bArr = this.f3199e;
            if (bArr.length == this.f3201g) {
                this.f3199e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f3199e;
            int i7 = this.f3201g;
            int read = oVar.read(bArr2, i7, bArr2.length - i7);
            if (read != -1) {
                this.f3201g += read;
            }
            long length = oVar.getLength();
            if (length != -1) {
                i4 = 0;
            } else {
                i4 = 0;
            }
        } else {
            i4 = 0;
        }
        if (this.f3202h == 3) {
            if (oVar.q(oVar.getLength() != -1 ? O3.d.g(oVar.getLength()) : 1024) == -1) {
                long j4 = this.f3204j;
                for (int f4 = j4 == -9223372036854775807L ? i4 : J.f(this.f3203i, j4, true); f4 < arrayList.size(); f4++) {
                    f((g) arrayList.get(f4));
                }
                this.f3202h = 4;
            }
        }
        if (this.f3202h == 4) {
            return -1;
        }
        return i4;
    }

    @Override // y0.n
    public final void e(p pVar) {
        AbstractC0124a.t(this.f3202h == 0);
        F z = pVar.z(0, 3);
        this.f3200f = z;
        C0097o c0097o = this.f3196b;
        if (c0097o != null) {
            z.d(c0097o);
            pVar.r();
            pVar.x(new v(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f3202h = 1;
    }

    public final void f(g gVar) {
        this.f3200f.getClass();
        byte[] bArr = gVar.f3194b;
        int length = bArr.length;
        u uVar = this.f3198d;
        uVar.getClass();
        uVar.K(bArr.length, bArr);
        this.f3200f.a(length, uVar);
        this.f3200f.e(gVar.f3193a, 1, length, 0, null);
    }

    @Override // y0.n
    public final void release() {
        if (this.f3202h == 5) {
            return;
        }
        this.f3195a.reset();
        this.f3202h = 5;
    }
}
