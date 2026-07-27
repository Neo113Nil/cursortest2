package G;

import a3.AbstractC0425c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class W implements kotlin.coroutines.g, M0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ W f2775e = new W(0);

    /* renamed from: i, reason: collision with root package name */
    public static final W f2776i = new W(1);

    /* renamed from: j, reason: collision with root package name */
    public static final W f2777j = new W(2);

    /* renamed from: k, reason: collision with root package name */
    public static final W f2778k = new W(3);

    /* renamed from: l, reason: collision with root package name */
    public static final W f2779l = new W(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2780d;

    public /* synthetic */ W(int i2) {
        this.f2780d = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(W w4) {
        Z2.S s4;
        Object obj;
        M.b bVar;
        Z2.S s5 = C0236z0.f2980v;
        do {
            s4 = C0236z0.f2980v;
            obj = (J.f) s4.getValue();
            bVar = (M.b) obj;
            L.c cVar = bVar.f3534j;
            M.a aVar = (M.a) cVar.get(w4);
            if (aVar != null) {
                int hashCode = w4 != null ? w4.hashCode() : 0;
                L.m mVar = cVar.f3460j;
                L.m v4 = mVar.v(hashCode, w4, 0);
                if (mVar != v4) {
                    cVar = v4 == null ? L.c.f3459l : new L.c(v4, cVar.f3461k - 1);
                }
                N.b bVar2 = N.b.f3612a;
                Object obj2 = aVar.f3529a;
                boolean z4 = obj2 != bVar2;
                Object obj3 = aVar.f3530b;
                if (z4) {
                    V v5 = cVar.get(obj2);
                    Intrinsics.c(v5);
                    cVar = cVar.h(obj2, new M.a(((M.a) v5).f3529a, obj3));
                }
                if (obj3 != bVar2) {
                    V v6 = cVar.get(obj3);
                    Intrinsics.c(v6);
                    cVar = cVar.h(obj3, new M.a(obj2, ((M.a) v6).f3530b));
                }
                Object obj4 = obj2 != bVar2 ? bVar.f3532e : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f3533i;
                }
                bVar = new M.b(obj4, obj2, cVar);
            }
            if (obj == bVar) {
                return;
            }
            Object obj5 = AbstractC0425c.f4947b;
            if (obj == null) {
                obj = obj5;
            }
        } while (!s4.l(obj, bVar));
    }

    @Override // G.M0
    public boolean a(Object obj, Object obj2) {
        switch (this.f2780d) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return Intrinsics.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f2780d) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}
