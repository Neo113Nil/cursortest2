package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3181f3 {

    /* renamed from: B, reason: collision with root package name */
    public static final C3181f3 f30581B;

    /* renamed from: A, reason: collision with root package name */
    public final UB f30582A;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f30583a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f30584b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f30585c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f30586d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f30587e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f30588f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f30589g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f30590h;
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f30591j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f30592k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f30593l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f30594m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f30595n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f30596o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f30597p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f30598q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f30599r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f30600s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f30601t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f30602u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f30603v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f30604w;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f30605x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f30606y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f30607z;

    static {
        P2 p22 = new P2();
        SB sb = UB.f27942u;
        p22.f26823z = C3675oC.f33115x;
        f30581B = new C3181f3(p22);
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(1000, 36);
    }

    public C3181f3(P2 p22) {
        Boolean bool = p22.f26808k;
        Integer num = p22.f26822y;
        Integer num2 = p22.f26807j;
        int i = 1;
        int i4 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num2 = -1;
            } else if (num2 == null || num2.intValue() == -1) {
                if (num != null) {
                    switch (num.intValue()) {
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num2 = Integer.valueOf(i);
                }
                i = 0;
                num2 = Integer.valueOf(i);
            }
        } else if (num2 != null) {
            boolean z8 = num2.intValue() != -1;
            bool = Boolean.valueOf(z8);
            if (z8 && num == null) {
                switch (num2.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i4 = 21;
                        break;
                    case 3:
                        i4 = 22;
                        break;
                    case 4:
                        i4 = 23;
                        break;
                    case 5:
                        i4 = 24;
                        break;
                    case 6:
                        i4 = 25;
                        break;
                    default:
                        i4 = 20;
                        break;
                }
                num = Integer.valueOf(i4);
            }
        } else {
            num2 = null;
        }
        this.f30583a = p22.f26799a;
        this.f30584b = p22.f26800b;
        this.f30585c = p22.f26801c;
        this.f30586d = p22.f26802d;
        this.f30587e = p22.f26803e;
        this.f30588f = p22.f26804f;
        this.f30589g = p22.f26805g;
        this.f30590h = p22.f26806h;
        this.i = p22.i;
        this.f30591j = num2;
        this.f30592k = bool;
        Integer num3 = p22.f26809l;
        this.f30593l = num3;
        this.f30594m = num3;
        this.f30595n = p22.f26810m;
        this.f30596o = p22.f26811n;
        this.f30597p = p22.f26812o;
        this.f30598q = p22.f26813p;
        this.f30599r = p22.f26814q;
        this.f30600s = p22.f26815r;
        this.f30601t = p22.f26816s;
        this.f30602u = p22.f26817t;
        this.f30603v = p22.f26818u;
        this.f30604w = p22.f26819v;
        this.f30605x = p22.f26820w;
        this.f30606y = p22.f26821x;
        this.f30607z = num;
        this.f30582A = p22.f26823z;
    }

    public final P2 a() {
        P2 p22 = new P2();
        p22.f26799a = this.f30583a;
        p22.f26800b = this.f30584b;
        p22.f26801c = this.f30585c;
        p22.f26802d = this.f30586d;
        p22.f26803e = this.f30587e;
        p22.f26804f = this.f30588f;
        p22.f26805g = this.f30589g;
        p22.f26806h = this.f30590h;
        p22.i = this.i;
        p22.f26807j = this.f30591j;
        p22.f26808k = this.f30592k;
        p22.f26809l = this.f30594m;
        p22.f26810m = this.f30595n;
        p22.f26811n = this.f30596o;
        p22.f26812o = this.f30597p;
        p22.f26813p = this.f30598q;
        p22.f26814q = this.f30599r;
        p22.f26815r = this.f30600s;
        p22.f26816s = this.f30601t;
        p22.f26817t = this.f30602u;
        p22.f26818u = this.f30603v;
        p22.f26819v = this.f30604w;
        p22.f26820w = this.f30605x;
        p22.f26821x = this.f30606y;
        p22.f26822y = this.f30607z;
        p22.f26823z = this.f30582A;
        return p22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3181f3.class == obj.getClass()) {
            C3181f3 c3181f3 = (C3181f3) obj;
            if (TextUtils.equals(this.f30583a, c3181f3.f30583a) && TextUtils.equals(this.f30584b, c3181f3.f30584b) && TextUtils.equals(this.f30585c, c3181f3.f30585c) && TextUtils.equals(this.f30586d, c3181f3.f30586d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.f30587e, c3181f3.f30587e) && Arrays.equals(this.f30588f, c3181f3.f30588f) && Objects.equals(this.f30589g, c3181f3.f30589g) && Objects.equals(this.f30590h, c3181f3.f30590h) && Objects.equals(this.i, c3181f3.i) && Objects.equals(this.f30591j, c3181f3.f30591j) && Objects.equals(this.f30592k, c3181f3.f30592k) && Objects.equals(this.f30594m, c3181f3.f30594m) && Objects.equals(this.f30595n, c3181f3.f30595n) && Objects.equals(this.f30596o, c3181f3.f30596o) && Objects.equals(this.f30597p, c3181f3.f30597p) && Objects.equals(this.f30598q, c3181f3.f30598q) && Objects.equals(this.f30599r, c3181f3.f30599r) && TextUtils.equals(this.f30600s, c3181f3.f30600s) && TextUtils.equals(this.f30601t, c3181f3.f30601t) && TextUtils.equals(this.f30602u, c3181f3.f30602u) && Objects.equals(this.f30603v, c3181f3.f30603v) && Objects.equals(this.f30604w, c3181f3.f30604w) && TextUtils.equals(this.f30605x, c3181f3.f30605x) && TextUtils.equals(null, null) && TextUtils.equals(this.f30606y, c3181f3.f30606y) && Objects.equals(this.f30607z, c3181f3.f30607z) && Objects.equals(this.f30582A, c3181f3.f30582A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f30583a, this.f30584b, this.f30585c, this.f30586d, null, null, this.f30587e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f30588f)), this.f30589g, null, this.f30590h, this.i, this.f30591j, this.f30592k, null, this.f30594m, this.f30595n, this.f30596o, this.f30597p, this.f30598q, this.f30599r, this.f30600s, this.f30601t, this.f30602u, this.f30603v, this.f30604w, this.f30605x, null, this.f30606y, this.f30607z, Boolean.TRUE, this.f30582A);
    }
}
