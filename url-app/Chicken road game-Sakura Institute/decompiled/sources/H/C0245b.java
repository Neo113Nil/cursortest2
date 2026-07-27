package H;

import A.AbstractC0017m;
import G.C0192d;
import G.C0216p;
import G.N;
import G.W0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245b {

    /* renamed from: a, reason: collision with root package name */
    public final C0216p f3183a;

    /* renamed from: b, reason: collision with root package name */
    public C0244a f3184b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3185c;

    /* renamed from: f, reason: collision with root package name */
    public int f3188f;

    /* renamed from: g, reason: collision with root package name */
    public int f3189g;

    /* renamed from: l, reason: collision with root package name */
    public int f3194l;

    /* renamed from: d, reason: collision with root package name */
    public final N f3186d = new N();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3187e = true;

    /* renamed from: h, reason: collision with root package name */
    public final W0 f3190h = new W0(0);

    /* renamed from: i, reason: collision with root package name */
    public int f3191i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f3192j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f3193k = -1;

    public C0245b(C0216p c0216p, C0244a c0244a) {
        this.f3183a = c0216p;
        this.f3184b = c0244a;
    }

    public final void a() {
        c();
        W0 w02 = this.f3190h;
        if (w02.f2781d.isEmpty()) {
            this.f3189g++;
        } else {
            w02.f2781d.remove(r0.size() - 1);
        }
    }

    public final void b() {
        C0245b c0245b = this;
        int i2 = c0245b.f3189g;
        int i4 = 0;
        if (i2 > 0) {
            C0244a c0244a = c0245b.f3184b;
            c0244a.getClass();
            A a4 = A.f3170c;
            D d4 = c0244a.f3182h;
            d4.d0(a4);
            j0.c.P(d4, 0, i2);
            int i5 = d4.f3180n;
            int i6 = a4.f3172a;
            int W3 = D.W(d4, i6);
            int i7 = a4.f3173b;
            if (i5 != W3 || d4.f3181o != D.W(d4, i7)) {
                StringBuilder sb = new StringBuilder();
                int i8 = 0;
                while (i8 < i6) {
                    int i9 = i6;
                    if (((1 << i8) & d4.f3180n) != 0) {
                        if (i4 > 0) {
                            sb.append(", ");
                        }
                        sb.append(a4.b(i8));
                        i4++;
                    }
                    i8++;
                    i6 = i9;
                }
                String sb2 = sb.toString();
                StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
                int i10 = 0;
                int i11 = 0;
                while (i11 < i7) {
                    int i12 = i7;
                    if (((1 << i11) & d4.f3181o) != 0) {
                        if (i4 > 0) {
                            p4.append(", ");
                        }
                        p4.append(a4.c(i11));
                        i10++;
                    }
                    i11++;
                    i7 = i12;
                }
                String sb3 = p4.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(a4);
                sb4.append(". Not all arguments were provided. Missing ");
                AbstractC0017m.t(sb4, i4, " int arguments (", sb2, ") and ");
                AbstractC0017m.u(sb4, i10, " object arguments (", sb3, ").");
                throw null;
            }
            c0245b.f3189g = 0;
        } else {
            c0245b = this;
        }
        W0 w02 = c0245b.f3190h;
        if (w02.f2781d.isEmpty()) {
            return;
        }
        C0244a c0244a2 = c0245b.f3184b;
        ArrayList arrayList = w02.f2781d;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = arrayList.get(i13);
        }
        c0244a2.getClass();
        if (size != 0) {
            g gVar = g.f3200c;
            D d5 = c0244a2.f3182h;
            d5.d0(gVar);
            j0.c.Q(d5, 0, objArr);
            int i14 = d5.f3180n;
            int i15 = gVar.f3172a;
            int W4 = D.W(d5, i15);
            int i16 = gVar.f3173b;
            if (i14 != W4 || d5.f3181o != D.W(d5, i16)) {
                StringBuilder sb5 = new StringBuilder();
                int i17 = 0;
                for (int i18 = 0; i18 < i15; i18++) {
                    if (((1 << i18) & d5.f3180n) != 0) {
                        if (i17 > 0) {
                            sb5.append(", ");
                        }
                        sb5.append(gVar.b(i18));
                        i17++;
                    }
                }
                String sb6 = sb5.toString();
                StringBuilder p5 = AbstractC0017m.p(sb6, "StringBuilder().apply(builderAction).toString()");
                int i19 = 0;
                int i20 = 0;
                while (i19 < i16) {
                    int i21 = i16;
                    if (((1 << i19) & d5.f3181o) != 0) {
                        if (i17 > 0) {
                            p5.append(", ");
                        }
                        p5.append(gVar.c(i19));
                        i20++;
                    }
                    i19++;
                    i16 = i21;
                }
                String sb7 = p5.toString();
                Intrinsics.checkNotNullExpressionValue(sb7, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                sb8.append(gVar);
                sb8.append(". Not all arguments were provided. Missing ");
                AbstractC0017m.t(sb8, i17, " int arguments (", sb6, ") and ");
                AbstractC0017m.u(sb8, i20, " object arguments (", sb7, ").");
                throw null;
            }
        }
        arrayList.clear();
    }

    public final void c() {
        int i2 = this.f3194l;
        if (i2 > 0) {
            int i4 = this.f3191i;
            if (i4 >= 0) {
                b();
                C0244a c0244a = this.f3184b;
                c0244a.getClass();
                t tVar = t.f3217c;
                D d4 = c0244a.f3182h;
                d4.d0(tVar);
                j0.c.P(d4, 0, i4);
                j0.c.P(d4, 1, i2);
                int i5 = d4.f3180n;
                int i6 = tVar.f3172a;
                int W3 = D.W(d4, i6);
                int i7 = tVar.f3173b;
                if (i5 != W3 || d4.f3181o != D.W(d4, i7)) {
                    StringBuilder sb = new StringBuilder();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < i6) {
                        int i10 = i6;
                        if (((1 << i8) & d4.f3180n) != 0) {
                            if (i9 > 0) {
                                sb.append(", ");
                            }
                            sb.append(tVar.b(i8));
                            i9++;
                        }
                        i8++;
                        i6 = i10;
                    }
                    String sb2 = sb.toString();
                    StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < i7) {
                        int i13 = i7;
                        if (((1 << i12) & d4.f3181o) != 0) {
                            if (i9 > 0) {
                                p4.append(", ");
                            }
                            p4.append(tVar.c(i12));
                            i11++;
                        }
                        i12++;
                        i7 = i13;
                    }
                    String sb3 = p4.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(tVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    AbstractC0017m.t(sb4, i9, " int arguments (", sb2, ") and ");
                    AbstractC0017m.u(sb4, i11, " object arguments (", sb3, ").");
                    throw null;
                }
                this.f3191i = -1;
            } else {
                int i14 = this.f3193k;
                int i15 = this.f3192j;
                b();
                C0244a c0244a2 = this.f3184b;
                c0244a2.getClass();
                q qVar = q.f3214c;
                D d5 = c0244a2.f3182h;
                d5.d0(qVar);
                j0.c.P(d5, 1, i14);
                j0.c.P(d5, 0, i15);
                j0.c.P(d5, 2, i2);
                int i16 = d5.f3180n;
                int i17 = qVar.f3172a;
                int W4 = D.W(d5, i17);
                int i18 = qVar.f3173b;
                if (i16 != W4 || d5.f3181o != D.W(d5, i18)) {
                    int i19 = 0;
                    StringBuilder sb5 = new StringBuilder();
                    for (int i20 = 0; i20 < i17; i20++) {
                        if (((1 << i20) & d5.f3180n) != 0) {
                            if (i19 > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(qVar.b(i20));
                            i19++;
                        }
                    }
                    String sb6 = sb5.toString();
                    StringBuilder p5 = AbstractC0017m.p(sb6, "StringBuilder().apply(builderAction).toString()");
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i18) {
                        int i23 = i18;
                        if (((1 << i21) & d5.f3181o) != 0) {
                            if (i19 > 0) {
                                p5.append(", ");
                            }
                            p5.append(qVar.c(i21));
                            i22++;
                        }
                        i21++;
                        i18 = i23;
                    }
                    String sb7 = p5.toString();
                    Intrinsics.checkNotNullExpressionValue(sb7, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb8 = new StringBuilder("Error while pushing ");
                    sb8.append(qVar);
                    sb8.append(". Not all arguments were provided. Missing ");
                    AbstractC0017m.t(sb8, i19, " int arguments (", sb6, ") and ");
                    AbstractC0017m.u(sb8, i22, " object arguments (", sb7, ").");
                    throw null;
                }
                this.f3192j = -1;
                this.f3193k = -1;
            }
            this.f3194l = 0;
        }
    }

    public final void d(boolean z4) {
        C0216p c0216p = this.f3183a;
        int i2 = z4 ? c0216p.f2851F.f2661i : c0216p.f2851F.f2659g;
        int i4 = i2 - this.f3188f;
        if (!(i4 >= 0)) {
            C0192d.w("Tried to seek backward");
            throw null;
        }
        if (i4 > 0) {
            C0244a c0244a = this.f3184b;
            c0244a.getClass();
            C0247d c0247d = C0247d.f3197c;
            D d4 = c0244a.f3182h;
            d4.d0(c0247d);
            j0.c.P(d4, 0, i4);
            int i5 = d4.f3180n;
            int i6 = c0247d.f3172a;
            int W3 = D.W(d4, i6);
            int i7 = c0247d.f3173b;
            if (i5 == W3 && d4.f3181o == D.W(d4, i7)) {
                this.f3188f = i2;
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                if (((1 << i9) & d4.f3180n) != 0) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(c0247d.b(i9));
                    i8++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (((1 << i11) & d4.f3181o) != 0) {
                    if (i8 > 0) {
                        p4.append(", ");
                    }
                    p4.append(c0247d.c(i11));
                    i10++;
                }
            }
            String sb3 = p4.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(c0247d);
            sb4.append(". Not all arguments were provided. Missing ");
            AbstractC0017m.t(sb4, i8, " int arguments (", sb2, ") and ");
            AbstractC0017m.u(sb4, i10, " object arguments (", sb3, ").");
            throw null;
        }
    }

    public final void e(int i2, int i4) {
        if (i4 > 0) {
            if (!(i2 >= 0)) {
                C0192d.w("Invalid remove index " + i2);
                throw null;
            }
            if (this.f3191i == i2) {
                this.f3194l += i4;
                return;
            }
            c();
            this.f3191i = i2;
            this.f3194l = i4;
        }
    }
}
