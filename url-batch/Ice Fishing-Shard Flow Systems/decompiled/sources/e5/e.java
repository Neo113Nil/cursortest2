package e5;

import c4.AbstractC0303i;
import c4.C0295a;
import c4.C0297c;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends AbstractC0303i {
    @Override // c4.AbstractC0303i
    public final Object b(B.f fVar) {
        T6.f sink;
        T6.i value = T6.i.f2618l;
        d4.d F4 = V6.b.F();
        d4.d F7 = V6.b.F();
        long e7 = fVar.e();
        String str = "";
        String str2 = "";
        while (true) {
            int f7 = ((C0295a) fVar.f152e).f();
            if (f7 == -1) {
                break;
            }
            C0297c c0297c = AbstractC0303i.f4232o;
            if (f7 == 1) {
                str = (String) c0297c.b(fVar);
            } else if (f7 == 2) {
                str2 = (String) c0297c.b(fVar);
            } else if (f7 == 3) {
                F4.add((String) c0297c.b(fVar));
            } else if (f7 != 4) {
                fVar.q(f7);
            } else {
                F7.add((String) c0297c.b(fVar));
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
        return new f(str, str2, F4, F7, value);
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c cVar, Object obj) {
        f fVar = (f) obj;
        String str = fVar.f4723i;
        String str2 = fVar.f4724l;
        boolean equals = Objects.equals(str, "");
        C0297c c0297c = AbstractC0303i.f4232o;
        if (!equals) {
            c0297c.f(cVar, 1, fVar.f4723i);
        }
        if (!Objects.equals(str2, "")) {
            c0297c.f(cVar, 2, str2);
        }
        c0297c.a().f(cVar, 3, fVar.f4725m);
        c0297c.a().f(cVar, 4, fVar.f4726n);
        cVar.F(fVar.a());
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        f fVar = (f) obj;
        String str = fVar.f4723i;
        String str2 = fVar.f4724l;
        boolean equals = Objects.equals(str, "");
        C0297c c0297c = AbstractC0303i.f4232o;
        int h7 = !equals ? c0297c.h(1, fVar.f4723i) : 0;
        if (!Objects.equals(str2, "")) {
            h7 += c0297c.h(2, str2);
        }
        return fVar.a().a() + c0297c.a().h(4, fVar.f4726n) + c0297c.a().h(3, fVar.f4725m) + h7;
    }
}
