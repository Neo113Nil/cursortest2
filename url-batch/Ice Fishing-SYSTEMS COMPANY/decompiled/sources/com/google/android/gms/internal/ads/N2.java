package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class N2 implements O0 {

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f26417N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: O, reason: collision with root package name */
    public static final TP f26418O;

    /* renamed from: A, reason: collision with root package name */
    public M2 f26419A;

    /* renamed from: B, reason: collision with root package name */
    public int f26420B;

    /* renamed from: C, reason: collision with root package name */
    public int f26421C;

    /* renamed from: D, reason: collision with root package name */
    public int f26422D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f26423E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f26424F;

    /* renamed from: G, reason: collision with root package name */
    public Q0 f26425G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC3448k1[] f26426H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC3448k1[] f26427I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f26428K;

    /* renamed from: L, reason: collision with root package name */
    public long f26429L;

    /* renamed from: M, reason: collision with root package name */
    public long f26430M;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3720p3 f26431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26432b;

    /* renamed from: c, reason: collision with root package name */
    public final List f26433c;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f26438h;
    public final Lr i;

    /* renamed from: n, reason: collision with root package name */
    public final C2728Pl f26443n;

    /* renamed from: o, reason: collision with root package name */
    public final C3761pr f26444o;

    /* renamed from: p, reason: collision with root package name */
    public C3675oC f26445p;

    /* renamed from: q, reason: collision with root package name */
    public int f26446q;

    /* renamed from: r, reason: collision with root package name */
    public int f26447r;

    /* renamed from: s, reason: collision with root package name */
    public long f26448s;

    /* renamed from: t, reason: collision with root package name */
    public int f26449t;

    /* renamed from: u, reason: collision with root package name */
    public Lr f26450u;

    /* renamed from: v, reason: collision with root package name */
    public long f26451v;

    /* renamed from: w, reason: collision with root package name */
    public int f26452w;

    /* renamed from: x, reason: collision with root package name */
    public long f26453x;

    /* renamed from: y, reason: collision with root package name */
    public long f26454y;

    /* renamed from: z, reason: collision with root package name */
    public long f26455z;

    /* renamed from: j, reason: collision with root package name */
    public final C2881Yl f26439j = new C2881Yl(5);

    /* renamed from: k, reason: collision with root package name */
    public final Lr f26440k = new Lr(16);

    /* renamed from: e, reason: collision with root package name */
    public final Lr f26435e = new Lr(PA.f26862N);

    /* renamed from: f, reason: collision with root package name */
    public final Lr f26436f = new Lr(6);

    /* renamed from: g, reason: collision with root package name */
    public final Lr f26437g = new Lr();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f26441l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f26442m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f26434d = new SparseArray();

    static {
        C4065vP c4065vP = new C4065vP();
        c4065vP.e(com.anythink.basead.exoplayer.k.o.ai);
        f26418O = new TP(c4065vP);
    }

    public N2(InterfaceC3720p3 interfaceC3720p3, int i, UB ub) {
        this.f26431a = interfaceC3720p3;
        this.f26432b = i;
        this.f26433c = Collections.unmodifiableList(ub);
        byte[] bArr = new byte[16];
        this.f26438h = bArr;
        this.i = new Lr(bArr);
        SB sb = UB.f27942u;
        this.f26445p = C3675oC.f33115x;
        this.f26454y = com.anythink.basead.exoplayer.b.f6539b;
        this.f26453x = com.anythink.basead.exoplayer.b.f6539b;
        this.f26455z = com.anythink.basead.exoplayer.b.f6539b;
        this.f26425G = Q0.f27098l0;
        this.f26426H = new InterfaceC3448k1[0];
        this.f26427I = new InterfaceC3448k1[0];
        this.f26443n = new C2728Pl(new Vx(3, this));
        this.f26444o = new C3761pr(2);
        this.f26429L = -1L;
        this.f26430M = -1L;
    }

    public static void i(int i) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw W4.a(null, sb.toString());
    }

    public static void j(Lr lr, int i, Z2 z22) {
        lr.E(i + 8);
        int b9 = lr.b();
        byte[] bArr = H2.f25279a;
        if ((b9 & 1) != 0) {
            throw W4.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z8 = (b9 & 2) != 0;
        int h9 = lr.h();
        if (h9 == 0) {
            Arrays.fill(z22.f28953l, 0, z22.f28947e, false);
            return;
        }
        int i4 = z22.f28947e;
        if (h9 != i4) {
            throw W4.a(null, D.y.n(new StringBuilder(String.valueOf(h9).length() + 58 + String.valueOf(i4).length()), "Senc sample count ", h9, " is different from fragment sample count", i4));
        }
        Arrays.fill(z22.f28953l, 0, h9, z8);
        int B8 = lr.B();
        Lr lr2 = z22.f28955n;
        lr2.y(B8);
        z22.f28952k = true;
        z22.f28956o = true;
        lr.H(lr2.f26233a, 0, lr2.f26235c);
        lr2.E(0);
        z22.f28956o = false;
    }

    public static Pair k(long j9, Lr lr) {
        long j10;
        long j11;
        Lr lr2 = lr;
        lr2.E(8);
        int a9 = H2.a(lr2.b());
        lr2.G(4);
        long P8 = lr2.P();
        if (a9 == 0) {
            j10 = lr2.P();
            j11 = lr2.P();
        } else {
            j10 = lr2.j();
            j11 = lr2.j();
        }
        long j12 = j11 + j9;
        long w9 = AbstractC3548lu.w(j10, 1000000L, P8, RoundingMode.DOWN);
        lr2.G(2);
        int L8 = lr2.L();
        int[] iArr = new int[L8];
        long[] jArr = new long[L8];
        long[] jArr2 = new long[L8];
        long[] jArr3 = new long[L8];
        long j13 = j12;
        long j14 = w9;
        int i = 0;
        while (i < L8) {
            int b9 = lr2.b();
            if ((Integer.MIN_VALUE & b9) != 0) {
                throw W4.a(null, "Unhandled indirect reference");
            }
            long P9 = lr2.P();
            iArr[i] = b9 & Integer.MAX_VALUE;
            jArr[i] = j13;
            jArr3[i] = j14;
            j10 += P9;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long w10 = AbstractC3548lu.w(j10, 1000000L, P8, RoundingMode.DOWN);
            jArr4[i] = w10 - jArr5[i];
            lr2.G(4);
            j13 += iArr[i];
            i++;
            L8 = L8;
            lr2 = lr;
            j14 = w10;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(w9), new I0(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RO l(ArrayList arrayList) {
        int i;
        UUID uuid;
        C3562m7 c3562m7;
        UUID uuid2;
        int size = arrayList.size();
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < size) {
            C3443jx c3443jx = (C3443jx) arrayList.get(i4);
            if (c3443jx.f32624b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c3443jx.f32222c.f26233a;
                Lr lr = new Lr(bArr);
                if (lr.f26235c >= 32) {
                    lr.E(0);
                    int B8 = lr.B();
                    int b9 = lr.b();
                    if (b9 != B8) {
                        AbstractC3217fl.I("PsshAtomUtil", D.y.n(new StringBuilder(String.valueOf(b9).length() + 52 + String.valueOf(B8).length()), "Advertised atom size (", b9, ") does not match buffer size: ", B8));
                    } else {
                        int b10 = lr.b();
                        if (b10 != 1886614376) {
                            com.anythink.basead.b.c.i.s(b10, "Atom type is not pssh: ", "PsshAtomUtil", new StringBuilder(String.valueOf(b10).length() + 23));
                        } else {
                            int a9 = H2.a(lr.b());
                            if (a9 > 1) {
                                com.anythink.basead.b.c.i.s(a9, "Unsupported pssh version: ", "PsshAtomUtil", new StringBuilder(String.valueOf(a9).length() + 26));
                            } else {
                                UUID uuid3 = new UUID(lr.d(), lr.d());
                                if (a9 == 1) {
                                    int h9 = lr.h();
                                    UUID[] uuidArr = new UUID[h9];
                                    int i9 = 0;
                                    while (i9 < h9) {
                                        uuidArr[i9] = new UUID(lr.d(), lr.d());
                                        i9++;
                                        i4 = i4;
                                    }
                                }
                                i = i4;
                                uuid = null;
                                int h10 = lr.h();
                                int B9 = lr.B();
                                if (h10 != B9) {
                                    AbstractC3217fl.I("PsshAtomUtil", D.y.n(new StringBuilder(String.valueOf(h10).length() + 49 + String.valueOf(B9).length()), "Atom data size (", h10, ") does not match the bytes left: ", B9));
                                    c3562m7 = null;
                                } else {
                                    lr.H(new byte[h10], 0, h10);
                                    c3562m7 = new C3562m7(3, uuid3);
                                }
                                uuid2 = c3562m7 != null ? uuid : (UUID) c3562m7.f32668u;
                                if (uuid2 != null) {
                                    AbstractC3217fl.I("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList2.add(new NO(uuid2, com.anythink.basead.exoplayer.k.o.f8605e, bArr));
                                }
                            }
                        }
                    }
                }
                i = i4;
                c3562m7 = null;
                uuid = null;
                if (c3562m7 != null) {
                }
                if (uuid2 != null) {
                }
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new RO(null, false, (NO[]) arrayList2.toArray(new NO[0]));
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        if ((this.f26432b & 32) == 0) {
            q02 = new com.bumptech.glide.manager.n(q02, this.f26431a);
        }
        this.f26425G = q02;
        g();
        InterfaceC3448k1[] interfaceC3448k1Arr = new InterfaceC3448k1[2];
        this.f26426H = interfaceC3448k1Arr;
        int i = 0;
        InterfaceC3448k1[] interfaceC3448k1Arr2 = (InterfaceC3448k1[]) AbstractC3548lu.o(interfaceC3448k1Arr, 0);
        this.f26426H = interfaceC3448k1Arr2;
        for (InterfaceC3448k1 interfaceC3448k1 : interfaceC3448k1Arr2) {
            interfaceC3448k1.e(f26418O);
        }
        List list = this.f26433c;
        this.f26427I = new InterfaceC3448k1[list.size()];
        int i4 = 100;
        while (i < this.f26427I.length) {
            int i9 = i4 + 1;
            InterfaceC3448k1 x3 = this.f26425G.x(i4, 3);
            x3.e((TP) list.get(i));
            this.f26427I[i] = x3;
            i++;
            i4 = i9;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        C3675oC c3675oC;
        InterfaceC3234g1 v6 = AbstractC2720Pd.v(p02, true);
        if (v6 != null) {
            c3675oC = UB.j(v6);
        } else {
            SB sb = UB.f27942u;
            c3675oC = C3675oC.f33115x;
        }
        this.f26445p = c3675oC;
        return v6 == null;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        SparseArray sparseArray = this.f26434d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((M2) sparseArray.valueAt(i)).a();
        }
        this.f26442m.clear();
        this.f26452w = 0;
        ((PriorityQueue) this.f26443n.f27033e).clear();
        this.f26453x = j10;
        this.f26441l.clear();
        this.f26430M = -1L;
        g();
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final /* synthetic */ List d() {
        return this.f26445p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x00e4, code lost:
    
        r2 = r46.f26446q;
        r4 = com.anythink.basead.exoplayer.k.o.i;
        r8 = r3.f26282a;
        r9 = r3.f26283b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00ef, code lost:
    
        if (r2 != 3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00f3, code lost:
    
        if (r3.f26293m != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00f5, code lost:
    
        r2 = r3.f26285d.f29166d[r3.f26287f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0104, code lost:
    
        r46.f26420B = r2;
        r2 = r3.f26285d.f29163a.f28593g.f27776o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0112, code lost:
    
        if (java.util.Objects.equals(r2, com.anythink.basead.exoplayer.k.o.f8608h) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0116, code lost:
    
        if ((r11 & 64) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0118, code lost:
    
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0128, code lost:
    
        r46.f26423E = !r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0130, code lost:
    
        if (r3.f26287f >= r3.i) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0132, code lost:
    
        ((com.google.android.gms.internal.ads.J0) r0).b(r46.f26420B, false);
        r0 = r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x013e, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0141, code lost:
    
        r2 = r9.f28955n;
        r0 = r0.f28775d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0145, code lost:
    
        if (r0 == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0147, code lost:
    
        r2.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x014a, code lost:
    
        r0 = r3.f26287f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x014e, code lost:
    
        if (r9.f28952k == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0154, code lost:
    
        if (r9.f28953l[r0] == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0156, code lost:
    
        r2.G(r2.L() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0163, code lost:
    
        if (r3.c() != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0165, code lost:
    
        r46.f26419A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0168, code lost:
    
        r46.f26446q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x016b, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0176, code lost:
    
        if (r3.f26285d.f29163a.f28594h != r32) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0178, code lost:
    
        r46.f26420B -= 8;
        ((com.google.android.gms.internal.ads.J0) r0).b(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0195, code lost:
    
        if ("audio/ac4".equals(r3.f26285d.f29163a.f28593g.f27776o) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0197, code lost:
    
        r46.f26421C = r3.d(r46.f26420B, 7);
        com.google.android.gms.internal.ads.AbstractC3217fl.H(r46.f26420B, r7);
        r8.a(7, r7);
        r2 = r46.f26421C + 7;
        r46.f26421C = r2;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01b8, code lost:
    
        r46.f26420B += r2;
        r46.f26446q = 4;
        r46.f26422D = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x01af, code lost:
    
        r10 = 0;
        r2 = r3.d(r46.f26420B, 0);
        r46.f26421C = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x011b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0121, code lost:
    
        if (java.util.Objects.equals(r2, com.anythink.basead.exoplayer.k.o.i) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0125, code lost:
    
        if ((r11 & 128) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00fe, code lost:
    
        r2 = r9.f28950h[r3.f26287f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01c2, code lost:
    
        r2 = r3.f26285d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01c6, code lost:
    
        if (r3.f26293m != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01c8, code lost:
    
        r9 = r2.f29168f[r3.f26287f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01d6, code lost:
    
        r2 = r2.f29163a;
        r7 = r2.f28596k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01da, code lost:
    
        if (r7 != 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x01dc, code lost:
    
        r2 = r46.f26421C;
        r4 = r46.f26420B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01e0, code lost:
    
        if (r2 >= r4) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01e2, code lost:
    
        r46.f26421C += r8.d(r0, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01ee, code lost:
    
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x01f0, code lost:
    
        r35 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x036f, code lost:
    
        r0 = r24.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0375, code lost:
    
        if (r46.f26423E != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0377, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x037a, code lost:
    
        r19 = r0;
        r0 = r24.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0380, code lost:
    
        if (r0 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0382, code lost:
    
        r22 = r0.f28774c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0389, code lost:
    
        r17 = r9;
        r8.b(r17, r19, r46.f26420B, 0, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x039a, code lost:
    
        if (r35.isEmpty() != false) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x039c, code lost:
    
        r0 = (com.google.android.gms.internal.ads.K2) r35.removeFirst();
        r2 = r46.f26452w;
        r7 = r0.f25869c;
        r46.f26452w = r2 - r7;
        r2 = r0.f25868b;
        r3 = r0.f25867a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03ad, code lost:
    
        if (r2 == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03af, code lost:
    
        r3 = r3 + r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03b1, code lost:
    
        r4 = r3;
        r0 = r46.f26426H;
        r2 = r0.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03b6, code lost:
    
        if (r10 >= r2) goto L615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03b8, code lost:
    
        r0[r10].b(r4, 1, r7, r46.f26452w, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03c8, code lost:
    
        if (r24.c() != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x03ca, code lost:
    
        r46.f26419A = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03cd, code lost:
    
        r46.f26446q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0387, code lost:
    
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01f4, code lost:
    
        r12 = r46.f26436f;
        r13 = r12.f26233a;
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r11 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0203, code lost:
    
        r24 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0209, code lost:
    
        if (r46.f26421C >= r46.f26420B) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x020b, code lost:
    
        r3 = r46.f26422D;
        r14 = r2.f28593g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x020f, code lost:
    
        if (r3 != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0214, code lost:
    
        if (r46.f26427I.length > 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0218, code lost:
    
        if (r46.f26423E != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x021b, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x021d, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0236, code lost:
    
        r17 = r7;
        r35 = r15;
        ((com.google.android.gms.internal.ads.J0) r0).E(r13, r11, r7 + r2, false);
        r12.E(0);
        r3 = r12.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x024a, code lost:
    
        if (r3 < 0) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x024c, code lost:
    
        r46.f26422D = r3 - r2;
        r3 = r46.f26435e;
        r3.E(0);
        r8.a(4, r3);
        r46.f26421C += 4;
        r46.f26420B += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0265, code lost:
    
        if (r46.f26427I.length <= 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0267, code lost:
    
        if (r2 <= 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0269, code lost:
    
        r3 = com.google.android.gms.internal.ads.PA.f0(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x026d, code lost:
    
        if (r3 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0271, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0278, code lost:
    
        if (r7 == (-1662541442)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x027d, code lost:
    
        if (r7 == 1331836730) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0282, code lost:
    
        if (r7 == 1331856911) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x028b, code lost:
    
        if (r3.equals("video/vvc") == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x028d, code lost:
    
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02a1, code lost:
    
        if (r3 == 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x02a4, code lost:
    
        if (r3 == 1) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x02a8, code lost:
    
        if (r3 == r28) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x02b5, code lost:
    
        if (((r13[r29] & 248) >> 3) != 23) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x02d1, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x02d4, code lost:
    
        r46.f26424F = r3;
        r8.a(r2, r12);
        r46.f26421C += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x02de, code lost:
    
        if (r2 <= 0) goto L619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x02e2, code lost:
    
        if (r46.f26423E != false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x02e8, code lost:
    
        if (com.google.android.gms.internal.ads.PA.F(r13, r2, r14) == false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x02ea, code lost:
    
        r46.f26423E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x02ed, code lost:
    
        r2 = r16;
        r7 = r17;
        r3 = r24;
        r15 = r35;
        r28 = 2;
        r30 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x02c4, code lost:
    
        if (((r13[4] & 126) >> 1) != 39) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x02cf, code lost:
    
        if ((r13[4] & 31) != r30) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x02a0, code lost:
    
        r3 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0294, code lost:
    
        if (r3.equals(com.anythink.basead.exoplayer.k.o.f8608h) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0296, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x029c, code lost:
    
        if (r3.equals(r4) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x029e, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x02d3, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0302, code lost:
    
        throw com.google.android.gms.internal.ads.W4.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x021f, code lost:
    
        r3 = com.google.android.gms.internal.ads.PA.y(r14);
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0231, code lost:
    
        if ((r7 + r3) <= (r46.f26420B - r46.f26421C)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0234, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0303, code lost:
    
        r16 = r2;
        r17 = r7;
        r35 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x030b, code lost:
    
        if (r46.f26424F == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x030d, code lost:
    
        r2 = r46.f26437g;
        r2.y(r3);
        r48 = r4;
        ((com.google.android.gms.internal.ads.J0) r0).E(r2.f26233a, 0, r46.f26422D, false);
        r8.a(r46.f26422D, r2);
        r3 = r46.f26422D;
        r7 = com.google.android.gms.internal.ads.PA.f(r2.f26235c, r2.f26233a);
        r2.E(0);
        r2.C(r7);
        r7 = r14.f27778q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0337, code lost:
    
        if (r7 != (-1)) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x033b, code lost:
    
        if (r6.f27029a == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x033d, code lost:
    
        r6.j(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0348, code lost:
    
        r6.k(r9, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0354, code lost:
    
        if ((r24.b() & 4) == 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0356, code lost:
    
        r6.l(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0361, code lost:
    
        r46.f26421C += r3;
        r46.f26422D -= r3;
        r4 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0343, code lost:
    
        if (r6.f27029a == r7) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0345, code lost:
    
        r6.j(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x035a, code lost:
    
        r48 = r4;
        r3 = r8.d(r0, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x01cf, code lost:
    
        r9 = r9.i[r3.f26287f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0911, code lost:
    
        throw com.google.android.gms.internal.ads.W4.c("Atom size less than header length (unsupported).");
     */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        String m8;
        long P8;
        String str;
        long j9;
        long j10;
        long j11;
        char c4;
        char c9;
        boolean z8;
        int i;
        int i4;
        int i9;
        long j12;
        long j13;
        long P9;
        int i10;
        int i11;
        P0 p03 = p02;
        while (true) {
            int i12 = this.f26446q;
            ArrayDeque arrayDeque = this.f26441l;
            SparseArray sparseArray = this.f26434d;
            C3761pr c3761pr = this.f26444o;
            int i13 = this.f26432b;
            boolean z9 = true;
            C2728Pl c2728Pl = this.f26443n;
            Lr lr = this.i;
            if (i12 != 0) {
                ArrayDeque arrayDeque2 = this.f26442m;
                if (i12 != 1) {
                    long j14 = Long.MAX_VALUE;
                    if (i12 != 2) {
                        char c10 = 2;
                        if (i12 == 5) {
                            lr.y(16);
                            J0 j02 = (J0) p02;
                            if (j02.E(lr.f26233a, 0, 16, true)) {
                                lr.E(0);
                                int b9 = lr.b();
                                int b10 = lr.b();
                                if (b9 == 16 && b10 == 1835430511) {
                                    lr.G(4);
                                    long P10 = lr.P();
                                    long j15 = j02.f25674v - P10;
                                    if (P10 <= 0 || P10 > 2147483647L || j15 < 0 || j15 < this.f26430M) {
                                        m(new T0(this.f26454y, this.f26430M), s02);
                                    } else {
                                        s02.f27467n = j15;
                                        this.f26446q = 6;
                                    }
                                } else {
                                    m(new T0(this.f26454y, this.f26430M), s02);
                                }
                            } else {
                                m(new T0(this.f26454y, this.f26430M), s02);
                            }
                            int i14 = this.f26446q;
                            if (i14 == 6 || i14 == 0) {
                                return 1;
                            }
                        } else if (i12 != 6) {
                            M2 m22 = this.f26419A;
                            if (m22 != null) {
                                c4 = 5;
                                c9 = 6;
                                z8 = true;
                                break;
                            }
                            int size = sparseArray.size();
                            c4 = 5;
                            c9 = 6;
                            M2 m23 = null;
                            int i15 = 0;
                            while (i15 < size) {
                                M2 m24 = (M2) sparseArray.valueAt(i15);
                                boolean z10 = z9;
                                boolean z11 = m24.f26293m;
                                if (z11 || m24.f26287f != m24.f26285d.f29164b) {
                                    Z2 z22 = m24.f26283b;
                                    if (z11) {
                                        i = size;
                                        if (m24.f26289h == z22.f28946d) {
                                        }
                                    } else {
                                        i = size;
                                    }
                                    long j16 = !z11 ? m24.f26285d.f29165c[m24.f26287f] : z22.f28948f[m24.f26289h];
                                    if (j16 < j14) {
                                        m23 = m24;
                                        j14 = j16;
                                    }
                                } else {
                                    i = size;
                                }
                                i15++;
                                size = i;
                                z9 = z10;
                            }
                            z8 = z9;
                            if (m23 == null) {
                                int i16 = (int) (this.f26451v - ((J0) p03).f25675w);
                                if (i16 < 0) {
                                    throw W4.a(null, "Offset to end of mdat was negative.");
                                }
                                ((J0) p03).b(i16, false);
                                g();
                            } else {
                                int i17 = (int) ((!m23.f26293m ? m23.f26285d.f29165c[m23.f26287f] : m23.f26283b.f28948f[m23.f26289h]) - ((J0) p03).f25675w);
                                if (i17 < 0) {
                                    AbstractC3217fl.I("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i17 = 0;
                                }
                                ((J0) p03).b(i17, false);
                                this.f26419A = m23;
                                m22 = m23;
                            }
                        } else {
                            J0 j03 = (J0) p03;
                            long j17 = ((J0) p03).f25674v - j03.f25675w;
                            lr.y(8);
                            if (j03.I(lr.f26233a, 0, 8, true)) {
                                lr.E(0);
                                int b11 = lr.b();
                                if (lr.b() != 1835430497) {
                                    m(new T0(this.f26454y, this.f26430M), s02);
                                } else {
                                    int i18 = (int) j17;
                                    Lr lr2 = new Lr(i18);
                                    j03.E(lr2.f26233a, 0, i18, false);
                                    lr2.E(b11 == 1 ? 16 : 8);
                                    SparseArray sparseArray2 = new SparseArray();
                                    SparseArray sparseArray3 = new SparseArray();
                                    while (lr2.B() >= 8) {
                                        int i19 = lr2.f26234b;
                                        long P11 = lr2.P();
                                        int b12 = lr2.b();
                                        if (P11 == 1) {
                                            if (lr2.B() < 8) {
                                                break;
                                            }
                                            P11 = lr2.d();
                                        } else if (P11 == 0) {
                                            P11 = lr2.f26235c - i19;
                                        }
                                        if (P11 < (P11 == 1 ? 16 : 8)) {
                                            break;
                                        }
                                        long j18 = i19;
                                        if (P11 > lr2.f26235c - j18) {
                                            break;
                                        }
                                        if (b12 != 1952871009) {
                                            j12 = P11;
                                            j13 = j18;
                                        } else if (P11 < r11 + 16) {
                                            lr2.E((int) (j18 + P11));
                                        } else {
                                            int a9 = H2.a(lr2.b());
                                            int b13 = lr2.b();
                                            M2 m25 = (M2) sparseArray.get(b13);
                                            if (m25 == null) {
                                                lr2.E((int) (j18 + P11));
                                            } else {
                                                long j19 = m25.f26285d.f29163a.f28589c;
                                                int b14 = lr2.b();
                                                int i20 = b14 >> 4;
                                                int i21 = b14 >> 2;
                                                int i22 = b14 & 3;
                                                j12 = P11;
                                                long P12 = lr2.P();
                                                int i23 = (i20 & 3) + 1;
                                                int i24 = (i21 & 3) + 1;
                                                j13 = j18;
                                                int i25 = i22 + 1;
                                                if (((a9 == 1 ? 16L : 8L) + i23 + i24 + i25) * P12 > lr2.B()) {
                                                    lr2.E((int) (j13 + j12));
                                                } else {
                                                    int i26 = (int) P12;
                                                    long[] jArr = new long[i26];
                                                    long[] jArr2 = new long[i26];
                                                    int i27 = 0;
                                                    while (i27 < i26) {
                                                        if (a9 == 1) {
                                                            P9 = lr2.j();
                                                            i10 = i23;
                                                            i11 = 1;
                                                        } else {
                                                            P9 = lr2.P();
                                                            i10 = i23;
                                                            i11 = a9;
                                                        }
                                                        long j20 = i11 == 1 ? lr2.j() : lr2.P();
                                                        lr2.G(i10 + i24 + i25);
                                                        jArr[i27] = AbstractC3548lu.w(P9, 1000000L, j19, RoundingMode.DOWN);
                                                        jArr2[i27] = j20;
                                                        i27++;
                                                        i23 = i10;
                                                    }
                                                    sparseArray2.put(b13, jArr);
                                                    sparseArray3.put(b13, jArr2);
                                                }
                                            }
                                        }
                                        lr2.E((int) (j13 + j12));
                                    }
                                    if (sparseArray2.size() == 0) {
                                        m(new T0(this.f26454y, this.f26430M), s02);
                                    } else {
                                        int i28 = -1;
                                        int i29 = -1;
                                        for (int i30 = 0; i30 < sparseArray2.size(); i30++) {
                                            int keyAt = sparseArray2.keyAt(i30);
                                            M2 m26 = (M2) sparseArray.get(keyAt);
                                            if (m26 != null) {
                                                int i31 = m26.f26285d.f29163a.f28588b;
                                                if (i28 != -1) {
                                                    i9 = i28;
                                                } else if (i31 == 2) {
                                                    i28 = keyAt;
                                                } else {
                                                    i9 = -1;
                                                }
                                                if (i29 == -1) {
                                                    i29 = i31 == 1 ? keyAt : -1;
                                                }
                                                i28 = i9;
                                            }
                                        }
                                        if (i28 == -1) {
                                            if (i29 != -1) {
                                                i4 = i29;
                                                m(new L2(sparseArray2, sparseArray3, this.f26454y, this.f26430M, i4), s02);
                                            } else {
                                                i28 = sparseArray2.keyAt(0);
                                            }
                                        }
                                        i4 = i28;
                                        m(new L2(sparseArray2, sparseArray3, this.f26454y, this.f26430M, i4), s02);
                                    }
                                }
                            } else {
                                m(new T0(this.f26454y, this.f26430M), s02);
                            }
                            if (this.f26446q == 0) {
                                return 1;
                            }
                        }
                    } else {
                        int size2 = sparseArray.size();
                        M2 m27 = null;
                        for (int i32 = 0; i32 < size2; i32++) {
                            Z2 z23 = ((M2) sparseArray.valueAt(i32)).f26283b;
                            if (z23.f28956o) {
                                long j21 = z23.f28945c;
                                if (j21 < j14) {
                                    m27 = (M2) sparseArray.valueAt(i32);
                                    j14 = j21;
                                }
                            }
                        }
                        if (m27 == null) {
                            this.f26446q = 3;
                        } else {
                            int i33 = (int) (j14 - ((J0) p02).f25675w);
                            if (i33 < 0) {
                                throw W4.a(null, "Offset to encryption data was negative.");
                            }
                            J0 j04 = (J0) p02;
                            j04.b(i33, false);
                            Z2 z24 = m27.f26283b;
                            Lr lr3 = z24.f28955n;
                            j04.E(lr3.f26233a, 0, lr3.f26235c, false);
                            lr3.E(0);
                            z24.f28956o = false;
                        }
                    }
                } else {
                    long j22 = this.f26448s - this.f26449t;
                    Lr lr4 = this.f26450u;
                    int i34 = (int) j22;
                    if (lr4 != null) {
                        ((J0) p02).E(lr4.f26233a, 8, i34, false);
                        int i35 = this.f26447r;
                        C3443jx c3443jx = new C3443jx(i35, lr4);
                        if (!arrayDeque.isEmpty()) {
                            ((Ww) arrayDeque.peek()).f28534d.add(c3443jx);
                        } else if (i35 == 1936286840) {
                            Pair k6 = k(((J0) p02).f25675w, lr4);
                            c3761pr.A((I0) k6.second);
                            this.f26455z = ((Long) k6.first).longValue();
                            if (!this.f26428K) {
                                this.f26425G.w(((LinkedHashMap) c3761pr.f33523u).size() == 1 ? (InterfaceC3015c1) k6.second : c3761pr.D());
                                this.J = true;
                            }
                        } else if (i35 == 1701671783 && this.f26426H.length != 0) {
                            lr4.E(8);
                            int a10 = H2.a(lr4.b());
                            if (a10 == 0) {
                                m8 = lr4.m();
                                m8.getClass();
                                String m9 = lr4.m();
                                m9.getClass();
                                long P13 = lr4.P();
                                long P14 = lr4.P();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long w9 = AbstractC3548lu.w(P14, 1000000L, P13, roundingMode);
                                long j23 = this.f26455z;
                                long j24 = j23 != com.anythink.basead.exoplayer.b.f6539b ? j23 + w9 : -9223372036854775807L;
                                long w10 = AbstractC3548lu.w(lr4.P(), 1000L, P13, roundingMode);
                                P8 = lr4.P();
                                str = m9;
                                j9 = j24;
                                j10 = w10;
                                j11 = w9;
                            } else if (a10 != 1) {
                                com.anythink.basead.b.c.i.s(a10, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor", new StringBuilder(String.valueOf(a10).length() + 35));
                            } else {
                                long P15 = lr4.P();
                                long j25 = lr4.j();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long w11 = AbstractC3548lu.w(j25, 1000000L, P15, roundingMode2);
                                long w12 = AbstractC3548lu.w(lr4.P(), 1000L, P15, roundingMode2);
                                long P16 = lr4.P();
                                m8 = lr4.m();
                                m8.getClass();
                                String m10 = lr4.m();
                                m10.getClass();
                                P8 = P16;
                                str = m10;
                                j10 = w12;
                                j11 = -9223372036854775807L;
                                j9 = w11;
                            }
                            byte[] bArr = new byte[lr4.B()];
                            lr4.H(bArr, 0, lr4.B());
                            C2881Yl c2881Yl = this.f26439j;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c2881Yl.f28862u;
                            byteArrayOutputStream.reset();
                            try {
                                DataOutputStream dataOutputStream = (DataOutputStream) c2881Yl.f28863v;
                                dataOutputStream.writeBytes(m8);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(str);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(j10);
                                dataOutputStream.writeLong(P8);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                Lr lr5 = new Lr(byteArrayOutputStream.toByteArray());
                                int B8 = lr5.B();
                                for (InterfaceC3448k1 interfaceC3448k1 : this.f26426H) {
                                    lr5.E(0);
                                    interfaceC3448k1.a(B8, lr5);
                                }
                                if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                                    arrayDeque2.addLast(new K2(B8, j11, true));
                                    this.f26452w += B8;
                                } else if (arrayDeque2.isEmpty()) {
                                    for (InterfaceC3448k1 interfaceC3448k12 : this.f26426H) {
                                        interfaceC3448k12.b(j9, 1, B8, 0, null);
                                    }
                                } else {
                                    arrayDeque2.addLast(new K2(B8, j9, false));
                                    this.f26452w += B8;
                                }
                            } catch (IOException e6) {
                                throw new RuntimeException(e6);
                            }
                        }
                    } else {
                        ((J0) p02).b(i34, false);
                    }
                    h(((J0) p02).f25675w);
                }
            } else {
                int i36 = this.f26449t;
                Lr lr6 = this.f26440k;
                if (i36 == 0) {
                    if (!((J0) p02).E(lr6.f26233a, 0, 8, true)) {
                        long j26 = this.f26429L;
                        if (j26 == -1) {
                            c2728Pl.l(0);
                            return -1;
                        }
                        s02.f27467n = j26;
                        this.f26429L = -1L;
                        this.f26425G.w(c3761pr.D());
                        this.f26428K = true;
                        return 1;
                    }
                    this.f26449t = 8;
                    lr6.E(0);
                    this.f26448s = lr6.P();
                    this.f26447r = lr6.b();
                }
                long j27 = this.f26448s;
                if (j27 == 1) {
                    ((J0) p02).E(lr6.f26233a, 8, 8, false);
                    this.f26449t += 8;
                    this.f26448s = lr6.j();
                } else if (j27 == 0) {
                    long j28 = ((J0) p02).f25674v;
                    if (j28 == -1) {
                        j28 = !arrayDeque.isEmpty() ? ((Ww) arrayDeque.peek()).f28533c : -1L;
                    }
                    if (j28 != -1) {
                        this.f26448s = (j28 - ((J0) p02).f25675w) + this.f26449t;
                    }
                }
                long j29 = this.f26448s;
                int i37 = this.f26449t;
                long j30 = i37;
                if (j29 < j30) {
                    if (this.f26447r != 1718773093 || i37 != 8) {
                        break;
                    }
                    this.f26448s = j30;
                    j29 = j30;
                }
                if (this.f26429L != -1) {
                    if (this.f26447r == 1936286840) {
                        lr.y((int) j29);
                        System.arraycopy(lr6.f26233a, 0, lr.f26233a, 0, 8);
                        ((J0) p02).E(lr.f26233a, 8, (int) (this.f26448s - this.f26449t), false);
                        c3761pr.A((I0) k(((J0) p02).m(), lr).second);
                    } else {
                        ((J0) p02).b((int) (j29 - j30), true);
                    }
                    g();
                } else {
                    long j31 = ((J0) p02).f25675w - j30;
                    int i38 = this.f26447r;
                    if ((i38 == 1836019558 || i38 == 1835295092) && !this.J) {
                        long j32 = ((J0) p02).f25674v;
                        if (j32 == -1 || this.f26430M != -1 || (i13 & 512) == 0) {
                            this.f26425G.w(new T0(this.f26454y, j31));
                            this.J = true;
                        } else {
                            this.f26430M = j31;
                            s02.f27467n = j32 - 16;
                            this.f26446q = 5;
                        }
                    }
                    if (this.f26447r == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i39 = 0; i39 < size3; i39++) {
                            Z2 z25 = ((M2) sparseArray.valueAt(i39)).f26283b;
                            z25.f28945c = j31;
                            z25.f28944b = j31;
                        }
                    }
                    int i40 = this.f26447r;
                    if (i40 == 1835295092) {
                        this.f26419A = null;
                        this.f26451v = j31 + this.f26448s;
                        this.f26446q = 2;
                    } else if (i40 == 1836019574 || i40 == 1953653099 || i40 == 1835297121 || i40 == 1835626086 || i40 == 1937007212 || i40 == 1836019558 || i40 == 1953653094 || i40 == 1836475768 || i40 == 1701082227 || i40 == 1835365473) {
                        J0 j05 = (J0) p02;
                        long j33 = j05.f25675w;
                        long j34 = this.f26448s;
                        long j35 = j33 + j34;
                        if (j34 != this.f26449t && i40 == 1835365473) {
                            lr.y(8);
                            j05.I(lr.f26233a, 0, 8, false);
                            H2.f(lr);
                            j05.b(lr.f26234b, false);
                            j05.f25677y = 0;
                        }
                        long j36 = j35 - 8;
                        arrayDeque.push(new Ww(this.f26447r, j36));
                        if (this.f26448s == this.f26449t) {
                            h(j36);
                        } else {
                            g();
                        }
                    } else if (i40 == 1751411826 || i40 == 1835296868 || i40 == 1836476516 || i40 == 1936286840 || i40 == 1937011556 || i40 == 1937011827 || i40 == 1668576371 || i40 == 1937011555 || i40 == 1937011578 || i40 == 1937013298 || i40 == 1937007471 || i40 == 1668232756 || i40 == 1937011571 || i40 == 1952867444 || i40 == 1952868452 || i40 == 1953196132 || i40 == 1953654136 || i40 == 1953658222 || i40 == 1886614376 || i40 == 1935763834 || i40 == 1935763823 || i40 == 1936027235 || i40 == 1970628964 || i40 == 1935828848 || i40 == 1936158820 || i40 == 1701606260 || i40 == 1835362404 || i40 == 1701671783 || i40 == 1969517665 || i40 == 1801812339 || i40 == 1768715124) {
                        if (this.f26449t != 8) {
                            throw W4.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.f26448s > 2147483647L) {
                            throw W4.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        Lr lr7 = new Lr((int) this.f26448s);
                        System.arraycopy(lr6.f26233a, 0, lr7.f26233a, 0, 8);
                        this.f26450u = lr7;
                        this.f26446q = 1;
                    } else {
                        if (this.f26448s > 2147483647L) {
                            throw W4.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f26450u = null;
                        this.f26446q = 1;
                    }
                }
                if (this.f26446q == 5) {
                    return 1;
                }
            }
            p03 = p02;
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }

    public final void g() {
        this.f26446q = 0;
        this.f26449t = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:394:0x0858, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x085b, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x047d  */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j9) {
        R3 r32;
        ArrayList arrayList;
        int i;
        String str;
        int i4;
        boolean z8;
        ?? r33;
        I2 i22;
        int i9;
        I2 i23;
        ArrayList arrayList2;
        int i10;
        int i11;
        ArrayList arrayList3;
        int i12;
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        boolean z9;
        int i16;
        int i17;
        int i18;
        int i19;
        M2 m22;
        ArrayList arrayList4;
        int i20;
        int i21;
        M2 m23;
        ArrayList arrayList5;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean[] zArr;
        int i28;
        int i29;
        I2 i210;
        int i30;
        M2 m24;
        X2 x22;
        UC uc;
        int i31;
        while (true) {
            ArrayDeque arrayDeque = this.f26441l;
            if (arrayDeque.isEmpty() || ((Ww) arrayDeque.peek()).f28533c != j9) {
                break;
            }
            Ww ww = (Ww) arrayDeque.pop();
            int i32 = ww.f32624b;
            SparseArray sparseArray = this.f26434d;
            ArrayList arrayList6 = ww.f28534d;
            int i33 = 12;
            int i34 = 16;
            int i35 = 2;
            if (i32 == 1836019574) {
                RO l9 = l(arrayList6);
                Ww j10 = ww.j(1836475768);
                j10.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList7 = j10.f28534d;
                int size = arrayList7.size();
                long j11 = com.anythink.basead.exoplayer.b.f6539b;
                int i36 = 0;
                while (i36 < size) {
                    C3443jx c3443jx = (C3443jx) arrayList7.get(i36);
                    int i37 = c3443jx.f32624b;
                    Lr lr = c3443jx.f32222c;
                    if (i37 == 1953654136) {
                        lr.E(i33);
                        Pair create = Pair.create(Integer.valueOf(lr.b()), new I2(lr.b() - 1, lr.b(), lr.b(), lr.b()));
                        sparseArray2.put(((Integer) create.first).intValue(), (I2) create.second);
                    } else if (i37 == 1835362404) {
                        lr.E(8);
                        j11 = H2.a(lr.b()) == 0 ? lr.P() : lr.j();
                    }
                    i36++;
                    i33 = 12;
                }
                int i38 = 0;
                Ww j12 = ww.j(1835365473);
                R3 e6 = j12 != null ? H2.e(j12) : null;
                X0 x02 = new X0();
                C3443jx i39 = ww.i(1969517665);
                if (i39 != null) {
                    r32 = H2.c(i39);
                    x02.a(r32);
                } else {
                    r32 = null;
                }
                C3443jx i40 = ww.i(1836476516);
                i40.getClass();
                R3 r34 = new R3(H2.d(i40.f32222c));
                long j13 = j11;
                boolean z10 = -1;
                ArrayList b9 = H2.b(ww, x02, j13, l9, false, false, new J2(i38));
                int size2 = b9.size();
                if (sparseArray.size() == 0) {
                    String i41 = PA.i(b9);
                    int i42 = 0;
                    while (i42 < size2) {
                        C2908a3 c2908a3 = (C2908a3) b9.get(i42);
                        X2 x23 = c2908a3.f29163a;
                        if (x23.f28598m) {
                            Q0 q02 = this.f26425G;
                            int i43 = x23.f28588b;
                            InterfaceC3448k1 x3 = q02.x(i42, i43);
                            x3.getClass();
                            TP tp = x23.f28593g;
                            tp.getClass();
                            i4 = i42;
                            C4065vP c4065vP = new C4065vP(tp);
                            c4065vP.d(i41);
                            str = i41;
                            if (i43 == 1) {
                                int i44 = x02.f28581a;
                                arrayList = b9;
                                r33 = -1;
                                r33 = -1;
                                r33 = -1;
                                i = size2;
                                if (i44 != -1 && (i9 = x02.f28582b) != -1) {
                                    c4065vP.J = i44;
                                    c4065vP.f34769K = i9;
                                }
                            } else {
                                arrayList = b9;
                                i = size2;
                                r33 = -1;
                            }
                            AbstractC3217fl.l(i43, e6, c4065vP, tp.f27773l, r32, r34);
                            int size3 = sparseArray2.size();
                            int i45 = x23.f28587a;
                            if (size3 == 1) {
                                i22 = (I2) sparseArray2.valueAt(0);
                            } else {
                                i22 = (I2) sparseArray2.get(i45);
                                i22.getClass();
                            }
                            sparseArray.put(i45, new M2(x3, c2908a3, i22, new TP(c4065vP)));
                            this.f26454y = Math.max(this.f26454y, x23.f28591e);
                            z8 = r33;
                        } else {
                            arrayList = b9;
                            i = size2;
                            str = i41;
                            i4 = i42;
                            z8 = z10;
                        }
                        i42 = i4 + 1;
                        z10 = z8;
                        size2 = i;
                        i41 = str;
                        b9 = arrayList;
                    }
                    this.f26425G.v();
                } else {
                    ArrayList arrayList8 = b9;
                    int i46 = 0;
                    int i47 = 0;
                    while (i46 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        if (((C2908a3) arrayList9.get(i46)).f29163a.f28598m) {
                            i47++;
                        }
                        i46++;
                        arrayList8 = arrayList9;
                    }
                    ArrayList arrayList10 = arrayList8;
                    PA.T(sparseArray.size() == i47);
                    for (int i48 = 0; i48 < size2; i48++) {
                        C2908a3 c2908a32 = (C2908a3) arrayList10.get(i48);
                        X2 x24 = c2908a32.f29163a;
                        if (x24.f28598m) {
                            int i49 = x24.f28587a;
                            M2 m25 = (M2) sparseArray.get(i49);
                            if (sparseArray2.size() == 1) {
                                i23 = (I2) sparseArray2.valueAt(0);
                            } else {
                                i23 = (I2) sparseArray2.get(i49);
                                i23.getClass();
                            }
                            m25.f26285d = c2908a32;
                            m25.f26286e = i23;
                            m25.f26282a.e(m25.f26290j);
                            m25.a();
                        }
                    }
                }
            } else {
                int i50 = 4;
                if (i32 == 1836019558) {
                    ArrayList arrayList11 = ww.f28535e;
                    int size4 = arrayList11.size();
                    int i51 = 0;
                    while (i51 < size4) {
                        Ww ww2 = (Ww) arrayList11.get(i51);
                        if (ww2.f32624b == 1953653094) {
                            C3443jx i52 = ww2.i(1952868452);
                            i52.getClass();
                            Lr lr2 = i52.f32222c;
                            lr2.E(8);
                            int b10 = lr2.b();
                            byte[] bArr2 = H2.f25279a;
                            M2 m26 = (M2) sparseArray.get(lr2.b());
                            if (m26 == null) {
                                m26 = null;
                            } else {
                                int i53 = b10 & 1;
                                Z2 z22 = m26.f26283b;
                                if (i53 != 0) {
                                    long j14 = lr2.j();
                                    z22.f28944b = j14;
                                    z22.f28945c = j14;
                                }
                                I2 i211 = m26.f26286e;
                                z22.f28943a = new I2((b10 & 2) != 0 ? lr2.b() - 1 : i211.f25510a, (b10 & 8) != 0 ? lr2.b() : i211.f25511b, (b10 & 16) != 0 ? lr2.b() : i211.f25512c, (b10 & 32) != 0 ? lr2.b() : i211.f25513d);
                            }
                            if (m26 == null) {
                                arrayList2 = arrayList11;
                                i10 = size4;
                                i11 = i51;
                                arrayList3 = arrayList6;
                                i12 = i34;
                                i13 = i35;
                            } else {
                                Z2 z23 = m26.f26283b;
                                long j15 = z23.f28957p;
                                boolean z11 = z23.f28958q;
                                m26.a();
                                m26.f26293m = true;
                                C3443jx i54 = ww2.i(1952867444);
                                if (i54 != null) {
                                    Lr lr3 = i54.f32222c;
                                    lr3.E(8);
                                    z23.f28957p = H2.a(lr3.b()) == 1 ? lr3.j() : lr3.P();
                                    z23.f28958q = true;
                                } else {
                                    z23.f28957p = j15;
                                    z23.f28958q = z11;
                                }
                                ArrayList arrayList12 = ww2.f28534d;
                                int size5 = arrayList12.size();
                                int i55 = 0;
                                int i56 = 0;
                                int i57 = 0;
                                while (true) {
                                    i14 = 1953658222;
                                    if (i55 >= size5) {
                                        break;
                                    }
                                    C3443jx c3443jx2 = (C3443jx) arrayList12.get(i55);
                                    ArrayList arrayList13 = arrayList11;
                                    if (c3443jx2.f32624b == 1953658222) {
                                        Lr lr4 = c3443jx2.f32222c;
                                        lr4.E(12);
                                        int h9 = lr4.h();
                                        if (h9 > 0) {
                                            i57 += h9;
                                            i56++;
                                            i55++;
                                            arrayList11 = arrayList13;
                                        }
                                    }
                                    i55++;
                                    arrayList11 = arrayList13;
                                }
                                arrayList2 = arrayList11;
                                m26.f26289h = 0;
                                m26.f26288g = 0;
                                m26.f26287f = 0;
                                z23.f28946d = i56;
                                z23.f28947e = i57;
                                if (z23.f28949g.length < i56) {
                                    z23.f28948f = new long[i56];
                                    z23.f28949g = new int[i56];
                                }
                                if (z23.f28950h.length < i57) {
                                    int i58 = (i57 * 125) / 100;
                                    z23.f28950h = new int[i58];
                                    z23.i = new long[i58];
                                    z23.f28951j = new boolean[i58];
                                    z23.f28953l = new boolean[i58];
                                }
                                int i59 = 0;
                                int i60 = 0;
                                int i61 = 0;
                                while (true) {
                                    long j16 = 0;
                                    if (i59 >= size5) {
                                        break;
                                    }
                                    C3443jx c3443jx3 = (C3443jx) arrayList12.get(i59);
                                    if (c3443jx3.f32624b == i14) {
                                        int i62 = i60 + 1;
                                        Lr lr5 = c3443jx3.f32222c;
                                        lr5.E(8);
                                        int b11 = lr5.b();
                                        i16 = i59;
                                        C2908a3 c2908a33 = m26.f26285d;
                                        i17 = size4;
                                        I2 i212 = z23.f28943a;
                                        String str2 = AbstractC3548lu.f32613a;
                                        i18 = i51;
                                        z23.f28949g[i60] = lr5.h();
                                        long[] jArr = z23.f28948f;
                                        i19 = size5;
                                        int i63 = i60;
                                        long j17 = z23.f28944b;
                                        jArr[i63] = j17;
                                        if ((b11 & 1) != 0) {
                                            jArr[i63] = j17 + lr5.b();
                                        }
                                        boolean z12 = (b11 & 4) != 0;
                                        int i64 = i212.f25513d;
                                        int b12 = z12 ? lr5.b() : i64;
                                        boolean z13 = z12;
                                        int i65 = b11 & 256;
                                        int i66 = b11 & 512;
                                        int i67 = b11 & 1024;
                                        int i68 = b11 & 2048;
                                        X2 x25 = c2908a33.f29163a;
                                        UC uc2 = x25.i;
                                        if (uc2 != null) {
                                            i20 = i64;
                                            i21 = b12;
                                            if (uc2.f27945u == 1 && (uc = x25.f28595j) != null) {
                                                if (uc2.a(0) == 0) {
                                                    m23 = m26;
                                                    arrayList5 = arrayList6;
                                                    i24 = i61;
                                                } else {
                                                    long a9 = uc2.a(0);
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    arrayList5 = arrayList6;
                                                    i24 = i61;
                                                    long w9 = AbstractC3548lu.w(a9, 1000000L, x25.f28590d, roundingMode);
                                                    m23 = m26;
                                                    i31 = w9 + AbstractC3548lu.w(uc.a(0), 1000000L, x25.f28589c, roundingMode) >= x25.f28591e ? 0 : 0;
                                                    int[] iArr = z23.f28950h;
                                                    long[] jArr2 = z23.i;
                                                    boolean[] zArr2 = z23.f28951j;
                                                    i61 = i24 + z23.f28949g[i63];
                                                    int[] iArr2 = iArr;
                                                    long j18 = z23.f28957p;
                                                    arrayList4 = arrayList5;
                                                    i25 = i24;
                                                    while (i25 < i61) {
                                                        if (i65 != 0) {
                                                            i26 = i25;
                                                            i27 = lr5.b();
                                                        } else {
                                                            i26 = i25;
                                                            i27 = i212.f25511b;
                                                        }
                                                        i(i27);
                                                        if (i66 != 0) {
                                                            zArr = zArr2;
                                                            i28 = lr5.b();
                                                        } else {
                                                            zArr = zArr2;
                                                            i28 = i212.f25512c;
                                                        }
                                                        i(i28);
                                                        if (i67 != 0) {
                                                            i29 = lr5.b();
                                                        } else {
                                                            if (i26 == 0) {
                                                                if (z13) {
                                                                    i29 = i21;
                                                                    i26 = 0;
                                                                } else {
                                                                    i26 = 0;
                                                                }
                                                            }
                                                            i29 = i20;
                                                        }
                                                        if (i68 != 0) {
                                                            i210 = i212;
                                                            i30 = lr5.b();
                                                        } else {
                                                            i210 = i212;
                                                            i30 = 0;
                                                        }
                                                        int i69 = i28;
                                                        int[] iArr3 = iArr2;
                                                        long w10 = AbstractC3548lu.w((i30 + j18) - j16, 1000000L, x25.f28589c, RoundingMode.DOWN);
                                                        jArr2[i26] = w10;
                                                        if (z23.f28958q) {
                                                            m24 = m23;
                                                            x22 = x25;
                                                        } else {
                                                            m24 = m23;
                                                            x22 = x25;
                                                            jArr2[i26] = w10 + m24.f26285d.i;
                                                        }
                                                        iArr3[i26] = i69;
                                                        zArr[i26] = ((i29 >> 16) & 1) == 0;
                                                        j18 += i27;
                                                        i25 = i26 + 1;
                                                        x25 = x22;
                                                        zArr2 = zArr;
                                                        iArr2 = iArr3;
                                                        m23 = m24;
                                                        i212 = i210;
                                                    }
                                                    m22 = m23;
                                                    z23.f28957p = j18;
                                                    i60 = i62;
                                                }
                                                j16 = uc.a(i31);
                                                int[] iArr4 = z23.f28950h;
                                                long[] jArr22 = z23.i;
                                                boolean[] zArr22 = z23.f28951j;
                                                i61 = i24 + z23.f28949g[i63];
                                                int[] iArr22 = iArr4;
                                                long j182 = z23.f28957p;
                                                arrayList4 = arrayList5;
                                                i25 = i24;
                                                while (i25 < i61) {
                                                }
                                                m22 = m23;
                                                z23.f28957p = j182;
                                                i60 = i62;
                                            }
                                        } else {
                                            i20 = i64;
                                            i21 = b12;
                                        }
                                        m23 = m26;
                                        arrayList5 = arrayList6;
                                        i24 = i61;
                                        int[] iArr42 = z23.f28950h;
                                        long[] jArr222 = z23.i;
                                        boolean[] zArr222 = z23.f28951j;
                                        i61 = i24 + z23.f28949g[i63];
                                        int[] iArr222 = iArr42;
                                        long j1822 = z23.f28957p;
                                        arrayList4 = arrayList5;
                                        i25 = i24;
                                        while (i25 < i61) {
                                        }
                                        m22 = m23;
                                        z23.f28957p = j1822;
                                        i60 = i62;
                                    } else {
                                        i16 = i59;
                                        i17 = size4;
                                        i18 = i51;
                                        i19 = size5;
                                        m22 = m26;
                                        arrayList4 = arrayList6;
                                    }
                                    i59 = i16 + 1;
                                    m26 = m22;
                                    size4 = i17;
                                    i51 = i18;
                                    size5 = i19;
                                    arrayList6 = arrayList4;
                                    i14 = 1953658222;
                                }
                                i10 = size4;
                                i11 = i51;
                                arrayList3 = arrayList6;
                                C2908a3 c2908a34 = m26.f26285d;
                                I2 i213 = z23.f28943a;
                                i213.getClass();
                                Y2[] y2Arr = c2908a34.f29163a.f28599n;
                                Y2 y22 = y2Arr == null ? null : y2Arr[i213.f25510a];
                                C3443jx i70 = ww2.i(1935763834);
                                if (i70 != null) {
                                    y22.getClass();
                                    Lr lr6 = i70.f32222c;
                                    lr6.E(8);
                                    if ((lr6.b() & 1) == 1) {
                                        lr6.G(8);
                                    }
                                    int K8 = lr6.K();
                                    int h10 = lr6.h();
                                    int i71 = z23.f28947e;
                                    if (h10 > i71) {
                                        throw W4.a(null, D.y.n(new StringBuilder(String.valueOf(h10).length() + 56 + String.valueOf(i71).length()), "Saiz sample count ", h10, " is greater than fragment sample count", i71));
                                    }
                                    int i72 = y22.f28775d;
                                    if (K8 == 0) {
                                        boolean[] zArr3 = z23.f28953l;
                                        i15 = 0;
                                        for (int i73 = 0; i73 < h10; i73++) {
                                            int K9 = lr6.K();
                                            i15 += K9;
                                            zArr3[i73] = K9 > i72;
                                        }
                                        z9 = false;
                                    } else {
                                        boolean z14 = K8 > i72;
                                        i15 = K8 * h10;
                                        z9 = false;
                                        Arrays.fill(z23.f28953l, 0, h10, z14);
                                    }
                                    Arrays.fill(z23.f28953l, h10, z23.f28947e, z9);
                                    if (i15 > 0) {
                                        z23.f28955n.y(i15);
                                        z23.f28952k = true;
                                        z23.f28956o = true;
                                    }
                                }
                                C3443jx i74 = ww2.i(1935763823);
                                if (i74 != null) {
                                    Lr lr7 = i74.f32222c;
                                    lr7.E(8);
                                    int b13 = lr7.b();
                                    if ((b13 & 1) == 1) {
                                        lr7.G(8);
                                    }
                                    int h11 = lr7.h();
                                    if (h11 != 1) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(h11).length() + 29);
                                        sb.append("Unexpected saio entry count: ");
                                        sb.append(h11);
                                        throw W4.a(null, sb.toString());
                                    }
                                    z23.f28945c += H2.a(b13) == 0 ? lr7.P() : lr7.j();
                                }
                                C3443jx i75 = ww2.i(1936027235);
                                if (i75 != null) {
                                    j(i75.f32222c, 0, z23);
                                }
                                String str3 = y22 != null ? y22.f28773b : null;
                                Lr lr8 = null;
                                Lr lr9 = null;
                                for (int i76 = 0; i76 < arrayList12.size(); i76++) {
                                    C3443jx c3443jx4 = (C3443jx) arrayList12.get(i76);
                                    Lr lr10 = c3443jx4.f32222c;
                                    int i77 = c3443jx4.f32624b;
                                    if (i77 == 1935828848) {
                                        lr10.E(12);
                                        if (lr10.b() == 1936025959) {
                                            lr8 = lr10;
                                        }
                                    } else if (i77 == 1936158820) {
                                        lr10.E(12);
                                        if (lr10.b() == 1936025959) {
                                            lr9 = lr10;
                                        }
                                    }
                                }
                                if (lr8 == null || lr9 == null) {
                                    i13 = i35;
                                } else {
                                    lr8.E(8);
                                    int a10 = H2.a(lr8.b());
                                    int i78 = i50;
                                    lr8.G(i78);
                                    if (a10 == 1) {
                                        lr8.G(i78);
                                    }
                                    if (lr8.b() != 1) {
                                        throw W4.c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    lr9.E(8);
                                    int a11 = H2.a(lr9.b());
                                    lr9.G(i78);
                                    if (a11 != 1) {
                                        i13 = i35;
                                        if (a11 >= i13) {
                                            lr9.G(i78);
                                        }
                                    } else {
                                        if (lr9.P() == 0) {
                                            throw W4.c("Variable length description in sgpd found (unsupported)");
                                        }
                                        i13 = i35;
                                    }
                                    if (lr9.P() != 1) {
                                        throw W4.c("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    lr9.G(1);
                                    int K10 = lr9.K();
                                    int i79 = (K10 & 240) >> 4;
                                    int i80 = K10 & 15;
                                    i50 = i78;
                                    if (lr9.K() == 1) {
                                        int K11 = lr9.K();
                                        int i81 = i34;
                                        byte[] bArr3 = new byte[i81];
                                        lr9.H(bArr3, 0, i81);
                                        if (K11 == 0) {
                                            int K12 = lr9.K();
                                            byte[] bArr4 = new byte[K12];
                                            lr9.H(bArr4, 0, K12);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        z23.f28952k = true;
                                        z23.f28954m = new Y2(true, str3, K11, bArr3, i79, i80, bArr);
                                    }
                                }
                                int size6 = arrayList12.size();
                                for (int i82 = 0; i82 < size6; i82++) {
                                    C3443jx c3443jx5 = (C3443jx) arrayList12.get(i82);
                                    if (c3443jx5.f32624b == 1970628964) {
                                        Lr lr11 = c3443jx5.f32222c;
                                        lr11.E(8);
                                        byte[] bArr5 = this.f26438h;
                                        lr11.H(bArr5, 0, 16);
                                        if (Arrays.equals(bArr5, f26417N)) {
                                            j(lr11, 16, z23);
                                        }
                                    }
                                }
                                i12 = 16;
                            }
                        } else {
                            arrayList2 = arrayList11;
                            i10 = size4;
                            i11 = i51;
                            arrayList3 = arrayList6;
                            i12 = i34;
                            i13 = i35;
                        }
                        i51 = i11 + 1;
                        i34 = i12;
                        i35 = i13;
                        arrayList11 = arrayList2;
                        size4 = i10;
                        arrayList6 = arrayList3;
                    }
                    RO l10 = l(arrayList6);
                    if (l10 != null) {
                        int size7 = sparseArray.size();
                        for (int i83 = 0; i83 < size7; i83++) {
                            M2 m27 = (M2) sparseArray.valueAt(i83);
                            C2908a3 c2908a35 = m27.f26285d;
                            I2 i214 = m27.f26283b.f28943a;
                            String str4 = AbstractC3548lu.f32613a;
                            int i84 = i214.f25510a;
                            Y2[] y2Arr2 = c2908a35.f29163a.f28599n;
                            Y2 y23 = y2Arr2 == null ? null : y2Arr2[i84];
                            RO a12 = l10.a(y23 != null ? y23.f28773b : null);
                            C4065vP c4065vP2 = new C4065vP(m27.f26290j);
                            c4065vP2.f34789r = a12;
                            m27.f26282a.e(new TP(c4065vP2));
                        }
                    }
                    if (this.f26453x != com.anythink.basead.exoplayer.b.f6539b) {
                        int size8 = sparseArray.size();
                        for (int i85 = 0; i85 < size8; i85++) {
                            M2 m28 = (M2) sparseArray.valueAt(i85);
                            long j19 = this.f26453x;
                            int i86 = m28.f26287f;
                            while (true) {
                                Z2 z24 = m28.f26283b;
                                if (i86 < z24.f28947e && z24.i[i86] <= j19) {
                                    if (z24.f28951j[i86]) {
                                        m28.i = i86;
                                    }
                                    i86++;
                                }
                            }
                        }
                        this.f26453x = com.anythink.basead.exoplayer.b.f6539b;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((Ww) arrayDeque.peek()).f28535e.add(ww);
                }
            }
        }
    }

    public final void m(InterfaceC3015c1 interfaceC3015c1, S0 s02) {
        this.f26425G.w(interfaceC3015c1);
        this.J = true;
        s02.f27467n = this.f26430M;
        g();
    }
}
