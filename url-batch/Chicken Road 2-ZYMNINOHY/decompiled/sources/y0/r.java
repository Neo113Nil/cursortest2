package y0;

import T.C0096n;
import T.C0097o;
import W.J;
import d2.C0389g;
import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f16183a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16184b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16185c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16186d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16187e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16188f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16189g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16190h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16191i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16192j;

    /* renamed from: k, reason: collision with root package name */
    public final C0389g f16193k;

    /* renamed from: l, reason: collision with root package name */
    public final T.E f16194l;

    public r(int i4, byte[] bArr) {
        W.t tVar = new W.t(bArr.length, bArr);
        tVar.q(i4 * 8);
        this.f16183a = tVar.i(16);
        this.f16184b = tVar.i(16);
        this.f16185c = tVar.i(24);
        this.f16186d = tVar.i(24);
        int i5 = tVar.i(20);
        this.f16187e = i5;
        this.f16188f = d(i5);
        this.f16189g = tVar.i(3) + 1;
        int i6 = tVar.i(5) + 1;
        this.f16190h = i6;
        this.f16191i = a(i6);
        this.f16192j = tVar.k(36);
        this.f16193k = null;
        this.f16194l = null;
    }

    public static int a(int i4) {
        if (i4 == 8) {
            return 1;
        }
        if (i4 == 12) {
            return 2;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 == 20) {
            return 5;
        }
        if (i4 != 24) {
            return i4 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i4) {
        switch (i4) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j4 = this.f16192j;
        if (j4 == 0) {
            return -9223372036854775807L;
        }
        return (j4 * 1000000) / this.f16187e;
    }

    public final C0097o c(byte[] bArr, T.E e4) {
        bArr[4] = Byte.MIN_VALUE;
        int i4 = this.f16186d;
        if (i4 <= 0) {
            i4 = -1;
        }
        T.E e5 = this.f16194l;
        if (e5 != null) {
            e4 = e5.b(e4);
        }
        C0096n c0096n = new C0096n();
        c0096n.f2831m = T.F.n("audio/flac");
        c0096n.n = i4;
        c0096n.f2810E = this.f16189g;
        c0096n.f2811F = this.f16187e;
        String str = J.f3263a;
        c0096n.f2812G = J.B(this.f16190h, ByteOrder.LITTLE_ENDIAN);
        c0096n.f2832p = Collections.singletonList(bArr);
        c0096n.f2829k = e4;
        return new C0097o(c0096n);
    }

    public r(int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j4, C0389g c0389g, T.E e4) {
        this.f16183a = i4;
        this.f16184b = i5;
        this.f16185c = i6;
        this.f16186d = i7;
        this.f16187e = i8;
        this.f16188f = d(i8);
        this.f16189g = i9;
        this.f16190h = i10;
        this.f16191i = a(i10);
        this.f16192j = j4;
        this.f16193k = c0389g;
        this.f16194l = e4;
    }
}
