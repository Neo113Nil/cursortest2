package z7;

import java.io.IOException;
import java.util.ArrayList;
import l.f2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final f8.a0 f10144c;

    /* renamed from: f, reason: collision with root package name */
    public int f10147f;

    /* renamed from: g, reason: collision with root package name */
    public int f10148g;

    /* renamed from: a, reason: collision with root package name */
    public int f10142a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10143b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public b[] f10145d = new b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f10146e = 7;

    public c(q qVar) {
        this.f10144c = a8.d.n(qVar);
    }

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        if (i7 > 0) {
            int length = this.f10145d.length;
            while (true) {
                length--;
                i8 = this.f10146e;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                b bVar = this.f10145d[length];
                r6.k.c(bVar);
                int i10 = bVar.f10141c;
                i7 -= i10;
                this.f10148g -= i10;
                this.f10147f--;
                i9++;
            }
            b[] bVarArr = this.f10145d;
            System.arraycopy(bVarArr, i8 + 1, bVarArr, i8 + 1 + i9, this.f10147f);
            this.f10146e += i9;
        }
        return i9;
    }

    public final f8.i b(int i7) {
        if (i7 >= 0) {
            b[] bVarArr = e.f10157a;
            if (i7 <= bVarArr.length - 1) {
                return bVarArr[i7].f10139a;
            }
        }
        int length = this.f10146e + 1 + (i7 - e.f10157a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f10145d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                r6.k.c(bVar);
                return bVar.f10139a;
            }
        }
        throw new IOException("Header index too large " + (i7 + 1));
    }

    public final void c(b bVar) {
        this.f10143b.add(bVar);
        int i7 = bVar.f10141c;
        int i8 = this.f10142a;
        if (i7 > i8) {
            e6.k.c0(0, r7.length, null, this.f10145d);
            this.f10146e = this.f10145d.length - 1;
            this.f10147f = 0;
            this.f10148g = 0;
            return;
        }
        a((this.f10148g + i7) - i8);
        int i9 = this.f10147f + 1;
        b[] bVarArr = this.f10145d;
        if (i9 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f10146e = this.f10145d.length - 1;
            this.f10145d = bVarArr2;
        }
        int i10 = this.f10146e;
        this.f10146e = i10 - 1;
        this.f10145d[i10] = bVar;
        this.f10147f++;
        this.f10148g += i7;
    }

    public final f8.i d() {
        f8.a0 a0Var = this.f10144c;
        byte readByte = a0Var.readByte();
        byte[] bArr = t7.b.f8932a;
        int i7 = readByte & 255;
        int i8 = 0;
        boolean z8 = (readByte & 128) == 128;
        long e9 = e(i7, 127);
        if (!z8) {
            return a0Var.h(e9);
        }
        f8.f fVar = new f8.f();
        int[] iArr = x.f10251a;
        r6.k.f(a0Var, "source");
        f2 f2Var = x.f10253c;
        f2 f2Var2 = f2Var;
        int i9 = 0;
        for (long j8 = 0; j8 < e9; j8++) {
            byte readByte2 = a0Var.readByte();
            byte[] bArr2 = t7.b.f8932a;
            i8 = (i8 << 8) | (readByte2 & 255);
            i9 += 8;
            while (i9 >= 8) {
                f2[] f2VarArr = (f2[]) f2Var2.f5491h;
                r6.k.c(f2VarArr);
                f2Var2 = f2VarArr[(i8 >>> (i9 - 8)) & 255];
                r6.k.c(f2Var2);
                if (((f2[]) f2Var2.f5491h) == null) {
                    fVar.Q(f2Var2.f5489f);
                    i9 -= f2Var2.f5490g;
                    f2Var2 = f2Var;
                } else {
                    i9 -= 8;
                }
            }
        }
        while (i9 > 0) {
            f2[] f2VarArr2 = (f2[]) f2Var2.f5491h;
            r6.k.c(f2VarArr2);
            f2 f2Var3 = f2VarArr2[(i8 << (8 - i9)) & 255];
            r6.k.c(f2Var3);
            int i10 = f2Var3.f5490g;
            if (((f2[]) f2Var3.f5491h) != null || i10 > i9) {
                break;
            }
            fVar.Q(f2Var3.f5489f);
            i9 -= i10;
            f2Var2 = f2Var;
        }
        return fVar.h(fVar.f3598g);
    }

    public final int e(int i7, int i8) {
        int i9 = i7 & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte readByte = this.f10144c.readByte();
            byte[] bArr = t7.b.f8932a;
            int i11 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i8 + (i11 << i10);
            }
            i8 += (readByte & Byte.MAX_VALUE) << i10;
            i10 += 7;
        }
    }
}
