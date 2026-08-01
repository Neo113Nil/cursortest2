package a4;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public final g4.p f156c;

    /* renamed from: f, reason: collision with root package name */
    public int f158f;

    /* renamed from: g, reason: collision with root package name */
    public int f159g;

    /* renamed from: a, reason: collision with root package name */
    public int f154a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f155b = new ArrayList();
    public c[] d = new c[8];

    /* renamed from: e, reason: collision with root package name */
    public int f157e = 7;

    public d(u uVar) {
        this.f156c = new g4.p(uVar);
    }

    public final int a(int i) {
        int i4;
        int i5 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i4 = this.f157e;
                if (length < i4 || i <= 0) {
                    break;
                }
                c cVar = this.d[length];
                i3.d.b(cVar);
                int i6 = cVar.f150c;
                i -= i6;
                this.f159g -= i6;
                this.f158f--;
                i5++;
            }
            c[] cVarArr = this.d;
            System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i5, this.f158f);
            this.f157e += i5;
        }
        return i5;
    }

    public final g4.i b(int i) {
        if (i >= 0) {
            c[] cVarArr = f.f169a;
            if (i <= cVarArr.length - 1) {
                return cVarArr[i].f148a;
            }
        }
        int length = this.f157e + 1 + (i - f.f169a.length);
        if (length >= 0) {
            c[] cVarArr2 = this.d;
            if (length < cVarArr2.length) {
                c cVar = cVarArr2[length];
                i3.d.b(cVar);
                return cVar.f148a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(c cVar) {
        this.f155b.add(cVar);
        int i = cVar.f150c;
        int i4 = this.f154a;
        if (i > i4) {
            c[] cVarArr = this.d;
            x2.g.K(cVarArr, 0, cVarArr.length);
            this.f157e = this.d.length - 1;
            this.f158f = 0;
            this.f159g = 0;
            return;
        }
        a((this.f159g + i) - i4);
        int i5 = this.f158f + 1;
        c[] cVarArr2 = this.d;
        if (i5 > cVarArr2.length) {
            c[] cVarArr3 = new c[cVarArr2.length * 2];
            System.arraycopy(cVarArr2, 0, cVarArr3, cVarArr2.length, cVarArr2.length);
            this.f157e = this.d.length - 1;
            this.d = cVarArr3;
        }
        int i6 = this.f157e;
        this.f157e = i6 - 1;
        this.d[i6] = cVar;
        this.f158f++;
        this.f159g += i;
    }

    public final g4.i d() {
        g4.p pVar = this.f156c;
        byte readByte = pVar.readByte();
        byte[] bArr = u3.b.f3581a;
        int i = readByte & 255;
        int i4 = 0;
        boolean z4 = (readByte & 128) == 128;
        long e4 = e(i, 127);
        if (!z4) {
            return pVar.b(e4);
        }
        g4.f fVar = new g4.f();
        int[] iArr = c0.f151a;
        i3.d.e(pVar, "source");
        b0 b0Var = c0.f153c;
        b0 b0Var2 = b0Var;
        int i5 = 0;
        for (long j2 = 0; j2 < e4; j2++) {
            byte readByte2 = pVar.readByte();
            byte[] bArr2 = u3.b.f3581a;
            i4 = (i4 << 8) | (readByte2 & 255);
            i5 += 8;
            while (i5 >= 8) {
                b0[] b0VarArr = (b0[]) b0Var2.f144c;
                i3.d.b(b0VarArr);
                b0Var2 = b0VarArr[(i4 >>> (i5 - 8)) & 255];
                i3.d.b(b0Var2);
                if (((b0[]) b0Var2.f144c) == null) {
                    fVar.x(b0Var2.f142a);
                    i5 -= b0Var2.f143b;
                    b0Var2 = b0Var;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            b0[] b0VarArr2 = (b0[]) b0Var2.f144c;
            i3.d.b(b0VarArr2);
            b0 b0Var3 = b0VarArr2[(i4 << (8 - i5)) & 255];
            i3.d.b(b0Var3);
            int i6 = b0Var3.f143b;
            if (((b0[]) b0Var3.f144c) != null || i6 > i5) {
                break;
            }
            fVar.x(b0Var3.f142a);
            i5 -= i6;
            b0Var2 = b0Var;
        }
        return fVar.b(fVar.f1935g);
    }

    public final int e(int i, int i4) {
        int i5 = i & i4;
        if (i5 < i4) {
            return i5;
        }
        int i6 = 0;
        while (true) {
            byte readByte = this.f156c.readByte();
            byte[] bArr = u3.b.f3581a;
            int i7 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i4 + (i7 << i6);
            }
            i4 += (readByte & Byte.MAX_VALUE) << i6;
            i6 += 7;
        }
    }
}
