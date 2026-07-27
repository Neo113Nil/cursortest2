package a5;

import g4.AbstractC0464i;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: a5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204f {

    /* renamed from: b, reason: collision with root package name */
    public final j5.f f3943b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3945d;

    /* renamed from: h, reason: collision with root package name */
    public int f3949h;

    /* renamed from: i, reason: collision with root package name */
    public int f3950i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3942a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f3944c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f3946e = Base64Utils.IO_BUFFER_SIZE;

    /* renamed from: f, reason: collision with root package name */
    public C0202d[] f3947f = new C0202d[8];

    /* renamed from: g, reason: collision with root package name */
    public int f3948g = 7;

    public C0204f(j5.f fVar) {
        this.f3943b = fVar;
    }

    public final void a(int i2) {
        int i3;
        if (i2 > 0) {
            int length = this.f3947f.length - 1;
            int i6 = 0;
            while (true) {
                i3 = this.f3948g;
                if (length < i3 || i2 <= 0) {
                    break;
                }
                C0202d c0202d = this.f3947f[length];
                kotlin.jvm.internal.i.b(c0202d);
                i2 -= c0202d.f3934c;
                int i7 = this.f3950i;
                C0202d c0202d2 = this.f3947f[length];
                kotlin.jvm.internal.i.b(c0202d2);
                this.f3950i = i7 - c0202d2.f3934c;
                this.f3949h--;
                i6++;
                length--;
            }
            C0202d[] c0202dArr = this.f3947f;
            int i8 = i3 + 1;
            System.arraycopy(c0202dArr, i8, c0202dArr, i8 + i6, this.f3949h);
            C0202d[] c0202dArr2 = this.f3947f;
            int i9 = this.f3948g + 1;
            Arrays.fill(c0202dArr2, i9, i9 + i6, (Object) null);
            this.f3948g += i6;
        }
    }

    public final void b(C0202d c0202d) {
        int i2 = this.f3946e;
        int i3 = c0202d.f3934c;
        if (i3 > i2) {
            C0202d[] c0202dArr = this.f3947f;
            AbstractC0464i.S(0, c0202dArr.length, c0202dArr);
            this.f3948g = this.f3947f.length - 1;
            this.f3949h = 0;
            this.f3950i = 0;
            return;
        }
        a((this.f3950i + i3) - i2);
        int i6 = this.f3949h + 1;
        C0202d[] c0202dArr2 = this.f3947f;
        if (i6 > c0202dArr2.length) {
            C0202d[] c0202dArr3 = new C0202d[c0202dArr2.length * 2];
            System.arraycopy(c0202dArr2, 0, c0202dArr3, c0202dArr2.length, c0202dArr2.length);
            this.f3948g = this.f3947f.length - 1;
            this.f3947f = c0202dArr3;
        }
        int i7 = this.f3948g;
        this.f3948g = i7 - 1;
        this.f3947f[i7] = c0202d;
        this.f3949h++;
        this.f3950i += i3;
    }

    public final void c(j5.i data) {
        kotlin.jvm.internal.i.e(data, "data");
        j5.f fVar = this.f3943b;
        if (this.f3942a) {
            int[] iArr = D.f3909a;
            int a6 = data.a();
            long j2 = 0;
            for (int i2 = 0; i2 < a6; i2++) {
                byte d6 = data.d(i2);
                byte[] bArr = U4.c.f3176a;
                j2 += D.f3910b[d6 & 255];
            }
            if (((int) ((j2 + 7) >> 3)) < data.a()) {
                j5.f fVar2 = new j5.f();
                int[] iArr2 = D.f3909a;
                int a7 = data.a();
                long j6 = 0;
                int i3 = 0;
                for (int i6 = 0; i6 < a7; i6++) {
                    byte d7 = data.d(i6);
                    byte[] bArr2 = U4.c.f3176a;
                    int i7 = d7 & 255;
                    int i8 = D.f3909a[i7];
                    byte b6 = D.f3910b[i7];
                    j6 = (j6 << b6) | i8;
                    i3 += b6;
                    while (i3 >= 8) {
                        i3 -= 8;
                        fVar2.J((int) (j6 >> i3));
                    }
                }
                if (i3 > 0) {
                    fVar2.J((int) ((255 >>> i3) | (j6 << (8 - i3))));
                }
                j5.i o2 = fVar2.o(fVar2.f10495b);
                e(o2.a(), 127, 128);
                fVar.G(o2);
                return;
            }
        }
        e(data.a(), 127, 0);
        fVar.G(data);
    }

    public final void d(ArrayList arrayList) {
        int i2;
        int i3;
        if (this.f3945d) {
            int i6 = this.f3944c;
            if (i6 < this.f3946e) {
                e(i6, 31, 32);
            }
            this.f3945d = false;
            this.f3944c = Integer.MAX_VALUE;
            e(this.f3946e, 31, 32);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0202d c0202d = (C0202d) arrayList.get(i7);
            j5.i i8 = c0202d.f3932a.i();
            Integer num = (Integer) AbstractC0205g.f3952b.get(i8);
            j5.i iVar = c0202d.f3933b;
            if (num != null) {
                int intValue = num.intValue();
                i3 = intValue + 1;
                if (2 <= i3 && i3 < 8) {
                    C0202d[] c0202dArr = AbstractC0205g.f3951a;
                    if (kotlin.jvm.internal.i.a(c0202dArr[intValue].f3933b, iVar)) {
                        i2 = i3;
                    } else if (kotlin.jvm.internal.i.a(c0202dArr[i3].f3933b, iVar)) {
                        i3 = intValue + 2;
                        i2 = i3;
                    }
                }
                i2 = i3;
                i3 = -1;
            } else {
                i2 = -1;
                i3 = -1;
            }
            if (i3 == -1) {
                int i9 = this.f3948g + 1;
                int length = this.f3947f.length;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    C0202d c0202d2 = this.f3947f[i9];
                    kotlin.jvm.internal.i.b(c0202d2);
                    if (kotlin.jvm.internal.i.a(c0202d2.f3932a, i8)) {
                        C0202d c0202d3 = this.f3947f[i9];
                        kotlin.jvm.internal.i.b(c0202d3);
                        if (kotlin.jvm.internal.i.a(c0202d3.f3933b, iVar)) {
                            i3 = AbstractC0205g.f3951a.length + (i9 - this.f3948g);
                            break;
                        } else if (i2 == -1) {
                            i2 = (i9 - this.f3948g) + AbstractC0205g.f3951a.length;
                        }
                    }
                    i9++;
                }
            }
            if (i3 != -1) {
                e(i3, 127, 128);
            } else if (i2 == -1) {
                this.f3943b.J(64);
                c(i8);
                c(iVar);
                b(c0202d);
            } else {
                j5.i prefix = C0202d.f3926d;
                i8.getClass();
                kotlin.jvm.internal.i.e(prefix, "prefix");
                if (!i8.f(prefix, prefix.a()) || kotlin.jvm.internal.i.a(C0202d.f3931i, i8)) {
                    e(i2, 63, 64);
                    c(iVar);
                    b(c0202d);
                } else {
                    e(i2, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i2, int i3, int i6) {
        j5.f fVar = this.f3943b;
        if (i2 < i3) {
            fVar.J(i2 | i6);
            return;
        }
        fVar.J(i6 | i3);
        int i7 = i2 - i3;
        while (i7 >= 128) {
            fVar.J(128 | (i7 & 127));
            i7 >>>= 7;
        }
        fVar.J(i7);
    }
}
