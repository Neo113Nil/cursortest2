package f5;

import T6.i;
import c4.AbstractC0303i;
import c4.C0295a;
import g5.C0451b;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404c extends AbstractC0303i {
    @Override // c4.AbstractC0303i
    public final Object b(B.f fVar) {
        i value = i.f2618l;
        d4.d F4 = V6.b.F();
        long e7 = fVar.e();
        T6.f sink = null;
        String str = "";
        C0451b c0451b = null;
        while (true) {
            int f7 = ((C0295a) fVar.f152e).f();
            if (f7 == -1) {
                break;
            }
            if (f7 == 1) {
                c0451b = (C0451b) C0451b.f5031n.b(fVar);
            } else if (f7 == 2) {
                F4.add((f) f.f4822n.b(fVar));
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
        return new C0405d(c0451b, F4, str, value);
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c cVar, Object obj) {
        C0405d c0405d = (C0405d) obj;
        C0451b c0451b = c0405d.f4819i;
        String str = c0405d.f4821m;
        if (!Objects.equals(c0451b, null)) {
            C0451b.f5031n.f(cVar, 1, c0405d.f4819i);
        }
        f.f4822n.a().f(cVar, 2, c0405d.f4820l);
        if (!Objects.equals(str, "")) {
            AbstractC0303i.f4232o.f(cVar, 3, str);
        }
        cVar.F(c0405d.a());
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        C0405d c0405d = (C0405d) obj;
        C0451b c0451b = c0405d.f4819i;
        String str = c0405d.f4821m;
        int h7 = f.f4822n.a().h(2, c0405d.f4820l) + (!Objects.equals(c0451b, null) ? C0451b.f5031n.h(1, c0405d.f4819i) : 0);
        if (!Objects.equals(str, "")) {
            h7 += AbstractC0303i.f4232o.h(3, str);
        }
        return c0405d.a().a() + h7;
    }
}
