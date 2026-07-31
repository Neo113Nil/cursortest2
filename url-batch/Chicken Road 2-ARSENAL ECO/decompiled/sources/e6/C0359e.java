package e6;

import java.io.IOException;
import java.util.ArrayList;
import l5.AbstractC0505i;

/* renamed from: e6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359e {

    /* renamed from: c, reason: collision with root package name */
    public final n6.q f4058c;

    /* renamed from: f, reason: collision with root package name */
    public int f4061f;

    /* renamed from: g, reason: collision with root package name */
    public int f4062g;

    /* renamed from: a, reason: collision with root package name */
    public int f4056a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4057b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0358d[] f4059d = new C0358d[8];

    /* renamed from: e, reason: collision with root package name */
    public int f4060e = 7;

    public C0359e(u uVar) {
        this.f4058c = n6.b.b(uVar);
    }

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        if (i7 > 0) {
            int length = this.f4059d.length;
            while (true) {
                length--;
                i8 = this.f4060e;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                C0358d c0358d = this.f4059d[length];
                kotlin.jvm.internal.i.b(c0358d);
                int i10 = c0358d.f4055c;
                i7 -= i10;
                this.f4062g -= i10;
                this.f4061f--;
                i9++;
            }
            C0358d[] c0358dArr = this.f4059d;
            System.arraycopy(c0358dArr, i8 + 1, c0358dArr, i8 + 1 + i9, this.f4061f);
            this.f4060e += i9;
        }
        return i9;
    }

    public final n6.i b(int i7) {
        if (i7 >= 0) {
            C0358d[] c0358dArr = g.f4071a;
            if (i7 <= c0358dArr.length - 1) {
                return c0358dArr[i7].f4053a;
            }
        }
        int length = this.f4060e + 1 + (i7 - g.f4071a.length);
        if (length >= 0) {
            C0358d[] c0358dArr2 = this.f4059d;
            if (length < c0358dArr2.length) {
                C0358d c0358d = c0358dArr2[length];
                kotlin.jvm.internal.i.b(c0358d);
                return c0358d.f4053a;
            }
        }
        throw new IOException("Header index too large " + (i7 + 1));
    }

    public final void c(C0358d c0358d) {
        this.f4057b.add(c0358d);
        int i7 = c0358d.f4055c;
        int i8 = this.f4056a;
        if (i7 > i8) {
            C0358d[] c0358dArr = this.f4059d;
            AbstractC0505i.J(0, c0358dArr.length, c0358dArr);
            this.f4060e = this.f4059d.length - 1;
            this.f4061f = 0;
            this.f4062g = 0;
            return;
        }
        a((this.f4062g + i7) - i8);
        int i9 = this.f4061f + 1;
        C0358d[] c0358dArr2 = this.f4059d;
        if (i9 > c0358dArr2.length) {
            C0358d[] c0358dArr3 = new C0358d[c0358dArr2.length * 2];
            System.arraycopy(c0358dArr2, 0, c0358dArr3, c0358dArr2.length, c0358dArr2.length);
            this.f4060e = this.f4059d.length - 1;
            this.f4059d = c0358dArr3;
        }
        int i10 = this.f4060e;
        this.f4060e = i10 - 1;
        this.f4059d[i10] = c0358d;
        this.f4061f++;
        this.f4062g += i7;
    }

    public final n6.i d() {
        n6.q source = this.f4058c;
        byte readByte = source.readByte();
        byte[] bArr = Y5.c.f3099a;
        int i7 = readByte & 255;
        int i8 = 0;
        boolean z5 = (readByte & 128) == 128;
        long e4 = e(i7, 127);
        if (!z5) {
            return source.f(e4);
        }
        n6.f fVar = new n6.f();
        int[] iArr = B.f4030a;
        kotlin.jvm.internal.i.e(source, "source");
        D4.h hVar = B.f4032c;
        D4.h hVar2 = hVar;
        int i9 = 0;
        for (long j4 = 0; j4 < e4; j4++) {
            byte readByte2 = source.readByte();
            byte[] bArr2 = Y5.c.f3099a;
            i8 = (i8 << 8) | (readByte2 & 255);
            i9 += 8;
            while (i9 >= 8) {
                D4.h[] hVarArr = (D4.h[]) hVar2.f529c;
                kotlin.jvm.internal.i.b(hVarArr);
                hVar2 = hVarArr[(i8 >>> (i9 - 8)) & 255];
                kotlin.jvm.internal.i.b(hVar2);
                if (((D4.h[]) hVar2.f529c) == null) {
                    fVar.I(hVar2.f527a);
                    i9 -= hVar2.f528b;
                    hVar2 = hVar;
                } else {
                    i9 -= 8;
                }
            }
        }
        while (i9 > 0) {
            D4.h[] hVarArr2 = (D4.h[]) hVar2.f529c;
            kotlin.jvm.internal.i.b(hVarArr2);
            D4.h hVar3 = hVarArr2[(i8 << (8 - i9)) & 255];
            kotlin.jvm.internal.i.b(hVar3);
            int i10 = hVar3.f528b;
            if (((D4.h[]) hVar3.f529c) != null || i10 > i9) {
                break;
            }
            fVar.I(hVar3.f527a);
            i9 -= i10;
            hVar2 = hVar;
        }
        return fVar.f(fVar.f5524g);
    }

    public final int e(int i7, int i8) {
        int i9 = i7 & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte readByte = this.f4058c.readByte();
            byte[] bArr = Y5.c.f3099a;
            int i11 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i8 + (i11 << i10);
            }
            i8 += (readByte & Byte.MAX_VALUE) << i10;
            i10 += 7;
        }
    }
}
