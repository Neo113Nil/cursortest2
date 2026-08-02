package g1;

import S0.h;
import T.C0096n;
import T.C0097o;
import T.G;
import W.J;
import W.u;
import java.math.RoundingMode;
import y0.F;
import y0.p;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437a implements InterfaceC0438b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f8998m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final p f8999a;

    /* renamed from: b, reason: collision with root package name */
    public final F f9000b;

    /* renamed from: c, reason: collision with root package name */
    public final h f9001c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9002d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f9003e;

    /* renamed from: f, reason: collision with root package name */
    public final u f9004f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9005g;

    /* renamed from: h, reason: collision with root package name */
    public final C0097o f9006h;

    /* renamed from: i, reason: collision with root package name */
    public int f9007i;

    /* renamed from: j, reason: collision with root package name */
    public long f9008j;

    /* renamed from: k, reason: collision with root package name */
    public int f9009k;

    /* renamed from: l, reason: collision with root package name */
    public long f9010l;

    public C0437a(p pVar, F f4, h hVar) {
        this.f8999a = pVar;
        this.f9000b = f4;
        this.f9001c = hVar;
        int i4 = hVar.f2419b;
        int max = Math.max(1, i4 / 10);
        this.f9005g = max;
        u uVar = new u((byte[]) hVar.f2422e);
        uVar.s();
        int s4 = uVar.s();
        this.f9002d = s4;
        int i5 = hVar.f2418a;
        int i6 = hVar.f2420c;
        int i7 = (((i6 - (i5 * 4)) * 8) / (hVar.f2421d * i5)) + 1;
        if (s4 != i7) {
            throw G.a(null, "Expected frames per block: " + i7 + "; got: " + s4);
        }
        int g4 = J.g(max, s4);
        this.f9003e = new byte[g4 * i6];
        this.f9004f = new u(s4 * 2 * i5 * g4);
        int i8 = ((i6 * i4) * 8) / s4;
        C0096n c0096n = new C0096n();
        c0096n.f2831m = T.F.n("audio/raw");
        c0096n.f2826h = i8;
        c0096n.f2827i = i8;
        c0096n.n = max * 2 * i5;
        c0096n.f2810E = i5;
        c0096n.f2811F = i4;
        c0096n.f2812G = 2;
        this.f9006h = new C0097o(c0096n);
    }

    @Override // g1.InterfaceC0438b
    public final void a(long j4) {
        this.f9007i = 0;
        this.f9008j = j4;
        this.f9009k = 0;
        this.f9010l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // g1.InterfaceC0438b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(y0.o r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C0437a.b(y0.o, long):boolean");
    }

    @Override // g1.InterfaceC0438b
    public final void c(int i4, long j4) {
        g gVar = new g(this.f9001c, this.f9002d, i4, j4);
        this.f8999a.x(gVar);
        C0097o c0097o = this.f9006h;
        F f4 = this.f9000b;
        f4.d(c0097o);
        f4.c(gVar.f9034e);
    }

    public final void d(int i4) {
        long j4 = this.f9008j;
        long j5 = this.f9010l;
        h hVar = this.f9001c;
        long j6 = hVar.f2419b;
        String str = J.f3263a;
        long U4 = j4 + J.U(j5, 1000000L, j6, RoundingMode.DOWN);
        int i5 = i4 * 2 * hVar.f2418a;
        this.f9000b.e(U4, 1, i5, this.f9009k - i5, null);
        this.f9010l += i4;
        this.f9009k -= i5;
    }
}
