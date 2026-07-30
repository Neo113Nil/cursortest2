package l8;

import java.util.ArrayList;
import java.util.Arrays;
import r7.AbstractC4978i;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final u8.e f39121a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39123c;

    /* renamed from: g, reason: collision with root package name */
    public int f39127g;

    /* renamed from: h, reason: collision with root package name */
    public int f39128h;

    /* renamed from: b, reason: collision with root package name */
    public int f39122b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f39124d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public C4712d[] f39125e = new C4712d[8];

    /* renamed from: f, reason: collision with root package name */
    public int f39126f = 7;

    public f(u8.e eVar) {
        this.f39121a = eVar;
    }

    public final void a(int i) {
        int i4;
        if (i > 0) {
            int length = this.f39125e.length - 1;
            int i9 = 0;
            while (true) {
                i4 = this.f39126f;
                if (length < i4 || i <= 0) {
                    break;
                }
                C4712d c4712d = this.f39125e[length];
                kotlin.jvm.internal.h.b(c4712d);
                i -= c4712d.f39113c;
                int i10 = this.f39128h;
                C4712d c4712d2 = this.f39125e[length];
                kotlin.jvm.internal.h.b(c4712d2);
                this.f39128h = i10 - c4712d2.f39113c;
                this.f39127g--;
                i9++;
                length--;
            }
            C4712d[] c4712dArr = this.f39125e;
            int i11 = i4 + 1;
            System.arraycopy(c4712dArr, i11, c4712dArr, i11 + i9, this.f39127g);
            C4712d[] c4712dArr2 = this.f39125e;
            int i12 = this.f39126f + 1;
            Arrays.fill(c4712dArr2, i12, i12 + i9, (Object) null);
            this.f39126f += i9;
        }
    }

    public final void b(C4712d c4712d) {
        int i = this.f39124d;
        int i4 = c4712d.f39113c;
        if (i4 > i) {
            C4712d[] c4712dArr = this.f39125e;
            AbstractC4978i.M(c4712dArr, 0, c4712dArr.length);
            this.f39126f = this.f39125e.length - 1;
            this.f39127g = 0;
            this.f39128h = 0;
            return;
        }
        a((this.f39128h + i4) - i);
        int i9 = this.f39127g + 1;
        C4712d[] c4712dArr2 = this.f39125e;
        if (i9 > c4712dArr2.length) {
            C4712d[] c4712dArr3 = new C4712d[c4712dArr2.length * 2];
            System.arraycopy(c4712dArr2, 0, c4712dArr3, c4712dArr2.length, c4712dArr2.length);
            this.f39126f = this.f39125e.length - 1;
            this.f39125e = c4712dArr3;
        }
        int i10 = this.f39126f;
        this.f39126f = i10 - 1;
        this.f39125e[i10] = c4712d;
        this.f39127g++;
        this.f39128h += i4;
    }

    public final void c(u8.h data) {
        kotlin.jvm.internal.h.e(data, "data");
        u8.e eVar = this.f39121a;
        int[] iArr = B.f39089a;
        int a9 = data.a();
        long j9 = 0;
        for (int i = 0; i < a9; i++) {
            byte e6 = data.e(i);
            byte[] bArr = f8.c.f37814a;
            j9 += B.f39090b[e6 & 255];
        }
        if (((int) ((j9 + 7) >> 3)) >= data.a()) {
            e(data.a(), com.anythink.expressad.video.module.a.a.f21886R, 0);
            eVar.K(data);
            return;
        }
        u8.e eVar2 = new u8.e();
        int[] iArr2 = B.f39089a;
        int a10 = data.a();
        long j10 = 0;
        int i4 = 0;
        for (int i9 = 0; i9 < a10; i9++) {
            byte e9 = data.e(i9);
            byte[] bArr2 = f8.c.f37814a;
            int i10 = e9 & 255;
            int i11 = B.f39089a[i10];
            byte b9 = B.f39090b[i10];
            j10 = (j10 << b9) | i11;
            i4 += b9;
            while (i4 >= 8) {
                i4 -= 8;
                eVar2.X((int) (j10 >> i4));
            }
        }
        if (i4 > 0) {
            eVar2.X((int) ((255 >>> i4) | (j10 << (8 - i4))));
        }
        u8.h B8 = eVar2.B(eVar2.f41277u);
        e(B8.a(), com.anythink.expressad.video.module.a.a.f21886R, 128);
        eVar.K(B8);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i4;
        if (this.f39123c) {
            int i9 = this.f39122b;
            if (i9 < this.f39124d) {
                e(i9, 31, 32);
            }
            this.f39123c = false;
            this.f39122b = Integer.MAX_VALUE;
            e(this.f39124d, 31, 32);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4712d c4712d = (C4712d) arrayList.get(i10);
            u8.h j9 = c4712d.f39111a.j();
            Integer num = (Integer) g.f39130b.get(j9);
            u8.h hVar = c4712d.f39112b;
            if (num != null) {
                int intValue = num.intValue();
                i4 = intValue + 1;
                if (2 <= i4 && i4 < 8) {
                    C4712d[] c4712dArr = g.f39129a;
                    if (kotlin.jvm.internal.h.a(c4712dArr[intValue].f39112b, hVar)) {
                        i = i4;
                    } else if (kotlin.jvm.internal.h.a(c4712dArr[i4].f39112b, hVar)) {
                        i4 = intValue + 2;
                        i = i4;
                    }
                }
                i = i4;
                i4 = -1;
            } else {
                i = -1;
                i4 = -1;
            }
            if (i4 == -1) {
                int i11 = this.f39126f + 1;
                int length = this.f39125e.length;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    C4712d c4712d2 = this.f39125e[i11];
                    kotlin.jvm.internal.h.b(c4712d2);
                    if (kotlin.jvm.internal.h.a(c4712d2.f39111a, j9)) {
                        C4712d c4712d3 = this.f39125e[i11];
                        kotlin.jvm.internal.h.b(c4712d3);
                        if (kotlin.jvm.internal.h.a(c4712d3.f39112b, hVar)) {
                            i4 = g.f39129a.length + (i11 - this.f39126f);
                            break;
                        } else if (i == -1) {
                            i = (i11 - this.f39126f) + g.f39129a.length;
                        }
                    }
                    i11++;
                }
            }
            if (i4 != -1) {
                e(i4, com.anythink.expressad.video.module.a.a.f21886R, 128);
            } else if (i == -1) {
                this.f39121a.X(64);
                c(j9);
                c(hVar);
                b(c4712d);
            } else {
                u8.h prefix = C4712d.f39106d;
                j9.getClass();
                kotlin.jvm.internal.h.e(prefix, "prefix");
                if (!j9.g(prefix, prefix.a()) || kotlin.jvm.internal.h.a(C4712d.i, j9)) {
                    e(i, 63, 64);
                    c(hVar);
                    b(c4712d);
                } else {
                    e(i, 15, 0);
                    c(hVar);
                }
            }
        }
    }

    public final void e(int i, int i4, int i9) {
        u8.e eVar = this.f39121a;
        if (i < i4) {
            eVar.X(i | i9);
            return;
        }
        eVar.X(i9 | i4);
        int i10 = i - i4;
        while (i10 >= 128) {
            eVar.X(128 | (i10 & com.anythink.expressad.video.module.a.a.f21886R));
            i10 >>>= 7;
        }
        eVar.X(i10);
    }
}
