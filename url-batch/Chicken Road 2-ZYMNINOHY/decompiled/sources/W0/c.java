package W0;

import W.AbstractC0108a;
import W.u;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C0583e9;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: i, reason: collision with root package name */
    public final int f3401i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3402j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3403k;
    public List o;

    /* renamed from: p, reason: collision with root package name */
    public List f3406p;

    /* renamed from: q, reason: collision with root package name */
    public int f3407q;

    /* renamed from: r, reason: collision with root package name */
    public int f3408r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3409s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3410t;

    /* renamed from: u, reason: collision with root package name */
    public byte f3411u;
    public byte v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3413x;

    /* renamed from: y, reason: collision with root package name */
    public long f3414y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f3393A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f3394B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f3395C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, BuildConfig.API_LEVEL, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f3396D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f3397E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f3398F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    public static final boolean[] f3399G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final u f3400h = new u();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3405m = new ArrayList();
    public b n = new b(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f3412w = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f3404l = 16000000;

    public c(String str, int i4) {
        this.f3401i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i4 == 1) {
            this.f3403k = 0;
            this.f3402j = 0;
        } else if (i4 == 2) {
            this.f3403k = 1;
            this.f3402j = 0;
        } else if (i4 == 3) {
            this.f3403k = 0;
            this.f3402j = 1;
        } else if (i4 != 4) {
            AbstractC0108a.s("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f3403k = 0;
            this.f3402j = 0;
        } else {
            this.f3403k = 1;
            this.f3402j = 1;
        }
        l(0);
        k();
        this.f3413x = true;
        this.f3414y = -9223372036854775807L;
    }

    @Override // W0.h
    public final t1.h f() {
        List list = this.o;
        this.f3406p = list;
        list.getClass();
        return new t1.h(22, list);
    }

    @Override // W0.h, Z.c
    public final void flush() {
        super.flush();
        this.o = null;
        this.f3406p = null;
        l(0);
        this.f3408r = 4;
        this.n.f3392h = 4;
        k();
        this.f3409s = false;
        this.f3410t = false;
        this.f3411u = (byte) 0;
        this.v = (byte) 0;
        this.f3412w = 0;
        this.f3413x = true;
        this.f3414y = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // W0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(g gVar) {
        boolean z4;
        ByteBuffer byteBuffer = gVar.f3781e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        u uVar = this.f3400h;
        uVar.K(limit, array);
        boolean z5 = false;
        while (true) {
            int a3 = uVar.a();
            int i4 = this.f3401i;
            if (a3 < i4) {
                if (z5) {
                    int i5 = this.f3407q;
                    if (i5 == 1 || i5 == 3) {
                        this.o = j();
                        this.f3414y = this.f3458e;
                        return;
                    }
                    return;
                }
                return;
            }
            int z6 = i4 == 2 ? -4 : uVar.z();
            int z7 = uVar.z();
            int z8 = uVar.z();
            if ((z6 & 2) == 0 && (z6 & 1) == this.f3402j) {
                byte b4 = (byte) (z7 & 127);
                byte b5 = (byte) (z8 & 127);
                if (b4 != 0 || b5 != 0) {
                    boolean z9 = this.f3409s;
                    if ((z6 & 4) == 4) {
                        boolean[] zArr = f3399G;
                        if (zArr[z7] && zArr[z8]) {
                            z4 = true;
                            this.f3409s = z4;
                            if (z4 || (b4 & 240) != 16) {
                                this.f3410t = false;
                            } else if (this.f3410t && this.f3411u == b4 && this.v == b5) {
                                this.f3410t = false;
                            } else {
                                this.f3410t = true;
                                this.f3411u = b4;
                                this.v = b5;
                            }
                            if (!z4) {
                                if (1 <= b4 && b4 <= 15) {
                                    this.f3413x = false;
                                } else if ((b4 & 246) == 20) {
                                    if (b5 != 32 && b5 != 47) {
                                        switch (b5) {
                                            default:
                                                switch (b5) {
                                                    case C0583e9.f11752M /* 42 */:
                                                    case 43:
                                                        this.f3413x = false;
                                                        break;
                                                }
                                            case 37:
                                            case C0583e9.f11751K /* 38 */:
                                            case 39:
                                                this.f3413x = true;
                                                break;
                                        }
                                    }
                                    this.f3413x = true;
                                }
                                if (this.f3413x) {
                                    int i6 = b4 & 224;
                                    if (i6 == 0) {
                                        this.f3412w = (b4 >> 3) & 1;
                                    }
                                    if (this.f3412w == this.f3403k) {
                                        if (i6 == 0) {
                                            int i7 = b4 & 247;
                                            if (i7 == 17 && (b5 & 240) == 48) {
                                                this.n.a((char) f3396D[b5 & 15]);
                                            } else {
                                                int i8 = b4 & 246;
                                                if (i8 == 18 && (b5 & 224) == 32) {
                                                    this.n.b();
                                                    this.n.a((char) ((b4 & 1) == 0 ? f3397E[b5 & 31] : f3398F[b5 & 31]));
                                                } else if (i7 == 17 && (b5 & 240) == 32) {
                                                    this.n.a(' ');
                                                    boolean z10 = (b5 & 1) == 1;
                                                    b bVar = this.n;
                                                    bVar.f3385a.add(new a((b5 >> 1) & 7, z10, bVar.f3387c.length()));
                                                } else if ((b4 & 240) == 16 && (b5 & 192) == 64) {
                                                    int i9 = z[b4 & 7];
                                                    if ((b5 & 32) != 0) {
                                                        i9++;
                                                    }
                                                    b bVar2 = this.n;
                                                    if (i9 != bVar2.f3388d) {
                                                        if (this.f3407q != 1 && !bVar2.e()) {
                                                            b bVar3 = new b(this.f3407q, this.f3408r);
                                                            this.n = bVar3;
                                                            this.f3405m.add(bVar3);
                                                        }
                                                        this.n.f3388d = i9;
                                                    }
                                                    boolean z11 = (b5 & 16) == 16;
                                                    boolean z12 = (b5 & 1) == 1;
                                                    int i10 = (b5 >> 1) & 7;
                                                    b bVar4 = this.n;
                                                    bVar4.f3385a.add(new a(z11 ? 8 : i10, z12, bVar4.f3387c.length()));
                                                    if (z11) {
                                                        this.n.f3389e = f3393A[i10];
                                                    }
                                                } else if (i7 == 23 && b5 >= 33 && b5 <= 35) {
                                                    this.n.f3390f = b5 - 32;
                                                } else if (i8 == 20 && (b5 & 240) == 32) {
                                                    if (b5 == 32) {
                                                        l(2);
                                                    } else if (b5 != 41) {
                                                        switch (b5) {
                                                            case 37:
                                                                l(1);
                                                                this.f3408r = 2;
                                                                this.n.f3392h = 2;
                                                                break;
                                                            case C0583e9.f11751K /* 38 */:
                                                                l(1);
                                                                this.f3408r = 3;
                                                                this.n.f3392h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.f3408r = 4;
                                                                this.n.f3392h = 4;
                                                                break;
                                                            default:
                                                                int i11 = this.f3407q;
                                                                if (i11 != 0) {
                                                                    if (b5 == 33) {
                                                                        this.n.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b5) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (i11 == 1 || i11 == 3) {
                                                                                    k();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i11 == 1 && !this.n.e()) {
                                                                                    b bVar5 = this.n;
                                                                                    ArrayList arrayList = bVar5.f3386b;
                                                                                    arrayList.add(bVar5.d());
                                                                                    bVar5.f3387c.setLength(0);
                                                                                    bVar5.f3385a.clear();
                                                                                    int min = Math.min(bVar5.f3392h, bVar5.f3388d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            b bVar6 = this.n;
                                            int[] iArr = f3395C;
                                            bVar6.a((char) iArr[(b4 & Byte.MAX_VALUE) - 32]);
                                            if ((b5 & 224) != 0) {
                                                this.n.a((char) iArr[(b5 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z5 = true;
                                    }
                                }
                            } else if (z9) {
                                k();
                                z5 = true;
                            }
                        }
                    }
                    z4 = false;
                    this.f3409s = z4;
                    if (z4) {
                    }
                    this.f3410t = false;
                    if (!z4) {
                    }
                }
            }
        }
    }

    @Override // W0.h, Z.c
    /* renamed from: h */
    public final V0.c c() {
        V0.c cVar;
        V0.c c4 = super.c();
        if (c4 != null) {
            return c4;
        }
        long j4 = this.f3404l;
        if (j4 == -9223372036854775807L) {
            return null;
        }
        long j5 = this.f3414y;
        if (j5 == -9223372036854775807L || this.f3458e - j5 < j4 || (cVar = (V0.c) this.f3455b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.f3414y = -9223372036854775807L;
        t1.h f4 = f();
        long j6 = this.f3458e;
        cVar.f3786c = j6;
        cVar.f3189e = f4;
        cVar.f3190f = j6;
        return cVar;
    }

    @Override // W0.h
    public final boolean i() {
        return this.o != this.f3406p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.f3405m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i4 = 2;
        for (int i5 = 0; i5 < size; i5++) {
            V.b c4 = ((b) arrayList.get(i5)).c(Integer.MIN_VALUE);
            arrayList2.add(c4);
            if (c4 != null) {
                i4 = Math.min(i4, c4.f3155i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            V.b bVar = (V.b) arrayList2.get(i6);
            if (bVar != null) {
                if (bVar.f3155i != i4) {
                    bVar = ((b) arrayList.get(i6)).c(i4);
                    bVar.getClass();
                }
                arrayList3.add(bVar);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.n;
        bVar.f3391g = this.f3407q;
        bVar.f3385a.clear();
        bVar.f3386b.clear();
        bVar.f3387c.setLength(0);
        bVar.f3388d = 15;
        bVar.f3389e = 0;
        bVar.f3390f = 0;
        ArrayList arrayList = this.f3405m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void l(int i4) {
        int i5 = this.f3407q;
        if (i5 == i4) {
            return;
        }
        this.f3407q = i4;
        if (i4 != 3) {
            k();
            if (i5 == 3 || i4 == 1 || i4 == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f3405m;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i6)).f3391g = i4;
            i6++;
        }
    }

    @Override // W0.h, Z.c
    public final void release() {
    }
}
