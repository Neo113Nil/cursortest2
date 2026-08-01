package r1;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final x1.p f3538c;

    /* renamed from: f, reason: collision with root package name */
    public int f3540f;

    /* renamed from: g, reason: collision with root package name */
    public int f3541g;

    /* renamed from: a, reason: collision with root package name */
    public int f3536a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3537b = new ArrayList();
    public C0291b[] d = new C0291b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f3539e = 7;

    public c(r rVar) {
        this.f3538c = new x1.p(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.f3539e;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0291b c0291b = this.d[length];
                Z0.d.b(c0291b);
                int i4 = c0291b.f3535c;
                i -= i4;
                this.f3541g -= i4;
                this.f3540f--;
                i3++;
            }
            C0291b[] c0291bArr = this.d;
            System.arraycopy(c0291bArr, i2 + 1, c0291bArr, i2 + 1 + i3, this.f3540f);
            this.f3539e += i3;
        }
        return i3;
    }

    public final x1.i b(int i) {
        if (i >= 0) {
            C0291b[] c0291bArr = e.f3548a;
            if (i <= c0291bArr.length - 1) {
                return c0291bArr[i].f3533a;
            }
        }
        int length = this.f3539e + 1 + (i - e.f3548a.length);
        if (length >= 0) {
            C0291b[] c0291bArr2 = this.d;
            if (length < c0291bArr2.length) {
                C0291b c0291b = c0291bArr2[length];
                Z0.d.b(c0291b);
                return c0291b.f3533a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0291b c0291b) {
        this.f3537b.add(c0291b);
        int i = this.f3536a;
        int i2 = c0291b.f3535c;
        if (i2 > i) {
            C0291b[] c0291bArr = this.d;
            R0.g.q0(c0291bArr, 0, c0291bArr.length);
            this.f3539e = this.d.length - 1;
            this.f3540f = 0;
            this.f3541g = 0;
            return;
        }
        a((this.f3541g + i2) - i);
        int i3 = this.f3540f + 1;
        C0291b[] c0291bArr2 = this.d;
        if (i3 > c0291bArr2.length) {
            C0291b[] c0291bArr3 = new C0291b[c0291bArr2.length * 2];
            System.arraycopy(c0291bArr2, 0, c0291bArr3, c0291bArr2.length, c0291bArr2.length);
            this.f3539e = this.d.length - 1;
            this.d = c0291bArr3;
        }
        int i4 = this.f3539e;
        this.f3539e = i4 - 1;
        this.d[i4] = c0291b;
        this.f3540f++;
        this.f3541g += i2;
    }

    public final x1.i d() {
        int i;
        x1.p pVar = this.f3538c;
        byte i2 = pVar.i();
        byte[] bArr = l1.b.f3252a;
        int i3 = i2 & 255;
        int i4 = 0;
        boolean z2 = (i2 & 128) == 128;
        long e2 = e(i3, 127);
        if (!z2) {
            return pVar.j(e2);
        }
        x1.f fVar = new x1.f();
        int[] iArr = z.f3636a;
        Z0.d.e(pVar, "source");
        y yVar = z.f3638c;
        y yVar2 = yVar;
        int i5 = 0;
        for (long j2 = 0; j2 < e2; j2++) {
            byte i6 = pVar.i();
            byte[] bArr2 = l1.b.f3252a;
            i4 = (i4 << 8) | (i6 & 255);
            i5 += 8;
            while (i5 >= 8) {
                y[] yVarArr = (y[]) yVar2.f3635c;
                Z0.d.b(yVarArr);
                yVar2 = yVarArr[(i4 >>> (i5 - 8)) & 255];
                Z0.d.b(yVar2);
                if (((y[]) yVar2.f3635c) == null) {
                    fVar.u(yVar2.f3633a);
                    i5 -= yVar2.f3634b;
                    yVar2 = yVar;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            y[] yVarArr2 = (y[]) yVar2.f3635c;
            Z0.d.b(yVarArr2);
            y yVar3 = yVarArr2[(i4 << (8 - i5)) & 255];
            Z0.d.b(yVar3);
            if (((y[]) yVar3.f3635c) != null || (i = yVar3.f3634b) > i5) {
                break;
            }
            fVar.u(yVar3.f3633a);
            i5 -= i;
            yVar2 = yVar;
        }
        return fVar.k(fVar.f4236b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte i5 = this.f3538c.i();
            byte[] bArr = l1.b.f3252a;
            int i6 = i5 & 255;
            if ((i5 & 128) == 0) {
                return i2 + (i6 << i4);
            }
            i2 += (i5 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
