package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.uu;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C3139z9;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class in extends kn {

    /* renamed from: h, reason: collision with root package name */
    private final int f27265h;

    /* renamed from: i, reason: collision with root package name */
    private final int f27266i;

    /* renamed from: j, reason: collision with root package name */
    private final int f27267j;

    /* renamed from: n, reason: collision with root package name */
    private List<uu> f27271n;

    /* renamed from: o, reason: collision with root package name */
    private List<uu> f27272o;

    /* renamed from: p, reason: collision with root package name */
    private int f27273p;

    /* renamed from: q, reason: collision with root package name */
    private int f27274q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27275r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27276s;

    /* renamed from: t, reason: collision with root package name */
    private byte f27277t;

    /* renamed from: u, reason: collision with root package name */
    private byte f27278u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f27280w;

    /* renamed from: x, reason: collision with root package name */
    private long f27281x;

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f27262y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f27263z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f27256A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f27257B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 97, 98, 99, 100, InterfaceC1490j3.d.b.f16810b, 102, InterfaceC1490j3.d.b.f16812d, 104, 105, 106, 107, 108, InterfaceC1490j3.d.b.f16815g, InterfaceC1490j3.d.b.f16816h, InterfaceC1490j3.d.b.f16817i, InterfaceC1490j3.d.b.f16818j, 113, IronSourceConstants.FIRST_INSTANCE_RESULT, BuildConfig.API_LEVEL, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f27258C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f27259D = {193, InterfaceC1490j3.c.b.f16801b, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, InterfaceC1490j3.c.b.f16802c, InterfaceC1490j3.c.b.f16803d, 235, InterfaceC1490j3.c.b.f16806g, InterfaceC1490j3.c.b.f16807h, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f27260E = {195, 227, InterfaceC1490j3.c.b.f16805f, InterfaceC1490j3.c.b.f16804e, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F, reason: collision with root package name */
    private static final boolean[] f27261F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g, reason: collision with root package name */
    private final sf1 f27264g = new sf1();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<a> f27269l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    private a f27270m = new a(0, 4);

    /* renamed from: v, reason: collision with root package name */
    private int f27279v = 0;

    /* renamed from: k, reason: collision with root package name */
    private final long f27268k = 16000000;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f27282a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f27283b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f27284c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f27285d;

        /* renamed from: e, reason: collision with root package name */
        private int f27286e;

        /* renamed from: f, reason: collision with root package name */
        private int f27287f;

        /* renamed from: g, reason: collision with root package name */
        private int f27288g;

        /* renamed from: h, reason: collision with root package name */
        private int f27289h;

        /* renamed from: com.yandex.mobile.ads.impl.in$a$a, reason: collision with other inner class name */
        private static class C0192a {

            /* renamed from: a, reason: collision with root package name */
            public final int f27290a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f27291b;

            /* renamed from: c, reason: collision with root package name */
            public int f27292c;

            public C0192a(int i4, int i5, boolean z4) {
                this.f27290a = i4;
                this.f27291b = z4;
                this.f27292c = i5;
            }
        }

        public a(int i4, int i5) {
            b(i4);
            this.f27289h = i5;
        }

        public final void a() {
            int length = this.f27284c.length();
            if (length > 0) {
                this.f27284c.delete(length - 1, length);
                for (int size = this.f27282a.size() - 1; size >= 0; size--) {
                    C0192a c0192a = (C0192a) this.f27282a.get(size);
                    int i4 = c0192a.f27292c;
                    if (i4 != length) {
                        return;
                    }
                    c0192a.f27292c = i4 - 1;
                }
            }
        }

        public final void b(int i4) {
            this.f27288g = i4;
            this.f27282a.clear();
            this.f27283b.clear();
            this.f27284c.setLength(0);
            this.f27285d = 15;
            this.f27286e = 0;
            this.f27287f = 0;
        }

        public final uu a(int i4) {
            float f4;
            int i5 = this.f27286e + this.f27287f;
            int i6 = 32 - i5;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i7 = 0; i7 < this.f27283b.size(); i7++) {
                CharSequence charSequence = (CharSequence) this.f27283b.get(i7);
                int i8 = u82.f32873a;
                if (charSequence.length() > i6) {
                    charSequence = charSequence.subSequence(0, i6);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append('\n');
            }
            SpannableString b4 = b();
            int i9 = u82.f32873a;
            int length = b4.length();
            CharSequence charSequence2 = b4;
            if (length > i6) {
                charSequence2 = b4.subSequence(0, i6);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i6 - spannableStringBuilder.length();
            int i10 = i5 - length2;
            if (i4 == Integer.MIN_VALUE) {
                if (this.f27288g != 2 || (Math.abs(i10) >= 3 && length2 >= 0)) {
                    i4 = (this.f27288g != 2 || i10 <= 0) ? 0 : 2;
                } else {
                    i4 = 1;
                }
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    i5 = 32 - length2;
                }
                f4 = ((i5 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f4 = 0.5f;
            }
            int i11 = this.f27285d;
            if (i11 > 7) {
                i11 -= 17;
            } else if (this.f27288g == 1) {
                i11 -= this.f27289h - 1;
            }
            return new uu.a().a(spannableStringBuilder).b(Layout.Alignment.ALIGN_NORMAL).a(1, i11).b(f4).b(i4).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f27284c);
            int length = spannableStringBuilder.length();
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = 0;
            int i9 = 0;
            boolean z4 = false;
            while (i8 < this.f27282a.size()) {
                C0192a c0192a = (C0192a) this.f27282a.get(i8);
                boolean z5 = c0192a.f27291b;
                int i10 = c0192a.f27290a;
                if (i10 != 8) {
                    boolean z6 = i10 == 7;
                    if (i10 != 7) {
                        i7 = in.f27256A[i10];
                    }
                    z4 = z6;
                }
                int i11 = c0192a.f27292c;
                i8++;
                if (i11 != (i8 < this.f27282a.size() ? ((C0192a) this.f27282a.get(i8)).f27292c : length)) {
                    if (i4 != -1 && !z5) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i11, 33);
                        i4 = -1;
                    } else if (i4 == -1 && z5) {
                        i4 = i11;
                    }
                    if (i5 != -1 && !z4) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i5, i11, 33);
                        i5 = -1;
                    } else if (i5 == -1 && z4) {
                        i5 = i11;
                    }
                    if (i7 != i6) {
                        if (i6 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i9, i11, 33);
                        }
                        i9 = i11;
                        i6 = i7;
                    }
                }
            }
            if (i4 != -1 && i4 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (i5 != -1 && i5 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
            }
            if (i9 != length && i6 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i9, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }
    }

    public in(String str, int i4) {
        this.f27265h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i4 == 1) {
            this.f27267j = 0;
            this.f27266i = 0;
        } else if (i4 == 2) {
            this.f27267j = 1;
            this.f27266i = 0;
        } else if (i4 == 3) {
            this.f27267j = 0;
            this.f27266i = 1;
        } else if (i4 != 4) {
            ms0.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f27267j = 0;
            this.f27266i = 0;
        } else {
            this.f27267j = 1;
            this.f27266i = 1;
        }
        a(0);
        j();
        this.f27280w = true;
        this.f27281x = -9223372036854775807L;
    }

    private ArrayList i() {
        int size = this.f27269l.size();
        ArrayList arrayList = new ArrayList(size);
        int i4 = 2;
        for (int i5 = 0; i5 < size; i5++) {
            uu a4 = this.f27269l.get(i5).a(Integer.MIN_VALUE);
            arrayList.add(a4);
            if (a4 != null) {
                i4 = Math.min(i4, a4.f33256j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            uu uuVar = (uu) arrayList.get(i6);
            if (uuVar != null) {
                if (uuVar.f33256j != i4) {
                    uuVar = this.f27269l.get(i6).a(i4);
                    uuVar.getClass();
                }
                arrayList2.add(uuVar);
            }
        }
        return arrayList2;
    }

    private void j() {
        this.f27270m.b(this.f27273p);
        this.f27269l.clear();
        this.f27269l.add(this.f27270m);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.kn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void b(g32 g32Var) {
        boolean z4;
        ByteBuffer byteBuffer = g32Var.f26356d;
        byteBuffer.getClass();
        this.f27264g.a(byteBuffer.limit(), byteBuffer.array());
        boolean z5 = false;
        while (true) {
            int a4 = this.f27264g.a();
            int i4 = this.f27265h;
            if (a4 < i4) {
                if (z5) {
                    int i5 = this.f27273p;
                    if (i5 == 1 || i5 == 3) {
                        this.f27271n = i();
                        this.f27281x = g();
                        return;
                    }
                    return;
                }
                return;
            }
            byte t4 = i4 == 2 ? (byte) -4 : (byte) this.f27264g.t();
            int t5 = this.f27264g.t();
            int t6 = this.f27264g.t();
            if ((t4 & 2) == 0 && (t4 & 1) == this.f27266i) {
                byte b4 = (byte) (t5 & 127);
                byte b5 = (byte) (t6 & 127);
                if (b4 != 0 || b5 != 0) {
                    boolean z6 = this.f27275r;
                    if ((t4 & 4) == 4) {
                        boolean[] zArr = f27261F;
                        if (zArr[t5] && zArr[t6]) {
                            z4 = true;
                            this.f27275r = z4;
                            if (z4 || (b4 & 240) != 16) {
                                this.f27276s = false;
                            } else if (this.f27276s && this.f27277t == b4 && this.f27278u == b5) {
                                this.f27276s = false;
                            } else {
                                this.f27276s = true;
                                this.f27277t = b4;
                                this.f27278u = b5;
                            }
                            if (!z4) {
                                if (1 <= b4 && b4 <= 15) {
                                    this.f27280w = false;
                                } else if ((b4 & 247) == 20) {
                                    if (b5 != 32 && b5 != 47) {
                                        switch (b5) {
                                            default:
                                                switch (b5) {
                                                    case 42:
                                                    case 43:
                                                        this.f27280w = false;
                                                        break;
                                                }
                                            case 37:
                                            case C3139z9.f40334K /* 38 */:
                                            case 39:
                                                this.f27280w = true;
                                                break;
                                        }
                                    }
                                    this.f27280w = true;
                                }
                                if (this.f27280w) {
                                    int i6 = b4 & 224;
                                    if (i6 == 0) {
                                        this.f27279v = (b4 >> 3) & 1;
                                    }
                                    if (this.f27279v == this.f27267j) {
                                        if (i6 == 0) {
                                            int i7 = b4 & 247;
                                            if (i7 == 17 && (b5 & 240) == 48) {
                                                a aVar = this.f27270m;
                                                char c4 = (char) f27258C[b5 & 15];
                                                if (aVar.f27284c.length() < 32) {
                                                    aVar.f27284c.append(c4);
                                                }
                                            } else {
                                                int i8 = b4 & 246;
                                                if (i8 == 18 && (b5 & 224) == 32) {
                                                    this.f27270m.a();
                                                    a aVar2 = this.f27270m;
                                                    char c5 = (char) ((b4 & 1) == 0 ? f27259D[b5 & 31] : f27260E[b5 & 31]);
                                                    if (aVar2.f27284c.length() < 32) {
                                                        aVar2.f27284c.append(c5);
                                                    }
                                                } else if (i7 == 17 && (b5 & 240) == 32) {
                                                    a aVar3 = this.f27270m;
                                                    if (aVar3.f27284c.length() < 32) {
                                                        aVar3.f27284c.append(' ');
                                                    }
                                                    boolean z7 = (b5 & 1) == 1;
                                                    a aVar4 = this.f27270m;
                                                    aVar4.f27282a.add(new a.C0192a((b5 >> 1) & 7, aVar4.f27284c.length(), z7));
                                                } else if ((b4 & 240) == 16 && (b5 & 192) == 64) {
                                                    int i9 = f27262y[b4 & 7];
                                                    if ((b5 & 32) != 0) {
                                                        i9++;
                                                    }
                                                    a aVar5 = this.f27270m;
                                                    if (i9 != aVar5.f27285d) {
                                                        if (this.f27273p != 1 && (!aVar5.f27282a.isEmpty() || !aVar5.f27283b.isEmpty() || aVar5.f27284c.length() != 0)) {
                                                            a aVar6 = new a(this.f27273p, this.f27274q);
                                                            this.f27270m = aVar6;
                                                            this.f27269l.add(aVar6);
                                                        }
                                                        this.f27270m.f27285d = i9;
                                                    }
                                                    boolean z8 = (b5 & 16) == 16;
                                                    boolean z9 = (b5 & 1) == 1;
                                                    int i10 = (b5 >> 1) & 7;
                                                    a aVar7 = this.f27270m;
                                                    aVar7.f27282a.add(new a.C0192a(z8 ? 8 : i10, aVar7.f27284c.length(), z9));
                                                    if (z8) {
                                                        this.f27270m.f27286e = f27263z[i10];
                                                    }
                                                } else if (i7 == 23 && b5 >= 33 && b5 <= 35) {
                                                    this.f27270m.f27287f = b5 - 32;
                                                } else if (i8 == 20 && (b5 & 240) == 32) {
                                                    if (b5 == 32) {
                                                        a(2);
                                                    } else if (b5 != 41) {
                                                        switch (b5) {
                                                            case 37:
                                                                a(1);
                                                                this.f27274q = 2;
                                                                this.f27270m.f27289h = 2;
                                                                break;
                                                            case C3139z9.f40334K /* 38 */:
                                                                a(1);
                                                                this.f27274q = 3;
                                                                this.f27270m.f27289h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f27274q = 4;
                                                                this.f27270m.f27289h = 4;
                                                                break;
                                                            default:
                                                                int i11 = this.f27273p;
                                                                if (i11 != 0) {
                                                                    if (b5 == 33) {
                                                                        this.f27270m.a();
                                                                        break;
                                                                    } else {
                                                                        switch (b5) {
                                                                            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                                                                                this.f27271n = Collections.EMPTY_LIST;
                                                                                if (i11 == 1 || i11 == 3) {
                                                                                    j();
                                                                                    break;
                                                                                }
                                                                            case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                                                                                if (i11 == 1) {
                                                                                    a aVar8 = this.f27270m;
                                                                                    if (!aVar8.f27282a.isEmpty() || !aVar8.f27283b.isEmpty() || aVar8.f27284c.length() != 0) {
                                                                                        a aVar9 = this.f27270m;
                                                                                        aVar9.f27283b.add(aVar9.b());
                                                                                        aVar9.f27284c.setLength(0);
                                                                                        aVar9.f27282a.clear();
                                                                                        int min = Math.min(aVar9.f27289h, aVar9.f27285d);
                                                                                        while (aVar9.f27283b.size() >= min) {
                                                                                            aVar9.f27283b.remove(0);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f27271n = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            a aVar10 = this.f27270m;
                                            int[] iArr = f27257B;
                                            char c6 = (char) iArr[(b4 & Byte.MAX_VALUE) - 32];
                                            if (aVar10.f27284c.length() < 32) {
                                                aVar10.f27284c.append(c6);
                                            }
                                            if ((b5 & 224) != 0) {
                                                a aVar11 = this.f27270m;
                                                char c7 = (char) iArr[(b5 & Byte.MAX_VALUE) - 32];
                                                if (aVar11.f27284c.length() < 32) {
                                                    aVar11.f27284c.append(c7);
                                                }
                                            }
                                        }
                                        z5 = true;
                                    }
                                }
                            } else if (z6) {
                                j();
                                z5 = true;
                            }
                        }
                    }
                    z4 = false;
                    this.f27275r = z4;
                    if (z4) {
                    }
                    this.f27276s = false;
                    if (!z4) {
                    }
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.kn
    protected final c32 c() {
        List<uu> list = this.f27271n;
        this.f27272o = list;
        list.getClass();
        return new ln(list);
    }

    @Override // com.yandex.mobile.ads.impl.kn, com.yandex.mobile.ads.impl.dy
    /* renamed from: e */
    public final h32 a() {
        h32 f4;
        h32 a4 = super.a();
        if (a4 != null) {
            return a4;
        }
        if (this.f27268k == -9223372036854775807L || this.f27281x == -9223372036854775807L || g() - this.f27281x < this.f27268k || (f4 = f()) == null) {
            return null;
        }
        this.f27271n = Collections.EMPTY_LIST;
        this.f27281x = -9223372036854775807L;
        f4.a(g(), c(), Long.MAX_VALUE);
        return f4;
    }

    @Override // com.yandex.mobile.ads.impl.kn, com.yandex.mobile.ads.impl.dy
    public final void flush() {
        super.flush();
        this.f27271n = null;
        this.f27272o = null;
        a(0);
        this.f27274q = 4;
        this.f27270m.f27289h = 4;
        j();
        this.f27275r = false;
        this.f27276s = false;
        this.f27277t = (byte) 0;
        this.f27278u = (byte) 0;
        this.f27279v = 0;
        this.f27280w = true;
        this.f27281x = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.kn
    protected final boolean h() {
        return this.f27271n != this.f27272o;
    }

    @Override // com.yandex.mobile.ads.impl.dy
    public final void release() {
    }

    private void a(int i4) {
        int i5 = this.f27273p;
        if (i5 == i4) {
            return;
        }
        this.f27273p = i4;
        if (i4 == 3) {
            for (int i6 = 0; i6 < this.f27269l.size(); i6++) {
                this.f27269l.get(i6).f27288g = i4;
            }
            return;
        }
        j();
        if (i5 == 3 || i4 == 1 || i4 == 0) {
            this.f27271n = Collections.EMPTY_LIST;
        }
    }
}
