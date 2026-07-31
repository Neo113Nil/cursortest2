package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.jn;
import com.yandex.mobile.ads.impl.uu;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class jn extends kn {

    /* renamed from: g, reason: collision with root package name */
    private final sf1 f27734g = new sf1();

    /* renamed from: h, reason: collision with root package name */
    private final rf1 f27735h = new rf1();

    /* renamed from: i, reason: collision with root package name */
    private int f27736i = -1;

    /* renamed from: j, reason: collision with root package name */
    private final int f27737j;

    /* renamed from: k, reason: collision with root package name */
    private final b[] f27738k;

    /* renamed from: l, reason: collision with root package name */
    private b f27739l;

    /* renamed from: m, reason: collision with root package name */
    private List<uu> f27740m;

    /* renamed from: n, reason: collision with root package name */
    private List<uu> f27741n;

    /* renamed from: o, reason: collision with root package name */
    private c f27742o;

    /* renamed from: p, reason: collision with root package name */
    private int f27743p;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f27744c = new Comparator() { // from class: com.yandex.mobile.ads.impl.G8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a4;
                a4 = jn.a.a((jn.a) obj, (jn.a) obj2);
                return a4;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final uu f27745a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27746b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f4, int i4, float f5, int i5, boolean z4, int i6, int i7) {
            uu.a d4 = new uu.a().a(spannableStringBuilder).b(alignment).a(0, f4).a(i4).b(f5).b(i5).d(-3.4028235E38f);
            if (z4) {
                d4.d(i6);
            }
            this.f27745a = d4.a();
            this.f27746b = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.f27746b, aVar.f27746b);
        }
    }

    private static final class b {

        /* renamed from: A, reason: collision with root package name */
        private static final int[] f27747A;

        /* renamed from: B, reason: collision with root package name */
        private static final boolean[] f27748B;

        /* renamed from: C, reason: collision with root package name */
        private static final int[] f27749C;

        /* renamed from: D, reason: collision with root package name */
        private static final int[] f27750D;

        /* renamed from: E, reason: collision with root package name */
        private static final int[] f27751E;

        /* renamed from: F, reason: collision with root package name */
        private static final int[] f27752F;

        /* renamed from: w, reason: collision with root package name */
        public static final int f27753w = a(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f27754x;

        /* renamed from: y, reason: collision with root package name */
        private static final int[] f27755y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f27756z;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f27757a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f27758b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f27759c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27760d;

        /* renamed from: e, reason: collision with root package name */
        private int f27761e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f27762f;

        /* renamed from: g, reason: collision with root package name */
        private int f27763g;

        /* renamed from: h, reason: collision with root package name */
        private int f27764h;

        /* renamed from: i, reason: collision with root package name */
        private int f27765i;

        /* renamed from: j, reason: collision with root package name */
        private int f27766j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f27767k;

        /* renamed from: l, reason: collision with root package name */
        private int f27768l;

        /* renamed from: m, reason: collision with root package name */
        private int f27769m;

        /* renamed from: n, reason: collision with root package name */
        private int f27770n;

        /* renamed from: o, reason: collision with root package name */
        private int f27771o;

        /* renamed from: p, reason: collision with root package name */
        private int f27772p;

        /* renamed from: q, reason: collision with root package name */
        private int f27773q;

        /* renamed from: r, reason: collision with root package name */
        private int f27774r;

        /* renamed from: s, reason: collision with root package name */
        private int f27775s;

        /* renamed from: t, reason: collision with root package name */
        private int f27776t;

        /* renamed from: u, reason: collision with root package name */
        private int f27777u;

        /* renamed from: v, reason: collision with root package name */
        private int f27778v;

        static {
            int a4 = a(0, 0, 0, 0);
            f27754x = a4;
            int a5 = a(0, 0, 0, 3);
            f27755y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f27756z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f27747A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f27748B = new boolean[]{false, false, false, true, true, true, false};
            f27749C = new int[]{a4, a5, a4, a4, a5, a4, a4};
            f27750D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f27751E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f27752F = new int[]{a4, a4, a4, a4, a4, a5, a5};
        }

        public b() {
            b();
        }

        public final void a(char c4) {
            if (c4 != '\n') {
                this.f27758b.append(c4);
                return;
            }
            this.f27757a.add(a());
            this.f27758b.clear();
            if (this.f27772p != -1) {
                this.f27772p = 0;
            }
            if (this.f27773q != -1) {
                this.f27773q = 0;
            }
            if (this.f27774r != -1) {
                this.f27774r = 0;
            }
            if (this.f27776t != -1) {
                this.f27776t = 0;
            }
            while (true) {
                if ((!this.f27767k || this.f27757a.size() < this.f27766j) && this.f27757a.size() < 15) {
                    return;
                } else {
                    this.f27757a.remove(0);
                }
            }
        }

        public final void b() {
            this.f27757a.clear();
            this.f27758b.clear();
            this.f27772p = -1;
            this.f27773q = -1;
            this.f27774r = -1;
            this.f27776t = -1;
            this.f27778v = 0;
            this.f27759c = false;
            this.f27760d = false;
            this.f27761e = 4;
            this.f27762f = false;
            this.f27763g = 0;
            this.f27764h = 0;
            this.f27765i = 0;
            this.f27766j = 15;
            this.f27767k = true;
            this.f27768l = 0;
            this.f27769m = 0;
            this.f27770n = 0;
            int i4 = f27754x;
            this.f27771o = i4;
            this.f27775s = f27753w;
            this.f27777u = i4;
        }

        public static int a(int i4, int i5, int i6, int i7) {
            C2253tf.a(i4, 4);
            C2253tf.a(i5, 4);
            C2253tf.a(i6, 4);
            C2253tf.a(i7, 4);
            return Color.argb(i7 != 2 ? i7 != 3 ? 255 : 0 : 127, i4 > 1 ? 255 : 0, i5 > 1 ? 255 : 0, i6 > 1 ? 255 : 0);
        }

        public final void a(boolean z4, boolean z5) {
            if (this.f27772p != -1) {
                if (!z4) {
                    this.f27758b.setSpan(new StyleSpan(2), this.f27772p, this.f27758b.length(), 33);
                    this.f27772p = -1;
                }
            } else if (z4) {
                this.f27772p = this.f27758b.length();
            }
            if (this.f27773q == -1) {
                if (z5) {
                    this.f27773q = this.f27758b.length();
                }
            } else {
                if (z5) {
                    return;
                }
                this.f27758b.setSpan(new UnderlineSpan(), this.f27773q, this.f27758b.length(), 33);
                this.f27773q = -1;
            }
        }

        public final void a(int i4, int i5) {
            if (this.f27774r != -1 && this.f27775s != i4) {
                this.f27758b.setSpan(new ForegroundColorSpan(this.f27775s), this.f27774r, this.f27758b.length(), 33);
            }
            if (i4 != f27753w) {
                this.f27774r = this.f27758b.length();
                this.f27775s = i4;
            }
            if (this.f27776t != -1 && this.f27777u != i5) {
                this.f27758b.setSpan(new BackgroundColorSpan(this.f27777u), this.f27776t, this.f27758b.length(), 33);
            }
            if (i5 != f27754x) {
                this.f27776t = this.f27758b.length();
                this.f27777u = i5;
            }
        }

        public final SpannableString a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f27758b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f27772p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f27772p, length, 33);
                }
                if (this.f27773q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f27773q, length, 33);
                }
                if (this.f27774r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f27775s), this.f27774r, length, 33);
                }
                if (this.f27776t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f27777u), this.f27776t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f27779a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27780b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f27781c;

        /* renamed from: d, reason: collision with root package name */
        int f27782d = 0;

        public c(int i4, int i5) {
            this.f27779a = i4;
            this.f27780b = i5;
            this.f27781c = new byte[(i5 * 2) - 1];
        }
    }

    public jn(int i4, List<byte[]> list) {
        this.f27737j = i4 == -1 ? 1 : i4;
        if (list != null) {
            bq.a(list);
        }
        this.f27738k = new b[8];
        for (int i5 = 0; i5 < 8; i5++) {
            this.f27738k[i5] = new b();
        }
        this.f27739l = this.f27738k[0];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x0155. Please report as an issue. */
    private void i() {
        int i4;
        boolean z4;
        int i5;
        int i6;
        char c4;
        c cVar = this.f27742o;
        if (cVar == null) {
            return;
        }
        int i7 = 2;
        boolean z5 = true;
        if (cVar.f27782d != (cVar.f27780b * 2) - 1) {
            ms0.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f27742o.f27780b * 2) - 1) + ", but current index is " + this.f27742o.f27782d + " (sequence number " + this.f27742o.f27779a + ");");
        }
        rf1 rf1Var = this.f27735h;
        c cVar2 = this.f27742o;
        rf1Var.a(cVar2.f27782d, cVar2.f27781c);
        boolean z6 = false;
        while (true) {
            if (this.f27735h.b() > 0) {
                int i8 = 3;
                int b4 = this.f27735h.b(3);
                int b5 = this.f27735h.b(5);
                int i9 = 7;
                if (b4 == 7) {
                    this.f27735h.d(i7);
                    b4 = this.f27735h.b(6);
                    if (b4 < 7) {
                        fr0.a("Invalid extended service number: ", b4, "Cea708Decoder");
                    }
                }
                if (b5 == 0) {
                    if (b4 != 0) {
                        ms0.d("Cea708Decoder", "serviceNumber is non-zero (" + b4 + ") when blockSize is 0");
                    }
                } else if (b4 != this.f27737j) {
                    this.f27735h.e(b5);
                } else {
                    int e4 = (b5 * 8) + this.f27735h.e();
                    while (this.f27735h.e() < e4) {
                        int b6 = this.f27735h.b(8);
                        if (b6 == 16) {
                            i4 = i8;
                            z4 = true;
                            int b7 = this.f27735h.b(8);
                            if (b7 <= 31) {
                                i5 = 7;
                                if (b7 > 7) {
                                    if (b7 <= 15) {
                                        this.f27735h.d(8);
                                    } else if (b7 <= 23) {
                                        this.f27735h.d(16);
                                    } else if (b7 <= 31) {
                                        this.f27735h.d(24);
                                    }
                                }
                            } else {
                                i5 = 7;
                                if (b7 <= 127) {
                                    if (b7 == 32) {
                                        this.f27739l.a(' ');
                                    } else if (b7 == 33) {
                                        this.f27739l.a((char) 160);
                                    } else if (b7 == 37) {
                                        this.f27739l.a((char) 8230);
                                    } else if (b7 == 42) {
                                        this.f27739l.a((char) 352);
                                    } else if (b7 == 44) {
                                        this.f27739l.a((char) 338);
                                    } else if (b7 == 63) {
                                        this.f27739l.a((char) 376);
                                    } else if (b7 == 57) {
                                        this.f27739l.a((char) 8482);
                                    } else if (b7 == 58) {
                                        this.f27739l.a((char) 353);
                                    } else if (b7 == 60) {
                                        this.f27739l.a((char) 339);
                                    } else if (b7 != 61) {
                                        switch (b7) {
                                            case 48:
                                                this.f27739l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f27739l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f27739l.a((char) 8217);
                                                break;
                                            case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                                                this.f27739l.a((char) 8220);
                                                break;
                                            case IronSourceConstants.SET_USER_ID /* 52 */:
                                                this.f27739l.a((char) 8221);
                                                break;
                                            case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                                                this.f27739l.a((char) 8226);
                                                break;
                                            default:
                                                switch (b7) {
                                                    case 118:
                                                        this.f27739l.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f27739l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f27739l.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f27739l.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f27739l.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f27739l.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f27739l.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f27739l.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f27739l.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f27739l.a((char) 9484);
                                                        break;
                                                    default:
                                                        fr0.a("Invalid G2 character: ", b7, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f27739l.a((char) 8480);
                                    }
                                    i6 = 2;
                                    c4 = 6;
                                    z6 = z4;
                                    i8 = i4;
                                    i7 = i6;
                                    i9 = i5;
                                    z5 = z6;
                                } else {
                                    if (b7 > 159) {
                                        i6 = 2;
                                        c4 = 6;
                                        if (b7 <= 255) {
                                            if (b7 == 160) {
                                                this.f27739l.a((char) 13252);
                                            } else {
                                                fr0.a("Invalid G3 character: ", b7, "Cea708Decoder");
                                                this.f27739l.a('_');
                                            }
                                            z6 = z4;
                                            i8 = i4;
                                            i7 = i6;
                                            i9 = i5;
                                            z5 = z6;
                                        } else {
                                            fr0.a("Invalid extended command: ", b7, "Cea708Decoder");
                                        }
                                    } else if (b7 <= 135) {
                                        this.f27735h.d(32);
                                    } else if (b7 <= 143) {
                                        this.f27735h.d(40);
                                    } else if (b7 <= 159) {
                                        i6 = 2;
                                        this.f27735h.d(2);
                                        c4 = 6;
                                        this.f27735h.d(this.f27735h.b(6) * 8);
                                    }
                                    int i10 = i6;
                                    z5 = z4;
                                    i7 = i10;
                                    i8 = i4;
                                    i9 = i5;
                                }
                            }
                            i6 = 2;
                            c4 = 6;
                            int i102 = i6;
                            z5 = z4;
                            i7 = i102;
                            i8 = i4;
                            i9 = i5;
                        } else if (b6 <= 31) {
                            if (b6 != 0) {
                                if (b6 == i8) {
                                    this.f27740m = j();
                                } else if (b6 != 8) {
                                    switch (b6) {
                                        case 12:
                                            for (int i11 = 0; i11 < 8; i11++) {
                                                this.f27738k[i11].b();
                                            }
                                            break;
                                        case 13:
                                            this.f27739l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (b6 < 17 || b6 > 23) {
                                                if (b6 < 24 || b6 > 31) {
                                                    fr0.a("Invalid C0 command: ", b6, "Cea708Decoder");
                                                    break;
                                                } else {
                                                    fr0.a("Currently unsupported COMMAND_P16 Command: ", b6, "Cea708Decoder");
                                                    this.f27735h.d(16);
                                                    break;
                                                }
                                            } else {
                                                fr0.a("Currently unsupported COMMAND_EXT1 Command: ", b6, "Cea708Decoder");
                                                this.f27735h.d(8);
                                                break;
                                            }
                                    }
                                } else {
                                    b bVar = this.f27739l;
                                    int length = bVar.f27758b.length();
                                    if (length > 0) {
                                        bVar.f27758b.delete(length - 1, length);
                                    }
                                }
                            }
                            i6 = i7;
                            i5 = i9;
                            z4 = true;
                            c4 = 6;
                            i4 = i8;
                            int i1022 = i6;
                            z5 = z4;
                            i7 = i1022;
                            i8 = i4;
                            i9 = i5;
                        } else {
                            if (b6 > 127) {
                                if (b6 <= 159) {
                                    switch (b6) {
                                        case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            i4 = i8;
                                            z4 = true;
                                            int i12 = b6 - 128;
                                            if (this.f27743p != i12) {
                                                this.f27743p = i12;
                                                this.f27739l = this.f27738k[i12];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            i4 = i8;
                                            z4 = true;
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (this.f27735h.f()) {
                                                    b bVar2 = this.f27738k[8 - i13];
                                                    bVar2.f27757a.clear();
                                                    bVar2.f27758b.clear();
                                                    bVar2.f27772p = -1;
                                                    bVar2.f27773q = -1;
                                                    bVar2.f27774r = -1;
                                                    bVar2.f27776t = -1;
                                                    bVar2.f27778v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            i4 = i8;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (this.f27735h.f()) {
                                                    this.f27738k[8 - i14].f27760d = true;
                                                }
                                            }
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            c4 = 6;
                                            break;
                                        case 138:
                                            i4 = i8;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (this.f27735h.f()) {
                                                    this.f27738k[8 - i15].f27760d = false;
                                                }
                                            }
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            c4 = 6;
                                            break;
                                        case 139:
                                            i4 = i8;
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (this.f27735h.f()) {
                                                    this.f27738k[8 - i16].f27760d = !r2.f27760d;
                                                }
                                            }
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            c4 = 6;
                                            break;
                                        case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
                                            i4 = i8;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (this.f27735h.f()) {
                                                    this.f27738k[8 - i17].b();
                                                }
                                            }
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            c4 = 6;
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 141 */:
                                            i4 = i8;
                                            this.f27735h.d(8);
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            c4 = 6;
                                            break;
                                        case 142:
                                            i4 = i8;
                                            i6 = i7;
                                            z4 = true;
                                            i5 = 7;
                                            c4 = 6;
                                            break;
                                        case 143:
                                            i4 = i8;
                                            for (int i18 = 0; i18 < 8; i18++) {
                                                this.f27738k[i18].b();
                                            }
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            c4 = 6;
                                            break;
                                        case 144:
                                            if (!this.f27739l.f27759c) {
                                                this.f27735h.d(16);
                                                z4 = true;
                                                i6 = 2;
                                                i5 = 7;
                                                i4 = 3;
                                                c4 = 6;
                                                break;
                                            } else {
                                                this.f27735h.b(4);
                                                this.f27735h.b(2);
                                                this.f27735h.b(2);
                                                boolean f4 = this.f27735h.f();
                                                boolean f5 = this.f27735h.f();
                                                i4 = 3;
                                                this.f27735h.b(3);
                                                this.f27735h.b(3);
                                                this.f27739l.a(f4, f5);
                                                z4 = true;
                                                i6 = 2;
                                                i5 = 7;
                                                c4 = 6;
                                            }
                                        case 145:
                                            if (this.f27739l.f27759c) {
                                                int a4 = b.a(this.f27735h.b(2), this.f27735h.b(2), this.f27735h.b(2), this.f27735h.b(2));
                                                int a5 = b.a(this.f27735h.b(2), this.f27735h.b(2), this.f27735h.b(2), this.f27735h.b(2));
                                                this.f27735h.d(2);
                                                b.a(this.f27735h.b(2), this.f27735h.b(2), this.f27735h.b(2), 0);
                                                this.f27739l.a(a4, a5);
                                            } else {
                                                this.f27735h.d(24);
                                            }
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            i4 = 3;
                                            c4 = 6;
                                            break;
                                        case 146:
                                            if (this.f27739l.f27759c) {
                                                this.f27735h.d(4);
                                                int b8 = this.f27735h.b(4);
                                                this.f27735h.d(2);
                                                this.f27735h.b(6);
                                                b bVar3 = this.f27739l;
                                                if (bVar3.f27778v != b8) {
                                                    bVar3.a('\n');
                                                }
                                                bVar3.f27778v = b8;
                                            } else {
                                                this.f27735h.d(16);
                                            }
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            i4 = 3;
                                            c4 = 6;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED /* 150 */:
                                        default:
                                            fr0.a("Invalid C1 command: ", b6, "Cea708Decoder");
                                            break;
                                        case 151:
                                            if (this.f27739l.f27759c) {
                                                int a6 = b.a(this.f27735h.b(2), this.f27735h.b(2), this.f27735h.b(2), this.f27735h.b(2));
                                                this.f27735h.b(2);
                                                b.a(this.f27735h.b(2), this.f27735h.b(2), this.f27735h.b(2), 0);
                                                this.f27735h.f();
                                                this.f27735h.f();
                                                this.f27735h.b(2);
                                                this.f27735h.b(2);
                                                int b9 = this.f27735h.b(2);
                                                this.f27735h.d(8);
                                                b bVar4 = this.f27739l;
                                                bVar4.f27771o = a6;
                                                bVar4.f27768l = b9;
                                            } else {
                                                this.f27735h.d(32);
                                            }
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            i4 = 3;
                                            c4 = 6;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i19 = b6 - 152;
                                            b bVar5 = this.f27738k[i19];
                                            this.f27735h.d(i7);
                                            boolean f6 = this.f27735h.f();
                                            boolean f7 = this.f27735h.f();
                                            this.f27735h.f();
                                            int b10 = this.f27735h.b(i8);
                                            boolean f8 = this.f27735h.f();
                                            int b11 = this.f27735h.b(i9);
                                            int b12 = this.f27735h.b(8);
                                            int b13 = this.f27735h.b(4);
                                            int b14 = this.f27735h.b(4);
                                            this.f27735h.d(i7);
                                            this.f27735h.b(6);
                                            this.f27735h.d(i7);
                                            int b15 = this.f27735h.b(3);
                                            int b16 = this.f27735h.b(3);
                                            bVar5.f27759c = true;
                                            bVar5.f27760d = f6;
                                            bVar5.f27767k = f7;
                                            bVar5.f27761e = b10;
                                            bVar5.f27762f = f8;
                                            bVar5.f27763g = b11;
                                            bVar5.f27764h = b12;
                                            bVar5.f27765i = b13;
                                            int i20 = b14 + 1;
                                            if (bVar5.f27766j != i20) {
                                                bVar5.f27766j = i20;
                                                while (true) {
                                                    if ((f7 && bVar5.f27757a.size() >= bVar5.f27766j) || bVar5.f27757a.size() >= 15) {
                                                        bVar5.f27757a.remove(0);
                                                    }
                                                }
                                            }
                                            if (b15 != 0 && bVar5.f27769m != b15) {
                                                bVar5.f27769m = b15;
                                                int i21 = b15 - 1;
                                                int i22 = b.f27749C[i21];
                                                boolean z7 = b.f27748B[i21];
                                                int i23 = b.f27756z[i21];
                                                int i24 = b.f27747A[i21];
                                                int i25 = b.f27755y[i21];
                                                bVar5.f27771o = i22;
                                                bVar5.f27768l = i25;
                                            }
                                            if (b16 != 0 && bVar5.f27770n != b16) {
                                                bVar5.f27770n = b16;
                                                int i26 = b16 - 1;
                                                int i27 = b.f27751E[i26];
                                                int i28 = b.f27750D[i26];
                                                bVar5.a(false, false);
                                                bVar5.a(b.f27753w, b.f27752F[i26]);
                                            }
                                            if (this.f27743p != i19) {
                                                this.f27743p = i19;
                                                this.f27739l = this.f27738k[i19];
                                            }
                                            z4 = true;
                                            i6 = 2;
                                            i5 = 7;
                                            i4 = 3;
                                            c4 = 6;
                                            break;
                                    }
                                    z6 = z4;
                                    i8 = i4;
                                    i7 = i6;
                                    i9 = i5;
                                    z5 = z6;
                                } else {
                                    i4 = i8;
                                    z4 = true;
                                    if (b6 <= 255) {
                                        this.f27739l.a((char) (b6 & KotlinVersion.MAX_COMPONENT_VALUE));
                                    } else {
                                        fr0.a("Invalid base command: ", b6, "Cea708Decoder");
                                        i6 = 2;
                                        i5 = 7;
                                        c4 = 6;
                                        int i10222 = i6;
                                        z5 = z4;
                                        i7 = i10222;
                                        i8 = i4;
                                        i9 = i5;
                                    }
                                }
                                i6 = 2;
                                i5 = 7;
                                c4 = 6;
                                z6 = z4;
                                i8 = i4;
                                i7 = i6;
                                i9 = i5;
                                z5 = z6;
                            } else if (b6 == 127) {
                                this.f27739l.a((char) 9835);
                            } else {
                                this.f27739l.a((char) (b6 & KotlinVersion.MAX_COMPONENT_VALUE));
                            }
                            i6 = i7;
                            i5 = i9;
                            z4 = true;
                            c4 = 6;
                            i4 = i8;
                            z6 = z4;
                            i8 = i4;
                            i7 = i6;
                            i9 = i5;
                            z5 = z6;
                        }
                    }
                    z5 = z5;
                    i7 = i7;
                }
            }
        }
        if (z6) {
            this.f27740m = j();
        }
        this.f27742o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<uu> j() {
        a aVar;
        Layout.Alignment alignment;
        float f4;
        float f5;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 8; i7++) {
            b bVar = this.f27738k[i7];
            if (bVar.f27759c && (!bVar.f27757a.isEmpty() || bVar.f27758b.length() != 0)) {
                b bVar2 = this.f27738k[i7];
                if (bVar2.f27760d) {
                    if (!bVar2.f27759c || (bVar2.f27757a.isEmpty() && bVar2.f27758b.length() == 0)) {
                        aVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i8 = 0; i8 < bVar2.f27757a.size(); i8++) {
                            spannableStringBuilder.append((CharSequence) bVar2.f27757a.get(i8));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) bVar2.a());
                        int i9 = bVar2.f27768l;
                        if (i9 != 0) {
                            if (i9 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i9 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i9 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + bVar2.f27768l);
                            }
                            if (bVar2.f27762f) {
                                f4 = bVar2.f27764h / 209.0f;
                                f5 = bVar2.f27763g / 74.0f;
                            } else {
                                f4 = bVar2.f27764h / 99.0f;
                                f5 = bVar2.f27763g / 99.0f;
                            }
                            float f6 = (f4 * 0.9f) + 0.05f;
                            float f7 = (f5 * 0.9f) + 0.05f;
                            int i10 = bVar2.f27765i;
                            i4 = i10 / 3;
                            if (i4 != 0) {
                                i5 = i10;
                                i6 = 0;
                            } else if (i4 == 1) {
                                i5 = i10;
                                i6 = 1;
                            } else {
                                i5 = i10;
                                i6 = 2;
                            }
                            int i11 = i5 % 3;
                            aVar = new a(spannableStringBuilder, alignment, f7, i6, f6, i11 != 0 ? 0 : i11 == 1 ? 1 : 2, bVar2.f27771o == b.f27754x, bVar2.f27771o, bVar2.f27761e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        if (bVar2.f27762f) {
                        }
                        float f62 = (f4 * 0.9f) + 0.05f;
                        float f72 = (f5 * 0.9f) + 0.05f;
                        int i102 = bVar2.f27765i;
                        i4 = i102 / 3;
                        if (i4 != 0) {
                        }
                        int i112 = i5 % 3;
                        aVar = new a(spannableStringBuilder, alignment, f72, i6, f62, i112 != 0 ? 0 : i112 == 1 ? 1 : 2, bVar2.f27771o == b.f27754x, bVar2.f27771o, bVar2.f27761e);
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, a.f27744c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(((a) arrayList.get(i12)).f27745a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // com.yandex.mobile.ads.impl.kn
    protected final void b(g32 g32Var) {
        ByteBuffer byteBuffer = g32Var.f26356d;
        byteBuffer.getClass();
        this.f27734g.a(byteBuffer.limit(), byteBuffer.array());
        while (this.f27734g.a() >= 3) {
            int t4 = this.f27734g.t();
            int i4 = t4 & 3;
            boolean z4 = (t4 & 4) == 4;
            byte t5 = (byte) this.f27734g.t();
            byte t6 = (byte) this.f27734g.t();
            if (i4 == 2 || i4 == 3) {
                if (z4) {
                    if (i4 == 3) {
                        i();
                        int i5 = (t5 & 192) >> 6;
                        int i6 = this.f27736i;
                        if (i6 != -1 && i5 != (i6 + 1) % 4) {
                            for (int i7 = 0; i7 < 8; i7++) {
                                this.f27738k[i7].b();
                            }
                            ms0.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f27736i + " current=" + i5);
                        }
                        this.f27736i = i5;
                        int i8 = t5 & 63;
                        if (i8 == 0) {
                            i8 = 64;
                        }
                        c cVar = new c(i5, i8);
                        this.f27742o = cVar;
                        byte[] bArr = cVar.f27781c;
                        cVar.f27782d = 1;
                        bArr[0] = t6;
                    } else {
                        if (i4 != 2) {
                            throw new IllegalArgumentException();
                        }
                        c cVar2 = this.f27742o;
                        if (cVar2 == null) {
                            ms0.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f27781c;
                            int i9 = cVar2.f27782d;
                            bArr2[i9] = t5;
                            cVar2.f27782d = i9 + 2;
                            bArr2[i9 + 1] = t6;
                        }
                    }
                    c cVar3 = this.f27742o;
                    if (cVar3.f27782d == (cVar3.f27780b * 2) - 1) {
                        i();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.kn
    protected final c32 c() {
        List<uu> list = this.f27740m;
        this.f27741n = list;
        list.getClass();
        return new ln(list);
    }

    @Override // com.yandex.mobile.ads.impl.kn, com.yandex.mobile.ads.impl.dy
    public final void flush() {
        super.flush();
        this.f27740m = null;
        this.f27741n = null;
        this.f27743p = 0;
        this.f27739l = this.f27738k[0];
        for (int i4 = 0; i4 < 8; i4++) {
            this.f27738k[i4].b();
        }
        this.f27742o = null;
    }

    @Override // com.yandex.mobile.ads.impl.kn
    protected final boolean h() {
        return this.f27740m != this.f27741n;
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final /* bridge */ /* synthetic */ void release() {
    }
}
