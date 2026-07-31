package d2;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c2.b;
import c2.h;
import c2.l;
import c2.m;
import d2.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o2.a0;
import o2.r;
import o2.z;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: g, reason: collision with root package name */
    private final a0 f15585g = new a0();

    /* renamed from: h, reason: collision with root package name */
    private final z f15586h = new z();

    /* renamed from: i, reason: collision with root package name */
    private int f15587i = -1;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15588j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15589k;

    /* renamed from: l, reason: collision with root package name */
    private final b[] f15590l;

    /* renamed from: m, reason: collision with root package name */
    private b f15591m;

    /* renamed from: n, reason: collision with root package name */
    private List<c2.b> f15592n;

    /* renamed from: o, reason: collision with root package name */
    private List<c2.b> f15593o;

    /* renamed from: p, reason: collision with root package name */
    private C0054c f15594p;

    /* renamed from: q, reason: collision with root package name */
    private int f15595q;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f15596c = new Comparator() { // from class: d2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c7;
                c7 = c.a.c((c.a) obj, (c.a) obj2);
                return c7;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final c2.b f15597a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15598b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f7, int i7, int i8, float f8, int i9, float f9, boolean z6, int i10, int i11) {
            b.C0043b n7 = new b.C0043b().o(charSequence).p(alignment).h(f7, i7).i(i8).k(f8).l(i9).n(f9);
            if (z6) {
                n7.s(i10);
            }
            this.f15597a = n7.a();
            this.f15598b = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f15598b, aVar.f15598b);
        }
    }

    private static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;

        /* renamed from: w, reason: collision with root package name */
        public static final int f15599w = h(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f15600x;

        /* renamed from: y, reason: collision with root package name */
        public static final int f15601y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f15602z;

        /* renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f15603a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f15604b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f15605c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15606d;

        /* renamed from: e, reason: collision with root package name */
        private int f15607e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f15608f;

        /* renamed from: g, reason: collision with root package name */
        private int f15609g;

        /* renamed from: h, reason: collision with root package name */
        private int f15610h;

        /* renamed from: i, reason: collision with root package name */
        private int f15611i;

        /* renamed from: j, reason: collision with root package name */
        private int f15612j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f15613k;

        /* renamed from: l, reason: collision with root package name */
        private int f15614l;

        /* renamed from: m, reason: collision with root package name */
        private int f15615m;

        /* renamed from: n, reason: collision with root package name */
        private int f15616n;

        /* renamed from: o, reason: collision with root package name */
        private int f15617o;

        /* renamed from: p, reason: collision with root package name */
        private int f15618p;

        /* renamed from: q, reason: collision with root package name */
        private int f15619q;

        /* renamed from: r, reason: collision with root package name */
        private int f15620r;

        /* renamed from: s, reason: collision with root package name */
        private int f15621s;

        /* renamed from: t, reason: collision with root package name */
        private int f15622t;

        /* renamed from: u, reason: collision with root package name */
        private int f15623u;

        /* renamed from: v, reason: collision with root package name */
        private int f15624v;

        static {
            int h7 = h(0, 0, 0, 0);
            f15600x = h7;
            int h8 = h(0, 0, 0, 3);
            f15601y = h8;
            f15602z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{h7, h8, h7, h7, h8, h7, h7};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{h7, h7, h7, h7, h7, h8, h8};
        }

        public b() {
            l();
        }

        public static int g(int i7, int i8, int i9) {
            return h(i7, i8, i9, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int h(int i7, int i8, int i9, int i10) {
            int i11;
            o2.a.c(i7, 0, 4);
            o2.a.c(i8, 0, 4);
            o2.a.c(i9, 0, 4);
            o2.a.c(i10, 0, 4);
            if (i10 != 0 && i10 != 1) {
                if (i10 == 2) {
                    i11 = 127;
                } else if (i10 == 3) {
                    i11 = 0;
                }
                return Color.argb(i11, i7 <= 1 ? 255 : 0, i8 <= 1 ? 255 : 0, i9 > 1 ? 255 : 0);
            }
            i11 = 255;
            return Color.argb(i11, i7 <= 1 ? 255 : 0, i8 <= 1 ? 255 : 0, i9 > 1 ? 255 : 0);
        }

        public void a(char c7) {
            if (c7 != '\n') {
                this.f15604b.append(c7);
                return;
            }
            this.f15603a.add(d());
            this.f15604b.clear();
            if (this.f15618p != -1) {
                this.f15618p = 0;
            }
            if (this.f15619q != -1) {
                this.f15619q = 0;
            }
            if (this.f15620r != -1) {
                this.f15620r = 0;
            }
            if (this.f15622t != -1) {
                this.f15622t = 0;
            }
            while (true) {
                if ((!this.f15613k || this.f15603a.size() < this.f15612j) && this.f15603a.size() < 15) {
                    return;
                } else {
                    this.f15603a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f15604b.length();
            if (length > 0) {
                this.f15604b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a c() {
            Layout.Alignment alignment;
            float f7;
            float f8;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i7 = 0; i7 < this.f15603a.size(); i7++) {
                spannableStringBuilder.append((CharSequence) this.f15603a.get(i7));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i8 = this.f15614l;
            if (i8 != 0) {
                if (i8 == 1) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else if (i8 == 2) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (i8 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f15614l);
                }
                Layout.Alignment alignment2 = alignment;
                if (this.f15608f) {
                    f7 = this.f15610h / 209.0f;
                    f8 = this.f15609g / 74.0f;
                } else {
                    f7 = this.f15610h / 99.0f;
                    f8 = this.f15609g / 99.0f;
                }
                float f9 = (f7 * 0.9f) + 0.05f;
                float f10 = (f8 * 0.9f) + 0.05f;
                int i9 = this.f15611i;
                return new a(spannableStringBuilder, alignment2, f10, 0, i9 / 3 != 0 ? 0 : i9 / 3 == 1 ? 1 : 2, f9, i9 % 3 != 0 ? 0 : i9 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f15617o != f15600x, this.f15617o, this.f15607e);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            Layout.Alignment alignment22 = alignment;
            if (this.f15608f) {
            }
            float f92 = (f7 * 0.9f) + 0.05f;
            float f102 = (f8 * 0.9f) + 0.05f;
            int i92 = this.f15611i;
            return new a(spannableStringBuilder, alignment22, f102, 0, i92 / 3 != 0 ? 0 : i92 / 3 == 1 ? 1 : 2, f92, i92 % 3 != 0 ? 0 : i92 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f15617o != f15600x, this.f15617o, this.f15607e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15604b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f15618p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f15618p, length, 33);
                }
                if (this.f15619q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f15619q, length, 33);
                }
                if (this.f15620r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f15621s), this.f15620r, length, 33);
                }
                if (this.f15622t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f15623u), this.f15622t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f15603a.clear();
            this.f15604b.clear();
            this.f15618p = -1;
            this.f15619q = -1;
            this.f15620r = -1;
            this.f15622t = -1;
            this.f15624v = 0;
        }

        public void f(boolean z6, boolean z7, boolean z8, int i7, boolean z9, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f15605c = true;
            this.f15606d = z6;
            this.f15613k = z7;
            this.f15607e = i7;
            this.f15608f = z9;
            this.f15609g = i8;
            this.f15610h = i9;
            this.f15611i = i12;
            int i15 = i10 + 1;
            if (this.f15612j != i15) {
                this.f15612j = i15;
                while (true) {
                    if ((!z7 || this.f15603a.size() < this.f15612j) && this.f15603a.size() < 15) {
                        break;
                    } else {
                        this.f15603a.remove(0);
                    }
                }
            }
            if (i13 != 0 && this.f15615m != i13) {
                this.f15615m = i13;
                int i16 = i13 - 1;
                q(D[i16], f15601y, C[i16], 0, A[i16], B[i16], f15602z[i16]);
            }
            if (i14 == 0 || this.f15616n == i14) {
                return;
            }
            this.f15616n = i14;
            int i17 = i14 - 1;
            m(0, 1, 1, false, false, F[i17], E[i17]);
            n(f15599w, G[i17], f15600x);
        }

        public boolean i() {
            return this.f15605c;
        }

        public boolean j() {
            return !i() || (this.f15603a.isEmpty() && this.f15604b.length() == 0);
        }

        public boolean k() {
            return this.f15606d;
        }

        public void l() {
            e();
            this.f15605c = false;
            this.f15606d = false;
            this.f15607e = 4;
            this.f15608f = false;
            this.f15609g = 0;
            this.f15610h = 0;
            this.f15611i = 0;
            this.f15612j = 15;
            this.f15613k = true;
            this.f15614l = 0;
            this.f15615m = 0;
            this.f15616n = 0;
            int i7 = f15600x;
            this.f15617o = i7;
            this.f15621s = f15599w;
            this.f15623u = i7;
        }

        public void m(int i7, int i8, int i9, boolean z6, boolean z7, int i10, int i11) {
            if (this.f15618p != -1) {
                if (!z6) {
                    this.f15604b.setSpan(new StyleSpan(2), this.f15618p, this.f15604b.length(), 33);
                    this.f15618p = -1;
                }
            } else if (z6) {
                this.f15618p = this.f15604b.length();
            }
            if (this.f15619q == -1) {
                if (z7) {
                    this.f15619q = this.f15604b.length();
                }
            } else {
                if (z7) {
                    return;
                }
                this.f15604b.setSpan(new UnderlineSpan(), this.f15619q, this.f15604b.length(), 33);
                this.f15619q = -1;
            }
        }

        public void n(int i7, int i8, int i9) {
            if (this.f15620r != -1 && this.f15621s != i7) {
                this.f15604b.setSpan(new ForegroundColorSpan(this.f15621s), this.f15620r, this.f15604b.length(), 33);
            }
            if (i7 != f15599w) {
                this.f15620r = this.f15604b.length();
                this.f15621s = i7;
            }
            if (this.f15622t != -1 && this.f15623u != i8) {
                this.f15604b.setSpan(new BackgroundColorSpan(this.f15623u), this.f15622t, this.f15604b.length(), 33);
            }
            if (i8 != f15600x) {
                this.f15622t = this.f15604b.length();
                this.f15623u = i8;
            }
        }

        public void o(int i7, int i8) {
            if (this.f15624v != i7) {
                a('\n');
            }
            this.f15624v = i7;
        }

        public void p(boolean z6) {
            this.f15606d = z6;
        }

        public void q(int i7, int i8, boolean z6, int i9, int i10, int i11, int i12) {
            this.f15617o = i7;
            this.f15614l = i12;
        }
    }

    /* renamed from: d2.c$c, reason: collision with other inner class name */
    private static final class C0054c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15625a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15626b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f15627c;

        /* renamed from: d, reason: collision with root package name */
        int f15628d = 0;

        public C0054c(int i7, int i8) {
            this.f15625a = i7;
            this.f15626b = i8;
            this.f15627c = new byte[(i8 * 2) - 1];
        }
    }

    public c(int i7, List<byte[]> list) {
        this.f15589k = i7 == -1 ? 1 : i7;
        this.f15588j = list != null && o2.e.h(list);
        this.f15590l = new b[8];
        for (int i8 = 0; i8 < 8; i8++) {
            this.f15590l[i8] = new b();
        }
        this.f15591m = this.f15590l[0];
    }

    private void A() {
        this.f15591m.m(this.f15586h.h(4), this.f15586h.h(2), this.f15586h.h(2), this.f15586h.g(), this.f15586h.g(), this.f15586h.h(3), this.f15586h.h(3));
    }

    private void B() {
        int h7 = b.h(this.f15586h.h(2), this.f15586h.h(2), this.f15586h.h(2), this.f15586h.h(2));
        int h8 = b.h(this.f15586h.h(2), this.f15586h.h(2), this.f15586h.h(2), this.f15586h.h(2));
        this.f15586h.r(2);
        this.f15591m.n(h7, h8, b.g(this.f15586h.h(2), this.f15586h.h(2), this.f15586h.h(2)));
    }

    private void C() {
        this.f15586h.r(4);
        int h7 = this.f15586h.h(4);
        this.f15586h.r(2);
        this.f15591m.o(h7, this.f15586h.h(6));
    }

    private void D() {
        int h7 = b.h(this.f15586h.h(2), this.f15586h.h(2), this.f15586h.h(2), this.f15586h.h(2));
        int h8 = this.f15586h.h(2);
        int g7 = b.g(this.f15586h.h(2), this.f15586h.h(2), this.f15586h.h(2));
        if (this.f15586h.g()) {
            h8 |= 4;
        }
        boolean g8 = this.f15586h.g();
        int h9 = this.f15586h.h(2);
        int h10 = this.f15586h.h(2);
        int h11 = this.f15586h.h(2);
        this.f15586h.r(8);
        this.f15591m.q(h7, g7, g8, h8, h9, h10, h11);
    }

    private void E() {
        StringBuilder sb;
        String str;
        C0054c c0054c = this.f15594p;
        if (c0054c.f15628d != (c0054c.f15626b * 2) - 1) {
            r.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f15594p.f15626b * 2) - 1) + ", but current index is " + this.f15594p.f15628d + " (sequence number " + this.f15594p.f15625a + ");");
        }
        boolean z6 = false;
        z zVar = this.f15586h;
        C0054c c0054c2 = this.f15594p;
        zVar.o(c0054c2.f15627c, c0054c2.f15628d);
        while (true) {
            if (this.f15586h.b() <= 0) {
                break;
            }
            int h7 = this.f15586h.h(3);
            int h8 = this.f15586h.h(5);
            if (h7 == 7) {
                this.f15586h.r(2);
                h7 = this.f15586h.h(6);
                if (h7 < 7) {
                    r.i("Cea708Decoder", "Invalid extended service number: " + h7);
                }
            }
            if (h8 == 0) {
                if (h7 != 0) {
                    r.i("Cea708Decoder", "serviceNumber is non-zero (" + h7 + ") when blockSize is 0");
                }
            } else if (h7 != this.f15589k) {
                this.f15586h.s(h8);
            } else {
                int e7 = this.f15586h.e() + (h8 * 8);
                while (this.f15586h.e() < e7) {
                    int h9 = this.f15586h.h(8);
                    if (h9 == 16) {
                        h9 = this.f15586h.h(8);
                        if (h9 <= 31) {
                            t(h9);
                        } else {
                            if (h9 <= 127) {
                                y(h9);
                            } else if (h9 <= 159) {
                                u(h9);
                            } else if (h9 <= 255) {
                                z(h9);
                            } else {
                                sb = new StringBuilder();
                                str = "Invalid extended command: ";
                                sb.append(str);
                                sb.append(h9);
                                r.i("Cea708Decoder", sb.toString());
                            }
                            z6 = true;
                        }
                    } else if (h9 <= 31) {
                        r(h9);
                    } else {
                        if (h9 <= 127) {
                            w(h9);
                        } else if (h9 <= 159) {
                            s(h9);
                        } else if (h9 <= 255) {
                            x(h9);
                        } else {
                            sb = new StringBuilder();
                            str = "Invalid base command: ";
                            sb.append(str);
                            sb.append(h9);
                            r.i("Cea708Decoder", sb.toString());
                        }
                        z6 = true;
                    }
                }
            }
        }
        if (z6) {
            this.f15592n = q();
        }
    }

    private void F() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f15590l[i7].l();
        }
    }

    private void p() {
        if (this.f15594p == null) {
            return;
        }
        E();
        this.f15594p = null;
    }

    private List<c2.b> q() {
        a c7;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 8; i7++) {
            if (!this.f15590l[i7].j() && this.f15590l[i7].k() && (c7 = this.f15590l[i7].c()) != null) {
                arrayList.add(c7);
            }
        }
        Collections.sort(arrayList, a.f15596c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            arrayList2.add(((a) arrayList.get(i8)).f15597a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void r(int i7) {
        z zVar;
        if (i7 != 0) {
            if (i7 == 3) {
                this.f15592n = q();
            }
            int i8 = 8;
            if (i7 == 8) {
                this.f15591m.b();
                return;
            }
            switch (i7) {
                case 12:
                    F();
                    break;
                case 13:
                    this.f15591m.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i7 >= 17 && i7 <= 23) {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i7);
                        zVar = this.f15586h;
                    } else if (i7 < 24 || i7 > 31) {
                        r.i("Cea708Decoder", "Invalid C0 command: " + i7);
                        break;
                    } else {
                        r.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i7);
                        zVar = this.f15586h;
                        i8 = 16;
                    }
                    zVar.r(i8);
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void s(int i7) {
        b bVar;
        z zVar;
        int i8 = 16;
        int i9 = 1;
        switch (i7) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i10 = i7 - 128;
                if (this.f15595q != i10) {
                    this.f15595q = i10;
                    bVar = this.f15590l[i10];
                    this.f15591m = bVar;
                    break;
                }
                break;
            case 136:
                while (i9 <= 8) {
                    if (this.f15586h.g()) {
                        this.f15590l[8 - i9].e();
                    }
                    i9++;
                }
                break;
            case 137:
                for (int i11 = 1; i11 <= 8; i11++) {
                    if (this.f15586h.g()) {
                        this.f15590l[8 - i11].p(true);
                    }
                }
                break;
            case 138:
                while (i9 <= 8) {
                    if (this.f15586h.g()) {
                        this.f15590l[8 - i9].p(false);
                    }
                    i9++;
                }
                break;
            case 139:
                for (int i12 = 1; i12 <= 8; i12++) {
                    if (this.f15586h.g()) {
                        this.f15590l[8 - i12].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i9 <= 8) {
                    if (this.f15586h.g()) {
                        this.f15590l[8 - i9].l();
                    }
                    i9++;
                }
                break;
            case 141:
                this.f15586h.r(8);
                break;
            case 142:
                break;
            case 143:
                F();
                break;
            case 144:
                if (this.f15591m.i()) {
                    A();
                    break;
                }
                zVar = this.f15586h;
                zVar.r(i8);
                break;
            case 145:
                if (this.f15591m.i()) {
                    B();
                    break;
                } else {
                    zVar = this.f15586h;
                    i8 = 24;
                    zVar.r(i8);
                    break;
                }
            case 146:
                if (this.f15591m.i()) {
                    C();
                    break;
                }
                zVar = this.f15586h;
                zVar.r(i8);
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                r.i("Cea708Decoder", "Invalid C1 command: " + i7);
                break;
            case 151:
                if (this.f15591m.i()) {
                    D();
                    break;
                } else {
                    zVar = this.f15586h;
                    i8 = 32;
                    zVar.r(i8);
                    break;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i13 = i7 - 152;
                v(i13);
                if (this.f15595q != i13) {
                    this.f15595q = i13;
                    bVar = this.f15590l[i13];
                    this.f15591m = bVar;
                    break;
                }
                break;
        }
    }

    private void t(int i7) {
        z zVar;
        int i8;
        if (i7 <= 7) {
            return;
        }
        if (i7 <= 15) {
            zVar = this.f15586h;
            i8 = 8;
        } else if (i7 <= 23) {
            zVar = this.f15586h;
            i8 = 16;
        } else {
            if (i7 > 31) {
                return;
            }
            zVar = this.f15586h;
            i8 = 24;
        }
        zVar.r(i8);
    }

    private void u(int i7) {
        z zVar;
        int i8;
        if (i7 <= 135) {
            zVar = this.f15586h;
            i8 = 32;
        } else {
            if (i7 > 143) {
                if (i7 <= 159) {
                    this.f15586h.r(2);
                    this.f15586h.r(this.f15586h.h(6) * 8);
                    return;
                }
                return;
            }
            zVar = this.f15586h;
            i8 = 40;
        }
        zVar.r(i8);
    }

    private void v(int i7) {
        b bVar = this.f15590l[i7];
        this.f15586h.r(2);
        boolean g7 = this.f15586h.g();
        boolean g8 = this.f15586h.g();
        boolean g9 = this.f15586h.g();
        int h7 = this.f15586h.h(3);
        boolean g10 = this.f15586h.g();
        int h8 = this.f15586h.h(7);
        int h9 = this.f15586h.h(8);
        int h10 = this.f15586h.h(4);
        int h11 = this.f15586h.h(4);
        this.f15586h.r(2);
        int h12 = this.f15586h.h(6);
        this.f15586h.r(2);
        bVar.f(g7, g8, g9, h7, g10, h8, h9, h11, h12, h10, this.f15586h.h(3), this.f15586h.h(3));
    }

    private void w(int i7) {
        if (i7 == 127) {
            this.f15591m.a((char) 9835);
        } else {
            this.f15591m.a((char) (i7 & 255));
        }
    }

    private void x(int i7) {
        this.f15591m.a((char) (i7 & 255));
    }

    private void y(int i7) {
        b bVar;
        char c7 = ' ';
        if (i7 == 32) {
            bVar = this.f15591m;
        } else if (i7 == 33) {
            bVar = this.f15591m;
            c7 = 160;
        } else if (i7 == 37) {
            bVar = this.f15591m;
            c7 = 8230;
        } else if (i7 == 42) {
            bVar = this.f15591m;
            c7 = 352;
        } else if (i7 == 44) {
            bVar = this.f15591m;
            c7 = 338;
        } else if (i7 == 63) {
            bVar = this.f15591m;
            c7 = 376;
        } else if (i7 == 57) {
            bVar = this.f15591m;
            c7 = 8482;
        } else if (i7 == 58) {
            bVar = this.f15591m;
            c7 = 353;
        } else if (i7 == 60) {
            bVar = this.f15591m;
            c7 = 339;
        } else if (i7 != 61) {
            switch (i7) {
                case 48:
                    bVar = this.f15591m;
                    c7 = 9608;
                    break;
                case 49:
                    bVar = this.f15591m;
                    c7 = 8216;
                    break;
                case 50:
                    bVar = this.f15591m;
                    c7 = 8217;
                    break;
                case 51:
                    bVar = this.f15591m;
                    c7 = 8220;
                    break;
                case 52:
                    bVar = this.f15591m;
                    c7 = 8221;
                    break;
                case 53:
                    bVar = this.f15591m;
                    c7 = 8226;
                    break;
                default:
                    switch (i7) {
                        case 118:
                            bVar = this.f15591m;
                            c7 = 8539;
                            break;
                        case 119:
                            bVar = this.f15591m;
                            c7 = 8540;
                            break;
                        case 120:
                            bVar = this.f15591m;
                            c7 = 8541;
                            break;
                        case 121:
                            bVar = this.f15591m;
                            c7 = 8542;
                            break;
                        case 122:
                            bVar = this.f15591m;
                            c7 = 9474;
                            break;
                        case 123:
                            bVar = this.f15591m;
                            c7 = 9488;
                            break;
                        case 124:
                            bVar = this.f15591m;
                            c7 = 9492;
                            break;
                        case 125:
                            bVar = this.f15591m;
                            c7 = 9472;
                            break;
                        case 126:
                            bVar = this.f15591m;
                            c7 = 9496;
                            break;
                        case 127:
                            bVar = this.f15591m;
                            c7 = 9484;
                            break;
                        default:
                            r.i("Cea708Decoder", "Invalid G2 character: " + i7);
                            return;
                    }
            }
        } else {
            bVar = this.f15591m;
            c7 = 8480;
        }
        bVar.a(c7);
    }

    private void z(int i7) {
        b bVar;
        char c7;
        if (i7 == 160) {
            bVar = this.f15591m;
            c7 = 13252;
        } else {
            r.i("Cea708Decoder", "Invalid G3 character: " + i7);
            bVar = this.f15591m;
            c7 = '_';
        }
        bVar.a(c7);
    }

    @Override // d2.e, u0.d
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // d2.e, c2.i
    public /* bridge */ /* synthetic */ void b(long j7) {
        super.b(j7);
    }

    @Override // d2.e
    protected h f() {
        List<c2.b> list = this.f15592n;
        this.f15593o = list;
        return new f((List) o2.a.e(list));
    }

    @Override // d2.e, u0.d
    public void flush() {
        super.flush();
        this.f15592n = null;
        this.f15593o = null;
        this.f15595q = 0;
        this.f15591m = this.f15590l[0];
        F();
        this.f15594p = null;
    }

    @Override // d2.e
    protected void g(l lVar) {
        ByteBuffer byteBuffer = (ByteBuffer) o2.a.e(lVar.f22411h);
        this.f15585g.M(byteBuffer.array(), byteBuffer.limit());
        while (this.f15585g.a() >= 3) {
            int C = this.f15585g.C() & 7;
            int i7 = C & 3;
            boolean z6 = (C & 4) == 4;
            byte C2 = (byte) this.f15585g.C();
            byte C3 = (byte) this.f15585g.C();
            if (i7 == 2 || i7 == 3) {
                if (z6) {
                    if (i7 == 3) {
                        p();
                        int i8 = (C2 & 192) >> 6;
                        int i9 = this.f15587i;
                        if (i9 != -1 && i8 != (i9 + 1) % 4) {
                            F();
                            r.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f15587i + " current=" + i8);
                        }
                        this.f15587i = i8;
                        int i10 = C2 & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        C0054c c0054c = new C0054c(i8, i10);
                        this.f15594p = c0054c;
                        byte[] bArr = c0054c.f15627c;
                        int i11 = c0054c.f15628d;
                        c0054c.f15628d = i11 + 1;
                        bArr[i11] = C3;
                    } else {
                        o2.a.a(i7 == 2);
                        C0054c c0054c2 = this.f15594p;
                        if (c0054c2 == null) {
                            r.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0054c2.f15627c;
                            int i12 = c0054c2.f15628d;
                            int i13 = i12 + 1;
                            c0054c2.f15628d = i13;
                            bArr2[i12] = C2;
                            c0054c2.f15628d = i13 + 1;
                            bArr2[i13] = C3;
                        }
                    }
                    C0054c c0054c3 = this.f15594p;
                    if (c0054c3.f15628d == (c0054c3.f15626b * 2) - 1) {
                        p();
                    }
                }
            }
        }
    }

    @Override // d2.e
    /* renamed from: h */
    public /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // d2.e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @Override // d2.e
    protected boolean l() {
        return this.f15592n != this.f15593o;
    }

    @Override // d2.e
    /* renamed from: m */
    public /* bridge */ /* synthetic */ void c(l lVar) {
        super.c(lVar);
    }
}
