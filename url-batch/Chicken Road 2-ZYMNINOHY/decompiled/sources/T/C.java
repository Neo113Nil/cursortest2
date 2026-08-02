package T;

import E.AbstractC0005f;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: B, reason: collision with root package name */
    public static final C f2631B;

    /* renamed from: A, reason: collision with root package name */
    public final v2.I f2632A;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2633a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f2634b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f2635c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f2636d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f2637e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f2638f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f2639g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f2640h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f2641i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f2642j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f2643k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f2644l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f2645m;
    public final Integer n;
    public final Integer o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f2646p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f2647q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f2648r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f2649s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f2650t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f2651u;
    public final Integer v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f2652w;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f2653x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f2654y;
    public final Integer z;

    static {
        B b4 = new B();
        v2.G g4 = v2.I.f15571b;
        b4.z = v2.a0.f15605e;
        f2631B = new C(b4);
        AbstractC0005f.s(0, 1, 2, 3, 4);
        AbstractC0005f.s(5, 6, 8, 9, 10);
        AbstractC0005f.s(11, 12, 13, 14, 15);
        AbstractC0005f.s(16, 17, 18, 19, 20);
        AbstractC0005f.s(21, 22, 23, 24, 25);
        AbstractC0005f.s(26, 27, 28, 29, 30);
        AbstractC0005f.s(31, 32, 33, 34, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    public C(B b4) {
        Boolean bool = b4.f2619k;
        Integer num = b4.f2618j;
        Integer num2 = b4.f2630y;
        int i4 = 1;
        int i5 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case C0583e9.f11743C /* 19 */:
                        case Build.API_LEVELS.API_31 /* 31 */:
                        case Build.API_LEVELS.API_32 /* 32 */:
                        case Build.API_LEVELS.API_33 /* 33 */:
                        case Build.API_LEVELS.API_34 /* 34 */:
                        case 35:
                            break;
                        case C0583e9.f11744D /* 20 */:
                        case 26:
                        case 27:
                        case Build.API_LEVELS.API_28 /* 28 */:
                        case 29:
                        case Build.API_LEVELS.API_30 /* 30 */:
                        default:
                            i4 = 0;
                            break;
                        case 21:
                            i4 = 2;
                            break;
                        case Build.API_LEVELS.API_22 /* 22 */:
                            i4 = 3;
                            break;
                        case Build.API_LEVELS.API_23 /* 23 */:
                            i4 = 4;
                            break;
                        case 24:
                            i4 = 5;
                            break;
                        case 25:
                            i4 = 6;
                            break;
                    }
                    i5 = i4;
                }
                num = Integer.valueOf(i5);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i5 = 21;
                        break;
                    case 3:
                        i5 = 22;
                        break;
                    case 4:
                        i5 = 23;
                        break;
                    case 5:
                        i5 = 24;
                        break;
                    case 6:
                        i5 = 25;
                        break;
                    default:
                        i5 = 20;
                        break;
                }
                num2 = Integer.valueOf(i5);
            }
        }
        this.f2633a = b4.f2609a;
        this.f2634b = b4.f2610b;
        this.f2635c = b4.f2611c;
        this.f2636d = b4.f2612d;
        this.f2637e = b4.f2613e;
        this.f2638f = b4.f2614f;
        this.f2639g = b4.f2615g;
        this.f2640h = b4.f2616h;
        this.f2641i = b4.f2617i;
        this.f2642j = num;
        this.f2643k = bool;
        Integer num3 = b4.f2620l;
        this.f2644l = num3;
        this.f2645m = num3;
        this.n = b4.f2621m;
        this.o = b4.n;
        this.f2646p = b4.o;
        this.f2647q = b4.f2622p;
        this.f2648r = b4.f2623q;
        this.f2649s = b4.f2624r;
        this.f2650t = b4.f2625s;
        this.f2651u = b4.f2626t;
        this.v = b4.f2627u;
        this.f2652w = b4.v;
        this.f2653x = b4.f2628w;
        this.f2654y = b4.f2629x;
        this.z = num2;
        this.f2632A = b4.z;
    }

    public final B a() {
        B b4 = new B();
        b4.f2609a = this.f2633a;
        b4.f2610b = this.f2634b;
        b4.f2611c = this.f2635c;
        b4.f2612d = this.f2636d;
        b4.f2613e = this.f2637e;
        b4.f2614f = this.f2638f;
        b4.f2615g = this.f2639g;
        b4.f2616h = this.f2640h;
        b4.f2617i = this.f2641i;
        b4.f2618j = this.f2642j;
        b4.f2619k = this.f2643k;
        b4.f2620l = this.f2645m;
        b4.f2621m = this.n;
        b4.n = this.o;
        b4.o = this.f2646p;
        b4.f2622p = this.f2647q;
        b4.f2623q = this.f2648r;
        b4.f2624r = this.f2649s;
        b4.f2625s = this.f2650t;
        b4.f2626t = this.f2651u;
        b4.f2627u = this.v;
        b4.v = this.f2652w;
        b4.f2628w = this.f2653x;
        b4.f2629x = this.f2654y;
        b4.f2630y = this.z;
        b4.z = this.f2632A;
        return b4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c4 = (C) obj;
        return TextUtils.equals(this.f2633a, c4.f2633a) && TextUtils.equals(this.f2634b, c4.f2634b) && TextUtils.equals(this.f2635c, c4.f2635c) && TextUtils.equals(this.f2636d, c4.f2636d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.f2637e, c4.f2637e) && Arrays.equals(this.f2638f, c4.f2638f) && Objects.equals(this.f2639g, c4.f2639g) && Objects.equals(this.f2640h, c4.f2640h) && Objects.equals(this.f2641i, c4.f2641i) && Objects.equals(this.f2642j, c4.f2642j) && Objects.equals(this.f2643k, c4.f2643k) && Objects.equals(this.f2645m, c4.f2645m) && Objects.equals(this.n, c4.n) && Objects.equals(this.o, c4.o) && Objects.equals(this.f2646p, c4.f2646p) && Objects.equals(this.f2647q, c4.f2647q) && Objects.equals(this.f2648r, c4.f2648r) && TextUtils.equals(this.f2649s, c4.f2649s) && TextUtils.equals(this.f2650t, c4.f2650t) && TextUtils.equals(this.f2651u, c4.f2651u) && Objects.equals(this.v, c4.v) && Objects.equals(this.f2652w, c4.f2652w) && TextUtils.equals(this.f2653x, c4.f2653x) && TextUtils.equals(null, null) && TextUtils.equals(this.f2654y, c4.f2654y) && Objects.equals(this.z, c4.z) && Objects.equals(this.f2632A, c4.f2632A);
    }

    public final int hashCode() {
        return Objects.hash(this.f2633a, this.f2634b, this.f2635c, this.f2636d, null, null, this.f2637e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f2638f)), this.f2639g, null, this.f2640h, this.f2641i, this.f2642j, this.f2643k, null, this.f2645m, this.n, this.o, this.f2646p, this.f2647q, this.f2648r, this.f2649s, this.f2650t, this.f2651u, this.v, this.f2652w, this.f2653x, null, this.f2654y, this.z, true, this.f2632A);
    }
}
