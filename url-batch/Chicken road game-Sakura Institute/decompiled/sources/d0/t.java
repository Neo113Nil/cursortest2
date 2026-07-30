package d0;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t implements p1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f2394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q.f f2395b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q.h f2396c;

    public t(p pVar, q.f fVar, q.h hVar) {
        this.f2394a = pVar;
        this.f2395b = fVar;
        this.f2396c = hVar;
    }

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        int h3;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            p1.e0 e0Var = (p1.e0) list.get(i7);
            if (r6.k.a(androidx.compose.ui.layout.a.a(e0Var), "navigationIcon")) {
                p1.n0 b9 = e0Var.b(m2.a.a(j8, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    p1.e0 e0Var2 = (p1.e0) list.get(i8);
                    if (r6.k.a(androidx.compose.ui.layout.a.a(e0Var2), "actionIcons")) {
                        p1.n0 b10 = e0Var2.b(m2.a.a(j8, 0, 0, 0, 0, 14));
                        if (m2.a.h(j8) == Integer.MAX_VALUE) {
                            h3 = m2.a.h(j8);
                        } else {
                            h3 = (m2.a.h(j8) - b9.f7063f) - b10.f7063f;
                            if (h3 < 0) {
                                h3 = 0;
                            }
                        }
                        int i9 = h3;
                        int size3 = list.size();
                        for (int i10 = 0; i10 < size3; i10++) {
                            p1.e0 e0Var3 = (p1.e0) list.get(i10);
                            if (r6.k.a(androidx.compose.ui.layout.a.a(e0Var3), "title")) {
                                p1.n0 b11 = e0Var3.b(m2.a.a(j8, 0, i9, 0, 0, 12));
                                p1.l lVar = p1.c.f7035b;
                                int f02 = b11.f0(lVar) != Integer.MIN_VALUE ? b11.f0(lVar) : 0;
                                getClass();
                                int g9 = m2.a.g(j8) == Integer.MAX_VALUE ? m2.a.g(j8) : m2.a.g(j8) + (Float.isNaN(0.0f) ? 0 : t6.a.O(0.0f));
                                return h0Var.C(m2.a.h(j8), g9, e6.v.f2827f, new s(b9, g9, b11, this.f2395b, j8, b10, h0Var, this.f2396c, f02));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
