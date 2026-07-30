package com.google.android.gms.internal.ads;

import com.anythink.basead.ui.BaseATView;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class F4 implements G4 {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f24888m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f24889n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, com.anythink.expressad.video.module.a.a.f21889U, 143, 157, 173, 190, BaseATView.a.f9929H, 230, 253, com.anythink.expressad.foundation.g.a.aX, com.anythink.core.common.n.b.a.c.k.f15228a, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final PQ f24890a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3448k1 f24891b;

    /* renamed from: c, reason: collision with root package name */
    public final J4 f24892c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24893d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f24894e;

    /* renamed from: f, reason: collision with root package name */
    public final Lr f24895f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24896g;

    /* renamed from: h, reason: collision with root package name */
    public final TP f24897h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f24898j;

    /* renamed from: k, reason: collision with root package name */
    public int f24899k;

    /* renamed from: l, reason: collision with root package name */
    public long f24900l;

    public F4(PQ pq, InterfaceC3448k1 interfaceC3448k1, J4 j42) {
        this.f24890a = pq;
        this.f24891b = interfaceC3448k1;
        this.f24892c = j42;
        int i = j42.f25729b;
        int max = Math.max(1, i / 10);
        this.f24896g = max;
        Lr lr = new Lr((byte[]) j42.f25733f);
        lr.M();
        int M8 = lr.M();
        this.f24893d = M8;
        int i4 = j42.f25728a;
        int i9 = j42.f25730c;
        int i10 = (((i9 - (i4 * 4)) * 8) / (j42.f25731d * i4)) + 1;
        if (M8 != i10) {
            throw W4.a(null, D.y.n(new StringBuilder(String.valueOf(i10).length() + 34 + String.valueOf(M8).length()), "Expected frames per block: ", i10, "; got: ", M8));
        }
        String str = AbstractC3548lu.f32613a;
        int i11 = ((max + M8) - 1) / M8;
        this.f24894e = new byte[i11 * i9];
        this.f24895f = new Lr((M8 + M8) * i4 * i11);
        int i12 = ((i9 * i) * 8) / M8;
        C4065vP c4065vP = new C4065vP();
        c4065vP.e(com.anythink.basead.exoplayer.k.o.f8622w);
        c4065vP.f34780h = i12;
        c4065vP.i = i12;
        c4065vP.f34786o = (max + max) * i4;
        c4065vP.f34765F = i4;
        int i13 = j42.f25732e;
        c4065vP.f34766G = i13 != 0 ? i13 << 2 : -1;
        c4065vP.f34767H = i;
        c4065vP.f34768I = 2;
        this.f24897h = new TP(c4065vP);
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void a(int i, long j9) {
        this.f24890a.w(new L4(this.f24892c, this.f24893d, i, j9));
        this.f24891b.e(this.f24897h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:5:0x0025->B:11:0x0040], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003d -> B:3:0x0022). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.G4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(com.google.android.gms.internal.ads.J0 r25, long r26) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.F4.b(com.google.android.gms.internal.ads.J0, long):boolean");
    }

    public final void c(int i) {
        J4 j42 = this.f24892c;
        long w9 = this.f24898j + AbstractC3548lu.w(this.f24900l, 1000000L, j42.f25729b, RoundingMode.DOWN);
        int i4 = (i + i) * j42.f25728a;
        this.f24891b.b(w9, 1, i4, this.f24899k - i4, null);
        this.f24900l += i;
        this.f24899k -= i4;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void d(long j9) {
        this.i = 0;
        this.f24898j = j9;
        this.f24899k = 0;
        this.f24900l = 0L;
    }
}
