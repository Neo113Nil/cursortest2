package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class vh implements ch {
    public static final eh Z = new ph();

    /* renamed from: a0, reason: collision with root package name */
    private static final byte[] f13350a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: b0, reason: collision with root package name */
    private static final byte[] f13351b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: c0, reason: collision with root package name */
    private static final UUID f13352c0 = new UUID(72057594037932032L, -9223371306706625679L);
    private mm A;
    private mm B;
    private boolean C;
    private int D;
    private long E;
    private long F;
    private int G;
    private int H;
    private int[] I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private byte R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private dh X;
    private final oh Y;

    /* renamed from: a, reason: collision with root package name */
    private final xh f13353a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<uh> f13354b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13355c;

    /* renamed from: d, reason: collision with root package name */
    private final rm f13356d;

    /* renamed from: e, reason: collision with root package name */
    private final rm f13357e;

    /* renamed from: f, reason: collision with root package name */
    private final rm f13358f;

    /* renamed from: g, reason: collision with root package name */
    private final rm f13359g;

    /* renamed from: h, reason: collision with root package name */
    private final rm f13360h;

    /* renamed from: i, reason: collision with root package name */
    private final rm f13361i;

    /* renamed from: j, reason: collision with root package name */
    private final rm f13362j;

    /* renamed from: k, reason: collision with root package name */
    private final rm f13363k;

    /* renamed from: l, reason: collision with root package name */
    private final rm f13364l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f13365m;

    /* renamed from: n, reason: collision with root package name */
    private long f13366n;

    /* renamed from: o, reason: collision with root package name */
    private long f13367o;

    /* renamed from: p, reason: collision with root package name */
    private long f13368p;

    /* renamed from: q, reason: collision with root package name */
    private long f13369q;

    /* renamed from: r, reason: collision with root package name */
    private long f13370r;

    /* renamed from: s, reason: collision with root package name */
    private uh f13371s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f13372t;

    /* renamed from: u, reason: collision with root package name */
    private int f13373u;

    /* renamed from: v, reason: collision with root package name */
    private long f13374v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13375w;

    /* renamed from: x, reason: collision with root package name */
    private long f13376x;

    /* renamed from: y, reason: collision with root package name */
    private long f13377y;

    /* renamed from: z, reason: collision with root package name */
    private long f13378z;

    public vh(int i7) {
        oh ohVar = new oh();
        this.f13367o = -1L;
        this.f13368p = -9223372036854775807L;
        this.f13369q = -9223372036854775807L;
        this.f13370r = -9223372036854775807L;
        this.f13376x = -1L;
        this.f13377y = -1L;
        this.f13378z = -9223372036854775807L;
        this.Y = ohVar;
        ohVar.b(new rh(this, null));
        this.f13355c = true;
        this.f13353a = new xh();
        this.f13354b = new SparseArray<>();
        this.f13358f = new rm(4);
        this.f13359g = new rm(ByteBuffer.allocate(4).putInt(-1).array());
        this.f13360h = new rm(4);
        this.f13356d = new rm(pm.f10272a);
        this.f13357e = new rm(4);
        this.f13361i = new rm();
        this.f13362j = new rm();
        this.f13363k = new rm(8);
        this.f13364l = new rm();
    }

    static final int l(int i7) {
        switch (i7) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    static final boolean m(int i7) {
        return i7 == 357149030 || i7 == 524531317 || i7 == 475249515 || i7 == 374648427;
    }

    private final long n(long j7) {
        long j8 = this.f13368p;
        if (j8 != -9223372036854775807L) {
            return zm.j(j7, j8, 1000L);
        }
        throw new af("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void o(uh uhVar, long j7) {
        byte[] q7;
        if ("S_TEXT/UTF8".equals(uhVar.f12791a)) {
            byte[] bArr = this.f13362j.f11225a;
            long j8 = this.F;
            if (j8 == -9223372036854775807L) {
                q7 = f13351b0;
            } else {
                int i7 = (int) (j8 / 3600000000L);
                long j9 = j8 - (i7 * 3600000000L);
                int i8 = (int) (j9 / 60000000);
                long j10 = j9 - (60000000 * i8);
                q7 = zm.q(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf((int) (j10 / 1000000)), Integer.valueOf((int) ((j10 - (r4 * 1000000)) / 1000))));
            }
            System.arraycopy(q7, 0, bArr, 19, 12);
            lh lhVar = uhVar.O;
            rm rmVar = this.f13362j;
            lhVar.c(rmVar, rmVar.d());
            this.U += this.f13362j.d();
        }
        uhVar.O.a(j7, this.L, this.U, 0, uhVar.f12797g);
        this.V = true;
        p();
    }

    private final void p() {
        this.M = 0;
        this.U = 0;
        this.T = 0;
        this.N = false;
        this.O = false;
        this.Q = false;
        this.S = 0;
        this.R = (byte) 0;
        this.P = false;
        this.f13361i.r();
    }

    private static int[] q(int[] iArr, int i7) {
        if (iArr == null) {
            return new int[i7];
        }
        int length = iArr.length;
        return length >= i7 ? iArr : new int[Math.max(length + length, i7)];
    }

    private final int r(bh bhVar, lh lhVar, int i7) {
        int d7;
        int a7 = this.f13361i.a();
        if (a7 > 0) {
            d7 = Math.min(i7, a7);
            lhVar.c(this.f13361i, d7);
        } else {
            d7 = lhVar.d(bhVar, i7, false);
        }
        this.M += d7;
        this.U += d7;
        return d7;
    }

    private final void s(bh bhVar, int i7) {
        if (this.f13358f.d() >= i7) {
            return;
        }
        if (this.f13358f.b() < i7) {
            rm rmVar = this.f13358f;
            byte[] bArr = rmVar.f11225a;
            int length = bArr.length;
            rmVar.t(Arrays.copyOf(bArr, Math.max(length + length, i7)), this.f13358f.d());
        }
        rm rmVar2 = this.f13358f;
        bhVar.h(rmVar2.f11225a, rmVar2.d(), i7 - this.f13358f.d(), false);
        this.f13358f.u(i7);
    }

    private final void t(bh bhVar, uh uhVar, int i7) {
        int i8;
        if ("S_TEXT/UTF8".equals(uhVar.f12791a)) {
            int i9 = i7 + 32;
            if (this.f13362j.b() < i9) {
                this.f13362j.f11225a = Arrays.copyOf(f13350a0, i9 + i7);
            }
            bhVar.h(this.f13362j.f11225a, 32, i7, false);
            this.f13362j.v(0);
            this.f13362j.u(i9);
            return;
        }
        lh lhVar = uhVar.O;
        if (!this.N) {
            if (uhVar.f12795e) {
                this.L &= -1073741825;
                if (!this.O) {
                    bhVar.h(this.f13358f.f11225a, 0, 1, false);
                    this.M++;
                    byte b7 = this.f13358f.f11225a[0];
                    if ((b7 & 128) == 128) {
                        throw new af("Extension bit is set in signal byte");
                    }
                    this.R = b7;
                    this.O = true;
                }
                byte b8 = this.R;
                if ((b8 & 1) == 1) {
                    int i10 = b8 & 2;
                    this.L |= 1073741824;
                    if (!this.P) {
                        bhVar.h(this.f13363k.f11225a, 0, 8, false);
                        this.M += 8;
                        this.P = true;
                        rm rmVar = this.f13358f;
                        rmVar.f11225a[0] = (byte) ((i10 != 2 ? 0 : 128) | 8);
                        rmVar.v(0);
                        lhVar.c(this.f13358f, 1);
                        this.U++;
                        this.f13363k.v(0);
                        lhVar.c(this.f13363k, 8);
                        this.U += 8;
                    }
                    if (i10 == 2) {
                        if (!this.Q) {
                            bhVar.h(this.f13358f.f11225a, 0, 1, false);
                            this.M++;
                            this.f13358f.v(0);
                            this.S = this.f13358f.g();
                            this.Q = true;
                        }
                        int i11 = this.S * 4;
                        this.f13358f.s(i11);
                        bhVar.h(this.f13358f.f11225a, 0, i11, false);
                        this.M += i11;
                        int i12 = (this.S >> 1) + 1;
                        int i13 = (i12 * 6) + 2;
                        ByteBuffer byteBuffer = this.f13365m;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f13365m = ByteBuffer.allocate(i13);
                        }
                        this.f13365m.position(0);
                        this.f13365m.putShort((short) i12);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i8 = this.S;
                            if (i14 >= i8) {
                                break;
                            }
                            int i16 = this.f13358f.i();
                            if (i14 % 2 == 0) {
                                this.f13365m.putShort((short) (i16 - i15));
                            } else {
                                this.f13365m.putInt(i16 - i15);
                            }
                            i14++;
                            i15 = i16;
                        }
                        int i17 = (i7 - this.M) - i15;
                        if ((i8 & 1) == 1) {
                            this.f13365m.putInt(i17);
                        } else {
                            this.f13365m.putShort((short) i17);
                            this.f13365m.putInt(0);
                        }
                        this.f13364l.t(this.f13365m.array(), i13);
                        lhVar.c(this.f13364l, i13);
                        this.U += i13;
                    }
                }
            } else {
                byte[] bArr = uhVar.f12796f;
                if (bArr != null) {
                    this.f13361i.t(bArr, bArr.length);
                }
            }
            this.N = true;
        }
        int d7 = i7 + this.f13361i.d();
        if (!"V_MPEG4/ISO/AVC".equals(uhVar.f12791a) && !"V_MPEGH/ISO/HEVC".equals(uhVar.f12791a)) {
            while (true) {
                int i18 = this.M;
                if (i18 >= d7) {
                    break;
                } else {
                    r(bhVar, lhVar, d7 - i18);
                }
            }
        } else {
            byte[] bArr2 = this.f13357e.f11225a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i19 = uhVar.P;
            int i20 = 4 - i19;
            while (this.M < d7) {
                int i21 = this.T;
                if (i21 == 0) {
                    int min = Math.min(i19, this.f13361i.a());
                    bhVar.h(bArr2, i20 + min, i19 - min, false);
                    if (min > 0) {
                        this.f13361i.q(bArr2, i20, min);
                    }
                    this.M += i19;
                    this.f13357e.v(0);
                    this.T = this.f13357e.i();
                    this.f13356d.v(0);
                    lhVar.c(this.f13356d, 4);
                    this.U += 4;
                } else {
                    this.T = i21 - r(bhVar, lhVar, i21);
                }
            }
        }
        if ("A_VORBIS".equals(uhVar.f12791a)) {
            this.f13359g.v(0);
            lhVar.c(this.f13359g, 4);
            this.U += 4;
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void b(long j7, long j8) {
        this.f13378z = -9223372036854775807L;
        this.D = 0;
        this.Y.a();
        this.f13353a.d();
        p();
    }

    final void c(int i7) {
        jh ihVar;
        mm mmVar;
        mm mmVar2;
        int i8;
        int i9 = 0;
        if (i7 == 160) {
            if (this.D != 2) {
                return;
            }
            if (!this.W) {
                this.L |= 1;
            }
            o(this.f13354b.get(this.J), this.E);
            this.D = 0;
            return;
        }
        if (i7 == 174) {
            String str = this.f13371s.f12791a;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                uh uhVar = this.f13371s;
                uhVar.b(this.X, uhVar.f12792b);
                SparseArray<uh> sparseArray = this.f13354b;
                uh uhVar2 = this.f13371s;
                sparseArray.put(uhVar2.f12792b, uhVar2);
            }
            this.f13371s = null;
            return;
        }
        if (i7 == 19899) {
            int i10 = this.f13373u;
            if (i10 != -1) {
                long j7 = this.f13374v;
                if (j7 != -1) {
                    if (i10 == 475249515) {
                        this.f13376x = j7;
                        return;
                    }
                    return;
                }
            }
            throw new af("Mandatory element SeekID or SeekPosition not found");
        }
        if (i7 == 25152) {
            uh uhVar3 = this.f13371s;
            if (uhVar3.f12795e) {
                if (uhVar3.f12797g == null) {
                    throw new af("Encrypted Track found but ContentEncKeyID was not found");
                }
                uhVar3.f12799i = new yg(new xg(he.f6195b, "video/webm", this.f13371s.f12797g.f7514b, false));
                return;
            }
            return;
        }
        if (i7 == 28032) {
            uh uhVar4 = this.f13371s;
            if (uhVar4.f12795e && uhVar4.f12796f != null) {
                throw new af("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i7 == 357149030) {
            if (this.f13368p == -9223372036854775807L) {
                this.f13368p = 1000000L;
            }
            long j8 = this.f13369q;
            if (j8 != -9223372036854775807L) {
                this.f13370r = n(j8);
                return;
            }
            return;
        }
        if (i7 == 374648427) {
            if (this.f13354b.size() == 0) {
                throw new af("No valid tracks were found");
            }
            this.X.a();
            return;
        }
        if (i7 == 475249515 && !this.f13372t) {
            dh dhVar = this.X;
            if (this.f13367o == -1 || this.f13370r == -9223372036854775807L || (mmVar = this.A) == null || mmVar.a() == 0 || (mmVar2 = this.B) == null || mmVar2.a() != this.A.a()) {
                this.A = null;
                this.B = null;
                ihVar = new ih(this.f13370r);
            } else {
                int a7 = this.A.a();
                int[] iArr = new int[a7];
                long[] jArr = new long[a7];
                long[] jArr2 = new long[a7];
                long[] jArr3 = new long[a7];
                for (int i11 = 0; i11 < a7; i11++) {
                    jArr3[i11] = this.A.b(i11);
                    jArr[i11] = this.f13367o + this.B.b(i11);
                }
                while (true) {
                    i8 = a7 - 1;
                    if (i9 >= i8) {
                        break;
                    }
                    int i12 = i9 + 1;
                    iArr[i9] = (int) (jArr[i12] - jArr[i9]);
                    jArr2[i9] = jArr3[i12] - jArr3[i9];
                    i9 = i12;
                }
                iArr[i8] = (int) ((this.f13367o + this.f13366n) - jArr[i8]);
                jArr2[i8] = this.f13370r - jArr3[i8];
                this.A = null;
                this.B = null;
                ihVar = new ah(iArr, jArr, jArr2, jArr3);
            }
            dhVar.b(ihVar);
            this.f13372t = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final boolean d(bh bhVar) {
        return new wh().a(bhVar);
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final int e(bh bhVar, hh hhVar) {
        this.V = false;
        while (!this.V) {
            if (!this.Y.c(bhVar)) {
                return -1;
            }
            long d7 = bhVar.d();
            if (this.f13375w) {
                this.f13377y = d7;
                hhVar.f6243a = this.f13376x;
                this.f13375w = false;
                return 1;
            }
            if (this.f13372t) {
                long j7 = this.f13377y;
                if (j7 != -1) {
                    hhVar.f6243a = j7;
                    this.f13377y = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void f(dh dhVar) {
        this.X = dhVar;
    }

    final void g(int i7, double d7) {
        if (i7 == 181) {
            this.f13371s.I = (int) d7;
            return;
        }
        if (i7 == 17545) {
            this.f13369q = (long) d7;
            return;
        }
        switch (i7) {
            case 21969:
                this.f13371s.f12813w = (float) d7;
                break;
            case 21970:
                this.f13371s.f12814x = (float) d7;
                break;
            case 21971:
                this.f13371s.f12815y = (float) d7;
                break;
            case 21972:
                this.f13371s.f12816z = (float) d7;
                break;
            case 21973:
                this.f13371s.A = (float) d7;
                break;
            case 21974:
                this.f13371s.B = (float) d7;
                break;
            case 21975:
                this.f13371s.C = (float) d7;
                break;
            case 21976:
                this.f13371s.D = (float) d7;
                break;
            case 21977:
                this.f13371s.E = (float) d7;
                break;
            case 21978:
                this.f13371s.F = (float) d7;
                break;
        }
    }

    final void h(int i7, long j7) {
        if (i7 == 20529) {
            if (j7 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j7);
            sb.append(" not supported");
            throw new af(sb.toString());
        }
        if (i7 == 20530) {
            if (j7 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j7);
            sb2.append(" not supported");
            throw new af(sb2.toString());
        }
        switch (i7) {
            case 131:
                this.f13371s.f12793c = (int) j7;
                return;
            case 136:
                this.f13371s.L = j7 == 1;
                return;
            case 155:
                this.F = n(j7);
                return;
            case 159:
                this.f13371s.G = (int) j7;
                return;
            case 176:
                this.f13371s.f12800j = (int) j7;
                return;
            case 179:
                this.A.c(n(j7));
                return;
            case 186:
                this.f13371s.f12801k = (int) j7;
                return;
            case 215:
                this.f13371s.f12792b = (int) j7;
                return;
            case 231:
                this.f13378z = n(j7);
                return;
            case 241:
                if (this.C) {
                    return;
                }
                this.B.c(j7);
                this.C = true;
                return;
            case 251:
                this.W = true;
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j7);
                sb3.append(" not supported");
                throw new af(sb3.toString());
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j7);
                    sb4.append(" not supported");
                    throw new af(sb4.toString());
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j7);
                sb5.append(" not supported");
                throw new af(sb5.toString());
            case 18401:
                if (j7 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j7);
                sb6.append(" not supported");
                throw new af(sb6.toString());
            case 18408:
                if (j7 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j7);
                sb7.append(" not supported");
                throw new af(sb7.toString());
            case 21420:
                this.f13374v = j7 + this.f13367o;
                return;
            case 21432:
                int i8 = (int) j7;
                if (i8 == 0) {
                    this.f13371s.f12806p = 0;
                    return;
                }
                if (i8 == 1) {
                    this.f13371s.f12806p = 2;
                    return;
                } else if (i8 == 3) {
                    this.f13371s.f12806p = 1;
                    return;
                } else {
                    if (i8 != 15) {
                        return;
                    }
                    this.f13371s.f12806p = 3;
                    return;
                }
            case 21680:
                this.f13371s.f12802l = (int) j7;
                return;
            case 21682:
                this.f13371s.f12804n = (int) j7;
                return;
            case 21690:
                this.f13371s.f12803m = (int) j7;
                return;
            case 21930:
                this.f13371s.M = j7 == 1;
                return;
            case 22186:
                this.f13371s.J = j7;
                return;
            case 22203:
                this.f13371s.K = j7;
                return;
            case 25188:
                this.f13371s.H = (int) j7;
                return;
            case 2352003:
                this.f13371s.f12794d = (int) j7;
                return;
            case 2807729:
                this.f13368p = j7;
                return;
            default:
                switch (i7) {
                    case 21945:
                        int i9 = (int) j7;
                        if (i9 == 1) {
                            this.f13371s.f12810t = 2;
                            return;
                        } else {
                            if (i9 != 2) {
                                return;
                            }
                            this.f13371s.f12810t = 1;
                            return;
                        }
                    case 21946:
                        int i10 = (int) j7;
                        if (i10 != 1) {
                            if (i10 == 16) {
                                this.f13371s.f12809s = 6;
                                return;
                            } else if (i10 == 18) {
                                this.f13371s.f12809s = 7;
                                return;
                            } else if (i10 != 6 && i10 != 7) {
                                return;
                            }
                        }
                        this.f13371s.f12809s = 3;
                        return;
                    case 21947:
                        uh uhVar = this.f13371s;
                        uhVar.f12807q = true;
                        int i11 = (int) j7;
                        if (i11 == 1) {
                            uhVar.f12808r = 1;
                            return;
                        }
                        if (i11 == 9) {
                            uhVar.f12808r = 6;
                            return;
                        } else {
                            if (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) {
                                uhVar.f12808r = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.f13371s.f12811u = (int) j7;
                        return;
                    case 21949:
                        this.f13371s.f12812v = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }

    final void i(int i7, long j7, long j8) {
        if (i7 == 160) {
            this.W = false;
            return;
        }
        if (i7 == 174) {
            this.f13371s = new uh(null);
            return;
        }
        if (i7 == 187) {
            this.C = false;
            return;
        }
        if (i7 == 19899) {
            this.f13373u = -1;
            this.f13374v = -1L;
            return;
        }
        if (i7 == 20533) {
            this.f13371s.f12795e = true;
            return;
        }
        if (i7 == 21968) {
            this.f13371s.f12807q = true;
            return;
        }
        if (i7 == 408125543) {
            long j9 = this.f13367o;
            if (j9 != -1 && j9 != j7) {
                throw new af("Multiple Segment elements not supported");
            }
            this.f13367o = j7;
            this.f13366n = j8;
            return;
        }
        if (i7 == 475249515) {
            this.A = new mm(32);
            this.B = new mm(32);
        } else if (i7 == 524531317 && !this.f13372t) {
            if (this.f13355c && this.f13376x != -1) {
                this.f13375w = true;
            } else {
                this.X.b(new ih(this.f13370r));
                this.f13372t = true;
            }
        }
    }

    final void j(int i7, String str) {
        if (i7 == 134) {
            this.f13371s.f12791a = str;
            return;
        }
        if (i7 != 17026) {
            if (i7 != 2274716) {
                return;
            }
            this.f13371s.N = str;
        } else {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new af(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01eb, code lost:
    
        throw new com.google.android.gms.internal.ads.af("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void k(int i7, int i8, bh bhVar) {
        long j7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = i7;
        int i14 = 1;
        int i15 = 0;
        if (i13 != 161 && i13 != 163) {
            if (i13 == 16981) {
                byte[] bArr = new byte[i8];
                this.f13371s.f12796f = bArr;
                bhVar.h(bArr, 0, i8, false);
                return;
            }
            if (i13 == 18402) {
                byte[] bArr2 = new byte[i8];
                bhVar.h(bArr2, 0, i8, false);
                this.f13371s.f12797g = new kh(1, bArr2);
                return;
            }
            if (i13 == 21419) {
                Arrays.fill(this.f13360h.f11225a, (byte) 0);
                bhVar.h(this.f13360h.f11225a, 4 - i8, i8, false);
                this.f13360h.v(0);
                this.f13373u = (int) this.f13360h.m();
                return;
            }
            if (i13 == 25506) {
                byte[] bArr3 = new byte[i8];
                this.f13371s.f12798h = bArr3;
                bhVar.h(bArr3, 0, i8, false);
                return;
            } else if (i13 == 30322) {
                byte[] bArr4 = new byte[i8];
                this.f13371s.f12805o = bArr4;
                bhVar.h(bArr4, 0, i8, false);
                return;
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unexpected id: ");
                sb.append(i13);
                throw new af(sb.toString());
            }
        }
        if (this.D == 0) {
            this.J = (int) this.f13353a.e(bhVar, false, true, 8);
            this.K = this.f13353a.a();
            this.F = -9223372036854775807L;
            this.D = 1;
            this.f13358f.r();
        }
        uh uhVar = this.f13354b.get(this.J);
        if (uhVar == null) {
            bhVar.i(i8 - this.K, false);
            this.D = 0;
            return;
        }
        if (this.D == 1) {
            s(bhVar, 3);
            int i16 = (this.f13358f.f11225a[2] & 6) >> 1;
            byte b7 = 255;
            if (i16 == 0) {
                this.H = 1;
                int[] q7 = q(this.I, 1);
                this.I = q7;
                q7[0] = (i8 - this.K) - 3;
            } else {
                if (i13 != 163) {
                    throw new af("Lacing only supported in SimpleBlocks.");
                }
                int i17 = 4;
                s(bhVar, 4);
                int i18 = (this.f13358f.f11225a[3] & 255) + 1;
                this.H = i18;
                int[] q8 = q(this.I, i18);
                this.I = q8;
                if (i16 == 2) {
                    int i19 = this.K;
                    int i20 = this.H;
                    Arrays.fill(q8, 0, i20, ((i8 - i19) - 4) / i20);
                } else if (i16 == 1) {
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        i9 = this.H - 1;
                        if (i21 >= i9) {
                            break;
                        }
                        this.I[i21] = 0;
                        do {
                            i17++;
                            s(bhVar, i17);
                            i10 = this.f13358f.f11225a[i17 - 1] & 255;
                            int[] iArr = this.I;
                            i11 = iArr[i21] + i10;
                            iArr[i21] = i11;
                        } while (i10 == 255);
                        i22 += i11;
                        i21++;
                    }
                    this.I[i9] = ((i8 - this.K) - i17) - i22;
                } else {
                    if (i16 != 3) {
                        throw new af("Unexpected lacing value: 2");
                    }
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        int i25 = this.H - 1;
                        if (i23 >= i25) {
                            this.I[i25] = ((i8 - this.K) - i17) - i24;
                            break;
                        }
                        this.I[i23] = i15;
                        i17++;
                        s(bhVar, i17);
                        int i26 = i17 - 1;
                        if (this.f13358f.f11225a[i26] == 0) {
                            throw new af("No valid varint length mask found");
                        }
                        int i27 = 0;
                        while (true) {
                            if (i27 >= 8) {
                                j7 = 0;
                                break;
                            }
                            int i28 = i14 << (7 - i27);
                            if ((this.f13358f.f11225a[i26] & i28) != 0) {
                                int i29 = i17 + i27;
                                s(bhVar, i29);
                                int i30 = i26 + 1;
                                j7 = this.f13358f.f11225a[i26] & b7 & (i28 ^ (-1));
                                while (i30 < i29) {
                                    j7 = (j7 << 8) | (this.f13358f.f11225a[i30] & b7);
                                    i30++;
                                    i29 = i29;
                                    b7 = 255;
                                }
                                int i31 = i29;
                                if (i23 > 0) {
                                    j7 -= (1 << ((i27 * 7) + 6)) - 1;
                                }
                                i17 = i31;
                            } else {
                                i27++;
                                i14 = 1;
                                b7 = 255;
                            }
                        }
                        if (j7 < -2147483648L || j7 > 2147483647L) {
                            break;
                        }
                        int i32 = (int) j7;
                        int[] iArr2 = this.I;
                        if (i23 != 0) {
                            i32 += iArr2[i23 - 1];
                        }
                        iArr2[i23] = i32;
                        i24 += i32;
                        i23++;
                        i14 = 1;
                        i15 = 0;
                        b7 = 255;
                    }
                }
            }
            byte[] bArr5 = this.f13358f.f11225a;
            this.E = this.f13378z + n((bArr5[1] & 255) | (bArr5[0] << 8));
            byte b8 = this.f13358f.f11225a[2];
            int i33 = b8 & 8;
            if (uhVar.f12793c != 2) {
                if (i13 == 163) {
                    if ((b8 & 128) == 128) {
                        i13 = 163;
                    } else {
                        i13 = 163;
                    }
                }
                i12 = 0;
                this.L = i12 | (i33 != 8 ? Integer.MIN_VALUE : 0);
                this.D = 2;
                this.G = 0;
            }
            i12 = 1;
            this.L = i12 | (i33 != 8 ? Integer.MIN_VALUE : 0);
            this.D = 2;
            this.G = 0;
        }
        if (i13 != 163) {
            t(bhVar, uhVar, this.I[0]);
            return;
        }
        while (true) {
            int i34 = this.G;
            if (i34 >= this.H) {
                this.D = 0;
                return;
            } else {
                t(bhVar, uhVar, this.I[i34]);
                o(uhVar, this.E + ((this.G * uhVar.f12794d) / 1000));
                this.G++;
            }
        }
    }
}
