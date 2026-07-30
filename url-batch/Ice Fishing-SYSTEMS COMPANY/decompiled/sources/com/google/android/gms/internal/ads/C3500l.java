package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3500l extends AbstractC3446k {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f32494A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f32495B;

    /* renamed from: C, reason: collision with root package name */
    public final int f32496C;

    /* renamed from: D, reason: collision with root package name */
    public final int f32497D;

    /* renamed from: E, reason: collision with root package name */
    public final int f32498E;

    /* renamed from: F, reason: collision with root package name */
    public final int f32499F;

    /* renamed from: G, reason: collision with root package name */
    public final int f32500G;

    /* renamed from: H, reason: collision with root package name */
    public final int f32501H;

    /* renamed from: I, reason: collision with root package name */
    public final int f32502I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final int f32503K;

    /* renamed from: L, reason: collision with root package name */
    public final int f32504L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f32505M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f32506N;

    /* renamed from: O, reason: collision with root package name */
    public final int f32507O;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f32508x;

    /* renamed from: y, reason: collision with root package name */
    public final C3286h f32509y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f32510z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0101 A[EDGE_INSN: B:140:0x0101->B:77:0x0101 BREAK  A[LOOP:1: B:69:0x00e6->B:138:0x00fe], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3500l(int i, B8 b82, int i4, C3286h c3286h, int i9, String str, boolean z8) {
        super(i, b82, i4);
        boolean z9;
        boolean z10;
        int i10;
        C3675oC c3675oC;
        int i11;
        int i12;
        int i13;
        C3675oC c3675oC2;
        TP tp;
        String str2;
        int i14;
        char c4;
        boolean z11;
        int i15;
        TP tp2;
        int i16;
        int i17;
        float f6;
        int i18;
        TP tp3;
        int i19;
        int i20;
        int i21;
        this.f32509y = c3286h;
        int i22 = 1;
        int i23 = true != c3286h.f31127x ? 16 : 24;
        if (z8 && (((i19 = (tp3 = this.f32229w).f27783v) == -1 || i19 <= c3286h.f26547a) && ((i20 = tp3.f27784w) == -1 || i20 <= c3286h.f26548b))) {
            float f9 = tp3.f27787z;
            if ((f9 == -1.0f || f9 <= c3286h.f26549c) && ((i21 = tp3.f27771j) == -1 || i21 <= c3286h.f26550d)) {
                z9 = true;
                this.f32508x = z9;
                if (z8 && (((i16 = (tp2 = this.f32229w).f27783v) == -1 || i16 >= 0) && ((i17 = tp2.f27784w) == -1 || i17 >= 0))) {
                    f6 = tp2.f27787z;
                    if ((f6 != -1.0f || f6 >= 0.0f) && ((i18 = tp2.f27771j) == -1 || i18 >= 0)) {
                        z10 = true;
                        this.f32510z = z10;
                        this.f32494A = AbstractC3149eQ.J(i9, false);
                        TP tp4 = this.f32229w;
                        float f10 = tp4.f27787z;
                        this.f32495B = f10 == -1.0f && f10 >= 10.0f;
                        this.f32496C = tp4.f27771j;
                        int i24 = tp4.f27783v;
                        this.f32497D = (i24 != -1 || (i15 = tp4.f27784w) == -1) ? -1 : i24 * i15;
                        i10 = 0;
                        while (true) {
                            c3675oC = c3286h.f26556k;
                            i11 = Integer.MAX_VALUE;
                            if (i10 < c3675oC.f33117w) {
                                i12 = 0;
                                i10 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i12 = C3554m.f(this.f32229w, (String) c3675oC.get(i10), false);
                                if (i12 > 0) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        this.f32499F = i10;
                        this.f32500G = i12;
                        int i25 = this.f32229w.f27768f;
                        this.f32501H = (i25 == 0 && i25 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                        int i26 = this.f32229w.f27768f;
                        this.J = (i26 == 0 && (i26 & 1) == 0) ? false : true;
                        this.f32503K = C3554m.f(this.f32229w, str, C3554m.e(str) != null);
                        i13 = 0;
                        while (true) {
                            c3675oC2 = c3286h.i;
                            if (i13 < c3675oC2.f33117w) {
                                String str3 = this.f32229w.f27776o;
                                if (str3 != null && str3.equals(c3675oC2.get(i13))) {
                                    i11 = i13;
                                    break;
                                }
                                i13++;
                            } else {
                                break;
                            }
                        }
                        this.f32498E = i11;
                        this.f32502I = C3554m.g(this.f32229w, c3286h.f26555j);
                        this.f32505M = (i9 & 384) != 128;
                        this.f32506N = (i9 & 64) != 64;
                        tp = this.f32229w;
                        str2 = tp.f27776o;
                        if (str2 != null) {
                            i14 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -1662541442:
                                    if (str2.equals(com.anythink.basead.exoplayer.k.o.i)) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1331836730:
                                    if (str2.equals(com.anythink.basead.exoplayer.k.o.f8608h)) {
                                        c4 = 4;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1599127257:
                                    if (str2.equals(com.anythink.basead.exoplayer.k.o.f8610k)) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            if (c4 == 0) {
                                i14 = 5;
                            } else if (c4 != 1) {
                                if (c4 == 2) {
                                    i14 = 3;
                                } else if (c4 == 3) {
                                    i14 = 2;
                                } else if (c4 == 4) {
                                    i14 = 1;
                                }
                            }
                            this.f32507O = i14;
                            if ((tp.f27768f & 16384) == 0) {
                                C3286h c3286h2 = this.f32509y;
                                if (AbstractC3149eQ.J(i9, c3286h2.f31122B) && ((z11 = this.f32508x) || c3286h2.f31126w)) {
                                    if (AbstractC3149eQ.J(i9, false) && this.f32510z && z11 && tp.f27771j != -1 && (i23 & i9) != 0) {
                                        i22 = 2;
                                    }
                                    this.f32504L = i22;
                                }
                            }
                            i22 = 0;
                            this.f32504L = i22;
                        }
                        i14 = 0;
                        this.f32507O = i14;
                        if ((tp.f27768f & 16384) == 0) {
                        }
                        i22 = 0;
                        this.f32504L = i22;
                    }
                }
                z10 = false;
                this.f32510z = z10;
                this.f32494A = AbstractC3149eQ.J(i9, false);
                TP tp42 = this.f32229w;
                float f102 = tp42.f27787z;
                this.f32495B = f102 == -1.0f && f102 >= 10.0f;
                this.f32496C = tp42.f27771j;
                int i242 = tp42.f27783v;
                this.f32497D = (i242 != -1 || (i15 = tp42.f27784w) == -1) ? -1 : i242 * i15;
                i10 = 0;
                while (true) {
                    c3675oC = c3286h.f26556k;
                    i11 = Integer.MAX_VALUE;
                    if (i10 < c3675oC.f33117w) {
                    }
                    i10++;
                }
                this.f32499F = i10;
                this.f32500G = i12;
                int i252 = this.f32229w.f27768f;
                this.f32501H = (i252 == 0 && i252 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                int i262 = this.f32229w.f27768f;
                this.J = (i262 == 0 && (i262 & 1) == 0) ? false : true;
                this.f32503K = C3554m.f(this.f32229w, str, C3554m.e(str) != null);
                i13 = 0;
                while (true) {
                    c3675oC2 = c3286h.i;
                    if (i13 < c3675oC2.f33117w) {
                    }
                    i13++;
                }
                this.f32498E = i11;
                this.f32502I = C3554m.g(this.f32229w, c3286h.f26555j);
                this.f32505M = (i9 & 384) != 128;
                this.f32506N = (i9 & 64) != 64;
                tp = this.f32229w;
                str2 = tp.f27776o;
                if (str2 != null) {
                }
                i14 = 0;
                this.f32507O = i14;
                if ((tp.f27768f & 16384) == 0) {
                }
                i22 = 0;
                this.f32504L = i22;
            }
        }
        z9 = false;
        this.f32508x = z9;
        if (z8) {
            f6 = tp2.f27787z;
            if (f6 != -1.0f) {
            }
            z10 = true;
            this.f32510z = z10;
            this.f32494A = AbstractC3149eQ.J(i9, false);
            TP tp422 = this.f32229w;
            float f1022 = tp422.f27787z;
            this.f32495B = f1022 == -1.0f && f1022 >= 10.0f;
            this.f32496C = tp422.f27771j;
            int i2422 = tp422.f27783v;
            this.f32497D = (i2422 != -1 || (i15 = tp422.f27784w) == -1) ? -1 : i2422 * i15;
            i10 = 0;
            while (true) {
                c3675oC = c3286h.f26556k;
                i11 = Integer.MAX_VALUE;
                if (i10 < c3675oC.f33117w) {
                }
                i10++;
            }
            this.f32499F = i10;
            this.f32500G = i12;
            int i2522 = this.f32229w.f27768f;
            this.f32501H = (i2522 == 0 && i2522 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
            int i2622 = this.f32229w.f27768f;
            this.J = (i2622 == 0 && (i2622 & 1) == 0) ? false : true;
            this.f32503K = C3554m.f(this.f32229w, str, C3554m.e(str) != null);
            i13 = 0;
            while (true) {
                c3675oC2 = c3286h.i;
                if (i13 < c3675oC2.f33117w) {
                }
                i13++;
            }
            this.f32498E = i11;
            this.f32502I = C3554m.g(this.f32229w, c3286h.f26555j);
            this.f32505M = (i9 & 384) != 128;
            this.f32506N = (i9 & 64) != 64;
            tp = this.f32229w;
            str2 = tp.f27776o;
            if (str2 != null) {
            }
            i14 = 0;
            this.f32507O = i14;
            if ((tp.f27768f & 16384) == 0) {
            }
            i22 = 0;
            this.f32504L = i22;
        }
        z10 = false;
        this.f32510z = z10;
        this.f32494A = AbstractC3149eQ.J(i9, false);
        TP tp4222 = this.f32229w;
        float f10222 = tp4222.f27787z;
        this.f32495B = f10222 == -1.0f && f10222 >= 10.0f;
        this.f32496C = tp4222.f27771j;
        int i24222 = tp4222.f27783v;
        this.f32497D = (i24222 != -1 || (i15 = tp4222.f27784w) == -1) ? -1 : i24222 * i15;
        i10 = 0;
        while (true) {
            c3675oC = c3286h.f26556k;
            i11 = Integer.MAX_VALUE;
            if (i10 < c3675oC.f33117w) {
            }
            i10++;
        }
        this.f32499F = i10;
        this.f32500G = i12;
        int i25222 = this.f32229w.f27768f;
        this.f32501H = (i25222 == 0 && i25222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
        int i26222 = this.f32229w.f27768f;
        this.J = (i26222 == 0 && (i26222 & 1) == 0) ? false : true;
        this.f32503K = C3554m.f(this.f32229w, str, C3554m.e(str) != null);
        i13 = 0;
        while (true) {
            c3675oC2 = c3286h.i;
            if (i13 < c3675oC2.f33117w) {
            }
            i13++;
        }
        this.f32498E = i11;
        this.f32502I = C3554m.g(this.f32229w, c3286h.f26555j);
        this.f32505M = (i9 & 384) != 128;
        this.f32506N = (i9 & 64) != 64;
        tp = this.f32229w;
        str2 = tp.f27776o;
        if (str2 != null) {
        }
        i14 = 0;
        this.f32507O = i14;
        if ((tp.f27768f & 16384) == 0) {
        }
        i22 = 0;
        this.f32504L = i22;
    }

    public static int c(C3500l c3500l, C3500l c3500l2) {
        NB d2 = NB.f26491a.d(c3500l.f32494A, c3500l2.f32494A);
        Integer valueOf = Integer.valueOf(c3500l.f32499F);
        Integer valueOf2 = Integer.valueOf(c3500l2.f32499F);
        C3567mC c3567mC = C3567mC.f32673v;
        NB a9 = d2.a(valueOf, valueOf2, c3567mC).b(c3500l.f32500G, c3500l2.f32500G).b(c3500l.f32501H, c3500l2.f32501H).a(Integer.valueOf(c3500l.f32502I), Integer.valueOf(c3500l2.f32502I), c3567mC).d(c3500l.J, c3500l2.J).b(c3500l.f32503K, c3500l2.f32503K).d(c3500l.f32495B, c3500l2.f32495B).d(c3500l.f32508x, c3500l2.f32508x).d(c3500l.f32510z, c3500l2.f32510z).a(Integer.valueOf(c3500l.f32498E), Integer.valueOf(c3500l2.f32498E), c3567mC);
        boolean z8 = c3500l.f32505M;
        NB d3 = a9.d(z8, c3500l2.f32505M);
        boolean z9 = c3500l.f32506N;
        NB d9 = d3.d(z9, c3500l2.f32506N);
        if (z8 && z9) {
            d9 = d9.b(c3500l.f32507O, c3500l2.f32507O);
        }
        return d9.e();
    }

    public static int d(C3500l c3500l, C3500l c3500l2) {
        Comparator c4052vC = (c3500l.f32508x && c3500l.f32494A) ? C3554m.f32629k : new C4052vC();
        c3500l.f32509y.getClass();
        return LB.f(c4052vC.compare(Integer.valueOf(c3500l.f32497D), Integer.valueOf(c3500l2.f32497D))).a(Integer.valueOf(c3500l.f32496C), Integer.valueOf(c3500l2.f32496C), c4052vC).e();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3446k
    public final int a() {
        return this.f32504L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3446k
    public final /* bridge */ /* synthetic */ boolean b(AbstractC3446k abstractC3446k) {
        C3500l c3500l = (C3500l) abstractC3446k;
        if (!Objects.equals(this.f32229w.f27776o, c3500l.f32229w.f27776o)) {
            return false;
        }
        this.f32509y.getClass();
        return this.f32505M == c3500l.f32505M && this.f32506N == c3500l.f32506N;
    }
}
