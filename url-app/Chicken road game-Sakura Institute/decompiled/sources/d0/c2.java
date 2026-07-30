package d0;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c2 implements p1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q6.a f1878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q6.e f1879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1880c;

    public c2(q6.a aVar, q6.e eVar, boolean z8) {
        this.f1878a = aVar;
        this.f1879b = eVar;
        this.f1880c = z8;
    }

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        Object obj;
        p1.n0 n0Var;
        c2 c2Var = this;
        float floatValue = ((Number) c2Var.f1878a.a()).floatValue();
        long a3 = m2.a.a(j8, 0, 0, 0, 0, 10);
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            p1.e0 e0Var = (p1.e0) list.get(i7);
            if (r6.k.a(androidx.compose.ui.layout.a.a(e0Var), "icon")) {
                p1.n0 b9 = e0Var.b(a3);
                float f9 = 2;
                int K = h0Var.K(g2.f1985e * f9) + b9.f7063f;
                int O = t6.a.O(K * floatValue);
                q6.e eVar = c2Var.f1879b;
                int K2 = h0Var.K((eVar == null ? g2.f1987g : g2.f1986f) * f9) + b9.f7064g;
                int size2 = list.size();
                int i8 = 0;
                while (i8 < size2) {
                    int i9 = size2;
                    p1.e0 e0Var2 = (p1.e0) list.get(i8);
                    int i10 = i8;
                    float f10 = f9;
                    if (r6.k.a(androidx.compose.ui.layout.a.a(e0Var2), "indicatorRipple")) {
                        p1.n0 n0Var2 = null;
                        if (K < 0 || K2 < 0) {
                            a8.d.c0("width(" + K + ") and height(" + K2 + ") must be >= 0");
                            throw null;
                        }
                        p1.n0 b10 = e0Var2.b(r4.a.z(K, K, K2, K2));
                        int size3 = list.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size3) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i11);
                            int i12 = size3;
                            int i13 = i11;
                            if (r6.k.a(androidx.compose.ui.layout.a.a((p1.e0) obj), "indicator")) {
                                break;
                            }
                            i11 = i13 + 1;
                            size3 = i12;
                        }
                        p1.e0 e0Var3 = (p1.e0) obj;
                        if (e0Var3 == null) {
                            n0Var = null;
                        } else {
                            if (O < 0 || K2 < 0) {
                                a8.d.c0("width(" + O + ") and height(" + K2 + ") must be >= 0");
                                throw null;
                            }
                            n0Var = e0Var3.b(r4.a.z(O, O, K2, K2));
                        }
                        if (eVar != null) {
                            int size4 = list.size();
                            for (int i14 = 0; i14 < size4; i14++) {
                                p1.e0 e0Var4 = (p1.e0) list.get(i14);
                                if (r6.k.a(androidx.compose.ui.layout.a.a(e0Var4), "label")) {
                                    n0Var2 = e0Var4.b(a3);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        p1.n0 n0Var3 = n0Var2;
                        e6.v vVar = e6.v.f2827f;
                        if (eVar == null) {
                            int w4 = r4.a.w(j8, Math.max(b9.f7063f, Math.max(b10.f7063f, n0Var != null ? n0Var.f7063f : 0)));
                            int v5 = r4.a.v(j8, h0Var.K(g2.f1983c));
                            return h0Var.C(w4, v5, vVar, new e2(n0Var, b9, (w4 - b9.f7063f) / 2, (v5 - b9.f7064g) / 2, b10, (w4 - b10.f7063f) / 2, (v5 - b10.f7064g) / 2, w4, v5));
                        }
                        r6.k.c(n0Var3);
                        float f11 = b9.f7064g;
                        float f12 = g2.f1986f;
                        float y4 = h0Var.y(f12) + f11;
                        float f13 = g2.f1984d;
                        float y8 = h0Var.y(f13) + y4 + n0Var3.f7064g;
                        float i15 = (m2.a.i(j8) - y8) / f10;
                        float y9 = h0Var.y(f12);
                        float f14 = i15 < y9 ? y9 : i15;
                        float f15 = (f14 * f10) + y8;
                        boolean z8 = this.f1880c;
                        float f16 = (1 - floatValue) * ((z8 ? f14 : (f15 - b9.f7064g) / f10) - f14);
                        float y10 = h0Var.y(f13) + h0Var.y(f12) + b9.f7064g + f14;
                        int w5 = r4.a.w(j8, Math.max(b9.f7063f, Math.max(n0Var3.f7063f, n0Var != null ? n0Var.f7063f : 0)));
                        return h0Var.C(w5, t6.a.O(f15), vVar, new f2(n0Var, z8, floatValue, n0Var3, (w5 - n0Var3.f7063f) / 2, y10, f16, b9, (w5 - b9.f7063f) / 2, f14, b10, (w5 - b10.f7063f) / 2, f14 - h0Var.y(f12), w5, h0Var));
                    }
                    i8 = i10 + 1;
                    size2 = i9;
                    f9 = f10;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i7++;
            c2Var = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
