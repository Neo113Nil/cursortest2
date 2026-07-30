package z7;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f8.f f10149a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10151c;

    /* renamed from: g, reason: collision with root package name */
    public int f10155g;

    /* renamed from: h, reason: collision with root package name */
    public int f10156h;

    /* renamed from: b, reason: collision with root package name */
    public int f10150b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f10152d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public b[] f10153e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f10154f = 7;

    public d(f8.f fVar) {
        this.f10149a = fVar;
    }

    public final void a(int i7) {
        int i8;
        if (i7 > 0) {
            int length = this.f10153e.length - 1;
            int i9 = 0;
            while (true) {
                i8 = this.f10154f;
                if (length < i8 || i7 <= 0) {
                    break;
                }
                b bVar = this.f10153e[length];
                r6.k.c(bVar);
                i7 -= bVar.f10141c;
                int i10 = this.f10156h;
                b bVar2 = this.f10153e[length];
                r6.k.c(bVar2);
                this.f10156h = i10 - bVar2.f10141c;
                this.f10155g--;
                i9++;
                length--;
            }
            b[] bVarArr = this.f10153e;
            int i11 = i8 + 1;
            System.arraycopy(bVarArr, i11, bVarArr, i11 + i9, this.f10155g);
            b[] bVarArr2 = this.f10153e;
            int i12 = this.f10154f + 1;
            Arrays.fill(bVarArr2, i12, i12 + i9, (Object) null);
            this.f10154f += i9;
        }
    }

    public final void b(b bVar) {
        int i7 = bVar.f10141c;
        int i8 = this.f10152d;
        if (i7 > i8) {
            b[] bVarArr = this.f10153e;
            e6.k.c0(0, bVarArr.length, null, bVarArr);
            this.f10154f = this.f10153e.length - 1;
            this.f10155g = 0;
            this.f10156h = 0;
            return;
        }
        a((this.f10156h + i7) - i8);
        int i9 = this.f10155g + 1;
        b[] bVarArr2 = this.f10153e;
        if (i9 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f10154f = this.f10153e.length - 1;
            this.f10153e = bVarArr3;
        }
        int i10 = this.f10154f;
        this.f10154f = i10 - 1;
        this.f10153e[i10] = bVar;
        this.f10155g++;
        this.f10156h += i7;
    }

    public final void c(f8.i iVar) {
        r6.k.f(iVar, "data");
        int[] iArr = x.f10251a;
        int e9 = iVar.e();
        long j8 = 0;
        long j9 = 0;
        for (int i7 = 0; i7 < e9; i7++) {
            byte p6 = iVar.p(i7);
            byte[] bArr = t7.b.f8932a;
            j9 += x.f10252b[p6 & 255];
        }
        int i8 = (int) ((j9 + 7) >> 3);
        int e10 = iVar.e();
        f8.f fVar = this.f10149a;
        if (i8 >= e10) {
            e(iVar.e(), 127, 0);
            fVar.I(iVar);
            return;
        }
        f8.f fVar2 = new f8.f();
        int[] iArr2 = x.f10251a;
        int e11 = iVar.e();
        int i9 = 0;
        for (int i10 = 0; i10 < e11; i10++) {
            byte p8 = iVar.p(i10);
            byte[] bArr2 = t7.b.f8932a;
            int i11 = p8 & 255;
            int i12 = x.f10251a[i11];
            byte b9 = x.f10252b[i11];
            j8 = (j8 << b9) | i12;
            i9 += b9;
            while (i9 >= 8) {
                i9 -= 8;
                fVar2.Q((int) (j8 >> i9));
            }
        }
        if (i9 > 0) {
            fVar2.Q((int) ((j8 << (8 - i9)) | (255 >>> i9)));
        }
        f8.i h3 = fVar2.h(fVar2.f3598g);
        e(h3.e(), 127, 128);
        fVar.I(h3);
    }

    public final void d(ArrayList arrayList) {
        int i7;
        int i8;
        if (this.f10151c) {
            int i9 = this.f10150b;
            if (i9 < this.f10152d) {
                e(i9, 31, 32);
            }
            this.f10151c = false;
            this.f10150b = Integer.MAX_VALUE;
            e(this.f10152d, 31, 32);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            f8.i B = bVar.f10139a.B();
            f8.i iVar = bVar.f10140b;
            Integer num = (Integer) e.f10158b.get(B);
            if (num != null) {
                int intValue = num.intValue();
                i8 = intValue + 1;
                if (2 <= i8 && i8 < 8) {
                    b[] bVarArr = e.f10157a;
                    if (r6.k.a(bVarArr[intValue].f10140b, iVar)) {
                        i7 = i8;
                    } else if (r6.k.a(bVarArr[i8].f10140b, iVar)) {
                        i8 = intValue + 2;
                        i7 = i8;
                    }
                }
                i7 = i8;
                i8 = -1;
            } else {
                i7 = -1;
                i8 = -1;
            }
            if (i8 == -1) {
                int i11 = this.f10154f + 1;
                int length = this.f10153e.length;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    b bVar2 = this.f10153e[i11];
                    r6.k.c(bVar2);
                    if (r6.k.a(bVar2.f10139a, B)) {
                        b bVar3 = this.f10153e[i11];
                        r6.k.c(bVar3);
                        if (r6.k.a(bVar3.f10140b, iVar)) {
                            i8 = e.f10157a.length + (i11 - this.f10154f);
                            break;
                        } else if (i7 == -1) {
                            i7 = (i11 - this.f10154f) + e.f10157a.length;
                        }
                    }
                    i11++;
                }
            }
            if (i8 != -1) {
                e(i8, 127, 128);
            } else if (i7 == -1) {
                this.f10149a.Q(64);
                c(B);
                c(iVar);
                b(bVar);
            } else {
                f8.i iVar2 = b.f10133d;
                B.getClass();
                r6.k.f(iVar2, "prefix");
                if (!B.x(0, iVar2, iVar2.e()) || r6.k.a(b.f10138i, B)) {
                    e(i7, 63, 64);
                    c(iVar);
                    b(bVar);
                } else {
                    e(i7, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i7, int i8, int i9) {
        f8.f fVar = this.f10149a;
        if (i7 < i8) {
            fVar.Q(i7 | i9);
            return;
        }
        fVar.Q(i9 | i8);
        int i10 = i7 - i8;
        while (i10 >= 128) {
            fVar.Q(128 | (i10 & 127));
            i10 >>>= 7;
        }
        fVar.Q(i10);
    }
}
