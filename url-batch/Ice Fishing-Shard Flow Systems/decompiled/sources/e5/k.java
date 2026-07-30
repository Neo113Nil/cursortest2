package e5;

import c4.AbstractC0303i;
import c4.C0295a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends AbstractC0303i {
    @Override // c4.AbstractC0303i
    public final Object b(B.f fVar) {
        T6.f sink;
        T6.i value = T6.i.f2618l;
        d4.d F4 = V6.b.F();
        long e7 = fVar.e();
        while (true) {
            int f7 = ((C0295a) fVar.f152e).f();
            if (f7 == -1) {
                break;
            }
            if (f7 != 1) {
                fVar.q(f7);
            } else {
                F4.add((j) j.f4732m.b(fVar));
            }
        }
        T6.i value2 = fVar.i(e7);
        Intrinsics.checkNotNullParameter(value2, "unknownFields");
        if (value2.a() > 0) {
            sink = new T6.f();
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(value, "value");
            sink.F(value);
            value = T6.i.f2618l;
            Intrinsics.checkNotNullParameter(value2, "value");
            sink.F(value2);
        } else {
            sink = null;
        }
        if (sink != null) {
            value = sink.e(sink.f2617e);
        }
        return new l(F4, value);
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c cVar, Object obj) {
        l lVar = (l) obj;
        j.f4732m.a().f(cVar, 1, lVar.f4736i);
        cVar.F(lVar.a());
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        l lVar = (l) obj;
        return lVar.a().a() + j.f4732m.a().h(1, lVar.f4736i);
    }
}
