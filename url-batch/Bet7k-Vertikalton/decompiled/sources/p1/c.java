package p1;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final v1.p f3410c;

    /* renamed from: f, reason: collision with root package name */
    public int f3412f;

    /* renamed from: g, reason: collision with root package name */
    public int f3413g;

    /* renamed from: a, reason: collision with root package name */
    public int f3408a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3409b = new ArrayList();
    public C0285b[] d = new C0285b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f3411e = 7;

    public c(r rVar) {
        this.f3410c = new v1.p(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.f3411e;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0285b c0285b = this.d[length];
                X0.d.b(c0285b);
                int i4 = c0285b.f3407c;
                i -= i4;
                this.f3413g -= i4;
                this.f3412f--;
                i3++;
            }
            C0285b[] c0285bArr = this.d;
            System.arraycopy(c0285bArr, i2 + 1, c0285bArr, i2 + 1 + i3, this.f3412f);
            this.f3411e += i3;
        }
        return i3;
    }

    public final v1.i b(int i) {
        if (i >= 0) {
            C0285b[] c0285bArr = e.f3420a;
            if (i <= c0285bArr.length - 1) {
                return c0285bArr[i].f3405a;
            }
        }
        int length = this.f3411e + 1 + (i - e.f3420a.length);
        if (length >= 0) {
            C0285b[] c0285bArr2 = this.d;
            if (length < c0285bArr2.length) {
                C0285b c0285b = c0285bArr2[length];
                X0.d.b(c0285b);
                return c0285b.f3405a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0285b c0285b) {
        this.f3409b.add(c0285b);
        int i = this.f3408a;
        int i2 = c0285b.f3407c;
        if (i2 > i) {
            C0285b[] c0285bArr = this.d;
            Q0.g.g0(c0285bArr, 0, c0285bArr.length);
            this.f3411e = this.d.length - 1;
            this.f3412f = 0;
            this.f3413g = 0;
            return;
        }
        a((this.f3413g + i2) - i);
        int i3 = this.f3412f + 1;
        C0285b[] c0285bArr2 = this.d;
        if (i3 > c0285bArr2.length) {
            C0285b[] c0285bArr3 = new C0285b[c0285bArr2.length * 2];
            System.arraycopy(c0285bArr2, 0, c0285bArr3, c0285bArr2.length, c0285bArr2.length);
            this.f3411e = this.d.length - 1;
            this.d = c0285bArr3;
        }
        int i4 = this.f3411e;
        this.f3411e = i4 - 1;
        this.d[i4] = c0285b;
        this.f3412f++;
        this.f3413g += i2;
    }

    public final v1.i d() {
        int i;
        v1.p pVar = this.f3410c;
        byte g2 = pVar.g();
        byte[] bArr = j1.b.f2603a;
        int i2 = g2 & 255;
        int i3 = 0;
        boolean z2 = (g2 & 128) == 128;
        long e2 = e(i2, 127);
        if (!z2) {
            return pVar.h(e2);
        }
        v1.f fVar = new v1.f();
        int[] iArr = z.f3508a;
        X0.d.e(pVar, "source");
        y yVar = z.f3510c;
        y yVar2 = yVar;
        int i4 = 0;
        for (long j2 = 0; j2 < e2; j2++) {
            byte g3 = pVar.g();
            byte[] bArr2 = j1.b.f2603a;
            i3 = (i3 << 8) | (g3 & 255);
            i4 += 8;
            while (i4 >= 8) {
                y[] yVarArr = (y[]) yVar2.f3507c;
                X0.d.b(yVarArr);
                yVar2 = yVarArr[(i3 >>> (i4 - 8)) & 255];
                X0.d.b(yVar2);
                if (((y[]) yVar2.f3507c) == null) {
                    fVar.s(yVar2.f3505a);
                    i4 -= yVar2.f3506b;
                    yVar2 = yVar;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            y[] yVarArr2 = (y[]) yVar2.f3507c;
            X0.d.b(yVarArr2);
            y yVar3 = yVarArr2[(i3 << (8 - i4)) & 255];
            X0.d.b(yVar3);
            if (((y[]) yVar3.f3507c) != null || (i = yVar3.f3506b) > i4) {
                break;
            }
            fVar.s(yVar3.f3505a);
            i4 -= i;
            yVar2 = yVar;
        }
        return fVar.i(fVar.f4073b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte g2 = this.f3410c.g();
            byte[] bArr = j1.b.f2603a;
            int i5 = g2 & 255;
            if ((g2 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (g2 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
