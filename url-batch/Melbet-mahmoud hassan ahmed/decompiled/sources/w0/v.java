package w0;

import java.util.Collections;
import java.util.List;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f22966a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22969d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22970e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22971f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22972g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22973h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22974i;

    /* renamed from: j, reason: collision with root package name */
    public final long f22975j;

    /* renamed from: k, reason: collision with root package name */
    public final a f22976k;

    /* renamed from: l, reason: collision with root package name */
    private final j1.a f22977l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f22978a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f22979b;

        public a(long[] jArr, long[] jArr2) {
            this.f22978a = jArr;
            this.f22979b = jArr2;
        }
    }

    private v(int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, a aVar, j1.a aVar2) {
        this.f22966a = i7;
        this.f22967b = i8;
        this.f22968c = i9;
        this.f22969d = i10;
        this.f22970e = i11;
        this.f22971f = j(i11);
        this.f22972g = i12;
        this.f22973h = i13;
        this.f22974i = e(i13);
        this.f22975j = j7;
        this.f22976k = aVar;
        this.f22977l = aVar2;
    }

    public v(byte[] bArr, int i7) {
        o2.z zVar = new o2.z(bArr);
        zVar.p(i7 * 8);
        this.f22966a = zVar.h(16);
        this.f22967b = zVar.h(16);
        this.f22968c = zVar.h(24);
        this.f22969d = zVar.h(24);
        int h7 = zVar.h(20);
        this.f22970e = h7;
        this.f22971f = j(h7);
        this.f22972g = zVar.h(3) + 1;
        int h8 = zVar.h(5) + 1;
        this.f22973h = h8;
        this.f22974i = e(h8);
        this.f22975j = zVar.j(36);
        this.f22976k = null;
        this.f22977l = null;
    }

    private static int e(int i7) {
        if (i7 == 8) {
            return 1;
        }
        if (i7 == 12) {
            return 2;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 != 20) {
            return i7 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int j(int i7) {
        switch (i7) {
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

    public v a(List<m1.a> list) {
        return new v(this.f22966a, this.f22967b, this.f22968c, this.f22969d, this.f22970e, this.f22972g, this.f22973h, this.f22975j, this.f22976k, h(new j1.a(list)));
    }

    public v b(a aVar) {
        return new v(this.f22966a, this.f22967b, this.f22968c, this.f22969d, this.f22970e, this.f22972g, this.f22973h, this.f22975j, aVar, this.f22977l);
    }

    public v c(List<String> list) {
        return new v(this.f22966a, this.f22967b, this.f22968c, this.f22969d, this.f22970e, this.f22972g, this.f22973h, this.f22975j, this.f22976k, h(h0.c(list)));
    }

    public long d() {
        long j7;
        long j8;
        int i7 = this.f22969d;
        if (i7 > 0) {
            j7 = (i7 + this.f22968c) / 2;
            j8 = 1;
        } else {
            int i8 = this.f22966a;
            j7 = ((((i8 != this.f22967b || i8 <= 0) ? 4096L : i8) * this.f22972g) * this.f22973h) / 8;
            j8 = 64;
        }
        return j7 + j8;
    }

    public long f() {
        long j7 = this.f22975j;
        if (j7 == 0) {
            return -9223372036854775807L;
        }
        return (j7 * 1000000) / this.f22970e;
    }

    public s1 g(byte[] bArr, j1.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i7 = this.f22969d;
        if (i7 <= 0) {
            i7 = -1;
        }
        return new s1.b().e0("audio/flac").W(i7).H(this.f22972g).f0(this.f22970e).T(Collections.singletonList(bArr)).X(h(aVar)).E();
    }

    public j1.a h(j1.a aVar) {
        j1.a aVar2 = this.f22977l;
        return aVar2 == null ? aVar : aVar2.c(aVar);
    }

    public long i(long j7) {
        return m0.r((j7 * this.f22970e) / 1000000, 0L, this.f22975j - 1);
    }
}
