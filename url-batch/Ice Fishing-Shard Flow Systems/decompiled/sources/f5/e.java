package f5;

import T6.i;
import c4.AbstractC0303i;
import c4.C0295a;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends AbstractC0303i {
    @Override // c4.AbstractC0303i
    public final Object b(B.f fVar) {
        i value = i.f2618l;
        d4.d F4 = V6.b.F();
        long e7 = fVar.e();
        T6.f sink = null;
        String str = "";
        e5.h hVar = null;
        while (true) {
            int f7 = ((C0295a) fVar.f152e).f();
            if (f7 == -1) {
                break;
            }
            if (f7 == 1) {
                hVar = (e5.h) e5.h.f4727o.b(fVar);
            } else if (f7 == 2) {
                F4.add((C0403b) C0403b.f4806v.b(fVar));
            } else if (f7 != 3) {
                fVar.q(f7);
            } else {
                str = (String) AbstractC0303i.f4232o.b(fVar);
            }
        }
        i value2 = fVar.i(e7);
        Intrinsics.checkNotNullParameter(value2, "unknownFields");
        if (value2.a() > 0) {
            sink = new T6.f();
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(value, "value");
            sink.F(value);
            value = i.f2618l;
            Intrinsics.checkNotNullParameter(value2, "value");
            sink.F(value2);
        }
        if (sink != null) {
            value = sink.e(sink.f2617e);
        }
        return new f(hVar, F4, str, value);
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c cVar, Object obj) {
        f fVar = (f) obj;
        e5.h hVar = fVar.f4823i;
        String str = fVar.f4825m;
        if (!Objects.equals(hVar, null)) {
            e5.h.f4727o.f(cVar, 1, fVar.f4823i);
        }
        C0403b.f4806v.a().f(cVar, 2, fVar.f4824l);
        if (!Objects.equals(str, "")) {
            AbstractC0303i.f4232o.f(cVar, 3, str);
        }
        cVar.F(fVar.a());
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        f fVar = (f) obj;
        e5.h hVar = fVar.f4823i;
        String str = fVar.f4825m;
        int h7 = C0403b.f4806v.a().h(2, fVar.f4824l) + (!Objects.equals(hVar, null) ? e5.h.f4727o.h(1, fVar.f4823i) : 0);
        if (!Objects.equals(str, "")) {
            h7 += AbstractC0303i.f4232o.h(3, str);
        }
        return fVar.a().a() + h7;
    }
}
