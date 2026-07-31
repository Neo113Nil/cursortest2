package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC2250tc;
import com.yandex.mobile.ads.impl.et1;
import com.yandex.mobile.ads.impl.p52;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class dt1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2250tc f24749a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24750b;

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f24751c;

    /* renamed from: d, reason: collision with root package name */
    private a f24752d;

    /* renamed from: e, reason: collision with root package name */
    private a f24753e;

    /* renamed from: f, reason: collision with root package name */
    private a f24754f;

    /* renamed from: g, reason: collision with root package name */
    private long f24755g;

    public dt1(InterfaceC2250tc interfaceC2250tc) {
        this.f24749a = interfaceC2250tc;
        int b4 = ((sy) interfaceC2250tc).b();
        this.f24750b = b4;
        this.f24751c = new sf1(32);
        a aVar = new a(b4, 0L);
        this.f24752d = aVar;
        this.f24753e = aVar;
        this.f24754f = aVar;
    }

    public final void a(long j4) {
        a aVar;
        if (j4 == -1) {
            return;
        }
        while (true) {
            aVar = this.f24752d;
            if (j4 < aVar.f24757b) {
                break;
            }
            ((sy) this.f24749a).a(aVar.f24758c);
            a aVar2 = this.f24752d;
            aVar2.f24758c = null;
            a aVar3 = aVar2.f24759d;
            aVar2.f24759d = null;
            this.f24752d = aVar3;
        }
        if (this.f24753e.f24756a < aVar.f24756a) {
            this.f24753e = aVar;
        }
    }

    public final void b(gy gyVar, et1.a aVar) {
        this.f24753e = a(this.f24753e, gyVar, aVar, this.f24751c);
    }

    public final void c() {
        this.f24753e = this.f24752d;
    }

    private static final class a implements InterfaceC2250tc.a {

        /* renamed from: a, reason: collision with root package name */
        public long f24756a;

        /* renamed from: b, reason: collision with root package name */
        public long f24757b;

        /* renamed from: c, reason: collision with root package name */
        public C2227sc f24758c;

        /* renamed from: d, reason: collision with root package name */
        public a f24759d;

        public a(int i4, long j4) {
            a(i4, j4);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2250tc.a
        public final C2227sc a() {
            C2227sc c2227sc = this.f24758c;
            c2227sc.getClass();
            return c2227sc;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC2250tc.a
        public final InterfaceC2250tc.a next() {
            a aVar = this.f24759d;
            if (aVar == null || aVar.f24758c == null) {
                return null;
            }
            return aVar;
        }

        public final void a(int i4, long j4) {
            if (this.f24758c == null) {
                this.f24756a = j4;
                this.f24757b = j4 + i4;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void b() {
        a aVar = this.f24752d;
        if (aVar.f24758c != null) {
            ((sy) this.f24749a).a(aVar);
            aVar.f24758c = null;
            aVar.f24759d = null;
        }
        this.f24752d.a(this.f24750b, 0L);
        a aVar2 = this.f24752d;
        this.f24753e = aVar2;
        this.f24754f = aVar2;
        this.f24755g = 0L;
        ((sy) this.f24749a).e();
    }

    public final long a() {
        return this.f24755g;
    }

    public final void a(gy gyVar, et1.a aVar) {
        a(this.f24753e, gyVar, aVar, this.f24751c);
    }

    private static a a(a aVar, long j4, ByteBuffer byteBuffer, int i4) {
        while (j4 >= aVar.f24757b) {
            aVar = aVar.f24759d;
        }
        while (i4 > 0) {
            int min = Math.min(i4, (int) (aVar.f24757b - j4));
            C2227sc c2227sc = aVar.f24758c;
            byteBuffer.put(c2227sc.f31677a, ((int) (j4 - aVar.f24756a)) + c2227sc.f31678b, min);
            i4 -= min;
            j4 += min;
            if (j4 == aVar.f24757b) {
                aVar = aVar.f24759d;
            }
        }
        return aVar;
    }

    private static a a(a aVar, long j4, byte[] bArr, int i4) {
        while (j4 >= aVar.f24757b) {
            aVar = aVar.f24759d;
        }
        int i5 = i4;
        while (i5 > 0) {
            int min = Math.min(i5, (int) (aVar.f24757b - j4));
            C2227sc c2227sc = aVar.f24758c;
            System.arraycopy(c2227sc.f31677a, ((int) (j4 - aVar.f24756a)) + c2227sc.f31678b, bArr, i4 - i5, min);
            i5 -= min;
            j4 += min;
            if (j4 == aVar.f24757b) {
                aVar = aVar.f24759d;
            }
        }
        return aVar;
    }

    private static a a(a aVar, gy gyVar, et1.a aVar2, sf1 sf1Var) {
        a aVar3;
        int i4;
        if (gyVar.i()) {
            long j4 = aVar2.f25457b;
            sf1Var.c(1);
            a a4 = a(aVar, j4, sf1Var.c(), 1);
            long j5 = j4 + 1;
            byte b4 = sf1Var.c()[0];
            boolean z4 = (b4 & 128) != 0;
            int i5 = b4 & Byte.MAX_VALUE;
            tu tuVar = gyVar.f26355c;
            byte[] bArr = tuVar.f32690a;
            if (bArr == null) {
                tuVar.f32690a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar3 = a(a4, j5, tuVar.f32690a, i5);
            long j6 = j5 + i5;
            if (z4) {
                sf1Var.c(2);
                aVar3 = a(aVar3, j6, sf1Var.c(), 2);
                j6 += 2;
                i4 = sf1Var.z();
            } else {
                i4 = 1;
            }
            int[] iArr = tuVar.f32693d;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = tuVar.f32694e;
            if (iArr3 == null || iArr3.length < i4) {
                iArr3 = new int[i4];
            }
            int[] iArr4 = iArr3;
            if (z4) {
                int i6 = i4 * 6;
                sf1Var.c(i6);
                aVar3 = a(aVar3, j6, sf1Var.c(), i6);
                j6 += i6;
                sf1Var.e(0);
                for (int i7 = 0; i7 < i4; i7++) {
                    iArr2[i7] = sf1Var.z();
                    iArr4[i7] = sf1Var.x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = aVar2.f25456a - ((int) (j6 - aVar2.f25457b));
            }
            p52.a aVar4 = aVar2.f25458c;
            int i8 = u82.f32873a;
            tuVar.a(i4, iArr2, iArr4, aVar4.f30346b, tuVar.f32690a, aVar4.f30345a, aVar4.f30347c, aVar4.f30348d);
            long j7 = aVar2.f25457b;
            int i9 = (int) (j6 - j7);
            aVar2.f25457b = j7 + i9;
            aVar2.f25456a -= i9;
        } else {
            aVar3 = aVar;
        }
        if (gyVar.d()) {
            sf1Var.c(4);
            a a5 = a(aVar3, aVar2.f25457b, sf1Var.c(), 4);
            int x4 = sf1Var.x();
            aVar2.f25457b += 4;
            aVar2.f25456a -= 4;
            gyVar.e(x4);
            a a6 = a(a5, aVar2.f25457b, gyVar.f26356d, x4);
            aVar2.f25457b += x4;
            int i10 = aVar2.f25456a - x4;
            aVar2.f25456a = i10;
            ByteBuffer byteBuffer = gyVar.f26359g;
            if (byteBuffer != null && byteBuffer.capacity() >= i10) {
                gyVar.f26359g.clear();
            } else {
                gyVar.f26359g = ByteBuffer.allocate(i10);
            }
            return a(a6, aVar2.f25457b, gyVar.f26359g, aVar2.f25456a);
        }
        gyVar.e(aVar2.f25456a);
        return a(aVar3, aVar2.f25457b, gyVar.f26356d, aVar2.f25456a);
    }

    public final int a(fv fvVar, int i4, boolean z4) {
        a aVar = this.f24754f;
        if (aVar.f24758c == null) {
            C2227sc a4 = ((sy) this.f24749a).a();
            a aVar2 = new a(this.f24750b, this.f24754f.f24757b);
            aVar.f24758c = a4;
            aVar.f24759d = aVar2;
        }
        int min = Math.min(i4, (int) (this.f24754f.f24757b - this.f24755g));
        a aVar3 = this.f24754f;
        C2227sc c2227sc = aVar3.f24758c;
        int read = fvVar.read(c2227sc.f31677a, ((int) (this.f24755g - aVar3.f24756a)) + c2227sc.f31678b, min);
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j4 = this.f24755g + read;
        this.f24755g = j4;
        a aVar4 = this.f24754f;
        if (j4 == aVar4.f24757b) {
            this.f24754f = aVar4.f24759d;
        }
        return read;
    }

    public final void a(int i4, sf1 sf1Var) {
        while (i4 > 0) {
            a aVar = this.f24754f;
            if (aVar.f24758c == null) {
                C2227sc a4 = ((sy) this.f24749a).a();
                a aVar2 = new a(this.f24750b, this.f24754f.f24757b);
                aVar.f24758c = a4;
                aVar.f24759d = aVar2;
            }
            int min = Math.min(i4, (int) (this.f24754f.f24757b - this.f24755g));
            a aVar3 = this.f24754f;
            C2227sc c2227sc = aVar3.f24758c;
            sf1Var.a(c2227sc.f31677a, ((int) (this.f24755g - aVar3.f24756a)) + c2227sc.f31678b, min);
            i4 -= min;
            long j4 = this.f24755g + min;
            this.f24755g = j4;
            a aVar4 = this.f24754f;
            if (j4 == aVar4.f24757b) {
                this.f24754f = aVar4.f24759d;
            }
        }
    }
}
