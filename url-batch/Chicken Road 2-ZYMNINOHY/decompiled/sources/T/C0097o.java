package T;

import E.AbstractC0005f;
import a.AbstractC0124a;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* renamed from: T.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097o {

    /* renamed from: A, reason: collision with root package name */
    public final float f2841A;

    /* renamed from: B, reason: collision with root package name */
    public final byte[] f2842B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2843C;

    /* renamed from: D, reason: collision with root package name */
    public final C0089g f2844D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2845E;

    /* renamed from: F, reason: collision with root package name */
    public final int f2846F;

    /* renamed from: G, reason: collision with root package name */
    public final int f2847G;

    /* renamed from: H, reason: collision with root package name */
    public final int f2848H;

    /* renamed from: I, reason: collision with root package name */
    public final int f2849I;

    /* renamed from: J, reason: collision with root package name */
    public final int f2850J;

    /* renamed from: K, reason: collision with root package name */
    public final int f2851K;
    public final int L;

    /* renamed from: M, reason: collision with root package name */
    public final int f2852M;

    /* renamed from: N, reason: collision with root package name */
    public final int f2853N;

    /* renamed from: O, reason: collision with root package name */
    public final int f2854O;

    /* renamed from: P, reason: collision with root package name */
    public int f2855P;

    /* renamed from: a, reason: collision with root package name */
    public final String f2856a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2857b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.I f2858c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2859d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2860e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2861f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2862g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2863h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2864i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2865j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2866k;

    /* renamed from: l, reason: collision with root package name */
    public final E f2867l;

    /* renamed from: m, reason: collision with root package name */
    public final String f2868m;
    public final String n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2869p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2870q;

    /* renamed from: r, reason: collision with root package name */
    public final C0094l f2871r;

    /* renamed from: s, reason: collision with root package name */
    public final long f2872s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2873t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2874u;
    public final int v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2875w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2876x;

    /* renamed from: y, reason: collision with root package name */
    public final float f2877y;
    public final int z;

    static {
        new C0096n().a();
        W.J.G(0);
        W.J.G(1);
        W.J.G(2);
        W.J.G(3);
        W.J.G(4);
        AbstractC0005f.s(5, 6, 7, 8, 9);
        AbstractC0005f.s(10, 11, 12, 13, 14);
        AbstractC0005f.s(15, 16, 17, 18, 19);
        AbstractC0005f.s(20, 21, 22, 23, 24);
        AbstractC0005f.s(25, 26, 27, 28, 29);
        AbstractC0005f.s(30, 31, 32, 33, 34);
        W.J.G(35);
        W.J.G(36);
    }

    public C0097o(C0096n c0096n) {
        boolean z;
        String str;
        this.f2856a = c0096n.f2819a;
        String N4 = W.J.N(c0096n.f2822d);
        this.f2859d = N4;
        if (c0096n.f2821c.isEmpty() && c0096n.f2820b != null) {
            this.f2858c = v2.I.o(new C0099q(N4, c0096n.f2820b));
            this.f2857b = c0096n.f2820b;
        } else if (c0096n.f2821c.isEmpty() || c0096n.f2820b != null) {
            if (!c0096n.f2821c.isEmpty() || c0096n.f2820b != null) {
                for (int i4 = 0; i4 < c0096n.f2821c.size(); i4++) {
                    if (!((C0099q) c0096n.f2821c.get(i4)).f2880b.equals(c0096n.f2820b)) {
                    }
                }
                z = false;
                AbstractC0124a.t(z);
                this.f2858c = c0096n.f2821c;
                this.f2857b = c0096n.f2820b;
            }
            z = true;
            AbstractC0124a.t(z);
            this.f2858c = c0096n.f2821c;
            this.f2857b = c0096n.f2820b;
        } else {
            v2.I i5 = c0096n.f2821c;
            this.f2858c = i5;
            int size = i5.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    str = ((C0099q) i5.get(0)).f2880b;
                    break;
                }
                Object obj = i5.get(i6);
                i6++;
                C0099q c0099q = (C0099q) obj;
                if (TextUtils.equals(c0099q.f2879a, N4)) {
                    str = c0099q.f2880b;
                    break;
                }
            }
            this.f2857b = str;
        }
        this.f2860e = c0096n.f2823e;
        AbstractC0124a.s("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c0096n.f2825g == 0 || (c0096n.f2824f & 32768) != 0);
        this.f2861f = c0096n.f2824f;
        this.f2862g = c0096n.f2825g;
        int i7 = c0096n.f2826h;
        this.f2863h = i7;
        int i8 = c0096n.f2827i;
        this.f2864i = i8;
        this.f2865j = i8 != -1 ? i8 : i7;
        this.f2866k = c0096n.f2828j;
        this.f2867l = c0096n.f2829k;
        this.f2868m = c0096n.f2830l;
        this.n = c0096n.f2831m;
        this.o = c0096n.n;
        this.f2869p = c0096n.o;
        List list = c0096n.f2832p;
        this.f2870q = list == null ? Collections.EMPTY_LIST : list;
        C0094l c0094l = c0096n.f2833q;
        this.f2871r = c0094l;
        this.f2872s = c0096n.f2834r;
        this.f2873t = c0096n.f2835s;
        this.f2874u = c0096n.f2836t;
        this.v = c0096n.f2837u;
        this.f2875w = c0096n.v;
        this.f2876x = c0096n.f2838w;
        this.f2877y = c0096n.f2839x;
        int i9 = c0096n.f2840y;
        this.z = i9 == -1 ? 0 : i9;
        float f4 = c0096n.z;
        this.f2841A = f4 == -1.0f ? 1.0f : f4;
        this.f2842B = c0096n.f2806A;
        this.f2843C = c0096n.f2807B;
        this.f2844D = c0096n.f2808C;
        this.f2845E = c0096n.f2809D;
        this.f2846F = c0096n.f2810E;
        this.f2847G = c0096n.f2811F;
        this.f2848H = c0096n.f2812G;
        int i10 = c0096n.f2813H;
        this.f2849I = i10 == -1 ? 0 : i10;
        int i11 = c0096n.f2814I;
        this.f2850J = i11 != -1 ? i11 : 0;
        this.f2851K = c0096n.f2815J;
        this.L = c0096n.f2816K;
        this.f2852M = c0096n.L;
        this.f2853N = c0096n.f2817M;
        int i12 = c0096n.f2818N;
        if (i12 != 0 || c0094l == null) {
            this.f2854O = i12;
        } else {
            this.f2854O = 1;
        }
    }

    public static String c(C0097o c0097o) {
        int i4;
        String str;
        String str2;
        String str3;
        int i5;
        if (c0097o == null) {
            return "null";
        }
        int i6 = c0097o.f2860e;
        v2.I i7 = c0097o.f2858c;
        String str4 = c0097o.f2859d;
        int i8 = c0097o.f2847G;
        int i9 = c0097o.f2846F;
        int i10 = c0097o.f2845E;
        float f4 = c0097o.f2877y;
        C0089g c0089g = c0097o.f2844D;
        float f5 = c0097o.f2841A;
        int i11 = c0097o.f2876x;
        int i12 = c0097o.f2875w;
        int i13 = c0097o.v;
        int i14 = c0097o.f2874u;
        C0094l c0094l = c0097o.f2871r;
        String str5 = c0097o.f2866k;
        int i15 = c0097o.f2865j;
        String str6 = c0097o.f2868m;
        int i16 = c0097o.f2861f;
        C3.v vVar = new C3.v(String.valueOf(','));
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c0097o.f2856a);
        sb.append(", mimeType=");
        sb.append(c0097o.n);
        if (str6 != null) {
            sb.append(", container=");
            sb.append(str6);
        }
        if (i15 != -1) {
            sb.append(", bitrate=");
            sb.append(i15);
        }
        if (str5 != null) {
            sb.append(", codecs=");
            sb.append(str5);
        }
        if (c0094l != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i17 = 0;
            while (i17 < c0094l.f2804d) {
                UUID uuid = c0094l.f2801a[i17].f2797b;
                if (uuid.equals(AbstractC0088f.f2780b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC0088f.f2781c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC0088f.f2783e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC0088f.f2782d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC0088f.f2779a)) {
                    linkedHashSet.add("universal");
                } else {
                    i5 = i17;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i17 = i5 + 1;
                }
                i5 = i17;
                i17 = i5 + 1;
            }
            sb.append(", drm=[");
            vVar.a(sb, linkedHashSet.iterator());
            sb.append(']');
        }
        if (i14 != -1 && i13 != -1) {
            sb.append(", res=");
            sb.append(i14);
            sb.append("x");
            sb.append(i13);
        }
        if (i12 != -1 && i11 != -1) {
            sb.append(", decRes=");
            sb.append(i12);
            sb.append("x");
            sb.append(i11);
        }
        double d4 = f5;
        int i18 = x2.c.f15984a;
        if (Math.copySign(d4 - 1.0d, 1.0d) > 0.001d && d4 != 1.0d && (!Double.isNaN(d4) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f5)};
            String str7 = W.J.f3263a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (c0089g != null) {
            int i19 = c0089g.f2790f;
            int i20 = c0089g.f2789e;
            if ((i20 != -1 && i19 != -1) || c0089g.d()) {
                sb.append(", color=");
                if (c0089g.d()) {
                    String b4 = C0089g.b(c0089g.f2785a);
                    String a3 = C0089g.a(c0089g.f2786b);
                    String c4 = C0089g.c(c0089g.f2787c);
                    Locale locale = Locale.US;
                    str2 = b4 + "/" + a3 + "/" + c4;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i20 == -1 || i19 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i20 + "/" + i19;
                }
                sb.append(str2 + "/" + str3);
            }
        }
        if (f4 != -1.0f) {
            sb.append(", fps=");
            sb.append(f4);
        }
        if (i10 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i10);
        }
        if (i9 != -1) {
            sb.append(", channels=");
            sb.append(i9);
        }
        if (i8 != -1) {
            sb.append(", sample_rate=");
            sb.append(i8);
        }
        if (str4 != null) {
            sb.append(", language=");
            sb.append(str4);
        }
        if (!i7.isEmpty()) {
            sb.append(", labels=[");
            vVar.a(sb, v2.r.u(i7, new D0.d(11)).iterator());
            sb.append("]");
        }
        if (i6 != 0) {
            sb.append(", selectionFlags=[");
            String str8 = W.J.f3263a;
            ArrayList arrayList = new ArrayList();
            if ((i6 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i6 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i6 & 2) != 0) {
                arrayList.add("forced");
            }
            vVar.a(sb, arrayList.iterator());
            sb.append("]");
        }
        if (i16 != 0) {
            sb.append(", roleFlags=[");
            String str9 = W.J.f3263a;
            ArrayList arrayList2 = new ArrayList();
            if ((i16 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i16 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i16 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i16 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i16 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i16 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i16 & 64) != 0) {
                arrayList2.add("caption");
            }
            i4 = i16;
            if ((i4 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i4 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i4 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i4 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i4 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i4 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i4 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i4 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i4 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            vVar.a(sb, arrayList2.iterator());
            sb.append("]");
        } else {
            i4 = i16;
        }
        if ((i4 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i21 = c0097o.f2862g;
            String str10 = W.J.f3263a;
            if (i21 == 0) {
                str = StringUtils.UNDEFINED;
            } else if (i21 == 1) {
                str = "original";
            } else if (i21 == 2) {
                str = "depth-linear";
            } else if (i21 == 3) {
                str = "depth-inverse";
            } else {
                if (i21 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final C0096n a() {
        C0096n c0096n = new C0096n();
        c0096n.f2819a = this.f2856a;
        c0096n.f2820b = this.f2857b;
        c0096n.f2821c = this.f2858c;
        c0096n.f2822d = this.f2859d;
        c0096n.f2823e = this.f2860e;
        c0096n.f2824f = this.f2861f;
        c0096n.f2826h = this.f2863h;
        c0096n.f2827i = this.f2864i;
        c0096n.f2828j = this.f2866k;
        c0096n.f2829k = this.f2867l;
        c0096n.f2830l = this.f2868m;
        c0096n.f2831m = this.n;
        c0096n.n = this.o;
        c0096n.o = this.f2869p;
        c0096n.f2832p = this.f2870q;
        c0096n.f2833q = this.f2871r;
        c0096n.f2834r = this.f2872s;
        c0096n.f2835s = this.f2873t;
        c0096n.f2836t = this.f2874u;
        c0096n.f2837u = this.v;
        c0096n.v = this.f2875w;
        c0096n.f2838w = this.f2876x;
        c0096n.f2839x = this.f2877y;
        c0096n.f2840y = this.z;
        c0096n.z = this.f2841A;
        c0096n.f2806A = this.f2842B;
        c0096n.f2807B = this.f2843C;
        c0096n.f2808C = this.f2844D;
        c0096n.f2809D = this.f2845E;
        c0096n.f2810E = this.f2846F;
        c0096n.f2811F = this.f2847G;
        c0096n.f2812G = this.f2848H;
        c0096n.f2813H = this.f2849I;
        c0096n.f2814I = this.f2850J;
        c0096n.f2815J = this.f2851K;
        c0096n.f2816K = this.L;
        c0096n.L = this.f2852M;
        c0096n.f2817M = this.f2853N;
        c0096n.f2818N = this.f2854O;
        return c0096n;
    }

    public final boolean b(C0097o c0097o) {
        List list = this.f2870q;
        if (list.size() != c0097o.f2870q.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals((byte[]) list.get(i4), (byte[]) c0097o.f2870q.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public final C0097o d(C0097o c0097o) {
        String str;
        String str2;
        int i4;
        int i5;
        if (this == c0097o) {
            return this;
        }
        int h2 = F.h(this.n);
        String str3 = c0097o.f2856a;
        E e4 = c0097o.f2867l;
        v2.I i6 = c0097o.f2858c;
        int i7 = c0097o.f2852M;
        int i8 = c0097o.f2853N;
        String str4 = c0097o.f2857b;
        if (str4 == null) {
            str4 = this.f2857b;
        }
        if (i6.isEmpty()) {
            i6 = this.f2858c;
        }
        if ((h2 != 3 && h2 != 1) || (str = c0097o.f2859d) == null) {
            str = this.f2859d;
        }
        int i9 = this.f2863h;
        if (i9 == -1) {
            i9 = c0097o.f2863h;
        }
        int i10 = this.f2864i;
        if (i10 == -1) {
            i10 = c0097o.f2864i;
        }
        String str5 = this.f2866k;
        if (str5 == null) {
            String v = W.J.v(h2, c0097o.f2866k);
            if (W.J.W(v).length == 1) {
                str5 = v;
            }
        }
        E e5 = this.f2867l;
        if (e5 != null) {
            e4 = e5.b(e4);
        }
        float f4 = this.f2877y;
        if (f4 == -1.0f && h2 == 2) {
            f4 = c0097o.f2877y;
        }
        int i11 = this.f2860e | c0097o.f2860e;
        int i12 = this.f2861f | c0097o.f2861f;
        C0094l c0094l = c0097o.f2871r;
        ArrayList arrayList = new ArrayList();
        v2.I i13 = i6;
        if (c0094l != null) {
            String str6 = c0094l.f2803c;
            C0093k[] c0093kArr = c0094l.f2801a;
            int length = c0093kArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i14;
                C0093k c0093k = c0093kArr[i15];
                int i16 = length;
                if (c0093k.f2800e != null) {
                    arrayList.add(c0093k);
                }
                i14 = i15 + 1;
                length = i16;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        C0094l c0094l2 = this.f2871r;
        if (c0094l2 != null) {
            if (str2 == null) {
                str2 = c0094l2.f2803c;
            }
            int size = arrayList.size();
            C0093k[] c0093kArr2 = c0094l2.f2801a;
            String str7 = str2;
            int length2 = c0093kArr2.length;
            int i17 = 0;
            while (i17 < length2) {
                int i18 = i17;
                C0093k c0093k2 = c0093kArr2[i18];
                int i19 = length2;
                if (c0093k2.f2800e != null) {
                    UUID uuid = c0093k2.f2797b;
                    i5 = i8;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            i4 = size;
                            arrayList.add(c0093k2);
                            break;
                        }
                        i4 = size;
                        if (((C0093k) arrayList.get(i20)).f2797b.equals(uuid)) {
                            break;
                        }
                        i20++;
                        size = i4;
                    }
                } else {
                    i4 = size;
                    i5 = i8;
                }
                i17 = i18 + 1;
                length2 = i19;
                i8 = i5;
                size = i4;
            }
            str2 = str7;
        }
        int i21 = i8;
        C0094l c0094l3 = arrayList.isEmpty() ? null : new C0094l(arrayList, str2);
        C0096n a3 = a();
        a3.f2819a = str3;
        a3.f2820b = str4;
        a3.f2821c = v2.I.k(i13);
        a3.f2822d = str;
        a3.f2823e = i11;
        a3.f2824f = i12;
        a3.f2826h = i9;
        a3.f2827i = i10;
        a3.f2828j = str5;
        a3.f2829k = e4;
        a3.f2833q = c0094l3;
        a3.f2839x = f4;
        a3.L = i7;
        a3.f2817M = i21;
        return new C0097o(a3);
    }

    public final boolean equals(Object obj) {
        int i4;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0097o.class != obj.getClass()) {
            return false;
        }
        C0097o c0097o = (C0097o) obj;
        int i5 = this.f2855P;
        return (i5 == 0 || (i4 = c0097o.f2855P) == 0 || i5 == i4) && this.f2860e == c0097o.f2860e && this.f2861f == c0097o.f2861f && this.f2862g == c0097o.f2862g && this.f2863h == c0097o.f2863h && this.f2864i == c0097o.f2864i && this.o == c0097o.o && this.f2872s == c0097o.f2872s && this.f2874u == c0097o.f2874u && this.v == c0097o.v && this.f2875w == c0097o.f2875w && this.f2876x == c0097o.f2876x && this.z == c0097o.z && this.f2843C == c0097o.f2843C && this.f2845E == c0097o.f2845E && this.f2846F == c0097o.f2846F && this.f2847G == c0097o.f2847G && this.f2848H == c0097o.f2848H && this.f2849I == c0097o.f2849I && this.f2850J == c0097o.f2850J && this.f2851K == c0097o.f2851K && this.f2852M == c0097o.f2852M && this.f2853N == c0097o.f2853N && this.f2854O == c0097o.f2854O && Float.compare(this.f2877y, c0097o.f2877y) == 0 && Float.compare(this.f2841A, c0097o.f2841A) == 0 && Objects.equals(this.f2856a, c0097o.f2856a) && Objects.equals(this.f2857b, c0097o.f2857b) && this.f2858c.equals(c0097o.f2858c) && Objects.equals(this.f2866k, c0097o.f2866k) && Objects.equals(this.f2868m, c0097o.f2868m) && Objects.equals(this.n, c0097o.n) && Objects.equals(this.f2859d, c0097o.f2859d) && Arrays.equals(this.f2842B, c0097o.f2842B) && Objects.equals(this.f2867l, c0097o.f2867l) && Objects.equals(this.f2844D, c0097o.f2844D) && Objects.equals(this.f2871r, c0097o.f2871r) && b(c0097o);
    }

    public final int hashCode() {
        if (this.f2855P == 0) {
            String str = this.f2856a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f2857b;
            int hashCode2 = (this.f2858c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f2859d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f2860e) * 31) + this.f2861f) * 31) + this.f2862g) * 31) + this.f2863h) * 31) + this.f2864i) * 31;
            String str4 = this.f2866k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            E e4 = this.f2867l;
            int hashCode5 = (hashCode4 + (e4 == null ? 0 : e4.hashCode())) * 961;
            String str5 = this.f2868m;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.f2855P = ((((((((((((((((((((((Float.floatToIntBits(this.f2841A) + ((((Float.floatToIntBits(this.f2877y) + ((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.f2872s)) * 31) + this.f2874u) * 31) + this.v) * 31) + this.f2875w) * 31) + this.f2876x) * 31)) * 31) + this.z) * 31)) * 31) + this.f2843C) * 31) + this.f2845E) * 31) + this.f2846F) * 31) + this.f2847G) * 31) + this.f2848H) * 31) + this.f2849I) * 31) + this.f2850J) * 31) + this.f2851K) * 31) + this.f2852M) * 31) + this.f2853N) * 31) + this.f2854O;
        }
        return this.f2855P;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f2856a);
        sb.append(", ");
        sb.append(this.f2857b);
        sb.append(", ");
        sb.append(this.f2868m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.f2866k);
        sb.append(", ");
        sb.append(this.f2865j);
        sb.append(", ");
        sb.append(this.f2859d);
        sb.append(", [");
        sb.append(this.f2874u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.f2877y);
        sb.append(", ");
        sb.append(this.f2844D);
        sb.append("], [");
        sb.append(this.f2846F);
        sb.append(", ");
        return AbstractC0005f.o(sb, this.f2847G, "])");
    }
}
