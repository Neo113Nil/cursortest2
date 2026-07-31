package d2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c2.b;
import c2.h;
import c2.l;
import c2.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o2.a0;
import o2.m0;
import o2.r;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: h, reason: collision with root package name */
    private final int f15556h;

    /* renamed from: i, reason: collision with root package name */
    private final int f15557i;

    /* renamed from: j, reason: collision with root package name */
    private final int f15558j;

    /* renamed from: k, reason: collision with root package name */
    private final long f15559k;

    /* renamed from: n, reason: collision with root package name */
    private List<c2.b> f15562n;

    /* renamed from: o, reason: collision with root package name */
    private List<c2.b> f15563o;

    /* renamed from: p, reason: collision with root package name */
    private int f15564p;

    /* renamed from: q, reason: collision with root package name */
    private int f15565q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f15566r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15567s;

    /* renamed from: t, reason: collision with root package name */
    private byte f15568t;

    /* renamed from: u, reason: collision with root package name */
    private byte f15569u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15571w;

    /* renamed from: x, reason: collision with root package name */
    private long f15572x;

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f15553y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f15554z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    private final a0 f15555g = new a0();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<C0052a> f15560l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    private C0052a f15561m = new C0052a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    private int f15570v = 0;

    /* renamed from: d2.a$a, reason: collision with other inner class name */
    private static final class C0052a {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0053a> f15573a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f15574b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f15575c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f15576d;

        /* renamed from: e, reason: collision with root package name */
        private int f15577e;

        /* renamed from: f, reason: collision with root package name */
        private int f15578f;

        /* renamed from: g, reason: collision with root package name */
        private int f15579g;

        /* renamed from: h, reason: collision with root package name */
        private int f15580h;

        /* renamed from: d2.a$a$a, reason: collision with other inner class name */
        private static class C0053a {

            /* renamed from: a, reason: collision with root package name */
            public final int f15581a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f15582b;

            /* renamed from: c, reason: collision with root package name */
            public int f15583c;

            public C0053a(int i7, boolean z6, int i8) {
                this.f15581a = i7;
                this.f15582b = z6;
                this.f15583c = i8;
            }
        }

        public C0052a(int i7, int i8) {
            j(i7);
            this.f15580h = i8;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15575c);
            int length = spannableStringBuilder.length();
            int i7 = 0;
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            boolean z6 = false;
            while (i7 < this.f15573a.size()) {
                C0053a c0053a = this.f15573a.get(i7);
                boolean z7 = c0053a.f15582b;
                int i13 = c0053a.f15581a;
                if (i13 != 8) {
                    boolean z8 = i13 == 7;
                    if (i13 != 7) {
                        i12 = a.A[i13];
                    }
                    z6 = z8;
                }
                int i14 = c0053a.f15583c;
                i7++;
                if (i14 != (i7 < this.f15573a.size() ? this.f15573a.get(i7).f15583c : length)) {
                    if (i8 != -1 && !z7) {
                        q(spannableStringBuilder, i8, i14);
                        i8 = -1;
                    } else if (i8 == -1 && z7) {
                        i8 = i14;
                    }
                    if (i9 != -1 && !z6) {
                        o(spannableStringBuilder, i9, i14);
                        i9 = -1;
                    } else if (i9 == -1 && z6) {
                        i9 = i14;
                    }
                    if (i12 != i11) {
                        n(spannableStringBuilder, i10, i14, i11);
                        i11 = i12;
                        i10 = i14;
                    }
                }
            }
            if (i8 != -1 && i8 != length) {
                q(spannableStringBuilder, i8, length);
            }
            if (i9 != -1 && i9 != length) {
                o(spannableStringBuilder, i9, length);
            }
            if (i10 != length) {
                n(spannableStringBuilder, i10, length, i11);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9) {
            if (i9 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i7, i8, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i7, int i8) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i7, i8, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i7, int i8) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i8, 33);
        }

        public void e(char c7) {
            if (this.f15575c.length() < 32) {
                this.f15575c.append(c7);
            }
        }

        public void f() {
            int length = this.f15575c.length();
            if (length > 0) {
                this.f15575c.delete(length - 1, length);
                for (int size = this.f15573a.size() - 1; size >= 0; size--) {
                    C0053a c0053a = this.f15573a.get(size);
                    int i7 = c0053a.f15583c;
                    if (i7 != length) {
                        return;
                    }
                    c0053a.f15583c = i7 - 1;
                }
            }
        }

        public c2.b g(int i7) {
            float f7;
            int i8 = this.f15577e + this.f15578f;
            int i9 = 32 - i8;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f15574b.size(); i10++) {
                spannableStringBuilder.append(m0.X0(this.f15574b.get(i10), i9));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(m0.X0(h(), i9));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i9 - spannableStringBuilder.length();
            int i11 = i8 - length;
            if (i7 == Integer.MIN_VALUE) {
                i7 = (this.f15579g != 2 || (Math.abs(i11) >= 3 && length >= 0)) ? (this.f15579g != 2 || i11 <= 0) ? 0 : 2 : 1;
            }
            if (i7 != 1) {
                if (i7 == 2) {
                    i8 = 32 - length;
                }
                f7 = ((i8 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f7 = 0.5f;
            }
            int i12 = this.f15576d;
            if (i12 > 7) {
                i12 = (i12 - 15) - 2;
            } else if (this.f15579g == 1) {
                i12 -= this.f15580h - 1;
            }
            return new b.C0043b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i12, 1).k(f7).l(i7).a();
        }

        public boolean i() {
            return this.f15573a.isEmpty() && this.f15574b.isEmpty() && this.f15575c.length() == 0;
        }

        public void j(int i7) {
            this.f15579g = i7;
            this.f15573a.clear();
            this.f15574b.clear();
            this.f15575c.setLength(0);
            this.f15576d = 15;
            this.f15577e = 0;
            this.f15578f = 0;
        }

        public void k() {
            this.f15574b.add(h());
            this.f15575c.setLength(0);
            this.f15573a.clear();
            int min = Math.min(this.f15580h, this.f15576d);
            while (this.f15574b.size() >= min) {
                this.f15574b.remove(0);
            }
        }

        public void l(int i7) {
            this.f15579g = i7;
        }

        public void m(int i7) {
            this.f15580h = i7;
        }

        public void p(int i7, boolean z6) {
            this.f15573a.add(new C0053a(i7, z6, this.f15575c.length()));
        }
    }

    public a(String str, int i7, long j7) {
        this.f15559k = j7 > 0 ? j7 * 1000 : -9223372036854775807L;
        this.f15556h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 != 1) {
            if (i7 == 2) {
                this.f15558j = 1;
                this.f15557i = 0;
                N(0);
                M();
                this.f15571w = true;
                this.f15572x = -9223372036854775807L;
            }
            if (i7 == 3) {
                this.f15558j = 0;
            } else if (i7 != 4) {
                r.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            } else {
                this.f15558j = 1;
            }
            this.f15557i = 1;
            N(0);
            M();
            this.f15571w = true;
            this.f15572x = -9223372036854775807L;
        }
        this.f15558j = 0;
        this.f15557i = 0;
        N(0);
        M();
        this.f15571w = true;
        this.f15572x = -9223372036854775807L;
    }

    private static boolean A(byte b7) {
        return (b7 & 224) == 0;
    }

    private static boolean B(byte b7, byte b8) {
        return (b7 & 246) == 18 && (b8 & 224) == 32;
    }

    private static boolean C(byte b7, byte b8) {
        return (b7 & 247) == 17 && (b8 & 240) == 32;
    }

    private static boolean D(byte b7, byte b8) {
        return (b7 & 246) == 20 && (b8 & 240) == 32;
    }

    private static boolean E(byte b7, byte b8) {
        return (b7 & 240) == 16 && (b8 & 192) == 64;
    }

    private static boolean F(byte b7) {
        return (b7 & 240) == 16;
    }

    private boolean G(boolean z6, byte b7, byte b8) {
        if (!z6 || !F(b7)) {
            this.f15567s = false;
        } else {
            if (this.f15567s && this.f15568t == b7 && this.f15569u == b8) {
                this.f15567s = false;
                return true;
            }
            this.f15567s = true;
            this.f15568t = b7;
            this.f15569u = b8;
        }
        return false;
    }

    private static boolean H(byte b7) {
        return (b7 & 247) == 20;
    }

    private static boolean I(byte b7, byte b8) {
        return (b7 & 247) == 17 && (b8 & 240) == 48;
    }

    private static boolean J(byte b7, byte b8) {
        return (b7 & 247) == 23 && b8 >= 33 && b8 <= 35;
    }

    private static boolean K(byte b7) {
        return 1 <= b7 && b7 <= 15;
    }

    private void L(byte b7, byte b8) {
        if (!K(b7)) {
            if (H(b7)) {
                if (b8 != 32 && b8 != 47) {
                    switch (b8) {
                        default:
                            switch (b8) {
                            }
                            return;
                        case 37:
                        case 38:
                        case 39:
                            this.f15571w = true;
                            return;
                    }
                }
                this.f15571w = true;
                return;
            }
            return;
        }
        this.f15571w = false;
    }

    private void M() {
        this.f15561m.j(this.f15564p);
        this.f15560l.clear();
        this.f15560l.add(this.f15561m);
    }

    private void N(int i7) {
        int i8 = this.f15564p;
        if (i8 == i7) {
            return;
        }
        this.f15564p = i7;
        if (i7 == 3) {
            for (int i9 = 0; i9 < this.f15560l.size(); i9++) {
                this.f15560l.get(i9).l(i7);
            }
            return;
        }
        M();
        if (i8 == 3 || i7 == 1 || i7 == 0) {
            this.f15562n = Collections.emptyList();
        }
    }

    private void O(int i7) {
        this.f15565q = i7;
        this.f15561m.m(i7);
    }

    private boolean P() {
        return (this.f15559k == -9223372036854775807L || this.f15572x == -9223372036854775807L || k() - this.f15572x < this.f15559k) ? false : true;
    }

    private boolean Q(byte b7) {
        if (A(b7)) {
            this.f15570v = r(b7);
        }
        return this.f15570v == this.f15558j;
    }

    private static char q(byte b7) {
        return (char) B[(b7 & Byte.MAX_VALUE) - 32];
    }

    private static int r(byte b7) {
        return (b7 >> 3) & 1;
    }

    private List<c2.b> s() {
        int size = this.f15560l.size();
        ArrayList arrayList = new ArrayList(size);
        int i7 = 2;
        for (int i8 = 0; i8 < size; i8++) {
            c2.b g7 = this.f15560l.get(i8).g(Integer.MIN_VALUE);
            arrayList.add(g7);
            if (g7 != null) {
                i7 = Math.min(i7, g7.f1832n);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            c2.b bVar = (c2.b) arrayList.get(i9);
            if (bVar != null) {
                if (bVar.f1832n != i7) {
                    bVar = (c2.b) o2.a.e(this.f15560l.get(i9).g(i7));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char t(byte b7) {
        return (char) D[b7 & 31];
    }

    private static char u(byte b7) {
        return (char) E[b7 & 31];
    }

    private static char v(byte b7, byte b8) {
        return (b7 & 1) == 0 ? t(b8) : u(b8);
    }

    private static char w(byte b7) {
        return (char) C[b7 & 15];
    }

    private void x(byte b7) {
        this.f15561m.e(' ');
        this.f15561m.p((b7 >> 1) & 7, (b7 & 1) == 1);
    }

    private void y(byte b7) {
        if (b7 == 32) {
            N(2);
            return;
        }
        if (b7 == 41) {
            N(3);
            return;
        }
        switch (b7) {
            case 37:
                N(1);
                O(2);
                break;
            case 38:
                N(1);
                O(3);
                break;
            case 39:
                N(1);
                O(4);
                break;
            default:
                int i7 = this.f15564p;
                if (i7 != 0) {
                    if (b7 == 33) {
                        this.f15561m.f();
                        break;
                    } else {
                        switch (b7) {
                            case 44:
                                this.f15562n = Collections.emptyList();
                                int i8 = this.f15564p;
                                if (i8 != 1 && i8 != 3) {
                                }
                                break;
                            case 45:
                                if (i7 == 1 && !this.f15561m.i()) {
                                    this.f15561m.k();
                                    break;
                                }
                                break;
                            case 47:
                                this.f15562n = s();
                                break;
                        }
                        M();
                        break;
                    }
                }
                break;
        }
    }

    private void z(byte b7, byte b8) {
        int i7 = f15553y[b7 & 7];
        if ((b8 & 32) != 0) {
            i7++;
        }
        if (i7 != this.f15561m.f15576d) {
            if (this.f15564p != 1 && !this.f15561m.i()) {
                C0052a c0052a = new C0052a(this.f15564p, this.f15565q);
                this.f15561m = c0052a;
                this.f15560l.add(c0052a);
            }
            this.f15561m.f15576d = i7;
        }
        boolean z6 = (b8 & 16) == 16;
        boolean z7 = (b8 & 1) == 1;
        int i8 = (b8 >> 1) & 7;
        this.f15561m.p(z6 ? 8 : i8, z7);
        if (z6) {
            this.f15561m.f15577e = f15554z[i8];
        }
    }

    @Override // d2.e, u0.d
    public void a() {
    }

    @Override // d2.e, c2.i
    public /* bridge */ /* synthetic */ void b(long j7) {
        super.b(j7);
    }

    @Override // d2.e
    protected h f() {
        List<c2.b> list = this.f15562n;
        this.f15563o = list;
        return new f((List) o2.a.e(list));
    }

    @Override // d2.e, u0.d
    public void flush() {
        super.flush();
        this.f15562n = null;
        this.f15563o = null;
        N(0);
        O(4);
        M();
        this.f15566r = false;
        this.f15567s = false;
        this.f15568t = (byte) 0;
        this.f15569u = (byte) 0;
        this.f15570v = 0;
        this.f15571w = true;
        this.f15572x = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0018 A[SYNTHETIC] */
    @Override // d2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void g(l lVar) {
        boolean z6;
        C0052a c0052a;
        char q7;
        ByteBuffer byteBuffer = (ByteBuffer) o2.a.e(lVar.f22411h);
        this.f15555g.M(byteBuffer.array(), byteBuffer.limit());
        boolean z7 = false;
        while (true) {
            int a7 = this.f15555g.a();
            int i7 = this.f15556h;
            if (a7 < i7) {
                break;
            }
            byte C2 = i7 == 2 ? (byte) -4 : (byte) this.f15555g.C();
            int C3 = this.f15555g.C();
            int C4 = this.f15555g.C();
            if ((C2 & 2) == 0 && (C2 & 1) == this.f15557i) {
                byte b7 = (byte) (C3 & 127);
                byte b8 = (byte) (C4 & 127);
                if (b7 != 0 || b8 != 0) {
                    boolean z8 = this.f15566r;
                    if ((C2 & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[C3] && zArr[C4]) {
                            z6 = true;
                            this.f15566r = z6;
                            if (!G(z6, b7, b8)) {
                                if (this.f15566r) {
                                    L(b7, b8);
                                    if (this.f15571w && Q(b7)) {
                                        if (A(b7)) {
                                            if (I(b7, b8)) {
                                                c0052a = this.f15561m;
                                                q7 = w(b8);
                                            } else if (B(b7, b8)) {
                                                this.f15561m.f();
                                                c0052a = this.f15561m;
                                                q7 = v(b7, b8);
                                            } else {
                                                if (C(b7, b8)) {
                                                    x(b8);
                                                } else if (E(b7, b8)) {
                                                    z(b7, b8);
                                                } else if (J(b7, b8)) {
                                                    this.f15561m.f15578f = b8 - 32;
                                                } else if (D(b7, b8)) {
                                                    y(b8);
                                                }
                                                z7 = true;
                                            }
                                            c0052a.e(q7);
                                            z7 = true;
                                        } else {
                                            this.f15561m.e(q(b7));
                                            if ((b8 & 224) != 0) {
                                                c0052a = this.f15561m;
                                                q7 = q(b8);
                                                c0052a.e(q7);
                                            }
                                            z7 = true;
                                        }
                                    }
                                } else if (z8) {
                                    M();
                                    z7 = true;
                                }
                            }
                        }
                    }
                    z6 = false;
                    this.f15566r = z6;
                    if (!G(z6, b7, b8)) {
                    }
                }
            }
        }
        if (z7) {
            int i8 = this.f15564p;
            if (i8 == 1 || i8 == 3) {
                this.f15562n = s();
                this.f15572x = k();
            }
        }
    }

    @Override // d2.e
    /* renamed from: h */
    public /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // d2.e, u0.d
    /* renamed from: i */
    public m d() {
        m j7;
        m d7 = super.d();
        if (d7 != null) {
            return d7;
        }
        if (!P() || (j7 = j()) == null) {
            return null;
        }
        this.f15562n = Collections.emptyList();
        this.f15572x = -9223372036854775807L;
        j7.r(k(), f(), Long.MAX_VALUE);
        return j7;
    }

    @Override // d2.e
    protected boolean l() {
        return this.f15562n != this.f15563o;
    }

    @Override // d2.e
    /* renamed from: m */
    public /* bridge */ /* synthetic */ void c(l lVar) {
        super.c(lVar);
    }
}
